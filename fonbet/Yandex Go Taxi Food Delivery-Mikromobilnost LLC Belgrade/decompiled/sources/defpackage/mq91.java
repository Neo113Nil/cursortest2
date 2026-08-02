package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.plus.text.PlusNewSize;
import com.yandex.go.design.compose.plus.text.PlusNewType;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class mq91 {
    public static final rrk0 a = new rrk0(0.16f, 0.1f, 0.08f, 0.1f);

    public static final void a(String str, f530 f530Var, PlusNewSize plusNewSize, PlusNewType plusNewType, boolean z, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        boolean z2;
        int i4;
        f530 f530Var3;
        boolean z3;
        ety0 ety0Var;
        wp2 wp2Var;
        f530 f530Var4;
        wp2 up2Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1583007182);
        int i5 = (btsVar.k(str) ? 4 : 2) | i;
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i5 | 48;
            f530Var2 = f530Var;
        } else {
            f530Var2 = f530Var;
            i3 = i5 | (btsVar.k(f530Var2) ? 32 : 16);
        }
        if ((i & 384) == 0) {
            i3 |= btsVar.c(plusNewSize == null ? -1 : plusNewSize.ordinal()) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.c(plusNewType != null ? plusNewType.ordinal() : -1) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i4 = i3 | HProv.ALG_CLASS_DATA_ENCRYPT;
            z2 = z;
        } else {
            z2 = z;
            i4 = i3 | (btsVar.a(z2) ? 16384 : 8192);
        }
        if (btsVar.V(i4 & 1, (i4 & 9363) != 9362)) {
            c530 c530Var = c530.a;
            f530 f530Var5 = i6 != 0 ? c530Var : f530Var2;
            boolean z4 = i7 != 0 ? false : z2;
            fwi fwiVar = (fwi) btsVar.m(j.h);
            int i8 = p6d0.a[plusNewSize.ordinal()];
            if (i8 == 1) {
                btsVar.e0(851489013);
                ety0Var = xya1.e(btsVar).h.a;
                btsVar.t(false);
            } else if (i8 == 2) {
                btsVar.e0(851491090);
                ety0Var = xya1.e(btsVar).h.c;
                btsVar.t(false);
            } else {
                if (i8 != 3) {
                    throw unr0.y(851487060, btsVar, false);
                }
                btsVar.e0(851492946);
                ety0Var = xya1.e(btsVar).i.c;
                btsVar.t(false);
            }
            lhl0 a2 = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var5);
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
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            f530 o2 = an91.o(c530Var, 0.0f, 0.0f, 1.5f, 0.0f, 11);
            if (z4) {
                ety0Var = bza1.c(ety0Var, fwiVar);
            }
            int[] iArr = p6d0.b;
            int i9 = iArr[plusNewType.ordinal()];
            if (i9 == 1 || i9 == 2) {
                wp2Var = nic.a;
            } else if (i9 == 3) {
                wp2Var = tp2.a;
            } else {
                if (i9 != 4) {
                    w511.b();
                    return;
                }
                wp2Var = AppColor$Palette.TextMinor;
            }
            jeb1.f(str, o2, wp2Var, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var, btsVar, (i4 & 14) | 48, 0, 16376);
            btsVar = btsVar;
            if (plusNewType == PlusNewType.Gradient || plusNewType == PlusNewType.GradientSign) {
                btsVar.e0(-1352105265);
                Object Q = btsVar.Q();
                o430 o430Var = did.a;
                if (Q == o430Var) {
                    Q = new fnb0(19);
                    btsVar.o0(Q);
                }
                f530 a3 = androidx.compose.ui.graphics.d.a(c530Var, (tls) Q);
                Object Q2 = btsVar.Q();
                if (Q2 == o430Var) {
                    Q2 = new fnb0(20);
                    btsVar.o0(Q2);
                }
                f530 i10 = bb1.i(a3, (tls) Q2);
                btsVar.t(false);
                f530Var4 = i10;
            } else {
                btsVar.e0(2034601850);
                btsVar.t(false);
                f530Var4 = c530Var;
            }
            au2 au2Var = oy91.b;
            if (au2Var == null) {
                lgv lgvVar = new lgv("YandexPlusS", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 224);
                a6t0 a6t0Var = new a6t0(iq2.g);
                uq90 g = tse0.g(8.64f, 12.8f, 10.2f, 8.0f);
                g.h(16.0f, 8.0f);
                g.a(8.0f, 8.0f, true, true, 10.47f, 0.4f);
                g.h(8.65f, 6.0f);
                g.h(3.33f, 6.0f);
                g.i(-0.66f, 2.0f);
                g.h(8.0f, 8.0f);
                g.i(-1.56f, 4.8f);
                g.c();
                g.j(10.84f, 6.0f);
                g.h(12.38f, 1.3f);
                g.a(8.0f, 8.0f, false, true, 15.75f, 6.0f);
                g.c();
                lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", g.a);
                au2Var = rya1.a(lgvVar.d(), true);
                oy91.b = au2Var;
            }
            int i11 = iArr[plusNewType.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    up2Var = nic.a;
                } else if (i11 != 3) {
                    if (i11 != 4) {
                        w511.b();
                        return;
                    }
                    up2Var = AppColor$Palette.TextMinor;
                }
                sya1.a(au2Var, ljs0.m(c530Var, 12.0f).k(f530Var4), null, up2Var, btsVar, 0, 4);
                btsVar.t(true);
                f530Var3 = f530Var5;
                z3 = z4;
            }
            up2Var = new up2(zp2.a);
            sya1.a(au2Var, ljs0.m(c530Var, 12.0f).k(f530Var4), null, up2Var, btsVar, 0, 4);
            btsVar.t(true);
            f530Var3 = f530Var5;
            z3 = z4;
        } else {
            btsVar.Y();
            f530Var3 = f530Var2;
            z3 = z2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new egb(str, f530Var3, plusNewSize, plusNewType, z3, i, i2, 4);
        }
    }
}
