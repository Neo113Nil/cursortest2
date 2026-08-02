package androidx.media3.exoplayer.video;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import defpackage.lk91;
import defpackage.tw21;

/* loaded from: classes10.dex */
final class VideoFrameReleaseHelper$VSyncSampler implements Choreographer.FrameCallback, Handler.Callback {
    private static final int CREATE_CHOREOGRAPHER = 1;
    private static final VideoFrameReleaseHelper$VSyncSampler INSTANCE = new VideoFrameReleaseHelper$VSyncSampler();
    private static final int MSG_ADD_OBSERVER = 2;
    private static final int MSG_REMOVE_OBSERVER = 3;
    private Choreographer choreographer;
    private final HandlerThread choreographerOwnerThread;
    private final Handler handler;
    private int observerCount;
    public volatile long sampledVsyncTimeNs = -9223372036854775807L;

    private VideoFrameReleaseHelper$VSyncSampler() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.choreographerOwnerThread = handlerThread;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i = tw21.a;
        Handler handler = new Handler(looper, this);
        this.handler = handler;
        handler.sendEmptyMessage(1);
    }

    private void addObserverInternal() {
        Choreographer choreographer = this.choreographer;
        if (choreographer != null) {
            int i = this.observerCount + 1;
            this.observerCount = i;
            if (i == 1) {
                choreographer.postFrameCallback(this);
            }
        }
    }

    private void createChoreographerInstanceInternal() {
        try {
            this.choreographer = Choreographer.getInstance();
        } catch (RuntimeException e) {
            lk91.k("Vsync sampling disabled due to platform error", e);
        }
    }

    public static VideoFrameReleaseHelper$VSyncSampler getInstance() {
        return INSTANCE;
    }

    private void removeObserverInternal() {
        Choreographer choreographer = this.choreographer;
        if (choreographer != null) {
            int i = this.observerCount - 1;
            this.observerCount = i;
            if (i == 0) {
                choreographer.removeFrameCallback(this);
                this.sampledVsyncTimeNs = -9223372036854775807L;
            }
        }
    }

    public void addObserver() {
        this.handler.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        this.sampledVsyncTimeNs = j;
        Choreographer choreographer = this.choreographer;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            createChoreographerInstanceInternal();
            return true;
        }
        if (i == 2) {
            addObserverInternal();
            return true;
        }
        if (i != 3) {
            return false;
        }
        removeObserverInternal();
        return true;
    }

    public void removeObserver() {
        this.handler.sendEmptyMessage(3);
    }
}
