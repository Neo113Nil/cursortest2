package com.airbnb.lottie.utils;

import android.graphics.PointF;
import android.view.Choreographer;
import com.airbnb.lottie.AsyncUpdates;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.ti20;
import defpackage.upx;
import defpackage.x4e;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public class LottieValueAnimator extends BaseLottieAnimator implements Choreographer.FrameCallback {
    private nsz composition;
    private float speed = 1.0f;
    private boolean speedReversedForRepeatMode = false;
    private long lastFrameTimeNs = 0;
    private float frameRaw = 0.0f;
    private float frame = 0.0f;
    private int repeatCount = 0;
    private float minFrame = -2.1474836E9f;
    private float maxFrame = 2.1474836E9f;
    protected boolean running = false;
    private boolean useCompositionFrameRate = false;

    private void checkNotifyUpdate(float f) {
        if (this.useCompositionFrameRate && this.frameRaw == f) {
            return;
        }
        notifyUpdate();
    }

    private float getFrameDurationNs() {
        nsz nszVar = this.composition;
        if (nszVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / nszVar.n) / Math.abs(this.speed);
    }

    private boolean isReversed() {
        return getSpeed() < 0.0f;
    }

    private void verifyFrame() {
        if (this.composition == null) {
            return;
        }
        float f = this.frame;
        float f2 = this.minFrame;
        if (f < f2 || f > this.maxFrame) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f2), Float.valueOf(this.maxFrame), Float.valueOf(this.frame)));
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        notifyCancel();
        removeFrameCallback();
    }

    public void clearComposition() {
        this.composition = null;
        this.minFrame = -2.1474836E9f;
        this.maxFrame = 2.1474836E9f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        postFrameCallback();
        if (this.composition == null || !isRunning()) {
            return;
        }
        AsyncUpdates asyncUpdates = upx.a;
        float frameDurationNs = (this.lastFrameTimeNs != 0 ? j - r0 : 0L) / getFrameDurationNs();
        float f = this.frameRaw;
        if (isReversed()) {
            frameDurationNs = -frameDurationNs;
        }
        float f2 = f + frameDurationNs;
        float minFrame = getMinFrame();
        float maxFrame = getMaxFrame();
        PointF pointF = ti20.a;
        boolean z = f2 >= minFrame && f2 <= maxFrame;
        float f3 = this.frameRaw;
        float b = ti20.b(f2, getMinFrame(), getMaxFrame());
        this.frameRaw = b;
        if (this.useCompositionFrameRate) {
            b = (float) Math.floor(b);
        }
        this.frame = b;
        this.lastFrameTimeNs = j;
        if (z) {
            checkNotifyUpdate(f3);
        } else if (getRepeatCount() == -1 || this.repeatCount < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.speedReversedForRepeatMode = !this.speedReversedForRepeatMode;
                reverseAnimationSpeed();
            } else {
                float maxFrame2 = isReversed() ? getMaxFrame() : getMinFrame();
                this.frameRaw = maxFrame2;
                this.frame = maxFrame2;
            }
            this.lastFrameTimeNs = j;
            checkNotifyUpdate(f3);
            notifyRepeat();
            this.repeatCount++;
        } else {
            float minFrame2 = this.speed < 0.0f ? getMinFrame() : getMaxFrame();
            this.frameRaw = minFrame2;
            this.frame = minFrame2;
            removeFrameCallback();
            checkNotifyUpdate(f3);
            notifyEnd(isReversed());
        }
        verifyFrame();
    }

    public void endAnimation() {
        removeFrameCallback();
        notifyEnd(isReversed());
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float minFrame;
        float maxFrame;
        float minFrame2;
        if (this.composition == null) {
            return 0.0f;
        }
        if (isReversed()) {
            minFrame = getMaxFrame() - this.frame;
            maxFrame = getMaxFrame();
            minFrame2 = getMinFrame();
        } else {
            minFrame = this.frame - getMinFrame();
            maxFrame = getMaxFrame();
            minFrame2 = getMinFrame();
        }
        return minFrame / (maxFrame - minFrame2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(getAnimatedValueAbsolute());
    }

    public float getAnimatedValueAbsolute() {
        nsz nszVar = this.composition;
        if (nszVar == null) {
            return 0.0f;
        }
        float f = this.frame;
        float f2 = nszVar.l;
        return (f - f2) / (nszVar.m - f2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        nsz nszVar = this.composition;
        if (nszVar == null) {
            return 0L;
        }
        return (long) nszVar.b();
    }

    public float getFrame() {
        return this.frame;
    }

    public float getMaxFrame() {
        nsz nszVar = this.composition;
        if (nszVar == null) {
            return 0.0f;
        }
        float f = this.maxFrame;
        return f == 2.1474836E9f ? nszVar.m : f;
    }

    public float getMinFrame() {
        nsz nszVar = this.composition;
        if (nszVar == null) {
            return 0.0f;
        }
        float f = this.minFrame;
        return f == -2.1474836E9f ? nszVar.l : f;
    }

    public float getSpeed() {
        return this.speed;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.running;
    }

    @Override // com.airbnb.lottie.utils.BaseLottieAnimator
    public void notifyCancel() {
        super.notifyCancel();
        notifyEnd(isReversed());
    }

    public void pauseAnimation() {
        removeFrameCallback();
        notifyPause();
    }

    public void playAnimation() {
        this.running = true;
        notifyStart(isReversed());
        setFrame((int) (isReversed() ? getMaxFrame() : getMinFrame()));
        this.lastFrameTimeNs = 0L;
        this.repeatCount = 0;
        postFrameCallback();
    }

    public void postFrameCallback() {
        if (isRunning()) {
            removeFrameCallback(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void removeFrameCallback(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.running = false;
        }
    }

    public void resumeAnimation() {
        this.running = true;
        postFrameCallback();
        this.lastFrameTimeNs = 0L;
        if (isReversed() && getFrame() == getMinFrame()) {
            setFrame(getMaxFrame());
        } else if (!isReversed() && getFrame() == getMaxFrame()) {
            setFrame(getMinFrame());
        }
        notifyResume();
    }

    public void reverseAnimationSpeed() {
        setSpeed(-getSpeed());
    }

    public void setComposition(nsz nszVar) {
        boolean z = this.composition == null;
        this.composition = nszVar;
        if (z) {
            setMinAndMaxFrames(Math.max(this.minFrame, nszVar.l), Math.min(this.maxFrame, nszVar.m));
        } else {
            setMinAndMaxFrames((int) nszVar.l, (int) nszVar.m);
        }
        float f = this.frame;
        this.frame = 0.0f;
        this.frameRaw = 0.0f;
        setFrame((int) f);
        notifyUpdate();
    }

    public void setFrame(float f) {
        if (this.frameRaw == f) {
            return;
        }
        float b = ti20.b(f, getMinFrame(), getMaxFrame());
        this.frameRaw = b;
        if (this.useCompositionFrameRate) {
            b = (float) Math.floor(b);
        }
        this.frame = b;
        this.lastFrameTimeNs = 0L;
        notifyUpdate();
    }

    public void setMaxFrame(float f) {
        setMinAndMaxFrames(this.minFrame, f);
    }

    public void setMinAndMaxFrames(float f, float f2) {
        if (f > f2) {
            ny61.g(x4e.e("minFrame (", f, ") must be <= maxFrame (", f2, Extension.C_BRAKE));
            return;
        }
        nsz nszVar = this.composition;
        float f3 = nszVar == null ? -3.4028235E38f : nszVar.l;
        float f4 = nszVar == null ? Float.MAX_VALUE : nszVar.m;
        float b = ti20.b(f, f3, f4);
        float b2 = ti20.b(f2, f3, f4);
        if (b == this.minFrame && b2 == this.maxFrame) {
            return;
        }
        this.minFrame = b;
        this.maxFrame = b2;
        setFrame((int) ti20.b(this.frame, b, b2));
    }

    public void setMinFrame(int i) {
        setMinAndMaxFrames(i, (int) this.maxFrame);
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.speedReversedForRepeatMode) {
            return;
        }
        this.speedReversedForRepeatMode = false;
        reverseAnimationSpeed();
    }

    public void setSpeed(float f) {
        this.speed = f;
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.useCompositionFrameRate = z;
    }

    public void removeFrameCallback() {
        removeFrameCallback(true);
    }
}
