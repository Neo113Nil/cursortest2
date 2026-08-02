package com.yandex.passport.data.network;

import defpackage.ny61;
import defpackage.oo31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a7 implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;

    public a7(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
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
    public final Object a(z6 z6Var, ContinuationImpl continuationImpl) {
        GetDeviceCodeRequest$RequestFactory$createRequest$1 getDeviceCodeRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.r rVar;
        if (continuationImpl instanceof GetDeviceCodeRequest$RequestFactory$createRequest$1) {
            getDeviceCodeRequest$RequestFactory$createRequest$1 = (GetDeviceCodeRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = getDeviceCodeRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getDeviceCodeRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getDeviceCodeRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getDeviceCodeRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.r g = oo31.g((String) oo31.h(0L, this.a, z6Var.d()).a, "/1/device/code/");
                    g.f("client_id", z6Var.b());
                    g.f("device_name", z6Var.c());
                    g.f("client_bound", z6Var.a() ? "yes" : "no");
                    getDeviceCodeRequest$RequestFactory$createRequest$1.L$0 = g;
                    getDeviceCodeRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(g, getDeviceCodeRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rVar = g;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rVar = (com.yandex.passport.common.network.r) getDeviceCodeRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return rVar.a();
            }
        }
        getDeviceCodeRequest$RequestFactory$createRequest$1 = new GetDeviceCodeRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = getDeviceCodeRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getDeviceCodeRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return rVar.a();
    }
}
