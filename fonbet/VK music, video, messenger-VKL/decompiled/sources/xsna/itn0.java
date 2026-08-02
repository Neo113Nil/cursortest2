package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import xsna.ftn0;

/* compiled from: TabRecyclerItemAnimator.kt */
/* loaded from: classes6.dex */
public final class itn0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ftn0 b;
    public final /* synthetic */ ftn0.a c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ View e;

    public itn0(ftn0 ftn0Var, ftn0.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.b = ftn0Var;
        this.c = aVar;
        this.d = viewPropertyAnimator;
        this.e = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.d.setListener(null);
        View view = this.e;
        view.setAlpha(1.0f);
        view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ftn0.a aVar = this.c;
        RecyclerView.e0 e0Var = aVar.b;
        ftn0 ftn0Var = this.b;
        ftn0Var.h(e0Var);
        ftn0Var.D.remove(aVar.b);
        ftn0Var.I();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.e0 e0Var = this.c.b;
        this.b.getClass();
    }
}
