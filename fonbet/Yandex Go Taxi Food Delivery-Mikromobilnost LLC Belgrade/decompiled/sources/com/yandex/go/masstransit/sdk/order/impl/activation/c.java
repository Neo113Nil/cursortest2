package com.yandex.go.masstransit.sdk.order.impl.activation;

import android.content.Context;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.masstransit.sdk.camera.view.MtQRCameraPreview;
import defpackage.aii0;
import defpackage.an91;
import defpackage.au2;
import defpackage.awk0;
import defpackage.bts;
import defpackage.bvf0;
import defpackage.bzk0;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cyh0;
import defpackage.cyk0;
import defpackage.did;
import defpackage.dmw0;
import defpackage.e1z0;
import defpackage.epa1;
import defpackage.ety0;
import defpackage.f0z0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.g8r0;
import defpackage.i43;
import defpackage.i9a1;
import defpackage.ieg0;
import defpackage.jeb1;
import defpackage.khl0;
import defpackage.kj5;
import defpackage.lao0;
import defpackage.ldc;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.m4m0;
import defpackage.mt71;
import defpackage.n;
import defpackage.n7l0;
import defpackage.nhl0;
import defpackage.nvs0;
import defpackage.o430;
import defpackage.o4b1;
import defpackage.oeb1;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pa90;
import defpackage.pi6;
import defpackage.pjv0;
import defpackage.q6a1;
import defpackage.q791;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.quz;
import defpackage.qwa;
import defpackage.qy20;
import defpackage.r1b0;
import defpackage.rhi0;
import defpackage.ric;
import defpackage.s1z0;
import defpackage.sic;
import defpackage.sls;
import defpackage.sya1;
import defpackage.t1z0;
import defpackage.t2h0;
import defpackage.tls;
import defpackage.up2;
import defpackage.v1z0;
import defpackage.v5c0;
import defpackage.vfc;
import defpackage.vl5;
import defpackage.vza1;
import defpackage.wls;
import defpackage.wp2;
import defpackage.wwg;
import defpackage.wza1;
import defpackage.x4c;
import defpackage.xkt;
import defpackage.xya1;
import defpackage.ycg0;
import defpackage.ymb1;
import defpackage.z910;
import defpackage.zp2;
import defpackage.zpn;
import defpackage.zst;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes12.dex */
public abstract class c {
    public static final void a(int i, fid fidVar, sls slsVar, f530 f530Var) {
        bts btsVar;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(529964379);
        int i2 = (btsVar2.e(slsVar) ? 4 : 2) | i | 48;
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            LayoutDirection layoutDirection = (LayoutDirection) btsVar2.m(j.n);
            String e = ohb1.e(btsVar2, cyh0.mt_qr_common_back);
            au2 i3 = layoutDirection == LayoutDirection.Rtl ? wza1.i() : vza1.c();
            f530Var2 = c530.a;
            f530 d = q791.d(m4m0.b(ymb1.l(ljs0.m(f530Var2, 56.0f), cyk0.a), ldc.f, qke.q), false, null, null, slsVar, 15);
            boolean k = btsVar2.k(e);
            Object Q = btsVar2.Q();
            if (k || Q == did.a) {
                Q = new g8r0(e, 22);
                btsVar2.o0(Q);
            }
            f530 b = fnq0.b(d, false, (tls) Q);
            z910 d2 = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar2, b);
            ohd.G1.getClass();
            sls slsVar2 = androidx.compose.ui.node.d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar2);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, androidx.compose.ui.node.d.f, d2);
            qje.W(btsVar2, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar2, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, androidx.compose.ui.node.d.h);
            qje.W(btsVar2, androidx.compose.ui.node.d.d, d3);
            btsVar = btsVar2;
            sya1.a(i3, ljs0.m(f530Var2, 24.0f), null, new up2(ldc.b), btsVar, 3120, 4);
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vl5(slsVar, f530Var2, i, 14);
        }
    }

    public static final void b(v1z0 v1z0Var, boolean z, boolean z2, sls slsVar, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        boolean z3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1637971045);
        int i2 = i | (btsVar.k(v1z0Var) ? 4 : 2) | (btsVar.a(z) ? 32 : 16) | (btsVar.a(z2) ? 256 : 128) | (btsVar.e(slsVar) ? 2048 : 1024) | (btsVar.e(tlsVar) ? 16384 : 8192) | (btsVar.k(f530Var) ? 131072 : 65536);
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            boolean z4 = v1z0Var instanceof t1z0;
            boolean z5 = v1z0Var instanceof s1z0;
            boolean z6 = z4 && z;
            boolean z7 = (z4 || z5 || !z) ? false : true;
            f530 l = an91.l(ljs0.c(f530Var, 1.0f), 16.0f, 12.0f);
            lhl0 a = khl0.a(new i43(8.0f, true, new quz(11)), x4c.E, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, l);
            ohd.G1.getClass();
            sls slsVar2 = androidx.compose.ui.node.d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            int i3 = i2 & HProv.ALG_CLASS_ALL;
            boolean z8 = i3 == 16384;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z8 || Q == o430Var) {
                Q = new lao0(21, tlsVar);
                btsVar.o0(Q);
            }
            a(0, btsVar, (sls) Q, null);
            c530 c530Var = c530.a;
            nhl0 nhl0Var = nhl0.a;
            if (z6) {
                btsVar.e0(1518005719);
                String e = ohb1.e(btsVar, cyh0.mt_nfc_activation_button);
                f530 a2 = nhl0Var.a(c530Var, 1.0f, true);
                boolean z9 = i3 == 16384;
                Object Q2 = btsVar.Q();
                if (z9 || Q2 == o430Var) {
                    Q2 = new lao0(22, tlsVar);
                    btsVar.o0(Q2);
                }
                i(0, btsVar, (sls) Q2, a2, e);
                btsVar.t(false);
            } else if (z7) {
                btsVar.e0(1518259609);
                String e2 = ohb1.e(btsVar, cyh0.mt_qr_activation_button);
                f530 a3 = nhl0Var.a(c530Var, 1.0f, true);
                boolean z10 = i3 == 16384;
                Object Q3 = btsVar.Q();
                if (z10 || Q3 == o430Var) {
                    Q3 = new lao0(23, tlsVar);
                    btsVar.o0(Q3);
                }
                i(0, btsVar, (sls) Q3, a3, e2);
                btsVar.t(false);
            } else {
                btsVar.e0(1518482096);
                z3 = true;
                oeb1.c(btsVar, nhl0Var.a(c530Var, 1.0f, true));
                btsVar.t(false);
                c(z4, z2, slsVar, null, btsVar, (i2 >> 3) & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND);
                btsVar.t(z3);
            }
            z3 = true;
            c(z4, z2, slsVar, null, btsVar, (i2 >> 3) & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND);
            btsVar.t(z3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qwa(v1z0Var, z, z2, slsVar, tlsVar, f530Var, i, 4);
        }
    }

    public static final void c(boolean z, boolean z2, sls slsVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        String e;
        long j;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-418723438);
        if ((i & 6) == 0) {
            i2 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.a(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(slsVar) ? 256 : 128;
        }
        int i3 = i2 | HProv.ALG_TYPE_SECURECHANNEL;
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            if (z2) {
                btsVar.e0(-1604762096);
                e = ohb1.e(btsVar, cyh0.mt_qr_flashlight_disable);
                btsVar.t(false);
            } else {
                btsVar.e0(-1604692687);
                e = ohb1.e(btsVar, cyh0.mt_qr_flashlight_enable);
                btsVar.t(false);
            }
            String str = e;
            if (z2) {
                j = ldc.f;
                int i4 = up2.c;
            } else {
                j = zp2.c;
            }
            wp2 up2Var = z2 ? new up2(ldc.b) : AppColor$Palette.EverFront;
            c530 c530Var = c530.a;
            f530 d = q791.d(bzk0.c(ymb1.l(ljs0.m(c530Var, 56.0f), cyk0.a), new up2(j), qke.q), z, null, null, slsVar, 14);
            boolean k = btsVar.k(str);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new g8r0(str, 23);
                btsVar.o0(Q);
            }
            f530 b = fnq0.b(d, false, (tls) Q);
            z910 d2 = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar2 = androidx.compose.ui.node.d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, androidx.compose.ui.node.d.f, d2);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d3);
            sya1.a(epa1.c(), q6a1.c(ljs0.m(c530Var, 24.0f), z), null, up2Var, btsVar, 0, 4);
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ieg0(z, z2, slsVar, f530Var2, i, 1);
        }
    }

    public static final void d(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1593493523);
        if (btsVar.V(i & 1, i != 0)) {
            f530 o = an91.o(i9a1.f(ljs0.c), 0.0f, 120.0f, 0.0f, 0.0f, 13);
            sic a = qic.a(new i43(8.0f, true, new quz(11)), x4c.H, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, o);
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
            qje.W(btsVar, androidx.compose.ui.node.d.e, o2);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            pa90 m = mt71.m(t2h0.nfc_error_icon, 0, btsVar);
            c530 c530Var = c530.a;
            o4b1.b(m, null, ljs0.m(c530Var, 64.0f), null, null, 0.0f, null, btsVar, 440, 120);
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
            String e = ohb1.e(btsVar, cyh0.mt_error_title);
            ety0 ety0Var = xya1.d(btsVar).e.d;
            AppColor$Palette appColor$Palette = AppColor$Palette.EverFront;
            jeb1.f(e, null, appColor$Palette, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var, btsVar, 384, 0, 16378);
            jeb1.f(ohb1.e(btsVar, cyh0.mt_error_subtitle), an91.m(c530Var, 16.0f, 0.0f, 2), appColor$Palette, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar).g.a, btsVar, 432, 0, 16376);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new pjv0(i, 26);
        }
    }

    public static final void e(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(827540648);
        if (btsVar.V(i & 1, i != 0)) {
            f530 f = i9a1.f(ljs0.c);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, f);
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
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new f0z0(1);
                btsVar.o0(Q);
            }
            androidx.compose.ui.viewinterop.b.a((tls) Q, ljs0.m(c530.a, 64.0f), null, btsVar, 54, 4);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new pjv0(i, 27);
        }
    }

    public static final void f(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-373110126);
        if (btsVar.V(i & 1, i != 0)) {
            f530 o = an91.o(i9a1.f(ljs0.c), 0.0f, 120.0f, 0.0f, 0.0f, 13);
            sic a = qic.a(new i43(16.0f, true, new quz(11)), x4c.H, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, o);
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
            qje.W(btsVar, androidx.compose.ui.node.d.e, o2);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            o4b1.b(mt71.m(t2h0.nfc_success_icon, 0, btsVar), null, ljs0.m(c530.a, 64.0f), null, null, 0.0f, null, btsVar, 440, 120);
            jeb1.f(ohb1.e(btsVar, cyh0.mt_nfc_success_title), null, AppColor$Palette.EverFront, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar).e.d, btsVar, 384, 0, 16378);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new pjv0(i, 29);
        }
    }

    public static final void g(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1119456120);
        dmw0 dmw0Var = btsVar.a;
        if (btsVar.V(i & 1, i != 0)) {
            f530 f = i9a1.f(ljs0.c);
            sic a = qic.a(new i43(16.0f, true, new quz(11)), x4c.H, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, f);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            wls wlsVar = androidx.compose.ui.node.d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = androidx.compose.ui.node.d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = androidx.compose.ui.node.d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar4, d);
            c530 c530Var = c530.a;
            f530 m = ljs0.m(an91.o(c530Var, 0.0f, 80.0f, 0.0f, 0.0f, 13), 220.0f);
            z910 d2 = pi6.d(x4c.y, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar, m);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d3);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new f0z0(2);
                btsVar.o0(Q);
            }
            androidx.compose.ui.viewinterop.b.a((tls) Q, null, null, btsVar, 6, 6);
            btsVar.t(true);
            String e = ohb1.e(btsVar, cyh0.mt_nfc_waiting_title);
            ety0 ety0Var = xya1.d(btsVar).e.d;
            AppColor$Palette appColor$Palette = AppColor$Palette.EverFront;
            jeb1.f(e, null, appColor$Palette, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var, btsVar, 384, 0, 16378);
            jeb1.f(ohb1.e(btsVar, cyh0.mt_nfc_waiting_subtitle), an91.m(c530Var, 16.0f, 0.0f, 2), appColor$Palette, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar).g.a, btsVar, 432, 0, 16376);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new pjv0(i, 28);
        }
    }

    public static final void h(tls tlsVar, fid fidVar, int i) {
        tls tlsVar2 = tlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2075655939);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.e(tlsVar2) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 m = an91.m(i9a1.f(ljs0.c), 32.0f, 0.0f, 2);
            sic a = qic.a(lr20.e, x4c.H, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, m);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            wls wlsVar = androidx.compose.ui.node.d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = androidx.compose.ui.node.d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar3 = androidx.compose.ui.node.d.h;
            qje.M(btsVar, tlsVar3);
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar4, d);
            String e = ohb1.e(btsVar, cyh0.mt_qr_permission_title);
            ety0 ety0Var = xya1.d(btsVar).f.c;
            AppColor$Palette appColor$Palette = AppColor$Palette.EverFront;
            jeb1.f(e, null, appColor$Palette, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var, btsVar, 384, 0, 16378);
            c530 c530Var = c530.a;
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
            jeb1.f(ohb1.e(btsVar, cyh0.mt_qr_permission_subtitle), null, appColor$Palette, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar).g.a, btsVar, 384, 0, 16378);
            f530 b = m4m0.b(ymb1.l(ljs0.e(an91.m(n.e(c530Var, 24.0f, btsVar, c530Var, 1.0f), 28.0f, 0.0f, 2), 48.0f), cyk0.a), ldc.c, qke.q);
            awk0 awk0Var = new awk0(0);
            boolean z = (i2 & 14) == 4;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new lao0(24, tlsVar);
                btsVar.o0(Q);
            }
            f530 d2 = q791.d(b, false, null, awk0Var, (sls) Q, 11);
            z910 d3 = pi6.d(x4c.y, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d4 = androidx.compose.ui.b.d(btsVar, d2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d3);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d4);
            tlsVar2 = tlsVar;
            jeb1.f(ohb1.e(btsVar, cyh0.mt_qr_go_to_settings), null, appColor$Palette, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.b, btsVar, 384, 0, 16378);
            btsVar = btsVar;
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rhi0(i, 8, tlsVar2);
        }
    }

    public static final void i(int i, fid fidVar, sls slsVar, f530 f530Var, String str) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-763640384);
        int i2 = i | (btsVar2.k(str) ? 4 : 2) | (btsVar2.k(f530Var) ? 32 : 16) | (btsVar2.e(slsVar) ? 256 : 128);
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            f530 b = m4m0.b(ymb1.l(ljs0.e(f530Var, 48.0f), cyk0.a), ldc.c, qke.q);
            awk0 awk0Var = new awk0(0);
            boolean z = (i2 & 896) == 256;
            Object Q = btsVar2.Q();
            if (z || Q == did.a) {
                Q = new n7l0(18, slsVar);
                btsVar2.o0(Q);
            }
            f530 d = q791.d(b, false, null, awk0Var, (sls) Q, 11);
            z910 d2 = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar2, d);
            ohd.G1.getClass();
            sls slsVar2 = androidx.compose.ui.node.d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar2);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, androidx.compose.ui.node.d.f, d2);
            qje.W(btsVar2, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar2, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, androidx.compose.ui.node.d.h);
            qje.W(btsVar2, androidx.compose.ui.node.d.d, d3);
            jeb1.f(str, an91.m(c530.a, 16.0f, 0.0f, 2), AppColor$Palette.EverFront, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar2).g.b, btsVar2, (i2 & 14) | 432, 0, 16376);
            btsVar = btsVar2;
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nvs0(str, f530Var, slsVar, i, 13);
        }
    }

    public static final void j(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(226216300);
        if (btsVar.V(i & 1, i != 0)) {
            f530 o = an91.o(i9a1.f(ljs0.c(c530.a, 1.0f)), 0.0f, 48.0f, 0.0f, 0.0f, 13);
            z910 d = pi6.d(x4c.c, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, o);
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
            qje.W(btsVar, androidx.compose.ui.node.d.e, o2);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            jeb1.f(ohb1.e(btsVar, cyh0.mt_qr_scan_hint), null, AppColor$Palette.EverFront, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar).g.b, btsVar, 384, 0, 16378);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new pjv0(i, 25);
        }
    }

    public static final void k(v1z0 v1z0Var, boolean z, tls tlsVar, fid fidVar, int i) {
        int i2;
        tls tlsVar2;
        com.yandex.go.masstransit.sdk.camera.ml.b bVar;
        MtQRCameraPreview mtQRCameraPreview;
        int i3;
        boolean z2;
        boolean a;
        Object Q;
        boolean c;
        Object Q2;
        v1z0 v1z0Var2 = v1z0Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-486533380);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(v1z0Var2) : btsVar.e(v1z0Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            tlsVar2 = tlsVar;
            i2 |= btsVar.e(tlsVar2) ? 256 : 128;
        } else {
            tlsVar2 = tlsVar;
        }
        int i4 = i2;
        if (btsVar.V(i4 & 1, (i4 & 147) != 146)) {
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            int i5 = (int) (8.0f * context.getResources().getDisplayMetrics().density);
            Object Q3 = btsVar.Q();
            o430 o430Var = did.a;
            if (Q3 == o430Var) {
                MtQRCameraPreview mtQRCameraPreview2 = new MtQRCameraPreview(context, null, 0, 0, 14, null);
                btsVar.o0(mtQRCameraPreview2);
                Q3 = mtQRCameraPreview2;
            }
            MtQRCameraPreview mtQRCameraPreview3 = (MtQRCameraPreview) Q3;
            Object Q4 = btsVar.Q();
            if (Q4 == o430Var) {
                Q4 = new com.yandex.go.masstransit.sdk.camera.ml.b(context, mtQRCameraPreview3, bvf0.b());
                btsVar.o0(Q4);
            }
            com.yandex.go.masstransit.sdk.camera.ml.b bVar2 = (com.yandex.go.masstransit.sdk.camera.ml.b) Q4;
            boolean k = btsVar.k(context);
            Object Q5 = btsVar.Q();
            if (k || Q5 == o430Var) {
                ycg0 ycg0Var = new ycg0(new zst(context.getApplicationContext()), new v5c0(19, new xkt()));
                btsVar.o0(ycg0Var);
                Q5 = ycg0Var;
            }
            ycg0 ycg0Var2 = (ycg0) Q5;
            Object Q6 = btsVar.Q();
            if (Q6 == o430Var) {
                Q6 = f.j(Boolean.FALSE);
                btsVar.o0(Q6);
            }
            oz40 oz40Var = (oz40) Q6;
            boolean e = ((i4 & 896) == 256) | btsVar.e(bVar2) | btsVar.e(ycg0Var2) | btsVar.e(mtQRCameraPreview3) | btsVar.c(i5);
            Object Q7 = btsVar.Q();
            if (e || Q7 == o430Var) {
                ric ricVar = new ric(bVar2, ycg0Var2, mtQRCameraPreview3, tlsVar2, i5);
                bVar = bVar2;
                mtQRCameraPreview = mtQRCameraPreview3;
                i3 = i5;
                btsVar.o0(ricVar);
                Q7 = ricVar;
            } else {
                mtQRCameraPreview = mtQRCameraPreview3;
                i3 = i5;
                bVar = bVar2;
            }
            zpn.a(zy11.a, (tls) Q7, btsVar);
            boolean z3 = v1z0Var2 instanceof t1z0;
            if (z3) {
                t1z0 t1z0Var = (t1z0) v1z0Var2;
                if (t1z0Var.a == null && t1z0Var.b) {
                    z2 = true;
                    Boolean valueOf = Boolean.valueOf(z3);
                    Boolean valueOf2 = Boolean.valueOf(z2);
                    int i6 = i4 & 14;
                    a = btsVar.a(z2) | btsVar.e(mtQRCameraPreview) | btsVar.e(bVar) | (i6 != 4 || ((i4 & 8) != 0 && btsVar.e(v1z0Var2)));
                    Q = btsVar.Q();
                    if (!a || Q == o430Var) {
                        TicketActivationScanModalScreenKt$TicketActivationScanModalScreen$2$1 ticketActivationScanModalScreenKt$TicketActivationScanModalScreen$2$1 = new TicketActivationScanModalScreenKt$TicketActivationScanModalScreen$2$1(z2, mtQRCameraPreview, bVar, v1z0Var2, null);
                        v1z0Var2 = v1z0Var2;
                        btsVar.o0(ticketActivationScanModalScreenKt$TicketActivationScanModalScreen$2$1);
                        Q = ticketActivationScanModalScreenKt$TicketActivationScanModalScreen$2$1;
                    }
                    zpn.f(valueOf, valueOf2, (wls) Q, btsVar);
                    c = (i6 != 4 || ((i4 & 8) != 0 && btsVar.e(v1z0Var2))) | btsVar.c(i3) | btsVar.e(mtQRCameraPreview) | btsVar.e(bVar);
                    Q2 = btsVar.Q();
                    if (!c || Q2 == o430Var) {
                        TicketActivationScanModalScreenKt$TicketActivationScanModalScreen$3$1 ticketActivationScanModalScreenKt$TicketActivationScanModalScreen$3$1 = new TicketActivationScanModalScreenKt$TicketActivationScanModalScreen$3$1(v1z0Var2, mtQRCameraPreview, bVar, i3, null);
                        btsVar.o0(ticketActivationScanModalScreenKt$TicketActivationScanModalScreen$3$1);
                        Q2 = ticketActivationScanModalScreenKt$TicketActivationScanModalScreen$3$1;
                    }
                    zpn.e(btsVar, (wls) Q2, v1z0Var2);
                    qy20.a(null, null, null, false, wwg.S(444351514, true, new e1z0(v1z0Var2, mtQRCameraPreview, tlsVar, z, bVar, oz40Var), btsVar), btsVar, 27648, 7);
                }
            }
            z2 = false;
            Boolean valueOf3 = Boolean.valueOf(z3);
            Boolean valueOf22 = Boolean.valueOf(z2);
            int i62 = i4 & 14;
            a = btsVar.a(z2) | btsVar.e(mtQRCameraPreview) | btsVar.e(bVar) | (i62 != 4 || ((i4 & 8) != 0 && btsVar.e(v1z0Var2)));
            Q = btsVar.Q();
            if (!a) {
            }
            TicketActivationScanModalScreenKt$TicketActivationScanModalScreen$2$1 ticketActivationScanModalScreenKt$TicketActivationScanModalScreen$2$12 = new TicketActivationScanModalScreenKt$TicketActivationScanModalScreen$2$1(z2, mtQRCameraPreview, bVar, v1z0Var2, null);
            v1z0Var2 = v1z0Var2;
            btsVar.o0(ticketActivationScanModalScreenKt$TicketActivationScanModalScreen$2$12);
            Q = ticketActivationScanModalScreenKt$TicketActivationScanModalScreen$2$12;
            zpn.f(valueOf3, valueOf22, (wls) Q, btsVar);
            c = (i62 != 4 || ((i4 & 8) != 0 && btsVar.e(v1z0Var2))) | btsVar.c(i3) | btsVar.e(mtQRCameraPreview) | btsVar.e(bVar);
            Q2 = btsVar.Q();
            if (!c) {
            }
            TicketActivationScanModalScreenKt$TicketActivationScanModalScreen$3$1 ticketActivationScanModalScreenKt$TicketActivationScanModalScreen$3$12 = new TicketActivationScanModalScreenKt$TicketActivationScanModalScreen$3$1(v1z0Var2, mtQRCameraPreview, bVar, i3, null);
            btsVar.o0(ticketActivationScanModalScreenKt$TicketActivationScanModalScreen$3$12);
            Q2 = ticketActivationScanModalScreenKt$TicketActivationScanModalScreen$3$12;
            zpn.e(btsVar, (wls) Q2, v1z0Var2);
            qy20.a(null, null, null, false, wwg.S(444351514, true, new e1z0(v1z0Var2, mtQRCameraPreview, tlsVar, z, bVar, oz40Var), btsVar), btsVar, 27648, 7);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kj5(v1z0Var, z, tlsVar, i, 18);
        }
    }
}
