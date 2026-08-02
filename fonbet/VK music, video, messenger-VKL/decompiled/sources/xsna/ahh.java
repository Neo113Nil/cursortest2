package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CommunityProfileContentDefaultWithImageShimmer.kt */
/* loaded from: classes17.dex */
public final class ahh {
    /* JADX WARN: Removed duplicated region for block: B:106:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(q630 q630Var, int i, long j, int i2, boolean z, androidx.compose.runtime.a aVar, final int i3, final int i4) {
        q630 q630Var2;
        int i5;
        int i6;
        long j2;
        int i7;
        int i8;
        int i9;
        boolean z2;
        final int i10;
        final int i11;
        androidx.compose.runtime.f s;
        int i12;
        androidx.compose.runtime.a M = aVar.M(768059303);
        int i13 = i4 & 1;
        if (i13 != 0) {
            i5 = i3 | 6;
            q630Var2 = q630Var;
        } else if ((i3 & 6) == 0) {
            q630Var2 = q630Var;
            i5 = (M.J(q630Var2) ? 4 : 2) | i3;
        } else {
            q630Var2 = q630Var;
            i5 = i3;
        }
        int i14 = i4 & 2;
        if (i14 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 = i;
            i5 |= M.o(i6) ? 32 : 16;
            if ((i3 & 384) != 0) {
                if ((i4 & 4) == 0) {
                    j2 = j;
                    if (M.p(j2)) {
                        i12 = 256;
                        i5 |= i12;
                    }
                } else {
                    j2 = j;
                }
                i12 = 128;
                i5 |= i12;
            } else {
                j2 = j;
            }
            i7 = i4 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i8 = i2;
                i5 |= M.o(i8) ? 2048 : 1024;
                i9 = i4 & 16;
                if (i9 != 0) {
                    i5 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    z2 = z;
                    i5 |= M.l(z2) ? 16384 : 8192;
                    if (M.t(i5 & 1, (i5 & 9363) == 9362)) {
                        M.h();
                        i10 = i6;
                        i11 = i8;
                    } else {
                        M.V();
                        int i15 = i3 & 1;
                        q630.a aVar2 = q630.a.a;
                        int i16 = 6;
                        if (i15 == 0 || M.i()) {
                            if (i13 != 0) {
                                q630Var2 = aVar2;
                            }
                            if (i14 != 0) {
                                i6 = 20;
                            }
                            if ((i4 & 4) != 0) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                i5 &= -897;
                                j2 = ylu0Var.c().a;
                            }
                            if (i7 != 0) {
                                i8 = 6;
                            }
                            if (i9 != 0) {
                                z2 = false;
                            }
                        } else {
                            M.h();
                            if ((i4 & 4) != 0) {
                                i5 &= -897;
                            }
                        }
                        M.S();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(768059303, i5, -1, "com.vk.community.design.compose.CommunityProfileContentDefaultWithImageShimmer (CommunityProfileContentDefaultWithImageShimmer.kt:35)");
                        }
                        int i17 = 0;
                        while (i17 < i6) {
                            float f = 16;
                            q630 f2 = txj0.f(s200.E(q630Var2, f, i16), 1.0f);
                            a.l lVar = androidx.compose.foundation.layout.a.a;
                            dt1.a.getClass();
                            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
                            int hashCode = Long.hashCode(n34.n(M));
                            sy90 D = M.D();
                            q630 c = qri.c(M, f2);
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
                            int i18 = i17;
                            cri.a.c cVar = cri.a.f;
                            k9q0.w(M, a, cVar);
                            cri.a.e eVar = cri.a.e;
                            k9q0.w(M, D, eVar);
                            Integer valueOf = Integer.valueOf(hashCode);
                            cri.a.b bVar = cri.a.g;
                            k9q0.w(M, valueOf, bVar);
                            cri.a.C2678a c2678a = cri.a.h;
                            k9q0.t(M, c2678a);
                            q630 q630Var3 = q630Var2;
                            cri.a.d dVar = cri.a.d;
                            k9q0.w(M, c, dVar);
                            q630 d = rte0.d(txj0.q(aVar2, 48), z2 ? vog0.a : vog0.b(i8));
                            e.a aVar4 = androidx.compose.ui.graphics.e.a;
                            q630.a aVar5 = aVar2;
                            f9t.e(hr80.m(d, j2, aVar4), M, 0);
                            float f3 = 12;
                            q630 H = s200.H(aVar5, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                            int i19 = i6;
                            int i20 = i8;
                            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
                            int hashCode2 = Long.hashCode(n34.n(M));
                            sy90 D2 = M.D();
                            q630 c2 = qri.c(M, H);
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
                            f9t.e(hr80.m(rte0.d(txj0.f(txj0.h(aVar5, f), 1.0f), vog0.b(4)), j2, aVar4), M, 0);
                            f9t.e(hr80.m(rte0.d(txj0.f(txj0.h(s200.H(aVar5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 8), 0.45f), vog0.b(3)), j2, aVar4), M, 0);
                            M.G();
                            M.G();
                            i17 = i18 + 1;
                            q630Var2 = q630Var3;
                            aVar2 = aVar5;
                            i6 = i19;
                            i8 = i20;
                            i16 = 6;
                        }
                        q630 q630Var4 = q630Var2;
                        int i21 = i6;
                        int i22 = i8;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630Var2 = q630Var4;
                        i10 = i21;
                        i11 = i22;
                    }
                    final boolean z3 = z2;
                    s = M.s();
                    if (s == null) {
                        final q630 q630Var5 = q630Var2;
                        final long j3 = j2;
                        s.d = new wzs() { // from class: xsna.zgh
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                ahh.a(q630.this, i10, j3, i11, z3, (androidx.compose.runtime.a) obj, ne7.I(i3 | 1), i4);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                z2 = z;
                if (M.t(i5 & 1, (i5 & 9363) == 9362)) {
                }
                final boolean z32 = z2;
                s = M.s();
                if (s == null) {
                }
            }
            i8 = i2;
            i9 = i4 & 16;
            if (i9 != 0) {
            }
            z2 = z;
            if (M.t(i5 & 1, (i5 & 9363) == 9362)) {
            }
            final boolean z322 = z2;
            s = M.s();
            if (s == null) {
            }
        }
        i6 = i;
        if ((i3 & 384) != 0) {
        }
        i7 = i4 & 8;
        if (i7 == 0) {
        }
        i8 = i2;
        i9 = i4 & 16;
        if (i9 != 0) {
        }
        z2 = z;
        if (M.t(i5 & 1, (i5 & 9363) == 9362)) {
        }
        final boolean z3222 = z2;
        s = M.s();
        if (s == null) {
        }
    }
}
