package com.yandex.go.mainscreen.superapp.impl.foundation.domain;

import defpackage.jst;
import defpackage.mdh;
import defpackage.mth;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class e {
    public final com.yandex.go.route.interactor.b a;
    public final com.yandex.go.zone.interactors.b b;
    public final tt2 c;

    public e(com.yandex.go.route.interactor.b bVar, com.yandex.go.zone.interactors.b bVar2, tt2 tt2Var) {
        this.a = bVar;
        this.b = bVar2;
        this.c = tt2Var;
    }

    public final Object a(ContinuationImpl continuationImpl) {
        jst.e.getClass();
        kotlinx.coroutines.flow.internal.g I = kotlinx.coroutines.flow.e.I(new mth(new b(this.a.k()), 6), new EnsureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$3(this, null));
        this.c.getClass();
        sjh sjhVar = uyj.a;
        Object y = kotlinx.coroutines.flow.e.y(kotlinx.coroutines.flow.e.F(new d(kotlinx.coroutines.flow.e.F(I, mdh.b), this), o400.a), continuationImpl);
        return y == CoroutineSingletons.COROUTINE_SUSPENDED ? y : zy11.a;
    }
}
