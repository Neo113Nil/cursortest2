package com.yx360.design.compose.atoms.utils;

import androidx.compose.runtime.f;
import defpackage.bts;
import defpackage.ck11;
import defpackage.did;
import defpackage.fid;
import defpackage.j0;
import defpackage.m3u0;
import defpackage.o430;
import defpackage.oz40;
import defpackage.qxi;
import defpackage.sls;
import defpackage.wls;
import defpackage.zpn;
import defpackage.zx40;

/* loaded from: classes11.dex */
public abstract class a {
    public static final qxi a(zx40 zx40Var, ck11 ck11Var, ck11 ck11Var2, float f, int i, fid fidVar, int i2) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(-1263363715);
        btsVar.e0(1849434622);
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = f.j(Boolean.FALSE);
            btsVar.o0(Q);
        }
        oz40 oz40Var = (oz40) Q;
        btsVar.t(false);
        if (!((Boolean) oz40Var.getValue()).booleanValue()) {
            f = 1.0f;
        }
        m3u0 b = androidx.compose.animation.core.b.b(f, ((Boolean) oz40Var.getValue()).booleanValue() ? ck11Var : ck11Var2, null, null, btsVar, 0, 28);
        btsVar.e0(-1746271574);
        Object Q2 = btsVar.Q();
        if (Q2 == o430Var) {
            Q2 = new AnimateScaleAsPressStateKt$animateScaleAsPressState$1$1(zx40Var, i, oz40Var, null);
            btsVar.o0(Q2);
        }
        btsVar.t(false);
        zpn.e(btsVar, (wls) Q2, zx40Var);
        btsVar.e0(-1633490746);
        boolean k = btsVar.k(b);
        Object Q3 = btsVar.Q();
        if (k || Q3 == o430Var) {
            Q3 = new j0(27, oz40Var, b);
            btsVar.o0(Q3);
        }
        btsVar.t(false);
        qxi d = f.d((sls) Q3);
        btsVar.t(false);
        return d;
    }
}
