package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import xsna.dak0;
import xsna.wlp0;

/* compiled from: OnboardingPromoContent.kt */
/* loaded from: classes4.dex */
public final class df80 {
    public static final void a(hh80 hh80Var, izs<? super com.vk.onboardingpromo.impl.ui.entity.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-84441531);
        int i2 = (M.J(hh80Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-84441531, i2, -1, "com.vk.onboardingpromo.impl.ui.view.OnboardingPromoContent (OnboardingPromoContent.kt:25)");
            }
            rrv0.d(null, null, null, null, kai.c(806681792, new a6(9, hh80Var, izsVar), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new p9(hh80Var, izsVar, i, 6);
        }
    }

    public static final ymt0 b(wlp0 wlp0Var, float f, androidx.compose.runtime.a aVar) {
        Object B;
        Object B2;
        dak0 a;
        izs<Object, s3q0> e;
        dak0 b;
        z46 z46Var = wlp0Var.a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1037895075, 0, -1, "com.vk.onboardingpromo.impl.ui.view.createVideoTransitionConfig (OnboardingPromoContent.kt:61)");
        }
        jtp0 jtp0Var = rte0.g;
        boolean g = wlp0Var.g();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (g) {
            aVar.K(1666827533);
            aVar.j();
            B = z46Var.B();
        } else {
            aVar.K(1666573488);
            boolean J = aVar.J(wlp0Var);
            B = aVar.x();
            if (J || B == c0012a) {
                a = dak0.a.a();
                e = a != null ? a.e() : null;
                b = dak0.a.b(a);
                try {
                    Object B3 = z46Var.B();
                    dak0.a.d(a, b, e);
                    aVar.R(B3);
                    B = B3;
                } finally {
                }
            }
            aVar.j();
        }
        boolean booleanValue = ((Boolean) B).booleanValue();
        aVar.K(-2024840359);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-2024840359, 0, -1, "com.vk.onboardingpromo.impl.ui.view.createVideoTransitionConfig.<anonymous> (OnboardingPromoContent.kt:64)");
        }
        float f2 = booleanValue ? 0 : f;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        pco pcoVar = new pco(f2);
        boolean J2 = aVar.J(wlp0Var);
        Object x = aVar.x();
        if (J2 || x == c0012a) {
            x = bbk0.b(new ze80(wlp0Var));
            aVar.R(x);
        }
        boolean booleanValue2 = ((Boolean) ((mtk0) x).getValue()).booleanValue();
        aVar.K(-2024840359);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-2024840359, 0, -1, "com.vk.onboardingpromo.impl.ui.view.createVideoTransitionConfig.<anonymous> (OnboardingPromoContent.kt:64)");
        }
        float f3 = booleanValue2 ? 0 : f;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        pco pcoVar2 = new pco(f3);
        boolean J3 = aVar.J(wlp0Var);
        Object x2 = aVar.x();
        if (J3 || x2 == c0012a) {
            x2 = bbk0.b(new af80(wlp0Var));
            aVar.R(x2);
        }
        aVar.K(-51819700);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-51819700, 0, -1, "com.vk.onboardingpromo.impl.ui.view.createVideoTransitionConfig.<anonymous> (OnboardingPromoContent.kt:63)");
        }
        dtp0 d = jq2.d(400, 0, null, 6);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        wlp0.d c = ump0.c(wlp0Var, pcoVar, pcoVar2, d, jtp0Var, aVar, 0);
        jtp0 jtp0Var2 = rte0.e;
        if (wlp0Var.g()) {
            aVar.K(1666827533);
            aVar.j();
            B2 = z46Var.B();
        } else {
            aVar.K(1666573488);
            boolean J4 = aVar.J(wlp0Var);
            B2 = aVar.x();
            if (J4 || B2 == c0012a) {
                a = dak0.a.a();
                e = a != null ? a.e() : null;
                b = dak0.a.b(a);
                try {
                    Object B4 = z46Var.B();
                    dak0.a.d(a, b, e);
                    aVar.R(B4);
                    B2 = B4;
                } finally {
                }
            }
            aVar.j();
        }
        boolean booleanValue3 = ((Boolean) B2).booleanValue();
        aVar.K(-1487682422);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1487682422, 0, -1, "com.vk.onboardingpromo.impl.ui.view.createVideoTransitionConfig.<anonymous> (OnboardingPromoContent.kt:68)");
        }
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f5 = booleanValue3 ? 1.0f : 0.0f;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        Float valueOf = Float.valueOf(f5);
        boolean J5 = aVar.J(wlp0Var);
        Object x3 = aVar.x();
        if (J5 || x3 == c0012a) {
            x3 = bbk0.b(new bf80(wlp0Var));
            aVar.R(x3);
        }
        boolean booleanValue4 = ((Boolean) ((mtk0) x3).getValue()).booleanValue();
        aVar.K(-1487682422);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1487682422, 0, -1, "com.vk.onboardingpromo.impl.ui.view.createVideoTransitionConfig.<anonymous> (OnboardingPromoContent.kt:68)");
        }
        if (booleanValue4) {
            f4 = 1.0f;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        Float valueOf2 = Float.valueOf(f4);
        boolean J6 = aVar.J(wlp0Var);
        Object x4 = aVar.x();
        if (J6 || x4 == c0012a) {
            x4 = bbk0.b(new cf80(wlp0Var));
            aVar.R(x4);
        }
        aVar.K(372833615);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(372833615, 0, -1, "com.vk.onboardingpromo.impl.ui.view.createVideoTransitionConfig.<anonymous> (OnboardingPromoContent.kt:67)");
        }
        dtp0 d2 = jq2.d(400, 0, null, 6);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        ymt0 ymt0Var = new ymt0(c, ump0.c(wlp0Var, valueOf, valueOf2, d2, jtp0Var2, aVar, 0));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return ymt0Var;
    }
}
