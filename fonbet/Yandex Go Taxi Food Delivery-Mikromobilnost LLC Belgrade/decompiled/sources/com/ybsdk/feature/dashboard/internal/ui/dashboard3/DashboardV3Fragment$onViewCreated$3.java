package com.ybsdk.feature.dashboard.internal.ui.dashboard3;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardV3Fragment$onViewCreated$3", f = "DashboardV3Fragment.kt", l = {280}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DashboardV3Fragment$onViewCreated$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ DashboardV3Fragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardV3Fragment$onViewCreated$3(DashboardV3Fragment dashboardV3Fragment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dashboardV3Fragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DashboardV3Fragment$onViewCreated$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DashboardV3Fragment$onViewCreated$3 dashboardV3Fragment$onViewCreated$3 = (DashboardV3Fragment$onViewCreated$3) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        dashboardV3Fragment$onViewCreated$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            DashboardV3Fragment.access$getNfcPaymentController$p(this.this$0);
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
