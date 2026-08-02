package com.yandex.go.benefits_center.activation.domain;

import com.yandex.go.benefits_center.data.model.BenefitGeoState;
import com.yandex.go.benefits_center.data.model.BenefitPaymentInfo;
import com.yandex.go.payments.paymentlist.data.c;
import defpackage.evu0;
import defpackage.ny61;
import defpackage.rfa0;
import defpackage.rn5;
import defpackage.xl5;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a {
    public final com.yandex.go.benefits_center.data.a a;
    public final rn5 b;
    public final com.yandex.go.benefits_center.activation.data.a c;

    public a(com.yandex.go.benefits_center.data.a aVar, rn5 rn5Var, com.yandex.go.benefits_center.activation.data.a aVar2) {
        this.a = aVar;
        this.b = rn5Var;
        this.c = aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        BenefitActivationInteractor$activate$1 benefitActivationInteractor$activate$1;
        int i;
        BenefitGeoState benefitGeoState;
        if (continuationImpl instanceof BenefitActivationInteractor$activate$1) {
            benefitActivationInteractor$activate$1 = (BenefitActivationInteractor$activate$1) continuationImpl;
            int i2 = benefitActivationInteractor$activate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                benefitActivationInteractor$activate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = benefitActivationInteractor$activate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = benefitActivationInteractor$activate$1.label;
                if (i != 0) {
                    b.b(obj);
                    benefitActivationInteractor$activate$1.L$0 = str;
                    benefitActivationInteractor$activate$1.label = 1;
                    obj = this.a.a(benefitActivationInteractor$activate$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    str = (String) benefitActivationInteractor$activate$1.L$0;
                    b.b(obj);
                }
                benefitGeoState = (BenefitGeoState) obj;
                if (benefitGeoState != null) {
                    return xl5.a;
                }
                String obj2 = evu0.k0(str).toString();
                rfa0 f = ((c) this.b.a).f(null);
                BenefitPaymentInfo benefitPaymentInfo = new BenefitPaymentInfo(f.b, f.a.getCode());
                benefitActivationInteractor$activate$1.L$0 = null;
                benefitActivationInteractor$activate$1.L$1 = null;
                benefitActivationInteractor$activate$1.label = 2;
                Object a = this.c.a(obj2, benefitGeoState, benefitPaymentInfo, benefitActivationInteractor$activate$1);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        benefitActivationInteractor$activate$1 = new BenefitActivationInteractor$activate$1(this, continuationImpl);
        Object obj3 = benefitActivationInteractor$activate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = benefitActivationInteractor$activate$1.label;
        if (i != 0) {
        }
        benefitGeoState = (BenefitGeoState) obj3;
        if (benefitGeoState != null) {
        }
    }
}
