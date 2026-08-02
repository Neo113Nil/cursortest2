package com.yandex.go.design.compose.input.utils;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yur;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.design.compose.input.utils.InitialInputFocusKt$obtainInitialFocus$1$1$1", f = "InitialInputFocus.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class InitialInputFocusKt$obtainInitialFocus$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ yur $requester;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitialInputFocusKt$obtainInitialFocus$1$1$1(yur yurVar, Continuation continuation) {
        super(2, continuation);
        this.$requester = yurVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InitialInputFocusKt$obtainInitialFocus$1$1$1(this.$requester, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        InitialInputFocusKt$obtainInitialFocus$1$1$1 initialInputFocusKt$obtainInitialFocus$1$1$1 = (InitialInputFocusKt$obtainInitialFocus$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        initialInputFocusKt$obtainInitialFocus$1$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        yur.b(this.$requester);
        return zy11.a;
    }
}
