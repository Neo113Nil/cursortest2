package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: RecommendationsCarouselItemAnimatorDelegate.kt */
/* loaded from: classes4.dex */
public final class mbf0 extends AnimatorListenerAdapter {
    public final /* synthetic */ jxq b;
    public final /* synthetic */ RecyclerView.e0 c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ View e;
    public final /* synthetic */ List<RecyclerView.e0> f;

    public mbf0(View view, ViewPropertyAnimator viewPropertyAnimator, RecyclerView.e0 e0Var, List list, jxq jxqVar) {
        this.b = jxqVar;
        this.c = e0Var;
        this.d = viewPropertyAnimator;
        this.e = view;
        this.f = list;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.d.setListener(null);
        View view = this.e;
        view.setAlpha(1.0f);
        view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        jxq jxqVar = this.b;
        RecyclerView.e0 e0Var = this.c;
        jxqVar.A(e0Var);
        this.f.remove(e0Var);
        jxqVar.D();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.getClass();
    }
}
