package com.yandex.go.scooters.ignition.controlling;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.eqn0;
import defpackage.mpn0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vpn0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.controlling.ScootersIgnitionControllingRouter$content$1$1$1", f = "ScootersIgnitionControllingRouter.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionControllingRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ eqn0 $action;
    final /* synthetic */ mpn0 $navigator;
    final /* synthetic */ f $scootersIgnitionControllingUiActionInteractor;
    final /* synthetic */ vpn0 $screenStateRepository;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionControllingRouter$content$1$1$1(f fVar, eqn0 eqn0Var, mpn0 mpn0Var, vpn0 vpn0Var, Continuation continuation) {
        super(2, continuation);
        this.$scootersIgnitionControllingUiActionInteractor = fVar;
        this.$action = eqn0Var;
        this.$navigator = mpn0Var;
        this.$screenStateRepository = vpn0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersIgnitionControllingRouter$content$1$1$1(this.$scootersIgnitionControllingUiActionInteractor, this.$action, this.$navigator, this.$screenStateRepository, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersIgnitionControllingRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.$scootersIgnitionControllingUiActionInteractor;
            eqn0 eqn0Var = this.$action;
            mpn0 mpn0Var = this.$navigator;
            vpn0 vpn0Var = this.$screenStateRepository;
            this.label = 1;
            if (fVar.c(eqn0Var, mpn0Var, vpn0Var, this) == coroutineSingletons) {
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
