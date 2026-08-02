package com.yandex.messaging.ui.main.telemessenger.connection;

import android.content.Context;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import defpackage.aii0;
import defpackage.ba91;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.hs31;
import defpackage.i9a;
import defpackage.jjo;
import defpackage.kbm;
import defpackage.ldc;
import defpackage.m0t0;
import defpackage.mgv;
import defpackage.o430;
import defpackage.ohb1;
import defpackage.ooc;
import defpackage.oz40;
import defpackage.pa90;
import defpackage.q7u;
import defpackage.qnm;
import defpackage.qoi0;
import defpackage.r5e;
import defpackage.rs31;
import defpackage.sb2;
import defpackage.tbb;
import defpackage.tls;
import defpackage.ubn;
import defpackage.uwk0;
import defpackage.vfc;
import defpackage.vqb;
import defpackage.w4;
import defpackage.w8f;
import defpackage.wls;
import defpackage.wwg0;
import defpackage.xsm;
import defpackage.yr31;
import defpackage.ysm;
import defpackage.z5b1;
import defpackage.zpn;
import defpackage.zwv;
import defpackage.zy11;

/* loaded from: classes11.dex */
public abstract class a {
    public static final void a(r5e r5eVar, fid fidVar, int i) {
        xsm xsmVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-994190498);
        int i2 = 7;
        if (((i | 2) & 3) == 2 && btsVar.E()) {
            btsVar.Y();
        } else {
            btsVar.a0();
            int i3 = i & 1;
            o430 o430Var = did.a;
            if (i3 == 0 || btsVar.C()) {
                btsVar.e0(-897180073);
                rs31 b = jjo.b(btsVar);
                hs31 a = jjo.a(btsVar);
                btsVar.e0(544794079);
                boolean e = btsVar.e(a);
                Object Q = btsVar.Q();
                if (e || Q == o430Var) {
                    Q = new w4(a, i2);
                    btsVar.o0(Q);
                }
                tls tlsVar = (tls) Q;
                btsVar.t(false);
                yr31 G = ooc.G(qoi0.a(r5e.class), b, null, vfc.h(r5e.class, new zwv(), tlsVar), b instanceof q7u ? ((q7u) b).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
                btsVar.t(false);
                r5eVar = (r5e) G;
            } else {
                btsVar.Y();
            }
            btsVar.u();
            ldc ldcVar = null;
            oz40 c = androidx.lifecycle.compose.a.c(r5eVar.w, null, btsVar, 0, 7);
            ysm e2 = com.yx360.design.compose.atoms.snackbar.a.e(btsVar);
            Boolean bool = (Boolean) ((m0t0) c.getValue()).f.getValue();
            bool.booleanValue();
            btsVar.e0(-1832754634);
            boolean k = btsVar.k(c) | btsVar.k(e2);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                Q2 = new ConnectionStatusContentKt$ConnectionStatusContent$1$1(e2, c, null);
                btsVar.o0(Q2);
            }
            btsVar.t(false);
            zpn.e(btsVar, (wls) Q2, bool);
            if (((Boolean) ((m0t0) c.getValue()).f.getValue()).booleanValue()) {
                if (((m0t0) c.getValue()).c) {
                    btsVar.e0(-980629766);
                    b(((m0t0) c.getValue()).a, e2, btsVar, 0);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-980467760);
                    Integer num = ((m0t0) c.getValue()).a;
                    String e3 = num == null ? null : ohb1.e(btsVar, num.intValue());
                    if (e3 == null) {
                        e3 = "";
                    }
                    mgv mgvVar = ((m0t0) c.getValue()).b;
                    btsVar.e0(-1832738910);
                    if (mgvVar == null) {
                        xsmVar = null;
                    } else {
                        btsVar.e0(-1832735540);
                        if (((m0t0) c.getValue()).d) {
                            qnm qnmVar = qnm.a;
                            ldcVar = new ldc(qnm.c(btsVar).f());
                        }
                        btsVar.t(false);
                        btsVar.e0(1923357111);
                        xsm xsmVar2 = new xsm(ba91.c(mgvVar, btsVar), ldcVar);
                        btsVar.t(false);
                        xsmVar = xsmVar2;
                    }
                    btsVar.t(false);
                    com.yx360.design.compose.atoms.snackbar.a.a(e3, null, xsmVar, null, e2, btsVar, 512, 58);
                    btsVar.t(false);
                }
            }
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new tbb(r5eVar, i, i2);
        }
    }

    public static final void b(Integer num, ysm ysmVar, fid fidVar, int i) {
        uwk0 uwk0Var;
        ysm ysmVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-282672146);
        int i2 = (btsVar.k(num) ? 4 : 2) | i | (btsVar.k(ysmVar) ? 32 : 16);
        if ((i2 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
            ysmVar2 = ysmVar;
        } else {
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            btsVar.e0(-1210472001);
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (Q == obj) {
                Q = AnimatedVectorDrawableCompat.create(context, wwg0.msg_ic_connection_progress_chat_list);
                btsVar.o0(Q);
            }
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = (AnimatedVectorDrawableCompat) Q;
            btsVar.t(false);
            btsVar.e0(-1210466796);
            boolean e = btsVar.e(animatedVectorDrawableCompat);
            Object Q2 = btsVar.Q();
            if (e || Q2 == obj) {
                Q2 = new ConnectionStatusContentKt$ConnectionStatusProgress$1$1(animatedVectorDrawableCompat, null);
                btsVar.o0(Q2);
            }
            btsVar.t(false);
            zy11 zy11Var = zy11.a;
            zpn.e(btsVar, (wls) Q2, zy11Var);
            btsVar.e0(-1210464831);
            boolean e2 = btsVar.e(animatedVectorDrawableCompat);
            Object Q3 = btsVar.Q();
            if (e2 || Q3 == obj) {
                Q3 = new vqb(20, animatedVectorDrawableCompat);
                btsVar.o0(Q3);
            }
            btsVar.t(false);
            zpn.a(zy11Var, (tls) Q3, btsVar);
            pa90 a = kbm.a(animatedVectorDrawableCompat, btsVar);
            btsVar.e0(756839733);
            if (a == null) {
                btsVar.t(false);
                uwk0Var = null;
            } else {
                btsVar.e0(-2067824474);
                boolean k = btsVar.k(a);
                Object Q4 = btsVar.Q();
                if (k || Q4 == obj) {
                    Q4 = new uwk0(a);
                    btsVar.o0(Q4);
                }
                uwk0Var = (uwk0) Q4;
                btsVar.t(false);
                uwk0Var.z.setFloatValue(((Number) z5b1.d(z5b1.g("spinner", btsVar, 0), 0.0f, 360.0f, sb2.w(sb2.K(1000, 0, ubn.d, 2), RepeatMode.Restart, 0L, 4), "spinner-rotation", btsVar, 29112, 0).w.getValue()).floatValue());
                btsVar.t(false);
            }
            String e3 = num == null ? null : ohb1.e(btsVar, num.intValue());
            if (e3 == null) {
                e3 = "";
            }
            ysmVar2 = ysmVar;
            com.yx360.design.compose.atoms.snackbar.a.a(e3, null, uwk0Var != null ? new xsm(uwk0Var, null) : null, null, ysmVar2, btsVar, 512 | ((i2 << 15) & 3670016), 58);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i9a(num, ysmVar2, i, 26);
        }
    }
}
