package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: FreshNewsButtonHelper.kt */
/* loaded from: classes4.dex */
public final class uhs extends AnimatorListenerAdapter {
    public final /* synthetic */ vhs b;

    public uhs(vhs vhsVar) {
        this.b = vhsVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = (View) this.b.d.getValue();
        if (view != null) {
            view.setVisibility(8);
        }
    }
}
