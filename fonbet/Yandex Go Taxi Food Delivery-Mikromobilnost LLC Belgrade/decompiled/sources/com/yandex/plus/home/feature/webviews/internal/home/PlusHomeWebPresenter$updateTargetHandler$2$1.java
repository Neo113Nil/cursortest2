package com.yandex.plus.home.feature.webviews.internal.home;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.s4d0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.home.PlusHomeWebPresenter$updateTargetHandler$2$1", f = "PlusHomeWebPresenter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlusHomeWebPresenter$updateTargetHandler$2$1 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusHomeWebPresenter$updateTargetHandler$2$1(d dVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PlusHomeWebPresenter$updateTargetHandler$2$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        PlusHomeWebPresenter$updateTargetHandler$2$1 plusHomeWebPresenter$updateTargetHandler$2$1 = (PlusHomeWebPresenter$updateTargetHandler$2$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        plusHomeWebPresenter$updateTargetHandler$2$1.invokeSuspend(zy11Var);
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
        com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.e k = this.this$0.k();
        pzt0 pzt0Var = k.i;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        k.i = null;
        ((s4d0) this.this$0.b).hideNativePayButton();
        com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.e k2 = this.this$0.k();
        d dVar = this.this$0;
        k2.j(dVar.f.c, dVar.J);
        return zy11.a;
    }
}
