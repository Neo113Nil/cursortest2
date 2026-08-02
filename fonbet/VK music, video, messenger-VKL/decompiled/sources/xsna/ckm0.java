package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;

/* compiled from: StoryUploadAnimationPulse.kt */
/* loaded from: classes6.dex */
public final class ckm0 implements akm0 {
    public final Context a;
    public final r9r0 b;
    public final dyl0 c;
    public ValueAnimator d;

    public ckm0(Context context, r9r0 r9r0Var, dyl0 dyl0Var) {
        this.a = context;
        this.b = r9r0Var;
        this.c = dyl0Var;
    }

    @Override // xsna.akm0
    public final boolean a() {
        ValueAnimator valueAnimator = this.d;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    @Override // xsna.akm0
    public final void cancel() {
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = null;
    }

    @Override // xsna.akm0
    public final void draw(Canvas canvas) {
        this.b.b(this.a, canvas);
    }

    @Override // xsna.akm0
    public final void pause() {
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.pause();
        }
    }

    @Override // xsna.akm0
    public final void resume() {
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.resume();
        }
    }
}
