package com.yandex.passport.data.network;

import defpackage.ny61;
import defpackage.oo31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class z7 implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;

    public z7(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
        this.a = pVar;
        this.b = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.data.network.core.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(y7 y7Var, ContinuationImpl continuationImpl) {
        GetPush2faCodeRequest$RequestFactory$createRequest$1 getPush2faCodeRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.o oVar;
        if (continuationImpl instanceof GetPush2faCodeRequest$RequestFactory$createRequest$1) {
            getPush2faCodeRequest$RequestFactory$createRequest$1 = (GetPush2faCodeRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = getPush2faCodeRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getPush2faCodeRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getPush2faCodeRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getPush2faCodeRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.o oVar2 = new com.yandex.passport.common.network.o((String) oo31.h(y7Var.c(), this.a, y7Var.b()).a);
                    oVar2.c("/1/bundle/push/2fa/get_code/");
                    oVar2.b("Ya-Consumer-Authorization", "OAuth " + y7Var.d().getNonNullValueOrThrow());
                    oVar2.d("track_id", y7Var.e());
                    getPush2faCodeRequest$RequestFactory$createRequest$1.L$0 = oVar2;
                    getPush2faCodeRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(oVar2, getPush2faCodeRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    oVar = oVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oVar = (com.yandex.passport.common.network.o) getPush2faCodeRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return oVar.a();
            }
        }
        getPush2faCodeRequest$RequestFactory$createRequest$1 = new GetPush2faCodeRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = getPush2faCodeRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getPush2faCodeRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return oVar.a();
    }
}
