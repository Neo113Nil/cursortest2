package com.yandex.passport.data.network;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.oo31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class u0 implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;

    public u0(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
        this.a = pVar;
        this.b = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.yandex.passport.data.network.core.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(t0 t0Var, ContinuationImpl continuationImpl) {
        CompleteStatusRequest$RequestFactory$createRequest$1 completeStatusRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.o oVar;
        if (continuationImpl instanceof CompleteStatusRequest$RequestFactory$createRequest$1) {
            completeStatusRequest$RequestFactory$createRequest$1 = (CompleteStatusRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = completeStatusRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                completeStatusRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = completeStatusRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = completeStatusRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.o oVar2 = new com.yandex.passport.common.network.o((String) oo31.h(t0Var.e(), this.a, t0Var.c()).a);
                    oVar2.c("/1/bundle/complete/status/");
                    oVar2.b("Ya-Consumer-Authorization", "OAuth " + t0Var.f().getRawValue());
                    oVar2.d("locale", t0Var.d());
                    long b = t0Var.b();
                    com.yandex.passport.common.time.a aVar = jl40.r(b, 0L) > 0 ? new com.yandex.passport.common.time.a(b) : null;
                    if (aVar != null) {
                        oVar2.d("completion_postponed_at", String.valueOf(aVar.a / 1000));
                    }
                    completeStatusRequest$RequestFactory$createRequest$1.L$0 = oVar2;
                    completeStatusRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(oVar2, completeStatusRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    oVar = oVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oVar = (com.yandex.passport.common.network.o) completeStatusRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return oVar.a();
            }
        }
        completeStatusRequest$RequestFactory$createRequest$1 = new CompleteStatusRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = completeStatusRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = completeStatusRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return oVar.a();
    }
}
