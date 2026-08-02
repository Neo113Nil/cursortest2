package com.yandex.go.taxi.summary.drive.interactor;

import com.yandex.go.taxi.experiments.q;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.ck31;
import defpackage.pb31;
import defpackage.tpr;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class c {
    public final ck31 a;
    public final pb31 b;
    public final q c;

    public c(ck31 ck31Var, pb31 pb31Var, q qVar) {
        this.a = ck31Var;
        this.b = pb31Var;
        this.c = qVar;
    }

    public final tpr a() {
        return e.t(new m0(((k) this.a).i(), this.c.a(), new DriveVerticalsInteractor$stateFlow$1(this, null)));
    }
}
