package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor;

import defpackage.amc;
import defpackage.klw;
import defpackage.ye60;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.i0;

/* loaded from: classes14.dex */
public final class a {
    public final amc a;
    public final com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a b;
    public final klw c;

    public a(amc amcVar, com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a aVar, klw klwVar) {
        this.a = amcVar;
        this.b = aVar;
        this.c = klwVar;
    }

    public final Object a(Continuation continuation) {
        Object collect = kotlinx.coroutines.flow.e.t(new com.yandex.go.requirements.comment.repositories.b(this.a.c)).collect(new i0(ye60.a, new IntercityDashboardCommentInteractorImpl$observeCommentChanges$2(this, null)), continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        zy11 zy11Var = zy11.a;
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? collect : zy11Var;
    }
}
