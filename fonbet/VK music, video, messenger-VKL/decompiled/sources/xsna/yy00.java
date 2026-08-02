package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import xsna.wy00;

/* compiled from: MarketFilterItemAnimator.kt */
/* loaded from: classes18.dex */
public final class yy00 extends AnimatorListenerAdapter {
    public final /* synthetic */ wy00 b;
    public final /* synthetic */ wy00.a c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ View e;

    public yy00(wy00 wy00Var, wy00.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.b = wy00Var;
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
        wy00.a aVar = this.c;
        RecyclerView.e0 e0Var = aVar.a;
        wy00 wy00Var = this.b;
        wy00Var.h(e0Var);
        ArrayList<RecyclerView.e0> arrayList = wy00Var.s;
        ttp0.a(arrayList).remove(aVar.a);
        wy00Var.D();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.e0 e0Var = this.c.a;
        this.b.getClass();
    }
}
