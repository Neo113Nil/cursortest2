package com.ybsdk.widgets.common;

import defpackage.kao;
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
@mvg(c = "com.ybsdk.widgets.common.ErrorView$changeVisibility$1", f = "ErrorView.kt", l = {165}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ErrorView$changeVisibility$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isVisible;
    final /* synthetic */ kao $state;
    final /* synthetic */ boolean $wasVisible;
    final /* synthetic */ boolean $withDelay;
    int label;
    final /* synthetic */ ErrorView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorView$changeVisibility$1(boolean z, ErrorView errorView, boolean z2, boolean z3, kao kaoVar, Continuation continuation) {
        super(2, continuation);
        this.$isVisible = z;
        this.this$0 = errorView;
        this.$withDelay = z2;
        this.$wasVisible = z3;
        this.$state = kaoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ErrorView$changeVisibility$1(this.$isVisible, this.this$0, this.$withDelay, this.$wasVisible, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ErrorView$changeVisibility$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            if (this.$isVisible == (this.this$0.getVisibility() == 0)) {
                return zy11Var;
            }
            if (this.$isVisible && this.$withDelay) {
                this.label = 1;
                if (kotlinx.coroutines.a.i(300L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.this$0.setVisibility(this.$isVisible ? 0 : 8);
        this.this$0.reportVisibility(this.$wasVisible, this.$state);
        if (this.$isVisible) {
            com.ybsdk.core.utils.ext.view.b.m(this.this$0);
        }
        return zy11Var;
    }
}
