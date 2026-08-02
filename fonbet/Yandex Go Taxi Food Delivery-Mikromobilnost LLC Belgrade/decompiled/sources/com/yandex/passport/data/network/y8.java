package com.yandex.passport.data.network;

import defpackage.ny61;
import defpackage.oo31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class y8 implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;
    public final com.yandex.passport.data.network.core.l c;

    public y8(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar, com.yandex.passport.data.network.core.l lVar) {
        this.a = pVar;
        this.b = hVar;
        this.c = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.data.network.core.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(x8 x8Var, ContinuationImpl continuationImpl) {
        GetTrackFromMagicRequest$RequestFactory$createRequest$1 getTrackFromMagicRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.r rVar;
        if (continuationImpl instanceof GetTrackFromMagicRequest$RequestFactory$createRequest$1) {
            getTrackFromMagicRequest$RequestFactory$createRequest$1 = (GetTrackFromMagicRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = getTrackFromMagicRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getTrackFromMagicRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getTrackFromMagicRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getTrackFromMagicRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.r g = oo31.g((String) oo31.h(0L, this.a, x8Var.b()).a, "/2/bundle/auth/password/commit_magic");
                    g.b("Ya-Client-Host", this.c.a(x8Var.b()));
                    g.b("Ya-Client-Cookie", "");
                    g.f("track_id", x8Var.c());
                    g.f("csrf_token", x8Var.a());
                    getTrackFromMagicRequest$RequestFactory$createRequest$1.L$0 = g;
                    getTrackFromMagicRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(g, getTrackFromMagicRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rVar = g;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rVar = (com.yandex.passport.common.network.r) getTrackFromMagicRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return rVar.a();
            }
        }
        getTrackFromMagicRequest$RequestFactory$createRequest$1 = new GetTrackFromMagicRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = getTrackFromMagicRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getTrackFromMagicRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return rVar.a();
    }
}
