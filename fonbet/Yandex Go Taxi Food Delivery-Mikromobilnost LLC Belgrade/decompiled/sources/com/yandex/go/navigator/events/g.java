package com.yandex.go.navigator.events;

import defpackage.el00;
import defpackage.j24;
import defpackage.t35;

/* loaded from: classes12.dex */
public final class g extends t35 {
    public final el00 d;

    public g(el00 el00Var) {
        this.d = el00Var;
    }

    @Override // defpackage.t35
    public final void c(j24 j24Var) {
        this.d.f(true, new RoadEventsManagerHolder$requestCreation$1(j24Var, null));
    }
}
