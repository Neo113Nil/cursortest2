package com.yandex.go.scooters.passes.active.v3.winback;

import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import defpackage.agd;
import defpackage.avm0;
import defpackage.hum0;
import defpackage.ium0;
import defpackage.lum0;
import defpackage.mum0;
import defpackage.mvg;
import defpackage.num0;
import defpackage.ny61;
import defpackage.oum0;
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
@mvg(c = "com.yandex.go.scooters.passes.active.v3.winback.ScootersActivePassesV3WinbackRouter$content$1$1$1", f = "ScootersActivePassesV3WinbackRouter.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersActivePassesV3WinbackRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ oum0 $action;
    final /* synthetic */ ium0 $innerNavigator;
    final /* synthetic */ c $scootersActivePassesV3WinbackUiActionInteractor;
    final /* synthetic */ lum0 $screenStateRepository;
    final /* synthetic */ yfd $this_buildContent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersActivePassesV3WinbackRouter$content$1$1$1(c cVar, yfd yfdVar, oum0 oum0Var, ium0 ium0Var, lum0 lum0Var, Continuation continuation) {
        super(2, continuation);
        this.$scootersActivePassesV3WinbackUiActionInteractor = cVar;
        this.$this_buildContent = yfdVar;
        this.$action = oum0Var;
        this.$innerNavigator = ium0Var;
        this.$screenStateRepository = lum0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersActivePassesV3WinbackRouter$content$1$1$1(this.$scootersActivePassesV3WinbackUiActionInteractor, this.$this_buildContent, this.$action, this.$innerNavigator, this.$screenStateRepository, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersActivePassesV3WinbackRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.$scootersActivePassesV3WinbackUiActionInteractor;
            Object obj2 = ((agd) this.$this_buildContent).a;
            ScootersPassesFromScreen scootersPassesFromScreen = ((hum0) obj2).b;
            oum0 oum0Var = this.$action;
            ium0 ium0Var = this.$innerNavigator;
            avm0 avm0Var = ((hum0) obj2).a;
            lum0 lum0Var = this.$screenStateRepository;
            this.label = 1;
            if (oum0Var instanceof num0) {
                a = cVar.b(scootersPassesFromScreen, ium0Var, avm0Var, lum0Var, this);
            } else {
                if (!(oum0Var instanceof mum0)) {
                    cVar.getClass();
                    w511.b();
                    return null;
                }
                a = cVar.a(scootersPassesFromScreen, ium0Var, avm0Var, lum0Var, this);
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
