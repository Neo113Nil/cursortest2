package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.cri;
import xsna.dt1;
import xsna.fn20;
import xsna.q630;

/* compiled from: MilkshakeCardScreenContent.kt */
/* loaded from: classes18.dex */
public final class fn20 {
    public static final fn20 a = new fn20();
    public static final ArrayList b = e43.a("Secondary", "Contrast", "Accent");

    /* compiled from: MilkshakeCardScreenContent.kt */
    public static final class a {
        public final wh50 a;
        public final wh50 b;
        public final wh50 c;

        public a() {
            Boolean bool = Boolean.FALSE;
            this.a = androidx.compose.runtime.k.b(bool);
            this.b = androidx.compose.runtime.k.b(bool);
            this.c = androidx.compose.runtime.k.b("Secondary");
        }

        public final boolean a() {
            return ((Boolean) ((zak0) this.b).getValue()).booleanValue();
        }

        public final boolean b() {
            return ((Boolean) ((zak0) this.a).getValue()).booleanValue();
        }
    }

    public static int e(String str) {
        int hashCode = str.hashCode();
        return hashCode != -502302942 ? hashCode != 1186369876 ? (hashCode == 1955373290 && str.equals("Accent")) ? R.attr.vk_ui_background_accent_themed : R.attr.vk_ui_background_negative : !str.equals("Secondary") ? R.attr.vk_ui_background_negative : R.attr.vk_ui_background_secondary : !str.equals("Contrast") ? R.attr.vk_ui_background_negative : R.attr.vk_ui_background_contrast_themed;
    }

    public final void a(a aVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a M = aVar2.M(-1014990782);
        int i2 = (M.J(aVar) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1014990782, i2, -1, "com.vk.design.demo.presentation.screens.card.MilkshakeCardScreenContent.CardSettings (MilkshakeCardScreenContent.kt:187)");
            }
            String str = (String) ((zak0) aVar.c).getValue();
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new eqq(aVar, 17);
                M.R(x);
            }
            y9i0.b("Background color", b, str, (izs) x, null, M, 6, 16);
            boolean a2 = aVar.a();
            boolean z2 = i3 == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new fgm(aVar, 27);
                M.R(x2);
            }
            eku0.d("Show outline", (gzs) x2, null, a2, null, false, false, M, 6, 116);
            boolean b2 = aVar.b();
            boolean z3 = i3 == 32;
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new hvz(aVar, 7);
                M.R(x3);
            }
            eku0.d("Show shadow", (gzs) x3, null, b2, null, false, false, M, 6, 116);
            aVar3 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new g06(this, aVar, i, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(a aVar, androidx.compose.runtime.a aVar2, int i) {
        long j;
        y18 y18Var;
        androidx.compose.runtime.a M = aVar2.M(1985110726);
        int i2 = (M.J(aVar) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1985110726, i2, -1, "com.vk.design.demo.presentation.screens.card.MilkshakeCardScreenContent.ComposeCardContent (MilkshakeCardScreenContent.kt:80)");
            }
            djn0.a(true, false, M, 438, 0);
            float f = aVar.b() ? 4.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            String str = (String) ((zak0) aVar.c).getValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-9586408, 48, -1, "com.vk.design.demo.presentation.screens.card.MilkshakeCardScreenContent.composeBackgroundColorFromName (MilkshakeCardScreenContent.kt:111)");
            }
            int hashCode = str.hashCode();
            if (hashCode == -502302942) {
                if (str.equals("Contrast")) {
                    M.K(-622596592);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var.getBackground().n;
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (aVar.a()) {
                    }
                    phu0.a(q630.a.a, null, j, 0L, y18Var, f, ohi.a, M, 1572870, 10);
                    if (androidx.compose.runtime.b.d()) {
                    }
                }
                M.K(-622592246);
                if (androidx.compose.runtime.b.d()) {
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                }
                j = ylu0Var2.getBackground().t;
                M.j();
                if (androidx.compose.runtime.b.d()) {
                }
                if (aVar.a()) {
                }
                phu0.a(q630.a.a, null, j, 0L, y18Var, f, ohi.a, M, 1572870, 10);
                if (androidx.compose.runtime.b.d()) {
                }
            } else if (hashCode != 1186369876) {
                if (hashCode == 1955373290 && str.equals("Accent")) {
                    M.K(-622594322);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var3.getBackground().d;
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (aVar.a()) {
                        M.K(1029472472);
                        M.j();
                        y18Var = null;
                    } else {
                        M.K(1029376031);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var4 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        y18Var = aqw.a(0.5f, ylu0Var4.getImage().a);
                        M.j();
                    }
                    phu0.a(q630.a.a, null, j, 0L, y18Var, f, ohi.a, M, 1572870, 10);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
                M.K(-622592246);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var22 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var22.getBackground().t;
                M.j();
                if (androidx.compose.runtime.b.d()) {
                }
                if (aVar.a()) {
                }
                phu0.a(q630.a.a, null, j, 0L, y18Var, f, ohi.a, M, 1572870, 10);
                if (androidx.compose.runtime.b.d()) {
                }
            } else {
                if (str.equals("Secondary")) {
                    M.K(-622598773);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var5 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var5.getBackground().x;
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (aVar.a()) {
                    }
                    phu0.a(q630.a.a, null, j, 0L, y18Var, f, ohi.a, M, 1572870, 10);
                    if (androidx.compose.runtime.b.d()) {
                    }
                }
                M.K(-622592246);
                if (androidx.compose.runtime.b.d()) {
                }
                ylu0 ylu0Var222 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                }
                j = ylu0Var222.getBackground().t;
                M.j();
                if (androidx.compose.runtime.b.d()) {
                }
                if (aVar.a()) {
                }
                phu0.a(q630.a.a, null, j, 0L, y18Var, f, ohi.a, M, 1572870, 10);
                if (androidx.compose.runtime.b.d()) {
                }
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ps7(this, aVar, i, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(2037972716);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2037972716, i, -1, "com.vk.design.demo.presentation.screens.card.MilkshakeCardScreenContent.Content (MilkshakeCardScreenContent.kt:63)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = androidx.compose.runtime.k.b(new a());
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            q630.a aVar2 = q630.a.a;
            q630 D = p490.D(s200.F(16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), p490.x(M), 14);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            a aVar4 = (a) wh50Var.getValue();
            fn20 fn20Var = a;
            fn20Var.b(aVar4, M, 390);
            f9t.e(txj0.h(aVar2, 16.0f), M, 6);
            fn20Var.d((a) wh50Var.getValue(), ((Boolean) M.r(vsx.b)).booleanValue(), M, 3078);
            f9t.e(txj0.c(aVar2, 1.0f), M, 6);
            fn20Var.a((a) wh50Var.getValue(), M, 390);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new e3(this, q630Var, i, 10);
        }
    }

    public final void d(final a aVar, final boolean z, androidx.compose.runtime.a aVar2, final int i) {
        androidx.compose.runtime.a M = aVar2.M(1886140723);
        int i2 = (M.J(aVar) ? 32 : 16) | i | (M.l(z) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1886140723, i2, -1, "com.vk.design.demo.presentation.screens.card.MilkshakeCardScreenContent.ViewCardContent (MilkshakeCardScreenContent.kt:119)");
            }
            djn0.a(false, true, M, 438, 0);
            q630 d = txj0.d(q630.a.a, 1.0f);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new dn20(aVar, 0);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean z3 = ((i2 & 896) == 256) | (i3 == 32);
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new qi00(z, aVar);
                M.R(x2);
            }
            ae2.a(48, 0, M, izsVar, (izs) x2, d);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(aVar, z, i) { // from class: xsna.en20
                public final /* synthetic */ fn20.a c;
                public final /* synthetic */ boolean d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(3079);
                    fn20.this.d(this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
