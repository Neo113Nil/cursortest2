package xsna;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CommunityProfileContentDefaultMixedShimmer.kt */
/* loaded from: classes17.dex */
public final class ugh {
    public static final void a(final float f, final int i, final int i2, final long j, androidx.compose.runtime.a aVar, final boolean z) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(440648350);
        if ((i2 & 6) == 0) {
            i3 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.n(f) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.l(z) ? 256 : 128;
        }
        int i4 = i2 & 3072;
        q630.a aVar2 = q630.a.a;
        if (i4 == 0) {
            i3 |= M.J(aVar2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.p(j) ? 16384 : 8192;
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            M.V();
            if ((i2 & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(440648350, i3, -1, "com.vk.community.design.compose.CommunityProfileContentDefaultAlbumsMixedShimmer (CommunityProfileContentDefaultMixedShimmer.kt:77)");
            }
            int i5 = ((Configuration) M.r(AndroidCompositionLocals_androidKt.a)).screenWidthDp;
            boolean o = M.o(i5);
            Object x = M.x();
            if (o || x == a.C0011a.a) {
                x = Integer.valueOf(((i5 - 16) / (i + 12)) + 1);
                M.R(x);
            }
            int intValue = ((Number) x).intValue();
            float f2 = 16;
            int i6 = 0;
            int i7 = 12;
            q630 r = p490.r(s200.H(aVar2, f2, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 4), p490.x(M), 12);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, r);
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
            M.K(672861195);
            int i8 = 0;
            while (i8 < intValue) {
                float f3 = i7;
                q630 v = txj0.v(s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), i);
                a.m mVar = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, i6);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, v);
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
                k9q0.w(M, D2, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode2), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c2, cri.a.d);
                float f4 = 3;
                int i9 = 0;
                float f5 = 8;
                q630 d = rte0.d(sua.d(f, txj0.f(s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 5), 1.0f), false), vog0.b(f5));
                e.a aVar5 = androidx.compose.ui.graphics.e.a;
                f9t.e(hr80.m(d, j, aVar5), M, 0);
                if (z) {
                    M.K(44734434);
                    f9t.e(hr80.m(rte0.d(txj0.h(txj0.f(aVar2, 1.0f), f5), vog0.b(f4)), j, aVar5), M, 0);
                    i9 = 0;
                    f9t.e(hr80.m(rte0.d(txj0.h(txj0.f(s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 0.6f), f5), vog0.b(f5)), j, aVar5), M, 0);
                } else {
                    M.K(40963718);
                }
                M.j();
                M.G();
                i8++;
                i6 = i9;
                i7 = 12;
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.sgh
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i2 | 1);
                    ugh.a(f, i, I, j, (androidx.compose.runtime.a) obj, z);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final q630 q630Var, final int i, float f, boolean z, final long j, final jai jaiVar, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        float f2;
        int i5;
        boolean z2;
        int i6;
        final float f3;
        final boolean z3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(872412703);
        if ((i2 & 6) == 0) {
            i4 = (M.J(q630Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.o(i) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            f2 = f;
            i4 |= M.n(f2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                z2 = z;
                i4 |= M.l(z2) ? 2048 : 1024;
                if ((i2 & 24576) == 0) {
                    i4 |= M.p(j) ? 16384 : 8192;
                }
                if ((196608 & i2) == 0) {
                    i4 |= M.y(jaiVar) ? 131072 : 65536;
                }
                i6 = i4;
                if (M.t(i6 & 1, (74899 & i6) != 74898)) {
                    M.V();
                    if ((i2 & 1) == 0 || M.i()) {
                        if (i7 != 0) {
                            f2 = 1.0f;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                    } else {
                        M.h();
                    }
                    boolean z4 = z2;
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(872412703, i6, -1, "com.vk.community.design.compose.CommunityProfileContentDefaultMixedShimmer (CommunityProfileContentDefaultMixedShimmer.kt:42)");
                    }
                    q630 f4 = txj0.f(q630Var, 1.0f);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, f4);
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
                    float f5 = 16;
                    q630.a aVar3 = q630.a.a;
                    float f6 = 4;
                    q630 d = rte0.d(txj0.h(txj0.f(s200.D(aVar3, f5), 0.4f), f5), vog0.b(f6));
                    e.a aVar4 = androidx.compose.ui.graphics.e.a;
                    f9t.e(hr80.m(d, j, aVar4), M, 0);
                    M.G();
                    int i8 = i6 >> 3;
                    int i9 = (i8 & 896) | (i8 & 14) | 3072 | (i8 & 112) | (57344 & i6);
                    float f7 = f2;
                    a(f7, i, i9, j, M, z4);
                    f9t.e(hr80.m(rte0.d(txj0.h(txj0.f(s200.D(aVar3, f5), 0.4f), f5), vog0.b(f6)), j, aVar4), M, 0);
                    if (cq.i((i6 >> 15) & 14, M, jaiVar)) {
                        androidx.compose.runtime.b.e();
                    }
                    f3 = f7;
                    z3 = z4;
                } else {
                    M.h();
                    f3 = f2;
                    z3 = z2;
                }
                s = M.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.tgh
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ugh.b(q630.this, i, f3, z3, j, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1), i3);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            z2 = z;
            if ((i2 & 24576) == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            i6 = i4;
            if (M.t(i6 & 1, (74899 & i6) != 74898)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        f2 = f;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        i6 = i4;
        if (M.t(i6 & 1, (74899 & i6) != 74898)) {
        }
        s = M.s();
        if (s != null) {
        }
    }
}
