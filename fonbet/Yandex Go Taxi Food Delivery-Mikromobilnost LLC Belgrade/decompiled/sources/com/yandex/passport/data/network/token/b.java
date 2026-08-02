package com.yandex.passport.data.network.token;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.ny61;
import defpackage.oo31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class b implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;

    public b(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
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
    public final Object a(a aVar, ContinuationImpl continuationImpl) {
        GetMasterTokenByCodeRequest$RequestFactory$createRequest$1 getMasterTokenByCodeRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.r rVar;
        if (continuationImpl instanceof GetMasterTokenByCodeRequest$RequestFactory$createRequest$1) {
            getMasterTokenByCodeRequest$RequestFactory$createRequest$1 = (GetMasterTokenByCodeRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = getMasterTokenByCodeRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getMasterTokenByCodeRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getMasterTokenByCodeRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getMasterTokenByCodeRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.r rVar2 = new com.yandex.passport.common.network.r((String) oo31.h(0L, this.a, aVar.c()).a);
                    rVar2.c("/1/token");
                    rVar2.f("grant_type", "authorization_code");
                    rVar2.f("client_id", aVar.d());
                    rVar2.f("client_secret", aVar.e());
                    rVar2.f(AuthSdkActivity.RESPONSE_TYPE_CODE, aVar.a());
                    rVar2.f("code_verifier", aVar.b());
                    getMasterTokenByCodeRequest$RequestFactory$createRequest$1.L$0 = rVar2;
                    getMasterTokenByCodeRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(rVar2, getMasterTokenByCodeRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rVar = rVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rVar = (com.yandex.passport.common.network.r) getMasterTokenByCodeRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return rVar.a();
            }
        }
        getMasterTokenByCodeRequest$RequestFactory$createRequest$1 = new GetMasterTokenByCodeRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = getMasterTokenByCodeRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getMasterTokenByCodeRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return rVar.a();
    }
}
