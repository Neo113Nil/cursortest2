package com.yandex.go.parks.interactor;

import defpackage.ae61;
import defpackage.ee90;
import defpackage.mxf0;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zuj0;
import kotlinx.coroutines.flow.e;

/* loaded from: classes13.dex */
public final class a {
    public final mxf0 a;
    public final zuj0 b;
    public final tt2 c;
    public final ae61 d;

    public a(mxf0 mxf0Var, zuj0 zuj0Var, tt2 tt2Var, ae61 ae61Var) {
        this.a = mxf0Var;
        this.b = zuj0Var;
        this.c = tt2Var;
        this.d = ae61Var;
    }

    public final tpr a(ee90 ee90Var) {
        rol0 rol0Var = new rol0(new ParkInteractor$state$1(this, ee90Var, null));
        this.c.getClass();
        return e.F(rol0Var, uyj.a);
    }
}
