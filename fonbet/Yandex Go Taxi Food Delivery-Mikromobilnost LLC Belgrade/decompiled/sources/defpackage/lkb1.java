package defpackage;

import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.form.a;

/* loaded from: classes5.dex */
public abstract class lkb1 {
    public static mgv a;

    public static final void a(x6x0 x6x0Var, so5 so5Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1580101786);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(x6x0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(so5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            vqr.c(an91.m(ljs0.c(c530.a, 1.0f), 16.0f, 0.0f, 2), new i43(4.0f, true, new m6(9, so5Var)), new i43(8.0f, true, new quz(11)), null, 0, 0, wwg.S(-296012609, true, new ls40(x6x0Var, tlsVar, tlsVar2, 24), btsVar), btsVar, 1573254, 56);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c8i0(x6x0Var, so5Var, tlsVar, tlsVar2, i, 13);
        }
    }

    public static final void b(x6x0 x6x0Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1433760951);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(x6x0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            i43 i43Var = new i43(4.0f, true, new quz(11));
            l690 b = an91.b(16.0f, 0.0f, 2);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new lxo0(26, x6x0Var, tlsVar, tlsVar2);
                btsVar.o0(Q);
            }
            adb1.b(null, null, b, i43Var, null, null, false, null, (tls) Q, btsVar, 24960, 491);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t6x0(x6x0Var, tlsVar, tlsVar2, i, 1);
        }
    }

    public static final void c(final l6x0 l6x0Var, final tls tlsVar, final tls tlsVar2, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(179022227);
        int i2 = i | (btsVar2.k(l6x0Var) ? 4 : 2) | (btsVar2.e(tlsVar) ? 32 : 16) | (btsVar2.e(tlsVar2) ? 256 : 128);
        final int i3 = 1;
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            int i4 = i2 & 14;
            boolean z = ((i2 & 112) == 32) | (i4 == 4);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new sls() { // from class: u6x0
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i5 = r3;
                        zy11 zy11Var = zy11.a;
                        l6x0 l6x0Var2 = l6x0Var;
                        tls tlsVar3 = tlsVar;
                        switch (i5) {
                            case 0:
                                tlsVar3.invoke(l6x0Var2.g);
                                break;
                            default:
                                tlsVar3.invoke(l6x0Var2.f);
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar2.o0(Q);
            }
            sls slsVar = (sls) Q;
            int i5 = ((i2 & 896) == 256 ? 1 : 0) | (i4 == 4 ? 1 : 0);
            Object Q2 = btsVar2.Q();
            if (i5 != 0 || Q2 == o430Var) {
                Q2 = new sls() { // from class: u6x0
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i52 = i3;
                        zy11 zy11Var = zy11.a;
                        l6x0 l6x0Var2 = l6x0Var;
                        tls tlsVar3 = tlsVar2;
                        switch (i52) {
                            case 0:
                                tlsVar3.invoke(l6x0Var2.g);
                                break;
                            default:
                                tlsVar3.invoke(l6x0Var2.f);
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar2.o0(Q2);
            }
            btsVar = btsVar2;
            a.a(slsVar, (sls) Q2, l6x0Var.b, 0.0f, 8.0f, cl91.o(20.0f, 20.0f), l6x0Var.c, l6x0Var.a, null, null, l6x0Var.d, l6x0Var.e, false, l6x0Var.h, null, l6x0Var.i, btsVar, 221184, 0, 21256);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nvs0((Object) l6x0Var, (Object) tlsVar, (Object) tlsVar2, i, 6);
        }
    }

    public static final void d(x6x0 x6x0Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1109025237);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(x6x0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            t7x0 t7x0Var = x6x0Var.d;
            if (t7x0Var instanceof s7x0) {
                btsVar.e0(621369816);
                b(x6x0Var, tlsVar, tlsVar2, btsVar, i2 & 1022);
                btsVar.t(false);
            } else {
                if (!(t7x0Var instanceof r7x0)) {
                    throw unr0.y(621367499, btsVar, false);
                }
                btsVar.e0(621372236);
                int i3 = i2 & 14;
                int i4 = i2 << 3;
                a(x6x0Var, ((r7x0) t7x0Var).a, tlsVar, tlsVar2, btsVar, (i4 & 7168) | i3 | (i4 & 896));
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t6x0(x6x0Var, tlsVar, tlsVar2, i, 0);
        }
    }
}
