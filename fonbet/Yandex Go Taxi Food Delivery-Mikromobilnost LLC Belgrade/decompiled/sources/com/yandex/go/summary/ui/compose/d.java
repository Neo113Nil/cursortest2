package com.yandex.go.summary.ui.compose;

import androidx.compose.runtime.f;
import com.yandex.go.summary.ui.compose.common.bottomsheet.i;
import defpackage.aii0;
import defpackage.ax20;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.ft0;
import defpackage.gp5;
import defpackage.jeb1;
import defpackage.ohd;
import defpackage.omu0;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.qje;
import defpackage.qor;
import defpackage.r1b0;
import defpackage.sls;
import defpackage.tls;
import defpackage.tpr;
import defpackage.vfc;
import defpackage.wg6;
import defpackage.wls;
import defpackage.x4c;
import defpackage.ya2;
import defpackage.yn91;
import defpackage.yur;
import defpackage.yw20;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zqv0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes14.dex */
public abstract class d {
    public static final void a(zqv0 zqv0Var, wg6 wg6Var, yur yurVar, yur yurVar2, yur yurVar3, yur yurVar4, yur yurVar5, fid fidVar, int i) {
        int i2;
        yur yurVar6;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2125469538);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(zqv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(wg6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(yurVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(yurVar2) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.k(yurVar3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.k(yurVar4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            yurVar6 = yurVar5;
            i2 |= btsVar.k(yurVar6) ? 1048576 : 524288;
        } else {
            yurVar6 = yurVar5;
        }
        if (btsVar.V(i2 & 1, (i2 & 599187) != 599186)) {
            oz40 n = f.n(zqv0Var, btsVar);
            yw20 yw20Var = (yw20) btsVar.m(ax20.a);
            Object[] objArr = {n, wg6Var, yurVar, yurVar2, yurVar3, yurVar4, yurVar6, yw20Var};
            boolean e = ((3670016 & i2) == 1048576) | ((i2 & 112) == 32) | btsVar.e(yw20Var) | btsVar.k(n) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                SummaryPaneKt$ForceFocusEffect$1$1 summaryPaneKt$ForceFocusEffect$1$1 = new SummaryPaneKt$ForceFocusEffect$1$1(wg6Var, yurVar5, yw20Var, n, yurVar3, yurVar4, yurVar, yurVar2, null);
                btsVar.o0(summaryPaneKt$ForceFocusEffect$1$1);
                Q = summaryPaneKt$ForceFocusEffect$1$1;
            }
            zpn.h(objArr, (wls) Q, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ft0(zqv0Var, wg6Var, yurVar, yurVar2, yurVar3, yurVar4, yurVar5, i, 3);
        }
    }

    public static final void b(zqv0 zqv0Var, f530 f530Var, boolean z, tls tlsVar, tls tlsVar2, tpr tprVar, fid fidVar, int i) {
        f530 f530Var2;
        f530 f530Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1981606212);
        int i2 = i | (btsVar.k(zqv0Var) ? 4 : 2) | 48 | (btsVar.a(z) ? 256 : 128) | (btsVar.e(tlsVar) ? 2048 : 1024) | (btsVar.e(tlsVar2) ? 16384 : 8192) | (btsVar.k(tprVar) ? 131072 : 65536);
        if (btsVar.V(i2 & 1, (i2 & 74899) != 74898)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                f530Var3 = c530.a;
            } else {
                btsVar.Y();
                f530Var3 = f530Var;
            }
            btsVar.u();
            wg6 a = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 1000.0f, null, z, null, null, null, null, btsVar, ((i2 << 18) & 234881024) | 25008, 0, 7913);
            boolean k = btsVar.k(a);
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (k || Q == obj) {
                Q = jeb1.g(f.d(new gp5(a, 27)));
                btsVar.o0(Q);
            }
            qor qorVar = (qor) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == obj) {
                Q2 = new omu0(22);
                btsVar.o0(Q2);
            }
            tls g = yn91.g(tlsVar, (tls) Q2, btsVar, ((i2 >> 9) & 14) | 48);
            Object Q3 = btsVar.Q();
            if (Q3 == obj) {
                Q3 = vfc.g(btsVar);
            }
            yur yurVar = (yur) Q3;
            Object Q4 = btsVar.Q();
            if (Q4 == obj) {
                Q4 = vfc.g(btsVar);
            }
            yur yurVar2 = (yur) Q4;
            Object Q5 = btsVar.Q();
            if (Q5 == obj) {
                Q5 = vfc.g(btsVar);
            }
            yur yurVar3 = (yur) Q5;
            Object Q6 = btsVar.Q();
            if (Q6 == obj) {
                Q6 = vfc.g(btsVar);
            }
            yur yurVar4 = (yur) Q6;
            Object Q7 = btsVar.Q();
            if (Q7 == obj) {
                Q7 = vfc.g(btsVar);
            }
            yur yurVar5 = (yur) Q7;
            f530 f530Var4 = f530Var3;
            a(zqv0Var, a, yurVar, yurVar2, yurVar3, yurVar4, yurVar5, btsVar, (i2 & 14) | 1797504);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, f530Var4);
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
            com.yandex.go.summary.ui.compose.mapcontent.a.a(zqv0Var.a, null, yurVar, qorVar, g, btsVar, 384);
            btsVar = btsVar;
            int i3 = i2 << 12;
            i.h(zqv0Var.b, null, a, yurVar2, yurVar3, yurVar4, yurVar5, tlsVar, tlsVar2, tprVar, btsVar, (i3 & 1879048192) | (29360128 & i3) | 1797120 | (i3 & 234881024));
            btsVar.t(true);
            f530Var2 = f530Var4;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ya2(zqv0Var, f530Var2, z, tlsVar, tlsVar2, tprVar, i);
        }
    }
}
