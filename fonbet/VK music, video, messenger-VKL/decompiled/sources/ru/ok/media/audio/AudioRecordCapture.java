package ru.ok.media.audio;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.NoiseSuppressor;
import android.os.Process;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import ru.ok.media.logging.Logger;
import xsna.lhg;
import xsna.ne7;

@Keep
/* loaded from: classes9.dex */
public class AudioRecordCapture {
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static String TAG = "Publisher";
    private AcousticEchoCanceler acousticEchoCanceler;
    private final AudioManager audioManager;
    private final int audioSource;
    private int bufferSizeInBytes;

    @Nullable
    private ByteBuffer byteBuffer;
    private int byteBufferSize;
    private int channelConfig;
    private final Context context;
    private byte[] emptyBytes;
    private volatile long nativeAudioRecord;
    private NoiseSuppressor noiseSuppressor;
    private int sampleRate;

    @Nullable
    private AudioRecord audioRecord = null;

    @Nullable
    private AudioRecordThread audioThread = null;

    public class AudioRecordThread extends Thread {
        private volatile boolean keepAlive;

        public AudioRecordThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        private void createAudioRecord() {
            ne7.m(AudioRecordCapture.TAG, "AudioRecordThread.createAudioRecord()");
            if (AudioRecordCapture.this.audioRecord == null && AudioRecordCapture.this.audioManager.getMode() == 3) {
                try {
                    AudioRecordCapture.this.audioRecord = new AudioRecord(7, AudioRecordCapture.this.sampleRate, AudioRecordCapture.this.channelConfig, 2, AudioRecordCapture.this.bufferSizeInBytes);
                    if (AcousticEchoCanceler.isAvailable()) {
                        AudioRecordCapture audioRecordCapture = AudioRecordCapture.this;
                        audioRecordCapture.acousticEchoCanceler = AcousticEchoCanceler.create(audioRecordCapture.audioRecord.getAudioSessionId());
                        AudioRecordCapture.this.acousticEchoCanceler.setEnabled(true);
                    }
                    Logger.w("effects: " + AudioRecordCapture.this.acousticEchoCanceler + ", " + AudioRecordCapture.this.noiseSuppressor);
                    ne7.m(AudioRecordCapture.TAG, "AudioRecordThread.createAudioRecord() - created, aec= " + AudioRecordCapture.this.acousticEchoCanceler + " noiseSuppressor= " + AudioRecordCapture.this.noiseSuppressor);
                    if (AudioRecordCapture.this.audioRecord.getState() != 1) {
                        ne7.n(AudioRecordCapture.TAG, "AudioRecordThread.createAudioRecord() - audioRecord creation failed");
                        Logger.e("audioRecord creation failed");
                        this.keepAlive = false;
                        return;
                    }
                    try {
                        AudioRecordCapture.this.audioRecord.startRecording();
                        if (AudioRecordCapture.this.audioRecord.getRecordingState() != 3) {
                            ne7.n(AudioRecordCapture.TAG, "AudioRecordThread.createAudioRecord() - failed to start recording");
                            Logger.e("failed to start recording");
                            this.keepAlive = false;
                            return;
                        }
                    } catch (IllegalStateException e) {
                        ne7.n(AudioRecordCapture.TAG, "AudioRecordThread.createAudioRecord() - startRecording() failed: " + e.getMessage());
                        Logger.e(e);
                        this.keepAlive = false;
                        return;
                    }
                } catch (IllegalArgumentException e2) {
                    ne7.n(AudioRecordCapture.TAG, "AudioRecordThread.createAudioRecord() - failed: " + e2.getMessage());
                    Logger.e(e2);
                    this.keepAlive = false;
                    return;
                }
            }
            ne7.m(AudioRecordCapture.TAG, "AudioRecordThread.createAudioRecord() - done");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ne7.m(AudioRecordCapture.TAG, "AudioRecordThread.run()");
            Process.setThreadPriority(-19);
            while (this.keepAlive) {
                if (AudioRecordCapture.this.audioRecord == null) {
                    if (AudioRecordCapture.this.audioManager.getMode() != 3) {
                        ne7.m(AudioRecordCapture.TAG, "AudioRecordThread.run() - calling setMode() ...");
                        AudioRecordCapture.this.audioManager.setMode(3);
                        ne7.m(AudioRecordCapture.TAG, "AudioRecordThread.run() - done setMode()");
                    }
                    createAudioRecord();
                } else {
                    ne7.m(AudioRecordCapture.TAG, "AudioRecordThread.run() - calling audioRecord.read() ...");
                    int read = AudioRecordCapture.this.audioRecord.read(AudioRecordCapture.this.byteBuffer, AudioRecordCapture.this.byteBuffer.capacity());
                    ne7.m(AudioRecordCapture.TAG, "AudioRecordThread.run() - bytesRead= " + read);
                    if (read != AudioRecordCapture.this.byteBuffer.capacity()) {
                        String a = lhg.a(read, "AudioRecord.read failed: ");
                        ne7.m(AudioRecordCapture.TAG, "AudioRecordThread.run() - " + a);
                        Logger.e(a);
                        if (read == -3) {
                            ne7.m(AudioRecordCapture.TAG, "AudioRecordThread.run() - set keepAlive=false");
                            this.keepAlive = false;
                        }
                    } else if (this.keepAlive) {
                        ne7.m(AudioRecordCapture.TAG, "AudioRecordThread.run() - calling nativeDataIsRecorded() ...");
                        AudioRecordCapture audioRecordCapture = AudioRecordCapture.this;
                        audioRecordCapture.nativeDataIsRecorded(audioRecordCapture.nativeAudioRecord, read);
                        ne7.m(AudioRecordCapture.TAG, "AudioRecordThread.run() - done nativeDataIsRecorded()");
                    }
                }
            }
            try {
                if (AudioRecordCapture.this.audioRecord == null) {
                    ne7.m(AudioRecordCapture.TAG, "AudioRecordThread.run() - audioRecord == null");
                    return;
                }
                ne7.m(AudioRecordCapture.TAG, "AudioRecordThread.run() - calling audioRecord.stop() ...");
                AudioRecordCapture.this.audioRecord.stop();
                ne7.m(AudioRecordCapture.TAG, "AudioRecordThread.run() - done audioRecord.stop()");
            } catch (IllegalStateException e) {
                Logger.e("AudioRecord.stop failed: " + e.getMessage());
                ne7.m(AudioRecordCapture.TAG, "AudioRecordThread.run() - stop failed: " + e.getMessage());
            }
        }

        public void stopThread() {
            Logger.e("stopThread");
            this.keepAlive = false;
        }
    }

    public AudioRecordCapture(Context context, AudioManager audioManager, int i) {
        this.context = context;
        this.audioManager = audioManager;
        this.audioSource = i;
    }

    @Keep
    private int initRecording(int i, int i2) {
        ne7.m(TAG, "AudioRecordCapture.initRecording() - sampleRate= " + i + " channels= " + i2);
        this.sampleRate = i;
        if (this.audioRecord != null) {
            throw new AssertionError("audioRecord != null");
        }
        int i3 = i / 100;
        int i4 = i2 * 2 * i3;
        this.byteBufferSize = i4;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i4);
        this.byteBuffer = allocateDirect;
        this.emptyBytes = new byte[allocateDirect.capacity()];
        nativeCacheDirectBufferAddress(this.nativeAudioRecord, this.byteBuffer, this.byteBufferSize);
        int i5 = i2 == 1 ? 16 : 12;
        this.channelConfig = i5;
        int minBufferSize = AudioRecord.getMinBufferSize(i, i5, 2);
        if (minBufferSize == -1 || minBufferSize == -2) {
            throw new AssertionError(lhg.a(minBufferSize, "minBufferSize is weird: "));
        }
        this.bufferSizeInBytes = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
        ne7.m(TAG, "AudioRecordCapture.initRecording() - done, byteBufferSize= " + this.byteBufferSize + " bufferSizeInBytes= " + this.bufferSizeInBytes);
        return i3;
    }

    private native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeDataIsRecorded(long j, int i);

    private void releaseAudioResources() {
        ne7.m(TAG, "AudioRecordCapture.releaseAudioResources()");
        AcousticEchoCanceler acousticEchoCanceler = this.acousticEchoCanceler;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.acousticEchoCanceler = null;
        }
        NoiseSuppressor noiseSuppressor = this.noiseSuppressor;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.noiseSuppressor = null;
        }
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.release();
            this.audioRecord = null;
        }
        ne7.m(TAG, "AudioRecordCapture.releaseAudioResources() - done");
    }

    @Keep
    public void setNativeAudioRecord(long j) {
        this.nativeAudioRecord = j;
    }

    @Keep
    public boolean startRecording() {
        ne7.m(TAG, "AudioRecordCapture.startRecording()");
        AudioRecordThread audioRecordThread = new AudioRecordThread("AudioRecordJavaThread");
        this.audioThread = audioRecordThread;
        audioRecordThread.start();
        ne7.m(TAG, "AudioRecordCapture.startRecording() - done");
        return true;
    }

    @Keep
    public boolean stopRecording() {
        ne7.m(TAG, "AudioRecordCapture.stopRecording()");
        this.audioThread.stopThread();
        try {
            this.audioThread.join(500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (this.audioThread.isAlive()) {
            Logger.w("AudioRecord thread did not join in time");
        }
        this.audioThread = null;
        releaseAudioResources();
        ne7.m(TAG, "AudioRecordCapture.stopRecording() - done");
        return true;
    }
}
