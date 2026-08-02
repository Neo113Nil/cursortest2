package com.yandex.go.drive.experiments;

import defpackage.jbh;
import defpackage.rqo;
import defpackage.t1b0;
import kotlinx.coroutines.flow.n;

/* loaded from: classes.dex */
public final class c {
    public final t1b0 a;

    public c(rqo rqoVar) {
        DriveLazyInitExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).e(DriveLazyInitExperiment.e);
    }

    public final n a() {
        return new n(this.a.a(), new DriveLazyInitExperimentRepository$experimentFlow$1(this, null));
    }
}
