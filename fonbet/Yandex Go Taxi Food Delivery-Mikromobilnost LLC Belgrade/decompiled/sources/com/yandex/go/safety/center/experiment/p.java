package com.yandex.go.safety.center.experiment;

import defpackage.jbh;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.tpr;
import defpackage.v500;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class p implements t1b0, v500 {
    public final /* synthetic */ t1b0 a;
    public final jbh b;

    public p(rqo rqoVar) {
        jbh jbhVar = (jbh) rqoVar;
        this.a = jbhVar.e(SafetyCenterExperiment.u);
        this.b = jbhVar;
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
        return (SafetyCenterExperiment) this.a.c();
    }
}
