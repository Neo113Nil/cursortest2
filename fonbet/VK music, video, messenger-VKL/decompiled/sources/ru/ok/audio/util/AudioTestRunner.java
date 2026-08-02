package ru.ok.audio.util;

import android.os.Process;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public class AudioTestRunner {
    private static final String TAG = "ru.ok.audio.util.AudioTestRunner";
    private final AudioUtils mixer;
    private final AudioPollThread pollThread;

    public static class AudioPollThread extends Thread {
        private final AudioUtils mixer;
        volatile boolean shouldExit;

        public AudioPollThread(AudioUtils audioUtils) {
            super("TestPollWorker");
            this.mixer = audioUtils;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                try {
                    Process.setThreadPriority(-19);
                } finally {
                    this.mixer.stop();
                }
            } catch (Exception unused) {
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1024);
            while (!this.shouldExit) {
                allocateDirect.position(0);
                if (this.mixer.readData(allocateDirect, allocateDirect.position(), allocateDirect.remaining(), 200) < 0) {
                    break;
                }
            }
        }
    }

    public AudioTestRunner(SystemAudioConfiguration systemAudioConfiguration) {
        AudioUtils audioUtils = new AudioUtils(systemAudioConfiguration);
        this.mixer = audioUtils;
        try {
            AudioPollThread audioPollThread = new AudioPollThread(audioUtils);
            this.pollThread = audioPollThread;
            audioPollThread.start();
        } catch (Exception e) {
            this.mixer.stop();
            throw e;
        }
    }

    public void finalize() throws Throwable {
        AudioPollThread audioPollThread = this.pollThread;
        if (audioPollThread != null) {
            audioPollThread.shouldExit = true;
        }
        super.finalize();
    }

    public boolean pitchShiftBenchmark() {
        return this.mixer.pitchShiftBenchmark();
    }

    public void startDelayMeasure(int i) {
        this.mixer.startDelayMeasure(i);
    }

    public void stop() {
        this.pollThread.shouldExit = true;
    }

    public int stopDelayMeasure() {
        return this.mixer.stopDelayMeasure();
    }
}
