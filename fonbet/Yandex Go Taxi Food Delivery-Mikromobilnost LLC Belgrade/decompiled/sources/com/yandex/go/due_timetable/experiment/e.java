package com.yandex.go.due_timetable.experiment;

import defpackage.jbh;
import defpackage.qqo;
import defpackage.rqo;
import defpackage.tpr;

/* loaded from: classes12.dex */
public final class e implements qqo, d {
    public final /* synthetic */ qqo a;

    public e(rqo rqoVar) {
        this.a = ((jbh) rqoVar).c(new IntercityTimetableConfigExperiment(0));
    }

    @Override // defpackage.qqo
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.qqo
    public final Object b() {
        return (IntercityTimetableConfigExperiment) this.a.b();
    }
}
