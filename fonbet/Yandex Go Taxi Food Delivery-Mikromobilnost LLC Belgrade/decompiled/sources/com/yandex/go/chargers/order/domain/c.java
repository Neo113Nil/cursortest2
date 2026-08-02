package com.yandex.go.chargers.order.domain;

import defpackage.ll9;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class c implements vpr {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        d dVar = this.a;
        dVar.c.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(o400.a, new ChargersActiveOrdersRemovePollingInteractor$listenRemoveActiveOrders$1$1$1(dVar, (ll9) obj, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
