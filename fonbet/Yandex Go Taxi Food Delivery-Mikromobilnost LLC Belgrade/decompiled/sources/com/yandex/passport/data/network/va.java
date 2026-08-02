package com.yandex.passport.data.network;

import defpackage.ny61;
import defpackage.oo31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class va implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;

    public va(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
        this.a = pVar;
        this.b = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.data.network.core.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ua uaVar, ContinuationImpl continuationImpl) {
        PushSubscribeRequest$RequestFactory$createRequest$1 pushSubscribeRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.r rVar;
        if (continuationImpl instanceof PushSubscribeRequest$RequestFactory$createRequest$1) {
            pushSubscribeRequest$RequestFactory$createRequest$1 = (PushSubscribeRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = pushSubscribeRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pushSubscribeRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pushSubscribeRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pushSubscribeRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.r g = oo31.g((String) oo31.h(uaVar.c(), this.a, uaVar.b()).a, "/1/bundle/push/subscribe/");
                    g.b("Ya-Consumer-Authorization", "OAuth " + uaVar.d().getNonNullValueOrThrow());
                    g.d("push_platform", uaVar.e());
                    g.f("device_token", uaVar.f());
                    g.f("am_version", "7.55.1");
                    g.f("pushes_enabled_on_device", String.valueOf(uaVar.g()));
                    g.f("user_is_logged_in", String.valueOf(uaVar.h()));
                    pushSubscribeRequest$RequestFactory$createRequest$1.L$0 = g;
                    pushSubscribeRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(g, pushSubscribeRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rVar = g;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rVar = (com.yandex.passport.common.network.r) pushSubscribeRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return rVar.a();
            }
        }
        pushSubscribeRequest$RequestFactory$createRequest$1 = new PushSubscribeRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = pushSubscribeRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushSubscribeRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return rVar.a();
    }
}
