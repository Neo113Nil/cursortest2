package com.ybsdk.feature.merchant.offers.internal.data.network;

import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.banners.api.FullScreenEntity$Type;
import com.ybsdk.feature.banners.api.dto.FullScreenDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.merchant.offers.internal.data.network.dto.MerchantOfferBannerItemDto;
import com.ybsdk.feature.merchant.offers.internal.data.network.dto.MerchantOffersPageResponse;
import com.ybsdk.feature.merchant.offers.internal.data.network.dto.MerchantOffersScreenItemDto;
import com.ybsdk.feature.merchant.offers.internal.data.network.dto.MerchantOffersScreenResponseV2;
import com.ybsdk.feature.merchant.offers.internal.data.network.dto.MerchantOffersSearchSuggestsPageResponse;
import defpackage.ctu0;
import defpackage.fxy0;
import defpackage.hq10;
import defpackage.ih90;
import defpackage.jl40;
import defpackage.jpl;
import defpackage.lp10;
import defpackage.ny61;
import defpackage.qxy0;
import defpackage.ro10;
import defpackage.rp10;
import defpackage.rr51;
import defpackage.tcc;
import defpackage.x4c;
import defpackage.yua1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007f -> B:10:0x0082). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(MerchantOffersPageResponse merchantOffersPageResponse, Continuation continuation) {
        MerchantOffersMapper$mapMerchantOffersPageResponse$1 merchantOffersMapper$mapMerchantOffersPageResponse$1;
        int i;
        MerchantOffersPageResponse merchantOffersPageResponse2;
        Iterator it;
        Collection collection;
        com.ybsdk.feature.divkit.api.domain.a aVar;
        if (continuation instanceof MerchantOffersMapper$mapMerchantOffersPageResponse$1) {
            merchantOffersMapper$mapMerchantOffersPageResponse$1 = (MerchantOffersMapper$mapMerchantOffersPageResponse$1) continuation;
            int i2 = merchantOffersMapper$mapMerchantOffersPageResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                merchantOffersMapper$mapMerchantOffersPageResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = merchantOffersMapper$mapMerchantOffersPageResponse$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = merchantOffersMapper$mapMerchantOffersPageResponse$1.label;
                if (i != 0) {
                    b.b(obj);
                    com.ybsdk.feature.divkit.api.domain.a aVar2 = new com.ybsdk.feature.divkit.api.domain.a(merchantOffersPageResponse.getCommonDivData());
                    List<MerchantOffersScreenItemDto> screenItems = merchantOffersPageResponse.getScreenItems();
                    ArrayList arrayList = new ArrayList();
                    merchantOffersPageResponse2 = merchantOffersPageResponse;
                    it = screenItems.iterator();
                    collection = arrayList;
                    aVar = aVar2;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) merchantOffersMapper$mapMerchantOffersPageResponse$1.L$3;
                    collection = (Collection) merchantOffersMapper$mapMerchantOffersPageResponse$1.L$2;
                    aVar = (com.ybsdk.feature.divkit.api.domain.a) merchantOffersMapper$mapMerchantOffersPageResponse$1.L$1;
                    MerchantOffersPageResponse merchantOffersPageResponse3 = (MerchantOffersPageResponse) merchantOffersMapper$mapMerchantOffersPageResponse$1.L$0;
                    b.b(obj);
                    jpl jplVar = (jpl) obj;
                    if (jplVar != null) {
                        collection.add(jplVar);
                    }
                    merchantOffersPageResponse2 = merchantOffersPageResponse3;
                    if (it.hasNext()) {
                        MerchantOffersScreenItemDto merchantOffersScreenItemDto = (MerchantOffersScreenItemDto) it.next();
                        String mlRequestId = merchantOffersPageResponse2.getMlRequestId();
                        merchantOffersMapper$mapMerchantOffersPageResponse$1.L$0 = merchantOffersPageResponse2;
                        merchantOffersMapper$mapMerchantOffersPageResponse$1.L$1 = aVar;
                        merchantOffersMapper$mapMerchantOffersPageResponse$1.L$2 = collection;
                        merchantOffersMapper$mapMerchantOffersPageResponse$1.L$3 = it;
                        merchantOffersMapper$mapMerchantOffersPageResponse$1.label = 1;
                        Object d = d(merchantOffersScreenItemDto, aVar, mlRequestId, merchantOffersMapper$mapMerchantOffersPageResponse$1);
                        if (d == obj2) {
                            return obj2;
                        }
                        merchantOffersPageResponse3 = merchantOffersPageResponse2;
                        obj = d;
                        jpl jplVar2 = (jpl) obj;
                        if (jplVar2 != null) {
                        }
                        merchantOffersPageResponse2 = merchantOffersPageResponse3;
                        if (it.hasNext()) {
                            List list = (List) collection;
                            List<String> remainingOfferIds = merchantOffersPageResponse2.getRemainingOfferIds();
                            if (remainingOfferIds == null) {
                                remainingOfferIds = EmptyList.a;
                            }
                            return new lp10(merchantOffersPageResponse2.getMlRequestId(), list, remainingOfferIds);
                        }
                    }
                }
            }
        }
        merchantOffersMapper$mapMerchantOffersPageResponse$1 = new MerchantOffersMapper$mapMerchantOffersPageResponse$1(this, continuation);
        Object obj3 = merchantOffersMapper$mapMerchantOffersPageResponse$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = merchantOffersMapper$mapMerchantOffersPageResponse$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00e8 -> B:11:0x00ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00a5 -> B:32:0x00a8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(MerchantOffersScreenResponseV2 merchantOffersScreenResponseV2, Continuation continuation) {
        MerchantOffersMapper$mapMerchantOffersResponse$1 merchantOffersMapper$mapMerchantOffersResponse$1;
        int i;
        Iterator it;
        Collection collection;
        com.ybsdk.feature.divkit.api.domain.a aVar;
        MerchantOffersScreenResponseV2 merchantOffersScreenResponseV22;
        List list;
        Collection arrayList;
        Iterator it2;
        com.ybsdk.feature.divkit.api.domain.a aVar2;
        MerchantOffersScreenResponseV2 merchantOffersScreenResponseV23;
        if (continuation instanceof MerchantOffersMapper$mapMerchantOffersResponse$1) {
            merchantOffersMapper$mapMerchantOffersResponse$1 = (MerchantOffersMapper$mapMerchantOffersResponse$1) continuation;
            int i2 = merchantOffersMapper$mapMerchantOffersResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                merchantOffersMapper$mapMerchantOffersResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = merchantOffersMapper$mapMerchantOffersResponse$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = merchantOffersMapper$mapMerchantOffersResponse$1.label;
                ArrayList arrayList2 = null;
                if (i != 0) {
                    b.b(obj);
                    com.ybsdk.feature.divkit.api.domain.a aVar3 = new com.ybsdk.feature.divkit.api.domain.a(merchantOffersScreenResponseV2.getCommonDivData());
                    List<MerchantOfferBannerItemDto> bannerItems = merchantOffersScreenResponseV2.getBannerItems();
                    ArrayList arrayList3 = new ArrayList(tcc.n(bannerItems, 10));
                    it = bannerItems.iterator();
                    collection = arrayList3;
                    aVar = aVar3;
                    merchantOffersScreenResponseV22 = merchantOffersScreenResponseV2;
                    if (it.hasNext()) {
                    }
                } else if (i == 1) {
                    collection = (Collection) merchantOffersMapper$mapMerchantOffersResponse$1.L$4;
                    it = (Iterator) merchantOffersMapper$mapMerchantOffersResponse$1.L$3;
                    Collection collection2 = (Collection) merchantOffersMapper$mapMerchantOffersResponse$1.L$2;
                    aVar = (com.ybsdk.feature.divkit.api.domain.a) merchantOffersMapper$mapMerchantOffersResponse$1.L$1;
                    MerchantOffersScreenResponseV2 merchantOffersScreenResponseV24 = (MerchantOffersScreenResponseV2) merchantOffersMapper$mapMerchantOffersResponse$1.L$0;
                    b.b(obj);
                    collection.add((ro10) obj);
                    collection = collection2;
                    merchantOffersScreenResponseV22 = merchantOffersScreenResponseV24;
                    if (it.hasNext()) {
                        MerchantOfferBannerItemDto merchantOfferBannerItemDto = (MerchantOfferBannerItemDto) it.next();
                        merchantOffersMapper$mapMerchantOffersResponse$1.L$0 = merchantOffersScreenResponseV22;
                        merchantOffersMapper$mapMerchantOffersResponse$1.L$1 = aVar;
                        merchantOffersMapper$mapMerchantOffersResponse$1.L$2 = collection;
                        merchantOffersMapper$mapMerchantOffersResponse$1.L$3 = it;
                        merchantOffersMapper$mapMerchantOffersResponse$1.L$4 = collection;
                        merchantOffersMapper$mapMerchantOffersResponse$1.label = 1;
                        Object e = e(merchantOfferBannerItemDto, aVar, merchantOffersMapper$mapMerchantOffersResponse$1);
                        if (e != obj2) {
                            merchantOffersScreenResponseV24 = merchantOffersScreenResponseV22;
                            obj = e;
                            collection2 = collection;
                            collection.add((ro10) obj);
                            collection = collection2;
                            merchantOffersScreenResponseV22 = merchantOffersScreenResponseV24;
                            if (it.hasNext()) {
                                list = (List) collection;
                                List<MerchantOffersScreenItemDto> screenItems = merchantOffersScreenResponseV22.getScreenItems();
                                arrayList = new ArrayList();
                                it2 = screenItems.iterator();
                                aVar2 = aVar;
                                merchantOffersScreenResponseV23 = merchantOffersScreenResponseV22;
                                Collection collection3 = arrayList;
                                List list2 = list;
                                if (it2.hasNext()) {
                                }
                            }
                        }
                        return obj2;
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) merchantOffersMapper$mapMerchantOffersResponse$1.L$4;
                    it2 = (Iterator) merchantOffersMapper$mapMerchantOffersResponse$1.L$3;
                    arrayList = (Collection) merchantOffersMapper$mapMerchantOffersResponse$1.L$2;
                    aVar2 = (com.ybsdk.feature.divkit.api.domain.a) merchantOffersMapper$mapMerchantOffersResponse$1.L$1;
                    merchantOffersScreenResponseV23 = (MerchantOffersScreenResponseV2) merchantOffersMapper$mapMerchantOffersResponse$1.L$0;
                    b.b(obj);
                    jpl jplVar = (jpl) obj;
                    if (jplVar != null) {
                        arrayList.add(jplVar);
                    }
                    Collection collection32 = arrayList;
                    List list22 = list;
                    if (it2.hasNext()) {
                        MerchantOffersScreenItemDto merchantOffersScreenItemDto = (MerchantOffersScreenItemDto) it2.next();
                        String mlRequestId = merchantOffersScreenResponseV23.getMlRequestId();
                        merchantOffersMapper$mapMerchantOffersResponse$1.L$0 = merchantOffersScreenResponseV23;
                        merchantOffersMapper$mapMerchantOffersResponse$1.L$1 = aVar2;
                        merchantOffersMapper$mapMerchantOffersResponse$1.L$2 = collection32;
                        merchantOffersMapper$mapMerchantOffersResponse$1.L$3 = it2;
                        merchantOffersMapper$mapMerchantOffersResponse$1.L$4 = list22;
                        merchantOffersMapper$mapMerchantOffersResponse$1.label = 2;
                        Object d = d(merchantOffersScreenItemDto, aVar2, mlRequestId, merchantOffersMapper$mapMerchantOffersResponse$1);
                        if (d != obj2) {
                            arrayList = collection32;
                            obj = d;
                            list = list22;
                            jpl jplVar2 = (jpl) obj;
                            if (jplVar2 != null) {
                            }
                            Collection collection322 = arrayList;
                            List list222 = list;
                            if (it2.hasNext()) {
                                List list3 = (List) collection322;
                                String mlRequestId2 = merchantOffersScreenResponseV23.getMlRequestId();
                                MerchantOffersScreenResponseV2 merchantOffersScreenResponseV25 = merchantOffersScreenResponseV23;
                                List<String> remainingOfferIds = merchantOffersScreenResponseV25.getRemainingOfferIds();
                                List<FullScreenDto> fullScreens = merchantOffersScreenResponseV25.getFullScreens();
                                if (fullScreens != null) {
                                    List<FullScreenDto> list4 = fullScreens;
                                    arrayList2 = new ArrayList(tcc.n(list4, 10));
                                    Iterator<T> it3 = list4.iterator();
                                    while (it3.hasNext()) {
                                        arrayList2.add(yua1.c((FullScreenDto) it3.next(), FullScreenEntity$Type.MERCHANT_OFFERS));
                                    }
                                }
                                return new rp10(list222, list3, remainingOfferIds, mlRequestId2, arrayList2);
                            }
                        }
                        return obj2;
                    }
                }
            }
        }
        merchantOffersMapper$mapMerchantOffersResponse$1 = new MerchantOffersMapper$mapMerchantOffersResponse$1(this, continuation);
        Object obj3 = merchantOffersMapper$mapMerchantOffersResponse$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = merchantOffersMapper$mapMerchantOffersResponse$1.label;
        ArrayList arrayList22 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x006e -> B:10:0x0071). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(MerchantOffersSearchSuggestsPageResponse merchantOffersSearchSuggestsPageResponse, Continuation continuation) {
        MerchantOffersMapper$mapMerchantOffersSuggestResponse$1 merchantOffersMapper$mapMerchantOffersSuggestResponse$1;
        int i;
        Collection arrayList;
        Iterator it;
        com.ybsdk.feature.divkit.api.domain.a aVar;
        if (continuation instanceof MerchantOffersMapper$mapMerchantOffersSuggestResponse$1) {
            merchantOffersMapper$mapMerchantOffersSuggestResponse$1 = (MerchantOffersMapper$mapMerchantOffersSuggestResponse$1) continuation;
            int i2 = merchantOffersMapper$mapMerchantOffersSuggestResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                merchantOffersMapper$mapMerchantOffersSuggestResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = merchantOffersMapper$mapMerchantOffersSuggestResponse$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = merchantOffersMapper$mapMerchantOffersSuggestResponse$1.label;
                if (i != 0) {
                    b.b(obj);
                    com.ybsdk.feature.divkit.api.domain.a aVar2 = new com.ybsdk.feature.divkit.api.domain.a(merchantOffersSearchSuggestsPageResponse.getCommonDivData());
                    List<MerchantOffersScreenItemDto> screenItems = merchantOffersSearchSuggestsPageResponse.getScreenItems();
                    arrayList = new ArrayList();
                    it = screenItems.iterator();
                    aVar = aVar2;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) merchantOffersMapper$mapMerchantOffersSuggestResponse$1.L$2;
                    arrayList = (Collection) merchantOffersMapper$mapMerchantOffersSuggestResponse$1.L$1;
                    aVar = (com.ybsdk.feature.divkit.api.domain.a) merchantOffersMapper$mapMerchantOffersSuggestResponse$1.L$0;
                    b.b(obj);
                    jpl jplVar = (jpl) obj;
                    if (jplVar != null) {
                        arrayList.add(jplVar);
                    }
                    if (it.hasNext()) {
                        MerchantOffersScreenItemDto merchantOffersScreenItemDto = (MerchantOffersScreenItemDto) it.next();
                        merchantOffersMapper$mapMerchantOffersSuggestResponse$1.L$0 = aVar;
                        merchantOffersMapper$mapMerchantOffersSuggestResponse$1.L$1 = arrayList;
                        merchantOffersMapper$mapMerchantOffersSuggestResponse$1.L$2 = it;
                        merchantOffersMapper$mapMerchantOffersSuggestResponse$1.label = 1;
                        obj = d(merchantOffersScreenItemDto, aVar, null, merchantOffersMapper$mapMerchantOffersSuggestResponse$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                        jpl jplVar2 = (jpl) obj;
                        if (jplVar2 != null) {
                        }
                        if (it.hasNext()) {
                            return new hq10((List) arrayList);
                        }
                    }
                }
            }
        }
        merchantOffersMapper$mapMerchantOffersSuggestResponse$1 = new MerchantOffersMapper$mapMerchantOffersSuggestResponse$1(this, continuation);
        Object obj3 = merchantOffersMapper$mapMerchantOffersSuggestResponse$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = merchantOffersMapper$mapMerchantOffersSuggestResponse$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(MerchantOffersScreenItemDto merchantOffersScreenItemDto, com.ybsdk.feature.divkit.api.domain.a aVar, String str, ContinuationImpl continuationImpl) {
        MerchantOffersMapper$toDivViewItem$1 merchantOffersMapper$toDivViewItem$1;
        int i;
        Object b;
        Throwable a;
        rr51 rr51Var;
        if (continuationImpl instanceof MerchantOffersMapper$toDivViewItem$1) {
            merchantOffersMapper$toDivViewItem$1 = (MerchantOffersMapper$toDivViewItem$1) continuationImpl;
            int i2 = merchantOffersMapper$toDivViewItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                merchantOffersMapper$toDivViewItem$1.label = i2 - Integer.MIN_VALUE;
                Object obj = merchantOffersMapper$toDivViewItem$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = merchantOffersMapper$toDivViewItem$1.label;
                if (i != 0) {
                    b.b(obj);
                    DivDataDto divkitData = merchantOffersScreenItemDto.getDivkitData();
                    merchantOffersMapper$toDivViewItem$1.L$0 = merchantOffersScreenItemDto;
                    merchantOffersMapper$toDivViewItem$1.L$1 = str;
                    merchantOffersMapper$toDivViewItem$1.label = 1;
                    b = aVar.b(divkitData, merchantOffersMapper$toDivViewItem$1);
                    if (b == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) merchantOffersMapper$toDivViewItem$1.L$1;
                    merchantOffersScreenItemDto = (MerchantOffersScreenItemDto) merchantOffersMapper$toDivViewItem$1.L$0;
                    b.b(obj);
                    b = ((Result) obj).getValue();
                }
                a = Result.a(b);
                if (a != null) {
                    x4c.g("Can't parse merchant offers screen item", a, null, null, 12);
                }
                if (b instanceof Result.Failure) {
                    b = null;
                }
                rr51Var = (rr51) b;
                if (rr51Var != null) {
                    return null;
                }
                return new jpl(new ctu0(merchantOffersScreenItemDto.getItemType()), rr51Var, jl40.l(merchantOffersScreenItemDto.getItemType(), "PARTNER_OFFERS") ? new ih90(rr51Var.e, str) : null, null, 20);
            }
        }
        merchantOffersMapper$toDivViewItem$1 = new MerchantOffersMapper$toDivViewItem$1(this, continuationImpl);
        Object obj3 = merchantOffersMapper$toDivViewItem$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = merchantOffersMapper$toDivViewItem$1.label;
        if (i != 0) {
        }
        a = Result.a(b);
        if (a != null) {
        }
        if (b instanceof Result.Failure) {
        }
        rr51Var = (rr51) b;
        if (rr51Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(MerchantOfferBannerItemDto merchantOfferBannerItemDto, com.ybsdk.feature.divkit.api.domain.a aVar, ContinuationImpl continuationImpl) {
        MerchantOffersMapper$toEntity$1 merchantOffersMapper$toEntity$1;
        int i;
        Object b;
        MerchantOfferBannerItemDto merchantOfferBannerItemDto2;
        if (continuationImpl instanceof MerchantOffersMapper$toEntity$1) {
            merchantOffersMapper$toEntity$1 = (MerchantOffersMapper$toEntity$1) continuationImpl;
            int i2 = merchantOffersMapper$toEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                merchantOffersMapper$toEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = merchantOffersMapper$toEntity$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = merchantOffersMapper$toEntity$1.label;
                if (i != 0) {
                    b.b(obj);
                    DivDataDto notifyButton = merchantOfferBannerItemDto.getNotifyButton();
                    merchantOffersMapper$toEntity$1.L$0 = merchantOfferBannerItemDto;
                    merchantOffersMapper$toEntity$1.label = 1;
                    b = aVar.b(notifyButton, merchantOffersMapper$toEntity$1);
                    if (b == obj2) {
                        return obj2;
                    }
                    merchantOfferBannerItemDto2 = merchantOfferBannerItemDto;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    merchantOfferBannerItemDto2 = (MerchantOfferBannerItemDto) merchantOffersMapper$toEntity$1.L$0;
                    b.b(obj);
                    b = ((Result) obj).getValue();
                }
                if (b instanceof Result.Failure) {
                    b = null;
                }
                rr51 rr51Var = (rr51) b;
                String bannerId = merchantOfferBannerItemDto2.getBannerId();
                ThemedParameter<String> background = merchantOfferBannerItemDto2.getBackground();
                fxy0 entity = background == null ? background.toEntity() : null;
                Themes<String> bannerImage = merchantOfferBannerItemDto2.getBannerImage();
                ThemedImageUrlEntity c = bannerImage == null ? qxy0.c(bannerImage, null) : null;
                String action = merchantOfferBannerItemDto2.getAction();
                Themes<String> logo = merchantOfferBannerItemDto2.getLogo();
                return new ro10(rr51Var, bannerId, entity, c, action, logo != null ? qxy0.c(logo, null) : null, merchantOfferBannerItemDto2.getTitle(), merchantOfferBannerItemDto2.getSubtitle(), merchantOfferBannerItemDto2.getDuration());
            }
        }
        merchantOffersMapper$toEntity$1 = new MerchantOffersMapper$toEntity$1(this, continuationImpl);
        Object obj3 = merchantOffersMapper$toEntity$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = merchantOffersMapper$toEntity$1.label;
        if (i != 0) {
        }
        if (b instanceof Result.Failure) {
        }
        rr51 rr51Var2 = (rr51) b;
        String bannerId2 = merchantOfferBannerItemDto2.getBannerId();
        ThemedParameter<String> background2 = merchantOfferBannerItemDto2.getBackground();
        if (background2 == null) {
        }
        Themes<String> bannerImage2 = merchantOfferBannerItemDto2.getBannerImage();
        if (bannerImage2 == null) {
        }
        String action2 = merchantOfferBannerItemDto2.getAction();
        Themes<String> logo2 = merchantOfferBannerItemDto2.getLogo();
        return new ro10(rr51Var2, bannerId2, entity, c, action2, logo2 != null ? qxy0.c(logo2, null) : null, merchantOfferBannerItemDto2.getTitle(), merchantOfferBannerItemDto2.getSubtitle(), merchantOfferBannerItemDto2.getDuration());
    }
}
