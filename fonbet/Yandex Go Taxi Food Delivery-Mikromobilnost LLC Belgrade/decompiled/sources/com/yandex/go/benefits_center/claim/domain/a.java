package com.yandex.go.benefits_center.claim.domain;

import com.yandex.go.benefits_center.data.model.BenefitGeoState;
import com.yandex.go.benefits_center.data.model.BenefitPaymentInfo;
import com.yandex.go.payments.paymentlist.data.c;
import defpackage.ny61;
import defpackage.rfa0;
import defpackage.rn5;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final com.yandex.go.benefits_center.data.a a;
    public final rn5 b;
    public final com.yandex.go.benefits_center.claim.data.a c;

    public a(com.yandex.go.benefits_center.data.a aVar, rn5 rn5Var, com.yandex.go.benefits_center.claim.data.a aVar2) {
        this.a = aVar;
        this.b = rn5Var;
        this.c = aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r12 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        BenefitsClaimInteractor$claim$1 benefitsClaimInteractor$claim$1;
        int i;
        if (continuationImpl instanceof BenefitsClaimInteractor$claim$1) {
            benefitsClaimInteractor$claim$1 = (BenefitsClaimInteractor$claim$1) continuationImpl;
            int i2 = benefitsClaimInteractor$claim$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                benefitsClaimInteractor$claim$1.label = i2 - Integer.MIN_VALUE;
                BenefitsClaimInteractor$claim$1 benefitsClaimInteractor$claim$12 = benefitsClaimInteractor$claim$1;
                Object obj = benefitsClaimInteractor$claim$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = benefitsClaimInteractor$claim$12.label;
                if (i != 0) {
                    b.b(obj);
                    benefitsClaimInteractor$claim$12.L$0 = str;
                    benefitsClaimInteractor$claim$12.L$1 = str2;
                    benefitsClaimInteractor$claim$12.L$2 = str3;
                    benefitsClaimInteractor$claim$12.label = 1;
                    obj = this.a.a(benefitsClaimInteractor$claim$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    str3 = (String) benefitsClaimInteractor$claim$12.L$2;
                    str2 = (String) benefitsClaimInteractor$claim$12.L$1;
                    str = (String) benefitsClaimInteractor$claim$12.L$0;
                    b.b(obj);
                }
                String str4 = str2;
                rfa0 f = ((c) this.b.a).f(null);
                BenefitPaymentInfo benefitPaymentInfo = new BenefitPaymentInfo(f.b, f.a.getCode());
                benefitsClaimInteractor$claim$12.L$0 = null;
                benefitsClaimInteractor$claim$12.L$1 = null;
                benefitsClaimInteractor$claim$12.L$2 = null;
                benefitsClaimInteractor$claim$12.L$3 = null;
                benefitsClaimInteractor$claim$12.label = 2;
                Object a = this.c.a(str, str4, str3, (BenefitGeoState) obj, benefitPaymentInfo, benefitsClaimInteractor$claim$12);
                return a != coroutineSingletons ? coroutineSingletons : a;
            }
        }
        benefitsClaimInteractor$claim$1 = new BenefitsClaimInteractor$claim$1(this, continuationImpl);
        BenefitsClaimInteractor$claim$1 benefitsClaimInteractor$claim$122 = benefitsClaimInteractor$claim$1;
        Object obj2 = benefitsClaimInteractor$claim$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = benefitsClaimInteractor$claim$122.label;
        if (i != 0) {
        }
        String str42 = str2;
        rfa0 f2 = ((c) this.b.a).f(null);
        BenefitPaymentInfo benefitPaymentInfo2 = new BenefitPaymentInfo(f2.b, f2.a.getCode());
        benefitsClaimInteractor$claim$122.L$0 = null;
        benefitsClaimInteractor$claim$122.L$1 = null;
        benefitsClaimInteractor$claim$122.L$2 = null;
        benefitsClaimInteractor$claim$122.L$3 = null;
        benefitsClaimInteractor$claim$122.label = 2;
        Object a2 = this.c.a(str, str42, str3, (BenefitGeoState) obj2, benefitPaymentInfo2, benefitsClaimInteractor$claim$122);
        if (a2 != coroutineSingletons2) {
        }
    }
}
