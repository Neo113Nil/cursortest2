package com.yandex.go.chargers.offer.plus_dvizh.domain;

import com.yandex.go.chargers.offer.passes.domain.models.ChargersNoSelectedPaymentMethodException;
import com.yandex.go.chargers.offer.plus_dvizh.data.f;
import defpackage.e2e0;
import defpackage.m6a0;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.json.b;

/* loaded from: classes12.dex */
public final class a {
    public final e2e0 a;
    public final f b;
    public final com.yandex.go.chargers.payments.data.a c;

    public a(e2e0 e2e0Var, f fVar, com.yandex.go.chargers.payments.data.a aVar) {
        this.a = e2e0Var;
        this.b = fVar;
        this.c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl, b bVar) {
        ChargersPlusDvizhPurchaseInteractor$purchase$1 chargersPlusDvizhPurchaseInteractor$purchase$1;
        int i;
        if (continuationImpl instanceof ChargersPlusDvizhPurchaseInteractor$purchase$1) {
            chargersPlusDvizhPurchaseInteractor$purchase$1 = (ChargersPlusDvizhPurchaseInteractor$purchase$1) continuationImpl;
            int i2 = chargersPlusDvizhPurchaseInteractor$purchase$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPlusDvizhPurchaseInteractor$purchase$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPlusDvizhPurchaseInteractor$purchase$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPlusDvizhPurchaseInteractor$purchase$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    m6a0 d = this.c.c().d();
                    if (d == null) {
                        throw new ChargersNoSelectedPaymentMethodException();
                    }
                    String str2 = d.b;
                    if (str2 == null) {
                        throw new ChargersNoSelectedPaymentMethodException();
                    }
                    if (str.length() == 0) {
                        str = "chargers";
                    }
                    chargersPlusDvizhPurchaseInteractor$purchase$1.L$0 = null;
                    chargersPlusDvizhPurchaseInteractor$purchase$1.L$1 = null;
                    chargersPlusDvizhPurchaseInteractor$purchase$1.L$2 = null;
                    chargersPlusDvizhPurchaseInteractor$purchase$1.L$3 = null;
                    chargersPlusDvizhPurchaseInteractor$purchase$1.label = 1;
                    obj = this.b.a.b(bVar, str2, str, chargersPlusDvizhPurchaseInteractor$purchase$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                String str3 = (String) obj;
                this.a.d("PLUS_DVIZH_PURCHASING_POLLING_SERVICE", str3);
                return str3;
            }
        }
        chargersPlusDvizhPurchaseInteractor$purchase$1 = new ChargersPlusDvizhPurchaseInteractor$purchase$1(this, continuationImpl);
        Object obj2 = chargersPlusDvizhPurchaseInteractor$purchase$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPlusDvizhPurchaseInteractor$purchase$1.label;
        if (i != 0) {
        }
        String str32 = (String) obj2;
        this.a.d("PLUS_DVIZH_PURCHASING_POLLING_SERVICE", str32);
        return str32;
    }
}
