package com.yandex.go.scooters.data.mapper;

import defpackage.bvf0;
import defpackage.fef;
import defpackage.i8w0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rco0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lrco0;", "<anonymous>", "(Ltse;)Lrco0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScootersPassMapper$buildMinutePackages$2$anotherPassTypePurchaseAsync$1", f = "ScootersPassMapper.kt", l = {HProv.PP_DHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPassMapper$buildMinutePackages$2$anotherPassTypePurchaseAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ String $pendingOperationId;
    final /* synthetic */ i8w0 $superPasses;
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassMapper$buildMinutePackages$2$anotherPassTypePurchaseAsync$1(fef fefVar, i8w0 i8w0Var, d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$superPasses = i8w0Var;
        this.this$0 = dVar;
        this.$currencyRules = fefVar;
        this.$pendingOperationId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPassMapper$buildMinutePackages$2$anotherPassTypePurchaseAsync$1(this.$currencyRules, this.$superPasses, this.this$0, this.$pendingOperationId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPassMapper$buildMinutePackages$2$anotherPassTypePurchaseAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            i8w0 i8w0Var = this.$superPasses;
            if (i8w0Var == null) {
                return null;
            }
            d dVar = this.this$0;
            fef fefVar = this.$currencyRules;
            String str = this.$pendingOperationId;
            this.L$0 = null;
            this.label = 1;
            dVar.getClass();
            obj = bvf0.n(new ScootersPassMapper$whenSuperPassesAvailableOnly$2(fefVar, i8w0Var, dVar, str, null), this);
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
        return (rco0) obj;
    }
}
