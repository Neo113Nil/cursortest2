package com.yandex.go.scooters.passes.active.v3.freeze;

import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import defpackage.agd;
import defpackage.avm0;
import defpackage.jrm0;
import defpackage.krm0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.prm0;
import defpackage.qrm0;
import defpackage.rrm0;
import defpackage.srm0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.yfd;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.active.v3.freeze.ScootersActivePassesV3FreezeRouter$content$1$1$1", f = "ScootersActivePassesV3FreezeRouter.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersActivePassesV3FreezeRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ srm0 $action;
    final /* synthetic */ krm0 $innerNavigator;
    final /* synthetic */ c $scootersActivePassesV3FreezeUiActionInteractor;
    final /* synthetic */ prm0 $screenStateRepository;
    final /* synthetic */ yfd $this_buildContent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersActivePassesV3FreezeRouter$content$1$1$1(c cVar, srm0 srm0Var, yfd yfdVar, krm0 krm0Var, prm0 prm0Var, Continuation continuation) {
        super(2, continuation);
        this.$scootersActivePassesV3FreezeUiActionInteractor = cVar;
        this.$action = srm0Var;
        this.$this_buildContent = yfdVar;
        this.$innerNavigator = krm0Var;
        this.$screenStateRepository = prm0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersActivePassesV3FreezeRouter$content$1$1$1(this.$scootersActivePassesV3FreezeUiActionInteractor, this.$action, this.$this_buildContent, this.$innerNavigator, this.$screenStateRepository, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersActivePassesV3FreezeRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.$scootersActivePassesV3FreezeUiActionInteractor;
            srm0 srm0Var = this.$action;
            Object obj2 = ((agd) this.$this_buildContent).a;
            avm0 avm0Var = ((jrm0) obj2).a;
            ScootersPassesFromScreen scootersPassesFromScreen = ((jrm0) obj2).b;
            krm0 krm0Var = this.$innerNavigator;
            prm0 prm0Var = this.$screenStateRepository;
            this.label = 1;
            if (srm0Var instanceof rrm0) {
                a = cVar.b(avm0Var, scootersPassesFromScreen, krm0Var, prm0Var, this);
            } else {
                if (!(srm0Var instanceof qrm0)) {
                    cVar.getClass();
                    w511.b();
                    return null;
                }
                a = cVar.a(avm0Var, scootersPassesFromScreen, krm0Var, prm0Var, this);
            }
            if (a == coroutineSingletons) {
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
