package com.yandex.plus.pay.internal.feature.success;

import com.yandex.plus.pay.data.mb.ExternalMediaBillingApi;
import com.yandex.plus.pay.internal.model.PlusPayWebSuccessScreenConfiguration;
import com.yandex.plus.pay.internal.model.PlusPayWebSuccessScreenParams;
import defpackage.hl41;
import defpackage.jia0;
import defpackage.jse;
import defpackage.kia0;
import defpackage.mwj0;
import defpackage.ny61;
import defpackage.p5z;
import defpackage.tje;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a implements hl41 {
    public final ExternalMediaBillingApi a;
    public final p5z b;
    public final jse c;

    public a(ExternalMediaBillingApi externalMediaBillingApi, p5z p5zVar, jse jseVar) {
        this.a = externalMediaBillingApi;
        this.b = p5zVar;
        this.c = jseVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayWebSuccessScreenParams plusPayWebSuccessScreenParams, ContinuationImpl continuationImpl) {
        RestWebSuccessScreenRepository$getWebSuccessScreenConfiguration$1 restWebSuccessScreenRepository$getWebSuccessScreenConfiguration$1;
        int i;
        if (continuationImpl instanceof RestWebSuccessScreenRepository$getWebSuccessScreenConfiguration$1) {
            restWebSuccessScreenRepository$getWebSuccessScreenConfiguration$1 = (RestWebSuccessScreenRepository$getWebSuccessScreenConfiguration$1) continuationImpl;
            int i2 = restWebSuccessScreenRepository$getWebSuccessScreenConfiguration$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                restWebSuccessScreenRepository$getWebSuccessScreenConfiguration$1.label = i2 - Integer.MIN_VALUE;
                Object obj = restWebSuccessScreenRepository$getWebSuccessScreenConfiguration$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = restWebSuccessScreenRepository$getWebSuccessScreenConfiguration$1.label;
                if (i != 0) {
                    b.b(obj);
                    RestWebSuccessScreenRepository$getWebSuccessScreenConfiguration$response$1 restWebSuccessScreenRepository$getWebSuccessScreenConfiguration$response$1 = new RestWebSuccessScreenRepository$getWebSuccessScreenConfiguration$response$1(this, plusPayWebSuccessScreenParams, null);
                    restWebSuccessScreenRepository$getWebSuccessScreenConfiguration$1.L$0 = null;
                    restWebSuccessScreenRepository$getWebSuccessScreenConfiguration$1.label = 1;
                    obj = tje.k0(this.c, restWebSuccessScreenRepository$getWebSuccessScreenConfiguration$response$1, restWebSuccessScreenRepository$getWebSuccessScreenConfiguration$1);
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
                jia0 jia0Var = ((kia0) ((mwj0) obj).a).b;
                return new PlusPayWebSuccessScreenConfiguration(jia0Var.b, jia0Var.c, jia0Var.d);
            }
        }
        restWebSuccessScreenRepository$getWebSuccessScreenConfiguration$1 = new RestWebSuccessScreenRepository$getWebSuccessScreenConfiguration$1(this, continuationImpl);
        Object obj2 = restWebSuccessScreenRepository$getWebSuccessScreenConfiguration$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = restWebSuccessScreenRepository$getWebSuccessScreenConfiguration$1.label;
        if (i != 0) {
        }
        jia0 jia0Var2 = ((kia0) ((mwj0) obj2).a).b;
        return new PlusPayWebSuccessScreenConfiguration(jia0Var2.b, jia0Var2.c, jia0Var2.d);
    }
}
