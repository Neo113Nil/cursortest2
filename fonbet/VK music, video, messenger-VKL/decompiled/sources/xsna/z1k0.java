package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: SlidingContent.kt */
/* loaded from: classes7.dex */
public final class z1k0 {
    public static final void a(final mc90 mc90Var, final llj lljVar, final jai jaiVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final q630 q630Var2 = q630Var;
        androidx.compose.runtime.a M = aVar.M(1692813994);
        if ((i & 6) == 0) {
            i2 = (M.J(mc90Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(lljVar) : M.y(lljVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(jaiVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var2) ? 2048 : 1024;
        }
        boolean z = false;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1692813994, i2, -1, "com.vk.video.ui.discovery.minimizable.recycler.design.compose.cards.base.Header (SlidingContent.kt:107)");
            }
            if (lljVar != null) {
                M.K(-884044299);
                Integer valueOf = Integer.valueOf(mc90Var.k());
                if ((i2 & 112) == 32 || ((i2 & 64) != 0 && M.y(lljVar))) {
                    z = true;
                }
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new arb0(lljVar, 17);
                    M.R(x);
                }
                xh2.a(valueOf, q630Var2, (izs) x, null, "headerAnimation", null, kai.c(1480641893, new w1k0(jaiVar, 0), M), M, ((i2 >> 6) & 112) | 1597440, 40);
                q630Var2 = q630Var2;
                M.j();
            } else {
                M.K(-883540611);
                jaiVar.invoke(q630Var2, Integer.valueOf(mc90Var.k()), M, Integer.valueOf((i2 & 896) | ((i2 >> 9) & 14)));
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.x1k0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    z1k0.a(mc90.this, lljVar, jaiVar, q630Var2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final int i, final int i2, final q630 q630Var, long j, long j2, float f, float f2, androidx.compose.runtime.a aVar, final int i3) {
        int i4;
        long j3;
        final long j4;
        final float f3;
        final float f4;
        long j5;
        int i5;
        float f5;
        float f6;
        int i6 = i;
        int i7 = i2;
        androidx.compose.runtime.a M = aVar.M(-1322407001);
        if ((i3 & 6) == 0) {
            i4 = (M.o(i6) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= M.o(i7) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= 8192;
        }
        int i8 = i4 | 1769472;
        if (M.t(i8 & 1, (599187 & i8) != 599186)) {
            M.V();
            if ((i3 & 1) == 0 || M.i()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j3 = ylu0Var.getIcon().j;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j5 = ylu0Var2.getIcon().l;
                i5 = i8 & (-64513);
                f5 = 4;
                f6 = 3;
            } else {
                M.h();
                i5 = i8 & (-64513);
                j3 = j;
                j5 = j2;
                f5 = f;
                f6 = f2;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1322407001, i5, -1, "com.vk.video.ui.discovery.minimizable.recycler.design.compose.cards.base.SimpleDotIndicator (SlidingContent.kt:143)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.e, dt1.a.l, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            M.K(-1152380484);
            int i9 = 0;
            while (i9 < i7) {
                q630.a aVar3 = q630.a.a;
                ja8.a(hr80.m(rte0.d(txj0.q(aVar3, f5), vog0.a), i9 == i6 ? j3 : j5, androidx.compose.ui.graphics.e.a), M, 0);
                if (i9 < i2 - 1) {
                    M.K(-1363775371);
                    mq.d(aVar3, f6, M, 0);
                } else {
                    M.K(-1369335841);
                    M.j();
                }
                i9++;
                i6 = i;
                i7 = i2;
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
            f3 = f5;
            f4 = f6;
            j4 = j5;
        } else {
            M.h();
            j3 = j;
            j4 = j2;
            f3 = f;
            f4 = f2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final long j6 = j3;
            s.d = new wzs() { // from class: xsna.y1k0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    z1k0.b(i, i2, q630Var, j6, j4, f3, f4, (androidx.compose.runtime.a) obj, ne7.I(i3 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final mc90 mc90Var, final jai jaiVar, final jai jaiVar2, final s890 s890Var, final llj lljVar, a0t a0tVar, androidx.compose.runtime.a aVar, final int i) {
        final a0t a0tVar2;
        a0t a0tVar3;
        androidx.compose.runtime.a M = aVar.M(1317822129);
        int i2 = i | (M.J(mc90Var) ? 4 : 2) | (M.J(s890Var) ? 16384 : 8192) | 1572864;
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                a0tVar3 = c4g0.f;
            } else {
                M.h();
                a0tVar3 = a0tVar;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1317822129, i2, -1, "com.vk.video.ui.discovery.minimizable.recycler.design.compose.cards.base.SlidingContent (SlidingContent.kt:54)");
            }
            float d = s890Var.d();
            float b = s890Var.b();
            q630.a aVar2 = q630.a.a;
            q630 H = s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, b, 5);
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
            q630 f = txj0.f(aVar2, 1.0f);
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            q630 H2 = s200.H(f, s890Var.c(layoutDirection), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, s200.r(s890Var, layoutDirection), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            ty6.b bVar2 = dt1.a.l;
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g, bVar2, M, 54);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, H2);
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
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            int i3 = i2 & 14;
            a(mc90Var, lljVar, jaiVar, new xpy(1.0f, false), M, i3 | 496);
            a0tVar3.invoke(Integer.valueOf(mc90Var.k()), Integer.valueOf(mc90Var.o()), aVar2, M, 3456);
            M.G();
            f9t.e(txj0.h(aVar2, kqu0.r), M, 0);
            nb90.a(mc90Var, txj0.h(aVar2, 36), null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, bVar2, null, false, null, null, null, null, kai.c(-1405405670, new w3b0(1, jaiVar2, s890Var), M), M, i3 | 1572912, 24576, 16316);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            a0tVar2 = a0tVar3;
        } else {
            M.h();
            a0tVar2 = a0tVar;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(jaiVar, jaiVar2, s890Var, lljVar, a0tVar2, i) { // from class: xsna.v1k0
                public final /* synthetic */ jai c;
                public final /* synthetic */ jai d;
                public final /* synthetic */ s890 e;
                public final /* synthetic */ llj f;
                public final /* synthetic */ a0t g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(200113);
                    z1k0.c(mc90.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
