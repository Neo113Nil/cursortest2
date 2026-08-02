package com.yandex.fintechsdk.data.payment.method.impl.internal.card.datasources.network.requesters.init;

import com.yandex.fintechsdk.data.payment.method.api.model.CardBindingCurrency;
import defpackage.an11;
import defpackage.ivv;
import defpackage.jgs;
import defpackage.lvv;
import defpackage.ny61;
import defpackage.pvv;
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
        return new ivv(new lvv((CardBindingCurrency) obj));
    }

    @Override // com.yandex.fintechsdk.core.network.api.request.a
    public final Object d(Object obj) {
        return ((pvv) obj).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.fintechsdk.core.network.api.request.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ivv ivvVar, ContinuationImpl continuationImpl) {
        InitVerificationRequester$executeRequest$1 initVerificationRequester$executeRequest$1;
        int i;
        if (continuationImpl instanceof InitVerificationRequester$executeRequest$1) {
            initVerificationRequester$executeRequest$1 = (InitVerificationRequester$executeRequest$1) continuationImpl;
            int i2 = initVerificationRequester$executeRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                initVerificationRequester$executeRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = initVerificationRequester$executeRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = initVerificationRequester$executeRequest$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                an11 e = qoi0.e(pvv.class);
                initVerificationRequester$executeRequest$1.label = 1;
                jgs jgsVar = this.b;
                jgsVar.getClass();
                Object d = com.yandex.fintechsdk.core.network.impl.internal.network.a.d(jgsVar, ivvVar, e, initVerificationRequester$executeRequest$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        initVerificationRequester$executeRequest$1 = new InitVerificationRequester$executeRequest$1(this, continuationImpl);
        Object obj2 = initVerificationRequester$executeRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = initVerificationRequester$executeRequest$1.label;
        if (i == 0) {
        }
    }
}
