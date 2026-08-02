package com.yandex.fintechsdk.data.config.impl.internal.datasources.network.requesters.payment.paymentkit;

import com.yandex.fintechsdk.entities.config.payment.paymentkit.PaymentKitConfig;
import defpackage.abt;
import defpackage.an11;
import defpackage.gw00;
import defpackage.jgs;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.tat;
import defpackage.tcc;
import defpackage.wat;
import defpackage.ykp;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
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
        return new tat(((wat) obj).a);
    }

    @Override // com.yandex.fintechsdk.core.network.api.request.a
    public final Object d(Object obj) {
        abt abtVar = (abt) obj;
        String str = abtVar.a;
        List<ykp> list = abtVar.b;
        int d = gw00.d(tcc.n(list, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (ykp ykpVar : list) {
            Pair pair = new Pair(ykpVar.a, ykpVar.b);
            linkedHashMap.put(pair.c(), pair.f());
        }
        return new PaymentKitConfig(str, linkedHashMap, abtVar.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.fintechsdk.core.network.api.request.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(tat tatVar, ContinuationImpl continuationImpl) {
        GetPaymentKitConfigRequester$executeRequest$1 getPaymentKitConfigRequester$executeRequest$1;
        int i;
        if (continuationImpl instanceof GetPaymentKitConfigRequester$executeRequest$1) {
            getPaymentKitConfigRequester$executeRequest$1 = (GetPaymentKitConfigRequester$executeRequest$1) continuationImpl;
            int i2 = getPaymentKitConfigRequester$executeRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getPaymentKitConfigRequester$executeRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getPaymentKitConfigRequester$executeRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getPaymentKitConfigRequester$executeRequest$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                an11 e = qoi0.e(abt.class);
                getPaymentKitConfigRequester$executeRequest$1.label = 1;
                jgs jgsVar = this.b;
                jgsVar.getClass();
                Object d = com.yandex.fintechsdk.core.network.impl.internal.network.a.d(jgsVar, tatVar, e, getPaymentKitConfigRequester$executeRequest$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        getPaymentKitConfigRequester$executeRequest$1 = new GetPaymentKitConfigRequester$executeRequest$1(this, continuationImpl);
        Object obj2 = getPaymentKitConfigRequester$executeRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getPaymentKitConfigRequester$executeRequest$1.label;
        if (i == 0) {
        }
    }
}
