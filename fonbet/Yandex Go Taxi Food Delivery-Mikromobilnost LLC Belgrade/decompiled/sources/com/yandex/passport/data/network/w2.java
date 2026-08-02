package com.yandex.passport.data.network;

import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class w2 implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;

    public w2(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
        this.a = pVar;
        this.b = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.yandex.passport.data.network.core.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v2 v2Var, ContinuationImpl continuationImpl) {
        GetBadgesSpecificationRequest$RequestFactory$createRequest$1 getBadgesSpecificationRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.o oVar;
        if (continuationImpl instanceof GetBadgesSpecificationRequest$RequestFactory$createRequest$1) {
            getBadgesSpecificationRequest$RequestFactory$createRequest$1 = (GetBadgesSpecificationRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = getBadgesSpecificationRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getBadgesSpecificationRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getBadgesSpecificationRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getBadgesSpecificationRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.o oVar2 = new com.yandex.passport.common.network.o((String) this.a.a(v2Var.a, null).a);
                    oVar2.c("/1/badges-specification.json");
                    getBadgesSpecificationRequest$RequestFactory$createRequest$1.L$0 = oVar2;
                    getBadgesSpecificationRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(oVar2, getBadgesSpecificationRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    oVar = oVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oVar = (com.yandex.passport.common.network.o) getBadgesSpecificationRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return oVar.a();
            }
        }
        getBadgesSpecificationRequest$RequestFactory$createRequest$1 = new GetBadgesSpecificationRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = getBadgesSpecificationRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getBadgesSpecificationRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return oVar.a();
    }
}
