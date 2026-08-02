package com.yandex.plus.pay.internal.feature.closing;

import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.data.mb.ExternalMediaBillingApi;
import com.yandex.plus.pay.internal.model.PlusPayClosingOffer;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import defpackage.jse;
import defpackage.mdd0;
import defpackage.mwj0;
import defpackage.ny61;
import defpackage.p5z;
import defpackage.p6c;
import defpackage.q3k0;
import defpackage.q9v;
import defpackage.r6c;
import defpackage.sed0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.wad0;
import java.util.ArrayList;
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ArrayList arrayList, String str, String str2, ContinuationImpl continuationImpl) {
        MediaBillingClosingOfferRepository$getClosingOffer$1 mediaBillingClosingOfferRepository$getClosingOffer$1;
        int i;
        if (continuationImpl instanceof MediaBillingClosingOfferRepository$getClosingOffer$1) {
            mediaBillingClosingOfferRepository$getClosingOffer$1 = (MediaBillingClosingOfferRepository$getClosingOffer$1) continuationImpl;
            int i2 = mediaBillingClosingOfferRepository$getClosingOffer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mediaBillingClosingOfferRepository$getClosingOffer$1.label = i2 - Integer.MIN_VALUE;
                MediaBillingClosingOfferRepository$getClosingOffer$1 mediaBillingClosingOfferRepository$getClosingOffer$12 = mediaBillingClosingOfferRepository$getClosingOffer$1;
                Object obj = mediaBillingClosingOfferRepository$getClosingOffer$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mediaBillingClosingOfferRepository$getClosingOffer$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    MediaBillingClosingOfferRepository$getClosingOffer$response$1 mediaBillingClosingOfferRepository$getClosingOffer$response$1 = new MediaBillingClosingOfferRepository$getClosingOffer$response$1(this, arrayList, str, str2, null);
                    mediaBillingClosingOfferRepository$getClosingOffer$12.L$0 = null;
                    mediaBillingClosingOfferRepository$getClosingOffer$12.L$1 = null;
                    mediaBillingClosingOfferRepository$getClosingOffer$12.L$2 = null;
                    mediaBillingClosingOfferRepository$getClosingOffer$12.label = 1;
                    obj = tje.k0(this.c, mediaBillingClosingOfferRepository$getClosingOffer$response$1, mediaBillingClosingOfferRepository$getClosingOffer$12);
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
                r6c r6cVar = (r6c) ((mwj0) obj).a;
                q9v q9vVar = r6cVar.d;
                PlusThemedImage plusThemedImage = new PlusThemedImage(q9vVar.a, q9vVar.b);
                PlusPayRichText a = sed0.a(r6cVar.e);
                q3k0 q3k0Var = r6cVar.f;
                PlusPayRichText a2 = q3k0Var == null ? sed0.a(q3k0Var) : null;
                PlusPayCompositeOffers.Offer a3 = wad0.a(r6cVar.g, r6cVar.a, r6cVar.c, r6cVar.b);
                List<p6c> list = r6cVar.h;
                ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
                for (p6c p6cVar : list) {
                    PlusPayRichText a4 = sed0.a(p6cVar.a);
                    PlusPayRichText a5 = sed0.a(p6cVar.b);
                    q9v q9vVar2 = p6cVar.c;
                    PlusThemedImage plusThemedImage2 = new PlusThemedImage(q9vVar2.a, q9vVar2.b);
                    q3k0 q3k0Var2 = p6cVar.d;
                    arrayList2.add(new PlusPayClosingOffer.ClosingOfferAsset(a4, plusThemedImage2, a5, q3k0Var2 != null ? sed0.a(q3k0Var2) : null));
                }
                String str3 = r6cVar.i;
                String str4 = r6cVar.j;
                q3k0 q3k0Var3 = r6cVar.k;
                return new PlusPayClosingOffer(plusThemedImage, a, a2, a3, arrayList2, str3, str4, q3k0Var3 != null ? sed0.a(q3k0Var3) : null);
            }
        }
        mediaBillingClosingOfferRepository$getClosingOffer$1 = new MediaBillingClosingOfferRepository$getClosingOffer$1(this, continuationImpl);
        MediaBillingClosingOfferRepository$getClosingOffer$1 mediaBillingClosingOfferRepository$getClosingOffer$122 = mediaBillingClosingOfferRepository$getClosingOffer$1;
        Object obj2 = mediaBillingClosingOfferRepository$getClosingOffer$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mediaBillingClosingOfferRepository$getClosingOffer$122.label;
        if (i != 0) {
        }
        r6c r6cVar2 = (r6c) ((mwj0) obj2).a;
        q9v q9vVar3 = r6cVar2.d;
        PlusThemedImage plusThemedImage3 = new PlusThemedImage(q9vVar3.a, q9vVar3.b);
        PlusPayRichText a6 = sed0.a(r6cVar2.e);
        q3k0 q3k0Var4 = r6cVar2.f;
        if (q3k0Var4 == null) {
        }
        PlusPayCompositeOffers.Offer a32 = wad0.a(r6cVar2.g, r6cVar2.a, r6cVar2.c, r6cVar2.b);
        List<p6c> list2 = r6cVar2.h;
        ArrayList arrayList22 = new ArrayList(tcc.n(list2, 10));
        while (r1.hasNext()) {
        }
        String str32 = r6cVar2.i;
        String str42 = r6cVar2.j;
        q3k0 q3k0Var32 = r6cVar2.k;
        return new PlusPayClosingOffer(plusThemedImage3, a6, a2, a32, arrayList22, str32, str42, q3k0Var32 != null ? sed0.a(q3k0Var32) : null);
    }
}
