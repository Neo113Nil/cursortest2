package com.yandex.go.taxi.order.cancel.by_driver.ui;

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
@mvg(c = "com.yandex.go.taxi.order.cancel.by_driver.ui.CancelledByDriverModalKt$CancelledByDriverModal$3$1$1$1", f = "CancelledByDriverModal.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CancelledByDriverModalKt$CancelledByDriverModal$3$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ yur $focusRequester;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelledByDriverModalKt$CancelledByDriverModal$3$1$1$1(yur yurVar, Continuation continuation) {
        super(2, continuation);
        this.$focusRequester = yurVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CancelledByDriverModalKt$CancelledByDriverModal$3$1$1$1(this.$focusRequester, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CancelledByDriverModalKt$CancelledByDriverModal$3$1$1$1 cancelledByDriverModalKt$CancelledByDriverModal$3$1$1$1 = (CancelledByDriverModalKt$CancelledByDriverModal$3$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        cancelledByDriverModalKt$CancelledByDriverModal$3$1$1$1.invokeSuspend(zy11Var);
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
        yur.b(this.$focusRequester);
        return zy11.a;
    }
}
