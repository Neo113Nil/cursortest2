package com.yandex.plus.pay.internal.feature.presale;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.data.mb.ExternalMediaBillingApi;
import com.yandex.plus.pay.internal.model.PlusPayPresale;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import defpackage.fue0;
import defpackage.jse;
import defpackage.mdd0;
import defpackage.mwj0;
import defpackage.ny61;
import defpackage.p5z;
import defpackage.q3k0;
import defpackage.sed0;
import defpackage.tje;
import defpackage.wad0;
import java.util.ArrayList;
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ArrayList arrayList, String str, String str2, ContinuationImpl continuationImpl) {
        MediaBillingPresaleRepository$getPresale$1 mediaBillingPresaleRepository$getPresale$1;
        int i;
        if (continuationImpl instanceof MediaBillingPresaleRepository$getPresale$1) {
            mediaBillingPresaleRepository$getPresale$1 = (MediaBillingPresaleRepository$getPresale$1) continuationImpl;
            int i2 = mediaBillingPresaleRepository$getPresale$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mediaBillingPresaleRepository$getPresale$1.label = i2 - Integer.MIN_VALUE;
                MediaBillingPresaleRepository$getPresale$1 mediaBillingPresaleRepository$getPresale$12 = mediaBillingPresaleRepository$getPresale$1;
                Object obj = mediaBillingPresaleRepository$getPresale$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mediaBillingPresaleRepository$getPresale$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    MediaBillingPresaleRepository$getPresale$response$1 mediaBillingPresaleRepository$getPresale$response$1 = new MediaBillingPresaleRepository$getPresale$response$1(this, arrayList, str, str2, null);
                    mediaBillingPresaleRepository$getPresale$12.L$0 = null;
                    mediaBillingPresaleRepository$getPresale$12.L$1 = null;
                    mediaBillingPresaleRepository$getPresale$12.L$2 = null;
                    mediaBillingPresaleRepository$getPresale$12.label = 1;
                    obj = tje.k0(this.c, mediaBillingPresaleRepository$getPresale$response$1, mediaBillingPresaleRepository$getPresale$12);
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
                fue0 fue0Var = (fue0) ((mwj0) obj).a;
                PlusPayCompositeOffers.Offer a = wad0.a(fue0Var.m, fue0Var.k, fue0Var.l, fue0Var.j);
                long j = fue0Var.f;
                PlusPayRichText a2 = sed0.a(fue0Var.a);
                q3k0 q3k0Var = fue0Var.b;
                return new PlusPayPresale(a, j, new PlusPayPresale.Assets(a2, q3k0Var != null ? sed0.a(q3k0Var) : null, sed0.a(fue0Var.c), sed0.a(fue0Var.d), sed0.a(fue0Var.e), sed0.a(fue0Var.h), sed0.a(fue0Var.g), sed0.a(fue0Var.i)));
            }
        }
        mediaBillingPresaleRepository$getPresale$1 = new MediaBillingPresaleRepository$getPresale$1(this, continuationImpl);
        MediaBillingPresaleRepository$getPresale$1 mediaBillingPresaleRepository$getPresale$122 = mediaBillingPresaleRepository$getPresale$1;
        Object obj2 = mediaBillingPresaleRepository$getPresale$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mediaBillingPresaleRepository$getPresale$122.label;
        if (i != 0) {
        }
        fue0 fue0Var2 = (fue0) ((mwj0) obj2).a;
        PlusPayCompositeOffers.Offer a3 = wad0.a(fue0Var2.m, fue0Var2.k, fue0Var2.l, fue0Var2.j);
        long j2 = fue0Var2.f;
        PlusPayRichText a22 = sed0.a(fue0Var2.a);
        q3k0 q3k0Var2 = fue0Var2.b;
        return new PlusPayPresale(a3, j2, new PlusPayPresale.Assets(a22, q3k0Var2 != null ? sed0.a(q3k0Var2) : null, sed0.a(fue0Var2.c), sed0.a(fue0Var2.d), sed0.a(fue0Var2.e), sed0.a(fue0Var2.h), sed0.a(fue0Var2.g), sed0.a(fue0Var2.i)));
    }
}
