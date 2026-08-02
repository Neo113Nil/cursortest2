package defpackage;

import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.icon.IconSpotSize;
import com.yandex.go.design.compose.modal.bottomsheet.b;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import defpackage.an91;
import defpackage.bts;
import defpackage.c4d;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.e5v;
import defpackage.f530;
import defpackage.fid;
import defpackage.gi91;
import defpackage.hdu;
import defpackage.hi91;
import defpackage.j690;
import defpackage.jeb1;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.o430;
import defpackage.ohd;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.vfc;
import defpackage.vu7;
import defpackage.wls;
import defpackage.x4c;
import defpackage.xya1;
import defpackage.yur;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes11.dex */
public abstract class oeb1 {
    public static final void a(final vu7 vu7Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        vu7 vu7Var2 = vu7Var;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-589586987);
        if ((i & 6) == 0) {
            i2 = i | (btsVar2.k(vu7Var2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        int i3 = 18;
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new zp5(14, tlsVar);
                btsVar2.o0(Q);
            }
            sls slsVar = (sls) Q;
            boolean z2 = i4 == 32;
            Object Q2 = btsVar2.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new zp5(17, tlsVar);
                btsVar2.o0(Q2);
            }
            sls slsVar2 = (sls) Q2;
            boolean z3 = i4 == 32;
            Object Q3 = btsVar2.Q();
            if (z3 || Q3 == o430Var) {
                Q3 = new zp5(i3, tlsVar);
                btsVar2.o0(Q3);
            }
            wg6 a = b.a(false, 0.0f, null, false, null, slsVar, slsVar2, (sls) Q3, btsVar2, 0, 0, 1023);
            boolean z4 = i4 == 32;
            Object Q4 = btsVar2.Q();
            if (z4 || Q4 == o430Var) {
                Q4 = new zp5(19, tlsVar);
                btsVar2.o0(Q4);
            }
            vu7Var2 = vu7Var;
            c.a(null, a, qab1.c(a, null, (sls) Q4, btsVar2, 0, 2), false, false, null, null, wwg.S(1503399239, true, new wg0(4, tlsVar), btsVar2), null, null, wwg.S(467260489, true, new qk30(11, jeb1.g(androidx.compose.animation.core.b.b(0.0f, null, null, null, btsVar2, 6, 30)), tlsVar, vu7Var), btsVar2), wwg.S(-1036031371, true, new bms() { // from class: com.yandex.go.taxi.order.cancel.by_driver.ui.a
                @Override // defpackage.bms
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    j690 j690Var = (j690) obj2;
                    fid fidVar2 = (fid) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 48) == 0) {
                        intValue |= ((bts) fidVar2).k(j690Var) ? 32 : 16;
                    }
                    bts btsVar3 = (bts) fidVar2;
                    boolean V = btsVar3.V(intValue & 1, (intValue & 145) != 144);
                    zy11 zy11Var = zy11.a;
                    if (!V) {
                        btsVar3.Y();
                        return zy11Var;
                    }
                    c530 c530Var = c530.a;
                    f530 l = an91.l(an91.j(ljs0.c(c530Var, 1.0f), j690Var), 16.0f, 8.0f);
                    sic a2 = qic.a(lr20.c, x4c.G, btsVar3, 0);
                    int hashCode = Long.hashCode(btsVar3.T);
                    r1b0 o = btsVar3.o();
                    f530 d = androidx.compose.ui.b.d(btsVar3, l);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    if (btsVar3.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar3.i0();
                    if (btsVar3.S) {
                        btsVar3.n(slsVar3);
                    } else {
                        btsVar3.r0();
                    }
                    qje.W(btsVar3, d.f, a2);
                    qje.W(btsVar3, d.e, o);
                    qje.W(btsVar3, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar3, d.h);
                    qje.W(btsVar3, d.d, d);
                    f530 o2 = an91.o(c530Var, 0.0f, 2.0f, 0.0f, 12.0f, 5);
                    hdu hduVar = new hdu(AppColor$Palette.Error, AppColor$Palette.Background);
                    IconSpotSize iconSpotSize = IconSpotSize.M;
                    c4d.a.getClass();
                    e5v.a(o2, hduVar, null, iconSpotSize, c4d.b, btsVar3, 27696, 4);
                    Object Q5 = btsVar3.Q();
                    o430 o430Var2 = did.a;
                    if (Q5 == o430Var2) {
                        Q5 = vfc.g(btsVar3);
                    }
                    yur yurVar = (yur) Q5;
                    Object Q6 = btsVar3.Q();
                    if (Q6 == o430Var2) {
                        Q6 = new CancelledByDriverModalKt$CancelledByDriverModal$3$1$1$1(yurVar, null);
                        btsVar3.o0(Q6);
                    }
                    zpn.e(btsVar3, (wls) Q6, zy11Var);
                    f530 d2 = hi91.d(gi91.b(c530Var, yurVar), false, null, 3);
                    vu7 vu7Var3 = vu7.this;
                    jeb1.f(vu7Var3.a, d2, AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar3).e.d, btsVar3, 384, 0, 16376);
                    bts btsVar4 = btsVar3;
                    if (vu7Var3.b == null) {
                        btsVar4.e0(432856165);
                        btsVar4.t(false);
                    } else {
                        btsVar4.e0(432856166);
                        jeb1.f(vu7Var3.b, an91.o(c530Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar4).g.a, btsVar4, 432, 0, 16376);
                        btsVar4 = btsVar4;
                        btsVar4.t(false);
                    }
                    btsVar4.t(true);
                    return zy11Var;
                }
            }, btsVar2), btsVar2, 12582912, 54, 889);
            btsVar = btsVar2;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(vu7Var2, tlsVar, i, 15);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(f530 f530Var, String str, wp2 wp2Var, wp2 wp2Var2, wp2 wp2Var3, int i, int i2, ety0 ety0Var, fid fidVar, int i3, int i4) {
        f530 f530Var2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        wp2 wp2Var4;
        wp2 wp2Var5;
        f530 f530Var3;
        int i10;
        int i11;
        wp2 wp2Var6;
        aii0 v;
        int i12;
        int i13;
        int i14;
        wp2 wp2Var7;
        wp2 wp2Var8;
        f530 f530Var4;
        wp2 wp2Var9;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1504752643);
        int i15 = i4 & 1;
        if (i15 != 0) {
            i5 = i3 | 6;
            f530Var2 = f530Var;
        } else {
            f530Var2 = f530Var;
            i5 = i3 | (btsVar.k(f530Var2) ? 4 : 2);
        }
        int i16 = i5 | (btsVar.k(str) ? 32 : 16);
        int i17 = i16 | 11648;
        int i18 = i4 & 32;
        if (i18 != 0) {
            i17 = 208256 | i16;
        } else if ((i3 & ImageMetadata.EDGE_MODE) == 0) {
            i6 = i;
            i17 |= btsVar.c(i6) ? 131072 : 65536;
            i7 = i4 & 64;
            if (i7 == 0) {
                i17 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                i8 = i2;
                i17 |= btsVar.c(i8) ? 1048576 : 524288;
                i9 = i17 | (btsVar.k(ety0Var) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC);
                if (btsVar.V(i9 & 1, (4793491 & i9) != 4793490)) {
                    btsVar.a0();
                    if ((i3 & 1) == 0 || btsVar.C()) {
                        f530 f530Var5 = i15 != 0 ? c530.a : f530Var2;
                        AppColor$Palette appColor$Palette = AppColor$Palette.Text;
                        AppColor$Palette appColor$Palette2 = AppColor$Palette.BgMinor;
                        f530 f530Var6 = f530Var5;
                        vp2 vp2Var = new vp2(tje.n(appColor$Palette2, btsVar), rzo.f(4281153614L));
                        i12 = i9 & (-57345);
                        i13 = i18 != 0 ? Integer.MAX_VALUE : i6;
                        if (i7 != 0) {
                            wp2Var7 = appColor$Palette2;
                            i14 = 1;
                        } else {
                            i14 = i8;
                            wp2Var7 = appColor$Palette2;
                        }
                        wp2Var8 = vp2Var;
                        f530Var4 = f530Var6;
                        wp2Var9 = appColor$Palette;
                    } else {
                        btsVar.Y();
                        int i19 = i9 & (-57345);
                        wp2Var8 = wp2Var3;
                        i12 = i19;
                        f530Var4 = f530Var2;
                        i13 = i6;
                        i14 = i8;
                        wp2Var9 = wp2Var;
                        wp2Var7 = wp2Var2;
                    }
                    btsVar.u();
                    a7u0 a7u0Var = j.h;
                    float w0 = ((fwi) btsVar.m(a7u0Var)).w0(2.0f);
                    int i20 = i12 >> 12;
                    wp2 wp2Var10 = wp2Var9;
                    ety0 a = ety0.a(ety0Var, 0L, 0L, null, null, null, 0L, null, new bgr0(tje.n(wp2Var8, btsVar), 0L, ((fwi) btsVar.m(a7u0Var)).w0(12.0f)), null, 0, 0L, null, null, 16769023);
                    z910 d = pi6.d(x4c.b, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d2 = androidx.compose.ui.b.d(btsVar, f530Var4);
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
                    int i21 = i12 >> 3;
                    int i22 = i21 & 14;
                    int i23 = (i12 << 9) & 1879048192;
                    int i24 = (i21 & 910) | i23;
                    int i25 = i20 & 112;
                    wp2 wp2Var11 = wp2Var7;
                    int i26 = i13;
                    i11 = i14;
                    jeb1.f(str, null, wp2Var11, 0L, 0L, null, null, 0L, i11, false, i26, 0, null, ety0.a(a, tje.n(wp2Var7, btsVar), 0L, null, null, null, 0L, null, null, new jvu0(0, 0, 30, w0, 0.0f), 0, 0L, null, null, 16760830), btsVar, i24, i25, 13818);
                    jeb1.f(str, null, wp2Var10, 0L, 0L, null, null, 0L, i11, false, i26, 0, null, ety0.a(a, tje.n(wp2Var10, btsVar), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), btsVar, i22 | 384 | i23, i25, 13818);
                    btsVar = btsVar;
                    btsVar.t(true);
                    wp2Var4 = wp2Var10;
                    i10 = i26;
                    f530Var3 = f530Var4;
                    wp2Var5 = wp2Var8;
                    wp2Var6 = wp2Var11;
                } else {
                    btsVar.Y();
                    wp2Var4 = wp2Var;
                    wp2Var5 = wp2Var3;
                    f530Var3 = f530Var2;
                    i10 = i6;
                    i11 = i8;
                    wp2Var6 = wp2Var2;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new iiy(f530Var3, str, wp2Var4, wp2Var6, wp2Var5, i10, i11, ety0Var, i3, i4);
                    return;
                }
                return;
            }
            i8 = i2;
            i9 = i17 | (btsVar.k(ety0Var) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC);
            if (btsVar.V(i9 & 1, (4793491 & i9) != 4793490)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        i6 = i;
        i7 = i4 & 64;
        if (i7 == 0) {
        }
        i8 = i2;
        i9 = i17 | (btsVar.k(ety0Var) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC);
        if (btsVar.V(i9 & 1, (4793491 & i9) != 4793490)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final void c(fid fidVar, f530 f530Var) {
        bts btsVar = (bts) fidVar;
        int hashCode = Long.hashCode(btsVar.T);
        f530 d = androidx.compose.ui.b.d(fidVar, f530Var);
        r1b0 o = btsVar.o();
        ohd.G1.getClass();
        sls slsVar = d.b;
        bts btsVar2 = (bts) fidVar;
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
        qje.W(fidVar, d.f, pkt0.a);
        qje.W(fidVar, d.e, o);
        qje.M(fidVar, d.h);
        qje.W(fidVar, d.d, d);
        qje.W(fidVar, d.g, Integer.valueOf(hashCode));
        btsVar2.t(true);
    }
}
