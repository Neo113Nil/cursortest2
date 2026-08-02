package com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;
import com.ybsdk.feature.transfer.version2.internal.network.dto.mobilepayments.GetAllMobileProvidersRequest;
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
    public final Object a(String str, ContinuationImpl continuationImpl) {
        MobileProvidersListRepository$getAllProviders$1 mobileProvidersListRepository$getAllProviders$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof MobileProvidersListRepository$getAllProviders$1) {
            mobileProvidersListRepository$getAllProviders$1 = (MobileProvidersListRepository$getAllProviders$1) continuationImpl;
            int i2 = mobileProvidersListRepository$getAllProviders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobileProvidersListRepository$getAllProviders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobileProvidersListRepository$getAllProviders$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobileProvidersListRepository$getAllProviders$1.label;
                if (i != 0) {
                    b.b(obj);
                    MobileProvidersListRepository$getAllProviders$2 mobileProvidersListRepository$getAllProviders$2 = new MobileProvidersListRepository$getAllProviders$2(this, new GetAllMobileProvidersRequest(str), null);
                    mobileProvidersListRepository$getAllProviders$1.label = 1;
                    c = c.c(mobileProvidersListRepository$getAllProviders$2, mobileProvidersListRepository$getAllProviders$1);
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
                MobileProvidersListRepository$getAllProviders$3$1 mobileProvidersListRepository$getAllProviders$3$1 = new MobileProvidersListRepository$getAllProviders$3$1(2, this, a.class, "toResultEntity", "toResultEntity(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/mobilepayments/GetAllMobileProvidersResponse;)Lcom/ybsdk/feature/transfer/version2/internal/screens/mobilepayments/screens/providers/domain/MobileProvidersListEntity;", 4);
                mobileProvidersListRepository$getAllProviders$1.label = 2;
                Object d = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) c, mobileProvidersListRepository$getAllProviders$3$1, mobileProvidersListRepository$getAllProviders$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        mobileProvidersListRepository$getAllProviders$1 = new MobileProvidersListRepository$getAllProviders$1(this, continuationImpl);
        Object obj2 = mobileProvidersListRepository$getAllProviders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobileProvidersListRepository$getAllProviders$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
