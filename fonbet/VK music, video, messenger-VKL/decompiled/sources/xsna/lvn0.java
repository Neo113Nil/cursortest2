package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.t0j0;
import xsna.y2j0;
import xsna.yqi;

/* compiled from: TabbarSettingsContentView.kt */
/* loaded from: classes6.dex */
public final class lvn0 extends i6v0<nwn0, jun0> {
    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        k((nwn0) ao50Var, izsVar, aVar, 512);
    }

    public final void h(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-349636783);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-349636783, i, -1, "com.vk.tabbar.settings.impl.compose.TabbarSettingsContentView.FullScreenLoader (TabbarSettingsContentView.kt:100)");
            }
            q630 d = txj0.d(q630.a.a, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, l5g.c(14, ylu0Var.getBackground().g, 0.5f), androidx.compose.ui.graphics.e.a);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new vo50(18);
                M.R(x);
            }
            q630 c = ojc.c(m, false, null, null, (gzs) x, 14);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            zfr0.d(SpinnerState.Loading, null, null, null, null, 0L, 0L, null, null, M, 6, 510);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qs1(this, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(yqi.a aVar, izs<? super jun0, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(1896526737);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1896526737, i2, -1, "com.vk.tabbar.settings.impl.compose.TabbarSettingsContentView.MainScreen (TabbarSettingsContentView.kt:65)");
            }
            y2j0 y2j0Var = (y2j0) jk50.d(aVar.a, y2j0.c.a, M, 48).getValue();
            t0j0 t0j0Var = (t0j0) jk50.d(aVar.b, t0j0.b.a, M, 48).getValue();
            yzt0<Boolean> yzt0Var = aVar.c;
            Boolean bool = Boolean.FALSE;
            wh50 d = jk50.d(yzt0Var, bool, M, 48);
            wh50 d2 = jk50.d(aVar.d, bool, M, 48);
            q630.a aVar3 = q630.a.a;
            float f = 12;
            q630 d3 = rte0.d(txj0.d(aVar3, 1.0f), vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d3, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            boolean booleanValue = ((Boolean) d.getValue()).booleanValue();
            int i3 = i2 & 112;
            j(i3 | 512 | (i2 & 896), M, izsVar, booleanValue);
            q630 F = s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f));
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 d4 = defpackage.j0.d(1.0f, F, true);
            cp10 d5 = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, d4);
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
            k9q0.w(M, d5, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            if (epx.f(y2j0Var, y2j0.b.a)) {
                M.K(1410671771);
                boolean z = i3 == 32;
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new f74(izsVar, 6);
                    M.R(x);
                }
                xun0.a((gzs) x, M, 0);
                M.j();
            } else {
                M.K(1410675140);
                evn0.b(y2j0Var, t0j0Var, ((Boolean) d2.getValue()).booleanValue(), izsVar, M, (i2 << 6) & 7168);
                M.j();
            }
            if ((y2j0Var instanceof y2j0.a) && ((y2j0.a) y2j0Var).a) {
                M.K(781631699);
                h(((i2 >> 6) & 14) | 8, M);
            } else {
                M.K(777393069);
            }
            M.j();
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yu70(this, aVar, izsVar, i);
        }
    }

    public final void j(final int i, androidx.compose.runtime.a aVar, final izs izsVar, boolean z) {
        androidx.compose.runtime.a aVar2;
        final boolean z2 = z;
        androidx.compose.runtime.a M = aVar.M(324599494);
        int i2 = i | (M.l(z2) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(324599494, i2, -1, "com.vk.tabbar.settings.impl.compose.TabbarSettingsContentView.SettingsToolbar (TabbarSettingsContentView.kt:117)");
            }
            q630.a aVar3 = q630.a.a;
            float f = 4;
            q630 D = s200.D(txj0.f(aVar3, 1.0f), f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
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
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D2, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630 q = txj0.q(aVar3, 48);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            int i3 = i2 & 112;
            boolean z3 = i3 == 32;
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new h74(izsVar, 6);
                M.R(x2);
            }
            q630 b = ojc.b(q, sg50Var, null, false, null, (gzs) x2, 28);
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, b);
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
            k9q0.w(M, d, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            pzu0.b(pg90.a(R.drawable.vk_icon_cancel_outline_28, 0, M), d370.N(R.string.close, 0, M), txj0.q(aVar3, 28), wlb0.h(M).getIcon().b, M, 392, 0);
            M.G();
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            yqv0.c(d370.N(R.string.tabbar_settings_title, 0, M), defpackage.j0.d(1.0f, F, true), wlb0.h(M).getText().m, null, null, 0, 5, null, 0, false, 0, 0, null, wlb0.l(M).C, M, 0, 0, 8120);
            q630 a2 = o19.a(aVar3, z ? 1.0f : 0.64f);
            String N = d370.N(R.string.tabbar_settings_reset_button, 0, M);
            ButtonSize buttonSize = ButtonSize.Medium;
            ButtonStyle buttonStyle = ButtonStyle.Tertiary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            boolean z4 = i3 == 32;
            Object x3 = M.x();
            if (z4 || x3 == c0012a) {
                x3 = new i74(izsVar, 3);
                M.R(x3);
            }
            bhu0.e((gzs) x3, buttonSize, buttonStyle, buttonAppearance, a2, null, false, false, null, null, null, N, null, null, null, null, z, null, null, null, M, X2.b.f, (i2 << 21) & 29360128, 0, 4059104);
            z2 = z;
            aVar2 = M;
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
            s.d = new wzs(z2, izsVar, i) { // from class: xsna.kvn0
                public final /* synthetic */ boolean c;
                public final /* synthetic */ izs d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(513);
                    lvn0.this.j(I, (androidx.compose.runtime.a) obj, this.d, this.c);
                    return s3q0.a;
                }
            };
        }
    }

    public final void k(nwn0 nwn0Var, izs<? super jun0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1378864419);
        int i2 = (M.J(nwn0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1378864419, i2, -1, "com.vk.tabbar.settings.impl.compose.TabbarSettingsContentView.ThemedContent (TabbarSettingsContentView.kt:53)");
            }
            int i3 = i2 & 896;
            wh50 d = d(yqi.b.a, new n0u0[]{nwn0Var.a}, M, 518 | i3);
            if (((yqi) d.getValue()) instanceof yqi.a) {
                M.K(-682421875);
                i((yqi.a) ((yqi) d.getValue()), izsVar, M, i3 | (i2 & 112) | 512);
            } else {
                M.K(-685013723);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new opq(i, 6, this, nwn0Var, izsVar);
        }
    }
}
