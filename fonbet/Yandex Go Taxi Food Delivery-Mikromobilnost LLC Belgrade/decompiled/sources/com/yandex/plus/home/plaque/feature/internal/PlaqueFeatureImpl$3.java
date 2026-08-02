package com.yandex.plus.home.plaque.feature.internal;

import defpackage.g92;
import defpackage.mth;
import defpackage.mvg;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.ocz;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.plaque.feature.internal.PlaqueFeatureImpl$3", f = "PlaqueFeatureImpl.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PlaqueFeatureImpl$3 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $accountStateFlow;
    final /* synthetic */ n4u0 $themeStateFlow;
    final /* synthetic */ tpr $updateTriggerFlow;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaqueFeatureImpl$3(tpr tprVar, n4u0 n4u0Var, tpr tprVar2, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$accountStateFlow = tprVar;
        this.$themeStateFlow = n4u0Var;
        this.$updateTriggerFlow = tprVar2;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaqueFeatureImpl$3(this.$accountStateFlow, this.$themeStateFlow, this.$updateTriggerFlow, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaqueFeatureImpl$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h K = e.K(new g92(4, new mth(this.$accountStateFlow, 4)), new mth(this.$themeStateFlow, 4), this.$updateTriggerFlow);
            ocz oczVar = new ocz(25, this.this$0);
            this.label = 1;
            if (K.collect(oczVar, this) == coroutineSingletons) {
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
