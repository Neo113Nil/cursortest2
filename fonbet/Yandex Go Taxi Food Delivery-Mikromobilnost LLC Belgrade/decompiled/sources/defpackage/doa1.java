package defpackage;

import android.net.Uri;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.design.compose.slot.body.BodyAlign;
import com.yandex.go.summary.ui.model.common.address.AddressBodyUiState$AddressTextStyle;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.widget.pin.FixedPinView;

/* loaded from: classes11.dex */
public abstract class doa1 {
    public static FixedPinView a;

    public static final void a(ebp0 ebp0Var, oq0 oq0Var, f530 f530Var, fid fidVar, int i) {
        ebp0 ebp0Var2;
        int i2;
        bts btsVar;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-2138081275);
        if ((i & 6) == 0) {
            ebp0Var2 = ebp0Var;
            i2 = i | (btsVar2.k(ebp0Var2) ? 4 : 2);
        } else {
            ebp0Var2 = ebp0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(oq0Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (btsVar2.V(i3 & 1, (i3 & 147) != 146)) {
            c530 c530Var = c530.a;
            if (oq0Var != null) {
                btsVar2.e0(-1214093157);
                long j = xya1.e(btsVar2).h.a.a.b;
                int i4 = (i3 & 14) | 1572864;
                ebp0 ebp0Var3 = ebp0Var2;
                f530Var2 = c530Var;
                e(ebp0Var3, evu0.k0(oq0Var.a), ofb1.b(c530Var, oq0Var.i, null, 6), oq0Var.b, g(oq0Var.c, btsVar2), 0, 2, oq0Var.d, new sty0(j), evu0.k0(oq0Var.e), oq0Var.f, g(oq0Var.g, btsVar2), 0, 2, oq0Var.h, new sty0(j), btsVar2, i4);
                btsVar = btsVar2;
                btsVar.t(false);
            } else {
                btsVar = btsVar2;
                f530Var2 = c530Var;
                btsVar.e0(-1213260931);
                btsVar.t(false);
            }
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0((Object) ebp0Var, (Object) oq0Var, f530Var2, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(y81 y81Var, f530 f530Var, tls tlsVar, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        f530 f530Var3;
        aii0 v;
        tls tlsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1759227232);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(y81Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= btsVar.e(tlsVar) ? 256 : 128;
            }
            int i5 = 0;
            if (btsVar.V(i3 & 1, (i3 & 147) == 146)) {
                btsVar.Y();
                f530Var3 = f530Var2;
            } else {
                f530 f530Var4 = i4 != 0 ? c530.a : f530Var2;
                String str = y81Var.e;
                ix0 ix0Var = y81Var.a;
                oq0 oq0Var = y81Var.b;
                n81 n81Var = y81Var.c;
                v81 v81Var = y81Var.d;
                boolean z = v81Var != null;
                int i6 = i3 & 896;
                boolean k = (i6 == 256) | btsVar.k(str) | btsVar.a(z) | btsVar.e(v81Var) | btsVar.e(n81Var);
                Object Q = btsVar.Q();
                o430 o430Var = did.a;
                if (k || Q == o430Var) {
                    zw0 zw0Var = new zw0(str, z, n81Var, tlsVar, v81Var);
                    tlsVar2 = tlsVar;
                    btsVar.o0(zw0Var);
                    Q = zw0Var;
                } else {
                    tlsVar2 = tlsVar;
                }
                f530 a2 = fnq0.a(f530Var4, (tls) Q);
                boolean a3 = btsVar.a(z) | (i6 == 256) | btsVar.e(v81Var);
                Object Q2 = btsVar.Q();
                if (a3 || Q2 == o430Var) {
                    Q2 = new ex0(z, tlsVar2, v81Var, i5);
                    btsVar.o0(Q2);
                }
                ydb1.a(ooc.d(q791.d(a2, z, null, null, (sls) Q2, 14), null, 3), wwg.S(-1748942774, true, new bj0(7, ix0Var), btsVar), wwg.S(70457135, true, new bj0(8, oq0Var), btsVar), null, wwg.S(-628575691, true, new u5(17, n81Var, tlsVar2), btsVar), null, SlotSize.L, false, btsVar, 1597872, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN);
                f530Var3 = f530Var4;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new v4(y81Var, f530Var3, tlsVar, i, i2, 1);
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        if ((i & 384) == 0) {
        }
        int i52 = 0;
        if (btsVar.V(i3 & 1, (i3 & 147) == 146)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void c(ibp0 ibp0Var, ix0 ix0Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2088309067);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(ibp0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(ix0Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            c530 c530Var = c530.a;
            if (ix0Var == null) {
                btsVar.e0(214276930);
                nnm.s(c530Var, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar, false);
            } else {
                ov0 ov0Var = ix0Var.a;
                wp2 wp2Var = ov0Var.c;
                wp2 wp2Var2 = ov0Var.b;
                btsVar.e0(214330715);
                boolean k = btsVar.k(wp2Var) | btsVar.k(wp2Var2);
                Object Q = btsVar.Q();
                o430 o430Var = did.a;
                if (k || Q == o430Var) {
                    Q = new q0c0(wp2Var, wp2Var2);
                    btsVar.o0(Q);
                }
                q0c0 q0c0Var = (q0c0) Q;
                boolean k2 = btsVar.k(wp2Var2);
                Object Q2 = btsVar.Q();
                if (k2 || Q2 == o430Var) {
                    Q2 = new jfv(wp2Var2);
                    btsVar.o0(Q2);
                }
                vdb1.b(ibp0Var, c530Var, q0c0Var, wwg.S(-532377597, true, new u5(18, ix0Var, (jfv) Q2), btsVar), btsVar, (i3 & 14) | HProv.ALG_TYPE_SECURECHANNEL | ((i3 >> 3) & 112));
                btsVar.t(false);
            }
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0((Object) ibp0Var, (Object) ix0Var, f530Var2, i, 2);
        }
    }

    public static final void d(ibp0 ibp0Var, final n81 n81Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        c530 c530Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(858672002);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ibp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(n81Var) : btsVar.e(n81Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        final int i4 = 1;
        final int i5 = 0;
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = n81Var instanceof l81;
            Object obj = did.a;
            c530 c530Var2 = c530.a;
            if (z) {
                btsVar.e0(-127317727);
                v81 v81Var = ((l81) n81Var).b;
                ty2.a(btsVar);
                ButtonForm buttonForm = prt.a.c;
                ButtonStyle buttonStyle = ButtonStyle.Minor;
                boolean e = ((i3 & 7168) == 2048) | btsVar.e(v81Var);
                Object Q = btsVar.Q();
                if (e || Q == obj) {
                    Q = new ax0(tlsVar, v81Var, 0);
                    btsVar.o0(Q);
                }
                d17.c(fj91.d(an91.o(c530Var2, 8.0f, 0.0f, ibp0Var.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), IntrinsicSize.Min), true, ButtonSize.XS, buttonStyle, buttonForm, (sls) Q, wwg.S(-1896725813, true, new zls() { // from class: bx0
                    @Override // defpackage.zls
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i6 = i5;
                        zy11 zy11Var = zy11.a;
                        c530 c530Var3 = c530.a;
                        n81 n81Var2 = n81Var;
                        switch (i6) {
                            case 0:
                                fid fidVar2 = (fid) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    ov0 ov0Var = ((l81) n81Var2).a;
                                    wp2 wp2Var = ov0Var.b;
                                    f530 c = bzk0.c(c530Var3, ov0Var.c, qke.q);
                                    boolean k = btsVar2.k(wp2Var);
                                    Object Q2 = btsVar2.Q();
                                    if (k || Q2 == did.a) {
                                        Q2 = new jfv(wp2Var);
                                        btsVar2.o0(Q2);
                                    }
                                    v0b1.a(ov0Var.a, c, null, null, wwg.S(-1515149413, true, new xx8(7, n81Var2, ov0Var, c), btsVar2), (jfv) Q2, null, null, 0.0f, 0, btsVar2, HProv.ALG_CLASS_DATA_ENCRYPT, 972);
                                    break;
                                }
                                break;
                            default:
                                fid fidVar3 = (fid) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    jeb1.f(((m81) n81Var2).a, an91.m(c530Var3, 14.0f, 0.0f, 2), AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar3).h.a, btsVar3, 432, 0, 16376);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), btsVar, 1576320, 0);
                btsVar.t(false);
                c530Var = c530Var2;
            } else if (n81Var instanceof m81) {
                btsVar.e0(-126143199);
                v81 v81Var2 = ((m81) n81Var).b;
                ty2.a(btsVar);
                ButtonForm buttonForm2 = prt.a.c;
                ButtonStyle buttonStyle2 = ButtonStyle.Minor;
                boolean e2 = ((i3 & 7168) == 2048) | btsVar.e(v81Var2);
                Object Q2 = btsVar.Q();
                if (e2 || Q2 == obj) {
                    Q2 = new ax0(tlsVar, v81Var2, 1);
                    btsVar.o0(Q2);
                }
                c530Var = c530Var2;
                d17.c(an91.o(c530Var2, 8.0f, 0.0f, ibp0Var.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), true, ButtonSize.XS, buttonStyle2, buttonForm2, (sls) Q2, wwg.S(774894864, true, new zls() { // from class: bx0
                    @Override // defpackage.zls
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i6 = i4;
                        zy11 zy11Var = zy11.a;
                        c530 c530Var3 = c530.a;
                        n81 n81Var2 = n81Var;
                        switch (i6) {
                            case 0:
                                fid fidVar2 = (fid) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    ov0 ov0Var = ((l81) n81Var2).a;
                                    wp2 wp2Var = ov0Var.b;
                                    f530 c = bzk0.c(c530Var3, ov0Var.c, qke.q);
                                    boolean k = btsVar2.k(wp2Var);
                                    Object Q22 = btsVar2.Q();
                                    if (k || Q22 == did.a) {
                                        Q22 = new jfv(wp2Var);
                                        btsVar2.o0(Q22);
                                    }
                                    v0b1.a(ov0Var.a, c, null, null, wwg.S(-1515149413, true, new xx8(7, n81Var2, ov0Var, c), btsVar2), (jfv) Q22, null, null, 0.0f, 0, btsVar2, HProv.ALG_CLASS_DATA_ENCRYPT, 972);
                                    break;
                                }
                                break;
                            default:
                                fid fidVar3 = (fid) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    jeb1.f(((m81) n81Var2).a, an91.m(c530Var3, 14.0f, 0.0f, 2), AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar3).h.a, btsVar3, 432, 0, 16376);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), btsVar, 1576320, 0);
                btsVar.t(false);
            } else {
                c530Var = c530Var2;
                if (n81Var != null) {
                    throw unr0.y(550080574, btsVar, false);
                }
                btsVar.e0(550139470);
                nnm.s(c530Var, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar, false);
            }
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g0(ibp0Var, n81Var, f530Var2, tlsVar, i, 2);
        }
    }

    public static final void e(ebp0 ebp0Var, CharSequence charSequence, f530 f530Var, wp2 wp2Var, ety0 ety0Var, int i, int i2, boolean z, sty0 sty0Var, CharSequence charSequence2, wp2 wp2Var2, ety0 ety0Var2, int i3, int i4, boolean z2, sty0 sty0Var2, fid fidVar, int i5) {
        int i6;
        ety0 ety0Var3;
        bts btsVar;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(505061976);
        if ((i5 & 6) == 0) {
            i6 = (btsVar2.k(ebp0Var) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= (i5 & 64) == 0 ? btsVar2.k(charSequence) : btsVar2.e(charSequence) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= btsVar2.k(f530Var) ? 256 : 128;
        }
        if ((i5 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i6 |= btsVar2.k(wp2Var) ? 2048 : 1024;
        }
        if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            ety0Var3 = ety0Var;
            i6 |= btsVar2.k(ety0Var3) ? 16384 : 8192;
        } else {
            ety0Var3 = ety0Var;
        }
        int i12 = i6 | ImageMetadata.EDGE_MODE;
        if ((1572864 & i5) == 0) {
            i12 |= btsVar2.c(i2) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i12 |= btsVar2.a(z) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((i5 & 100663296) == 0) {
            i12 |= btsVar2.k(sty0Var) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((i5 & 805306368) == 0) {
            i12 |= (i5 & 1073741824) == 0 ? btsVar2.k(charSequence2) : btsVar2.e(charSequence2) ? 536870912 : SelfTester_JCP.IMITA;
        }
        int i13 = 3072 | (btsVar2.k(wp2Var2) ? 4 : 2) | (btsVar2.k(ety0Var2) ? 32 : 16) | 384 | (btsVar2.a(z2) ? 16384 : 8192) | (btsVar2.k(sty0Var2) ? 131072 : 65536) | 14155776;
        if (btsVar2.V(i12 & 1, ((306783379 & i12) == 306783378 && (i13 & 4793491) == 4793490) ? false : true)) {
            btsVar2.a0();
            if ((i5 & 1) == 0 || btsVar2.C()) {
                i9 = 2;
                i10 = 2;
            } else {
                btsVar2.Y();
                i9 = i;
                i10 = i3;
            }
            btsVar2.u();
            btsVar2.e0(33279743);
            BodyAlign bodyAlign = (BodyAlign) btsVar2.m(u76.a);
            btsVar2.t(false);
            jt1 alignment = bodyAlign.getAlignment();
            ebp0Var.getClass();
            f530 m = an91.m(cj6.a.a(f530Var, alignment), 0.0f, ebp0Var.c() == SlotSize.XS ? 0.0f : 2.0f, 1);
            sic a2 = qic.a(lr20.c, bodyAlign.getHorizontal(), btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, m);
            ohd.G1.getClass();
            sls slsVar = d.b;
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
            qje.W(btsVar2, d.f, a2);
            qje.W(btsVar2, d.e, o);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d);
            c530 c530Var = c530.a;
            int i14 = i12 >> 12;
            int i15 = i12;
            int i16 = i9;
            tcv0.a(charSequence, ljs0.c(c530Var, 1.0f), null, wp2Var, 0L, 0L, new sjy0(bodyAlign.getTextAlign()), 0L, i16, i2, 0, ety0Var3, z, sty0Var, btsVar2, ((i12 >> 3) & 14) | 48 | (i12 & 7168) | ((i12 << 12) & 1879048192), ((i12 >> 18) & 14) | ((i12 >> 6) & 896) | (i14 & 7168) | (i14 & HProv.ALG_CLASS_ALL));
            btsVar = btsVar2;
            if (charSequence2.length() > 0) {
                btsVar.e0(-1421486183);
                int i17 = i13 >> 3;
                i11 = i10;
                tcv0.a(charSequence2, ljs0.c(c530Var, 1.0f), null, wp2Var2, 0L, 0L, new sjy0(bodyAlign.getTextAlign()), 0L, i11, i4, 0, ety0Var2, z2, sty0Var2, btsVar, ((i15 >> 27) & 14) | 48 | ((i13 << 9) & 7168) | 805306368, ((i13 << 3) & 896) | 6 | (i17 & 7168) | (i17 & HProv.ALG_CLASS_ALL));
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                i11 = i10;
                btsVar.e0(-1421135232);
                btsVar.t(false);
            }
            btsVar.t(true);
            i8 = i11;
            i7 = i16;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            i7 = i;
            i8 = i3;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dx0(ebp0Var, charSequence, f530Var, wp2Var, ety0Var, i7, i2, z, sty0Var, charSequence2, wp2Var2, ety0Var2, i8, i4, z2, sty0Var2, i5);
        }
    }

    public static final syj0 f(syj0 syj0Var, Uri uri) {
        if (syj0Var instanceof lyj0) {
            return syj0Var;
        }
        if (syj0Var instanceof jyj0) {
            return new jyj0(new e1h(unr0.n(uri, "Unable to handle deeplink "), (Throwable) ((jyj0) syj0Var).a));
        }
        w511.b();
        return null;
    }

    public static final ety0 g(AddressBodyUiState$AddressTextStyle addressBodyUiState$AddressTextStyle, fid fidVar) {
        int i = fx0.a[addressBodyUiState$AddressTextStyle.ordinal()];
        if (i == 1) {
            bts btsVar = (bts) fidVar;
            btsVar.e0(1787545592);
            ety0 ety0Var = xya1.e(btsVar).h.a;
            btsVar.t(false);
            return ety0Var;
        }
        if (i != 2) {
            throw unr0.y(1787542620, (bts) fidVar, false);
        }
        bts btsVar2 = (bts) fidVar;
        btsVar2.e0(1787548568);
        ety0 ety0Var2 = xya1.e(btsVar2).g.a;
        btsVar2.t(false);
        return ety0Var2;
    }

    public static void h(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                ny61.t(unr0.m(i2, "at index ", new StringBuilder(String.valueOf(i2).length() + 9)));
                return;
            }
        }
    }
}
