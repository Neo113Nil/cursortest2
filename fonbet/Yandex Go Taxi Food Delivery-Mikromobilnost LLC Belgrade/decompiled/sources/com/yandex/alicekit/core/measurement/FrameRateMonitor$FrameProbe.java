package com.yandex.alicekit.core.measurement;

import android.view.Choreographer;

/* loaded from: classes7.dex */
class FrameRateMonitor$FrameProbe implements Choreographer.FrameCallback {
    private static final int MAXIMUM_FRAME_COUNT = 3600;
    private static final long UNDEFINED_FRAME_TIME_NANOS = -1;
    int frameCount;
    final long[] frameDurationsNs;
    private final Choreographer mChoreographer;
    private long mLastFrameTimeNs;

    private FrameRateMonitor$FrameProbe() {
        this.frameDurationsNs = new long[MAXIMUM_FRAME_COUNT];
        this.mChoreographer = Choreographer.getInstance();
    }

    private void reset() {
        for (int i = 0; i < MAXIMUM_FRAME_COUNT; i++) {
            this.frameDurationsNs[i] = 0;
        }
        this.frameCount = 0;
        this.mLastFrameTimeNs = -1L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        long j2 = this.mLastFrameTimeNs;
        if (j2 != -1) {
            long[] jArr = this.frameDurationsNs;
            int i = this.frameCount;
            jArr[i] = j - j2;
            this.frameCount = i + 1;
        }
        this.mLastFrameTimeNs = j;
        if (this.frameCount < MAXIMUM_FRAME_COUNT) {
            this.mChoreographer.postFrameCallback(this);
        }
    }

    public void end() {
        this.mChoreographer.removeFrameCallback(this);
    }

    public void start() {
        reset();
        this.mChoreographer.removeFrameCallback(this);
        this.mChoreographer.postFrameCallback(this);
    }
}
