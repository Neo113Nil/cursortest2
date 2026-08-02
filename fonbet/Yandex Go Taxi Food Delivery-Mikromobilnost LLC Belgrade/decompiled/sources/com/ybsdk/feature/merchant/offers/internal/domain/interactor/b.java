package com.ybsdk.feature.merchant.offers.internal.domain.interactor;

import defpackage.ny61;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b {
    public final com.ybsdk.feature.merchant.offers.internal.data.a a;

    public b(com.ybsdk.feature.merchant.offers.internal.data.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        MerchantOffersSearchInteractor$getSearchInit$1 merchantOffersSearchInteractor$getSearchInit$1;
        int i;
        if (continuationImpl instanceof MerchantOffersSearchInteractor$getSearchInit$1) {
            merchantOffersSearchInteractor$getSearchInit$1 = (MerchantOffersSearchInteractor$getSearchInit$1) continuationImpl;
            int i2 = merchantOffersSearchInteractor$getSearchInit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                merchantOffersSearchInteractor$getSearchInit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = merchantOffersSearchInteractor$getSearchInit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = merchantOffersSearchInteractor$getSearchInit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    merchantOffersSearchInteractor$getSearchInit$1.label = 1;
                    Object b = this.a.b(str, merchantOffersSearchInteractor$getSearchInit$1);
                    return b == coroutineSingletons ? coroutineSingletons : b;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        merchantOffersSearchInteractor$getSearchInit$1 = new MerchantOffersSearchInteractor$getSearchInit$1(this, continuationImpl);
        Object obj2 = merchantOffersSearchInteractor$getSearchInit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = merchantOffersSearchInteractor$getSearchInit$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, List list, ContinuationImpl continuationImpl) {
        MerchantOffersSearchInteractor$getSearchNext$1 merchantOffersSearchInteractor$getSearchNext$1;
        int i;
        if (continuationImpl instanceof MerchantOffersSearchInteractor$getSearchNext$1) {
            merchantOffersSearchInteractor$getSearchNext$1 = (MerchantOffersSearchInteractor$getSearchNext$1) continuationImpl;
            int i2 = merchantOffersSearchInteractor$getSearchNext$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                merchantOffersSearchInteractor$getSearchNext$1.label = i2 - Integer.MIN_VALUE;
                Object obj = merchantOffersSearchInteractor$getSearchNext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = merchantOffersSearchInteractor$getSearchNext$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    merchantOffersSearchInteractor$getSearchNext$1.label = 1;
                    Object c = this.a.c(str, str2, list, merchantOffersSearchInteractor$getSearchNext$1);
                    return c == coroutineSingletons ? coroutineSingletons : c;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        merchantOffersSearchInteractor$getSearchNext$1 = new MerchantOffersSearchInteractor$getSearchNext$1(this, continuationImpl);
        Object obj2 = merchantOffersSearchInteractor$getSearchNext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = merchantOffersSearchInteractor$getSearchNext$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        MerchantOffersSearchInteractor$getSuggests$1 merchantOffersSearchInteractor$getSuggests$1;
        int i;
        if (continuationImpl instanceof MerchantOffersSearchInteractor$getSuggests$1) {
            merchantOffersSearchInteractor$getSuggests$1 = (MerchantOffersSearchInteractor$getSuggests$1) continuationImpl;
            int i2 = merchantOffersSearchInteractor$getSuggests$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                merchantOffersSearchInteractor$getSuggests$1.label = i2 - Integer.MIN_VALUE;
                Object obj = merchantOffersSearchInteractor$getSuggests$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = merchantOffersSearchInteractor$getSuggests$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    merchantOffersSearchInteractor$getSuggests$1.label = 1;
                    Object d = this.a.d(merchantOffersSearchInteractor$getSuggests$1);
                    return d == coroutineSingletons ? coroutineSingletons : d;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        merchantOffersSearchInteractor$getSuggests$1 = new MerchantOffersSearchInteractor$getSuggests$1(this, continuationImpl);
        Object obj2 = merchantOffersSearchInteractor$getSuggests$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = merchantOffersSearchInteractor$getSuggests$1.label;
        if (i != 0) {
        }
    }
}
