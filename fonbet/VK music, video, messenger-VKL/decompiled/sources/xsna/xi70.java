package xsna;

import android.view.animation.Animation;

/* compiled from: NotificationsButtonViewController.kt */
/* loaded from: classes2.dex */
public final class xi70 implements sp2 {
    public final /* synthetic */ yi70 b;
    public final /* synthetic */ int c;

    public xi70(yi70 yi70Var, int i) {
        this.b = yi70Var;
        this.c = i;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        yi70 yi70Var = this.b;
        bwt0.p0(yi70Var.c, false);
        yi70Var.c.setText(cn70.g(this.c));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        bwt0.p0(this.b.c, true);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
