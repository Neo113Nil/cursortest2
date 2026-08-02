package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: VkCheckCircle.kt */
/* loaded from: classes17.dex */
public final class uju0 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final gzs<s3q0> gzsVar, q630 q630Var, final boolean z, boolean z2, sg50 sg50Var, u1c u1cVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        gzs<s3q0> gzsVar2;
        int i3;
        q630 q630Var2;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        u1c u1cVar2;
        final sg50 sg50Var2;
        final q630 q630Var3;
        final u1c u1cVar3;
        androidx.compose.runtime.f s;
        q630 q630Var4;
        sg50 sg50Var3;
        u1c u1cVar4;
        androidx.compose.runtime.a aVar2;
        boolean z5;
        int i6;
        androidx.compose.runtime.a M = aVar.M(-753827217);
        if ((i & 6) == 0) {
            gzsVar2 = gzsVar;
            i3 = (M.y(gzsVar2) ? 4 : 2) | i;
        } else {
            gzsVar2 = gzsVar;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            if ((i & 384) != 0) {
                z3 = z;
                i3 |= M.l(z3) ? 256 : 128;
            } else {
                z3 = z;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z4 = z2;
                i3 |= M.l(z4) ? 2048 : 1024;
                i5 = i3 | 24576;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        u1cVar2 = u1cVar;
                        if (M.J(u1cVar2)) {
                            i6 = 131072;
                            i5 |= i6;
                        }
                    } else {
                        u1cVar2 = u1cVar;
                    }
                    i6 = 65536;
                    i5 |= i6;
                } else {
                    u1cVar2 = u1cVar;
                }
                if (M.t(i5 & 1, (74899 & i5) != 74898)) {
                    M.V();
                    if ((i & 1) == 0 || M.i()) {
                        q630 q630Var5 = i7 != 0 ? q630.a.a : q630Var2;
                        boolean z6 = i4 != 0 ? true : z4;
                        Object x = M.x();
                        if (x == a.C0011a.a) {
                            x = ir.h(M);
                        }
                        sg50 sg50Var4 = (sg50) x;
                        if ((i2 & 32) != 0) {
                            i5 &= -458753;
                            q630Var4 = q630Var5;
                            sg50Var3 = sg50Var4;
                            u1cVar4 = i35.g().a(0L, 0L, M, 31);
                        } else {
                            q630Var4 = q630Var5;
                            sg50Var3 = sg50Var4;
                            u1cVar4 = u1cVar2;
                        }
                        aVar2 = M;
                        z5 = z6;
                    } else {
                        M.h();
                        if ((i2 & 32) != 0) {
                            i5 &= -458753;
                        }
                        sg50Var3 = sg50Var;
                        q630Var4 = q630Var2;
                        u1cVar4 = u1cVar2;
                        aVar2 = M;
                        z5 = z4;
                    }
                    aVar2.S();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-753827217, i5, -1, "com.vk.core.compose.component.VkCheckCircle (VkCheckCircle.kt:51)");
                    }
                    int i8 = i5 << 9;
                    kh2.a(jgz.d(z3), gzsVar2, u1cVar4, 24, q630Var4, z5, true, sg50Var3, aVar2, ((i5 << 3) & 112) | 1575936 | ((i5 >> 9) & 896) | (57344 & i8) | ((i5 << 6) & 458752) | (29360128 & i8), 0);
                    z4 = z5;
                    M = aVar2;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    u1cVar3 = u1cVar4;
                    q630Var3 = q630Var4;
                    sg50Var2 = sg50Var3;
                } else {
                    M.h();
                    sg50Var2 = sg50Var;
                    q630Var3 = q630Var2;
                    u1cVar3 = u1cVar2;
                }
                final boolean z7 = z4;
                s = M.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.sju0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            uju0.a(gzs.this, q630Var3, z, z7, sg50Var2, u1cVar3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            z4 = z2;
            i5 = i3 | 24576;
            if ((196608 & i) == 0) {
            }
            if (M.t(i5 & 1, (74899 & i5) != 74898)) {
            }
            final boolean z72 = z4;
            s = M.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z4 = z2;
        i5 = i3 | 24576;
        if ((196608 & i) == 0) {
        }
        if (M.t(i5 & 1, (74899 & i5) != 74898)) {
        }
        final boolean z722 = z4;
        s = M.s();
        if (s != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, final gzs<s3q0> gzsVar, q630 q630Var, final boolean z, String str2, boolean z2, boolean z3, androidx.compose.runtime.a aVar, final int i, final int i2) {
        String str3;
        int i3;
        final boolean z4;
        int i4;
        androidx.compose.runtime.a aVar2;
        final boolean z5;
        final String str4;
        final q630 q630Var2;
        androidx.compose.runtime.f s;
        String str5;
        androidx.compose.runtime.a M = aVar.M(1299341694);
        int i5 = i | 384;
        if ((i & 3072) == 0) {
            i5 |= M.l(z) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i5 |= 24576;
        } else if ((i & 24576) == 0) {
            str3 = str2;
            i5 |= M.J(str3) ? 16384 : 8192;
            i3 = i2 & 32;
            if (i3 == 0) {
                i5 |= 196608;
            } else if ((196608 & i) == 0) {
                z4 = z2;
                i5 |= M.l(z4) ? 131072 : 65536;
                i4 = i5 | 1572864;
                if (M.t(i4 & 1, (599187 & i4) != 599186)) {
                    if (i6 != 0) {
                        str3 = null;
                    }
                    boolean z6 = i3 != 0 ? true : z4;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1299341694, i4, -1, "com.vk.core.compose.component.VkCheckCircleItem (VkCheckCircle.kt:83)");
                    }
                    q630.a aVar3 = q630.a.a;
                    boolean z7 = z6;
                    z4 = z7;
                    q630 C = s200.C(d1p0.b(txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((pco) i35.g().c(str3 != null, M).getValue()).b, 1, txj0.f(aVar3, 1.0f)), jgz.d(z), z7, new plg0(1), gzsVar, 8), i35.g().a);
                    Object x = M.x();
                    if (x == a.C0011a.a) {
                        x = new dl70(28);
                        M.R(x);
                    }
                    q630 b = egi0.b(C, true, (izs) x);
                    dt1.a.getClass();
                    ty6.b bVar = dt1.a.l;
                    androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, bVar, M, 48);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, b);
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
                    cri.a.b bVar2 = cri.a.g;
                    k9q0.w(M, valueOf, bVar2);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(M, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(M, c, dVar);
                    M.K(84126112);
                    M.j();
                    String str6 = str3;
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    float f = 2;
                    q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 1, new xpy(1.0f, true));
                    androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.i(f, bVar), dt1.a.n, M, 54);
                    int hashCode2 = Long.hashCode(n34.n(M));
                    sy90 D2 = M.D();
                    q630 c2 = qri.c(M, F);
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
                    k9q0.w(M, D2, eVar);
                    ur.d(hashCode2, M, bVar2, M, c2678a);
                    k9q0.w(M, c2, dVar);
                    boolean z8 = !z4;
                    yqv0.c(str, null, zjq.g(wlb0.h(M).getText().m, z8), null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).X, M, 6, 0, 8186);
                    androidx.compose.runtime.a aVar5 = M;
                    if (str6 != null) {
                        aVar5.K(2063729141);
                        yqv0.c(str6, null, zjq.g(wlb0.h(aVar5).getText().p, z8), null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar5).m0, aVar5, (i4 >> 12) & 14, 0, 8186);
                        str5 = str6;
                        aVar5 = aVar5;
                    } else {
                        str5 = str6;
                        aVar5.K(2059571018);
                    }
                    aVar5.j();
                    aVar5.G();
                    aVar5.K(88572411);
                    f9t.e(txj0.v(aVar3, kqu0.v), aVar5, 0);
                    a(gzsVar, null, z, z4, null, null, aVar5, ((i4 >> 3) & 910) | ((i4 >> 6) & 7168), 50);
                    aVar2 = aVar5;
                    if (gp.d(aVar2)) {
                        androidx.compose.runtime.b.e();
                    }
                    q630Var2 = aVar3;
                    str4 = str5;
                    z5 = true;
                } else {
                    aVar2 = M;
                    aVar2.h();
                    z5 = z3;
                    str4 = str3;
                    q630Var2 = q630Var;
                }
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.tju0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            uju0.b(str, gzsVar, q630Var2, z, str4, z4, z5, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            z4 = z2;
            i4 = i5 | 1572864;
            if (M.t(i4 & 1, (599187 & i4) != 599186)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        str3 = str2;
        i3 = i2 & 32;
        if (i3 == 0) {
        }
        z4 = z2;
        i4 = i5 | 1572864;
        if (M.t(i4 & 1, (599187 & i4) != 599186)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }
}
