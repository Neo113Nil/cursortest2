package com.yandex.go.routestops.v2.ui.utils;

import androidx.compose.runtime.f;
import defpackage.bpl0;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.l3t0;
import defpackage.o430;
import defpackage.oz40;
import defpackage.tls;
import defpackage.tx40;
import defpackage.w5;
import defpackage.wls;
import defpackage.yx40;
import defpackage.z9m;
import defpackage.zpn;

/* loaded from: classes11.dex */
public abstract class a {
    public static final z9m a(bpl0 bpl0Var, tls tlsVar, fid fidVar) {
        bpl0 bpl0Var2;
        yx40 yx40Var;
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = f.j(bpl0Var);
            btsVar.o0(Q);
        }
        oz40 oz40Var = (oz40) Q;
        Object Q2 = btsVar.Q();
        if (Q2 == o430Var) {
            Q2 = f.g(-1);
            btsVar.o0(Q2);
        }
        yx40 yx40Var2 = (yx40) Q2;
        Object Q3 = btsVar.Q();
        if (Q3 == o430Var) {
            Q3 = f.f(0.0f);
            btsVar.o0(Q3);
        }
        tx40 tx40Var = (tx40) Q3;
        Object Q4 = btsVar.Q();
        if (Q4 == o430Var) {
            Q4 = new l3t0();
            btsVar.o0(Q4);
        }
        l3t0 l3t0Var = (l3t0) Q4;
        oz40 n = f.n(tlsVar, btsVar);
        boolean k = btsVar.k(bpl0Var);
        Object Q5 = btsVar.Q();
        if (k || Q5 == o430Var) {
            bpl0Var2 = bpl0Var;
            DragNDropKt$rememberDragNDropState$1$1 dragNDropKt$rememberDragNDropState$1$1 = new DragNDropKt$rememberDragNDropState$1$1(yx40Var2, bpl0Var2, oz40Var, l3t0Var, null);
            yx40Var = yx40Var2;
            oz40Var = oz40Var;
            btsVar.o0(dragNDropKt$rememberDragNDropState$1$1);
            Q5 = dragNDropKt$rememberDragNDropState$1$1;
        } else {
            bpl0Var2 = bpl0Var;
            yx40Var = yx40Var2;
        }
        zpn.e(btsVar, (wls) Q5, bpl0Var2);
        Object Q6 = btsVar.Q();
        if (Q6 == o430Var) {
            Q6 = new z9m(oz40Var, yx40Var, tx40Var, l3t0Var, new w5(23, n));
            btsVar.o0(Q6);
        }
        return (z9m) Q6;
    }
}
