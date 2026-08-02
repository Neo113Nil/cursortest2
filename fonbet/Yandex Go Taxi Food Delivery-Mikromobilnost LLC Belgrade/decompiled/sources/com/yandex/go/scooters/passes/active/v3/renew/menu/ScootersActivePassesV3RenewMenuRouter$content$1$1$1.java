package com.yandex.go.scooters.passes.active.v3.renew.menu;

import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.agd;
import defpackage.avm0;
import defpackage.jl40;
import defpackage.ksm0;
import defpackage.m950;
import defpackage.msm0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.osm0;
import defpackage.qu;
import defpackage.tse;
import defpackage.usm0;
import defpackage.vsm0;
import defpackage.w511;
import defpackage.wls;
import defpackage.wsm0;
import defpackage.xrm0;
import defpackage.xsm0;
import defpackage.yfd;
import defpackage.ygi0;
import defpackage.yum0;
import defpackage.zmm0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.active.v3.renew.menu.ScootersActivePassesV3RenewMenuRouter$content$1$1$1", f = "ScootersActivePassesV3RenewMenuRouter.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersActivePassesV3RenewMenuRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ xsm0 $action;
    final /* synthetic */ msm0 $navigator;
    final /* synthetic */ c $scootersActivePassesV3RenewMenuUiActionInteractor;
    final /* synthetic */ usm0 $screenStateRepository;
    final /* synthetic */ yfd $this_buildContent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersActivePassesV3RenewMenuRouter$content$1$1$1(c cVar, xsm0 xsm0Var, yfd yfdVar, usm0 usm0Var, msm0 msm0Var, Continuation continuation) {
        super(2, continuation);
        this.$scootersActivePassesV3RenewMenuUiActionInteractor = cVar;
        this.$action = xsm0Var;
        this.$this_buildContent = yfdVar;
        this.$screenStateRepository = usm0Var;
        this.$navigator = msm0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersActivePassesV3RenewMenuRouter$content$1$1$1(this.$scootersActivePassesV3RenewMenuUiActionInteractor, this.$action, this.$this_buildContent, this.$screenStateRepository, this.$navigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersActivePassesV3RenewMenuRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0098 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.$scootersActivePassesV3RenewMenuUiActionInteractor;
        xsm0 xsm0Var = this.$action;
        Object obj2 = ((agd) this.$this_buildContent).a;
        avm0 avm0Var = ((ksm0) obj2).a;
        ScootersPassesFromScreen scootersPassesFromScreen = ((ksm0) obj2).b;
        usm0 usm0Var = this.$screenStateRepository;
        msm0 msm0Var = this.$navigator;
        this.label = 1;
        cVar.getClass();
        if (!jl40.l(xsm0Var, vsm0.a)) {
            if (jl40.l(xsm0Var, vsm0.c)) {
                c = cVar.b(avm0Var.b, usm0Var, msm0Var, this);
            } else if (jl40.l(xsm0Var, vsm0.b)) {
                c = cVar.a(msm0Var, this);
            } else {
                if (!(xsm0Var instanceof wsm0)) {
                    w511.b();
                    return null;
                }
                yum0 yum0Var = avm0Var.g;
                if (yum0Var.g) {
                    ygi0 ygi0Var = msm0Var.a;
                    ygi0Var.D((m950) ((zmm0) ygi0Var.N).get(), new xrm0(avm0Var, scootersPassesFromScreen), new osm0(ygi0Var, avm0Var, scootersPassesFromScreen));
                } else {
                    c = cVar.c(avm0Var.a, yum0Var.e, scootersPassesFromScreen, msm0Var, usm0Var, this);
                }
            }
            return c != coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        msm0Var.a.r(new qu(9));
        c = zy11Var;
        if (c != coroutineSingletons) {
        }
    }
}
