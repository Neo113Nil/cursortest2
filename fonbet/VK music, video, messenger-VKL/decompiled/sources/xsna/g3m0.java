package xsna;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: StoryGarlandDecorator.kt */
/* loaded from: classes6.dex */
public final class g3m0 extends lf2 {
    public final /* synthetic */ h3m0 b;

    public g3m0(h3m0 h3m0Var) {
        this.b = h3m0Var;
    }

    @Override // xsna.lf2
    public final void a(Drawable drawable) {
        AnimatedVectorDrawable animatedVectorDrawable = drawable instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) drawable : null;
        if (animatedVectorDrawable != null) {
            animatedVectorDrawable.clearAnimationCallbacks();
            this.b.s.onNext(Boolean.TRUE);
        }
    }

    @Override // xsna.lf2
    public final void b(Drawable drawable) {
        AnimatedVectorDrawable animatedVectorDrawable = drawable instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) drawable : null;
        if (animatedVectorDrawable == null || this.b.n) {
            return;
        }
        animatedVectorDrawable.stop();
    }
}
