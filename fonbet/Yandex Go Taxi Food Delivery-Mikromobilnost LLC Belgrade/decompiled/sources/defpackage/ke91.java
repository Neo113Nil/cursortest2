package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class ke91 {
    public static final int[] a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static final void a(int i, fid fidVar, f530 f530Var, String str, String str2) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1041153652);
        int i2 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.k(str2) ? 32 : 16) | 384;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            c530 c530Var = c530.a;
            f530 k = an91.k(ljs0.c(c530Var, 1.0f), 16.0f);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
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
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            ymb1.j(str, null, 0L, null, lzr.G, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, (i2 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65518);
            oeb1.c(btsVar, ljs0.e(c530Var, 12.0f));
            ymb1.e(str2, null, 0L, null, null, null, 0L, 0L, 0L, null, 0, false, 10, null, null, btsVar, (i2 >> 3) & 14, HProv.ALG_TYPE_SECURECHANNEL, 57342);
            btsVar = btsVar;
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ks6(str, str2, f530Var2, i, 2);
        }
    }

    public static final void b(u4y u4yVar, f530 f530Var, dme dmeVar, sls slsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1512471753);
        if ((i & 48) == 0) {
            i2 = (btsVar.k(f530Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? btsVar.k(dmeVar) : btsVar.e(dmeVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(slsVar) ? 2048 : 1024;
        }
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 1169) != 1168)) {
            f530 b = q791.b(f530Var, null, null, false, null, new awk0(0), slsVar, 12);
            a S = wwg.S(-2008437299, true, new ihl0(dmeVar, i3), btsVar);
            a S2 = wwg.S(1332026632, true, new ihl0(dmeVar, 2), btsVar);
            dfd.a.getClass();
            ydb1.a(b, S, S2, null, dfd.b, null, null, false, btsVar, 25008, 232);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c8i0((Object) u4yVar, f530Var, (Object) dmeVar, (Object) slsVar, i, 23);
        }
    }

    public static final void c(u4y u4yVar, x2x x2xVar, f530 f530Var, dme dmeVar, sls slsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-853886129);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(u4yVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(x2xVar) : btsVar.e(x2xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= (i & 4096) == 0 ? btsVar.k(dmeVar) : btsVar.e(dmeVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(slsVar) ? 16384 : 8192;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            xw91 xw91Var = ((nx2) btsVar.m(uy2.c)).b;
            int i3 = i2 & 14;
            int i4 = i2 >> 3;
            b(u4yVar, bzk0.c(f530Var, AppColor$Palette.ControlMinor, jl40.l(x2xVar, x2x.a) ? cyk0.e(16.0f, 16.0f, 0.0f, 0.0f, 12) : jl40.l(x2xVar, x2x.b) ? cyk0.e(0.0f, 0.0f, 16.0f, 16.0f, 3) : cyk0.a(0)), dmeVar, slsVar, btsVar, (i4 & 896) | i3 | (i4 & 7168));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mfe0((Object) u4yVar, (Object) x2xVar, (Object) f530Var, (Object) dmeVar, slsVar, i, 12);
        }
    }

    public static void d(vz5 vz5Var, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    vz5Var.c(i5, i4);
                    vz5Var.c(i5, i6);
                    vz5Var.c(i4, i5);
                    vz5Var.c(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        vz5Var.c(i7, i7);
        int i8 = i7 + 1;
        vz5Var.c(i8, i7);
        vz5Var.c(i7, i8);
        int i9 = i + i2;
        vz5Var.c(i9, i7);
        vz5Var.c(i9, i8);
        vz5Var.c(i9, i9 - 1);
    }

    public static uz5 e(uz5 uz5Var, int i, int i2) {
        rys rysVar;
        int i3 = uz5Var.b / i2;
        if (i2 == 4) {
            rysVar = rys.k;
        } else if (i2 == 6) {
            rysVar = rys.j;
        } else if (i2 == 8) {
            rysVar = rys.m;
        } else if (i2 == 10) {
            rysVar = rys.i;
        } else {
            if (i2 != 12) {
                ny61.g(oyr.i(i2, "Unsupported word size "));
                return null;
            }
            rysVar = rys.h;
        }
        yxf0 yxf0Var = new yxf0(rysVar);
        int i4 = i / i2;
        int[] iArr = new int[i4];
        int i5 = uz5Var.b / i2;
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                i7 |= uz5Var.d((i6 * i2) + i8) ? 1 << ((i2 - i8) - 1) : 0;
            }
            iArr[i6] = i7;
        }
        yxf0Var.f(i4 - i3, iArr);
        uz5 uz5Var2 = new uz5();
        uz5Var2.b(0, i % i2);
        for (int i9 = 0; i9 < i4; i9++) {
            uz5Var2.b(iArr[i9], i2);
        }
        return uz5Var2;
    }

    public static uz5 g(uz5 uz5Var, int i) {
        uz5 uz5Var2 = new uz5();
        int i2 = uz5Var.b;
        int i3 = (1 << i) - 2;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = i4 + i6;
                if (i7 >= i2 || uz5Var.d(i7)) {
                    i5 |= 1 << ((i - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                uz5Var2.b(i8, i);
            } else if (i8 == 0) {
                uz5Var2.b(i5 | 1, i);
            } else {
                uz5Var2.b(i5, i);
                i4 += i;
            }
            i4--;
            i4 += i;
        }
        return uz5Var2;
    }
}
