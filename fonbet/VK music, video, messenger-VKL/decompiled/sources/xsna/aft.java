package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;
import xsna.us2;

/* compiled from: GamesCatalogWhatInsideModalBottomSheetContent.kt */
/* loaded from: classes17.dex */
public final class aft {
    public static final float a;
    public static final float c;
    public static final float f;
    public static final float g;
    public static final float b = 186;
    public static final float d = 24;
    public static final float e = 16;
    public static final float h = (float) 0.5d;
    public static final uog0 i = vog0.b(10);

    static {
        float f2 = 12;
        a = f2;
        float f3 = 20;
        c = f3;
        f = f2;
        g = f3;
    }

    public static final void a(String str, String str2, final String str3, gzs<s3q0> gzsVar, final izs<? super String, s3q0> izsVar, androidx.compose.runtime.a aVar, int i2) {
        String str4;
        int i3;
        androidx.compose.runtime.a aVar2;
        s8u0 s8u0Var;
        int i4;
        androidx.compose.runtime.a M = aVar.M(-1553190176);
        if ((i2 & 6) == 0) {
            str4 = str;
            i3 = (M.J(str4) ? 4 : 2) | i2;
        } else {
            str4 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(str3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.y(gzsVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.y(izsVar) ? 16384 : 8192;
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1553190176, i3, -1, "com.vk.games.presentation.components.ButtonSection (GamesCatalogWhatInsideModalBottomSheetContent.kt:232)");
            }
            q630.a aVar3 = q630.a.a;
            q630 H = s200.H(s200.F(a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
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
            String str5 = str4;
            int i5 = i3;
            bhu0.e(gzsVar, ButtonSize.Large, ButtonStyle.Primary, ButtonAppearance.Accent, txj0.f(aVar3, 1.0f), null, false, false, null, null, null, str5, null, null, null, null, false, null, null, null, M, ((i3 >> 9) & 14) | 28080, (i3 << 6) & 896, 0, 4190176);
            aVar2 = M;
            if (str2 == null || str2.length() == 0 || str3 == null || str3.length() == 0) {
                aVar2.K(-339892360);
            } else {
                aVar2.K(-331137960);
                int i6 = i5 & 896;
                boolean z = i6 == 256;
                Object x = aVar2.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z || x == c0012a) {
                    x = new i9z() { // from class: xsna.zet
                        @Override // xsna.i9z
                        public final void a(q8z q8zVar) {
                            izsVar.invoke(str3);
                        }
                    };
                    aVar2.R(x);
                }
                i9z i9zVar = (i9z) x;
                boolean J = ((i5 & 112) == 32) | (i6 == 256) | aVar2.J(i9zVar);
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
                    i4 = -1;
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                } else {
                    i4 = -1;
                }
                ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j2 = ylu0Var.getText().p;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, i4, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                yqv0.d(j, s200.H(txj0.f(aVar3, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 5), j2, 3, null, 0, false, 0, null, null, wuv0Var.i0, aVar2, 48, 0, 8120);
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
            s.d = new es3(i2, 1, str, str2, str3, gzsVar, izsVar);
        }
    }

    public static final void b(final nkx0 nkx0Var, final izs izsVar, final gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        cri.a.C2678a c2678a;
        LayoutNode.a aVar3;
        String str = nkx0Var.d;
        androidx.compose.runtime.a M = aVar.M(632792019);
        int i3 = i2 | (M.J(nkx0Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | 3072;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(632792019, i3, -1, "com.vk.games.presentation.components.GamesCatalogWhatInsideModalBottomSheetContent (GamesCatalogWhatInsideModalBottomSheetContent.kt:68)");
            }
            q630.a aVar4 = q630.a.a;
            q630 f2 = txj0.f(aVar4, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar5 = dt1.a.n;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar5, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f2);
            cri.h7.getClass();
            LayoutNode.a aVar6 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar6);
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
            cri.a.C2678a c2678a2 = cri.a.h;
            k9q0.t(M, c2678a2);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            long j = wlb0.h(M).getBackground().r;
            if (androidx.compose.runtime.b.d()) {
                c2678a = c2678a2;
                androidx.compose.runtime.b.f(1243383292, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel24> (VkSdkIcons.kt:226)");
            } else {
                c2678a = c2678a2;
            }
            lg90 b2 = or.b(M, 1833859693, R.drawable.vk_icon_cancel_24, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            cri.a.C2678a c2678a3 = c2678a;
            TopBar$Before.e a3 = TopBar$Before.e.a.a(b2, null, null, null, new l5g(l5g.c(14, wlb0.h(M).getIcon().f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), null, M, 1573256, 42);
            TopBar$Middle.Text a4 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(nkx0Var.a, null, null, null, null, M, 196608, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1974706104, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Dismiss24> (VkSdkIcons.kt:648)");
            }
            lg90 a5 = pg90.a(R.drawable.vk_icon_dismiss_24, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            muv0.h(a4, null, null, null, null, a3, d.a.a(d.c.C0760d.a.a(a5, null, gzsVar, null, new l5g(wlb0.h(M).getIcon().f), null, M, 1572872 | (i3 & 896), 42), null, null, null, M, 24576, 14), null, false, j, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 7582);
            q630 f3 = txj0.f(aVar4, 1.0f);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 D2 = p490.D(defpackage.j0.d(1.0f, f3, false), p490.x(M), 14);
            androidx.compose.foundation.layout.c a6 = androidx.compose.foundation.layout.b.a(mVar, aVar5, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, D2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                aVar3 = aVar6;
                M.I(aVar3);
            } else {
                aVar3 = aVar6;
                M.f();
            }
            k9q0.w(M, a6, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a3);
            k9q0.w(M, c3, dVar);
            if (str != null) {
                M.K(-1635408230);
                d(str, M, 0);
            } else {
                M.K(-1639437021);
            }
            M.j();
            q630 f4 = txj0.f(aVar4, 1.0f);
            float f5 = a;
            q630 F = s200.F(f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, f4);
            androidx.compose.foundation.layout.c a7 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(f5), aVar5, M, 6);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c4 = qri.c(M, F);
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
            k9q0.w(M, a7, cVar);
            k9q0.w(M, D4, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a3);
            k9q0.w(M, c4, dVar);
            M.K(730624354);
            Iterator it = nkx0Var.b.iterator();
            while (it.hasNext()) {
                c((mkx0) it.next(), M, 0);
            }
            M.j();
            M.G();
            M.G();
            a(nkx0Var.c, nkx0Var.e, nkx0Var.f, gzsVar, izsVar, M, ((i3 << 3) & 7168) | ((i3 << 9) & 57344));
            aVar2 = M;
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar4;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(izsVar, gzsVar, q630Var2, i2) { // from class: xsna.yet
                public final /* synthetic */ izs c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ q630 e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    aft.b(nkx0.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(mkx0 mkx0Var, androidx.compose.runtime.a aVar, int i2) {
        WebImage webImage;
        WebImageSize d2;
        androidx.compose.runtime.a M = aVar.M(1860287147);
        int i3 = (M.J(mkx0Var) ? 4 : 2) | i2;
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1860287147, i3, -1, "com.vk.games.presentation.components.GiftCard (GamesCatalogWhatInsideModalBottomSheetContent.kt:176)");
            }
            boolean M2 = dhr0.M();
            boolean J = M.J(mkx0Var.c) | M.l(M2);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                wpo0 wpo0Var = mkx0Var.c;
                if (!M2 || (webImage = wpo0Var.b) == null) {
                    webImage = wpo0Var.a;
                }
                x = webImage;
                M.R(x);
            }
            WebImage webImage2 = (WebImage) x;
            String str = (webImage2 == null || (d2 = webImage2.d()) == null) ? null : d2.b;
            q630 h2 = txj0.h(txj0.f(q630.a.a, 1.0f), b);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            phu0.a(h2, i, j, 0L, aqw.a(h, l5g.c(14, ylu0Var2.p().a, 0.08f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(302816675, new o1k(2, str, mkx0Var), M), M, 1572918, 40);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xk6(mkx0Var, i2, 5);
        }
    }

    public static final void d(String str, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.a M = aVar.M(1524180173);
        int i3 = (M.J(str) ? 4 : 2) | i2;
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1524180173, i3, -1, "com.vk.games.presentation.components.SubtitleSection (GamesCatalogWhatInsideModalBottomSheetContent.kt:124)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = on00.f(new Pair("lightning_icon", new r0x(new esa0(l2l0.l(16), l2l0.l(16), 4), hgi.a)));
                M.R(x);
            }
            Map map = (Map) x;
            boolean z = (i3 & 14) == 4;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                us2.b bVar = new us2.b();
                int i4 = 0;
                for (Object obj : drm0.c0(str, new String[]{"{lightning_icon}"}, 0, 6)) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        e43.t();
                        throw null;
                    }
                    bVar.g((String) obj);
                    if (i4 == 0) {
                        s0x.a(bVar, "lightning_icon", "�");
                    }
                    i4 = i5;
                }
                x2 = bVar.n();
                M.R(x2);
            }
            us2 us2Var = (us2) x2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().m;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.d(us2Var, s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, g, 1, txj0.f(q630.a.a, 1.0f)), j, 3, null, 0, false, 0, null, map, wuv0Var.E, M, 48, 0, 4024);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.v(str, i2, 7);
        }
    }
}
