package com.yandex.go.scooters.data.mapper;

import defpackage.bvf0;
import defpackage.fef;
import defpackage.h2n0;
import defpackage.i8w0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lo86;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScootersPassMapper$whenSuperPassesAvailableOnly$2$bonusPasses$1", f = "ScootersPassMapper.kt", l = {236}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPassMapper$whenSuperPassesAvailableOnly$2$bonusPasses$1 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ i8w0 $superPasses;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassMapper$whenSuperPassesAvailableOnly$2$bonusPasses$1(fef fefVar, i8w0 i8w0Var, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$superPasses = i8w0Var;
        this.this$0 = dVar;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPassMapper$whenSuperPassesAvailableOnly$2$bonusPasses$1(this.$currencyRules, this.$superPasses, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPassMapper$whenSuperPassesAvailableOnly$2$bonusPasses$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h2n0 h2n0Var = this.$superPasses.f;
            if (h2n0Var == null) {
                return null;
            }
            d dVar = this.this$0;
            fef fefVar = this.$currencyRules;
            this.label = 1;
            dVar.getClass();
            obj = bvf0.n(new ScootersPassMapper$mapToBonusPasses$2(h2n0Var.a, dVar, fefVar, null), this);
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
        return (List) obj;
    }
}
