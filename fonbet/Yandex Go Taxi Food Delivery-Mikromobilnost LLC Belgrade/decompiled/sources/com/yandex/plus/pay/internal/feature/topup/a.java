package com.yandex.plus.pay.internal.feature.topup;

import com.yandex.plus.core.data.common.PlusThemedUrl;
import com.yandex.plus.pay.data.mb.ExternalMediaBillingApi;
import com.yandex.plus.pay.internal.model.PlusPayTopupScreenConfiguration;
import com.yandex.plus.pay.internal.model.PlusPayWebPaymentWidgetTimeoutParams;
import defpackage.fyz0;
import defpackage.iyz0;
import defpackage.jse;
import defpackage.jyz0;
import defpackage.mwj0;
import defpackage.ny61;
import defpackage.p5z;
import defpackage.tje;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final ExternalMediaBillingApi a;
    public final p5z b;
    public final jse c;

    public a(ExternalMediaBillingApi externalMediaBillingApi, p5z p5zVar, jse jseVar) {
        this.a = externalMediaBillingApi;
        this.b = p5zVar;
        this.c = jseVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        MediaBillingTopupScreenRepository$getTopupScreenConfiguration$1 mediaBillingTopupScreenRepository$getTopupScreenConfiguration$1;
        int i;
        Long l;
        iyz0 iyz0Var;
        fyz0 fyz0Var;
        fyz0 fyz0Var2;
        if (continuationImpl instanceof MediaBillingTopupScreenRepository$getTopupScreenConfiguration$1) {
            mediaBillingTopupScreenRepository$getTopupScreenConfiguration$1 = (MediaBillingTopupScreenRepository$getTopupScreenConfiguration$1) continuationImpl;
            int i2 = mediaBillingTopupScreenRepository$getTopupScreenConfiguration$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mediaBillingTopupScreenRepository$getTopupScreenConfiguration$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mediaBillingTopupScreenRepository$getTopupScreenConfiguration$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mediaBillingTopupScreenRepository$getTopupScreenConfiguration$1.label;
                l = null;
                if (i != 0) {
                    b.b(obj);
                    MediaBillingTopupScreenRepository$getTopupScreenConfiguration$response$1 mediaBillingTopupScreenRepository$getTopupScreenConfiguration$response$1 = new MediaBillingTopupScreenRepository$getTopupScreenConfiguration$response$1(this, str, null);
                    mediaBillingTopupScreenRepository$getTopupScreenConfiguration$1.L$0 = null;
                    mediaBillingTopupScreenRepository$getTopupScreenConfiguration$1.label = 1;
                    obj = tje.k0(this.c, mediaBillingTopupScreenRepository$getTopupScreenConfiguration$response$1, mediaBillingTopupScreenRepository$getTopupScreenConfiguration$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                Object obj2 = ((mwj0) obj).a;
                String str2 = ((jyz0) obj2).a;
                jyz0 jyz0Var = (jyz0) obj2;
                iyz0 iyz0Var2 = jyz0Var.b;
                PlusThemedUrl plusThemedUrl = new PlusThemedUrl(iyz0Var2 == null ? iyz0Var2.a : null, iyz0Var2 == null ? iyz0Var2.b : null);
                iyz0 iyz0Var3 = jyz0Var.b;
                Long l2 = (iyz0Var3 != null || (fyz0Var2 = iyz0Var3.c) == null) ? null : new Long(fyz0Var2.a);
                iyz0Var = jyz0Var.b;
                if (iyz0Var != null && (fyz0Var = iyz0Var.c) != null) {
                    l = new Long(fyz0Var.b);
                }
                return new PlusPayTopupScreenConfiguration(str2, plusThemedUrl, new PlusPayWebPaymentWidgetTimeoutParams(l, l2));
            }
        }
        mediaBillingTopupScreenRepository$getTopupScreenConfiguration$1 = new MediaBillingTopupScreenRepository$getTopupScreenConfiguration$1(this, continuationImpl);
        Object obj3 = mediaBillingTopupScreenRepository$getTopupScreenConfiguration$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mediaBillingTopupScreenRepository$getTopupScreenConfiguration$1.label;
        l = null;
        if (i != 0) {
        }
        Object obj22 = ((mwj0) obj3).a;
        String str22 = ((jyz0) obj22).a;
        jyz0 jyz0Var2 = (jyz0) obj22;
        iyz0 iyz0Var22 = jyz0Var2.b;
        PlusThemedUrl plusThemedUrl2 = new PlusThemedUrl(iyz0Var22 == null ? iyz0Var22.a : null, iyz0Var22 == null ? iyz0Var22.b : null);
        iyz0 iyz0Var32 = jyz0Var2.b;
        if (iyz0Var32 != null) {
        }
        iyz0Var = jyz0Var2.b;
        if (iyz0Var != null) {
            l = new Long(fyz0Var.b);
        }
        return new PlusPayTopupScreenConfiguration(str22, plusThemedUrl2, new PlusPayWebPaymentWidgetTimeoutParams(l, l2));
    }
}
