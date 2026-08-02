package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Pair;
import xsna.wln0;

/* compiled from: SwitchableTextDelegate.kt */
/* loaded from: classes16.dex */
public final class wnn0 extends rmn0 {
    public final View b;
    public final View c;
    public final wln0.a d;
    public final izs<View, s3q0> e;
    public final gzs<s3q0> f;

    /* compiled from: AnimExt.kt */
    public static final class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            gzs<s3q0> gzsVar = wnn0.this.f;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }
    }

    public wnn0(View view, View view2, wln0.a aVar, izs izsVar, cvs cvsVar, int i) {
        aVar = (i & 4) != 0 ? new wln0.a(0L, 7) : aVar;
        izsVar = (i & 8) != 0 ? null : izsVar;
        cvsVar = (i & 16) != 0 ? null : cvsVar;
        this.b = view;
        this.c = view2;
        this.d = aVar;
        this.e = izsVar;
        this.f = cvsVar;
    }

    @Override // xsna.rmn0
    public final void a(int i) {
        ValueAnimator valueAnimator;
        View view = this.b;
        int visibility = view.getVisibility();
        View view2 = this.c;
        Pair pair = visibility == 0 ? new Pair(view, view2) : new Pair(view2, view);
        View view3 = (View) pair.d();
        View view4 = (View) pair.g();
        on2 on2Var = this.a;
        wln0.a aVar = this.d;
        ValueAnimator a2 = on2Var != null ? on2Var.a(view4, true, aVar, i) : null;
        long j = aVar.b + 20;
        on2 on2Var2 = this.a;
        if (on2Var2 != null) {
            valueAnimator = on2Var2.b(view3, aVar.a, j, on2Var2.f, on2Var2.g, true, i == 1 ? -1 : 1);
        } else {
            valueAnimator = null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimator, a2);
        animatorSet.addListener(new a(view4));
        animatorSet.addListener(new b());
        animatorSet.start();
    }

    public final void b(String str, boolean z) {
        View view = this.b;
        if (view instanceof TextView) {
            View view2 = this.c;
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view;
                on2 on2Var = this.a;
                if (on2Var != null) {
                    on2Var.c(textView, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    textView.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                if (z) {
                    textView.setVisibility(0);
                    textView.setAlpha(1.0f);
                }
                textView.setText(str);
                TextView textView2 = (TextView) view2;
                on2 on2Var2 = this.a;
                if (on2Var2 != null) {
                    on2Var2.c(textView2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    textView2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                if (z) {
                    textView2.setVisibility(4);
                    textView2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                textView2.setText(str);
            }
        }
    }

    /* compiled from: Animator.kt */
    public static final class a implements Animator.AnimatorListener {
        public final /* synthetic */ View c;

        public a(View view) {
            this.c = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            izs<View, s3q0> izsVar = wnn0.this.e;
            if (izsVar != null) {
                izsVar.invoke(this.c);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }
    }
}
