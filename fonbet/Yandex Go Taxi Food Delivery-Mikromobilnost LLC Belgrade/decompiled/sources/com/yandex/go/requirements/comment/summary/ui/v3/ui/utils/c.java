package com.yandex.go.requirements.comment.summary.ui.v3.ui.utils;

import androidx.compose.ui.platform.j;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.o430;
import defpackage.u5t0;
import defpackage.vz20;
import defpackage.wg6;
import defpackage.wls;
import defpackage.wz20;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes13.dex */
public abstract class c {
    public static final wg6 a(fid fidVar) {
        bts btsVar = (bts) fidVar;
        u5t0 u5t0Var = (u5t0) btsVar.m(j.q);
        wz20 wz20Var = (wz20) btsVar.m(vz20.a);
        wg6 a = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, null, false, null, null, null, null, btsVar, 0, 0, 8191);
        boolean k = btsVar.k(wz20Var) | btsVar.k(u5t0Var);
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (k || Q == o430Var) {
            Q = new RememberKeyboardClosingBottomSheetStateKt$rememberKeyboardClosingBottomSheetState$1$1(wz20Var, u5t0Var, null);
            btsVar.o0(Q);
        }
        zy11 zy11Var = zy11.a;
        zpn.e(btsVar, (wls) Q, zy11Var);
        boolean k2 = btsVar.k(a) | btsVar.k(u5t0Var);
        Object Q2 = btsVar.Q();
        if (k2 || Q2 == o430Var) {
            Q2 = new RememberKeyboardClosingBottomSheetStateKt$rememberKeyboardClosingBottomSheetState$2$1(a, u5t0Var, null);
            btsVar.o0(Q2);
        }
        zpn.e(btsVar, (wls) Q2, zy11Var);
        return a;
    }
}
