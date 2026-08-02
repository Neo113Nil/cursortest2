package com.yandex.go.scooters.data;

import com.yandex.go.scooters.data.model.ScootersSurgeExperiment;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qko0;
import defpackage.qoh;
import defpackage.rko0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lqko0;", "<anonymous>", "(Ltse;)Lqko0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.ScootersPreOfferExperimentsRepository$getPreOfferExperiments$2", f = "ScootersPreOfferExperimentsRepository.kt", l = {21, 22}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPreOfferExperimentsRepository$getPreOfferExperiments$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    final /* synthetic */ rko0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPreOfferExperimentsRepository$getPreOfferExperiments$2(rko0 rko0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rko0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersPreOfferExperimentsRepository$getPreOfferExperiments$2 scootersPreOfferExperimentsRepository$getPreOfferExperiments$2 = new ScootersPreOfferExperimentsRepository$getPreOfferExperiments$2(this.this$0, continuation);
        scootersPreOfferExperimentsRepository$getPreOfferExperiments$2.L$0 = obj;
        return scootersPreOfferExperimentsRepository$getPreOfferExperiments$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPreOfferExperimentsRepository$getPreOfferExperiments$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r9 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        boolean z;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new ScootersPreOfferExperimentsRepository$getPreOfferExperiments$2$depositExperimentEnabledAsync$1(this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new ScootersPreOfferExperimentsRepository$getPreOfferExperiments$2$surgeExperimentAsync$1(this.this$0, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.label = 1;
            obj = h2.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = this.Z$0;
                kotlin.b.b(obj);
                return new qko0(z, (ScootersSurgeExperiment) obj);
            }
            h = (noh) this.L$2;
            kotlin.b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.Z$0 = booleanValue;
        this.label = 2;
        Object k = h.k(this);
        if (k != coroutineSingletons) {
            z = booleanValue;
            obj = k;
            return new qko0(z, (ScootersSurgeExperiment) obj);
        }
        return coroutineSingletons;
    }
}
