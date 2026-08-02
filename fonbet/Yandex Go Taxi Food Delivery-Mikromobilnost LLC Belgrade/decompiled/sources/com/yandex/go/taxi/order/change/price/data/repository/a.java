package com.yandex.go.taxi.order.change.price.data.repository;

import com.yandex.go.taxi.order.change.price.data.api.AdditionalPaymentApi;
import com.yandex.go.taxi.order.change.price.data.dto.ApplyAdditionalPaymentRequest;
import com.yandex.go.taxi.order.change.price.data.dto.ApplyAdditionalPaymentResponse;
import defpackage.cmt;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.on2;
import defpackage.zn1;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a {
    public final i3y a;

    public a(on2 on2Var) {
        this.a = kotlin.a.a(new zn1(on2Var, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ApplyAdditionalPaymentRepository$applyAdditionalPayment$1 applyAdditionalPaymentRepository$applyAdditionalPayment$1;
        int i;
        if (continuationImpl instanceof ApplyAdditionalPaymentRepository$applyAdditionalPayment$1) {
            applyAdditionalPaymentRepository$applyAdditionalPayment$1 = (ApplyAdditionalPaymentRepository$applyAdditionalPayment$1) continuationImpl;
            int i2 = applyAdditionalPaymentRepository$applyAdditionalPayment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                applyAdditionalPaymentRepository$applyAdditionalPayment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = applyAdditionalPaymentRepository$applyAdditionalPayment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = applyAdditionalPaymentRepository$applyAdditionalPayment$1.label;
                if (i != 0) {
                    b.b(obj);
                    cmt<ApplyAdditionalPaymentResponse> a = ((AdditionalPaymentApi) this.a.getValue()).a(new ApplyAdditionalPaymentRequest(str));
                    applyAdditionalPaymentRepository$applyAdditionalPayment$1.L$0 = null;
                    applyAdditionalPaymentRepository$applyAdditionalPayment$1.L$1 = null;
                    applyAdditionalPaymentRepository$applyAdditionalPayment$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.a(a, null, applyAdditionalPaymentRepository$applyAdditionalPayment$1);
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
                return (ApplyAdditionalPaymentResponse) obj;
            }
        }
        applyAdditionalPaymentRepository$applyAdditionalPayment$1 = new ApplyAdditionalPaymentRepository$applyAdditionalPayment$1(this, continuationImpl);
        Object obj2 = applyAdditionalPaymentRepository$applyAdditionalPayment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = applyAdditionalPaymentRepository$applyAdditionalPayment$1.label;
        if (i != 0) {
        }
        return (ApplyAdditionalPaymentResponse) obj2;
    }
}
