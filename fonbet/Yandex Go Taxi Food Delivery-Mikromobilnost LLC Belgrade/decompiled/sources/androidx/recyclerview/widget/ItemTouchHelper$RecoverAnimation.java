package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import defpackage.g8e;

/* loaded from: classes10.dex */
class ItemTouchHelper$RecoverAnimation implements Animator.AnimatorListener {
    final int mActionState;
    final int mAnimationType;
    private float mFraction;
    boolean mIsPendingCleanup;
    final float mStartDx;
    final float mStartDy;
    final float mTargetX;
    final float mTargetY;
    final ValueAnimator mValueAnimator;
    final x0 mViewHolder;
    float mX;
    float mY;
    boolean mOverridden = false;
    boolean mEnded = false;

    public ItemTouchHelper$RecoverAnimation(x0 x0Var, int i, int i2, float f, float f2, float f3, float f4) {
        this.mActionState = i2;
        this.mAnimationType = i;
        this.mViewHolder = x0Var;
        this.mStartDx = f;
        this.mStartDy = f2;
        this.mTargetX = f3;
        this.mTargetY = f4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.mValueAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ItemTouchHelper$RecoverAnimation.this.setFraction(valueAnimator.getAnimatedFraction());
            }
        });
        ofFloat.setTarget(x0Var.a);
        ofFloat.addListener(this);
        setFraction(0.0f);
    }

    public void cancel() {
        this.mValueAnimator.cancel();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        setFraction(1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (!this.mEnded) {
            this.mViewHolder.T(true);
        }
        this.mEnded = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    public void setDuration(long j) {
        this.mValueAnimator.setDuration(j);
    }

    public void setFraction(float f) {
        this.mFraction = f;
    }

    public void start() {
        this.mViewHolder.T(false);
        this.mValueAnimator.start();
    }

    public void update() {
        float f = this.mStartDx;
        float f2 = this.mTargetX;
        if (f == f2) {
            this.mX = this.mViewHolder.a.getTranslationX();
        } else {
            this.mX = g8e.b(f2, f, this.mFraction, f);
        }
        float f3 = this.mStartDy;
        float f4 = this.mTargetY;
        if (f3 == f4) {
            this.mY = this.mViewHolder.a.getTranslationY();
        } else {
            this.mY = g8e.b(f4, f3, this.mFraction, f3);
        }
    }
}
