package ru.ok.gl.effects.media.controller.video;

import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.gl.effects.media.controller.video.MoviePlayer;

/* loaded from: classes9.dex */
public class SpeedControlCallback implements MoviePlayer.FrameCallback {
    private static final boolean CHECK_SLEEP_TIME = false;
    private static final long ONE_MILLION = 1000000;
    private static final String TAG = "SpeedControlPlayback";
    private volatile long lastFrameUsec;
    private long mFixedFrameDurationUsec;
    private boolean mLoopReset;
    private volatile long mPauseDelayStartUsec;
    private volatile long mPauseDelayUsec;
    private long mPrevMonoUsec;
    private long mPrevPresentUsec;
    private volatile long speedInv1000 = 1000;
    private volatile long speed1000 = 1000;
    private AtomicBoolean newFrame = new AtomicBoolean(false);

    public boolean getAndSetNewFrame() {
        return this.newFrame.getAndSet(false);
    }

    public long getCurrentTimestamp() {
        return this.lastFrameUsec;
    }

    @Override // ru.ok.gl.effects.media.controller.video.MoviePlayer.FrameCallback
    public void loopReset() {
        this.mLoopReset = true;
    }

    @Override // ru.ok.gl.effects.media.controller.video.MoviePlayer.FrameCallback
    public void paures(boolean z) {
        if (z) {
            this.mPauseDelayStartUsec = System.nanoTime() / 1000;
        } else if (this.mPauseDelayStartUsec != 0) {
            this.mPauseDelayUsec = ((System.nanoTime() / 1000) - this.mPauseDelayStartUsec) + this.mPauseDelayUsec;
        }
    }

    @Override // ru.ok.gl.effects.media.controller.video.MoviePlayer.FrameCallback
    public void postRender() {
        this.newFrame.set(true);
    }

    @Override // ru.ok.gl.effects.media.controller.video.MoviePlayer.FrameCallback
    public void preRender(long j) {
        long j2;
        this.lastFrameUsec = j;
        if (this.mPrevMonoUsec == 0) {
            this.mPrevMonoUsec = System.nanoTime() / 1000;
            this.mPrevPresentUsec = j;
            return;
        }
        if (this.mLoopReset) {
            this.mPrevPresentUsec = j - 33333;
            this.mLoopReset = false;
        }
        long j3 = this.mFixedFrameDurationUsec;
        if (j3 != 0) {
            j2 = j3;
        } else {
            j3 = j - this.mPrevPresentUsec;
            j2 = (this.speedInv1000 * j3) / this.speed1000;
        }
        long j4 = j3 >= 0 ? (j3 != 0 && j3 > 10000000) ? 5000000L : j3 : 0L;
        long j5 = this.mPrevMonoUsec + j2;
        long nanoTime = System.nanoTime() / 1000;
        long j6 = this.mPauseDelayUsec;
        while (true) {
            long j7 = nanoTime - j6;
            if (j7 >= j5 - 100) {
                this.mPrevMonoUsec += j2;
                this.mPrevPresentUsec += j4;
                return;
            }
            long j8 = j5 - j7;
            if (j8 > 500000) {
                j8 = 500000;
            }
            try {
                Thread.sleep(j8 / 1000, ((int) (j8 % 1000)) * 1000);
            } catch (InterruptedException unused) {
            }
            nanoTime = System.nanoTime() / 1000;
            j6 = this.mPauseDelayUsec;
        }
    }

    @Override // ru.ok.gl.effects.media.controller.video.MoviePlayer.FrameCallback
    public void reset() {
        this.mPauseDelayStartUsec = 0L;
        this.mPauseDelayUsec = 0L;
        this.mFixedFrameDurationUsec = 0L;
        this.mPrevMonoUsec = 0L;
        this.mPrevPresentUsec = 0L;
        this.mLoopReset = false;
    }

    public void setFixedPlaybackRate(int i) {
        this.mFixedFrameDurationUsec = 1000000 / i;
    }

    @Override // ru.ok.gl.effects.media.controller.video.MoviePlayer.FrameCallback
    public void setSpeed(float f) {
        float f2 = f * 1000.0f;
        long j = (long) f2;
        float f3 = 1000.0f / f;
        long j2 = (long) f3;
        if (Math.abs(j - f2) < Math.abs(j2 - f3)) {
            this.speed1000 = j;
            this.speedInv1000 = 1000L;
        } else {
            this.speedInv1000 = j2;
            this.speed1000 = 1000L;
        }
    }
}
