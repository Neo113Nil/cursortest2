package com.yandex.passport.data.network.token;

import defpackage.ny61;
import defpackage.oo31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class n implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;

    public n(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
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
    public final Object a(m mVar, ContinuationImpl continuationImpl) {
        GetMasterTokenByCookieRequest$RequestFactory$createRequest$1 getMasterTokenByCookieRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.r rVar;
        if (continuationImpl instanceof GetMasterTokenByCookieRequest$RequestFactory$createRequest$1) {
            getMasterTokenByCookieRequest$RequestFactory$createRequest$1 = (GetMasterTokenByCookieRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = getMasterTokenByCookieRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getMasterTokenByCookieRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getMasterTokenByCookieRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getMasterTokenByCookieRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.r g = oo31.g((String) oo31.h(mVar.f(), this.a, mVar.e()).a, "/1/bundle/oauth/token_by_sessionid");
                    g.b("Ya-Client-Host", mVar.c());
                    g.b("Ya-Client-Cookie", mVar.d());
                    g.f("client_id", mVar.a());
                    g.f("client_secret", mVar.b());
                    String g2 = mVar.g();
                    if (g2 != null) {
                        g.f("track_id", g2);
                    }
                    getMasterTokenByCookieRequest$RequestFactory$createRequest$1.L$0 = g;
                    getMasterTokenByCookieRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(g, getMasterTokenByCookieRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rVar = g;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rVar = (com.yandex.passport.common.network.r) getMasterTokenByCookieRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return rVar.a();
            }
        }
        getMasterTokenByCookieRequest$RequestFactory$createRequest$1 = new GetMasterTokenByCookieRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = getMasterTokenByCookieRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getMasterTokenByCookieRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return rVar.a();
    }
}
