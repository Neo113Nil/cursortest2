package xsna;

import android.view.animation.Animation;
import android.widget.TextView;

/* compiled from: NotificationsIconViewController.kt */
/* loaded from: classes16.dex */
public final class nj70 implements sp2 {
    public final /* synthetic */ TextView b;
    public final /* synthetic */ int c;

    public nj70(TextView textView, int i) {
        this.b = textView;
        this.c = i;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        TextView textView = this.b;
        bwt0.p0(textView, false);
        textView.setText(cn70.g(this.c));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        bwt0.p0(this.b, true);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
