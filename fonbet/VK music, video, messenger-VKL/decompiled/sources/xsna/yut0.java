package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ViewDisplayer.java */
/* loaded from: classes17.dex */
public final class yut0 extends AnimatorListenerAdapter {
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ xut0 d;

    public yut0(xut0 xut0Var, View view, boolean z) {
        this.d = xut0Var;
        this.b = view;
        this.c = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.d.c = null;
        View view = this.b;
        view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (this.c) {
            view.setVisibility(8);
        }
    }
}
