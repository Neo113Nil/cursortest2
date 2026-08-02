package com.yandex.go.payments.paymentlist.domain.subtitles.replacement;

import com.yandex.go.coroutines.h;
import com.yandex.go.payments.paymentlist.experiments.PaymentMethodsCustomSubtitlesExperiment;
import defpackage.k5a0;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.u0k;
import defpackage.x9a0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class b implements x9a0 {
    public final String a;
    public final k5a0 b;
    public final h c;

    public b(String str, k5a0 k5a0Var, rqo rqoVar) {
        this.a = str;
        this.b = k5a0Var;
        this.c = new h(new TaxiPaymentMethodsExperimentSubtitleInteractor$experimentSuspendableLazy$1(rqoVar, this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.x9a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(u0k u0kVar, ContinuationImpl continuationImpl) {
        TaxiPaymentMethodsExperimentSubtitleInteractor$getCustomSubtitle$1 taxiPaymentMethodsExperimentSubtitleInteractor$getCustomSubtitle$1;
        int i;
        if (continuationImpl instanceof TaxiPaymentMethodsExperimentSubtitleInteractor$getCustomSubtitle$1) {
            taxiPaymentMethodsExperimentSubtitleInteractor$getCustomSubtitle$1 = (TaxiPaymentMethodsExperimentSubtitleInteractor$getCustomSubtitle$1) continuationImpl;
            int i2 = taxiPaymentMethodsExperimentSubtitleInteractor$getCustomSubtitle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiPaymentMethodsExperimentSubtitleInteractor$getCustomSubtitle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiPaymentMethodsExperimentSubtitleInteractor$getCustomSubtitle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiPaymentMethodsExperimentSubtitleInteractor$getCustomSubtitle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    taxiPaymentMethodsExperimentSubtitleInteractor$getCustomSubtitle$1.L$0 = u0kVar;
                    taxiPaymentMethodsExperimentSubtitleInteractor$getCustomSubtitle$1.label = 1;
                    obj = this.c.a(taxiPaymentMethodsExperimentSubtitleInteractor$getCustomSubtitle$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    u0kVar = (u0k) taxiPaymentMethodsExperimentSubtitleInteractor$getCustomSubtitle$1.L$0;
                    kotlin.b.b(obj);
                }
                return this.b.a(u0kVar, (PaymentMethodsCustomSubtitlesExperiment) obj);
            }
        }
        taxiPaymentMethodsExperimentSubtitleInteractor$getCustomSubtitle$1 = new TaxiPaymentMethodsExperimentSubtitleInteractor$getCustomSubtitle$1(this, continuationImpl);
        Object obj2 = taxiPaymentMethodsExperimentSubtitleInteractor$getCustomSubtitle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiPaymentMethodsExperimentSubtitleInteractor$getCustomSubtitle$1.label;
        if (i != 0) {
        }
        return this.b.a(u0kVar, (PaymentMethodsCustomSubtitlesExperiment) obj2);
    }
}
