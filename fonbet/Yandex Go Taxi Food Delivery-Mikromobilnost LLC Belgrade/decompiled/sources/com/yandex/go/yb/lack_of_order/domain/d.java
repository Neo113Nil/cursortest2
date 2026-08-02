package com.yandex.go.yb.lack_of_order.domain;

import com.yandex.go.yb.lack_of_order.experiments.MoneyNotEnoughExperiment;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.o;

/* loaded from: classes15.dex */
public final class d implements tpr {
    public final /* synthetic */ o a;
    public final /* synthetic */ MoneyNotEnoughExperiment b;
    public final /* synthetic */ e c;

    public d(o oVar, MoneyNotEnoughExperiment moneyNotEnoughExperiment, e eVar) {
        this.a = oVar;
        this.b = moneyNotEnoughExperiment;
        this.c = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MoneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$1 moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof MoneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$1) {
            moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$1 = (MoneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$1) continuation;
            int i2 = moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b, this.c);
                    moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$1.L$0 = null;
                    moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$1.L$1 = null;
                    moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$1.L$2 = null;
                    moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$1 = new MoneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
