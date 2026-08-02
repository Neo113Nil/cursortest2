package com.yandex.go.mainscreen.superapp.impl.foundation.presentation;

import defpackage.hcw0;
import defpackage.icw0;
import defpackage.jl40;
import defpackage.lcw0;
import defpackage.lx4;
import defpackage.mcw0;
import defpackage.mvg;
import defpackage.ncw0;
import defpackage.ny61;
import defpackage.ocw0;
import defpackage.pcw0;
import defpackage.tig0;
import defpackage.w511;
import defpackage.wls;
import defpackage.x770;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.analytics.j;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpcw0;", "it", "Lzy11;", "<anonymous>", "(Lpcw0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.foundation.presentation.SuperAppMainScreenPresenter$observeLoadingState$1", f = "SuperAppMainScreenPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SuperAppMainScreenPresenter$observeLoadingState$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainScreenPresenter$observeLoadingState$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuperAppMainScreenPresenter$observeLoadingState$1 superAppMainScreenPresenter$observeLoadingState$1 = new SuperAppMainScreenPresenter$observeLoadingState$1(this.this$0, continuation);
        superAppMainScreenPresenter$observeLoadingState$1.L$0 = obj;
        return superAppMainScreenPresenter$observeLoadingState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SuperAppMainScreenPresenter$observeLoadingState$1 superAppMainScreenPresenter$observeLoadingState$1 = (SuperAppMainScreenPresenter$observeLoadingState$1) create((pcw0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        superAppMainScreenPresenter$observeLoadingState$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pcw0 pcw0Var = (pcw0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tig0 tig0Var = this.this$0.V.a;
        ocw0 ocw0Var = pcw0Var.a;
        icw0 icw0Var = pcw0Var.b;
        boolean l = jl40.l(ocw0Var, ncw0.a);
        hcw0 hcw0Var = hcw0.a;
        if (l) {
            if (jl40.l(icw0Var, hcw0Var)) {
                ((j) ((lx4) tig0Var.a)).n("SuperappMain.UpdateState.EmptyShown");
            } else {
                ((j) ((lx4) tig0Var.a)).n("SuperappMain.UpdateState.ProductsShown");
            }
            ((j) ((lx4) tig0Var.a)).n("SuperappMain.LoadingSections.Show");
        } else if (jl40.l(ocw0Var, mcw0.a)) {
            if (jl40.l(icw0Var, hcw0Var)) {
                ((j) ((lx4) tig0Var.a)).n("SuperappMain.UpdateState.EmptyShown");
            } else {
                ((j) ((lx4) tig0Var.a)).n("SuperappMain.UpdateState.ProductsShown");
            }
            ((j) ((lx4) tig0Var.a)).n("SuperappMain.LoadingSections.Hide");
        } else {
            if (!(ocw0Var instanceof lcw0)) {
                w511.b();
                return null;
            }
            ((x770) tig0Var.b).e();
        }
        return zy11.a;
    }
}
