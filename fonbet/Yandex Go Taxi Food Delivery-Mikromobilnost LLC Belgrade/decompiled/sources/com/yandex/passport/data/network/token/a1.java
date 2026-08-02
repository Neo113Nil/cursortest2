package com.yandex.passport.data.network.token;

import defpackage.ny61;
import defpackage.oo31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a1 implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;

    public a1(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
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
    public final Object a(z0 z0Var, ContinuationImpl continuationImpl) {
        GetMasterTokenByTrackIdRequest$RequestFactory$createRequest$1 getMasterTokenByTrackIdRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.r rVar;
        if (continuationImpl instanceof GetMasterTokenByTrackIdRequest$RequestFactory$createRequest$1) {
            getMasterTokenByTrackIdRequest$RequestFactory$createRequest$1 = (GetMasterTokenByTrackIdRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = getMasterTokenByTrackIdRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getMasterTokenByTrackIdRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getMasterTokenByTrackIdRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getMasterTokenByTrackIdRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.r g = oo31.g((String) oo31.h(0L, this.a, z0Var.c()).a, "/1/oauth/token");
                    g.f("client_id", z0Var.a());
                    g.f("client_secret", z0Var.b());
                    g.f("track_id", z0Var.d());
                    getMasterTokenByTrackIdRequest$RequestFactory$createRequest$1.L$0 = g;
                    getMasterTokenByTrackIdRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(g, getMasterTokenByTrackIdRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rVar = g;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rVar = (com.yandex.passport.common.network.r) getMasterTokenByTrackIdRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return rVar.a();
            }
        }
        getMasterTokenByTrackIdRequest$RequestFactory$createRequest$1 = new GetMasterTokenByTrackIdRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = getMasterTokenByTrackIdRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getMasterTokenByTrackIdRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return rVar.a();
    }
}
