package com.ybsdk.feature.merchants.internal.data;

import com.ybsdk.core.utils.ext.c;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.divkit.api.dto.DivScreenDto;
import com.ybsdk.feature.merchants.internal.network.MerchantsApi;
import defpackage.cr10;
import defpackage.g8e;
import defpackage.ny61;
import defpackage.rr51;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final MerchantsApi a;

    public a(MerchantsApi merchantsApi) {
        this.a = merchantsApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, DivScreenDto divScreenDto, ContinuationImpl continuationImpl) {
        MerchantsRepository$toMerchantsEntity$1 merchantsRepository$toMerchantsEntity$1;
        int i;
        Object b;
        rr51 rr51Var;
        aVar.getClass();
        if (continuationImpl instanceof MerchantsRepository$toMerchantsEntity$1) {
            merchantsRepository$toMerchantsEntity$1 = (MerchantsRepository$toMerchantsEntity$1) continuationImpl;
            int i2 = merchantsRepository$toMerchantsEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                merchantsRepository$toMerchantsEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = merchantsRepository$toMerchantsEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = merchantsRepository$toMerchantsEntity$1.label;
                if (i != 0) {
                    b.b(obj);
                    com.ybsdk.feature.divkit.api.domain.a aVar2 = new com.ybsdk.feature.divkit.api.domain.a(null);
                    DivDataDto divData = divScreenDto.getDivData();
                    merchantsRepository$toMerchantsEntity$1.L$0 = divScreenDto;
                    merchantsRepository$toMerchantsEntity$1.label = 1;
                    b = aVar2.b(divData, merchantsRepository$toMerchantsEntity$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    divScreenDto = (DivScreenDto) merchantsRepository$toMerchantsEntity$1.L$0;
                    b.b(obj);
                    b = ((Result) obj).getValue();
                }
                if (b instanceof Result.Failure) {
                    b = null;
                }
                rr51Var = (rr51) b;
                if (rr51Var != null) {
                    return null;
                }
                com.ybsdk.core.utils.text.b bVar = Text.Companion;
                String title = divScreenDto.getTitle();
                if (title == null) {
                    title = "";
                }
                return new cr10(rr51Var, g8e.i(bVar, title));
            }
        }
        merchantsRepository$toMerchantsEntity$1 = new MerchantsRepository$toMerchantsEntity$1(aVar, continuationImpl);
        Object obj2 = merchantsRepository$toMerchantsEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = merchantsRepository$toMerchantsEntity$1.label;
        if (i != 0) {
        }
        if (b instanceof Result.Failure) {
        }
        rr51Var = (rr51) b;
        if (rr51Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        MerchantsRepository$getMerchants$1 merchantsRepository$getMerchants$1;
        int i;
        if (continuationImpl instanceof MerchantsRepository$getMerchants$1) {
            merchantsRepository$getMerchants$1 = (MerchantsRepository$getMerchants$1) continuationImpl;
            int i2 = merchantsRepository$getMerchants$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                merchantsRepository$getMerchants$1.label = i2 - Integer.MIN_VALUE;
                Object obj = merchantsRepository$getMerchants$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = merchantsRepository$getMerchants$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                MerchantsRepository$getMerchants$2 merchantsRepository$getMerchants$2 = new MerchantsRepository$getMerchants$2(this, null);
                merchantsRepository$getMerchants$1.label = 1;
                Object c = c.c(merchantsRepository$getMerchants$2, merchantsRepository$getMerchants$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        merchantsRepository$getMerchants$1 = new MerchantsRepository$getMerchants$1(this, continuationImpl);
        Object obj2 = merchantsRepository$getMerchants$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = merchantsRepository$getMerchants$1.label;
        if (i == 0) {
        }
    }
}
