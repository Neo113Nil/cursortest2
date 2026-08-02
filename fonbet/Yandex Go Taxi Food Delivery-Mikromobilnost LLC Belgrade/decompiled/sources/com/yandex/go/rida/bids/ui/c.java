package com.yandex.go.rida.bids.ui;

import androidx.compose.animation.core.RepeatMode;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.platform.n;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import defpackage.aii0;
import defpackage.an91;
import defpackage.aq5;
import defpackage.as5;
import defpackage.bj0;
import defpackage.bq5;
import defpackage.bts;
import defpackage.bzk0;
import defpackage.c530;
import defpackage.ck11;
import defpackage.cma1;
import defpackage.cq5;
import defpackage.cr5;
import defpackage.cyk0;
import defpackage.did;
import defpackage.dq5;
import defpackage.dr5;
import defpackage.eq5;
import defpackage.erb1;
import defpackage.ewz0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fq5;
import defpackage.fwi;
import defpackage.gji0;
import defpackage.gp5;
import defpackage.gq5;
import defpackage.hc0;
import defpackage.j3d;
import defpackage.jeb1;
import defpackage.jp5;
import defpackage.k651;
import defpackage.ku0;
import defpackage.lg6;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.lx40;
import defpackage.m3u0;
import defpackage.mj5;
import defpackage.my8;
import defpackage.nsv;
import defpackage.nx2;
import defpackage.o0;
import defpackage.o430;
import defpackage.ohd;
import defpackage.osv;
import defpackage.oz40;
import defpackage.q12;
import defpackage.q791;
import defpackage.qeb1;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.qor;
import defpackage.r1b0;
import defpackage.sb2;
import defpackage.sic;
import defpackage.sls;
import defpackage.sp5;
import defpackage.tbn;
import defpackage.tje;
import defpackage.tls;
import defpackage.tp5;
import defpackage.tpr;
import defpackage.ttb1;
import defpackage.tx40;
import defpackage.ubn;
import defpackage.up5;
import defpackage.uy2;
import defpackage.wg6;
import defpackage.wk11;
import defpackage.wls;
import defpackage.wp2;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xk11;
import defpackage.xm91;
import defpackage.xnb1;
import defpackage.xp5;
import defpackage.xx8;
import defpackage.ya2;
import defpackage.ydb1;
import defpackage.ymb1;
import defpackage.yp5;
import defpackage.yrl;
import defpackage.z5b1;
import defpackage.zls;
import defpackage.zp5;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes11.dex */
public abstract class c {
    public static final yp5 a = new yp5(0);

    public static final void a(final bq5 bq5Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        float f;
        bts btsVar = (bts) fidVar;
        btsVar.g0(201537846);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(bq5Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a2);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            if (bq5Var.b == null) {
                btsVar.e0(594518168);
                btsVar.t(false);
                f = 1.0f;
            } else {
                btsVar.e0(594518169);
                f = 1.0f;
                f530 c = ljs0.c(f530Var, 1.0f);
                j3d.a.getClass();
                ydb1.a(c, j3d.f, wwg.S(814186383, true, new zls() { // from class: vp5
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i5 = i3;
                        zy11 zy11Var = zy11.a;
                        bq5 bq5Var2 = bq5Var;
                        switch (i5) {
                            case 0:
                                ebp0 ebp0Var = (ebp0) obj;
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    p9b1.c(ebp0Var, bq5Var2.a, null, AppColor$Palette.TextMinor, xya1.e(btsVar2).h.a, 0, 0, bq5Var2.b, AppColor$Palette.Text, xya1.e(btsVar2).g.a, 0, 0, null, btsVar2, (intValue & 14) | 100666368, 0, 7730);
                                    break;
                                }
                            default:
                                ebp0 ebp0Var2 = (ebp0) obj;
                                fid fidVar3 = (fid) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((bts) fidVar3).k(ebp0Var2) ? 4 : 2;
                                }
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    p9b1.c(ebp0Var2, bq5Var2.c, null, AppColor$Palette.TextMinor, xya1.e(btsVar3).h.a, 0, 0, bq5Var2.d, AppColor$Palette.Text, xya1.e(btsVar3).g.a, 0, 0, null, btsVar3, (intValue2 & 14) | 100666368, 0, 7730);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), null, null, null, null, false, btsVar, 432, 248);
                btsVar.t(false);
            }
            if (bq5Var.d == null) {
                btsVar.e0(595162875);
                btsVar.t(false);
            } else {
                btsVar.e0(595162876);
                f530 c2 = ljs0.c(f530Var, f);
                j3d.a.getClass();
                ydb1.a(c2, j3d.g, wwg.S(1165556088, true, new zls() { // from class: vp5
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i5 = i4;
                        zy11 zy11Var = zy11.a;
                        bq5 bq5Var2 = bq5Var;
                        switch (i5) {
                            case 0:
                                ebp0 ebp0Var = (ebp0) obj;
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    p9b1.c(ebp0Var, bq5Var2.a, null, AppColor$Palette.TextMinor, xya1.e(btsVar2).h.a, 0, 0, bq5Var2.b, AppColor$Palette.Text, xya1.e(btsVar2).g.a, 0, 0, null, btsVar2, (intValue & 14) | 100666368, 0, 7730);
                                    break;
                                }
                            default:
                                ebp0 ebp0Var2 = (ebp0) obj;
                                fid fidVar3 = (fid) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((bts) fidVar3).k(ebp0Var2) ? 4 : 2;
                                }
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    p9b1.c(ebp0Var2, bq5Var2.c, null, AppColor$Palette.TextMinor, xya1.e(btsVar3).h.a, 0, 0, bq5Var2.d, AppColor$Palette.Text, xya1.e(btsVar3).g.a, 0, 0, null, btsVar3, (intValue2 & 14) | 100666368, 0, 7730);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), null, null, null, null, false, btsVar, 432, 248);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0((Object) bq5Var, f530Var, (Object) tlsVar, i, 18);
        }
    }

    public static final void b(cq5 cq5Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(85470265);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(cq5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 c = ljs0.c(f530Var, 1.0f);
            j3d.a.getClass();
            ydb1.a(c, j3d.h, wwg.S(-970519542, true, new bj0(18, cq5Var), btsVar), null, wwg.S(-91131196, true, new sp5(i3, cq5Var, tlsVar), btsVar), null, null, false, btsVar, 25008, 232);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0((Object) cq5Var, f530Var, (Object) tlsVar, i, 19);
        }
    }

    public static final void c(gq5 gq5Var, boolean z, tx40 tx40Var, wg6 wg6Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-173880547);
        int i2 = (btsVar.k(gq5Var) ? 4 : 2) | i | (btsVar.a(z) ? 32 : 16) | (btsVar.k(wg6Var) ? 2048 : 1024) | HProv.ALG_CLASS_DATA_ENCRYPT | (btsVar.e(tlsVar) ? 131072 : 65536);
        int i3 = 1;
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = jeb1.g(androidx.compose.runtime.f.d(new gp5(wg6Var, 1)));
                btsVar.o0(Q);
            }
            c530 c530Var = c530.a;
            f530 m = an91.m(ljs0.c(c530Var, 1.0f), 8.0f, 0.0f, 2);
            ((nx2) btsVar.m(uy2.c)).getClass();
            xnb1.a((qor) Q, an91.m(bzk0.c(ymb1.l(m, cyk0.c(24.0f)), AppColor$Palette.Background, qke.q), 4.0f, 0.0f, 2), a, wwg.S(748065237, true, new sp5(i3, gq5Var, tlsVar), btsVar), wwg.S(984235060, true, new xp5(gq5Var, z, tx40Var, tlsVar), btsVar), btsVar, 28038);
            f530Var = c530Var;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ya2(gq5Var, z, tx40Var, wg6Var, f530Var, tlsVar, i);
        }
    }

    public static final void d(as5 as5Var, tpr tprVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-215832812);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(as5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(tprVar) : btsVar.e(tprVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        int i4 = 0;
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            int i5 = i3;
            wg6 a2 = com.yandex.go.design.compose.modal.bottomsheet.b.a(as5Var.c, 0.0f, null, false, null, null, null, null, btsVar, 432, 0, 8184);
            lx40 f = erb1.f(a2, true, 0, btsVar, 384, 4);
            AppColor$Palette appColor$Palette = AppColor$Palette.Fog;
            boolean k = btsVar.k(a2);
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (k || Q == obj) {
                Q = jeb1.g(androidx.compose.runtime.f.d(new gp5(a2, 18)));
                btsVar.o0(Q);
            }
            qor qorVar = (qor) Q;
            boolean k2 = btsVar.k(appColor$Palette);
            Object Q2 = btsVar.Q();
            if (k2 || Q2 == obj) {
                Q2 = new lg6(appColor$Palette, qorVar, null);
                btsVar.o0(Q2);
            }
            lg6 lg6Var = (lg6) Q2;
            Object Q3 = btsVar.Q();
            if (Q3 == obj) {
                Q3 = androidx.compose.runtime.f.f(0.0f);
                btsVar.o0(Q3);
            }
            tx40 tx40Var = (tx40) Q3;
            ewz0 ewz0Var = as5Var.e;
            m(f, tx40Var, androidx.compose.runtime.f.n(Integer.valueOf(ewz0Var.a + ewz0Var.b), btsVar), as5Var.c, a2, btsVar, 48);
            k(f, tlsVar, btsVar, (i5 >> 6) & 112);
            int i6 = i5 >> 3;
            int i7 = i6 & 14;
            i(tprVar, a2, f.b, btsVar, i7);
            j(tprVar, a2, btsVar, i7 | 384);
            jp5.a(a2, as5Var, tlsVar, btsVar, ((i5 << 3) & 112) | (i6 & 896));
            com.yandex.go.design.compose.modal.bottomsheet.c.a(null, a2, lg6Var, false, false, null, null, null, null, wwg.S(308716448, true, new cr5(a2, i4), btsVar), null, wwg.S(-635744652, true, new dr5(as5Var, tx40Var, a2, tlsVar), btsVar), btsVar, 805330944, 48, 1513);
            btsVar = btsVar;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0(as5Var, tprVar, tlsVar, i, 20);
        }
    }

    public static final void e(dq5 dq5Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1549640908);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(dq5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 c = ljs0.c(f530Var, 1.0f);
            boolean z = (i2 & 896) == 256;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new o0(28, tlsVar);
                btsVar.o0(Q);
            }
            f530 d = q791.d(c, true, null, null, (sls) Q, 14);
            j3d.a.getClass();
            ydb1.a(d, j3d.i, wwg.S(-1747387579, true, new bj0(17, dq5Var), btsVar), null, j3d.j, null, null, false, btsVar, 25008, 232);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0((Object) dq5Var, f530Var, (Object) tlsVar, i, 17);
        }
    }

    public static final void f(gq5 gq5Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1862016600);
        int i2 = (btsVar.k(gq5Var) ? 4 : 2) | i | 48 | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            AppColor$Palette appColor$Palette = AppColor$Palette.Background;
            gji0 gji0Var = qke.q;
            c530 c530Var = c530.a;
            f530 m = an91.m(bzk0.c(c530Var, appColor$Palette, gji0Var), 0.0f, 8.0f, 1);
            eq5 eq5Var = gq5Var.a;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new o0(29, tlsVar);
                btsVar.o0(Q);
            }
            sls slsVar = (sls) Q;
            boolean z2 = i3 == 256;
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new zp5(0, tlsVar);
                btsVar.o0(Q2);
            }
            g(eq5Var, false, true, m, slsVar, (sls) Q2, null, btsVar, 432, 64);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xx8(gq5Var, f530Var2, tlsVar, i, 17);
        }
    }

    public static final void g(eq5 eq5Var, boolean z, boolean z2, f530 f530Var, sls slsVar, sls slsVar2, sls slsVar3, fid fidVar, int i, int i2) {
        sls slsVar4;
        int i3;
        sls slsVar5;
        int i4;
        sls slsVar6;
        int i5;
        bts btsVar;
        sls slsVar7;
        sls slsVar8;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(369339605);
        int i6 = (btsVar2.k(eq5Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i6 |= btsVar2.a(z) ? 32 : 16;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i6 |= btsVar2.k(f530Var) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 = i6 | HProv.ALG_CLASS_DATA_ENCRYPT;
            slsVar4 = slsVar;
        } else {
            slsVar4 = slsVar;
            i3 = i6 | (btsVar2.e(slsVar4) ? 16384 : 8192);
        }
        int i8 = i2 & 32;
        if (i8 != 0) {
            i4 = i3 | ImageMetadata.EDGE_MODE;
            slsVar5 = slsVar2;
        } else {
            slsVar5 = slsVar2;
            i4 = i3 | (btsVar2.e(slsVar5) ? 131072 : 65536);
        }
        int i9 = i2 & 64;
        if (i9 != 0) {
            i5 = i4 | 1572864;
            slsVar6 = slsVar3;
        } else {
            slsVar6 = slsVar3;
            i5 = i4 | (btsVar2.e(slsVar6) ? 1048576 : 524288);
        }
        int i10 = 0;
        if (btsVar2.V(i5 & 1, (599187 & i5) != 599186)) {
            sls slsVar9 = i7 != 0 ? null : slsVar4;
            if (i8 != 0) {
                slsVar5 = null;
            }
            sls slsVar10 = i9 != 0 ? null : slsVar6;
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = androidx.compose.runtime.f.f(0.0f);
                btsVar2.o0(Q);
            }
            tx40 tx40Var = (tx40) Q;
            Float f = eq5Var.a;
            boolean z3 = (i5 & 14) == 4;
            Object Q2 = btsVar2.Q();
            if (z3 || Q2 == o430Var) {
                Q2 = new BidsDriveCardKt$DriversProgress$1$1(eq5Var, tx40Var, null);
                btsVar2.o0(Q2);
            }
            zpn.e(btsVar2, (wls) Q2, f);
            sls slsVar11 = slsVar5;
            btsVar = btsVar2;
            ydb1.a(ljs0.c(f530Var, 1.0f), wwg.S(-1452237057, true, new sp5(i10, eq5Var, tx40Var), btsVar2), wwg.S(-1885598684, true, new my8(z2, eq5Var, 3), btsVar2), wwg.S(1588118221, true, new tp5(z, slsVar11, slsVar9, slsVar10, eq5Var, 0), btsVar2), null, null, null, false, btsVar, 3504, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC);
            slsVar7 = slsVar11;
            slsVar4 = slsVar9;
            slsVar8 = slsVar10;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            slsVar7 = slsVar5;
            slsVar8 = slsVar6;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new up5(eq5Var, z, z2, f530Var, slsVar4, slsVar7, slsVar8, i, i2);
        }
    }

    public static final void h(gq5 gq5Var, boolean z, tx40 tx40Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        tls tlsVar2;
        bts btsVar;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1298305125);
        int i2 = i | (btsVar2.k(gq5Var) ? 4 : 2) | (btsVar2.a(z) ? 32 : 16) | (btsVar2.k(tx40Var) ? 256 : 128) | HProv.ALG_TYPE_SECURECHANNEL | (btsVar2.e(tlsVar) ? 16384 : 8192);
        if (btsVar2.V(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z2 = (i2 & 896) == 256;
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (z2 || Q == o430Var) {
                Q = new aq5(tx40Var, 0);
                btsVar2.o0(Q);
            }
            f530Var2 = c530.a;
            f530 b = xm91.b(f530Var2, (tls) Q);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = androidx.compose.ui.b.d(btsVar2, b);
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
            f530 m = an91.m(f530Var2, 0.0f, 8.0f, 1);
            eq5 eq5Var = gq5Var.a;
            boolean z3 = (57344 & i2) == 16384;
            Object Q2 = btsVar2.Q();
            if (z3 || Q2 == o430Var) {
                Q2 = new zp5(1, tlsVar);
                btsVar2.o0(Q2);
            }
            sls slsVar2 = (sls) Q2;
            if (!z) {
                slsVar2 = null;
            }
            g(eq5Var, !z, false, m, null, null, slsVar2, btsVar2, 3456, 48);
            yrl.b(0, 7, btsVar2, null);
            int i3 = ((i2 >> 6) & 896) | 48;
            a(gq5Var.b, an91.m(f530Var2, 0.0f, 8.0f, 1), tlsVar, btsVar2, i3);
            fq5 fq5Var = gq5Var.e;
            j3d.a.getClass();
            ttb1.a(fq5Var, null, null, null, null, j3d.b, btsVar2, ImageMetadata.EDGE_MODE, 30);
            btsVar = btsVar2;
            yrl.b(0, 7, btsVar, null);
            tlsVar2 = tlsVar;
            b(gq5Var.c, an91.m(f530Var2, 0.0f, 8.0f, 1), tlsVar2, btsVar, i3);
            yrl.b(0, 7, btsVar, null);
            e(gq5Var.d, an91.m(f530Var2, 0.0f, 8.0f, 1), tlsVar2, btsVar, i3);
            btsVar.t(true);
        } else {
            tlsVar2 = tlsVar;
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hc0(gq5Var, z, tx40Var, f530Var2, tlsVar2, i, 1);
        }
    }

    public static final void i(tpr tprVar, wg6 wg6Var, int i, fid fidVar, int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-598711332);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? btsVar.k(tprVar) : btsVar.e(tprVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar.k(wg6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= btsVar.c(i) ? 256 : 128;
        }
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            boolean z = ((i3 & 14) == 4 || ((i3 & 8) != 0 && btsVar.e(tprVar))) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new BidsScreenKt$ListenCollapseUiEventEffect$1$1(tprVar, wg6Var, i, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, tprVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q12(i, i2, 1, tprVar, wg6Var);
        }
    }

    public static final void j(tpr tprVar, wg6 wg6Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-463999415);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(tprVar) : btsVar.e(tprVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(wg6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.c(-2) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 14) == 4 || ((i2 & 8) != 0 && btsVar.e(tprVar))) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new BidsScreenKt$ListenExpandUiEventEffect$1$1(tprVar, wg6Var, -2, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, tprVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(tprVar, wg6Var, i, 8);
        }
    }

    public static final void k(lx40 lx40Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1163115757);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(lx40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new BidsScreenKt$ListenMainAnchorHeightEffect$1$1(lx40Var, tlsVar, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, lx40Var);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(lx40Var, tlsVar, i, 7);
        }
    }

    public static final void l(final fq5 fq5Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2119976476);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(fq5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            ydb1.a(ljs0.c(f530Var, 1.0f), wwg.S(-1937116090, true, new zls() { // from class: wp5
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    fq5 fq5Var2 = fq5Var;
                    switch (i5) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                float size = (ibp0Var.c() == SlotSize.M ? SlotSize.L : ibp0Var.c()).getSize();
                                float size2 = ibp0Var.c().getSize();
                                c530 c530Var = c530.a;
                                f530 k = an91.k(ljs0.a(c530Var, size, size2), 2.0f);
                                z910 d = pi6.d(x4c.y, false);
                                int hashCode = Long.hashCode(btsVar2.T);
                                r1b0 o = btsVar2.o();
                                f530 d2 = b.d(btsVar2, k);
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
                                qje.W(btsVar2, d.f, d);
                                qje.W(btsVar2, d.e, o);
                                qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                                qje.M(btsVar2, d.h);
                                qje.W(btsVar2, d.d, d2);
                                if (((Boolean) btsVar2.m(n.a)).booleanValue()) {
                                    btsVar2.e0(1420879120);
                                    pi6.a(ljs0.n(c530Var, 36.0f, 24.0f), btsVar2, 6);
                                    btsVar2.t(false);
                                } else {
                                    btsVar2.e0(1420984334);
                                    f530 n = ljs0.n(c530Var, 36.0f, 24.0f);
                                    Object Q = btsVar2.Q();
                                    o430 o430Var = did.a;
                                    if (Q == o430Var) {
                                        Q = new l75(29);
                                        btsVar2.o0(Q);
                                    }
                                    tls tlsVar = (tls) Q;
                                    boolean k2 = btsVar2.k(fq5Var2);
                                    Object Q2 = btsVar2.Q();
                                    if (k2 || Q2 == o430Var) {
                                        Q2 = new j24(26, fq5Var2);
                                        btsVar2.o0(Q2);
                                    }
                                    androidx.compose.ui.viewinterop.b.a(tlsVar, n, (tls) Q2, btsVar2, 54, 0);
                                    btsVar2.t(false);
                                }
                                btsVar2.t(true);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        default:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                p9b1.c(ebp0Var, fq5Var2.c, null, null, xya1.e(btsVar3).g.a, 0, 0, null, null, null, 0, 0, null, btsVar3, intValue2 & 14, 0, 8182);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), wwg.S(-1561059477, true, new zls() { // from class: wp5
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    fq5 fq5Var2 = fq5Var;
                    switch (i5) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                float size = (ibp0Var.c() == SlotSize.M ? SlotSize.L : ibp0Var.c()).getSize();
                                float size2 = ibp0Var.c().getSize();
                                c530 c530Var = c530.a;
                                f530 k = an91.k(ljs0.a(c530Var, size, size2), 2.0f);
                                z910 d = pi6.d(x4c.y, false);
                                int hashCode = Long.hashCode(btsVar2.T);
                                r1b0 o = btsVar2.o();
                                f530 d2 = b.d(btsVar2, k);
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
                                qje.W(btsVar2, d.f, d);
                                qje.W(btsVar2, d.e, o);
                                qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                                qje.M(btsVar2, d.h);
                                qje.W(btsVar2, d.d, d2);
                                if (((Boolean) btsVar2.m(n.a)).booleanValue()) {
                                    btsVar2.e0(1420879120);
                                    pi6.a(ljs0.n(c530Var, 36.0f, 24.0f), btsVar2, 6);
                                    btsVar2.t(false);
                                } else {
                                    btsVar2.e0(1420984334);
                                    f530 n = ljs0.n(c530Var, 36.0f, 24.0f);
                                    Object Q = btsVar2.Q();
                                    o430 o430Var = did.a;
                                    if (Q == o430Var) {
                                        Q = new l75(29);
                                        btsVar2.o0(Q);
                                    }
                                    tls tlsVar = (tls) Q;
                                    boolean k2 = btsVar2.k(fq5Var2);
                                    Object Q2 = btsVar2.Q();
                                    if (k2 || Q2 == o430Var) {
                                        Q2 = new j24(26, fq5Var2);
                                        btsVar2.o0(Q2);
                                    }
                                    androidx.compose.ui.viewinterop.b.a(tlsVar, n, (tls) Q2, btsVar2, 54, 0);
                                    btsVar2.t(false);
                                }
                                btsVar2.t(true);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        default:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                p9b1.c(ebp0Var, fq5Var2.c, null, null, xya1.e(btsVar3).g.a, 0, 0, null, null, null, 0, 0, null, btsVar3, intValue2 & 14, 0, 8182);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), null, null, null, null, false, btsVar, 432, 248);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(fq5Var, f530Var, i, 6);
        }
    }

    public static final void m(lx40 lx40Var, qor qorVar, oz40 oz40Var, boolean z, wg6 wg6Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-39973036);
        int i2 = i | (btsVar.k(lx40Var) ? 4 : 2) | (btsVar.k(oz40Var) ? 256 : 128) | (btsVar.a(z) ? 2048 : 1024) | (btsVar.k(wg6Var) ? 16384 : 8192);
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            k651 k651Var = (k651) btsVar.m(j.u);
            fwi fwiVar = (fwi) btsVar.m(j.h);
            boolean booleanValue = ((Boolean) btsVar.m(n.a)).booleanValue();
            Boolean valueOf = Boolean.valueOf(z);
            boolean k = ((i2 & 896) == 256) | btsVar.k(k651Var) | btsVar.k(fwiVar) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | btsVar.a(booleanValue) | ((i2 & 14) == 4);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new BidsScreenKt$SetMainAnchorHeightEffect$1$1(qorVar, oz40Var, k651Var, fwiVar, z, wg6Var, booleanValue, lx40Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, valueOf);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hc0(i, 2, lx40Var, qorVar, oz40Var, wg6Var, z);
        }
    }

    public static final void n(f530 f530Var, m3u0 m3u0Var, boolean z, wp2 wp2Var, float f, fid fidVar, int i) {
        bts btsVar;
        f530 f530Var2;
        wp2 wp2Var2;
        float f2;
        wp2 wp2Var3;
        f530 f530Var3;
        float f3;
        float f4;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1793514222);
        int i2 = i | 6 | (btsVar2.k(m3u0Var) ? 32 : 16) | 27648;
        if (btsVar2.V(i2 & 1, (i2 & 9363) != 9362)) {
            btsVar2.a0();
            if ((i & 1) == 0 || btsVar2.C()) {
                wp2Var3 = AppColor$Palette.EverFront;
                f530Var3 = c530.a;
                f3 = 5.0f;
            } else {
                btsVar2.Y();
                f530Var3 = f530Var;
                wp2Var3 = wp2Var;
                f3 = f;
            }
            btsVar2.u();
            long n = tje.n(wp2Var3, btsVar2);
            androidx.compose.animation.core.c g = z5b1.g("WidePulsingCircles", btsVar2, 0);
            tbn tbnVar = ubn.d;
            ck11 K = sb2.K(4000, 0, tbnVar, 2);
            RepeatMode repeatMode = RepeatMode.Restart;
            float f5 = f3;
            wp2 wp2Var4 = wp2Var3;
            osv d = z5b1.d(g, 0.0f, 1.0f, sb2.w(K, repeatMode, 0L, 4), "WidePulsingCirclesLeading", btsVar2, 29112, 0);
            osv d2 = z5b1.d(g, 0.0f, 1.0f, new nsv(sb2.K(4000, 0, tbnVar, 2), repeatMode, -2000L), "WidePulsingCirclesChasing", btsVar2, 29112, 0);
            btsVar = btsVar2;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = androidx.compose.runtime.f.j(Boolean.FALSE);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new WidePulsingCirclesKt$WidePulsingCircles$1$1(oz40Var, null);
                btsVar.o0(Q2);
            }
            zpn.e(btsVar, (wls) Q2, zy11.a);
            f530 k = f530Var3.k(ljs0.c);
            boolean d3 = btsVar.d(n) | ((((i2 & 112) ^ 48) > 32 && btsVar.k(m3u0Var)) || (i2 & 48) == 32) | btsVar.k(d) | btsVar.k(d2);
            Object Q3 = btsVar.Q();
            if (d3 || Q3 == o430Var) {
                f4 = f5;
                wk11 wk11Var = new wk11(f4, m3u0Var, z, n, d, oz40Var, d2);
                btsVar.o0(wk11Var);
                Q3 = wk11Var;
            } else {
                f4 = f5;
            }
            qeb1.a(0, btsVar, (tls) Q3, k);
            f2 = f4;
            f530Var2 = f530Var3;
            wp2Var2 = wp2Var4;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
            wp2Var2 = wp2Var;
            f2 = f;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xk11(f530Var2, m3u0Var, z, wp2Var2, f2, i, 1);
        }
    }
}
