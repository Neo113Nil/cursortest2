package com.yandex.passport.data.network;

import defpackage.ny61;
import defpackage.oo31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class cb implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;

    public cb(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
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
    public final Object a(ab abVar, ContinuationImpl continuationImpl) {
        RegisterPhonishRequest$RequestFactory$createRequest$1 registerPhonishRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.r rVar;
        if (continuationImpl instanceof RegisterPhonishRequest$RequestFactory$createRequest$1) {
            registerPhonishRequest$RequestFactory$createRequest$1 = (RegisterPhonishRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = registerPhonishRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                registerPhonishRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = registerPhonishRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = registerPhonishRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.r g = oo31.g((String) oo31.h(0L, this.a, abVar.a).a, "/1/bundle/mobile/register/phonish/");
                    g.f("track_id", abVar.b);
                    registerPhonishRequest$RequestFactory$createRequest$1.L$0 = g;
                    registerPhonishRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(g, registerPhonishRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rVar = g;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rVar = (com.yandex.passport.common.network.r) registerPhonishRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return rVar.a();
            }
        }
        registerPhonishRequest$RequestFactory$createRequest$1 = new RegisterPhonishRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = registerPhonishRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = registerPhonishRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return rVar.a();
    }
}
