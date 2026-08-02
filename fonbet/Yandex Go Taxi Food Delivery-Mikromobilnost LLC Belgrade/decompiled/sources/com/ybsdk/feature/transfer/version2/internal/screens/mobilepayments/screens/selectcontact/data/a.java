package com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;
import com.ybsdk.feature.transfer.version2.internal.network.dto.mobilepayments.GetLastMobilePaymentsRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.mobilepayments.GetSuggestedMobileProviderRequest;
import defpackage.ny61;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final Transfer2Api a;

    public a(Transfer2Api transfer2Api) {
        this.a = transfer2Api;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (r13 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MobilePaymentSelectContactRepository$getLastMobilePayments$1 mobilePaymentSelectContactRepository$getLastMobilePayments$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof MobilePaymentSelectContactRepository$getLastMobilePayments$1) {
            mobilePaymentSelectContactRepository$getLastMobilePayments$1 = (MobilePaymentSelectContactRepository$getLastMobilePayments$1) continuationImpl;
            int i2 = mobilePaymentSelectContactRepository$getLastMobilePayments$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobilePaymentSelectContactRepository$getLastMobilePayments$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobilePaymentSelectContactRepository$getLastMobilePayments$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobilePaymentSelectContactRepository$getLastMobilePayments$1.label;
                if (i != 0) {
                    b.b(obj);
                    MobilePaymentSelectContactRepository$getLastMobilePayments$2 mobilePaymentSelectContactRepository$getLastMobilePayments$2 = new MobilePaymentSelectContactRepository$getLastMobilePayments$2(this, new GetLastMobilePaymentsRequest(null), null);
                    mobilePaymentSelectContactRepository$getLastMobilePayments$1.label = 1;
                    c = c.c(mobilePaymentSelectContactRepository$getLastMobilePayments$2, mobilePaymentSelectContactRepository$getLastMobilePayments$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                MobilePaymentSelectContactRepository$getLastMobilePayments$3$1 mobilePaymentSelectContactRepository$getLastMobilePayments$3$1 = new MobilePaymentSelectContactRepository$getLastMobilePayments$3$1(2, this, a.class, "toResultEntity", "toResultEntity(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/mobilepayments/GetLastMobilePaymentsResponse;)Lcom/ybsdk/feature/transfer/version2/internal/screens/mobilepayments/screens/selectcontact/domain/LastMobilePaymentsEntity;", 4);
                mobilePaymentSelectContactRepository$getLastMobilePayments$1.label = 2;
                Object d = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) c, mobilePaymentSelectContactRepository$getLastMobilePayments$3$1, mobilePaymentSelectContactRepository$getLastMobilePayments$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        mobilePaymentSelectContactRepository$getLastMobilePayments$1 = new MobilePaymentSelectContactRepository$getLastMobilePayments$1(this, continuationImpl);
        Object obj2 = mobilePaymentSelectContactRepository$getLastMobilePayments$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobilePaymentSelectContactRepository$getLastMobilePayments$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (r13 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        MobilePaymentSelectContactRepository$getProviderByPhone$1 mobilePaymentSelectContactRepository$getProviderByPhone$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof MobilePaymentSelectContactRepository$getProviderByPhone$1) {
            mobilePaymentSelectContactRepository$getProviderByPhone$1 = (MobilePaymentSelectContactRepository$getProviderByPhone$1) continuationImpl;
            int i2 = mobilePaymentSelectContactRepository$getProviderByPhone$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobilePaymentSelectContactRepository$getProviderByPhone$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobilePaymentSelectContactRepository$getProviderByPhone$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobilePaymentSelectContactRepository$getProviderByPhone$1.label;
                if (i != 0) {
                    b.b(obj);
                    MobilePaymentSelectContactRepository$getProviderByPhone$2 mobilePaymentSelectContactRepository$getProviderByPhone$2 = new MobilePaymentSelectContactRepository$getProviderByPhone$2(this, new GetSuggestedMobileProviderRequest(str), null);
                    mobilePaymentSelectContactRepository$getProviderByPhone$1.label = 1;
                    c = c.c(mobilePaymentSelectContactRepository$getProviderByPhone$2, mobilePaymentSelectContactRepository$getProviderByPhone$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                MobilePaymentSelectContactRepository$getProviderByPhone$3$1 mobilePaymentSelectContactRepository$getProviderByPhone$3$1 = new MobilePaymentSelectContactRepository$getProviderByPhone$3$1(2, this, a.class, "toResultEntity", "toResultEntity(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/mobilepayments/GetSuggestedMobileProviderResponse;)Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/PaymentProviderEntity;", 4);
                mobilePaymentSelectContactRepository$getProviderByPhone$1.label = 2;
                Object d = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) c, mobilePaymentSelectContactRepository$getProviderByPhone$3$1, mobilePaymentSelectContactRepository$getProviderByPhone$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        mobilePaymentSelectContactRepository$getProviderByPhone$1 = new MobilePaymentSelectContactRepository$getProviderByPhone$1(this, continuationImpl);
        Object obj2 = mobilePaymentSelectContactRepository$getProviderByPhone$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobilePaymentSelectContactRepository$getProviderByPhone$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
