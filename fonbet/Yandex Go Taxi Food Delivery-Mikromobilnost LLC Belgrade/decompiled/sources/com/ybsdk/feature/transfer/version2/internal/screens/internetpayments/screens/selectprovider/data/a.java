package com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.data;

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
    public final Object a(ContinuationImpl continuationImpl) {
        InternetPaymentSelectProviderRepository$getAllProviders$1 internetPaymentSelectProviderRepository$getAllProviders$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof InternetPaymentSelectProviderRepository$getAllProviders$1) {
            internetPaymentSelectProviderRepository$getAllProviders$1 = (InternetPaymentSelectProviderRepository$getAllProviders$1) continuationImpl;
            int i2 = internetPaymentSelectProviderRepository$getAllProviders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                internetPaymentSelectProviderRepository$getAllProviders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = internetPaymentSelectProviderRepository$getAllProviders$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = internetPaymentSelectProviderRepository$getAllProviders$1.label;
                if (i != 0) {
                    b.b(obj);
                    InternetPaymentSelectProviderRepository$getAllProviders$2 internetPaymentSelectProviderRepository$getAllProviders$2 = new InternetPaymentSelectProviderRepository$getAllProviders$2(this, null);
                    internetPaymentSelectProviderRepository$getAllProviders$1.label = 1;
                    c = c.c(internetPaymentSelectProviderRepository$getAllProviders$2, internetPaymentSelectProviderRepository$getAllProviders$1);
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
                InternetPaymentSelectProviderRepository$getAllProviders$3$1 internetPaymentSelectProviderRepository$getAllProviders$3$1 = new InternetPaymentSelectProviderRepository$getAllProviders$3$1(2, this, a.class, "toResultEntity", "toResultEntity(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/internetpayments/GetAllInternetProvidersResponse;)Lcom/ybsdk/feature/transfer/version2/internal/screens/internetpayments/screens/selectprovider/domain/InternetProvidersListEntity;", 4);
                internetPaymentSelectProviderRepository$getAllProviders$1.label = 2;
                Object d = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) c, internetPaymentSelectProviderRepository$getAllProviders$3$1, internetPaymentSelectProviderRepository$getAllProviders$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        internetPaymentSelectProviderRepository$getAllProviders$1 = new InternetPaymentSelectProviderRepository$getAllProviders$1(this, continuationImpl);
        Object obj2 = internetPaymentSelectProviderRepository$getAllProviders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = internetPaymentSelectProviderRepository$getAllProviders$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
