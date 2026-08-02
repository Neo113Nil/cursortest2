package com.yandex.go.scooters.insurance.suggest;

import com.yandex.go.scooters.domain.r;
import defpackage.aun0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zgz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.insurance.suggest.ScootersInsuranceSuggestPresenter$showInsuranceInfo$1", f = "ScootersInsuranceSuggestPresenter.kt", l = {59}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersInsuranceSuggestPresenter$showInsuranceInfo$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ aun0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersInsuranceSuggestPresenter$showInsuranceInfo$1(aun0 aun0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aun0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersInsuranceSuggestPresenter$showInsuranceInfo$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersInsuranceSuggestPresenter$showInsuranceInfo$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            r rVar = this.this$0.x;
            this.label = 1;
            obj = rVar.c(this);
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
        String str = (String) obj;
        zy11 zy11Var = zy11.a;
        if (str == null) {
            zgz.a(null, new IllegalArgumentException("Promotion id for scooters insurance is not set in experiment"));
            return zy11Var;
        }
        ((ScootersInsuranceSuggestRouter$provideModalView$3) this.this$0.z).invoke(str);
        return zy11Var;
    }
}
