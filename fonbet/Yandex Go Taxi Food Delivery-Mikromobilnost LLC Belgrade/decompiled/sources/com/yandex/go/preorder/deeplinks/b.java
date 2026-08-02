package com.yandex.go.preorder.deeplinks;

import defpackage.ffj0;
import defpackage.o400;
import defpackage.qiv0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class b {
    public final com.yandex.go.route.interactor.b a;
    public final qiv0 b;
    public final tt2 c;

    public b(com.yandex.go.route.interactor.b bVar, qiv0 qiv0Var, tt2 tt2Var) {
        this.a = bVar;
        this.b = qiv0Var;
        this.c = tt2Var;
    }

    public final Object a(ffj0 ffj0Var, Continuation continuation) {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(o400.a, new RequirementDeeplinkPreorderInteractor$handleRequirement$2(this, ffj0Var, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
