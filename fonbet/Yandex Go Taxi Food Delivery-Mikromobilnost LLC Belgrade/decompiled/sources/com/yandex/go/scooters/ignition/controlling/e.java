package com.yandex.go.scooters.ignition.controlling;

import defpackage.hbp0;
import defpackage.mpn0;
import defpackage.qu;
import defpackage.sls;
import defpackage.zy11;

/* loaded from: classes13.dex */
public final /* synthetic */ class e implements sls {
    public final /* synthetic */ f a;
    public final /* synthetic */ mpn0 b;

    public /* synthetic */ e(f fVar, mpn0 mpn0Var) {
        this.a = fVar;
        this.b = mpn0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        f fVar = this.a;
        hbp0.e(fVar.g.a(), null, null, new ScootersIgnitionControllingUiActionInteractor$handleAction$3$1(fVar, null), 3);
        this.b.a.r(new qu(9));
        return zy11.a;
    }
}
