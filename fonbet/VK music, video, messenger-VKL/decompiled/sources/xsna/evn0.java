package xsna;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.t0j0;
import xsna.ty6;
import xsna.y2j0;

/* compiled from: TabbarSettingsContent.kt */
/* loaded from: classes6.dex */
public final class evn0 {
    public static final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1431520628);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1431520628, i, -1, "com.vk.tabbar.settings.impl.compose.SubtitleText (TabbarSettingsContent.kt:100)");
            }
            q630 H = s200.H(q630.a.a, 40, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            String N = d370.N(R.string.tabbar_settings_subtitle, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.m0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(N, H, ylu0Var.getText().r, null, null, 0, 5, null, 0, false, 0, 0, null, frv0Var, aVar2, 48, 0, 8120);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new vv7(i, 9);
        }
    }

    public static final void b(y2j0 y2j0Var, t0j0 t0j0Var, boolean z, izs<? super jun0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        t0j0 t0j0Var2 = t0j0Var;
        androidx.compose.runtime.a M = aVar.M(-1969903582);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(y2j0Var) : M.y(y2j0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(t0j0Var2) : M.y(t0j0Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1969903582, i3, -1, "com.vk.tabbar.settings.impl.compose.TabbarSettingsContent (TabbarSettingsContent.kt:37)");
            }
            if (z && (y2j0Var instanceof y2j0.a)) {
                M.K(1035879916);
                List<sh00> list = ((y2j0.a) y2j0Var).g;
                int i4 = i3 & 7168;
                boolean z2 = i4 == 2048;
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z2 || x == c0012a) {
                    x = new v7b(izsVar, 3);
                    M.R(x);
                }
                izs izsVar2 = (izs) x;
                boolean z3 = (i4 == 2048) | ((i3 & 14) == 4 || ((i3 & 8) != 0 && M.y(y2j0Var)));
                Object x2 = M.x();
                if (z3 || x2 == c0012a) {
                    x2 = new com.vk.movika.sdk.base.flow.binding.j(27, y2j0Var, izsVar);
                    M.R(x2);
                }
                yvn0.b(list, izsVar2, (gzs) x2, null, M, 0);
            } else {
                M.K(1034124448);
            }
            M.j();
            q630.a aVar2 = q630.a.a;
            q630 d = txj0.d(aVar2, 1.0f);
            a.h hVar = androidx.compose.foundation.layout.a.g;
            dt1.a.getClass();
            ty6.a aVar3 = dt1.a.n;
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(hVar, aVar3, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            q630 u = m200.u(p490.D(n34.t(q9g.a(txj0.f(aVar2, 1.0f), 1.0f), dz5.I(0, 1, M, false), null), p490.x(M), 14), IntrinsicSize.Max);
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, u);
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
            k9q0.w(M, d2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 d3 = txj0.d(aVar2, 1.0f);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(hVar, aVar3, M, 6);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, d3);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            a(0, M);
            q630 a3 = q9g.a(txj0.f(aVar2, 1.0f), 1.0f);
            cp10 d4 = ja8.d(dt1.a.f, false);
            int hashCode4 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c4 = qri.c(M, a3);
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
            ur.d(hashCode4, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            if (y2j0Var instanceof y2j0.a) {
                M.K(-1296093211);
                jvn0.a((y2j0.a) y2j0Var, izsVar, M, (i3 >> 6) & 112);
                M.j();
            } else {
                M.K(-1296005543);
                lwn0.b(0, M);
                M.j();
            }
            M.G();
            M.G();
            M.G();
            t0j0Var2 = t0j0Var;
            if (t0j0Var2 instanceof t0j0.a) {
                M.K(-1617044566);
                pun0.c((t0j0.a) t0j0Var2, izsVar, M, (i3 >> 6) & 112);
            } else {
                M.K(-1620680618);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new dvn0(y2j0Var, t0j0Var2, z, izsVar, i);
        }
    }
}
