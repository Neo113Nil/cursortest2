package com.ybsdk.feature.merchant.offers.internal.domain.interactor;

import defpackage.ny61;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final com.ybsdk.feature.merchant.offers.internal.data.a a;

    public a(com.ybsdk.feature.merchant.offers.internal.data.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, List list, ContinuationImpl continuationImpl) {
        MerchantOffersInteractor$getPageInternal$1 merchantOffersInteractor$getPageInternal$1;
        int i;
        if (continuationImpl instanceof MerchantOffersInteractor$getPageInternal$1) {
            merchantOffersInteractor$getPageInternal$1 = (MerchantOffersInteractor$getPageInternal$1) continuationImpl;
            int i2 = merchantOffersInteractor$getPageInternal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                merchantOffersInteractor$getPageInternal$1.label = i2 - Integer.MIN_VALUE;
                Object obj = merchantOffersInteractor$getPageInternal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = merchantOffersInteractor$getPageInternal$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    merchantOffersInteractor$getPageInternal$1.label = 1;
                    Object a = this.a.a(str, list, merchantOffersInteractor$getPageInternal$1);
                    return a == coroutineSingletons ? coroutineSingletons : a;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        merchantOffersInteractor$getPageInternal$1 = new MerchantOffersInteractor$getPageInternal$1(this, continuationImpl);
        Object obj2 = merchantOffersInteractor$getPageInternal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = merchantOffersInteractor$getPageInternal$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        MerchantOffersInteractor$loadFirstPage$1 merchantOffersInteractor$loadFirstPage$1;
        int i;
        if (continuationImpl instanceof MerchantOffersInteractor$loadFirstPage$1) {
            merchantOffersInteractor$loadFirstPage$1 = (MerchantOffersInteractor$loadFirstPage$1) continuationImpl;
            int i2 = merchantOffersInteractor$loadFirstPage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                merchantOffersInteractor$loadFirstPage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = merchantOffersInteractor$loadFirstPage$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = merchantOffersInteractor$loadFirstPage$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    merchantOffersInteractor$loadFirstPage$1.label = 1;
                    Object a = a(null, null, merchantOffersInteractor$loadFirstPage$1);
                    return a == obj2 ? obj2 : a;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        merchantOffersInteractor$loadFirstPage$1 = new MerchantOffersInteractor$loadFirstPage$1(this, continuationImpl);
        Object obj3 = merchantOffersInteractor$loadFirstPage$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = merchantOffersInteractor$loadFirstPage$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, List list, ContinuationImpl continuationImpl) {
        MerchantOffersInteractor$loadNextPage$1 merchantOffersInteractor$loadNextPage$1;
        int i;
        if (continuationImpl instanceof MerchantOffersInteractor$loadNextPage$1) {
            merchantOffersInteractor$loadNextPage$1 = (MerchantOffersInteractor$loadNextPage$1) continuationImpl;
            int i2 = merchantOffersInteractor$loadNextPage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                merchantOffersInteractor$loadNextPage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = merchantOffersInteractor$loadNextPage$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = merchantOffersInteractor$loadNextPage$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    merchantOffersInteractor$loadNextPage$1.label = 1;
                    Object a = a(str, list, merchantOffersInteractor$loadNextPage$1);
                    return a == obj2 ? obj2 : a;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        merchantOffersInteractor$loadNextPage$1 = new MerchantOffersInteractor$loadNextPage$1(this, continuationImpl);
        Object obj3 = merchantOffersInteractor$loadNextPage$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = merchantOffersInteractor$loadNextPage$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        MerchantOffersInteractor$testSearch$1 merchantOffersInteractor$testSearch$1;
        int i;
        if (continuationImpl instanceof MerchantOffersInteractor$testSearch$1) {
            merchantOffersInteractor$testSearch$1 = (MerchantOffersInteractor$testSearch$1) continuationImpl;
            int i2 = merchantOffersInteractor$testSearch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                merchantOffersInteractor$testSearch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = merchantOffersInteractor$testSearch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = merchantOffersInteractor$testSearch$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    merchantOffersInteractor$testSearch$1.label = 1;
                    Object e = this.a.e(str, merchantOffersInteractor$testSearch$1);
                    return e == coroutineSingletons ? coroutineSingletons : e;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        merchantOffersInteractor$testSearch$1 = new MerchantOffersInteractor$testSearch$1(this, continuationImpl);
        Object obj2 = merchantOffersInteractor$testSearch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = merchantOffersInteractor$testSearch$1.label;
        if (i != 0) {
        }
    }
}
