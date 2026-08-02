package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: Preview.kt */
/* loaded from: classes5.dex */
public final class s4d0 {
    public static final void a(final long j, final long j2, final agw agwVar, final boolean z, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1998812444);
        if ((i & 6) == 0) {
            i2 = (M.p(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.p(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(agwVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1998812444, i2, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.AvatarAndOverlay (Preview.kt:43)");
            }
            ua8.a(q630Var, null, false, kai.c(950021966, new yzs() { // from class: xsna.q4d0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    long c;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(950021966, intValue, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.AvatarAndOverlay.<anonymous> (Preview.kt:45)");
                        }
                        final float f = 2;
                        final boolean z2 = z;
                        final float f2 = z2 ? 20 : f;
                        long j3 = j;
                        if (z2) {
                            c = rco.c(j3, (Float.floatToRawIntBits(1 + 4 + 46.0f) & 4294967295L) | (Float.floatToRawIntBits(0) << 32));
                        } else {
                            c = rco.c(j3, (Float.floatToRawIntBits(1 + f + 28.0f) & 4294967295L) | (Float.floatToRawIntBits(0) << 32));
                        }
                        final long j4 = c;
                        final long j5 = j2;
                        final agw agwVar2 = agwVar;
                        rrv0.d(null, null, null, null, kai.c(-206702647, new wzs() { // from class: xsna.p4d0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj4, Object obj5) {
                                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-206702647, intValue2, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.AvatarAndOverlay.<anonymous>.<anonymous> (Preview.kt:55)");
                                    }
                                    long j6 = j4;
                                    float b = rco.b(j6);
                                    float f3 = f / 2;
                                    float a = rco.a(j6) - f3;
                                    q630.a aVar4 = q630.a.a;
                                    q630 D = s200.D(kci.l(aVar4, a, b - f3), f3);
                                    dt1.a.getClass();
                                    ty6 ty6Var = dt1.a.b;
                                    cp10 d = ja8.d(ty6Var, false);
                                    int hashCode = Long.hashCode(n34.n(aVar3));
                                    sy90 D2 = aVar3.D();
                                    q630 c2 = qri.c(aVar3, D);
                                    cri.h7.getClass();
                                    LayoutNode.a aVar5 = cri.a.b;
                                    if (aVar3.N() == null) {
                                        n34.r();
                                        throw null;
                                    }
                                    aVar3.H();
                                    if (aVar3.L()) {
                                        aVar3.I(aVar5);
                                    } else {
                                        aVar3.f();
                                    }
                                    cri.a.c cVar = cri.a.f;
                                    k9q0.w(aVar3, d, cVar);
                                    cri.a.e eVar = cri.a.e;
                                    k9q0.w(aVar3, D2, eVar);
                                    Integer valueOf = Integer.valueOf(hashCode);
                                    cri.a.b bVar = cri.a.g;
                                    k9q0.w(aVar3, valueOf, bVar);
                                    cri.a.C2678a c2678a = cri.a.h;
                                    k9q0.t(aVar3, c2678a);
                                    cri.a.d dVar = cri.a.d;
                                    k9q0.w(aVar3, c2, dVar);
                                    q630 d2 = rte0.d(txj0.v(aVar4, uco.c(j5)), vog0.b(f2));
                                    cp10 d3 = ja8.d(ty6Var, false);
                                    int hashCode2 = Long.hashCode(n34.n(aVar3));
                                    sy90 D3 = aVar3.D();
                                    q630 c3 = qri.c(aVar3, d2);
                                    if (aVar3.N() == null) {
                                        n34.r();
                                        throw null;
                                    }
                                    aVar3.H();
                                    if (aVar3.L()) {
                                        aVar3.I(aVar5);
                                    } else {
                                        aVar3.f();
                                    }
                                    k9q0.w(aVar3, d3, cVar);
                                    k9q0.w(aVar3, D3, eVar);
                                    ur.d(hashCode2, aVar3, bVar, aVar3, c2678a);
                                    k9q0.w(aVar3, c3, dVar);
                                    boolean z3 = z2;
                                    agw agwVar3 = agwVar2;
                                    if (z3) {
                                        aVar3.K(1394687725);
                                        s4d0.b(agwVar3, null, aVar3, 0);
                                        aVar3.j();
                                    } else {
                                        aVar3.K(1394792908);
                                        s4d0.c(agwVar3, ra8.a.b(aVar4, dt1.a.h), aVar3, 0);
                                        aVar3.j();
                                    }
                                    if (kr.f(aVar3)) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar3.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar2), aVar2, 24576, 15);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i2 >> 12) & 14) | 3072, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.r4d0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s4d0.a(j, j2, agwVar, z, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(agw agwVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        lg90 lg90Var;
        androidx.compose.runtime.a M = aVar.M(-1584478303);
        int i2 = i | (M.y(agwVar) ? 4 : 2) | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1584478303, i2, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.MobileAvatarOverlay (Preview.kt:86)");
            }
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630Var2 = q630.a.a;
            q630 c = qri.c(M, q630Var2);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            ty6 ty6Var2 = dt1.a.i;
            ra8 ra8Var = ra8.a;
            eq5.a(0, 48, 0, M, txj0.h(ra8Var.b(q630Var2, ty6Var2), 62));
            boolean J = M.J(agwVar);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = agwVar != null ? new rc7(agwVar) : null;
                M.R(x);
            }
            rc7 rc7Var = (rc7) x;
            q630 H = s200.H(ra8Var.b(q630Var2, ty6Var2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, 7);
            cp10 d2 = ja8.d(ty6Var, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, H);
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
            k9q0.w(M, d2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            float f = 92;
            float f2 = 4;
            if (rc7Var == null) {
                M.K(-44103684);
                qzu0.a.getClass();
                lg90 m = qzu0.m(M);
                M.j();
                lg90Var = m;
            } else {
                M.K(-1367193712);
                M.j();
                lg90Var = null;
            }
            wtd0.a(rc7Var, f, f2, null, lg90Var, M, 33208, 8);
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new p70(agwVar, q630Var2, i, 3);
        }
    }

    public static final void c(agw agwVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        lg90 lg90Var;
        androidx.compose.runtime.a M = aVar.M(-51869237);
        int i2 = (M.y(agwVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-51869237, i2, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.WebAvatarOverlay (Preview.kt:113)");
            }
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d = ja8.d(ty6Var, false);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            ty6 ty6Var2 = dt1.a.h;
            ra8 ra8Var = ra8.a;
            q630.a aVar3 = q630.a.a;
            eq5.a(0, 48, 0, M, txj0.h(ra8Var.b(aVar3, ty6Var2), 36));
            boolean J = M.J(agwVar);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = agwVar != null ? new rc7(agwVar) : null;
                M.R(x);
            }
            rc7 rc7Var = (rc7) x;
            float f = 2;
            q630 H = s200.H(aVar3, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, 6);
            cp10 d2 = ja8.d(ty6Var, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, H);
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
            k9q0.w(M, d2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 b = ra8Var.b(aVar3, ty6Var2);
            float f2 = 56;
            if (rc7Var == null) {
                M.K(1080920462);
                qzu0.a.getClass();
                lg90 m = qzu0.m(M);
                M.j();
                lg90Var = m;
            } else {
                M.K(-851183554);
                M.j();
                lg90Var = null;
            }
            wtd0.a(rc7Var, f2, f, b, lg90Var, M, 33208, 0);
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new r85(agwVar, q630Var, i, 8);
        }
    }
}
