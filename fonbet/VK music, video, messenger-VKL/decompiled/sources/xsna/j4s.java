package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.e4s;
import xsna.q630;
import xsna.yjq0;

/* compiled from: FollowersModeSettings.kt */
/* loaded from: classes5.dex */
public final class j4s {
    public static final void a(boolean z, s8u0 s8u0Var, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1507609061);
        int i2 = (M.l(z) ? 4 : 2) | i | (M.y(s8u0Var) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1507609061, i2, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.followersmode.FollowersModeDescription (FollowersModeSettings.kt:107)");
            }
            q630.a aVar3 = q630.a.a;
            q630 c = ojc.c(txj0.j(60, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f)), z, null, null, gzsVar, 14);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            float f = 16;
            aVar2 = M;
            yqv0.d(s8u0Var.j(((i2 >> 3) & 14) | 8, M), s200.G(aVar3, f, 4, f, 10), 0L, 0, null, 0, false, 0, null, null, null, aVar2, 0, 0, 16380);
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
            s.d = new h4s(z, s8u0Var, gzsVar, i);
        }
    }

    public static final void b(gzs gzsVar, final yjq0.c cVar, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        gzs gzsVar2;
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(253649534);
        if ((i & 6) == 0) {
            gzsVar2 = gzsVar;
            i2 = (M.y(gzsVar2) ? 4 : 2) | i;
        } else {
            gzsVar2 = gzsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(cVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(253649534, i3, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.followersmode.FollowersModeSettings (FollowersModeSettings.kt:34)");
            }
            q630Var2 = q630.a.a;
            q630 d = rte0.d(s200.H(q630Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 7), vog0.b(20));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            int i4 = i3 & 896;
            c(i4, M, izsVar, ((Boolean) gzsVar2.invoke()).booleanValue() && cVar.b, cVar.a);
            e4s.a aVar3 = cVar.c;
            s8u0 a2 = aVar3.a();
            if (a2 == null) {
                M.K(-692965284);
            } else {
                M.K(-692965283);
                boolean booleanValue = ((Boolean) gzsVar2.invoke()).booleanValue();
                boolean y = M.y(aVar3) | (i4 == 256);
                Object x = M.x();
                if (y || x == a.C0011a.a) {
                    x = new com.vk.movika.sdk.base.ui.r0(11, izsVar, aVar3);
                    M.R(x);
                }
                a(booleanValue, a2, (gzs) x, M, 64);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final gzs gzsVar3 = gzsVar2;
            final q630 q630Var3 = q630Var2;
            s.d = new wzs() { // from class: xsna.g4s
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j4s.b(gzs.this, cVar, izsVar, q630Var3, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final int i, androidx.compose.runtime.a aVar, final izs izsVar, boolean z, boolean z2) {
        int i2;
        final boolean z3;
        final boolean z4 = z;
        androidx.compose.runtime.a M = aVar.M(409777729);
        if ((i & 6) == 0) {
            i2 = (M.l(z4) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(409777729, i2, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.followersmode.FollowersModeSwitch (FollowersModeSettings.kt:63)");
            }
            q630.a aVar2 = q630.a.a;
            q630 j = txj0.j(60, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f));
            if (!z4) {
                j = j.g(o19.a(aVar2, 0.65f));
            }
            a.h hVar = androidx.compose.foundation.layout.a.g;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(hVar, dt1.a.l, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, j);
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
            a.c cVar2 = androidx.compose.foundation.layout.a.e;
            float f = 16;
            q630 E = s200.E(aVar2, f, 10);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(cVar2, dt1.a.n, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, E);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            yqv0.c(d370.N(R.string.user_profile_edit_follow_button, 0, M), s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3, 7), wlb0.h(M).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).X, M, 48, 0, 8184);
            String N = d370.N(R.string.user_profile_edit_follow_button_more_info, 0, M);
            frv0 frv0Var = wlb0.l(M).m0;
            long j2 = wlb0.h(M).getText().f;
            int i3 = i2 & 896;
            boolean z5 = i3 == 256;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z5 || x == c0012a) {
                x = new px(izsVar, 1);
                M.R(x);
            }
            int i4 = i2;
            yqv0.c(N, ojc.c(aVar2, z, null, null, (gzs) x, 14), j2, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, 0, 0, 8184);
            M = M;
            M.G();
            q630 H = s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
            boolean z6 = i3 == 256;
            Object x2 = M.x();
            if (z6 || x2 == c0012a) {
                x2 = new m9a(izsVar, 2);
                M.R(x2);
            }
            z3 = z2;
            zov0.a(z3, (izs) x2, H, z, null, M, ((i4 >> 3) & 14) | 384 | ((i4 << 9) & 7168), 16);
            z4 = z;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            z3 = z2;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.i4s
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    j4s.c(ne7.I(i | 1), (androidx.compose.runtime.a) obj, izsVar, z4, z3);
                    return s3q0.a;
                }
            };
        }
    }
}
