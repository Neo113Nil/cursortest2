package com.yandex.go.requirements.comment.summary.ui.v3.ui.utils;

import defpackage.bui0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.u5t0;
import defpackage.wls;
import defpackage.wz20;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.requirements.comment.summary.ui.v3.ui.utils.RememberKeyboardClosingBottomSheetStateKt$rememberKeyboardClosingBottomSheetState$1$1", f = "rememberKeyboardClosingBottomSheetState.kt", l = {24}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RememberKeyboardClosingBottomSheetStateKt$rememberKeyboardClosingBottomSheetState$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ u5t0 $keyboardController;
    final /* synthetic */ wz20 $triggers;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberKeyboardClosingBottomSheetStateKt$rememberKeyboardClosingBottomSheetState$1$1(wz20 wz20Var, u5t0 u5t0Var, Continuation continuation) {
        super(2, continuation);
        this.$triggers = wz20Var;
        this.$keyboardController = u5t0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RememberKeyboardClosingBottomSheetStateKt$rememberKeyboardClosingBottomSheetState$1$1(this.$triggers, this.$keyboardController, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RememberKeyboardClosingBottomSheetStateKt$rememberKeyboardClosingBottomSheetState$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$triggers.a;
            bui0 bui0Var = new bui0(this.$keyboardController, 0);
            this.label = 1;
            if (tprVar.collect(bui0Var, this) == coroutineSingletons) {
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
