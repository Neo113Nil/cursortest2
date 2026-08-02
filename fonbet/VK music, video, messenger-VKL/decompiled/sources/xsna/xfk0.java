package xsna;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import ru.ok.gleffects.BeatDetector;

/* compiled from: SoundFile.java */
/* loaded from: classes3.dex */
public final class xfk0 {
    public final d9 a;

    @Nullable
    public long[] b;

    /* compiled from: SoundFile.java */
    public static final class a {
        public d9 a;
        public File b;

        public final xfk0 a() throws IOException {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                throw new IllegalStateException("Invalid thread");
            }
            File file = this.b;
            if (file != null && file.exists() && this.b.isFile()) {
                return new xfk0(this);
            }
            throw new IllegalStateException("No input specified");
        }
    }

    public xfk0(a aVar) {
        this.a = aVar.a;
        MediaExtractor mediaExtractor = new MediaExtractor();
        aVar.b.getClass();
        aVar.b.length();
        RandomAccessFile randomAccessFile = new RandomAccessFile(aVar.b, "r");
        try {
            mediaExtractor.setDataSource(randomAccessFile.getFD());
            randomAccessFile.close();
            try {
                a(mediaExtractor);
            } finally {
                mediaExtractor.release();
            }
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void a(MediaExtractor mediaExtractor) throws IOException {
        String str;
        MediaCodec mediaCodec;
        MediaFormat mediaFormat;
        Throwable th;
        byte[] bArr;
        ByteBuffer[] byteBufferArr;
        String str2;
        int i;
        long j;
        boolean z;
        int i2;
        boolean z2;
        int trackCount = mediaExtractor.getTrackCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            str = "mime";
            mediaCodec = null;
            bArr = null;
            if (i4 >= trackCount) {
                mediaFormat = null;
                break;
            }
            mediaFormat = mediaExtractor.getTrackFormat(i4);
            if (mediaFormat.getString("mime").startsWith("audio/")) {
                mediaExtractor.selectTrack(i4);
                break;
            }
            i4++;
        }
        if (mediaFormat == null) {
            throw new IOException("No audio track found");
        }
        MediaFormat c = new to4().c(mediaExtractor);
        BeatDetector beatDetector = new BeatDetector(c.getInteger("sample-rate"), 1024, c.getInteger("channel-count"), c.getLong("durationUs"));
        try {
            MediaCodec createDecoderByType = MediaCodec.createDecoderByType(mediaFormat.getString("mime"));
            try {
                createDecoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
                createDecoderByType.start();
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                ByteBuffer[] inputBuffers = createDecoderByType.getInputBuffers();
                int i5 = 0;
                boolean z3 = false;
                ByteBuffer[] outputBuffers = createDecoderByType.getOutputBuffers();
                boolean z4 = true;
                while (true) {
                    boolean z5 = z4;
                    int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(100L);
                    if (!((zv6) this.a.c).e) {
                        if (z3 || dequeueInputBuffer < 0) {
                            byteBufferArr = inputBuffers;
                            str2 = str;
                            i = i5;
                            j = 100;
                            z4 = z5;
                            z = z3;
                        } else {
                            int readSampleData = mediaExtractor.readSampleData(inputBuffers[dequeueInputBuffer], i3);
                            if (z5 && mediaFormat.getString(str).equals("audio/mp4a-latm") && readSampleData == 2) {
                                mediaExtractor.advance();
                                byteBufferArr = inputBuffers;
                                str2 = str;
                                i = i5;
                                j = 100;
                                z2 = z3;
                            } else if (readSampleData < 0) {
                                i = i5;
                                byteBufferArr = inputBuffers;
                                str2 = str;
                                j = 100;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, -1L, 4);
                                z2 = true;
                            } else {
                                byteBufferArr = inputBuffers;
                                str2 = str;
                                i = i5;
                                j = 100;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, mediaExtractor.getSampleTime(), 0);
                                mediaExtractor.advance();
                                z2 = z3;
                            }
                            z4 = false;
                            z = z2;
                        }
                        int dequeueOutputBuffer = createDecoderByType.dequeueOutputBuffer(bufferInfo, j);
                        if (((zv6) this.a.c).e) {
                            break;
                        }
                        if (dequeueOutputBuffer >= 0) {
                            int i6 = bufferInfo.size;
                            if (i6 != 0) {
                                if (i < i6) {
                                    bArr = new byte[i6];
                                    i = i6;
                                }
                                outputBuffers[dequeueOutputBuffer].get(bArr, 0, i6);
                                outputBuffers[dequeueOutputBuffer].clear();
                            }
                            int i7 = i;
                            createDecoderByType.releaseOutputBuffer(dequeueOutputBuffer, false);
                            boolean z6 = (bufferInfo.flags & 4) != 0;
                            int i8 = bufferInfo.size;
                            if (i8 != 0) {
                                i2 = 0;
                                beatDetector.processDecodedSamples(bArr, 0, i8, z6);
                                if (beatDetector.isFilled()) {
                                    break;
                                }
                                i5 = i7;
                            } else {
                                i2 = 0;
                                if (z6) {
                                    break;
                                }
                                i5 = i7;
                            }
                        } else {
                            i2 = 0;
                            if (dequeueOutputBuffer == -3) {
                                i5 = i;
                                outputBuffers = createDecoderByType.getOutputBuffers();
                            } else {
                                i5 = i;
                            }
                        }
                        i3 = i2;
                        str = str2;
                        inputBuffers = byteBufferArr;
                        z3 = z;
                    } else {
                        break;
                    }
                }
                this.b = beatDetector.getBeats();
                beatDetector.release();
                try {
                    createDecoderByType.stop();
                } catch (Exception e) {
                    Log.e("SoundFile", "Failed to stop media codec", e);
                }
                try {
                    createDecoderByType.release();
                } catch (Exception e2) {
                    Log.e("SoundFile", "Failed to release media codec", e2);
                }
            } catch (Throwable th2) {
                th = th2;
                mediaCodec = createDecoderByType;
                beatDetector.release();
                if (mediaCodec == null) {
                    throw th;
                }
                try {
                    mediaCodec.stop();
                } catch (Exception e3) {
                    Log.e("SoundFile", "Failed to stop media codec", e3);
                }
                try {
                    mediaCodec.release();
                    throw th;
                } catch (Exception e4) {
                    Log.e("SoundFile", "Failed to release media codec", e4);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
