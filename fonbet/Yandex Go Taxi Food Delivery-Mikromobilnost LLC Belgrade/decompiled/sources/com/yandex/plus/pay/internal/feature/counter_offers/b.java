package com.yandex.plus.pay.internal.feature.counter_offers;

import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.data.mb.ExternalMediaBillingApi;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffers;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import defpackage.a0f;
import defpackage.b0f;
import defpackage.jse;
import defpackage.mdd0;
import defpackage.mwj0;
import defpackage.ny61;
import defpackage.p5z;
import defpackage.q3k0;
import defpackage.q9v;
import defpackage.sed0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.wad0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class b {
    public final ExternalMediaBillingApi a;
    public final p5z b;
    public final jse c;
    public final mdd0 d;

    public b(ExternalMediaBillingApi externalMediaBillingApi, p5z p5zVar, jse jseVar, mdd0 mdd0Var) {
        this.a = externalMediaBillingApi;
        this.b = p5zVar;
        this.c = jseVar;
        this.d = mdd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, ArrayList arrayList, ContinuationImpl continuationImpl) {
        MediaBillingCounterOffersRepository$getCounterOffers$1 mediaBillingCounterOffersRepository$getCounterOffers$1;
        int i;
        if (continuationImpl instanceof MediaBillingCounterOffersRepository$getCounterOffers$1) {
            mediaBillingCounterOffersRepository$getCounterOffers$1 = (MediaBillingCounterOffersRepository$getCounterOffers$1) continuationImpl;
            int i2 = mediaBillingCounterOffersRepository$getCounterOffers$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mediaBillingCounterOffersRepository$getCounterOffers$1.label = i2 - Integer.MIN_VALUE;
                MediaBillingCounterOffersRepository$getCounterOffers$1 mediaBillingCounterOffersRepository$getCounterOffers$12 = mediaBillingCounterOffersRepository$getCounterOffers$1;
                Object obj = mediaBillingCounterOffersRepository$getCounterOffers$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mediaBillingCounterOffersRepository$getCounterOffers$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    MediaBillingCounterOffersRepository$getCounterOffers$response$1 mediaBillingCounterOffersRepository$getCounterOffers$response$1 = new MediaBillingCounterOffersRepository$getCounterOffers$response$1(this, arrayList, str, str2, str3, null);
                    mediaBillingCounterOffersRepository$getCounterOffers$12.L$0 = null;
                    mediaBillingCounterOffersRepository$getCounterOffers$12.L$1 = null;
                    mediaBillingCounterOffersRepository$getCounterOffers$12.L$2 = null;
                    mediaBillingCounterOffersRepository$getCounterOffers$12.L$3 = null;
                    mediaBillingCounterOffersRepository$getCounterOffers$12.label = 1;
                    obj = tje.k0(this.c, mediaBillingCounterOffersRepository$getCounterOffers$response$1, mediaBillingCounterOffersRepository$getCounterOffers$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                b0f b0fVar = (b0f) ((mwj0) obj).a;
                q3k0 q3k0Var = b0fVar.d;
                PlusPayRichText a = q3k0Var == null ? sed0.a(q3k0Var) : null;
                q3k0 q3k0Var2 = b0fVar.e;
                PlusPayRichText a2 = q3k0Var2 == null ? sed0.a(q3k0Var2) : null;
                List<a0f> list = b0fVar.f;
                ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
                for (a0f a0fVar : list) {
                    PlusPayCompositeOffers.Offer a3 = wad0.a(a0fVar.a, b0fVar.a, b0fVar.c, b0fVar.b);
                    PlusPayRichText a4 = sed0.a(a0fVar.b);
                    List list2 = a0fVar.c;
                    ArrayList arrayList3 = new ArrayList(tcc.n(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(sed0.a((q3k0) it.next()));
                    }
                    String str4 = a0fVar.d;
                    String str5 = a0fVar.e;
                    q9v q9vVar = a0fVar.f;
                    arrayList2.add(new PlusPayCounterOffers.CounterOffer(a3, a4, arrayList3, str4, str5, new PlusThemedImage(q9vVar.a, q9vVar.b)));
                }
                q3k0 q3k0Var3 = b0fVar.g;
                PlusPayRichText a5 = q3k0Var3 == null ? sed0.a(q3k0Var3) : null;
                q3k0 q3k0Var4 = b0fVar.h;
                return new PlusPayCounterOffers(a, a2, arrayList2, a5, q3k0Var4 != null ? sed0.a(q3k0Var4) : null);
            }
        }
        mediaBillingCounterOffersRepository$getCounterOffers$1 = new MediaBillingCounterOffersRepository$getCounterOffers$1(this, continuationImpl);
        MediaBillingCounterOffersRepository$getCounterOffers$1 mediaBillingCounterOffersRepository$getCounterOffers$122 = mediaBillingCounterOffersRepository$getCounterOffers$1;
        Object obj2 = mediaBillingCounterOffersRepository$getCounterOffers$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mediaBillingCounterOffersRepository$getCounterOffers$122.label;
        if (i != 0) {
        }
        b0f b0fVar2 = (b0f) ((mwj0) obj2).a;
        q3k0 q3k0Var5 = b0fVar2.d;
        if (q3k0Var5 == null) {
        }
        q3k0 q3k0Var22 = b0fVar2.e;
        if (q3k0Var22 == null) {
        }
        List<a0f> list3 = b0fVar2.f;
        ArrayList arrayList22 = new ArrayList(tcc.n(list3, 10));
        while (r3.hasNext()) {
        }
        q3k0 q3k0Var32 = b0fVar2.g;
        if (q3k0Var32 == null) {
        }
        q3k0 q3k0Var42 = b0fVar2.h;
        return new PlusPayCounterOffers(a, a2, arrayList22, a5, q3k0Var42 != null ? sed0.a(q3k0Var42) : null);
    }
}
