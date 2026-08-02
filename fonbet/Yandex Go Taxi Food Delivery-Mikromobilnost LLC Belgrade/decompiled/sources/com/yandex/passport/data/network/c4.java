package com.yandex.passport.data.network;

import defpackage.ny61;
import defpackage.oo31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class c4 implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;

    public c4(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
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
    public final Object a(b4 b4Var, ContinuationImpl continuationImpl) {
        GetClientOrMasterTokenByMasterTokenRequest$RequestFactory$createRequest$1 getClientOrMasterTokenByMasterTokenRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.r rVar;
        if (continuationImpl instanceof GetClientOrMasterTokenByMasterTokenRequest$RequestFactory$createRequest$1) {
            getClientOrMasterTokenByMasterTokenRequest$RequestFactory$createRequest$1 = (GetClientOrMasterTokenByMasterTokenRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = getClientOrMasterTokenByMasterTokenRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getClientOrMasterTokenByMasterTokenRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getClientOrMasterTokenByMasterTokenRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getClientOrMasterTokenByMasterTokenRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.r rVar2 = new com.yandex.passport.common.network.r((String) oo31.h(b4Var.e(), this.a, b4Var.d()).a);
                    rVar2.c("/1/token");
                    rVar2.f("grant_type", "x-token");
                    rVar2.f("access_token", b4Var.f().getNonNullValueOrThrow());
                    rVar2.f("client_id", b4Var.b());
                    rVar2.f("client_secret", b4Var.c());
                    getClientOrMasterTokenByMasterTokenRequest$RequestFactory$createRequest$1.L$0 = rVar2;
                    getClientOrMasterTokenByMasterTokenRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(rVar2, getClientOrMasterTokenByMasterTokenRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rVar = rVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rVar = (com.yandex.passport.common.network.r) getClientOrMasterTokenByMasterTokenRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return rVar.a();
            }
        }
        getClientOrMasterTokenByMasterTokenRequest$RequestFactory$createRequest$1 = new GetClientOrMasterTokenByMasterTokenRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = getClientOrMasterTokenByMasterTokenRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getClientOrMasterTokenByMasterTokenRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return rVar.a();
    }
}
