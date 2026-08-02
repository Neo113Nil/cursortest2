package com.yandex.go.taxi.order.change.requirements.interactor;

import com.yandex.go.taxi.order.change.common.domain.d;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes14.dex */
public final class a {
    public final tt2 a;
    public final d b;
    public final com.yandex.go.taxi.order.change.requirements.repository.a c;

    public a(tt2 tt2Var, d dVar, com.yandex.go.taxi.order.change.requirements.repository.a aVar) {
        this.a = tt2Var;
        this.b = dVar;
        this.c = aVar;
    }

    public final Object a(String str, kotlinx.serialization.json.b bVar, SuspendLambda suspendLambda) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new ChangeRequirementsInteractor$onChangeRequirementsAction$2(this, str, bVar, null), suspendLambda);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
