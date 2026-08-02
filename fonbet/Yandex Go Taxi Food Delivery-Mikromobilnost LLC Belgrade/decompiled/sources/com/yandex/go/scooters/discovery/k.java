package com.yandex.go.scooters.discovery;

import defpackage.sls;
import defpackage.tje;
import defpackage.z970;
import defpackage.zy11;

/* loaded from: classes13.dex */
public final /* synthetic */ class k implements sls {
    public final /* synthetic */ m a;
    public final /* synthetic */ z970 b;

    public /* synthetic */ k(m mVar, z970 z970Var) {
        this.a = mVar;
        this.b = z970Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        m mVar = this.a;
        tje.N(mVar.o(), null, null, new ScootersDiscoveryRouter$openSubRouter$1(this.b, mVar, null), 3);
        return zy11.a;
    }
}
