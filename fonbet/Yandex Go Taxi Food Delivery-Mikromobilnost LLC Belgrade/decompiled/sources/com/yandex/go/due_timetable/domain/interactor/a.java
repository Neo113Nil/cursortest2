package com.yandex.go.due_timetable.domain.interactor;

import defpackage.axm;
import defpackage.dqe0;
import defpackage.fzm;
import defpackage.g1n;
import defpackage.ibn;
import defpackage.mdh;
import defpackage.mum;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wiq0;
import defpackage.wjm;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class a {
    public final tt2 a;
    public final com.yandex.go.due.data.repository.a b;
    public final wiq0 c;
    public final wjm d;
    public final axm e;
    public final ibn f;
    public final dqe0 g;
    public final fzm h;
    public final mum i;

    public a(tt2 tt2Var, com.yandex.go.due.data.repository.a aVar, wiq0 wiq0Var, wjm wjmVar, axm axmVar, ibn ibnVar, dqe0 dqe0Var, fzm fzmVar, mum mumVar) {
        this.a = tt2Var;
        this.b = aVar;
        this.c = wiq0Var;
        this.d = wjmVar;
        this.e = axmVar;
        this.f = ibnVar;
        this.g = dqe0Var;
        this.h = fzmVar;
        this.i = mumVar;
    }

    public final Object a(g1n g1nVar, boolean z, Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new ScheduledOrderAvailabilityInteractor$loadAvailability$2(g1nVar, z, this, null), continuation);
    }
}
