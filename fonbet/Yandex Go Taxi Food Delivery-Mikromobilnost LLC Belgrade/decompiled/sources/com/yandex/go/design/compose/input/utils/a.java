package com.yandex.go.design.compose.input.utils;

import defpackage.bts;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.gi91;
import defpackage.o430;
import defpackage.vfc;
import defpackage.wls;
import defpackage.yur;
import defpackage.zls;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements zls {
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        f530 f530Var = (f530) obj;
        ((Integer) obj3).getClass();
        bts btsVar = (bts) ((fid) obj2);
        btsVar.e0(-1440209568);
        btsVar.e0(1440087333);
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = vfc.g(btsVar);
        }
        yur yurVar = (yur) Q;
        btsVar.t(false);
        boolean k = btsVar.k(yurVar);
        Object Q2 = btsVar.Q();
        if (k || Q2 == o430Var) {
            Q2 = new InitialInputFocusKt$obtainInitialFocus$1$1$1(yurVar, null);
            btsVar.o0(Q2);
        }
        zpn.e(btsVar, (wls) Q2, zy11.a);
        f530 b = gi91.b(f530Var, yurVar);
        btsVar.t(false);
        return b;
    }
}
