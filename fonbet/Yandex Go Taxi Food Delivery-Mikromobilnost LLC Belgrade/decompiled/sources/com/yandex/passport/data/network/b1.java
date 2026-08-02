package com.yandex.passport.data.network;

import defpackage.ny61;
import defpackage.oo31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class b1 implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;

    public b1(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
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
    public final Object a(a1 a1Var, ContinuationImpl continuationImpl) {
        CountrySuggestionRequest$RequestFactory$createRequest$1 countrySuggestionRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.r rVar;
        if (continuationImpl instanceof CountrySuggestionRequest$RequestFactory$createRequest$1) {
            countrySuggestionRequest$RequestFactory$createRequest$1 = (CountrySuggestionRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = countrySuggestionRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                countrySuggestionRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = countrySuggestionRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = countrySuggestionRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.r g = oo31.g((String) this.a.a(a1Var.a, null).a, "/1/suggest/country/");
                    g.f("track_id", a1Var.b);
                    countrySuggestionRequest$RequestFactory$createRequest$1.L$0 = g;
                    countrySuggestionRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(g, countrySuggestionRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rVar = g;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rVar = (com.yandex.passport.common.network.r) countrySuggestionRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return rVar.a();
            }
        }
        countrySuggestionRequest$RequestFactory$createRequest$1 = new CountrySuggestionRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = countrySuggestionRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = countrySuggestionRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return rVar.a();
    }
}
