package com.yandex.go.superapp.unified_polling;

import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.ycw0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class j implements vpr {
    public final /* synthetic */ k a;

    public j(k kVar) {
        this.a = kVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        k kVar = this.a;
        kVar.a.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(o400.a, new UnifiedPollingRepositoryImpl$trackingJob$1$3$1(kVar, (ycw0) obj, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
