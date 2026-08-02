package com.yandex.passport.data.network;

import defpackage.ny61;
import defpackage.oo31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class w9 implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;

    public w9(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
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
    public final Object a(v9 v9Var, ContinuationImpl continuationImpl) {
        GetUserInfoRequest$RequestFactory$createRequest$1 getUserInfoRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.o oVar;
        if (continuationImpl instanceof GetUserInfoRequest$RequestFactory$createRequest$1) {
            getUserInfoRequest$RequestFactory$createRequest$1 = (GetUserInfoRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = getUserInfoRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getUserInfoRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getUserInfoRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getUserInfoRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.o oVar2 = new com.yandex.passport.common.network.o((String) oo31.h(v9Var.e(), this.a, v9Var.c()).a);
                    oVar2.c("/1/bundle/account/short_info/");
                    oVar2.b("Authorization", "OAuth " + v9Var.f().getValue());
                    oVar2.b("If-None-Match", v9Var.b());
                    String d = v9Var.d();
                    if (d != null) {
                        oVar2.d("language", d);
                    }
                    oVar2.d("avatar_size", "islands-300");
                    oVar2.d("need_children", "true");
                    oVar2.d("need_completion_status", "true");
                    getUserInfoRequest$RequestFactory$createRequest$1.L$0 = oVar2;
                    getUserInfoRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(oVar2, getUserInfoRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    oVar = oVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oVar = (com.yandex.passport.common.network.o) getUserInfoRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return oVar.a();
            }
        }
        getUserInfoRequest$RequestFactory$createRequest$1 = new GetUserInfoRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = getUserInfoRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getUserInfoRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return oVar.a();
    }
}
