package com.yandex.smartcamera.arscene.ui;

import defpackage.a7y;
import defpackage.aii0;
import defpackage.bts;
import defpackage.cvw;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.i43;
import defpackage.jiu;
import defpackage.o430;
import defpackage.quz;
import defpackage.rqu;
import defpackage.sls;
import defpackage.sp5;
import defpackage.tig0;
import defpackage.tls;
import defpackage.v4;
import defpackage.w9u;
import defpackage.wls;
import defpackage.wwg;
import defpackage.z69;
import defpackage.zpn;
import java.util.ArrayList;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class a {
    public static final void a(f530 f530Var, int i, ArrayList arrayList, tls tlsVar, fid fidVar, int i2) {
        f530 f530Var2;
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-70288724);
        if ((i2 & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar.k(f530Var2) ? 4 : 2) | i2;
        } else {
            f530Var2 = f530Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar.c(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= btsVar.e(arrayList) ? 256 : 128;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        int i4 = i3;
        if ((i4 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
        } else {
            int i5 = (i4 >> 3) & 14;
            int i6 = (2 & 1) != 0 ? 0 : i;
            androidx.compose.foundation.lazy.b a = a7y.a(0, 3, btsVar);
            Object[] objArr = new Object[0];
            tig0 tig0Var = new tig0(new w9u(9), new jiu(3));
            boolean z = ((((i5 & 14) ^ 6) > 4 && btsVar.c(i6)) || (i5 & 6) == 4) | ((((i5 & 112) ^ 48) > 32 && btsVar.k(a)) || (i5 & 48) == 32);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new rqu(i6, a);
                btsVar.o0(Q);
            }
            int i7 = 3;
            z69 z69Var = (z69) cvw.X(objArr, tig0Var, (sls) Q, btsVar, 0, 4);
            boolean k = btsVar.k(z69Var) | ((i4 & 7168) == 2048);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                Q2 = new BoxSizeSwitcherKt$BoxSizeSwitcher$1$1(z69Var, tlsVar, null);
                btsVar.o0(Q2);
            }
            zpn.e(btsVar, (wls) Q2, z69Var);
            Integer valueOf = Integer.valueOf(i);
            boolean k2 = btsVar.k(z69Var) | ((i4 & 112) == 32);
            Object Q3 = btsVar.Q();
            if (k2 || Q3 == o430Var) {
                Q3 = new BoxSizeSwitcherKt$BoxSizeSwitcher$2$1(z69Var, i, null);
                btsVar.o0(Q3);
            }
            zpn.e(btsVar, (wls) Q3, valueOf);
            btsVar = btsVar;
            e.a(f530Var2, new i43(32.0f, true, new quz(11)), z69Var, arrayList.size(), wwg.S(1422688760, true, new sp5(i7, z69Var, arrayList), btsVar), btsVar, (i4 & 14) | 24624);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new v4(f530Var, i, arrayList, tlsVar, i2);
        }
    }
}
