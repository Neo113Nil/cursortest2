package com.ybsdk.feature.card.internal.interactors;

import com.ybsdk.feature.card.api.entities.CardCarouselProductType;
import com.ybsdk.feature.card.api.entities.YbCardStatusEntity;
import defpackage.ae8;
import defpackage.bq51;
import defpackage.d6v;
import defpackage.gq51;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.sd8;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tls;
import defpackage.vq51;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.xc8;
import defpackage.xp51;
import defpackage.yd8;
import defpackage.yp51;
import defpackage.zd8;
import defpackage.zp51;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class d {
    public final com.ybsdk.feature.card.internal.repositories.b a;
    public final com.ybsdk.feature.card.internal.repositories.a b;

    public d(com.ybsdk.feature.card.internal.repositories.b bVar, com.ybsdk.feature.card.internal.repositories.a aVar) {
        this.a = bVar;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, d6v d6vVar, ContinuationImpl continuationImpl) {
        CardDetailsInteractor$getCardSamsungPayData$1 cardDetailsInteractor$getCardSamsungPayData$1;
        int i;
        if (continuationImpl instanceof CardDetailsInteractor$getCardSamsungPayData$1) {
            cardDetailsInteractor$getCardSamsungPayData$1 = (CardDetailsInteractor$getCardSamsungPayData$1) continuationImpl;
            int i2 = cardDetailsInteractor$getCardSamsungPayData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardDetailsInteractor$getCardSamsungPayData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardDetailsInteractor$getCardSamsungPayData$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardDetailsInteractor$getCardSamsungPayData$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                wls cardDetailsInteractor$getCardSamsungPayData$2 = new CardDetailsInteractor$getCardSamsungPayData$2(this, str, str3, str2, null);
                cardDetailsInteractor$getCardSamsungPayData$1.label = 1;
                Object O = d6vVar.O(cardDetailsInteractor$getCardSamsungPayData$2, str, cardDetailsInteractor$getCardSamsungPayData$1);
                return O == obj2 ? obj2 : O;
            }
        }
        cardDetailsInteractor$getCardSamsungPayData$1 = new CardDetailsInteractor$getCardSamsungPayData$1(this, continuationImpl);
        Object obj3 = cardDetailsInteractor$getCardSamsungPayData$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardDetailsInteractor$getCardSamsungPayData$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0138 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        CardDetailsInteractor$getYbCards$1 cardDetailsInteractor$getYbCards$1;
        int i;
        Object a;
        ae8 zd8Var;
        Object obj;
        if (continuationImpl instanceof CardDetailsInteractor$getYbCards$1) {
            cardDetailsInteractor$getYbCards$1 = (CardDetailsInteractor$getYbCards$1) continuationImpl;
            int i2 = cardDetailsInteractor$getYbCards$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardDetailsInteractor$getYbCards$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = cardDetailsInteractor$getYbCards$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardDetailsInteractor$getYbCards$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    cardDetailsInteractor$getYbCards$1.label = 1;
                    a = this.b.a(str, cardDetailsInteractor$getYbCards$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    a = ((Result) obj2).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    return a;
                }
                vq51 vq51Var = (vq51) a;
                ArrayList arrayList = vq51Var.b;
                ArrayList arrayList2 = vq51Var.c;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList) {
                    bq51 bq51Var = (bq51) obj3;
                    if (bq51Var.e != YbCardStatusEntity.DELETED && bq51Var.p != CardCarouselProductType.CORP_CARD) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList<zp51> arrayList4 = vq51Var.d;
                ArrayList arrayList5 = new ArrayList();
                for (zp51 zp51Var : arrayList4) {
                    if (zp51Var instanceof xp51) {
                        Iterator it = arrayList3.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (jl40.l(((bq51) obj).d, zp51Var.a)) {
                                break;
                            }
                        }
                        bq51 bq51Var2 = (bq51) obj;
                        if (bq51Var2 != null) {
                            zd8Var = new yd8(bq51Var2);
                        }
                        zd8Var = null;
                    } else {
                        if (!(zp51Var instanceof yp51)) {
                            w511.b();
                            return null;
                        }
                        String str2 = zp51Var.a;
                        if (arrayList2.isEmpty()) {
                            x4c.g("Bank carousel item is promo, but promo list is empty", null, null, null, 14);
                        } else {
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj4 : arrayList2) {
                                if (jl40.l(((gq51) obj4).b, str2)) {
                                    arrayList6.add(obj4);
                                }
                            }
                            if (arrayList6.isEmpty()) {
                                x4c.g("Bank carousel item is promo, but filtered promo list is empty", null, null, null, 14);
                            } else {
                                zd8Var = new zd8(str2, arrayList6);
                            }
                        }
                        zd8Var = null;
                    }
                    if (zd8Var != null) {
                        arrayList5.add(zd8Var);
                    }
                }
                ArrayList arrayList7 = arrayList5.isEmpty() ? null : arrayList5;
                if (arrayList7 != null) {
                    return arrayList7;
                }
                ArrayList arrayList8 = new ArrayList(tcc.n(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList8.add(new yd8((bq51) it2.next()));
                }
                return arrayList8;
            }
        }
        cardDetailsInteractor$getYbCards$1 = new CardDetailsInteractor$getYbCards$1(this, continuationImpl);
        Object obj22 = cardDetailsInteractor$getYbCards$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardDetailsInteractor$getYbCards$1.label;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, YbCardStatusEntity ybCardStatusEntity, d6v d6vVar, String str2, ContinuationImpl continuationImpl) {
        CardDetailsInteractor$setYbCardStatus$1 cardDetailsInteractor$setYbCardStatus$1;
        int i;
        if (continuationImpl instanceof CardDetailsInteractor$setYbCardStatus$1) {
            cardDetailsInteractor$setYbCardStatus$1 = (CardDetailsInteractor$setYbCardStatus$1) continuationImpl;
            int i2 = cardDetailsInteractor$setYbCardStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardDetailsInteractor$setYbCardStatus$1.label = i2 - Integer.MIN_VALUE;
                CardDetailsInteractor$setYbCardStatus$1 cardDetailsInteractor$setYbCardStatus$12 = cardDetailsInteractor$setYbCardStatus$1;
                Object obj = cardDetailsInteractor$setYbCardStatus$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardDetailsInteractor$setYbCardStatus$12.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                sls xc8Var = new xc8(str2, 1);
                tls sd8Var = new sd8(3);
                wls cardDetailsInteractor$setYbCardStatus$4 = new CardDetailsInteractor$setYbCardStatus$4(this, str, ybCardStatusEntity, str2, null);
                cardDetailsInteractor$setYbCardStatus$12.label = 1;
                Object B = d6vVar.B(str, xc8Var, sd8Var, cardDetailsInteractor$setYbCardStatus$4, cardDetailsInteractor$setYbCardStatus$12);
                return B == obj2 ? obj2 : B;
            }
        }
        cardDetailsInteractor$setYbCardStatus$1 = new CardDetailsInteractor$setYbCardStatus$1(this, continuationImpl);
        CardDetailsInteractor$setYbCardStatus$1 cardDetailsInteractor$setYbCardStatus$122 = cardDetailsInteractor$setYbCardStatus$1;
        Object obj3 = cardDetailsInteractor$setYbCardStatus$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardDetailsInteractor$setYbCardStatus$122.label;
        if (i == 0) {
        }
    }
}
