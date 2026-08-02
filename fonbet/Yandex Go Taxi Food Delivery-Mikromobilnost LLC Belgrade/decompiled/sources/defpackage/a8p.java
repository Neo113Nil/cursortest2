package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes14.dex */
public final class a8p implements sg2 {
    public final Long a;
    public final AccelerateInterpolator b;
    public final DecelerateInterpolator c;

    public a8p(int i) {
        Long l = (i & 1) != 0 ? null : 185L;
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        this.a = l;
        this.b = accelerateInterpolator;
        this.c = decelerateInterpolator;
    }

    @Override // defpackage.sg2
    public final ValueAnimator a(View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(this.c);
        ofFloat.addUpdateListener(new vf2(7, view, ofFloat));
        return ofFloat;
    }

    @Override // defpackage.sg2
    public final ValueAnimator b(View view, uo31 uo31Var) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(uo31Var.a, 0.0f);
        ofFloat.setInterpolator(this.b);
        ofFloat.addUpdateListener(new vf2(7, view, ofFloat));
        return ofFloat;
    }

    @Override // defpackage.sg2
    public final void c(ValueAnimator valueAnimator, long j) {
        Long l = this.a;
        if (l != null) {
            j = l.longValue();
        }
        valueAnimator.setDuration(j);
    }

    public a8p() {
        this(15);
    }
}
