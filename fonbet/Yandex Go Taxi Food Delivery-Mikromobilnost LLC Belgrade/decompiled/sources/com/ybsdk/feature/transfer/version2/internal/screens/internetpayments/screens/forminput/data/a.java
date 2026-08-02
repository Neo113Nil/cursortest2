package com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;
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

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r13 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        InternetPaymentFormInputRepository$getProviderForm$1 internetPaymentFormInputRepository$getProviderForm$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof InternetPaymentFormInputRepository$getProviderForm$1) {
            internetPaymentFormInputRepository$getProviderForm$1 = (InternetPaymentFormInputRepository$getProviderForm$1) continuationImpl;
            int i2 = internetPaymentFormInputRepository$getProviderForm$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                internetPaymentFormInputRepository$getProviderForm$1.label = i2 - Integer.MIN_VALUE;
                Object obj = internetPaymentFormInputRepository$getProviderForm$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = internetPaymentFormInputRepository$getProviderForm$1.label;
                if (i != 0) {
                    b.b(obj);
                    InternetPaymentFormInputRepository$getProviderForm$2 internetPaymentFormInputRepository$getProviderForm$2 = new InternetPaymentFormInputRepository$getProviderForm$2(this, str, null);
                    internetPaymentFormInputRepository$getProviderForm$1.label = 1;
                    c = c.c(internetPaymentFormInputRepository$getProviderForm$2, internetPaymentFormInputRepository$getProviderForm$1);
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
                InternetPaymentFormInputRepository$getProviderForm$3$1 internetPaymentFormInputRepository$getProviderForm$3$1 = new InternetPaymentFormInputRepository$getProviderForm$3$1(2, this, a.class, "toResultEntity", "toResultEntity(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/internetpayments/GetInternetProviderFormResponse;)Lcom/ybsdk/feature/transfer/version2/internal/screens/internetpayments/screens/forminput/domain/InternetPaymentFormInputEntity;", 4);
                internetPaymentFormInputRepository$getProviderForm$1.label = 2;
                Object d = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) c, internetPaymentFormInputRepository$getProviderForm$3$1, internetPaymentFormInputRepository$getProviderForm$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        internetPaymentFormInputRepository$getProviderForm$1 = new InternetPaymentFormInputRepository$getProviderForm$1(this, continuationImpl);
        Object obj2 = internetPaymentFormInputRepository$getProviderForm$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = internetPaymentFormInputRepository$getProviderForm$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
