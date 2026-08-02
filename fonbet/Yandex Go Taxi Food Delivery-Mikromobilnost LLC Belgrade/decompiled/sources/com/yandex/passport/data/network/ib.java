package com.yandex.passport.data.network;

import defpackage.ny61;
import defpackage.oo31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class ib implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;

    public ib(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
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
    public final Object a(hb hbVar, ContinuationImpl continuationImpl) {
        RevokeMasterTokenRequest$RequestFactory$createRequest$1 revokeMasterTokenRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.r rVar;
        if (continuationImpl instanceof RevokeMasterTokenRequest$RequestFactory$createRequest$1) {
            revokeMasterTokenRequest$RequestFactory$createRequest$1 = (RevokeMasterTokenRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = revokeMasterTokenRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                revokeMasterTokenRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = revokeMasterTokenRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = revokeMasterTokenRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.r g = oo31.g((String) this.a.a(hbVar.d(), hbVar.e()).a, "/1/revoke_token");
                    g.f("client_id", hbVar.b());
                    g.f("client_secret", hbVar.c());
                    g.f("access_token", hbVar.f());
                    revokeMasterTokenRequest$RequestFactory$createRequest$1.L$0 = g;
                    revokeMasterTokenRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(g, revokeMasterTokenRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rVar = g;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rVar = (com.yandex.passport.common.network.r) revokeMasterTokenRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return rVar.a();
            }
        }
        revokeMasterTokenRequest$RequestFactory$createRequest$1 = new RevokeMasterTokenRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = revokeMasterTokenRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = revokeMasterTokenRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return rVar.a();
    }
}
