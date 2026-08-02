package com.yandex.fintechsdk.data.config.impl.internal.datasources.network.requesters.payment.applink;

import defpackage.an11;
import defpackage.b23;
import defpackage.d3t;
import defpackage.e23;
import defpackage.g3t;
import defpackage.jgs;
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
        return new d3t();
    }

    @Override // com.yandex.fintechsdk.core.network.api.request.a
    public final Object d(Object obj) {
        e23 e23Var = ((g3t) obj).a;
        Boolean bool = e23Var.a;
        Boolean bool2 = e23Var.b;
        boolean booleanValue = bool2 != null ? bool2.booleanValue() : false;
        Boolean bool3 = e23Var.c;
        boolean booleanValue2 = bool3 != null ? bool3.booleanValue() : false;
        Boolean bool4 = e23Var.d;
        return new b23(booleanValue, booleanValue2, bool4 != null ? bool4.booleanValue() : true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.fintechsdk.core.network.api.request.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(d3t d3tVar, ContinuationImpl continuationImpl) {
        GetApplinkPaymentConfigRequester$executeRequest$1 getApplinkPaymentConfigRequester$executeRequest$1;
        int i;
        if (continuationImpl instanceof GetApplinkPaymentConfigRequester$executeRequest$1) {
            getApplinkPaymentConfigRequester$executeRequest$1 = (GetApplinkPaymentConfigRequester$executeRequest$1) continuationImpl;
            int i2 = getApplinkPaymentConfigRequester$executeRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getApplinkPaymentConfigRequester$executeRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getApplinkPaymentConfigRequester$executeRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getApplinkPaymentConfigRequester$executeRequest$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                an11 e = qoi0.e(g3t.class);
                getApplinkPaymentConfigRequester$executeRequest$1.label = 1;
                jgs jgsVar = this.b;
                jgsVar.getClass();
                Object d = com.yandex.fintechsdk.core.network.impl.internal.network.a.d(jgsVar, d3tVar, e, getApplinkPaymentConfigRequester$executeRequest$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        getApplinkPaymentConfigRequester$executeRequest$1 = new GetApplinkPaymentConfigRequester$executeRequest$1(this, continuationImpl);
        Object obj2 = getApplinkPaymentConfigRequester$executeRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getApplinkPaymentConfigRequester$executeRequest$1.label;
        if (i == 0) {
        }
    }
}
