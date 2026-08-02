package com.yandex.passport.data.network;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.ny61;
import defpackage.oo31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class o1 implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;

    public o1(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
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
    public final Object a(n1 n1Var, ContinuationImpl continuationImpl) {
        DeviceAuthorizationSubmitRequest$RequestFactory$createRequest$1 deviceAuthorizationSubmitRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.r rVar;
        if (continuationImpl instanceof DeviceAuthorizationSubmitRequest$RequestFactory$createRequest$1) {
            deviceAuthorizationSubmitRequest$RequestFactory$createRequest$1 = (DeviceAuthorizationSubmitRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = deviceAuthorizationSubmitRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deviceAuthorizationSubmitRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deviceAuthorizationSubmitRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deviceAuthorizationSubmitRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.r g = oo31.g((String) oo31.h(n1Var.e(), this.a, n1Var.c()).a, "/1/device/authorize/submit/");
                    g.b("Ya-Consumer-Authorization", "OAuth " + n1Var.f());
                    g.f(AuthSdkActivity.RESPONSE_TYPE_CODE, n1Var.g());
                    g.f("client_id", n1Var.b());
                    g.f("language", n1Var.d());
                    deviceAuthorizationSubmitRequest$RequestFactory$createRequest$1.L$0 = g;
                    deviceAuthorizationSubmitRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(g, deviceAuthorizationSubmitRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rVar = g;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rVar = (com.yandex.passport.common.network.r) deviceAuthorizationSubmitRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return rVar.a();
            }
        }
        deviceAuthorizationSubmitRequest$RequestFactory$createRequest$1 = new DeviceAuthorizationSubmitRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = deviceAuthorizationSubmitRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deviceAuthorizationSubmitRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return rVar.a();
    }
}
