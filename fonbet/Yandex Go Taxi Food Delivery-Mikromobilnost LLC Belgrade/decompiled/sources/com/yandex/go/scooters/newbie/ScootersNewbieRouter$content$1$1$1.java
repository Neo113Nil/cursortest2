package com.yandex.go.scooters.newbie;

import defpackage.e2o0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.z1o0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.newbie.ScootersNewbieRouter$content$1$1$1", f = "ScootersNewbieRouter.kt", l = {66}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersNewbieRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ e2o0 $action;
    final /* synthetic */ z1o0 $innerNavigator;
    final /* synthetic */ f $scootersNewbieUiActionInteractor;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersNewbieRouter$content$1$1$1(f fVar, e2o0 e2o0Var, z1o0 z1o0Var, Continuation continuation) {
        super(2, continuation);
        this.$scootersNewbieUiActionInteractor = fVar;
        this.$action = e2o0Var;
        this.$innerNavigator = z1o0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersNewbieRouter$content$1$1$1(this.$scootersNewbieUiActionInteractor, this.$action, this.$innerNavigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersNewbieRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.$scootersNewbieUiActionInteractor;
            e2o0 e2o0Var = this.$action;
            z1o0 z1o0Var = this.$innerNavigator;
            this.label = 1;
            if (fVar.a(e2o0Var, z1o0Var, this) == coroutineSingletons) {
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
