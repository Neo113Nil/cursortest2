package com.yandex.go.scooters.insurance;

import com.yandex.go.scooters.api.domain.model.ScootersInsuranceType;
import com.yandex.go.scooters.domain.r;
import defpackage.kqe0;
import defpackage.mtn0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.insurance.ScootersInsurancePresenter$changeInsuranceType$2", f = "ScootersInsurancePresenter.kt", l = {HProv.PROV_GOST_2001_DH}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersInsurancePresenter$changeInsuranceType$2 extends SuspendLambda implements wls {
    final /* synthetic */ sls $onChanged;
    final /* synthetic */ ScootersInsuranceType $type;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersInsurancePresenter$changeInsuranceType$2(e eVar, ScootersInsuranceType scootersInsuranceType, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$type = scootersInsuranceType;
        this.$onChanged = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersInsurancePresenter$changeInsuranceType$2(this.this$0, this.$type, this.$onChanged, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersInsurancePresenter$changeInsuranceType$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ScootersInsuranceType scootersInsuranceType;
        sls slsVar;
        e eVar;
        sls slsVar2;
        e eVar2;
        ScootersInsuranceType scootersInsuranceType2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                e eVar3 = this.this$0;
                scootersInsuranceType = this.$type;
                slsVar = this.$onChanged;
                try {
                    ((mtn0) eVar3.Dg()).s2();
                    r rVar = eVar3.x;
                    this.L$0 = eVar3;
                    this.L$1 = scootersInsuranceType;
                    this.L$2 = slsVar;
                    this.L$3 = eVar3;
                    this.L$4 = scootersInsuranceType;
                    this.L$5 = slsVar;
                    this.label = 1;
                    if (rVar.a(scootersInsuranceType, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    eVar2 = eVar3;
                    eVar = eVar2;
                    scootersInsuranceType2 = scootersInsuranceType;
                    slsVar2 = slsVar;
                } catch (Throwable th) {
                    th = th;
                    eVar = eVar3;
                    slsVar2 = slsVar;
                    ((mtn0) eVar.Dg()).U6(th, new kqe0(24, eVar, scootersInsuranceType, slsVar2));
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                slsVar2 = (sls) this.L$5;
                scootersInsuranceType = (ScootersInsuranceType) this.L$4;
                eVar = (e) this.L$3;
                slsVar = (sls) this.L$2;
                scootersInsuranceType2 = (ScootersInsuranceType) this.L$1;
                eVar2 = (e) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    ((mtn0) eVar.Dg()).U6(th, new kqe0(24, eVar, scootersInsuranceType, slsVar2));
                    return zy11.a;
                }
            }
            ((mtn0) eVar2.Dg()).Yf(scootersInsuranceType2, slsVar);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
