package com.ybsdk.feature.dashboard.internal.ui.dashboard3;

import com.ybsdk.feature.dashboard.internal.ui.dashboard3.view.DashboardTokenizationWidget;
import defpackage.bmg;
import defpackage.ha60;
import defpackage.lia1;
import defpackage.lig;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s661;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardV3Fragment$getViewBinding$1$1", f = "DashboardV3Fragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DashboardV3Fragment$getViewBinding$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ s661 $this_apply;
    int label;
    final /* synthetic */ DashboardV3Fragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardV3Fragment$getViewBinding$1$1(s661 s661Var, DashboardV3Fragment dashboardV3Fragment, Continuation continuation) {
        super(2, continuation);
        this.$this_apply = s661Var;
        this.this$0 = dashboardV3Fragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DashboardV3Fragment$getViewBinding$1$1(this.$this_apply, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DashboardV3Fragment$getViewBinding$1$1 dashboardV3Fragment$getViewBinding$1$1 = (DashboardV3Fragment$getViewBinding$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        dashboardV3Fragment$getViewBinding$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ha60 ha60Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        lig ligVar = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        DashboardTokenizationWidget dashboardTokenizationWidget = this.$this_apply.l;
        DashboardV3Fragment.access$getNfcWidgetsFactory$p(this.this$0);
        ha60Var = this.this$0.nfcSupportChecker;
        DashboardV3Fragment dashboardV3Fragment = this.this$0;
        dashboardTokenizationWidget.setWidgetFactory(null, ha60Var, dashboardV3Fragment, dashboardV3Fragment);
        DashboardV3Fragment dashboardV3Fragment2 = this.this$0;
        if (!lia1.g(dashboardV3Fragment2.requireContext())) {
            s661 s661Var = this.$this_apply;
            ligVar = new lig(s661Var.b, s661Var.p, s661Var.l, s661Var.k, s661Var.j, s661Var.m, new bmg(this.this$0, 2));
        }
        dashboardV3Fragment2.dashboardCollapsedAnimation = ligVar;
        return zy11.a;
    }
}
