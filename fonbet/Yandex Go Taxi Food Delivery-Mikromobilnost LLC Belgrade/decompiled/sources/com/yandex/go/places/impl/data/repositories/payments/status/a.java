package com.yandex.go.places.impl.data.repositories.payments.status;

import com.yandex.go.places.impl.data.entities.network.payments.PaymentStatusResponse;
import defpackage.bl80;
import defpackage.cmt;
import defpackage.kk80;
import defpackage.mk80;
import defpackage.ny61;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final bl80 a;

    public a(bl80 bl80Var) {
        this.a = bl80Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        PaymentStatusRepositoryImpl$getPaymentStatus$1 paymentStatusRepositoryImpl$getPaymentStatus$1;
        int i;
        try {
            if (continuationImpl instanceof PaymentStatusRepositoryImpl$getPaymentStatus$1) {
                paymentStatusRepositoryImpl$getPaymentStatus$1 = (PaymentStatusRepositoryImpl$getPaymentStatus$1) continuationImpl;
                int i2 = paymentStatusRepositoryImpl$getPaymentStatus$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    paymentStatusRepositoryImpl$getPaymentStatus$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = paymentStatusRepositoryImpl$getPaymentStatus$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = paymentStatusRepositoryImpl$getPaymentStatus$1.label;
                    if (i != 0) {
                        b.b(obj);
                        cmt<PaymentStatusResponse> g = this.a.a().g(str);
                        paymentStatusRepositoryImpl$getPaymentStatus$1.L$0 = null;
                        paymentStatusRepositoryImpl$getPaymentStatus$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.d(g, paymentStatusRepositoryImpl$getPaymentStatus$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    return new kk80((PaymentStatusResponse) obj);
                }
            }
            if (i != 0) {
            }
            return new kk80((PaymentStatusResponse) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new mk80(th);
        }
        paymentStatusRepositoryImpl$getPaymentStatus$1 = new PaymentStatusRepositoryImpl$getPaymentStatus$1(this, continuationImpl);
        Object obj2 = paymentStatusRepositoryImpl$getPaymentStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentStatusRepositoryImpl$getPaymentStatus$1.label;
    }
}
