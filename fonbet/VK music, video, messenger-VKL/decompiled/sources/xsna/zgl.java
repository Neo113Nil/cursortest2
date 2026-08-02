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
public final class zgl extends AnimatorListenerAdapter {
    public final /* synthetic */ jxq b;
    public final /* synthetic */ bsa c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ View e;
    public final /* synthetic */ List<RecyclerView.e0> f;

    public zgl(jxq jxqVar, bsa bsaVar, ViewPropertyAnimator viewPropertyAnimator, View view, List<RecyclerView.e0> list) {
        this.b = jxqVar;
        this.c = bsaVar;
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
        view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        bsa bsaVar = this.c;
        RecyclerView.e0 e0Var = bsaVar.b;
        jxq jxqVar = this.b;
        jxqVar.h(e0Var);
        List<RecyclerView.e0> list = this.f;
        ttp0.a(list).remove(bsaVar.b);
        jxqVar.D();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.e0 e0Var = this.c.b;
        this.b.getClass();
    }
}
