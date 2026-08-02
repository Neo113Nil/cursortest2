package com.yandex.passport.data.network;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.ny61;
import defpackage.oo31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class i1 implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;

    public i1(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
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
    public final Object a(h1 h1Var, ContinuationImpl continuationImpl) {
        DeviceAuthorizationCommitRequest$RequestFactory$createRequest$1 deviceAuthorizationCommitRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.r rVar;
        if (continuationImpl instanceof DeviceAuthorizationCommitRequest$RequestFactory$createRequest$1) {
            deviceAuthorizationCommitRequest$RequestFactory$createRequest$1 = (DeviceAuthorizationCommitRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = deviceAuthorizationCommitRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deviceAuthorizationCommitRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deviceAuthorizationCommitRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deviceAuthorizationCommitRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.r g = oo31.g((String) oo31.h(h1Var.e(), this.a, h1Var.c()).a, "/1/device/authorize/commit/");
                    g.b("Ya-Consumer-Authorization", "OAuth " + h1Var.f());
                    g.f(AuthSdkActivity.RESPONSE_TYPE_CODE, h1Var.g());
                    g.f("client_id", h1Var.b());
                    g.f("language", h1Var.d());
                    deviceAuthorizationCommitRequest$RequestFactory$createRequest$1.L$0 = g;
                    deviceAuthorizationCommitRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(g, deviceAuthorizationCommitRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rVar = g;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rVar = (com.yandex.passport.common.network.r) deviceAuthorizationCommitRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return rVar.a();
            }
        }
        deviceAuthorizationCommitRequest$RequestFactory$createRequest$1 = new DeviceAuthorizationCommitRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = deviceAuthorizationCommitRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deviceAuthorizationCommitRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return rVar.a();
    }
}
