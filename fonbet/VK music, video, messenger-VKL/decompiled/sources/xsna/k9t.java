package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: GamesCatalogAchievementsModalBottomSheetContent.kt */
/* loaded from: classes17.dex */
public final class k9t {
    public static final float a;
    public static final float b;
    public static final float d;
    public static final float c = 16;
    public static final float e = 32;
    public static final float f = 48;

    static {
        float f2 = 12;
        a = f2;
        b = f2;
        d = f2;
    }

    public static final void a(String str, String str2, final String str3, gzs<s3q0> gzsVar, final izs<? super String, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        String str4;
        int i2;
        androidx.compose.runtime.a aVar2;
        s8u0 s8u0Var;
        int i3;
        androidx.compose.runtime.a M = aVar.M(1767704164);
        if ((i & 6) == 0) {
            str4 = str;
            i2 = (M.J(str4) ? 4 : 2) | i;
        } else {
            str4 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(izsVar) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1767704164, i2, -1, "com.vk.games.presentation.components.ButtonSection (GamesCatalogAchievementsModalBottomSheetContent.kt:162)");
            }
            q630.a aVar3 = q630.a.a;
            q630 H = s200.H(s200.F(a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, H);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            int i4 = i2;
            bhu0.e(gzsVar, ButtonSize.Large, ButtonStyle.Primary, ButtonAppearance.Accent, txj0.f(aVar3, 1.0f), null, false, false, null, null, null, str4, null, null, null, null, false, null, null, null, M, ((i4 >> 9) & 14) | 28080, (i4 << 6) & 896, 0, 4190176);
            aVar2 = M;
            if (str2 == null || str3 == null) {
                aVar2.K(-1578435404);
            } else {
                aVar2.K(-1572450017);
                Object x = aVar2.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = new i9z() { // from class: xsna.j9t
                        @Override // xsna.i9z
                        public final void a(q8z q8zVar) {
                            izsVar.invoke(str3);
                        }
                    };
                    aVar2.R(x);
                }
                i9z i9zVar = (i9z) x;
                boolean J = ((i4 & 112) == 32) | ((i4 & 896) == 256) | aVar2.J(i9zVar);
                Object x2 = aVar2.x();
                if (J || x2 == c0012a) {
                    try {
                        s8u0Var = aqw.c(str2, str3, i9zVar);
                    } catch (Exception unused) {
                        s8u0Var = new s8u0(0);
                        s8u0Var.e(str2);
                    }
                    x2 = s8u0Var;
                    aVar2.R(x2);
                }
                us2 j = ((s8u0) x2).j(8, aVar2);
                if (androidx.compose.runtime.b.d()) {
                    i3 = -1;
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                } else {
                    i3 = -1;
                }
                ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j2 = ylu0Var.getText().p;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, i3, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                yqv0.d(j, s200.H(txj0.f(aVar3, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d, 5), j2, 3, null, 0, false, 0, null, null, wuv0Var.i0, aVar2, 48, 0, 8120);
                aVar2 = aVar2;
            }
            aVar2.j();
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new bxn(str, str2, str3, gzsVar, izsVar, i);
        }
    }

    public static final void b(n9t n9tVar, izs izsVar, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        n9t n9tVar2;
        q630 q630Var2;
        WebImage webImage;
        int i2;
        int i3;
        wpo0 wpo0Var = n9tVar.d;
        androidx.compose.runtime.a M = aVar.M(788706209);
        int i4 = i | (M.J(n9tVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | 3072;
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(788706209, i4, -1, "com.vk.games.presentation.components.GamesCatalogAchievementsModalBottomSheetContent (GamesCatalogAchievementsModalBottomSheetContent.kt:47)");
            }
            boolean M2 = dhr0.M();
            boolean J = M.J(wpo0Var) | M.l(M2);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = (!M2 || (webImage = wpo0Var.b) == null) ? wpo0Var.a : webImage;
                M.R(x);
            }
            WebImage webImage2 = (WebImage) x;
            WebImageSize d2 = webImage2 != null ? webImage2.d() : null;
            String str = d2 != null ? d2.b : null;
            boolean J2 = M.J(d2);
            Object x2 = M.x();
            if (J2 || x2 == c0012a) {
                x2 = Float.valueOf((d2 == null || (i2 = d2.d) <= 0 || (i3 = d2.c) <= 0) ? 1.0f : i2 / i3);
                M.R(x2);
            }
            float floatValue = ((Number) x2).floatValue();
            q630.a aVar2 = q630.a.a;
            q630 f2 = txj0.f(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar3 = dt1.a.n;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f2);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            String str2 = str;
            d(gzsVar, M, (i4 >> 6) & 14);
            q630 f3 = txj0.f(aVar2, 1.0f);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 D2 = p490.D(defpackage.j0.d(1.0f, f3, false), p490.x(M), 14);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, D2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            q630 d3 = sua.d(floatValue, txj0.f(aVar2, 1.0f), false);
            cp10 d4 = ja8.d(dt1.a.b, false);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c4 = qri.c(M, d3);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, d4, cVar);
            k9q0.w(M, D4, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            fwu0.c(ra8.a.a(txj0.f(aVar2, 1.0f)), null, str2, null, null, null, null, bgi.a, M, 100663296, 250);
            M.G();
            n9tVar2 = n9tVar;
            c(n9tVar2.a, n9tVar2.b, M, 0);
            M.G();
            a(n9tVar2.c, n9tVar2.e, n9tVar2.f, gzsVar, izsVar, M, ((i4 << 3) & 7168) | ((i4 << 9) & 57344));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            n9tVar2 = n9tVar;
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new j3c(n9tVar2, izsVar, gzsVar, q630Var2, i);
        }
    }

    public static final void c(String str, String str2, androidx.compose.runtime.a aVar, int i) {
        String str3;
        androidx.compose.runtime.a M = aVar.M(-610534715);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-610534715, i2, -1, "com.vk.games.presentation.components.TextSection (GamesCatalogAchievementsModalBottomSheetContent.kt:126)");
            }
            q630 m = hr80.m(txj0.f(q630.a.a, 1.0f), wlb0.h(M).getBackground().r, androidx.compose.ui.graphics.e.a);
            float f2 = f;
            float f3 = e;
            q630 H = s200.H(m, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, f2, 2);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(12), dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, H);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            yqv0.c(str, null, wlb0.h(M).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).z, M, i2 & 14, 0, 8122);
            str3 = str2;
            yqv0.c(str3, null, wlb0.h(M).getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).T, M, (i2 >> 3) & 14, 0, 8122);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            str3 = str2;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new q85(str, str3, i, 3);
        }
    }

    public static final void d(gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        gzs<s3q0> gzsVar2;
        androidx.compose.runtime.a M = aVar.M(-831881472);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-831881472, i2, -1, "com.vk.games.presentation.components.TopBarSection (GamesCatalogAchievementsModalBottomSheetContent.kt:109)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().r;
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1974706104, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Dismiss24> (VkSdkIcons.kt:648)");
            }
            lg90 a3 = pg90.a(R.drawable.vk_icon_dismiss_24, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            d.c.C0760d a4 = d.c.C0760d.a.a(a3, null, gzsVar, null, new l5g(ylu0Var2.getIcon().f), null, M, 1572872 | ((i2 << 6) & 896), 42);
            gzsVar2 = gzsVar;
            muv0.h(a2, null, null, null, null, null, d.a.a(a4, null, null, null, M, 24576, 14), null, false, j, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 7614);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            gzsVar2 = gzsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new gma(i, gzsVar2);
        }
    }
}
