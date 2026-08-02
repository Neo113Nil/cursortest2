package com.yandex.go.scooters.parking;

import android.view.View;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.ui.platform.n;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.scooters.parking.d;
import defpackage.a6t0;
import defpackage.aco0;
import defpackage.aii0;
import defpackage.an91;
import defpackage.aqt;
import defpackage.au2;
import defpackage.bgc;
import defpackage.bts;
import defpackage.bvf0;
import defpackage.bzk0;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.d17;
import defpackage.dco0;
import defpackage.did;
import defpackage.dqt;
import defpackage.e3o0;
import defpackage.eco0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fj5;
import defpackage.fj91;
import defpackage.i7a0;
import defpackage.id00;
import defpackage.iin0;
import defpackage.iq2;
import defpackage.jeb1;
import defpackage.jk30;
import defpackage.k3r;
import defpackage.lgv;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.ohd;
import defpackage.pi6;
import defpackage.pz40;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.qpm0;
import defpackage.r1b0;
import defpackage.rya1;
import defpackage.rzo;
import defpackage.sb90;
import defpackage.sic;
import defpackage.sls;
import defpackage.sya1;
import defpackage.t3h0;
import defpackage.t7l0;
import defpackage.tls;
import defpackage.up2;
import defpackage.uq90;
import defpackage.vnf0;
import defpackage.w0b1;
import defpackage.w29;
import defpackage.w4f;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x1c;
import defpackage.x4c;
import defpackage.ydb1;
import defpackage.ymb1;
import defpackage.z910;
import defpackage.zls;
import defpackage.zp2;
import defpackage.zpn;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes13.dex */
public abstract class d {
    public static final void a(String str, sls slsVar, fid fidVar, int i) {
        sls slsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1829198635);
        int i2 = (btsVar.k(str) ? 4 : 2) | i | (btsVar.e(slsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            slsVar2 = slsVar;
            d17.c(an91.k(c530.a, 8.0f), false, null, ButtonStyle.Main, null, slsVar2, wwg.S(-1396224313, true, new jk30(str, 20), btsVar), btsVar, ((i2 << 12) & ImageMetadata.JPEG_GPS_COORDINATES) | 1575942, 22);
        } else {
            slsVar2 = slsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fj5(i, 8, slsVar2, str);
        }
    }

    public static final void b(final dco0 dco0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1222602243);
        int i2 = (btsVar.k(dco0Var) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            ydb1.a(null, wwg.S(1560282009, true, new zls() { // from class: vbo0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    dco0 dco0Var2 = dco0Var;
                    switch (i5) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar2.Y();
                                break;
                            } else {
                                tdb1.d(ibp0Var, mja1.a(dco0Var2.b, null, 6), null, null, null, null, 0.0f, 0, null, btsVar2, intValue & 14, 510);
                                break;
                            }
                        default:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                p9b1.c(ebp0Var, dco0Var2.a, c530.a, tp2.a, xya1.e(btsVar3).g.a, 2, Integer.MAX_VALUE, "", AppColor$Palette.TextMinor, xya1.e(btsVar3).h.a, 2, Integer.MAX_VALUE, null, btsVar3, intValue2 & 14, 0, 0);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), wwg.S(613785684, true, new zls() { // from class: vbo0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    dco0 dco0Var2 = dco0Var;
                    switch (i5) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar2.Y();
                                break;
                            } else {
                                tdb1.d(ibp0Var, mja1.a(dco0Var2.b, null, 6), null, null, null, null, 0.0f, 0, null, btsVar2, intValue & 14, 510);
                                break;
                            }
                        default:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                p9b1.c(ebp0Var, dco0Var2.a, c530.a, tp2.a, xya1.e(btsVar3).g.a, 2, Integer.MAX_VALUE, "", AppColor$Palette.TextMinor, xya1.e(btsVar3).h.a, 2, Integer.MAX_VALUE, null, btsVar3, intValue2 & 14, 0, 0);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), null, null, null, null, false, btsVar, 432, 249);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new e3o0(dco0Var, i, 4);
        }
    }

    public static final void c(aco0 aco0Var, fid fidVar, int i) {
        aco0 aco0Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1805713590);
        int i2 = i | (btsVar.k(aco0Var) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (Q == obj) {
                Q = id00.a(100.0f);
                btsVar.o0(Q);
            }
            androidx.compose.animation.core.a aVar = (androidx.compose.animation.core.a) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == obj) {
                Q2 = bvf0.c(Boolean.TRUE);
                btsVar.o0(Q2);
            }
            pz40 pz40Var = (pz40) Q2;
            k3r k3rVar = ljs0.c;
            boolean e = btsVar.e(aVar);
            Object Q3 = btsVar.Q();
            if (e || Q3 == obj) {
                Q3 = new x1c(aVar, 3);
                btsVar.o0(Q3);
            }
            f530 c = bzk0.c(androidx.compose.ui.graphics.d.a(k3rVar, (tls) Q3), AppColor$Palette.Fog, qke.q);
            boolean e2 = btsVar.e(pz40Var);
            Object Q4 = btsVar.Q();
            if (e2 || Q4 == obj) {
                Q4 = new iin0(13, pz40Var);
                btsVar.o0(Q4);
            }
            f530 b = androidx.compose.ui.input.pointer.d.b(c, (tls) Q4);
            sic a = qic.a(lr20.e, x4c.H, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, b);
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            au2 au2Var = w0b1.a;
            if (au2Var == null) {
                lgv lgvVar = new lgv("Hello", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                a6t0 a6t0Var = new a6t0(iq2.g);
                uq90 uq90Var = new uq90();
                uq90Var.j(11.0f, 4.78f);
                uq90Var.o(3.0f);
                uq90Var.b(1.0f, 1.0f, true, false, -2.0f, 0.0f);
                uq90Var.i(-0.02f, 5.56f);
                uq90Var.p(5.24f);
                uq90Var.b(1.15f, 1.15f, false, true, -2.01f, 0.76f);
                uq90Var.n(-2.62f, -2.97f, -3.1f, -3.3f);
                uq90Var.n(-1.02f, -0.32f, -1.46f, 0.05f);
                uq90Var.e(-0.58f, 0.5f, -0.65f, 1.37f, -0.15f, 1.95f);
                uq90Var.i(4.57f, 5.37f);
                uq90Var.i(0.01f, 0.01f);
                uq90Var.e(1.47f, 1.62f, 2.95f, 2.97f, 5.15f, 2.97f);
                uq90Var.b(6.4f, 6.4f, false, false, 5.7f, -4.13f);
                uq90Var.h(21.0f, 7.9f);
                uq90Var.b(1.0f, 1.0f, true, false, -1.89f, -0.65f);
                uq90Var.i(-1.25f, 3.62f);
                uq90Var.i(-0.26f, 0.8f);
                uq90Var.b(0.45f, 0.45f, false, true, -0.87f, -0.28f);
                uq90Var.i(0.81f, -3.05f);
                uq90Var.i(0.78f, -3.01f);
                uq90Var.b(1.0f, 1.0f, false, false, -1.94f, -0.5f);
                uq90Var.i(-0.18f, 0.7f);
                uq90Var.i(-1.26f, 4.87f);
                uq90Var.e(-0.09f, 0.34f, -0.47f, 0.52f, -0.74f, 0.44f);
                uq90Var.e(-0.3f, -0.09f, -0.43f, -0.39f, -0.38f, -0.7f);
                uq90Var.i(0.53f, -3.36f);
                uq90Var.i(0.6f, -3.63f);
                uq90Var.b(1.0f, 1.0f, false, false, -1.96f, -0.33f);
                uq90Var.i(-0.27f, 1.6f);
                uq90Var.i(-0.84f, 5.26f);
                uq90Var.e(-0.03f, 0.18f, -0.15f, 0.36f, -0.36f, 0.38f);
                uq90Var.e(-0.25f, 0.03f, -0.44f, -0.16f, -0.44f, -0.46f);
                uq90Var.c();
                lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", uq90Var.a);
                au2Var = rya1.a(lgvVar.d(), true);
                w0b1.a = au2Var;
            }
            long j = zp2.a;
            sya1.a(au2Var, null, null, new up2(j), btsVar, 0, 6);
            jeb1.f(aco0Var.a, null, new up2(j), 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar, 0, 0, 32762);
            btsVar = btsVar;
            btsVar.t(true);
            boolean e3 = btsVar.e(pz40Var) | btsVar.e(aVar) | ((i2 & 14) == 4);
            Object Q5 = btsVar.Q();
            if (e3 || Q5 == obj) {
                aco0Var2 = aco0Var;
                Q5 = new ScootersParkingScreenKt$Onboarding$4$1(pz40Var, aVar, aco0Var2, null);
                btsVar.o0(Q5);
            } else {
                aco0Var2 = aco0Var;
            }
            zpn.e(btsVar, (wls) Q5, zy11.a);
        } else {
            aco0Var2 = aco0Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new e3o0(aco0Var2, i, 3);
        }
    }

    public static final void d(aco0 aco0Var, androidx.compose.runtime.internal.a aVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1607723676);
        int i2 = (btsVar.k(aco0Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 l = ymb1.l(an91.m(fj91.c(c530.a, IntrinsicSize.Min), 16.0f, 0.0f, 2), cyk0.c(16.0f));
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, l);
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, d);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            aVar.invoke(btsVar, 6);
            if (aco0Var != null) {
                btsVar.e0(-1171500088);
                c(aco0Var, btsVar, i2 & 14);
                btsVar.t(false);
            } else {
                btsVar.e0(-1171465492);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t7l0(aco0Var, aVar, i, 26);
        }
    }

    public static final void e(final zzs zzsVar, final dqt dqtVar, fid fidVar, final int i) {
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2090459364);
        int i2 = (btsVar.e(zzsVar) ? 4 : 2) | i | (btsVar.k(dqtVar) ? 32 : 16);
        final int i3 = 1;
        final int i4 = 0;
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else {
            if (((Boolean) btsVar.m(n.a)).booleanValue()) {
                btsVar.e0(151029242);
                pi6.a(bzk0.c(ljs0.c(ljs0.e(c530.a, 400.0f), 1.0f), AppColor$Palette.Control, qke.q), btsVar, 6);
                btsVar.t(false);
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(zzsVar, dqtVar, i, i4) { // from class: ubo0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ zzs b;
                        public final /* synthetic */ dqt c;

                        {
                            this.a = i4;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.a;
                            zy11 zy11Var = zy11.a;
                            dqt dqtVar2 = this.c;
                            zzs zzsVar2 = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    d.e(zzsVar2, dqtVar2, fidVar2, vng.O(1));
                                    break;
                                default:
                                    d.e(zzsVar2, dqtVar2, fidVar2, vng.O(1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            btsVar.e0(151163782);
            btsVar.t(false);
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (Q == obj) {
                Q = dqtVar.a(new aqt(t3h0.ic_scooters_parking_here, new sb90(zzsVar), false, false, true, new bgc(12), new bgc(12), null, false, false, true, null, null, null, null));
                btsVar.o0(Q);
            }
            View view = (View) Q;
            if (view != null) {
                btsVar.e0(151422105);
                boolean e = btsVar.e(view);
                Object Q2 = btsVar.Q();
                if (e || Q2 == obj) {
                    Q2 = new w29(view, 10);
                    btsVar.o0(Q2);
                }
                androidx.compose.ui.viewinterop.b.a((tls) Q2, null, null, btsVar, 0, 6);
                btsVar.t(false);
            } else {
                btsVar.e0(151465350);
                btsVar.t(false);
            }
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(zzsVar, dqtVar, i, i3) { // from class: ubo0
                public final /* synthetic */ int a;
                public final /* synthetic */ zzs b;
                public final /* synthetic */ dqt c;

                {
                    this.a = i3;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj2, Object obj22) {
                    int i5 = this.a;
                    zy11 zy11Var = zy11.a;
                    dqt dqtVar2 = this.c;
                    zzs zzsVar2 = this.b;
                    fid fidVar2 = (fid) obj2;
                    ((Integer) obj22).getClass();
                    switch (i5) {
                        case 0:
                            d.e(zzsVar2, dqtVar2, fidVar2, vng.O(1));
                            break;
                        default:
                            d.e(zzsVar2, dqtVar2, fidVar2, vng.O(1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final void f(eco0 eco0Var, dqt dqtVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-363899616);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(eco0Var) : btsVar.e(eco0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(dqtVar) : btsVar.e(dqtVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            rzo.b(null, "default", wwg.S(-294913678, true, new w4f(6, tlsVar, eco0Var, dqtVar), btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0(eco0Var, dqtVar, tlsVar, i, 29);
        }
    }

    public static final void g(ArrayList arrayList, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1822736803);
        int i2 = (btsVar.k(arrayList) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c530.a);
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            btsVar.e0(-1068973544);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                dco0 dco0Var = (dco0) it.next();
                btsVar.c0(134004101, dco0Var.a);
                b(dco0Var, btsVar, 0);
                btsVar.t(false);
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i7a0(i, 1, arrayList);
        }
    }

    public static final void h(String str, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1487824341);
        int i2 = (btsVar.k(str) ? 4 : 2) | i;
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            ydb1.a(an91.o(c530.a, 0.0f, 8.0f, 0.0f, 0.0f, 13), null, wwg.S(1540577722, true, new jk30(str, 21), btsVar), null, null, null, null, false, btsVar, 390, 250);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qpm0(str, i, i3);
        }
    }
}
