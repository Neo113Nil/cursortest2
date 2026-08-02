package com.yandex.go.scooters.passes.active.v3.renew.disabling;

import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import defpackage.agd;
import defpackage.avm0;
import defpackage.csm0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xrm0;
import defpackage.yfd;
import defpackage.yrm0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.active.v3.renew.disabling.ScootersActivePassesV3RenewDisablingRouter$content$1$1$1", f = "ScootersActivePassesV3RenewDisablingRouter.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersActivePassesV3RenewDisablingRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ csm0 $action;
    final /* synthetic */ yrm0 $navigator;
    final /* synthetic */ c $scootersActivePassesV3RenewDisablingUiActionInteractor;
    final /* synthetic */ yfd $this_buildContent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersActivePassesV3RenewDisablingRouter$content$1$1$1(c cVar, csm0 csm0Var, yfd yfdVar, yrm0 yrm0Var, Continuation continuation) {
        super(2, continuation);
        this.$scootersActivePassesV3RenewDisablingUiActionInteractor = cVar;
        this.$action = csm0Var;
        this.$this_buildContent = yfdVar;
        this.$navigator = yrm0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersActivePassesV3RenewDisablingRouter$content$1$1$1(this.$scootersActivePassesV3RenewDisablingUiActionInteractor, this.$action, this.$this_buildContent, this.$navigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersActivePassesV3RenewDisablingRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.$scootersActivePassesV3RenewDisablingUiActionInteractor;
            csm0 csm0Var = this.$action;
            Object obj2 = ((agd) this.$this_buildContent).a;
            avm0 avm0Var = ((xrm0) obj2).a;
            ScootersPassesFromScreen scootersPassesFromScreen = ((xrm0) obj2).b;
            yrm0 yrm0Var = this.$navigator;
            this.label = 1;
            if (cVar.a(csm0Var, avm0Var, scootersPassesFromScreen, yrm0Var, this) == coroutineSingletons) {
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
