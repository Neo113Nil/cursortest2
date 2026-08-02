package defpackage;

import androidx.compose.ui.graphics.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.ticket_item.b;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class h740 {
    public static final void a(l8v l8vVar, ldc ldcVar, ldc ldcVar2, float f, nhe nheVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1210813425);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(l8vVar) : btsVar.e(l8vVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(ldcVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(ldcVar2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.b(f) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.k(nheVar) ? 16384 : 8192;
        }
        if (!btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            btsVar.Y();
        } else if (ldcVar == null || ldcVar2 == null) {
            int i3 = i2;
            btsVar.e0(2088162970);
            o4b1.c(l8vVar, null, ljs0.c, x4c.y, nheVar, 0.0f, null, 0, btsVar, (i3 & 14) | 3504 | (57344 & i3), 224);
            btsVar = btsVar;
            btsVar.t(false);
        } else {
            btsVar.e0(2087842616);
            float f2 = 1.0f - f;
            b.f(l8vVar, ldc.b(ldcVar.a, y6i0.c(f2, 0.0f, 1.0f), 0.0f, 0.0f, 0.0f, 14), ldc.b(ldcVar2.a, y6i0.c(f2, 0.0f, 1.0f), 0.0f, 0.0f, 0.0f, 14), ljs0.c, 0, 0L, btsVar, (i2 & 14) | HProv.ALG_TYPE_SECURECHANNEL);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mn1(l8vVar, ldcVar, ldcVar2, f, nheVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, final String str2, final float f, boolean z, fid fidVar, final int i, final int i2) {
        int i3;
        boolean z2;
        bts btsVar;
        final boolean z3;
        aii0 aii0Var;
        wls wlsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1089791414);
        if ((i & 6) == 0) {
            i3 = (btsVar2.k(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.k(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar2.b(f) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            z2 = z;
            i3 |= btsVar2.a(z2) ? 2048 : 1024;
            if (btsVar2.V(i3 & 1, (i3 & 1171) == 1170)) {
                btsVar = btsVar2;
                btsVar.Y();
                z3 = z2;
            } else {
                boolean z4 = i4 != 0 ? false : z2;
                String str3 = (f <= 0.0f || f >= 1.0f || str2 == null) ? str : str2;
                if (str3 == null || str3.length() == 0) {
                    aii0Var = btsVar2.v();
                    if (aii0Var != null) {
                        final int i5 = 0;
                        final boolean z5 = z4;
                        wlsVar = new wls() { // from class: g740
                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                int i6 = i5;
                                zy11 zy11Var = zy11.a;
                                int i7 = i;
                                switch (i6) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int O = vng.O(i7 | 1);
                                        h740.b(str, str2, f, z5, (fid) obj, O, i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int O2 = vng.O(i7 | 1);
                                        h740.b(str, str2, f, z5, (fid) obj, O2, i2);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        aii0Var.d = wlsVar;
                        return;
                    }
                    return;
                }
                long L = rzo.L(tje.n(AppColor$Palette.Text, btsVar2), f, ldc.b(tje.n(AppColor$Palette.TextMinor, btsVar2), 0.5f, 0.0f, 0.0f, 0.0f, 14));
                int i6 = up2.c;
                c530 c530Var = c530.a;
                int i7 = 3;
                if (z4 && (str == null || str.length() == 0)) {
                    btsVar2.e0(318884436);
                    f530 m = ymb1.m(ljs0.c(c530Var, 1.0f));
                    int i8 = i3 & 896;
                    boolean z6 = i8 == 256;
                    Object Q = btsVar2.Q();
                    o430 o430Var = did.a;
                    if (z6 || Q == o430Var) {
                        Q = new xvc(f, i7);
                        btsVar2.o0(Q);
                    }
                    f530 F = kp50.F(m, (zls) Q);
                    boolean z7 = i8 == 256;
                    Object Q2 = btsVar2.Q();
                    if (z7 || Q2 == o430Var) {
                        Q2 = new yo1(f, 5);
                        btsVar2.o0(Q2);
                    }
                    f530 a = d.a(F, (tls) Q2);
                    sic a2 = qic.a(lr20.c, x4c.H, btsVar2, 48);
                    int hashCode = Long.hashCode(btsVar2.T);
                    r1b0 o = btsVar2.o();
                    f530 d = androidx.compose.ui.b.d(btsVar2, a);
                    ohd.G1.getClass();
                    sls slsVar = androidx.compose.ui.node.d.b;
                    if (btsVar2.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, androidx.compose.ui.node.d.f, a2);
                    qje.W(btsVar2, androidx.compose.ui.node.d.e, o);
                    qje.W(btsVar2, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar2, androidx.compose.ui.node.d.h);
                    qje.W(btsVar2, androidx.compose.ui.node.d.d, d);
                    jeb1.f(str3, an91.m(c530Var, 40.0f, 0.0f, 2), new up2(L), 0L, 0L, null, new sjy0(3), 0L, 2, false, 2, 0, null, xya1.e(btsVar2).f.d, btsVar2, 805306416, 48, 13688);
                    btsVar = btsVar2;
                    oeb1.c(btsVar, ljs0.e(c530Var, 16.0f));
                    btsVar.t(true);
                    btsVar.t(false);
                } else {
                    String str4 = str3;
                    btsVar2.e0(319692761);
                    jeb1.f(str4, an91.m(c530Var, 40.0f, 0.0f, 2), new up2(L), 0L, 0L, null, new sjy0(3), 0L, 2, false, 2, 0, null, xya1.e(btsVar2).f.d, btsVar2, 805306416, 48, 13688);
                    btsVar = btsVar2;
                    if (z4) {
                        tse0.s(btsVar, 319972288, c530Var, 16.0f, btsVar);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(320014572);
                        btsVar.t(false);
                    }
                    btsVar.t(false);
                }
                z3 = z4;
            }
            aii0Var = btsVar.v();
            if (aii0Var == null) {
                final int i9 = 1;
                wlsVar = new wls() { // from class: g740
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        int i62 = i9;
                        zy11 zy11Var = zy11.a;
                        int i72 = i;
                        switch (i62) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int O = vng.O(i72 | 1);
                                h740.b(str, str2, f, z3, (fid) obj, O, i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int O2 = vng.O(i72 | 1);
                                h740.b(str, str2, f, z3, (fid) obj, O2, i2);
                                break;
                        }
                        return zy11Var;
                    }
                };
                aii0Var.d = wlsVar;
                return;
            }
            return;
        }
        z2 = z;
        if (btsVar2.V(i3 & 1, (i3 & 1171) == 1170)) {
        }
        aii0Var = btsVar.v();
        if (aii0Var == null) {
        }
    }
}
