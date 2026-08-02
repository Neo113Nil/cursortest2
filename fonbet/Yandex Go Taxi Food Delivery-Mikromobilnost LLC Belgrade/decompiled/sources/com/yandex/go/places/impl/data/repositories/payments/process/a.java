package com.yandex.go.places.impl.data.repositories.payments.process;

import com.yandex.go.places.impl.data.entities.network.payments.PlacesProcessPaymentMethod;
import com.yandex.go.places.impl.data.entities.network.payments.PlacesProcessPaymentRequestParams;
import com.yandex.go.places.impl.data.entities.network.payments.PlacesProcessPaymentResponse;
import com.yandex.go.places.models.domain.entities.PaymentProcessingState;
import defpackage.bl80;
import defpackage.bvf0;
import defpackage.cmt;
import defpackage.kk80;
import defpackage.mk80;
import defpackage.ny61;
import defpackage.zzs;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class a {
    public final bl80 a;
    public final r0 b = bvf0.c(PaymentProcessingState.IN_PROGRESS);

    public a(bl80 bl80Var) {
        this.a = bl80Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, PaymentMethod$Type paymentMethod$Type, zzs zzsVar, ContinuationImpl continuationImpl) {
        PaymentProcessRepositoryImpl$processPayment$1 paymentProcessRepositoryImpl$processPayment$1;
        int i;
        try {
            if (continuationImpl instanceof PaymentProcessRepositoryImpl$processPayment$1) {
                paymentProcessRepositoryImpl$processPayment$1 = (PaymentProcessRepositoryImpl$processPayment$1) continuationImpl;
                int i2 = paymentProcessRepositoryImpl$processPayment$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    paymentProcessRepositoryImpl$processPayment$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = paymentProcessRepositoryImpl$processPayment$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = paymentProcessRepositoryImpl$processPayment$1.label;
                    if (i != 0) {
                        b.b(obj);
                        cmt<PlacesProcessPaymentResponse> d = this.a.a().d(new PlacesProcessPaymentRequestParams(str, zzsVar, new PlacesProcessPaymentMethod(str2, paymentMethod$Type.getCode())));
                        paymentProcessRepositoryImpl$processPayment$1.L$0 = null;
                        paymentProcessRepositoryImpl$processPayment$1.L$1 = null;
                        paymentProcessRepositoryImpl$processPayment$1.L$2 = null;
                        paymentProcessRepositoryImpl$processPayment$1.L$3 = null;
                        paymentProcessRepositoryImpl$processPayment$1.L$4 = null;
                        paymentProcessRepositoryImpl$processPayment$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.d(d, paymentProcessRepositoryImpl$processPayment$1);
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
                    return new kk80((PlacesProcessPaymentResponse) obj);
                }
            }
            if (i != 0) {
            }
            return new kk80((PlacesProcessPaymentResponse) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new mk80(th);
        }
        paymentProcessRepositoryImpl$processPayment$1 = new PaymentProcessRepositoryImpl$processPayment$1(this, continuationImpl);
        Object obj2 = paymentProcessRepositoryImpl$processPayment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentProcessRepositoryImpl$processPayment$1.label;
    }
}
