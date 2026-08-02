package com.yandex.passport.data.network;

import defpackage.ny61;
import defpackage.oo31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class p4 implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;

    public p4(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
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
    public final Object a(o4 o4Var, ContinuationImpl continuationImpl) {
        GetCodeByCookieRequest$RequestFactory$createRequest$1 getCodeByCookieRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.r rVar;
        if (continuationImpl instanceof GetCodeByCookieRequest$RequestFactory$createRequest$1) {
            getCodeByCookieRequest$RequestFactory$createRequest$1 = (GetCodeByCookieRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = getCodeByCookieRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getCodeByCookieRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getCodeByCookieRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getCodeByCookieRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.r g = oo31.g((String) oo31.h(0L, this.a, o4Var.e()).a, "/1/bundle/auth/oauth/code_for_am/");
                    g.b("Ya-Client-Cookie", o4Var.d());
                    g.b("Ya-Client-Host", o4Var.c());
                    g.f("client_id", o4Var.a());
                    g.f("client_secret", o4Var.b());
                    getCodeByCookieRequest$RequestFactory$createRequest$1.L$0 = g;
                    getCodeByCookieRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(g, getCodeByCookieRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rVar = g;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rVar = (com.yandex.passport.common.network.r) getCodeByCookieRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return rVar.a();
            }
        }
        getCodeByCookieRequest$RequestFactory$createRequest$1 = new GetCodeByCookieRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = getCodeByCookieRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getCodeByCookieRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return rVar.a();
    }
}
