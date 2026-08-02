package com.yandex.passport.data.network;

import com.yandex.passport.common.account.MasterToken;
import defpackage.ny61;
import defpackage.oo31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class n7 implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;

    public n7(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
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
    public final Object a(m7 m7Var, ContinuationImpl continuationImpl) {
        GetMasterTokenByMemberTokenRequest$RequestFactory$createRequest$1 getMasterTokenByMemberTokenRequest$RequestFactory$createRequest$1;
        int i;
        String str;
        com.yandex.passport.common.network.r rVar;
        if (continuationImpl instanceof GetMasterTokenByMemberTokenRequest$RequestFactory$createRequest$1) {
            getMasterTokenByMemberTokenRequest$RequestFactory$createRequest$1 = (GetMasterTokenByMemberTokenRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = getMasterTokenByMemberTokenRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getMasterTokenByMemberTokenRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getMasterTokenByMemberTokenRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getMasterTokenByMemberTokenRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.r rVar2 = new com.yandex.passport.common.network.r((String) oo31.h(m7Var.d(), this.a, m7Var.c()).a);
                    rVar2.c("/1/token");
                    rVar2.f("grant_type", "urn:ietf:params:oauth:grant-type:master-xtoken");
                    MasterToken e = m7Var.e();
                    if (e == null || (str = e.getValue()) == null) {
                        str = "";
                    }
                    rVar2.f("access_token", str);
                    rVar2.f("target_uid", String.valueOf(m7Var.f()));
                    rVar2.f("client_id", m7Var.a());
                    rVar2.f("client_secret", m7Var.b());
                    getMasterTokenByMemberTokenRequest$RequestFactory$createRequest$1.L$0 = rVar2;
                    getMasterTokenByMemberTokenRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(rVar2, getMasterTokenByMemberTokenRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rVar = rVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rVar = (com.yandex.passport.common.network.r) getMasterTokenByMemberTokenRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return rVar.a();
            }
        }
        getMasterTokenByMemberTokenRequest$RequestFactory$createRequest$1 = new GetMasterTokenByMemberTokenRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = getMasterTokenByMemberTokenRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getMasterTokenByMemberTokenRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return rVar.a();
    }
}
