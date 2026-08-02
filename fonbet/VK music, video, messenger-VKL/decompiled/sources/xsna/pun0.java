package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.tabbar.settings.impl.mvi.InteractSource;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.t0j0;

/* compiled from: TabbarSettingsBottomContent.kt */
/* loaded from: classes6.dex */
public final class pun0 {
    public static final void a(t0j0.a aVar, izs<? super jun0, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        izs<? super jun0, s3q0> izsVar2;
        int i2;
        a.C0011a.C0012a c0012a;
        float f;
        cri.a.d dVar;
        androidx.compose.runtime.a M = aVar2.M(1029126573);
        int i3 = (i & 6) == 0 ? i | (M.J(aVar) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i3 |= M.y(izsVar) ? 32 : 16;
        }
        int i4 = i3;
        if (M.t(i4 & 1, (i4 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1029126573, i4, -1, "com.vk.tabbar.settings.impl.compose.CurrentTabbar (TabbarSettingsBottomContent.kt:54)");
            }
            String N = d370.N(R.string.tabbar_settings_accessibility_info_panel, 0, M);
            q630.a aVar3 = q630.a.a;
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, 1, txj0.f(aVar3, 1.0f));
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar2 = cri.a.d;
            k9q0.w(M, c, dVar2);
            q630 f2 = txj0.f(aVar3, 1.0f);
            boolean J = M.J(N);
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (J || x == c0012a2) {
                i2 = i4;
                x = new zl1(N, 7);
                M.R(x);
            } else {
                i2 = i4;
            }
            float f3 = 68;
            q630 h = txj0.h(egi0.b(f2, false, (izs) x), f3);
            float f4 = 2;
            float f5 = 8;
            q630 b = a5j0.b(h, f4, vog0.b(f5), false, 0L, 0L, 28);
            if (androidx.compose.runtime.b.d()) {
                c0012a = c0012a2;
                f = f4;
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                c0012a = c0012a2;
                f = f4;
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(b, ylu0Var.getBackground().r, androidx.compose.ui.graphics.e.a);
            float f6 = (float) 0.33d;
            if (androidx.compose.runtime.b.d()) {
                dVar = dVar2;
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                dVar = dVar2;
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ja8.a(r18.a(f6, ylu0Var2.p().a, m, vog0.b(f5)), M, 0);
            q630 D2 = s200.D(txj0.h(txj0.f(aVar3, 1.0f), f3), f5);
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g, dt1.a.l, M, 54);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, D2);
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
            k9q0.w(M, a, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            M.K(-1450647087);
            int i5 = 0;
            for (Object obj : aVar.b) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    e43.t();
                    throw null;
                }
                uun0 uun0Var = (uun0) obj;
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                float f7 = f;
                q630 D4 = s200.D(f370.P(new xpy(1.0f, true), uun0Var.e ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), f7);
                dt1.a.getClass();
                cp10 d2 = ja8.d(dt1.a.f, false);
                int hashCode3 = Long.hashCode(n34.n(M));
                sy90 D5 = M.D();
                q630 c3 = qri.c(M, D4);
                cri.h7.getClass();
                LayoutNode.a aVar5 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar5);
                } else {
                    M.f();
                }
                k9q0.w(M, d2, cri.a.f);
                k9q0.w(M, D5, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode3), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c3, cri.a.d);
                InteractSource interactSource = aVar.c;
                boolean z = aVar.a;
                boolean o = ((i2 & 112) == 32) | M.o(i5);
                Object x2 = M.x();
                a.C0011a.C0012a c0012a3 = c0012a;
                if (o || x2 == c0012a3) {
                    x2 = new u920(izsVar, i5);
                    M.R(x2);
                }
                sun0.b(interactSource, z, uun0Var, (gzs) x2, M, 0);
                M.G();
                i5 = i6;
                f = f7;
                c0012a = c0012a3;
            }
            izsVar2 = izsVar;
            M.j();
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar2 = izsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bo7(aVar, izsVar2, i, 8);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, izs izsVar, boolean z) {
        int i2;
        androidx.compose.runtime.a aVar2;
        boolean z2 = z;
        androidx.compose.runtime.a M = aVar.M(-1262846166);
        if ((i & 6) == 0) {
            i2 = (M.l(z2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1262846166, i2, -1, "com.vk.tabbar.settings.impl.compose.SaveButton (TabbarSettingsBottomContent.kt:106)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            String N = d370.N(R.string.tabbar_settings_button_title, 0, M);
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            int i3 = i2;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            boolean z3 = (i3 & 112) == 32;
            Object x = M.x();
            if (z3 || x == a.C0011a.a) {
                x = new i97(izsVar, 7);
                M.R(x);
            }
            aVar2 = M;
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, f, null, false, false, null, null, null, N, null, null, null, null, z, null, null, null, aVar2, 28080, (i3 << 21) & 29360128, 0, 4059104);
            z2 = z;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new jup(z2, izsVar, i, 1);
        }
    }

    public static final void c(t0j0.a aVar, izs<? super jun0, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar2.M(1013776887);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1013776887, i2, -1, "com.vk.tabbar.settings.impl.compose.TabbarSettingsBottomContent (TabbarSettingsBottomContent.kt:38)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 H = s200.H(hr80.m(f, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16, 7);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            a(aVar, izsVar, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            b(i2 & 112, M, izsVar, aVar.a);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new at2(aVar, izsVar, i, 2);
        }
    }
}
