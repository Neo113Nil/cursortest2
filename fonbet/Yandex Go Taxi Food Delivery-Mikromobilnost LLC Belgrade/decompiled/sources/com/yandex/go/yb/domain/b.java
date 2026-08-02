package com.yandex.go.yb.domain;

import com.yandex.go.yb.experiments.ForceYbPromosOnSummaryExperiment;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.jbh;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.qqo;
import defpackage.rqo;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class b {
    public final com.yandex.go.yb.data.u a;
    public final tt2 b;
    public final qqo c;
    public final cne0 d;
    public volatile String e;

    public b(rqo rqoVar, dne0 dne0Var, com.yandex.go.yb.data.u uVar, tt2 tt2Var) {
        this.a = uVar;
        this.b = tt2Var;
        this.c = ((jbh) rqoVar).c(ForceYbPromosOnSummaryExperiment.e);
        this.d = dne0Var.a("ru.yandex.taxi.bank.features.force_promos_on_summary");
    }

    public final Object a(Continuation continuation) {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new ForceYbPromosOnSummaryInteractorImpl$getDeeplink$2(this, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ForceYbPromosOnSummaryInteractorImpl$promoShown$1 forceYbPromosOnSummaryInteractorImpl$promoShown$1;
        int i;
        if (continuationImpl instanceof ForceYbPromosOnSummaryInteractorImpl$promoShown$1) {
            forceYbPromosOnSummaryInteractorImpl$promoShown$1 = (ForceYbPromosOnSummaryInteractorImpl$promoShown$1) continuationImpl;
            int i2 = forceYbPromosOnSummaryInteractorImpl$promoShown$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                forceYbPromosOnSummaryInteractorImpl$promoShown$1.label = i2 - Integer.MIN_VALUE;
                Object obj = forceYbPromosOnSummaryInteractorImpl$promoShown$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = forceYbPromosOnSummaryInteractorImpl$promoShown$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.b.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    ForceYbPromosOnSummaryInteractorImpl$promoShown$2 forceYbPromosOnSummaryInteractorImpl$promoShown$2 = new ForceYbPromosOnSummaryInteractorImpl$promoShown$2(this, null);
                    forceYbPromosOnSummaryInteractorImpl$promoShown$1.label = 1;
                    if (tje.k0(mdhVar, forceYbPromosOnSummaryInteractorImpl$promoShown$2, forceYbPromosOnSummaryInteractorImpl$promoShown$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        forceYbPromosOnSummaryInteractorImpl$promoShown$1 = new ForceYbPromosOnSummaryInteractorImpl$promoShown$1(this, continuationImpl);
        Object obj2 = forceYbPromosOnSummaryInteractorImpl$promoShown$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = forceYbPromosOnSummaryInteractorImpl$promoShown$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
