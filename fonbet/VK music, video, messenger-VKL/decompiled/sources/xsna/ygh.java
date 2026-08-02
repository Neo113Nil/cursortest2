package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CommunityProfileContentDefaultTileShimmer.kt */
/* loaded from: classes17.dex */
public final class ygh {
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(q630 q630Var, final int i, final int i2, float f, final long j, boolean z, androidx.compose.runtime.a aVar, final int i3, final int i4) {
        q630 q630Var2;
        int i5;
        float f2;
        int i6;
        final boolean z2;
        androidx.compose.runtime.f s;
        boolean z3;
        androidx.compose.runtime.a M = aVar.M(1859194195);
        int i7 = i4 & 1;
        if (i7 != 0) {
            i5 = i3 | 6;
            q630Var2 = q630Var;
        } else if ((i3 & 6) == 0) {
            q630Var2 = q630Var;
            i5 = (M.J(q630Var2) ? 4 : 2) | i3;
        } else {
            q630Var2 = q630Var;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= M.o(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= M.o(i2) ? 256 : 128;
        }
        int i8 = i4 & 8;
        if (i8 != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            f2 = f;
            i5 |= M.n(f2) ? 2048 : 1024;
            if ((i3 & 24576) == 0) {
                i5 |= M.p(j) ? 16384 : 8192;
            }
            i6 = i5 | 196608;
            int i9 = 0;
            if (M.t(i6 & 1, (74899 & i6) == 74898)) {
                M.h();
                z2 = z;
            } else {
                M.V();
                if ((i3 & 1) == 0 || M.i()) {
                    if (i7 != 0) {
                        q630Var2 = q630.a.a;
                    }
                    if (i8 != 0) {
                        f2 = 1.0f;
                    }
                    z3 = true;
                } else {
                    M.h();
                    z3 = z;
                }
                M.S();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1859194195, i6, -1, "com.vk.community.design.compose.CommunityProfileContentDefaultTileShimmer (CommunityProfileContentDefaultTileShimmer.kt:38)");
                }
                int i10 = 0;
                while (i10 < i) {
                    q630 f3 = txj0.f(q630Var2, 1.0f);
                    a.l lVar = androidx.compose.foundation.layout.a.a;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, i9);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, f3);
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
                    M.K(-767397381);
                    int i11 = 0;
                    while (i11 < i2) {
                        float f4 = 2;
                        int i12 = i10;
                        u890 n = s200.n(i11 == 0 ? 0 : 1, f4, i11 == i2 + (-1) ? 0 : 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                        if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                            szw.a("invalid weight; must be greater than zero");
                        }
                        q630 C = s200.C(sua.d(f2, txj0.f(new xpy(1.0f, true), 1.0f), false), n);
                        if (z3) {
                            C = rte0.d(C, vog0.b(f4));
                        }
                        f9t.e(hr80.m(C, j, androidx.compose.ui.graphics.e.a), M, 0);
                        i11++;
                        i10 = i12;
                    }
                    M.j();
                    M.G();
                    i10++;
                    i9 = 0;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                z2 = z3;
            }
            final float f5 = f2;
            s = M.s();
            if (s == null) {
                final q630 q630Var3 = q630Var2;
                s.d = new wzs() { // from class: xsna.xgh
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ygh.a(q630.this, i, i2, f5, j, z2, (androidx.compose.runtime.a) obj, ne7.I(i3 | 1), i4);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        f2 = f;
        if ((i3 & 24576) == 0) {
        }
        i6 = i5 | 196608;
        int i92 = 0;
        if (M.t(i6 & 1, (74899 & i6) == 74898)) {
        }
        final float f52 = f2;
        s = M.s();
        if (s == null) {
        }
    }
}
