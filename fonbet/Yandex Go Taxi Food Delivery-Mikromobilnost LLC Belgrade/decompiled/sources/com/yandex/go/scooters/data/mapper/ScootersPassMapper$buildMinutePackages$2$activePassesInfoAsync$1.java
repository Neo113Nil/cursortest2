package com.yandex.go.scooters.data.mapper;

import defpackage.fef;
import defpackage.g590;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v20;
import defpackage.w20;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lw20;", "<anonymous>", "(Ltse;)Lw20;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScootersPassMapper$buildMinutePackages$2$activePassesInfoAsync$1", f = "ScootersPassMapper.kt", l = {113}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPassMapper$buildMinutePackages$2$activePassesInfoAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ g590 $packages;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassMapper$buildMinutePackages$2$activePassesInfoAsync$1(fef fefVar, g590 g590Var, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$packages = g590Var;
        this.this$0 = dVar;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPassMapper$buildMinutePackages$2$activePassesInfoAsync$1(this.$currencyRules, this.$packages, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPassMapper$buildMinutePackages$2$activePassesInfoAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            v20 v20Var = this.$packages.e;
            if (v20Var == null) {
                return null;
            }
            d dVar = this.this$0;
            fef fefVar = this.$currencyRules;
            this.label = 1;
            obj = d.a(dVar, v20Var, fefVar, this);
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
        return (w20) obj;
    }
}
