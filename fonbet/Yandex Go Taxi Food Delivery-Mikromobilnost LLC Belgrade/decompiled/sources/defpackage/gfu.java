package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes14.dex */
public final class gfu implements sg2 {
    public final AccelerateInterpolator a;
    public final DecelerateInterpolator b;
    public final int c;

    public gfu(int i, int i2) {
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        i = (i2 & 4) != 0 ? 1000 : i;
        this.a = accelerateInterpolator;
        this.b = decelerateInterpolator;
        this.c = i;
    }

    @Override // defpackage.sg2
    public final ValueAnimator a(View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(this.b);
        ofFloat.addUpdateListener(new o8m(3, this, view, ofFloat));
        return ofFloat;
    }

    @Override // defpackage.sg2
    public final ValueAnimator b(View view, uo31 uo31Var) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(this.a);
        ofFloat.addUpdateListener(new o8m(3, this, view, ofFloat));
        return ofFloat;
    }

    public gfu() {
        this(0, 7);
    }
}
