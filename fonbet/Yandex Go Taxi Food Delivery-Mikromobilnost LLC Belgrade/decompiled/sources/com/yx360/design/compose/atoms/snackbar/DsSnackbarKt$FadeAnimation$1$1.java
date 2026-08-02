package com.yx360.design.compose.atoms.snackbar;

import defpackage.ck11;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yx360.design.compose.atoms.snackbar.DsSnackbarKt$FadeAnimation$1$1", f = "DsSnackbar.kt", l = {252}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class DsSnackbarKt$FadeAnimation$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ck11 $exitSpec;
    final /* synthetic */ boolean $isVisible;
    final /* synthetic */ oz40 $showContent$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsSnackbarKt$FadeAnimation$1$1(boolean z, ck11 ck11Var, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$isVisible = z;
        this.$exitSpec = ck11Var;
        this.$showContent$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DsSnackbarKt$FadeAnimation$1$1(this.$isVisible, this.$exitSpec, this.$showContent$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DsSnackbarKt$FadeAnimation$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (this.$isVisible) {
                oz40 oz40Var = this.$showContent$delegate;
                float f = a.a;
                oz40Var.setValue(Boolean.TRUE);
                return zy11.a;
            }
            long j = this.$exitSpec.a;
            this.label = 1;
            if (kotlinx.coroutines.a.i(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        oz40 oz40Var2 = this.$showContent$delegate;
        float f2 = a.a;
        oz40Var2.setValue(Boolean.FALSE);
        return zy11.a;
    }
}
