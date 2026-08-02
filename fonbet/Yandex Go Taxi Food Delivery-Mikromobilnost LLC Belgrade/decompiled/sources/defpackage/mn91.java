package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.care.ui.e;

/* loaded from: classes11.dex */
public abstract class mn91 {
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d1, code lost:
    
        if (defpackage.jl40.l(r14.Q(), java.lang.Integer.valueOf(r7)) == false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, String str2, String str3, String str4, bu8 bu8Var, e eVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1196136470);
        dmw0 dmw0Var = btsVar.a;
        int i3 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.k(str2) ? 32 : 16) | (btsVar.k(str3) ? 256 : 128) | (btsVar.k(str4) ? 2048 : 1024) | (btsVar.e(bu8Var) ? 16384 : 8192) | (btsVar.e(eVar) ? 131072 : 65536);
        if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
            k3r k3rVar = ljs0.c;
            a7u0 a7u0Var = gl51.a;
            long c = ((el51) btsVar.m(a7u0Var)).c();
            gji0 gji0Var = qke.q;
            f530 b = m4m0.b(k3rVar, c, gji0Var);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S) {
                i2 = i3;
            } else {
                i2 = i3;
            }
            b64.z(hashCode, btsVar, hashCode, wlsVar3);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            f530 m = an91.m(k3rVar, 24.0f, 0.0f, 2);
            sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, m);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d3);
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            oeb1.c(btsVar, new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            c530 c530Var = c530.a;
            o4b1.b(mt71.m(yxg0.ic_result_failure, 0, btsVar), null, an91.o(c530Var, 0.0f, 0.0f, 0.0f, 20.0f, 7), null, null, 0.0f, null, btsVar, 432, 120);
            ymb1.j(str, null, 0L, tq7.a, lzr.E, 0L, 0L, 0L, new sjy0(3), 0, false, 0, null, null, btsVar, (i2 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT, 0, 64486);
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
            ymb1.e(str2, null, 0L, null, null, null, 0L, 0L, 0L, new sjy0(3), 0, false, 0, null, null, btsVar, (i2 >> 3) & 14, 0, 64510);
            btsVar = btsVar;
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            oeb1.c(btsVar, new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            btsVar.t(true);
            lbb1.b(m4m0.b(i9a1.d(ljs0.c(cj6.a.a(c530Var, x4c.B), 1.0f)), ((el51) btsVar.m(a7u0Var)).c(), gji0Var), false, 0.0f, 0.0f, null, null, wwg.S(661282025, true, new zhb0(eVar, bu8Var, str4, str3), btsVar), btsVar, 1572864, 62);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t0(str, str2, str3, str4, bu8Var, eVar, i);
        }
    }

    public static final void b(String str, String str2, String str3, bu8 bu8Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(225211140);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.k(str2) ? 32 : 16) | (btsVar.k(str3) ? 256 : 128) | (btsVar.e(bu8Var) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            k3r k3rVar = ljs0.c;
            a7u0 a7u0Var = gl51.a;
            long c = ((el51) btsVar.m(a7u0Var)).c();
            gji0 gji0Var = qke.q;
            f530 b = m4m0.b(k3rVar, c, gji0Var);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            f530 m = an91.m(k3rVar, 24.0f, 0.0f, 2);
            sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, m);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d3);
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            oeb1.c(btsVar, new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            c530 c530Var = c530.a;
            o4b1.b(mt71.m(yxg0.ic_result_success, 0, btsVar), null, an91.o(c530Var, 0.0f, 0.0f, 0.0f, 20.0f, 7), null, null, 0.0f, null, btsVar, 432, 120);
            ymb1.j(str, null, 0L, tq7.a, lzr.E, 0L, 0L, 0L, new sjy0(3), 0, false, 0, null, null, btsVar, (i2 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT, 0, 64486);
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
            ymb1.e(str2, null, 0L, null, null, null, 0L, 0L, 0L, new sjy0(3), 0, false, 0, null, null, btsVar, (i2 >> 3) & 14, 0, 64510);
            btsVar = btsVar;
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            oeb1.c(btsVar, new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            btsVar.t(true);
            lbb1.b(m4m0.b(i9a1.d(cj6.a.a(ljs0.c(c530Var, 1.0f), x4c.B)), ((el51) btsVar.m(a7u0Var)).c(), gji0Var), false, 0.0f, 0.0f, null, null, wwg.S(-1970224091, true, new o990(4, bu8Var, str3), btsVar), btsVar, 1572864, 62);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zhb0(str, str2, str3, bu8Var, i, 0);
        }
    }

    public static final void c(String str, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-958193254);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(str) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            k3r k3rVar = ljs0.c;
            a7u0 a7u0Var = gl51.a;
            f530 b = m4m0.b(k3rVar, ((el51) btsVar.m(a7u0Var)).c(), qke.q);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            sic a = qic.a(lr20.e, x4c.H, btsVar, 54);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            c530 c530Var = c530.a;
            f530 d3 = b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d3);
            cjf0.b(0.0f, 0, 0, ((el51) btsVar.m(a7u0Var)).f(), 0L, btsVar, null);
            oeb1.c(btsVar, ljs0.e(c530Var, 20.0f));
            ymb1.e(str, null, 0L, null, null, null, 0L, 0L, 0L, new sjy0(3), 0, false, 0, null, null, btsVar, i2 & 14, 0, 64510);
            btsVar = btsVar;
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fzv(str, i, 16);
        }
    }

    public static final void d(f530 f530Var, a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(790527681);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(aVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.i(null, x4c.Q);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new w01(21, oz40Var);
                btsVar.o0(Q2);
            }
            sls slsVar = (sls) Q2;
            eae0 eae0Var = cmh.a;
            l6d.a.getClass();
            androidx.compose.foundation.text.contextmenu.provider.a c = i5b1.c(l6d.c, btsVar, 6);
            sb2.c(new vvf0[]{jly0.b.a(wva1.f(slsVar, btsVar, 2)), jly0.a.a(c)}, wwg.S(1070596993, true, new b0(f530Var, oz40Var, aVar, c, slsVar, 26), btsVar), btsVar, 56);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new tc2(f530Var, aVar, i, i3);
        }
    }

    public static final void e(f530 f530Var, a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(155925518);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(aVar) ? 32 : 16;
        }
        int i3 = 3;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = btsVar.m(jly0.a) != null;
            boolean z2 = btsVar.m(jly0.b) != null;
            if (z && z2) {
                btsVar.e0(-1977187922);
                z910 d = pi6.d(x4c.b, true);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d2 = b.d(btsVar, f530Var);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (btsVar.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, d.f, d);
                qje.W(btsVar, d.e, o);
                qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                qje.M(btsVar, d.h);
                qje.W(btsVar, d.d, d2);
                aVar.invoke(btsVar, Integer.valueOf((i2 >> 3) & 14));
                btsVar.t(true);
                btsVar.t(false);
            } else if (z) {
                btsVar.e0(-1976997706);
                wva1.a(f530Var, aVar, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
                btsVar.t(false);
            } else if (z2) {
                btsVar.e0(-1976846922);
                cmh.d(f530Var, aVar, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
                btsVar.t(false);
            } else {
                btsVar.e0(-1976716505);
                d(f530Var, aVar, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new tc2(f530Var, aVar, i, i3);
        }
    }

    public static void f(int i, byte[] bArr, int[] iArr) {
        int length = iArr.length * 2;
        int[] iArr2 = new int[length];
        int i2 = iArr[iArr.length - 1] >> 31;
        int length2 = iArr.length;
        int i3 = length;
        while (true) {
            length2--;
            if (length2 < 0) {
                break;
            }
            int i4 = iArr[length2];
            iArr2[i3 - 1] = (i2 << 16) | (i4 >>> 16);
            i3 -= 2;
            iArr2[i3] = i4;
            i2 = i4;
        }
        int i5 = 32 - i;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < length) {
            int i9 = iArr2[i6];
            while (i7 < 16) {
                int i10 = i9 >>> i7;
                if ((i10 & 1) == i8) {
                    i7++;
                } else {
                    int i11 = (i10 | 1) << i5;
                    bArr[(i6 << 4) + i7] = (byte) (i11 >> i5);
                    i7 += i;
                    i8 = i11 >>> 31;
                }
            }
            i6++;
            i7 -= 16;
        }
    }

    public static boolean g(Throwable th) {
        return tw21.a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean h(Throwable th) {
        return tw21.a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
