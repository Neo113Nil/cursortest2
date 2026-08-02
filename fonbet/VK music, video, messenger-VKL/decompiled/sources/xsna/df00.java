package xsna;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.voip.ui.menu.ui.MainMenuView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.ghw0;
import xsna.h0k0;
import xsna.woo;

/* compiled from: OnboardingDelegate.kt */
/* loaded from: classes7.dex */
public final class df00 {
    public final a a;
    public final ihw0 b;
    public final boolean c;
    public h0k0 d = h0k0.d.a;
    public wk e;
    public final View f;
    public final ViewGroup g;
    public View h;
    public final xn2 i;

    /* compiled from: OnboardingDelegate.kt */
    public interface a {
        MainMenuView a();

        View b();
    }

    public df00(a aVar, ihw0 ihw0Var, boolean z) {
        this.a = aVar;
        this.b = ihw0Var;
        this.c = z;
        View inflate = LayoutInflater.from(aVar.a().getContext()).inflate(R.layout.voip_call_view_slide_up_menu_onboarding_view, (ViewGroup) aVar.a(), false);
        this.f = inflate;
        this.g = (ViewGroup) aVar.a().findViewById(R.id.voip_extended_options_onboarding_root);
        this.i = new xn2(inflate, aVar.b(), z);
        if (z) {
            return;
        }
        inflate.setVisibility(4);
    }

    public final void a() {
        wk wkVar = this.e;
        View view = this.f;
        if (wkVar != null) {
            view.removeCallbacks(wkVar);
        }
        xn2 xn2Var = this.i;
        xn2Var.a();
        xn2Var.b.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.g.removeView(view);
        if (this.h != null) {
            this.a.a().removeView(this.h);
        }
    }

    public final void b(h0k0 h0k0Var) {
        h0k0 h0k0Var2 = this.d;
        boolean equals = h0k0Var.equals(h0k0.a.a);
        int i = 0;
        xn2 xn2Var = this.i;
        if (equals) {
            bfm bfmVar = new bfm(this, 16);
            xn2Var.a();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f);
            xo2.h(ofFloat, new m4(bfmVar, 6));
            ofFloat.setDuration(600L);
            ofFloat.addUpdateListener(new sn2(xn2Var, 0));
            ofFloat.start();
            xn2Var.g = ofFloat;
        } else {
            h0k0.f fVar = h0k0.f.a;
            boolean equals2 = h0k0Var.equals(fVar);
            int i2 = 4;
            int i3 = 2;
            woo.d dVar = woo.n;
            if (equals2) {
                final b1z b1zVar = new b1z(this, i2);
                xn2Var.a();
                if (xn2Var.c) {
                    ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofMultiFloat("", new float[][]{new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ln2.d}, new float[]{ln2.a, ln2.c, ln2.f, ln2.e}}));
                    xo2.h(ofPropertyValuesHolder, new hh1(b1zVar, i3));
                    ofPropertyValuesHolder.setDuration(400L);
                    ofPropertyValuesHolder.addUpdateListener(new tn2(xn2Var, i));
                    ofPropertyValuesHolder.start();
                    xn2Var.g = ofPropertyValuesHolder;
                } else {
                    smk0 smk0Var = new smk0(xn2Var.b, dVar, ln2.b);
                    smk0Var.u.b(200.0f);
                    smk0Var.u.a(0.5f);
                    smk0Var.b(new woo.k() { // from class: xsna.un2
                        @Override // xsna.woo.k
                        public final void a(woo wooVar, boolean z, float f, float f2) {
                            b1z.this.invoke();
                        }
                    });
                    smk0Var.h();
                    xn2Var.h = smk0Var;
                }
            } else {
                h0k0.h hVar = h0k0.h.a;
                boolean equals3 = h0k0Var.equals(hVar);
                View view = this.f;
                if (equals3) {
                    long j = this.c ? 1000L : 800L;
                    m3g m3gVar = new m3g(this, 29);
                    wk wkVar = this.e;
                    if (wkVar != null) {
                        view.removeCallbacks(wkVar);
                    }
                    wk wkVar2 = new wk(m3gVar, 13);
                    this.e = wkVar2;
                    view.postDelayed(wkVar2, j);
                } else {
                    h0k0.g gVar = h0k0.g.a;
                    if (h0k0Var.equals(gVar)) {
                        final qfj qfjVar = new qfj(this, 17);
                        xn2Var.a();
                        if (xn2Var.c) {
                            ValueAnimator ofPropertyValuesHolder2 = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofMultiFloat("", new float[][]{new float[]{ln2.a, ln2.c, ln2.f, ln2.e, 1.0f}, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ln2.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT}}));
                            xo2.h(ofPropertyValuesHolder2, new zg(qfjVar, i3));
                            ofPropertyValuesHolder2.setDuration(300L);
                            ofPropertyValuesHolder2.addUpdateListener(new rn2(xn2Var, i));
                            ofPropertyValuesHolder2.start();
                            xn2Var.g = ofPropertyValuesHolder2;
                        } else {
                            smk0 smk0Var2 = new smk0(xn2Var.b, dVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            smk0Var2.u.b(200.0f);
                            smk0Var2.u.a(0.5f);
                            smk0Var2.b(new woo.k() { // from class: xsna.vn2
                                @Override // xsna.woo.k
                                public final void a(woo wooVar, boolean z, float f, float f2) {
                                    qfj.this.invoke();
                                }
                            });
                            smk0Var2.h();
                            xn2Var.h = smk0Var2;
                        }
                    } else {
                        boolean equals4 = h0k0Var.equals(h0k0.e.a);
                        h0k0.c cVar = h0k0.c.a;
                        if (equals4) {
                            if (h0k0Var2.equals(fVar) || h0k0Var2.equals(hVar) || h0k0Var2.equals(gVar)) {
                                wk wkVar3 = this.e;
                                if (wkVar3 != null) {
                                    view.removeCallbacks(wkVar3);
                                }
                                xn2Var.a();
                                xn2Var.e.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                xn2Var.d.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                xn2Var.b.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                xn2Var.a.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                f4m.y((int) ln2.d, xn2Var.f);
                            }
                            b(cVar);
                        } else if (h0k0Var.equals(h0k0.b.a)) {
                            cf00 cf00Var = new cf00(this, 0);
                            xn2Var.a();
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            xo2.h(ofFloat2, new ry0(cf00Var, i3));
                            ofFloat2.setDuration(300L);
                            ofFloat2.addUpdateListener(new b31(xn2Var, 1));
                            ofFloat2.start();
                            xn2Var.g = ofFloat2;
                        } else if (h0k0Var.equals(cVar)) {
                            this.b.a(ghw0.m.a);
                        } else if (!h0k0Var.equals(h0k0.d.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            }
        }
        this.d = h0k0Var;
    }
}
