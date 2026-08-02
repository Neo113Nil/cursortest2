package com.yandex.go.navigator.events;

import defpackage.gci0;
import defpackage.gpv;
import defpackage.hiq0;
import defpackage.jqr;
import defpackage.mth;
import defpackage.sls;
import defpackage.vu30;
import defpackage.wsk0;
import defpackage.x1l0;

/* loaded from: classes12.dex */
public final class e {
    public final hiq0 a;
    public final x1l0 b;
    public final gpv c;
    public final wsk0 d;

    public e(hiq0 hiq0Var, x1l0 x1l0Var, gpv gpvVar, wsk0 wsk0Var) {
        this.a = hiq0Var;
        this.b = x1l0Var;
        this.c = gpvVar;
        this.d = wsk0Var;
    }

    public final d a(sls slsVar) {
        return new d(new b(new mth(new jqr(kotlinx.coroutines.flow.e.s((gci0) this.a.b, new vu30(16)), new OnRoadEventPlacemarkTapInteractor$tapFlow$3(slsVar, null), 3), 6), this.b), this);
    }
}
