package ru.ok.gl.effects.media.controller.audio;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes9.dex */
public class AudioMuxingSupplier {
    private static final int CHUNK_MS = 35;
    public static final long SAMPLE_DURATION_MCS = 23220;
    public static final int SIZE = 4096;
    private static final String TAG = "AudioMuxingSupplier";
    private static final long TIMEOUT_USEC = 10000;
    private volatile AudioMuxingData amd;
    private MediaCodec audioDecoder;
    private boolean audioDecoderDone;
    private long audioDuration;
    private volatile MediaExtractor audioExtractor;
    private long audioPlayDuration;
    private int blocks;
    private volatile boolean isInitialized;
    private long nanoTime;
    private volatile boolean preFetched;
    private volatile long startTime;
    private boolean stopRequested;
    private MediaCodec.BufferInfo audioDecoderOutputBufferInfo = new MediaCodec.BufferInfo();
    private boolean receivedSample = false;
    private volatile boolean isRunning = false;
    private volatile boolean isStabilized = false;
    private volatile boolean checkSync = false;
    private volatile boolean isPaused = false;
    private int pendingAudioDecoderOutputBufferIndex = -1;
    private byte[] rawSound = new byte[4096];
    private int position = 4096;
    private byte[] rawSoundAdapted = new byte[4096];
    private ReentrantLock reentrantLock = new ReentrantLock();
    private ByteBuffer[] audioDecoderInputBuffers = null;
    private ByteBuffer[] audioDecoderOutputBuffers = null;
    private boolean isFinished = false;
    private volatile boolean isSilenced = false;
    private boolean stopCatcher = false;

    public AudioMuxingSupplier(@NonNull AudioMuxingData audioMuxingData, String str, boolean z) {
        this.isInitialized = false;
        this.preFetched = false;
        try {
            this.audioExtractor = createExtractor(str);
            MediaFormat createAudioFormat = createAudioFormat(this.audioExtractor);
            this.audioDecoder = createAudioDecoder(createAudioFormat);
            long j = createAudioFormat.getLong("durationUs");
            this.audioDuration = j;
            this.amd = audioMuxingData.compress(j);
            if (this.amd == null) {
                throw new IOException("Wrong timeline parameters");
            }
            this.audioPlayDuration = (this.amd.audioEndMcs - this.amd.audioStartMcs) * 1000;
            if (z) {
                extractFirstAudioFrame();
            }
            this.preFetched = z;
            this.isInitialized = true;
        } catch (IOException e) {
            Log.e(TAG, "Unable to create audiomuxingsupplier due to ioe: " + e.getMessage());
        }
    }

    private MediaCodec createAudioDecoder(MediaFormat mediaFormat) throws IOException {
        MediaCodec createDecoderByType = MediaCodec.createDecoderByType(getMimeTypeFor(mediaFormat));
        createDecoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
        createDecoderByType.start();
        return createDecoderByType;
    }

    private MediaFormat createAudioFormat(MediaExtractor mediaExtractor) {
        MediaFormat trackFormat = mediaExtractor.getTrackFormat(getAndSelectAudioTrackIndex(mediaExtractor));
        if (trackFormat.getInteger("channel-count") == 2 && trackFormat.getInteger("sample-rate") == 44100) {
            return trackFormat;
        }
        throw new IllegalArgumentException("Invalid audio parameters, expected: channel count: 2, sample rate hz: 44100, found: " + trackFormat.getInteger("channel-count") + ", " + trackFormat.getInteger("sample-rate") + " respectively");
    }

    private MediaExtractor createExtractor(String str) throws IOException {
        MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(str);
        return mediaExtractor;
    }

    private void extractFirstAudioFrame() {
        int dequeueOutputBuffer;
        int dequeueInputBuffer;
        this.audioExtractor.seekTo(this.amd.audioStartMcs * 1000, 1);
        while (true) {
            int i = 0;
            if (!this.receivedSample) {
                if (this.pendingAudioDecoderOutputBufferIndex == -1 && (dequeueInputBuffer = this.audioDecoder.dequeueInputBuffer(10000L)) != -1) {
                    int readSampleData = this.audioExtractor.readSampleData(this.audioDecoder.getInputBuffer(dequeueInputBuffer), 0);
                    if (readSampleData >= 0) {
                        this.audioDecoder.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.audioExtractor.getSampleTime(), this.audioExtractor.getSampleFlags());
                    }
                    if (!this.audioExtractor.advance()) {
                        return;
                    }
                }
                if (!this.audioDecoderDone && this.pendingAudioDecoderOutputBufferIndex == -1 && (dequeueOutputBuffer = this.audioDecoder.dequeueOutputBuffer(this.audioDecoderOutputBufferInfo, 10000L)) != -1) {
                    if (dequeueOutputBuffer == -3) {
                        this.audioDecoderOutputBuffers = this.audioDecoder.getOutputBuffers();
                    } else if (dequeueOutputBuffer != -2) {
                        if ((this.audioDecoderOutputBufferInfo.flags & 2) != 0) {
                            this.audioDecoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                        } else {
                            this.pendingAudioDecoderOutputBufferIndex = dequeueOutputBuffer;
                        }
                    }
                }
                int i2 = this.pendingAudioDecoderOutputBufferIndex;
                if (i2 != -1) {
                    if (this.audioDecoderOutputBufferInfo.size >= 0) {
                        ByteBuffer duplicate = this.audioDecoder.getOutputBuffer(i2).duplicate();
                        duplicate.position(this.audioDecoderOutputBufferInfo.offset);
                        MediaCodec.BufferInfo bufferInfo = this.audioDecoderOutputBufferInfo;
                        duplicate.limit(bufferInfo.offset + bufferInfo.size);
                        duplicate.get(this.rawSound, 0, this.audioDecoderOutputBufferInfo.size);
                        int i3 = this.audioDecoderOutputBufferInfo.size;
                        while (true) {
                            byte[] bArr = this.rawSound;
                            if (i3 >= bArr.length) {
                                break;
                            }
                            bArr[i3] = 0;
                            i3++;
                        }
                        this.receivedSample = true;
                    }
                    this.audioDecoder.releaseOutputBuffer(this.pendingAudioDecoderOutputBufferIndex, false);
                    this.pendingAudioDecoderOutputBufferIndex = -1;
                    if ((this.audioDecoderOutputBufferInfo.flags & 4) != 0) {
                        this.audioDecoderDone = true;
                    }
                }
            } else {
                if (!this.amd.isCompoundVolume()) {
                    return;
                }
                float currentVolume = this.amd.getCurrentVolume();
                if (this.preFetched) {
                    currentVolume /= 2.0f;
                }
                while (true) {
                    byte[] bArr2 = this.rawSound;
                    if (i >= bArr2.length - 1) {
                        return;
                    }
                    short s = (short) (((short) ((bArr2[r4] << 8) | (bArr2[i] & 255))) * currentVolume);
                    bArr2[i] = (byte) s;
                    bArr2[i + 1] = (byte) ((s & 65280) >> 8);
                    i += 2;
                }
            }
        }
    }

    private int getAndSelectAudioTrackIndex(MediaExtractor mediaExtractor) {
        for (int i = 0; i < mediaExtractor.getTrackCount(); i++) {
            if (isAudioFormat(mediaExtractor.getTrackFormat(i))) {
                mediaExtractor.selectTrack(i);
                return i;
            }
        }
        return -1;
    }

    private static String getMimeTypeFor(MediaFormat mediaFormat) {
        return mediaFormat.getString("mime");
    }

    private static boolean isAudioFormat(MediaFormat mediaFormat) {
        return getMimeTypeFor(mediaFormat).startsWith("audio/");
    }

    public AudioMuxingData getAmd() {
        return this.amd;
    }

    public long getCurrentExtractorTimestampUs() {
        return this.audioExtractor.getSampleTime();
    }

    public byte[] getRawAudioData(int i) {
        if (this.position == 4096 && i == 4096) {
            return getRawAudioData();
        }
        int i2 = 0;
        while (i > 0) {
            int i3 = this.position;
            if (4096 - i3 >= i) {
                System.arraycopy(this.rawSound, i3, this.rawSoundAdapted, i2, i);
                this.position += i;
            } else {
                System.arraycopy(this.rawSound, i3, this.rawSoundAdapted, i2, 4096 - i3);
                int i4 = this.position;
                i -= 4096 - i4;
                i2 += 4096 - i4;
                if (getRawAudioData() != null) {
                    this.position = 0;
                } else {
                    if (this.stopCatcher) {
                        this.position = 4096;
                        return null;
                    }
                    this.position = 4096;
                    byte[] bArr = this.rawSoundAdapted;
                    Arrays.fill(bArr, i2, bArr.length, (byte) 0);
                }
            }
            i = 0;
        }
        return this.rawSoundAdapted;
    }

    public boolean isInitialized() {
        return this.isInitialized;
    }

    public boolean isPaused() {
        return this.isPaused;
    }

    public boolean isPreFetched() {
        return this.preFetched;
    }

    public boolean isRunning() {
        return this.isRunning && this.isInitialized;
    }

    public boolean isSilenced() {
        return this.isSilenced;
    }

    public void lock(boolean z) {
        if (z) {
            this.reentrantLock.lock();
        } else {
            this.reentrantLock.unlock();
        }
    }

    public void release() {
        this.isRunning = false;
        if (this.isInitialized) {
            this.isInitialized = false;
            try {
                if (this.audioExtractor != null) {
                    this.audioExtractor.release();
                    this.audioExtractor = null;
                }
            } catch (Exception e) {
                Log.e(TAG, "error while releasing audioExtractor", e);
            }
            try {
                MediaCodec mediaCodec = this.audioDecoder;
                if (mediaCodec != null) {
                    mediaCodec.stop();
                    this.audioDecoder.release();
                    this.audioDecoder = null;
                }
            } catch (Exception e2) {
                Log.e(TAG, "error while releasing audioDecoder", e2);
            }
            this.amd = null;
            this.audioDecoderOutputBufferInfo = null;
        }
    }

    public void seekTo(long j) {
        seekTo(j, true);
    }

    public void setAmd(AudioMuxingData audioMuxingData) {
        this.amd = audioMuxingData.compress(this.audioDuration);
    }

    public void setPaused() {
        this.isPaused = true;
    }

    public void setSilenced(boolean z) {
        this.isSilenced = z;
    }

    public void start() {
        this.pendingAudioDecoderOutputBufferIndex = -1;
        this.startTime = System.nanoTime();
        this.stopRequested = false;
        this.isFinished = false;
        this.isStabilized = false;
        this.checkSync = true;
        this.isRunning = true;
        this.isPaused = false;
    }

    public void stop() {
        if (this.blocks != 0) {
            this.stopRequested = true;
        } else if (this.stopCatcher) {
            this.stopCatcher = false;
        } else {
            this.isRunning = false;
        }
    }

    public void tie() {
        if (this.preFetched) {
            this.blocks++;
        }
    }

    public void untie() {
        if (this.preFetched) {
            int i = this.blocks - 1;
            this.blocks = i;
            if (i == 0 && this.stopRequested) {
                stop();
            }
        }
    }

    public void seekTo(long j, boolean z) {
        this.amd.audioStartMcs = j;
        this.receivedSample = false;
        this.audioDecoder.flush();
        this.pendingAudioDecoderOutputBufferIndex = -1;
        if (z) {
            extractFirstAudioFrame();
        }
        this.preFetched = z;
        this.isStabilized = false;
        this.isFinished = false;
    }

    private byte[] getRawAudioData() {
        int dequeueOutputBuffer;
        int dequeueInputBuffer;
        this.nanoTime = System.nanoTime();
        int i = 0;
        if (this.preFetched && this.checkSync) {
            if ((this.nanoTime - this.startTime) / 1000000 <= 35) {
                this.stopCatcher = true;
                return null;
            }
            this.checkSync = false;
        }
        if (!this.isStabilized) {
            this.isStabilized = true;
            if (!this.preFetched) {
                this.isFinished = false;
                this.audioExtractor.seekTo(this.amd.audioStartMcs * 1000, 2);
                this.audioDecoder.flush();
                this.startTime = this.nanoTime;
            } else {
                this.startTime = this.nanoTime;
                return this.rawSound;
            }
        } else if (this.nanoTime - this.startTime >= this.audioPlayDuration) {
            if (this.amd.cyclic) {
                this.audioExtractor.seekTo(this.amd.audioStartMcs * 1000, 2);
                this.audioDecoder.flush();
                this.startTime = this.nanoTime;
            } else if (this.isFinished) {
                return null;
            }
        }
        this.receivedSample = false;
        while (!this.receivedSample) {
            if (this.pendingAudioDecoderOutputBufferIndex == -1 && (dequeueInputBuffer = this.audioDecoder.dequeueInputBuffer(10000L)) != -1) {
                int readSampleData = this.audioExtractor.readSampleData(this.audioDecoder.getInputBuffer(dequeueInputBuffer), 0);
                if (readSampleData >= 0) {
                    this.audioDecoder.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.audioExtractor.getSampleTime(), this.audioExtractor.getSampleFlags());
                }
                if (!this.audioExtractor.advance()) {
                    if (this.amd.cyclic) {
                        this.audioExtractor.seekTo(this.amd.audioStartMcs * 1000, 0);
                    } else {
                        this.isFinished = true;
                        return null;
                    }
                }
            }
            if (!this.audioDecoderDone && this.pendingAudioDecoderOutputBufferIndex == -1 && (dequeueOutputBuffer = this.audioDecoder.dequeueOutputBuffer(this.audioDecoderOutputBufferInfo, 10000L)) != -1) {
                if (dequeueOutputBuffer == -3) {
                    this.audioDecoderOutputBuffers = this.audioDecoder.getOutputBuffers();
                } else if (dequeueOutputBuffer != -2) {
                    if ((this.audioDecoderOutputBufferInfo.flags & 2) != 0) {
                        this.audioDecoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                    } else {
                        this.pendingAudioDecoderOutputBufferIndex = dequeueOutputBuffer;
                    }
                }
            }
            int i2 = this.pendingAudioDecoderOutputBufferIndex;
            if (i2 != -1) {
                if (this.audioDecoderOutputBufferInfo.size >= 0) {
                    ByteBuffer duplicate = this.audioDecoder.getOutputBuffer(i2).duplicate();
                    duplicate.position(this.audioDecoderOutputBufferInfo.offset);
                    MediaCodec.BufferInfo bufferInfo = this.audioDecoderOutputBufferInfo;
                    duplicate.limit(bufferInfo.offset + bufferInfo.size);
                    duplicate.get(this.rawSound, 0, this.audioDecoderOutputBufferInfo.size);
                    int i3 = this.audioDecoderOutputBufferInfo.size;
                    while (true) {
                        byte[] bArr = this.rawSound;
                        if (i3 >= bArr.length) {
                            break;
                        }
                        bArr[i3] = 0;
                        i3++;
                    }
                    this.receivedSample = true;
                }
                this.audioDecoder.releaseOutputBuffer(this.pendingAudioDecoderOutputBufferIndex, false);
                this.pendingAudioDecoderOutputBufferIndex = -1;
                if ((this.audioDecoderOutputBufferInfo.flags & 4) != 0) {
                    this.audioDecoderDone = true;
                }
            }
        }
        if (this.amd.isCompoundVolume()) {
            float currentVolume = this.amd.getCurrentVolume();
            while (true) {
                byte[] bArr2 = this.rawSound;
                if (i >= bArr2.length - 1) {
                    break;
                }
                short s = (short) (((short) ((bArr2[r5] << 8) | (bArr2[i] & 255))) * currentVolume);
                bArr2[i] = (byte) s;
                bArr2[i + 1] = (byte) ((s & 65280) >> 8);
                i += 2;
            }
        }
        return this.rawSound;
    }
}
