package defpackage;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import com.yandex.go.taxi.summary.shared.lifecycle.a;
import com.yandex.go.taxi.ui.selector.b;
import defpackage.oju;
import java.util.WeakHashMap;
import kotlin.TypeCastException;
import ru.yandex.taxi.perf.screen.c;
import ru.yandex.taxi.plus.badge.CashbackBadgeStyle;
import ru.yandex.taxi.plus.badge.CashbackHorizontalView;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

/* loaded from: classes6.dex */
public final class oju extends sb5 {
    public final wjm R;
    public final pav S;
    public final bbx0 T;
    public final boolean U;
    public final String V;
    public final String W;
    public final float Z;
    public final float a0;
    public final float b0;
    public final int c0;
    public final int d0;
    public final int e0;
    public final int f0;
    public final ConstraintLayout g0;
    public final ShimmeringRobotoTextView h0;
    public final ConstraintLayout i0;
    public final ImageView j0;
    public final FrameLayout k0;
    public final CashbackHorizontalView l0;
    public final RobotoTextView m0;
    public rb5 n0;
    public g18 o0;
    public g18 p0;
    public g18 q0;
    public mr31 r0;
    public final pbj s0;
    public final b t0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oju(wjm wjmVar, pav pavVar, bbx0 bbx0Var, boolean z, hbp0 hbp0Var, f1f0 f1f0Var, c cVar, a aVar) {
        super(r9, cVar, aVar);
        qzm qzmVar = (qzm) wjmVar.b;
        FrameLayout frameLayout = (FrameLayout) qzmVar.e;
        this.R = wjmVar;
        this.S = pavVar;
        this.T = bbx0Var;
        this.U = z;
        this.V = ru.yandex.taxi.design.utils.c.G(kyh0.summary_accessibility_tariff_open_details_label, frameLayout);
        this.W = frameLayout.getContext().getString(kyh0.summary_accessibility_tariff_select_label);
        float x = tje.x(frameLayout.getContext(), 8.0f);
        this.Z = xw31.n(frameLayout.getContext()) ? -x : x;
        float x2 = tje.x(frameLayout.getContext(), 4.0f);
        this.a0 = xw31.n(frameLayout.getContext()) ? -x2 : x2;
        float x3 = tje.x(frameLayout.getContext(), -12.0f);
        this.b0 = xw31.n(frameLayout.getContext()) ? -x3 : x3;
        this.c0 = tje.r(qsg0.high_tariff_icon_width_active, frameLayout.getContext());
        this.d0 = tje.r(qsg0.high_tariff_icon_width_inactive, frameLayout.getContext());
        this.e0 = tje.r(qsg0.high_tariff_info_icons_start_margin_active, frameLayout.getContext());
        this.f0 = tje.r(qsg0.high_tariff_info_icons_start_margin_inactive, frameLayout.getContext());
        ConstraintLayout constraintLayout = (ConstraintLayout) qzmVar.h;
        qzm qzmVar2 = (qzm) qzmVar.d;
        this.g0 = constraintLayout;
        ShimmeringRobotoTextView shimmeringRobotoTextView = (ShimmeringRobotoTextView) qzmVar2.g;
        shimmeringRobotoTextView.setAnimationDuration(900);
        this.h0 = shimmeringRobotoTextView;
        this.i0 = (ConstraintLayout) qzmVar2.c;
        this.j0 = (ImageView) qzmVar.b;
        m2y m2yVar = (m2y) qzmVar.c;
        FrameLayout frameLayout2 = (FrameLayout) m2yVar.c;
        this.k0 = frameLayout2;
        this.l0 = (CashbackHorizontalView) m2yVar.e;
        RobotoTextView robotoTextView = (RobotoTextView) qzmVar.f;
        robotoTextView.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.yandex.taxi.preorder.summary.selector.ui.ribbon.holder.HighTariffCardViewHolder$etaView$1$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ru.yandex.taxi.design.utils.c.j(4, oju.this.a));
            }
        });
        robotoTextView.setClipToOutline(true);
        this.m0 = robotoTextView;
        this.n0 = rb5.a;
        dai daiVar = g18.u1;
        this.o0 = daiVar;
        this.p0 = daiVar;
        this.q0 = daiVar;
        this.s0 = new pbj(this);
        this.t0 = new b(f1f0Var, bbx0Var, hbp0Var, (RobotoTextView) qzmVar2.f, (ViewStub) qzmVar2.b, (ViewStub) qzmVar2.e, (ViewStub) qzmVar2.d);
        ru.yandex.taxi.design.utils.c.z(new mju(this, 1), constraintLayout);
        ((FrameLayout) qzmVar.g).setClipToOutline(true);
        frameLayout.setBackground((Drawable) bbx0Var.e.invoke());
        androidx.core.view.b.p(constraintLayout, new mg(16, this));
        frameLayout2.getLayoutTransition().setAnimateParentHierarchy(false);
    }

    public static void c0(float f, boolean z, View view) {
        if (z) {
            view.animate().setDuration(200L).translationX(f).withEndAction(new nju(view, 0, f));
        } else {
            view.setTranslationX(f);
        }
    }

    @Override // defpackage.sb5
    public final void X() {
        this.l0.stopPromoTextAnimation();
        this.h0.stopAnimation();
        this.k0.animate().cancel();
        this.j0.animate().cancel();
        this.i0.animate().cancel();
        this.m0.animate().cancel();
    }

    @Override // defpackage.sb5
    public final View Y() {
        return this.l0;
    }

    @Override // defpackage.sb5
    public final View Z() {
        return this.j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x03a7, code lost:
    
        if ((r20.w ? 0 : r10.k) != r15) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0134, code lost:
    
        if (defpackage.jl40.l(r20.U ? r20.T : null, r8) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0193, code lost:
    
        if (defpackage.jl40.l(r20.S ? null : r20.u ? r20.q : r20.r, r8) == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x024a, code lost:
    
        if ((r20.u && r20.S && r20.F) != r15) goto L182;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x00c7  */
    @Override // defpackage.sb5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0(elx0 elx0Var, elx0 elx0Var2) {
        boolean z;
        RobotoTextView robotoTextView;
        RobotoTextView robotoTextView2;
        AppCompatImageView appCompatImageView;
        lbm a;
        boolean z2;
        ViewGroup.LayoutParams layoutParams;
        mr31 mr31Var = elx0Var2.s;
        boolean z3 = elx0Var2.S;
        this.r0 = mr31Var;
        boolean z4 = elx0Var2.u;
        View view = this.a;
        view.setSelected(z4);
        pbj pbjVar = this.s0;
        pbjVar.b = z4;
        pbjVar.w = "";
        float f = z4 ? 1.0f : 0.0f;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.r(view, f);
        String str = elx0Var2.f;
        ShimmeringRobotoTextView shimmeringRobotoTextView = this.h0;
        if (elx0Var == null || !jl40.l(elx0Var.f, str)) {
            shimmeringRobotoTextView.setText(str);
            pbjVar.x = str;
            pbjVar.w = "";
        }
        bbx0 bbx0Var = this.T;
        ImageView imageView = this.j0;
        if (elx0Var == null || elx0Var.u != z4) {
            float f2 = z4 ? 1.0f : bbx0Var.b;
            if (elx0Var == null && !this.U) {
                imageView.setAlpha(f2);
            } else {
                cma1.b(f2, imageView);
            }
            kdc kdcVar = z4 ? bbx0Var.c : bbx0Var.d;
            int i = z4 ? 3 : 0;
            shimmeringRobotoTextView.setTextColor(kdcVar);
            shimmeringRobotoTextView.setTextTypeface(i);
        }
        boolean z5 = elx0Var2.g;
        if (elx0Var == null || elx0Var.g != z5) {
            if (z5) {
                shimmeringRobotoTextView.startAnimation();
            } else {
                shimmeringRobotoTextView.stopAnimation();
            }
        }
        String str2 = elx0Var2.m;
        wjm wjmVar = this.R;
        if (elx0Var == null || !jl40.l(elx0Var.m, str2)) {
            if (str2 != null) {
                wjmVar.getClass();
                if (!evu0.J(str2)) {
                    z = false;
                    if (((RobotoTextView) wjmVar.x) == null && !z) {
                        wjmVar.x = (RobotoTextView) ((ViewStub) ((qzm) ((qzm) wjmVar.b).d).h).inflate();
                    }
                    robotoTextView = (RobotoTextView) wjmVar.x;
                    if (robotoTextView != null) {
                        robotoTextView.setText(str2);
                    }
                    robotoTextView2 = (RobotoTextView) wjmVar.x;
                    if (robotoTextView2 != null) {
                        robotoTextView2.setVisibility(!z ? 0 : 8);
                    }
                }
            }
            z = true;
            if (((RobotoTextView) wjmVar.x) == null) {
                wjmVar.x = (RobotoTextView) ((ViewStub) ((qzm) ((qzm) wjmVar.b).d).h).inflate();
            }
            robotoTextView = (RobotoTextView) wjmVar.x;
            if (robotoTextView != null) {
            }
            robotoTextView2 = (RobotoTextView) wjmVar.x;
            if (robotoTextView2 != null) {
            }
        }
        boolean z6 = elx0Var2.V;
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) wjmVar.c;
        qzm qzmVar = (qzm) wjmVar.b;
        if (appCompatImageView2 == null && z6) {
            wjmVar.c = (AppCompatImageView) ((ViewStub) ((m2y) qzmVar.c).b).inflate();
        }
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) wjmVar.c;
        if (appCompatImageView3 != null) {
            appCompatImageView3.setVisibility(z6 ? 0 : 8);
        }
        String str3 = elx0Var2.Q;
        CashbackHorizontalView cashbackHorizontalView = this.l0;
        if (elx0Var == null || !jl40.l(elx0Var.Q, str3)) {
            cashbackHorizontalView.setValueText(str3);
        }
        String str4 = elx0Var2.R;
        if (elx0Var == null || !jl40.l(elx0Var.R, str4)) {
            pbjVar.z = str4;
            pbjVar.w = "";
        }
        CashbackBadgeStyle cashbackBadgeStyle = elx0Var2.U ? elx0Var2.T : null;
        if (elx0Var != null) {
        }
        if (cashbackBadgeStyle != null) {
            cashbackHorizontalView.setBadgeStyle(cashbackBadgeStyle);
        }
        kdc kdcVar2 = elx0Var2.I;
        if (elx0Var == null || !jl40.l(elx0Var.I, kdcVar2)) {
            cashbackHorizontalView.setTextColor(kdcVar2);
        }
        boolean z7 = elx0Var2.J;
        if (elx0Var == null || elx0Var.J != z7) {
            cashbackHorizontalView.setIsGradientEnabled(z7);
        }
        Float f3 = elx0Var2.K;
        if (elx0Var == null || !jl40.l(elx0Var.K, f3)) {
            cashbackHorizontalView.setHeightDp(f3);
        }
        cashbackHorizontalView.setVisibility(z3 ? 0 : 8);
        String str5 = z3 ? null : z4 ? elx0Var2.q : elx0Var2.r;
        g18 g18Var = g18.u1;
        pav pavVar = this.S;
        if (elx0Var != null) {
        }
        this.o0.cancel();
        boolean z8 = str5 == null || evu0.J(str5);
        if (((AppCompatImageView) wjmVar.w) == null && !z8) {
            wjmVar.w = (AppCompatImageView) ((ViewStub) ((m2y) qzmVar.c).d).inflate();
        }
        AppCompatImageView appCompatImageView4 = (AppCompatImageView) wjmVar.w;
        if (appCompatImageView4 != null) {
            appCompatImageView4.setVisibility(!z8 ? 0 : 8);
        }
        this.o0 = (z8 || (appCompatImageView = (AppCompatImageView) wjmVar.w) == null || (a = pavVar.a(appCompatImageView)) == null) ? g18Var : ((nac) a).c(str5);
        cashbackHorizontalView.setPromoText(elx0Var2.D);
        String str6 = elx0Var2.E;
        if (str6 == null || evu0.J(str6)) {
            this.p0.cancel();
            cashbackHorizontalView.useDefaultIcon();
        } else {
            if (!str6.equals(elx0Var != null ? elx0Var.E : null)) {
                this.p0.cancel();
                nac nacVar = (nac) pavVar.f(new w9u(8), cashbackHorizontalView);
                nacVar.i = new mju(this, 0);
                this.p0 = nacVar.c(str6);
            }
        }
        boolean z9 = z4 && z3 && elx0Var2.F;
        if (elx0Var != null) {
        }
        if (z9) {
            cashbackHorizontalView.startPromoTextAnimation();
            this.n0.a();
        } else {
            cashbackHorizontalView.stopPromoTextAnimation();
        }
        t0f0 t0f0Var = elx0Var2.P;
        this.t0.e(t0f0Var);
        String a2 = t0f0Var != null ? t0f0Var.a() : null;
        if (!jl40.l(a2, (String) pbjVar.y)) {
            pbjVar.y = a2;
            pbjVar.w = "";
        }
        String str7 = elx0Var2.O;
        if (elx0Var == null || !jl40.l(elx0Var.O, str7)) {
            this.q0.cancel();
            if (str7 != null && str7.length() != 0) {
                g18Var = ((nac) pavVar.a(imageView)).c(str7);
            }
            this.q0 = g18Var;
        }
        nco ncoVar = elx0Var2.l;
        if (elx0Var == null || !jl40.l(elx0Var.l, ncoVar)) {
            boolean z10 = elx0Var == null;
            RobotoTextView robotoTextView3 = this.m0;
            if (ncoVar != null) {
                z2 = false;
                robotoTextView3.setVisibility(0);
                robotoTextView3.setText(ncoVar.getText());
                robotoTextView3.setTextColor(ncoVar.a());
                robotoTextView3.setTextTypeface(ncoVar.b());
                pbjVar.A = ncoVar.getText();
                pbjVar.w = "";
                robotoTextView3.setBackgroundColor(s8o.m(ncoVar.getBackgroundColor(), view.getContext()));
                float w = tje.w(ncoVar.c(), view.getContext());
                if (xw31.n(view.getContext())) {
                    w = -w;
                }
                c0(w, !z10, robotoTextView3);
                boolean z11 = elx0Var2.N;
                if (elx0Var != null || elx0Var.N != z11) {
                    boolean z12 = elx0Var != null ? true : z2;
                    layoutParams = imageView.getLayoutParams();
                    if (layoutParams != null) {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.width = z11 ? this.c0 : this.d0;
                    imageView.setLayoutParams(layoutParams);
                    FrameLayout frameLayout = this.k0;
                    ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                    if (layoutParams2 == null) {
                        ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        return;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    int i2 = this.f0;
                    int i3 = this.e0;
                    int i4 = z11 ? i3 : i2;
                    int i5 = marginLayoutParams.topMargin;
                    int marginEnd = marginLayoutParams.getMarginEnd();
                    int i6 = marginLayoutParams.bottomMargin;
                    marginLayoutParams.setMarginStart(i4);
                    marginLayoutParams.topMargin = i5;
                    marginLayoutParams.setMarginEnd(marginEnd);
                    marginLayoutParams.bottomMargin = i6;
                    frameLayout.setLayoutParams(marginLayoutParams);
                    boolean z13 = !z12;
                    c0(z11 ? this.a0 : this.b0, z13, imageView);
                    c0(z11 ? this.Z : 0.0f, z13, this.i0);
                    float f4 = z11 ? i2 - i3 : i3 - i2;
                    if (z12) {
                        frameLayout.setTranslationX(0.0f);
                    } else {
                        frameLayout.setTranslationX(f4);
                        frameLayout.animate().setDuration(200L).translationX(0.0f).withEndAction(new ce0(frameLayout, 12));
                    }
                }
                int i7 = elx0Var2.w ? 0 : bbx0Var.k;
                if (elx0Var != null) {
                }
                xw31.A(i7, view);
                this.g0.setMinWidth(bbx0Var.j);
                return;
            }
            robotoTextView3.setVisibility(8);
            pbjVar.A = "";
            pbjVar.w = "";
        }
        z2 = false;
        boolean z112 = elx0Var2.N;
        if (elx0Var != null) {
        }
        if (elx0Var != null) {
        }
        layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
        }
    }

    @Override // defpackage.sb5, defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.a.setBackground((Drawable) this.T.e.invoke());
    }

    @Override // defpackage.sb5
    public final void b0(rb5 rb5Var) {
        this.n0 = rb5Var;
    }
}
