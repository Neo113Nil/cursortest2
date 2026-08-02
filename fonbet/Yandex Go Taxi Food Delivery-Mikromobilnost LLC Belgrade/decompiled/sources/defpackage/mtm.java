package defpackage;

import com.yx360.design.BrandTheme;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public abstract class mtm {
    public static final a7u0 a = new a7u0(new ktm(2));
    public static final a7u0 b = new a7u0(new ktm(3));
    public static final a7u0 c = new a7u0(new ktm(4));
    public static final a7u0 d = new a7u0(new ktm(5));

    public static final void a(boolean z, BrandTheme brandTheme, wls wlsVar, boolean z2, fid fidVar, int i) {
        int i2;
        qom qomVar;
        long t;
        long s;
        long t2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(579194158);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (btsVar2.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.c(brandTheme == null ? -1 : brandTheme.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.e(wlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.a(z2) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && btsVar2.E()) {
            btsVar2.Y();
            btsVar = btsVar2;
        } else {
            btsVar2.a0();
            if ((i & 1) != 0 && !btsVar2.C()) {
                btsVar2.Y();
            }
            btsVar2.u();
            tpm tpmVar = z ? upm.b : upm.a;
            fn6 fn6Var = z ? rom.b : rom.a;
            wbz0 wbz0Var = z ? ztm.b : ztm.a;
            xtm xtmVar = null;
            if (brandTheme != null) {
                switch (som.a[brandTheme.ordinal()]) {
                    case 1:
                        qomVar = (qom) fn6Var.a;
                        break;
                    case 2:
                        qomVar = (qom) fn6Var.d;
                        break;
                    case 3:
                        qomVar = (qom) fn6Var.e;
                        break;
                    case 4:
                        qomVar = (qom) fn6Var.f;
                        break;
                    case 5:
                        qomVar = (qom) fn6Var.b;
                        break;
                    case 6:
                        qomVar = (qom) fn6Var.c;
                        break;
                    case 7:
                        qomVar = (qom) fn6Var.h;
                        break;
                    case 8:
                        qomVar = (qom) fn6Var.i;
                        break;
                    case 9:
                        qomVar = (qom) fn6Var.j;
                        break;
                    case 10:
                        qomVar = (qom) fn6Var.k;
                        break;
                    case 11:
                        qomVar = (qom) fn6Var.g;
                        break;
                    case 12:
                        qomVar = (qom) fn6Var.l;
                        break;
                    default:
                        w511.b();
                        return;
                }
            } else {
                qomVar = null;
            }
            if (brandTheme != null) {
                yom yomVar = wom.a;
                xtmVar = co91.b(brandTheme);
            }
            btsVar2.e0(-1740140747);
            if (xtmVar == null) {
                xtmVar = ltm.b(btsVar2);
            }
            btsVar2.t(false);
            btsVar2.e0(-1740136624);
            wls S = qomVar != null ? wwg.S(1413490541, true, new w4f(i3, qomVar, xtmVar, wlsVar), btsVar2) : wlsVar;
            btsVar2.t(false);
            btsVar2.e0(-1740132322);
            if (z2) {
                hza1.a(z, tpmVar, btsVar2, i2 & 14);
            }
            btsVar2.t(false);
            if (qomVar != null) {
                t = qomVar.a;
            } else {
                lsm lsmVar = lsm.a;
                t = lsm.t();
            }
            long j = t;
            long j0 = qomVar != null ? qomVar.j : tpmVar.j0();
            if (qomVar != null) {
                s = qomVar.d;
            } else {
                lsm lsmVar2 = lsm.a;
                s = lsm.s();
            }
            long j2 = s;
            if (qomVar != null) {
                t2 = qomVar.i;
            } else {
                lsm lsmVar3 = lsm.a;
                t2 = lsm.t();
            }
            long j3 = t2;
            long a2 = tpmVar.a();
            long g0 = tpmVar.g0();
            long V = tpmVar.V();
            long g02 = tpmVar.g0();
            long a3 = tpmVar.a();
            long h0 = tpmVar.h0();
            long V2 = tpmVar.V();
            long X = tpmVar.X();
            long f0 = tpmVar.f0();
            long G = tpmVar.G();
            long j02 = tpmVar.j0();
            long H = tpmVar.H();
            long b0 = tpmVar.b0();
            long g = tpmVar.g();
            long i4 = tpmVar.i();
            lsm lsmVar4 = lsm.a;
            long c2 = lsm.c();
            long U = tpmVar.U();
            long X2 = tpmVar.X();
            long a4 = tpmVar.a();
            long d2 = tpmVar.d();
            long b2 = tpmVar.b();
            long e = tpmVar.e();
            long e2 = tpmVar.e();
            long j4 = ldc.m;
            agc agcVar = new agc(j, j0, j2, j3, j, j, j0, j2, j3, j, j0, j2, j3, a2, g0, V, g02, a3, h0, V2, X, f0, G, j02, H, b0, g, i4, c2, U, X2, a4, d2, b2, e, e2, j4, j4, j4, j4, j4, j4, j4, j4, j4, j4, j4, j4);
            qnm.e.getClass();
            wir0 wir0Var = new wir0(cyk0.c(4.0f), cyk0.c(8.0f), cyk0.c(12.0f), cyk0.c(16.0f), cyk0.c(32.0f));
            btsVar2.e0(875432004);
            ety0 n = xtmVar.n(btsVar2);
            ety0 n2 = xtmVar.n(btsVar2);
            ety0 n3 = xtmVar.n(btsVar2);
            ety0 k = xtmVar.k(btsVar2);
            ety0 l = xtmVar.l(btsVar2);
            ety0 m = xtmVar.m(btsVar2);
            ety0 m2 = xtmVar.m(btsVar2);
            ety0 o = xtmVar.o(btsVar2);
            ety0 b3 = xtmVar.b(btsVar2);
            ety0 a5 = xtmVar.a(btsVar2);
            ety0 c3 = xtmVar.c(btsVar2);
            ety0 i5 = xtmVar.i(btsVar2);
            ety0 d3 = xtmVar.d(btsVar2);
            ety0 d4 = xtmVar.d(btsVar2);
            ety0 h = xtmVar.h(btsVar2);
            bq11 bq11Var = new bq11(n, n2, n3, k, l, m, m2, o, b3, a5, c3, i5, d3, d4, h, n, n2, n3, k, l, m, m2, o, b3, a5, c3, i5, d3, d4, h);
            btsVar2.t(false);
            btsVar = btsVar2;
            f810.b(agcVar, wir0Var, bq11Var, wwg.S(-1741328422, true, new bsm(tpmVar, fn6Var, wbz0Var, z, S, 1), btsVar2), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fgb(z, brandTheme, wlsVar, z2, i);
        }
    }

    public static final void b(spm spmVar, fn6 fn6Var, wbz0 wbz0Var, boolean z, wls wlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-857528404);
        int i2 = (btsVar.k(spmVar) ? 4 : 2) | i | (btsVar.k(fn6Var) ? 32 : 16) | (btsVar.k(wbz0Var) ? 256 : 128) | (btsVar.a(z) ? 2048 : 1024) | (btsVar.e(wlsVar) ? 16384 : 8192);
        if ((i2 & 9363) == 9362 && btsVar.E()) {
            btsVar.Y();
        } else {
            sb2.c(new vvf0[]{a.a(spmVar), b.a(fn6Var), c.a(wbz0Var), d.a(Boolean.valueOf(z))}, wlsVar, btsVar, ((i2 >> 9) & 112) | 8);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hc0(i, 5, spmVar, fn6Var, wbz0Var, wlsVar, z);
        }
    }
}
