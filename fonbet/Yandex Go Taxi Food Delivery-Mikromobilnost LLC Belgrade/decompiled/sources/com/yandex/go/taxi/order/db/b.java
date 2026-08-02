package com.yandex.go.taxi.order.db;

import defpackage.tje;
import defpackage.vpr;
import defpackage.ysg;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ ysg a;

    public b(ysg ysgVar) {
        this.a = ysgVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object k0 = tje.k0(this.a.e, new DbOrderImpl$createCommitTask$1$1((Runnable) obj, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
