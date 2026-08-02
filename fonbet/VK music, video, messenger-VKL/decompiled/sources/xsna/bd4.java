package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import kotlin.Pair;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.dz40;
import xsna.gfp0;
import xsna.q630;

/* compiled from: AudioBookActionsPanel.kt */
/* loaded from: classes3.dex */
public final class bd4 {
    public static final long a = l2l0.l(21);

    public static final void a(gfp0.a aVar, dz40.a aVar2, izs izsVar, androidx.compose.runtime.a aVar3, int i) {
        izs izsVar2;
        androidx.compose.runtime.a aVar4;
        gfp0.a aVar5;
        dz40.a aVar6;
        int i2;
        androidx.compose.runtime.a M = aVar3.M(1580583041);
        int i3 = (M.J(aVar) ? 4 : 2) | i | (M.J(aVar2) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1580583041, i3, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.AudioBookActionsPanel (AudioBookActionsPanel.kt:46)");
            }
            if (aVar.a()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new br0(i, 1, aVar, aVar2, izsVar);
                    return;
                }
                return;
            }
            aVar6 = aVar2;
            i2 = i;
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar7 = q630.a.a;
            q630 c = qri.c(M, aVar7);
            cri.h7.getClass();
            LayoutNode.a aVar8 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar8);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            aVar4 = M;
            int i4 = i3 & 14;
            int i5 = (i3 << 3) & 7168;
            izsVar2 = izsVar;
            b(aVar, aVar6.d, aVar6.e, izsVar2, null, aVar4, i4 | i5);
            aVar5 = aVar;
            if (aVar6.d) {
                aVar4.K(764962539);
            } else {
                aVar4.K(767445670);
                f9t.e(txj0.h(aVar7, 16), aVar4, 6);
                wh2.a(i5 | 384, aVar4, aVar6.a, izsVar2, null, aVar6.b, false, aVar6.c);
                aVar4 = aVar4;
            }
            aVar4.j();
            aVar4.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar2 = izsVar;
            aVar4 = M;
            aVar5 = aVar;
            aVar6 = aVar2;
            i2 = i;
            aVar4.h();
        }
        androidx.compose.runtime.f s2 = aVar4.s();
        if (s2 != null) {
            s2.d = new xc4(i2, 0, aVar5, aVar6, izsVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final gfp0.a aVar, final boolean z, final boolean z2, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar2, final int i) {
        int i2;
        androidx.compose.runtime.a aVar3;
        final q630 q630Var2;
        cri.a.C2678a c2678a;
        int i3;
        androidx.compose.runtime.a M = aVar2.M(-815206910);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        int i4 = i2 | 24576;
        if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-815206910, i4, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.ChapterInfo (AudioBookActionsPanel.kt:77)");
            }
            q630.a aVar4 = q630.a.a;
            q630 f = txj0.f(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar4), 1.0f);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(12, dt1.a.o), dt1.a.l, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            k9q0.w(M, c, dVar);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                c2678a = c2678a2;
                x = androidx.compose.runtime.k.b(new q9x(0L));
                M.R(x);
            } else {
                c2678a = c2678a2;
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                long j = a;
                x2 = on00.f(new Pair("explicit", new r0x(new esa0(j, j, 6), nr2.b)));
                M.R(x2);
            }
            Map map = (Map) x2;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f, true);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new yc4(0, wh50Var);
                M.R(x3);
            }
            q630 z3 = sv1.z(xpyVar, (izs) x3);
            boolean z4 = (i4 & 7168) == 2048;
            Object x4 = M.x();
            if (z4 || x4 == c0012a) {
                i3 = 0;
                x4 = new zc4(izsVar, 0);
                M.R(x4);
            } else {
                i3 = 0;
            }
            q630 c2 = ojc.c(z3, false, null, null, (gzs) x4, 15);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, i3);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, c2);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            float f2 = 10;
            eg10.a(z3r0.g(aVar.c, aVar.e ? "explicit" : null, M, 0), ((q9x) wh50Var.getValue()).a, ahn.E(s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), "title"), 0L, a, 0L, 0L, 0, false, map, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, M, 24960, 491496);
            q630 E = ahn.E(s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 5), "artistTitle");
            String str = aVar.d;
            long j2 = ((q9x) wh50Var.getValue()).a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            eg10.b(str, j2, E, l5g.c(14, l5g.d, 0.6f), 0, 0, false, 0, wuv0Var.m0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, M, 3456, 7152);
            aVar3 = M;
            aVar3.G();
            if (z) {
                aVar3.K(1437706790);
                yzj0.a(((i4 >> 9) & 14) | ((i4 >> 3) & 112), aVar3, izsVar, null, z2);
                aVar3.j();
            } else {
                aVar3.K(1437876267);
                y830.a(izsVar, aVar3, (i4 >> 9) & 14);
                aVar3.j();
            }
            aVar3.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar4;
        } else {
            aVar3 = M;
            aVar3.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ad4
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bd4.b(gfp0.a.this, z, z2, izsVar, q630Var2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
