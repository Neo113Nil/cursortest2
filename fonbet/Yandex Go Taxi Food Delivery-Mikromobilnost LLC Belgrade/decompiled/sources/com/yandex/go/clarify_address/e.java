package com.yandex.go.clarify_address;

import defpackage.bvf0;
import defpackage.jbh;
import defpackage.jqr;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.tpr;
import defpackage.tse;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class e implements t1b0 {
    public final /* synthetic */ t1b0 a;
    public final r0 b;

    public e(tse tseVar, rqo rqoVar) {
        ClarifyAddressBeforeOrderExperiment.Companion.getClass();
        ClarifyAddressBeforeOrderExperiment clarifyAddressBeforeOrderExperiment = ClarifyAddressBeforeOrderExperiment.m;
        t1b0 e = ((jbh) rqoVar).e(clarifyAddressBeforeOrderExperiment);
        this.a = e;
        this.b = bvf0.c(clarifyAddressBeforeOrderExperiment);
        kotlinx.coroutines.flow.e.H(tseVar, new jqr(e.a(), new ClarifyAddressBeforeOrderExperimentRepository$1(this, null), 3));
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        return this.a.b(continuation);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        return (ClarifyAddressBeforeOrderExperiment) this.a.c();
    }
}
