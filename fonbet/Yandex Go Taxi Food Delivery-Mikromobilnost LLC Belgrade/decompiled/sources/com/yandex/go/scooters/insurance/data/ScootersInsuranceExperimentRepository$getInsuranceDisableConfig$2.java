package com.yandex.go.scooters.insurance.data;

import defpackage.etn0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Letn0;", "<anonymous>", "(Ltse;)Letn0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.insurance.data.ScootersInsuranceExperimentRepository$getInsuranceDisableConfig$2", f = "ScootersInsuranceExperimentRepository.kt", l = {101, 102, 103}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersInsuranceExperimentRepository$getInsuranceDisableConfig$2 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersClientInsuranceNewExperiment.a $disableUpsale;
    final /* synthetic */ ScootersClientInsuranceNewExperiment $insuranceExperiment;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersInsuranceExperimentRepository$getInsuranceDisableConfig$2(b bVar, Continuation continuation, ScootersClientInsuranceNewExperiment.a aVar, ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment) {
        super(2, continuation);
        this.$disableUpsale = aVar;
        this.this$0 = bVar;
        this.$insuranceExperiment = scootersClientInsuranceNewExperiment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersInsuranceExperimentRepository$getInsuranceDisableConfig$2 scootersInsuranceExperimentRepository$getInsuranceDisableConfig$2 = new ScootersInsuranceExperimentRepository$getInsuranceDisableConfig$2(this.this$0, continuation, this.$disableUpsale, this.$insuranceExperiment);
        scootersInsuranceExperimentRepository$getInsuranceDisableConfig$2.L$0 = obj;
        return scootersInsuranceExperimentRepository$getInsuranceDisableConfig$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersInsuranceExperimentRepository$getInsuranceDisableConfig$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh nohVar;
        noh nohVar2;
        String str;
        CharSequence charSequence;
        noh nohVar3;
        String str2;
        Object k;
        CharSequence charSequence2;
        CharSequence charSequence3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h = tje.h(tseVar, null, null, new ScootersInsuranceExperimentRepository$getInsuranceDisableConfig$2$titleAsync$1(this.this$0, null, this.$disableUpsale, this.$insuranceExperiment), 3);
            qoh h2 = tje.h(tseVar, null, null, new ScootersInsuranceExperimentRepository$getInsuranceDisableConfig$2$mainButtonTextAsync$1(this.this$0, null, this.$disableUpsale, this.$insuranceExperiment), 3);
            qoh h3 = tje.h(tseVar, null, null, new ScootersInsuranceExperimentRepository$getInsuranceDisableConfig$2$minorButtonTextAsync$1(this.this$0, null, this.$disableUpsale, this.$insuranceExperiment), 3);
            String str3 = this.$disableUpsale.b;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h2;
            this.L$3 = h3;
            this.L$4 = str3;
            this.label = 1;
            obj = h.s(this);
            if (obj != coroutineSingletons) {
                nohVar = h2;
                nohVar2 = h3;
                str = str3;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                charSequence3 = (CharSequence) this.L$6;
                charSequence2 = (CharSequence) this.L$5;
                str2 = (String) this.L$4;
                kotlin.b.b(obj);
                return new etn0(charSequence2, charSequence3, (CharSequence) obj, str2);
            }
            charSequence = (CharSequence) this.L$5;
            str2 = (String) this.L$4;
            nohVar3 = (noh) this.L$3;
            kotlin.b.b(obj);
            CharSequence charSequence4 = (CharSequence) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = str2;
            this.L$5 = charSequence;
            this.L$6 = charSequence4;
            this.label = 3;
            k = nohVar3.k(this);
            if (k != coroutineSingletons) {
                charSequence2 = charSequence;
                charSequence3 = charSequence4;
                obj = k;
                return new etn0(charSequence2, charSequence3, (CharSequence) obj, str2);
            }
            return coroutineSingletons;
        }
        str = (String) this.L$4;
        nohVar2 = (noh) this.L$3;
        nohVar = (noh) this.L$2;
        kotlin.b.b(obj);
        CharSequence charSequence5 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = nohVar2;
        this.L$4 = str;
        this.L$5 = charSequence5;
        this.label = 2;
        Object k2 = nohVar.k(this);
        if (k2 != coroutineSingletons) {
            String str4 = str;
            charSequence = charSequence5;
            obj = k2;
            nohVar3 = nohVar2;
            str2 = str4;
            CharSequence charSequence42 = (CharSequence) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = str2;
            this.L$5 = charSequence;
            this.L$6 = charSequence42;
            this.label = 3;
            k = nohVar3.k(this);
            if (k != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
