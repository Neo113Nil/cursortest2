package com.yandex.plus.core.debug.panel.internal.presentation.controller;

import defpackage.cwc;
import defpackage.j4n;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xr31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.core.debug.panel.internal.presentation.controller.DebugPanelViewControllerImpl$onViewAttachedToWindow$1", f = "DebugPanelViewControllerImpl.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class DebugPanelViewControllerImpl$onViewAttachedToWindow$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ DebugPanelViewControllerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugPanelViewControllerImpl$onViewAttachedToWindow$1(DebugPanelViewControllerImpl debugPanelViewControllerImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = debugPanelViewControllerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DebugPanelViewControllerImpl$onViewAttachedToWindow$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DebugPanelViewControllerImpl$onViewAttachedToWindow$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xr31 xr31Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            xr31Var = this.this$0.viewModel;
            r0 r0Var = (r0) ((j4n) xr31Var).w;
            cwc cwcVar = new cwc(25, this.this$0);
            this.label = 1;
            if (r0Var.collect(cwcVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
