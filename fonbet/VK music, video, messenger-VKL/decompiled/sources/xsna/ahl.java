package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: DefaultItemAnimatorDelegate.kt */
/* loaded from: classes4.dex */
public final class ahl extends AnimatorListenerAdapter {
    public final /* synthetic */ jxq b;
    public final /* synthetic */ RecyclerView.e0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ViewPropertyAnimator g;
    public final /* synthetic */ List<RecyclerView.e0> h;

    public ahl(jxq jxqVar, RecyclerView.e0 e0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator, List<RecyclerView.e0> list) {
        this.b = jxqVar;
        this.c = e0Var;
        this.d = i;
        this.e = view;
        this.f = i2;
        this.g = viewPropertyAnimator;
        this.h = list;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.d;
        View view = this.e;
        if (i != 0) {
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (this.f != 0) {
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.g.setListener(null);
        jxq jxqVar = this.b;
        RecyclerView.e0 e0Var = this.c;
        jxqVar.h(e0Var);
        this.h.remove(e0Var);
        jxqVar.D();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.getClass();
    }
}
