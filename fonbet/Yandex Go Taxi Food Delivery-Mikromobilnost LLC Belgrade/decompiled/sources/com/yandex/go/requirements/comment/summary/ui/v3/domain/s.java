package com.yandex.go.requirements.comment.summary.ui.v3.domain;

import defpackage.bte0;
import defpackage.dqe0;
import defpackage.g92;
import defpackage.mth;
import defpackage.wiq0;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes13.dex */
public final class s {
    public final dqe0 a;
    public final wiq0 b;
    public final com.yandex.go.route.interactor.b c;
    public final bte0 d;

    public s(dqe0 dqe0Var, wiq0 wiq0Var, com.yandex.go.route.interactor.b bVar, bte0 bte0Var) {
        this.a = dqe0Var;
        this.b = wiq0Var;
        this.c = bVar;
        this.d = bte0Var;
    }

    public final m0 a() {
        return new m0(new mth(new p(new n(this.c.k())), 6), new g92(2, this.a.a.x), new AIRequirementsDataFactory$requirementsParamFlow$1(this, null));
    }
}
