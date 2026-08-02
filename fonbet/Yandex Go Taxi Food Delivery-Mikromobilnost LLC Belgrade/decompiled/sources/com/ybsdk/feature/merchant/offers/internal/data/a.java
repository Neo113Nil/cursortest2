package com.ybsdk.feature.merchant.offers.internal.data;

import com.ybsdk.common.b;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.merchant.offers.internal.data.network.MerchantOffersApi;
import defpackage.ny61;
import defpackage.tvv;
import defpackage.y1r0;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final MerchantOffersApi a;
    public final b b;
    public final com.ybsdk.feature.merchant.offers.internal.data.network.a c;
    public final tvv d;
    public final com.ybsdk.common.a e;
    public final y1r0 f;

    public a(MerchantOffersApi merchantOffersApi, b bVar, com.ybsdk.feature.merchant.offers.internal.data.network.a aVar, tvv tvvVar, com.ybsdk.common.a aVar2, y1r0 y1r0Var) {
        this.a = merchantOffersApi;
        this.b = bVar;
        this.c = aVar;
        this.d = tvvVar;
        this.e = aVar2;
        this.f = y1r0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r13 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, List list, ContinuationImpl continuationImpl) {
        MerchantOffersRepository$getMerchantOffersPage$1 merchantOffersRepository$getMerchantOffersPage$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof MerchantOffersRepository$getMerchantOffersPage$1) {
            merchantOffersRepository$getMerchantOffersPage$1 = (MerchantOffersRepository$getMerchantOffersPage$1) continuationImpl;
            int i2 = merchantOffersRepository$getMerchantOffersPage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                merchantOffersRepository$getMerchantOffersPage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = merchantOffersRepository$getMerchantOffersPage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = merchantOffersRepository$getMerchantOffersPage$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    MerchantOffersRepository$getMerchantOffersPage$2 merchantOffersRepository$getMerchantOffersPage$2 = new MerchantOffersRepository$getMerchantOffersPage$2(this, str, list, null);
                    merchantOffersRepository$getMerchantOffersPage$1.label = 1;
                    c = c.c(merchantOffersRepository$getMerchantOffersPage$2, merchantOffersRepository$getMerchantOffersPage$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                MerchantOffersRepository$getMerchantOffersPage$3$1 merchantOffersRepository$getMerchantOffersPage$3$1 = new MerchantOffersRepository$getMerchantOffersPage$3$1(2, this.c, com.ybsdk.feature.merchant.offers.internal.data.network.a.class, "mapMerchantOffersResponse", "mapMerchantOffersResponse(Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersScreenResponseV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                merchantOffersRepository$getMerchantOffersPage$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, merchantOffersRepository$getMerchantOffersPage$3$1, merchantOffersRepository$getMerchantOffersPage$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        merchantOffersRepository$getMerchantOffersPage$1 = new MerchantOffersRepository$getMerchantOffersPage$1(this, continuationImpl);
        Object obj2 = merchantOffersRepository$getMerchantOffersPage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = merchantOffersRepository$getMerchantOffersPage$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r13 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        MerchantOffersRepository$searchMerchantOffersInit$1 merchantOffersRepository$searchMerchantOffersInit$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof MerchantOffersRepository$searchMerchantOffersInit$1) {
            merchantOffersRepository$searchMerchantOffersInit$1 = (MerchantOffersRepository$searchMerchantOffersInit$1) continuationImpl;
            int i2 = merchantOffersRepository$searchMerchantOffersInit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                merchantOffersRepository$searchMerchantOffersInit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = merchantOffersRepository$searchMerchantOffersInit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = merchantOffersRepository$searchMerchantOffersInit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    MerchantOffersRepository$searchMerchantOffersInit$2 merchantOffersRepository$searchMerchantOffersInit$2 = new MerchantOffersRepository$searchMerchantOffersInit$2(this, str, null);
                    merchantOffersRepository$searchMerchantOffersInit$1.label = 1;
                    c = c.c(merchantOffersRepository$searchMerchantOffersInit$2, merchantOffersRepository$searchMerchantOffersInit$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                MerchantOffersRepository$searchMerchantOffersInit$3$1 merchantOffersRepository$searchMerchantOffersInit$3$1 = new MerchantOffersRepository$searchMerchantOffersInit$3$1(2, this.c, com.ybsdk.feature.merchant.offers.internal.data.network.a.class, "mapMerchantOffersPageResponse", "mapMerchantOffersPageResponse(Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersPageResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                merchantOffersRepository$searchMerchantOffersInit$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, merchantOffersRepository$searchMerchantOffersInit$3$1, merchantOffersRepository$searchMerchantOffersInit$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        merchantOffersRepository$searchMerchantOffersInit$1 = new MerchantOffersRepository$searchMerchantOffersInit$1(this, continuationImpl);
        Object obj2 = merchantOffersRepository$searchMerchantOffersInit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = merchantOffersRepository$searchMerchantOffersInit$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        if (r12 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, List list, ContinuationImpl continuationImpl) {
        MerchantOffersRepository$searchMerchantOffersNext$1 merchantOffersRepository$searchMerchantOffersNext$1;
        int i;
        a aVar;
        Object c;
        Throwable a;
        if (continuationImpl instanceof MerchantOffersRepository$searchMerchantOffersNext$1) {
            merchantOffersRepository$searchMerchantOffersNext$1 = (MerchantOffersRepository$searchMerchantOffersNext$1) continuationImpl;
            int i2 = merchantOffersRepository$searchMerchantOffersNext$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                merchantOffersRepository$searchMerchantOffersNext$1.label = i2 - Integer.MIN_VALUE;
                Object obj = merchantOffersRepository$searchMerchantOffersNext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = merchantOffersRepository$searchMerchantOffersNext$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    aVar = this;
                    MerchantOffersRepository$searchMerchantOffersNext$2 merchantOffersRepository$searchMerchantOffersNext$2 = new MerchantOffersRepository$searchMerchantOffersNext$2(aVar, str, list, str2, null);
                    merchantOffersRepository$searchMerchantOffersNext$1.label = 1;
                    c = c.c(merchantOffersRepository$searchMerchantOffersNext$2, merchantOffersRepository$searchMerchantOffersNext$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                    aVar = this;
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                MerchantOffersRepository$searchMerchantOffersNext$3$1 merchantOffersRepository$searchMerchantOffersNext$3$1 = new MerchantOffersRepository$searchMerchantOffersNext$3$1(2, aVar.c, com.ybsdk.feature.merchant.offers.internal.data.network.a.class, "mapMerchantOffersPageResponse", "mapMerchantOffersPageResponse(Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersPageResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                merchantOffersRepository$searchMerchantOffersNext$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, merchantOffersRepository$searchMerchantOffersNext$3$1, merchantOffersRepository$searchMerchantOffersNext$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        merchantOffersRepository$searchMerchantOffersNext$1 = new MerchantOffersRepository$searchMerchantOffersNext$1(this, continuationImpl);
        Object obj2 = merchantOffersRepository$searchMerchantOffersNext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = merchantOffersRepository$searchMerchantOffersNext$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r13 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        MerchantOffersRepository$searchMerchantOffersSuggests$1 merchantOffersRepository$searchMerchantOffersSuggests$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof MerchantOffersRepository$searchMerchantOffersSuggests$1) {
            merchantOffersRepository$searchMerchantOffersSuggests$1 = (MerchantOffersRepository$searchMerchantOffersSuggests$1) continuationImpl;
            int i2 = merchantOffersRepository$searchMerchantOffersSuggests$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                merchantOffersRepository$searchMerchantOffersSuggests$1.label = i2 - Integer.MIN_VALUE;
                Object obj = merchantOffersRepository$searchMerchantOffersSuggests$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = merchantOffersRepository$searchMerchantOffersSuggests$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    MerchantOffersRepository$searchMerchantOffersSuggests$2 merchantOffersRepository$searchMerchantOffersSuggests$2 = new MerchantOffersRepository$searchMerchantOffersSuggests$2(this, null);
                    merchantOffersRepository$searchMerchantOffersSuggests$1.label = 1;
                    c = c.c(merchantOffersRepository$searchMerchantOffersSuggests$2, merchantOffersRepository$searchMerchantOffersSuggests$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                MerchantOffersRepository$searchMerchantOffersSuggests$3$1 merchantOffersRepository$searchMerchantOffersSuggests$3$1 = new MerchantOffersRepository$searchMerchantOffersSuggests$3$1(2, this.c, com.ybsdk.feature.merchant.offers.internal.data.network.a.class, "mapMerchantOffersSuggestResponse", "mapMerchantOffersSuggestResponse(Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersSearchSuggestsPageResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                merchantOffersRepository$searchMerchantOffersSuggests$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, merchantOffersRepository$searchMerchantOffersSuggests$3$1, merchantOffersRepository$searchMerchantOffersSuggests$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        merchantOffersRepository$searchMerchantOffersSuggests$1 = new MerchantOffersRepository$searchMerchantOffersSuggests$1(this, continuationImpl);
        Object obj2 = merchantOffersRepository$searchMerchantOffersSuggests$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = merchantOffersRepository$searchMerchantOffersSuggests$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r13 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ContinuationImpl continuationImpl) {
        MerchantOffersRepository$testSearchMerchantOffers$1 merchantOffersRepository$testSearchMerchantOffers$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof MerchantOffersRepository$testSearchMerchantOffers$1) {
            merchantOffersRepository$testSearchMerchantOffers$1 = (MerchantOffersRepository$testSearchMerchantOffers$1) continuationImpl;
            int i2 = merchantOffersRepository$testSearchMerchantOffers$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                merchantOffersRepository$testSearchMerchantOffers$1.label = i2 - Integer.MIN_VALUE;
                Object obj = merchantOffersRepository$testSearchMerchantOffers$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = merchantOffersRepository$testSearchMerchantOffers$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    MerchantOffersRepository$testSearchMerchantOffers$2 merchantOffersRepository$testSearchMerchantOffers$2 = new MerchantOffersRepository$testSearchMerchantOffers$2(this, str, null);
                    merchantOffersRepository$testSearchMerchantOffers$1.label = 1;
                    c = c.c(merchantOffersRepository$testSearchMerchantOffers$2, merchantOffersRepository$testSearchMerchantOffers$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                MerchantOffersRepository$testSearchMerchantOffers$3$1 merchantOffersRepository$testSearchMerchantOffers$3$1 = new MerchantOffersRepository$testSearchMerchantOffers$3$1(2, this.c, com.ybsdk.feature.merchant.offers.internal.data.network.a.class, "mapMerchantOffersPageResponse", "mapMerchantOffersPageResponse(Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersPageResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                merchantOffersRepository$testSearchMerchantOffers$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, merchantOffersRepository$testSearchMerchantOffers$3$1, merchantOffersRepository$testSearchMerchantOffers$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        merchantOffersRepository$testSearchMerchantOffers$1 = new MerchantOffersRepository$testSearchMerchantOffers$1(this, continuationImpl);
        Object obj2 = merchantOffersRepository$testSearchMerchantOffers$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = merchantOffersRepository$testSearchMerchantOffers$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
