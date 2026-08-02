package com.yandex.go.rida.bids.utils;

import androidx.compose.runtime.f;
import defpackage.bgc;
import defpackage.bts;
import defpackage.ck11;
import defpackage.did;
import defpackage.fid;
import defpackage.gtq0;
import defpackage.id00;
import defpackage.jj2;
import defpackage.o430;
import defpackage.oz40;
import defpackage.qor;
import defpackage.rfb1;
import defpackage.sls;
import defpackage.tls;
import defpackage.tse;
import defpackage.tx40;
import defpackage.wg6;
import defpackage.wls;
import defpackage.wu60;
import defpackage.ynn;
import defpackage.zpn;
import defpackage.zy11;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes13.dex */
public abstract class a {
    public static final void a(Object obj, sls slsVar, wls wlsVar, sls slsVar2, bts btsVar, int i) {
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = new bgc(12);
            btsVar.o0(Q);
        }
        sls slsVar3 = (sls) Q;
        int i2 = (i & 112) ^ 48;
        boolean e = ((i2 > 32 && btsVar.k(slsVar)) || (i & 48) == 32) | btsVar.e(wlsVar);
        Object Q2 = btsVar.Q();
        if (e || Q2 == o430Var) {
            Q2 = new LaunchedDisposableEffectKt$LaunchedDisposableEffect$2$1(slsVar, wlsVar, null);
            btsVar.o0(Q2);
        }
        zpn.e(btsVar, (wls) Q2, obj);
        boolean k = btsVar.k(slsVar3) | ((i2 > 32 && btsVar.k(slsVar)) || (i & 48) == 32) | btsVar.k(slsVar2);
        Object Q3 = btsVar.Q();
        if (k || Q3 == o430Var) {
            Q3 = new ynn(17, slsVar3, slsVar, slsVar2);
            btsVar.o0(Q3);
        }
        zpn.a(obj, (tls) Q3, btsVar);
    }

    public static final androidx.compose.animation.core.a b(qor qorVar, jj2 jj2Var, fid fidVar, int i) {
        qor qorVar2;
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        Object obj = did.a;
        if (Q == obj) {
            Q = id00.a(((Number) qorVar.getValue()).floatValue());
            btsVar.o0(Q);
        }
        androidx.compose.animation.core.a aVar = (androidx.compose.animation.core.a) Q;
        Object Q2 = btsVar.Q();
        if (Q2 == obj) {
            Q2 = zpn.j(EmptyCoroutineContext.a, btsVar);
            btsVar.o0(Q2);
        }
        tse tseVar = (tse) Q2;
        boolean e = ((((i & 14) ^ 6) > 4 && btsVar.k(qorVar)) || (i & 6) == 4) | btsVar.e(tseVar) | btsVar.e(aVar) | ((((i & 112) ^ 48) > 32 && btsVar.e(jj2Var)) || (i & 48) == 32);
        Object Q3 = btsVar.Q();
        if (e || Q3 == obj) {
            qorVar2 = qorVar;
            Object stateUtilsKt$asAnimatable$1$1 = new StateUtilsKt$asAnimatable$1$1(qorVar2, tseVar, aVar, jj2Var, null);
            btsVar.o0(stateUtilsKt$asAnimatable$1$1);
            Q3 = stateUtilsKt$asAnimatable$1$1;
        } else {
            qorVar2 = qorVar;
        }
        zpn.e(btsVar, (wls) Q3, qorVar2);
        return aVar;
    }

    public static final androidx.compose.animation.core.a c(oz40 oz40Var, ck11 ck11Var, bts btsVar) {
        oz40 oz40Var2;
        Object Q = btsVar.Q();
        Object obj = did.a;
        if (Q == obj) {
            Q = new androidx.compose.animation.core.a(new wu60(((wu60) oz40Var.getValue()).a), gtq0.k, (Object) null, 12);
            btsVar.o0(Q);
        }
        androidx.compose.animation.core.a aVar = (androidx.compose.animation.core.a) Q;
        Object Q2 = btsVar.Q();
        if (Q2 == obj) {
            Q2 = zpn.j(EmptyCoroutineContext.a, btsVar);
            btsVar.o0(Q2);
        }
        tse tseVar = (tse) Q2;
        boolean k = btsVar.k(oz40Var) | btsVar.e(tseVar) | btsVar.e(aVar) | btsVar.e(ck11Var);
        Object Q3 = btsVar.Q();
        if (k || Q3 == obj) {
            oz40Var2 = oz40Var;
            Q3 = new StateUtilsKt$asAnimatable$2$1(oz40Var2, tseVar, aVar, ck11Var, null);
            btsVar.o0(Q3);
        } else {
            oz40Var2 = oz40Var;
        }
        zpn.e(btsVar, (wls) Q3, oz40Var2);
        return aVar;
    }

    public static final tx40 d(wg6 wg6Var, fid fidVar, int i, int i2) {
        boolean z = true;
        boolean z2 = (i2 & 1) == 0;
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = f.f(rfb1.e(wg6Var));
            btsVar.o0(Q);
        }
        tx40 tx40Var = (tx40) Q;
        boolean z3 = (((i & 14) ^ 6) > 4 && btsVar.k(wg6Var)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !btsVar.a(z2)) && (i & 48) != 32) {
            z = false;
        }
        boolean z4 = z3 | z;
        Object Q2 = btsVar.Q();
        if (z4 || Q2 == o430Var) {
            Q2 = new BottomSheetStateUtilsKt$normalizedExpandedState$1$1(wg6Var, z2, tx40Var, null);
            btsVar.o0(Q2);
        }
        zpn.e(btsVar, (wls) Q2, zy11.a);
        return tx40Var;
    }
}
