package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CommunityProfileContentDefaultAlbumsShimmer.kt */
/* loaded from: classes17.dex */
public final class rgh {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final q630 q630Var, float f, final int i, final int i2, final long j, androidx.compose.runtime.a aVar, final int i3, final int i4) {
        int i5;
        float f2;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(669300655);
        int i6 = 2;
        if ((i3 & 6) == 0) {
            i5 = (M.J(q630Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i7 = i4 & 2;
        if (i7 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            f2 = f;
            i5 |= M.n(f2) ? 32 : 16;
            if ((i3 & 384) == 0) {
                i5 |= M.o(i) ? 256 : 128;
            }
            if ((i3 & 3072) == 0) {
                i5 |= M.o(i2) ? 2048 : 1024;
            }
            if ((i3 & 24576) == 0) {
                i5 |= M.p(j) ? 16384 : 8192;
            }
            int i8 = 0;
            boolean z = true;
            if (M.t(i5 & 1, (i5 & 9363) == 9362)) {
                M.h();
            } else {
                M.V();
                float f3 = 1.0f;
                if ((i3 & 1) != 0 && !M.i()) {
                    M.h();
                } else if (i7 != 0) {
                    f2 = 1.0f;
                }
                M.S();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(669300655, i5, -1, "com.vk.community.design.compose.CommunityProfileContentDefaultAlbumsShimmer (CommunityProfileContentDefaultAlbumsShimmer.kt:36)");
                }
                int i9 = 0;
                while (i9 < i) {
                    q630 F = s200.F(10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i6, txj0.f(q630Var, f3));
                    a.l lVar = androidx.compose.foundation.layout.a.a;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, i8);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, F);
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
                    M.K(227130817);
                    int i10 = 0;
                    while (i10 < i2) {
                        if (f3 <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                            szw.a("invalid weight; must be greater than zero");
                        }
                        float f4 = 8;
                        q630 E = s200.E(new xpy(f3, z), 6, f4);
                        a.m mVar = androidx.compose.foundation.layout.a.c;
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
                        int hashCode2 = Long.hashCode(n34.n(M));
                        sy90 D2 = M.D();
                        q630 c2 = qri.c(M, E);
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
                        k9q0.w(M, Integer.valueOf(hashCode2), cri.a.g);
                        k9q0.t(M, cri.a.h);
                        k9q0.w(M, c2, cri.a.d);
                        q630.a aVar4 = q630.a.a;
                        q630 d = rte0.d(sua.d(f2, txj0.f(aVar4, 1.0f), false), vog0.b(f4));
                        e.a aVar5 = androidx.compose.ui.graphics.e.a;
                        f9t.e(hr80.m(d, j, aVar5), M, 0);
                        f9t.e(hr80.m(rte0.d(txj0.h(txj0.f(s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), f4), vog0.b(3)), j, aVar5), M, 0);
                        f9t.e(hr80.m(rte0.d(txj0.h(txj0.f(s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 0.5f), f4), vog0.b(f4)), j, aVar5), M, 0);
                        M.G();
                        i10++;
                        f3 = 1.0f;
                        z = true;
                    }
                    M.j();
                    M.G();
                    i9++;
                    i8 = 0;
                    i6 = 2;
                    z = true;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            s = M.s();
            if (s == null) {
                final float f5 = f2;
                s.d = new wzs() { // from class: xsna.qgh
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        rgh.a(q630.this, f5, i, i2, j, (androidx.compose.runtime.a) obj, ne7.I(i3 | 1), i4);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        f2 = f;
        if ((i3 & 384) == 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        int i82 = 0;
        boolean z2 = true;
        if (M.t(i5 & 1, (i5 & 9363) == 9362)) {
        }
        s = M.s();
        if (s == null) {
        }
    }
}
