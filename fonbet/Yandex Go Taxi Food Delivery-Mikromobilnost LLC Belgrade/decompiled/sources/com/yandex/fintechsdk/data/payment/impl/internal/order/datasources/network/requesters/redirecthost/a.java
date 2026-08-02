package com.yandex.fintechsdk.data.payment.impl.internal.order.datasources.network.requesters.redirecthost;

import defpackage.an11;
import defpackage.ect;
import defpackage.jgs;
import defpackage.nli0;
import defpackage.ny61;
import defpackage.qoi0;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a extends com.yandex.fintechsdk.core.network.api.request.a {
    public final jgs b;

    public a(jgs jgsVar) {
        super(0);
        this.b = jgsVar;
    }

    @Override // com.yandex.fintechsdk.core.network.api.request.a
    public final Object a(Object obj) {
        return new ect((String) obj);
    }

    @Override // com.yandex.fintechsdk.core.network.api.request.a
    public final Object d(Object obj) {
        return ((nli0) obj).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.fintechsdk.core.network.api.request.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ect ectVar, ContinuationImpl continuationImpl) {
        RedirectHostUrlRequester$executeRequest$1 redirectHostUrlRequester$executeRequest$1;
        int i;
        if (continuationImpl instanceof RedirectHostUrlRequester$executeRequest$1) {
            redirectHostUrlRequester$executeRequest$1 = (RedirectHostUrlRequester$executeRequest$1) continuationImpl;
            int i2 = redirectHostUrlRequester$executeRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                redirectHostUrlRequester$executeRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = redirectHostUrlRequester$executeRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = redirectHostUrlRequester$executeRequest$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                an11 e = qoi0.e(nli0.class);
                redirectHostUrlRequester$executeRequest$1.label = 1;
                jgs jgsVar = this.b;
                jgsVar.getClass();
                Object d = com.yandex.fintechsdk.core.network.impl.internal.network.a.d(jgsVar, ectVar, e, redirectHostUrlRequester$executeRequest$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        redirectHostUrlRequester$executeRequest$1 = new RedirectHostUrlRequester$executeRequest$1(this, continuationImpl);
        Object obj2 = redirectHostUrlRequester$executeRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = redirectHostUrlRequester$executeRequest$1.label;
        if (i == 0) {
        }
    }
}
