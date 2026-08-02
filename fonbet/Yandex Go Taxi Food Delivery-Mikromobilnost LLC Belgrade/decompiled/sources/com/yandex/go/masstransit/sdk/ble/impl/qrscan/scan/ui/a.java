package com.yandex.go.masstransit.sdk.ble.impl.qrscan.scan.ui;

import android.content.Context;
import android.graphics.Rect;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.n;
import androidx.compose.ui.viewinterop.b;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.masstransit.sdk.camera.view.MtQRCameraPreview;
import defpackage.aii0;
import defpackage.an91;
import defpackage.bgr0;
import defpackage.bmt0;
import defpackage.bo60;
import defpackage.bts;
import defpackage.c530;
import defpackage.cea1;
import defpackage.cma1;
import defpackage.cyh0;
import defpackage.dda1;
import defpackage.did;
import defpackage.dmw0;
import defpackage.eyr;
import defpackage.f530;
import defpackage.fid;
import defpackage.gi91;
import defpackage.gv40;
import defpackage.gxv;
import defpackage.hk2;
import defpackage.hob1;
import defpackage.hzr;
import defpackage.i43;
import defpackage.izr;
import defpackage.jeb1;
import defpackage.k5z;
import defpackage.keg0;
import defpackage.khl0;
import defpackage.kk2;
import defpackage.ldc;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lkx;
import defpackage.lr20;
import defpackage.lt90;
import defpackage.lzr;
import defpackage.ne5;
import defpackage.nih;
import defpackage.o430;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.os;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.q791;
import defpackage.qeg0;
import defpackage.qic;
import defpackage.qje;
import defpackage.quz;
import defpackage.qy20;
import defpackage.r1b0;
import defpackage.reg0;
import defpackage.rly0;
import defpackage.sic;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.soy0;
import defpackage.t240;
import defpackage.td5;
import defpackage.th40;
import defpackage.tls;
import defpackage.tra1;
import defpackage.tse;
import defpackage.ttm;
import defpackage.u5;
import defpackage.ueg0;
import defpackage.uh6;
import defpackage.ukb0;
import defpackage.uog0;
import defpackage.v5c0;
import defpackage.vfc;
import defpackage.vnf0;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.xeg0;
import defpackage.xjx;
import defpackage.xkt;
import defpackage.xya1;
import defpackage.xz3;
import defpackage.ycg0;
import defpackage.yeg0;
import defpackage.yur;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zst;
import defpackage.zy11;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class a {
    public static final void a(yeg0 yeg0Var, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        tls tlsVar2;
        Object qrScanCameraHostKt$QrScanCameraHost$3$1;
        Object obj;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2055759036);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(yeg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            tlsVar2 = tlsVar;
            i2 |= btsVar.e(tlsVar2) ? 32 : 16;
        } else {
            tlsVar2 = tlsVar;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            Object Q = btsVar.Q();
            Object obj2 = did.a;
            if (Q == obj2) {
                Q = zpn.j(EmptyCoroutineContext.a, btsVar);
                btsVar.o0(Q);
            }
            Object obj3 = (tse) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == obj2) {
                Q2 = f.j(null);
                btsVar.o0(Q2);
            }
            oz40 oz40Var = (oz40) Q2;
            Object Q3 = btsVar.Q();
            if (Q3 == obj2) {
                Q3 = f.j(null);
                btsVar.o0(Q3);
            }
            oz40 oz40Var2 = (oz40) Q3;
            boolean k = btsVar.k(context);
            Object Q4 = btsVar.Q();
            if (k || Q4 == obj2) {
                Q4 = new ycg0(new zst(context.getApplicationContext()), new v5c0(19, new xkt()));
                btsVar.o0(Q4);
            }
            ycg0 ycg0Var = (ycg0) Q4;
            Object Q5 = btsVar.Q();
            if (Q5 == obj2) {
                Q5 = new ttm(13, oz40Var2);
                btsVar.o0(Q5);
            }
            zpn.a(zy11.a, (tls) Q5, btsVar);
            boolean e = btsVar.e(obj3);
            Object Q6 = btsVar.Q();
            if (e || Q6 == obj2) {
                Q6 = new th40(22, obj3, oz40Var, oz40Var2);
                btsVar.o0(Q6);
            }
            b.a((tls) Q6, f530Var, null, btsVar, (i2 >> 3) & 112, 4);
            xeg0 xeg0Var = yeg0Var.a;
            MtQRCameraPreview mtQRCameraPreview = (MtQRCameraPreview) oz40Var.getValue();
            com.yandex.go.masstransit.sdk.camera.ml.b bVar = (com.yandex.go.masstransit.sdk.camera.ml.b) oz40Var2.getValue();
            int i3 = i2 & 14;
            boolean e2 = ((i2 & 112) == 32) | (i3 == 4) | btsVar.e(ycg0Var);
            Object Q7 = btsVar.Q();
            if (e2 || Q7 == obj2) {
                obj = obj2;
                qrScanCameraHostKt$QrScanCameraHost$3$1 = new QrScanCameraHostKt$QrScanCameraHost$3$1(yeg0Var, ycg0Var, oz40Var, oz40Var2, tlsVar2, null);
                btsVar.o0(qrScanCameraHostKt$QrScanCameraHost$3$1);
            } else {
                qrScanCameraHostKt$QrScanCameraHost$3$1 = Q7;
                obj = obj2;
            }
            zpn.g(xeg0Var, mtQRCameraPreview, bVar, (wls) qrScanCameraHostKt$QrScanCameraHost$3$1, btsVar);
            Boolean valueOf = Boolean.valueOf(yeg0Var.c);
            com.yandex.go.masstransit.sdk.camera.ml.b bVar2 = (com.yandex.go.masstransit.sdk.camera.ml.b) oz40Var2.getValue();
            boolean z = i3 == 4;
            Object Q8 = btsVar.Q();
            if (z || Q8 == obj) {
                Q8 = new QrScanCameraHostKt$QrScanCameraHost$4$1(yeg0Var, oz40Var2, null);
                btsVar.o0(Q8);
            }
            zpn.f(valueOf, bVar2, (wls) Q8, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0(yeg0Var, tlsVar, f530Var, i, 2);
        }
    }

    public static final void b(yeg0 yeg0Var, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-857005930);
        int i2 = (btsVar.k(yeg0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (!btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.Y();
        } else if (((Boolean) btsVar.m(n.a)).booleanValue()) {
            btsVar.e0(-1777894391);
            keg0.a(yeg0Var, f530Var, btsVar, (i2 & 14) | 48);
            btsVar.t(false);
        } else {
            btsVar.e0(-1777789828);
            a(yeg0Var, tlsVar, f530Var, btsVar, i2 & 1022);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qeg0(yeg0Var, tlsVar, f530Var, i, 0);
        }
    }

    public static final void c(int i, fid fidVar, tls tlsVar, f530 f530Var, String str) {
        tls tlsVar2;
        yur yurVar;
        sls slsVar;
        tls tlsVar3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-337652212);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = vfc.g(btsVar);
            }
            yur yurVar2 = (yur) Q;
            boolean z = str.length() >= 6;
            long a = hob1.a(btsVar, uog0.mt_qr_placeholder_color);
            int i3 = i2 & 14;
            boolean d = (i3 == 4) | btsVar.d(a);
            Object Q2 = btsVar.Q();
            if (d || Q2 == o430Var) {
                int max = Math.max(0, 6 - str.length());
                hk2 hk2Var = new hk2(0);
                int h = hk2Var.h(new bmt0(ldc.f, 0L, (lzr) null, (hzr) null, (izr) null, (eyr) null, (String) null, 0L, (td5) null, (soy0) null, (k5z) null, 0L, (rly0) null, (bgr0) null, 65534));
                try {
                    hk2Var.d(str);
                    hk2Var.g(h);
                    h = hk2Var.h(new bmt0(a, 0L, (lzr) null, (hzr) null, (izr) null, (eyr) null, (String) null, 0L, (td5) null, (soy0) null, (k5z) null, 0L, (rly0) null, (bgr0) null, 65534));
                    for (int i4 = 0; i4 < max; i4++) {
                        try {
                            hk2Var.d("0");
                        } finally {
                        }
                    }
                    hk2Var.g(h);
                    Q2 = hk2Var.i();
                    btsVar.o0(Q2);
                } finally {
                }
            }
            kk2 kk2Var = (kk2) Q2;
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = new QrScanEnterNumberContentKt$QrScanEnterNumberContent$1$1(yurVar2, null);
                btsVar.o0(Q3);
            }
            zpn.e(btsVar, (wls) Q3, zy11.a);
            f530 k = f530Var.k(ljs0.c);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, k);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a2);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar4 = d.h;
            qje.M(btsVar, tlsVar4);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            String e = ohb1.e(btsVar, cyh0.mt_qr_enter_number_hint);
            c530 c530Var = c530.a;
            boolean z2 = z;
            jeb1.a(e, an91.o(ljs0.c(c530Var, 1.0f), 16.0f, 32.0f, 16.0f, 0.0f, 8), ldc.f, uh6.E(16), 0L, new sjy0(3), 0L, 0, false, 0, 0, null, btsVar, 3456);
            f530 c = ljs0.c(new x2y(1.0f, true), 1.0f);
            Object Q4 = btsVar.Q();
            if (Q4 == o430Var) {
                yurVar = yurVar2;
                Q4 = new bo60(yurVar, 1);
                btsVar.o0(Q4);
            } else {
                yurVar = yurVar2;
            }
            f530 d3 = q791.d(c, false, null, null, (sls) Q4, 15);
            z910 d4 = pi6.d(x4c.y, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d5 = androidx.compose.ui.b.d(btsVar, d3);
            btsVar.i0();
            if (btsVar.S) {
                slsVar = slsVar2;
                btsVar.n(slsVar);
            } else {
                slsVar = slsVar2;
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d4);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar4);
            qje.W(btsVar, wlsVar4, d5);
            sls slsVar3 = slsVar;
            yur yurVar3 = yurVar;
            jeb1.b(kk2Var, an91.m(ljs0.c(c530Var, 1.0f), 16.0f, 0.0f, 2), 0L, uh6.E(80), 0L, new sjy0(3), 0L, 0, false, 1, 0, null, null, null, btsVar, 3120);
            int i5 = i2 & 112;
            boolean z3 = i5 == 32;
            Object Q5 = btsVar.Q();
            if (z3 || Q5 == o430Var) {
                tlsVar3 = tlsVar;
                Q5 = new gv40(17, tlsVar3);
                btsVar.o0(Q5);
            } else {
                tlsVar3 = tlsVar;
            }
            tls tlsVar5 = (tls) Q5;
            f530 b = gi91.b(tra1.b(ljs0.m(c530Var, 1.0f), 0.0f), yurVar3);
            lkx lkxVar = new lkx(0, 3, 7, HProv.PP_CACHE_SIZE);
            boolean a3 = btsVar.a(z2) | (i5 == 32);
            Object Q6 = btsVar.Q();
            if (a3 || Q6 == o430Var) {
                Q6 = new xz3(z2, tlsVar3, 15);
                btsVar.o0(Q6);
            }
            ne5.b(str, tlsVar5, b, false, false, null, lkxVar, new xjx(62, (tls) Q6), false, 0, 0, null, null, null, null, null, btsVar, i3 | 1572864, 0, 65336);
            btsVar = btsVar;
            btsVar.t(true);
            f530 l = an91.l(ljs0.c(c530Var, 1.0f), 16.0f, 12.0f);
            lhl0 a4 = khl0.a(new i43(8.0f, true, new quz(11)), x4c.D, btsVar, 6);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d6 = androidx.compose.ui.b.d(btsVar, l);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a4);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar4);
            qje.W(btsVar, wlsVar4, d6);
            String e2 = ohb1.e(btsVar, cyh0.mt_qr_back_to_camera);
            boolean z4 = i5 == 32;
            Object Q7 = btsVar.Q();
            if (z4 || Q7 == o430Var) {
                tlsVar2 = tlsVar;
                Q7 = new ukb0(9, tlsVar2);
                btsVar.o0(Q7);
            } else {
                tlsVar2 = tlsVar;
            }
            sls slsVar4 = (sls) Q7;
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            dda1.f(0, 8, btsVar, slsVar4, new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), e2, false);
            String e3 = ohb1.e(btsVar, cyh0.mt_qr_done);
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            x2y x2yVar = new x2y(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
            boolean a5 = btsVar.a(z2) | (i5 == 32);
            Object Q8 = btsVar.Q();
            if (a5 || Q8 == o430Var) {
                Q8 = new nih(z2, tlsVar2, 2);
                btsVar.o0(Q8);
            }
            dda1.f(0, 0, btsVar, (sls) Q8, x2yVar, e3, z2);
            btsVar.t(true);
            btsVar.t(true);
        } else {
            tlsVar2 = tlsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t240(str, tlsVar2, f530Var, i, 29);
        }
    }

    public static final void d(int i, fid fidVar, tls tlsVar, f530 f530Var) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1015223509);
        int i2 = (btsVar.e(tlsVar) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 k = f530Var.k(ljs0.c);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, k);
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
            cea1.a(i2 & 14, btsVar, tlsVar, null);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new reg0(tlsVar, f530Var, i);
        }
    }

    public static final void e(yeg0 yeg0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(723545875);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(yeg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            qy20.a(null, null, null, false, wwg.S(-700072527, true, new u5(8, yeg0Var, tlsVar), btsVar), btsVar, 27648, 7);
            xeg0 xeg0Var = yeg0Var.a;
            ueg0 ueg0Var = xeg0Var instanceof ueg0 ? (ueg0) xeg0Var : null;
            Rect rect = ueg0Var != null ? ueg0Var.a : null;
            if (rect != null) {
                btsVar.e0(-457060593);
                z = !((Boolean) btsVar.m(n.a)).booleanValue();
                btsVar.t(false);
            } else {
                btsVar.e0(-1283975258);
                btsVar.t(false);
                z = false;
            }
            if (z) {
                btsVar.e0(-1283944284);
                boolean z2 = (i2 & 112) == 32;
                Object Q = btsVar.Q();
                if (z2 || Q == did.a) {
                    Q = new QrScanScreenKt$QrScanScreen$2$1(tlsVar, null);
                    btsVar.o0(Q);
                }
                zpn.e(btsVar, (wls) Q, rect);
                btsVar.t(false);
            } else {
                btsVar.e0(-1283841457);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(yeg0Var, tlsVar, i, 11);
        }
    }

    public static final void f(f530 f530Var, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(490305578);
        int i2 = i | (btsVar2.k(f530Var) ? 4 : 2);
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar = btsVar2;
            jeb1.f(ohb1.e(btsVar2, cyh0.mt_qr_scan_title), f530Var, AppColor$Palette.EverFront, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.e(btsVar2).f.c, btsVar, ((i2 << 3) & 112) | 384, 0, 16248);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new os(f530Var, i, 29);
        }
    }
}
