package com.ybsdk.feature.partnerpayments.internal.domain;

import com.ybsdk.core.utils.d;
import com.ybsdk.feature.partnerpayments.api.PartnerPaymentsFeature$BindingStatus;
import com.ybsdk.utils.poller.b;
import com.ybsdk.utils.poller.c;
import defpackage.d6v;
import defpackage.l0e0;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final com.ybsdk.feature.partnerpayments.internal.data.a a;
    public final b b;

    public a(com.ybsdk.feature.partnerpayments.internal.data.a aVar, b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        PartnerPaymentsInteractor$getPartnerPaymentSaveStatus$1 partnerPaymentsInteractor$getPartnerPaymentSaveStatus$1;
        int i;
        if (continuationImpl instanceof PartnerPaymentsInteractor$getPartnerPaymentSaveStatus$1) {
            partnerPaymentsInteractor$getPartnerPaymentSaveStatus$1 = (PartnerPaymentsInteractor$getPartnerPaymentSaveStatus$1) continuationImpl;
            int i2 = partnerPaymentsInteractor$getPartnerPaymentSaveStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                partnerPaymentsInteractor$getPartnerPaymentSaveStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = partnerPaymentsInteractor$getPartnerPaymentSaveStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = partnerPaymentsInteractor$getPartnerPaymentSaveStatus$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                c c = this.b.c(l0e0.b, new PartnerPaymentsInteractor$getPartnerPaymentSaveStatus$2(2, null), new PartnerPaymentsInteractor$getPartnerPaymentSaveStatus$3(this, str, null));
                partnerPaymentsInteractor$getPartnerPaymentSaveStatus$1.label = 1;
                Object e = c.e(partnerPaymentsInteractor$getPartnerPaymentSaveStatus$1);
                return e == coroutineSingletons ? coroutineSingletons : e;
            }
        }
        partnerPaymentsInteractor$getPartnerPaymentSaveStatus$1 = new PartnerPaymentsInteractor$getPartnerPaymentSaveStatus$1(this, continuationImpl);
        Object obj2 = partnerPaymentsInteractor$getPartnerPaymentSaveStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = partnerPaymentsInteractor$getPartnerPaymentSaveStatus$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, d6v d6vVar, PartnerPaymentsFeature$BindingStatus partnerPaymentsFeature$BindingStatus, ContinuationImpl continuationImpl) {
        PartnerPaymentsInteractor$savePartnerId$1 partnerPaymentsInteractor$savePartnerId$1;
        int i;
        if (continuationImpl instanceof PartnerPaymentsInteractor$savePartnerId$1) {
            partnerPaymentsInteractor$savePartnerId$1 = (PartnerPaymentsInteractor$savePartnerId$1) continuationImpl;
            int i2 = partnerPaymentsInteractor$savePartnerId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                partnerPaymentsInteractor$savePartnerId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = partnerPaymentsInteractor$savePartnerId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = partnerPaymentsInteractor$savePartnerId$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                PartnerPaymentsInteractor$savePartnerId$2 partnerPaymentsInteractor$savePartnerId$2 = new PartnerPaymentsInteractor$savePartnerId$2(this, str, str2, partnerPaymentsFeature$BindingStatus, null);
                partnerPaymentsInteractor$savePartnerId$1.label = 1;
                Object a = d.a(d6vVar, partnerPaymentsInteractor$savePartnerId$2, partnerPaymentsInteractor$savePartnerId$1);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        partnerPaymentsInteractor$savePartnerId$1 = new PartnerPaymentsInteractor$savePartnerId$1(this, continuationImpl);
        Object obj2 = partnerPaymentsInteractor$savePartnerId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = partnerPaymentsInteractor$savePartnerId$1.label;
        if (i == 0) {
        }
    }
}
