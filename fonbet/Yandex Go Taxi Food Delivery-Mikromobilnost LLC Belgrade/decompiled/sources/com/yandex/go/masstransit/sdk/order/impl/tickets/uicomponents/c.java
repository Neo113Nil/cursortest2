package com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents;

import androidx.compose.runtime.f;
import androidx.compose.ui.platform.j;
import defpackage.a7y;
import defpackage.a990;
import defpackage.adb1;
import defpackage.aii0;
import defpackage.an91;
import defpackage.at5;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.fwi;
import defpackage.j940;
import defpackage.k3r;
import defpackage.l690;
import defpackage.ljs0;
import defpackage.oc0;
import defpackage.oz40;
import defpackage.sls;
import defpackage.squ;
import defpackage.tls;
import defpackage.u510;
import defpackage.ugh;
import defpackage.wls;
import defpackage.zpn;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class c {
    public static final void a(int i, fid fidVar, tls tlsVar, tls tlsVar2, j940 j940Var, ru.yandex.taxi.masstransit.tickets.c cVar) {
        int i2;
        androidx.compose.foundation.lazy.b bVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1492156468);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(j940Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(cVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            List list = j940Var.e;
            if (list == null) {
                list = EmptyList.a;
            }
            androidx.compose.foundation.lazy.b a = a7y.a(0, 3, btsVar);
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (Q == obj) {
                Q = f.j(Boolean.FALSE);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            float w0 = ((fwi) btsVar.m(j.h)).w0(10.0f);
            boolean k = btsVar.k(list);
            Object Q2 = btsVar.Q();
            if (k || Q2 == obj) {
                Q2 = new oc0(list, 4);
                btsVar.o0(Q2);
            }
            ugh b = a990.b(0, (sls) Q2, btsVar, 0, 2);
            Integer valueOf = Integer.valueOf(b.k());
            boolean k2 = ((i2 & 7168) == 2048) | btsVar.k(list) | btsVar.k(b);
            Object Q3 = btsVar.Q();
            if (k2 || Q3 == obj) {
                Q3 = new MtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$2$1(tlsVar2, list, b, null);
                btsVar.o0(Q3);
            }
            zpn.e(btsVar, (wls) Q3, valueOf);
            Object obj2 = (u510) kotlin.collections.a.S(b.k(), list);
            int i3 = i2 & 896;
            boolean k3 = (i3 == 256) | btsVar.k(a) | btsVar.b(w0);
            Object Q4 = btsVar.Q();
            if (k3 || Q4 == obj) {
                Q4 = new MtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1(a, w0, oz40Var, tlsVar, null);
                bVar = a;
                btsVar.o0(Q4);
            } else {
                bVar = a;
            }
            zpn.e(btsVar, (wls) Q4, bVar);
            k3r k3rVar = ljs0.c;
            l690 d = an91.d(0.0f, 0.0f, 0.0f, 32.0f, 7);
            boolean k4 = btsVar.k(list) | btsVar.k(b) | (i3 == 256) | btsVar.k(obj2) | ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object Q5 = btsVar.Q();
            if (k4 || Q5 == obj) {
                Object at5Var = new at5(obj2, j940Var, list, b, tlsVar, cVar, 7);
                btsVar.o0(at5Var);
                Q5 = at5Var;
            }
            adb1.a(k3rVar, bVar, d, null, null, null, false, null, (tls) Q5, btsVar, 390, 504);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ(j940Var, cVar, tlsVar, tlsVar2, i, 16);
        }
    }
}
