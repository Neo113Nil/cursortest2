package com.yandex.go.loyalty.impl.selector.ui;

import defpackage.axz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.loyalty.impl.selector.ui.LoyaltySelectorModalViewKt$LoyaltySelectorModalView$1$1", f = "LoyaltySelectorModalView.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LoyaltySelectorModalViewKt$LoyaltySelectorModalView$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $handleAction;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltySelectorModalViewKt$LoyaltySelectorModalView$1$1(tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$handleAction = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoyaltySelectorModalViewKt$LoyaltySelectorModalView$1$1(this.$handleAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        LoyaltySelectorModalViewKt$LoyaltySelectorModalView$1$1 loyaltySelectorModalViewKt$LoyaltySelectorModalView$1$1 = (LoyaltySelectorModalViewKt$LoyaltySelectorModalView$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        loyaltySelectorModalViewKt$LoyaltySelectorModalView$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.$handleAction.invoke(axz.a);
        return zy11.a;
    }
}
