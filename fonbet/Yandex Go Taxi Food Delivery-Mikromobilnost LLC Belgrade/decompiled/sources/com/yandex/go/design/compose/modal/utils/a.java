package com.yandex.go.design.compose.modal.utils;

import androidx.compose.runtime.f;
import androidx.compose.ui.platform.n;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.oz40;
import defpackage.rz20;
import defpackage.sls;
import defpackage.sz40;
import defpackage.vz20;
import defpackage.wls;
import defpackage.wz20;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes12.dex */
public abstract class a {
    public static final rz20 a(boolean z, sls slsVar, fid fidVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = ((Boolean) ((bts) fidVar).m(n.a)).booleanValue();
        }
        sls slsVar2 = (i2 & 2) != 0 ? null : slsVar;
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        Object obj = did.a;
        if (Q == obj) {
            Q = new rz20(new sz40(Boolean.valueOf(z)));
            btsVar.o0(Q);
        }
        rz20 rz20Var = (rz20) Q;
        Object Q2 = btsVar.Q();
        if (Q2 == obj) {
            Q2 = f.j(null);
            btsVar.o0(Q2);
        }
        oz40 oz40Var = (oz40) Q2;
        Object Q3 = btsVar.Q();
        if (Q3 == obj) {
            Q3 = f.j(null);
            btsVar.o0(Q3);
        }
        oz40 oz40Var2 = (oz40) Q3;
        boolean z2 = ((((i & 112) ^ 48) > 32 && btsVar.k(slsVar2)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && btsVar.k(null)) || (i & 384) == 256);
        Object Q4 = btsVar.Q();
        if (z2 || Q4 == obj) {
            Object modalStateKt$rememberModalState$1$1 = new ModalStateKt$rememberModalState$1$1(oz40Var2, rz20Var, slsVar2, null, oz40Var, null);
            btsVar.o0(modalStateKt$rememberModalState$1$1);
            Q4 = modalStateKt$rememberModalState$1$1;
        }
        zy11 zy11Var = zy11.a;
        zpn.e(btsVar, (wls) Q4, zy11Var);
        wz20 wz20Var = (wz20) btsVar.m(vz20.a);
        boolean k = btsVar.k(wz20Var);
        Object Q5 = btsVar.Q();
        if (k || Q5 == obj) {
            Object modalStateKt$rememberModalState$2$1 = new ModalStateKt$rememberModalState$2$1(wz20Var, rz20Var, oz40Var2, oz40Var, null);
            btsVar.o0(modalStateKt$rememberModalState$2$1);
            Q5 = modalStateKt$rememberModalState$2$1;
        }
        zpn.e(btsVar, (wls) Q5, zy11Var);
        return rz20Var;
    }
}
