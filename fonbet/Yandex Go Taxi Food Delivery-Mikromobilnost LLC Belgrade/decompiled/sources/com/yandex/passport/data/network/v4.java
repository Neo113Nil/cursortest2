package com.yandex.passport.data.network;

import defpackage.ny61;
import defpackage.oo31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class v4 implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;

    public v4(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
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
    public final Object a(u4 u4Var, ContinuationImpl continuationImpl) {
        GetCodeByMasterTokenRequest$RequestFactory$createRequest$1 getCodeByMasterTokenRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.r rVar;
        if (continuationImpl instanceof GetCodeByMasterTokenRequest$RequestFactory$createRequest$1) {
            getCodeByMasterTokenRequest$RequestFactory$createRequest$1 = (GetCodeByMasterTokenRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = getCodeByMasterTokenRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getCodeByMasterTokenRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getCodeByMasterTokenRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getCodeByMasterTokenRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.r g = oo31.g((String) oo31.h(u4Var.e(), this.a, u4Var.d()).a, "/1/bundle/auth/oauth/code_for_am/");
                    g.b("Authorization", "OAuth " + u4Var.f().getRawValue());
                    String b = u4Var.b();
                    if (b != null) {
                        g.f("client_id", b);
                    }
                    String c = u4Var.c();
                    if (c != null) {
                        g.f("client_secret", c);
                    }
                    getCodeByMasterTokenRequest$RequestFactory$createRequest$1.L$0 = g;
                    getCodeByMasterTokenRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(g, getCodeByMasterTokenRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rVar = g;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rVar = (com.yandex.passport.common.network.r) getCodeByMasterTokenRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return rVar.a();
            }
        }
        getCodeByMasterTokenRequest$RequestFactory$createRequest$1 = new GetCodeByMasterTokenRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = getCodeByMasterTokenRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getCodeByMasterTokenRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return rVar.a();
    }
}
