package xsna;

import android.view.animation.Animation;

/* compiled from: MediaRouteControllerDialog.java */
/* loaded from: classes12.dex */
public final class sw10 implements Animation.AnimationListener {
    public final /* synthetic */ androidx.mediarouter.app.b b;

    public sw10(androidx.mediarouter.app.b bVar) {
        this.b = bVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.b.r(true);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
