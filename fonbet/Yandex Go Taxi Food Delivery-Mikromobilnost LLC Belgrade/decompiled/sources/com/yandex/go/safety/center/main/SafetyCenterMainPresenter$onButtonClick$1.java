package com.yandex.go.safety.center.main;

import defpackage.btl0;
import defpackage.itl0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o8g0;
import defpackage.sy60;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.main.SafetyCenterMainPresenter$onButtonClick$1", f = "SafetyCenterMainPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class SafetyCenterMainPresenter$onButtonClick$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterMainPresenter$onButtonClick$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyCenterMainPresenter$onButtonClick$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SafetyCenterMainPresenter$onButtonClick$1 safetyCenterMainPresenter$onButtonClick$1 = (SafetyCenterMainPresenter$onButtonClick$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        safetyCenterMainPresenter$onButtonClick$1.invokeSuspend(zy11Var);
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
        o8g0 o8g0Var = this.this$0.G;
        btl0 btl0Var = (btl0) o8g0Var.b;
        btl0Var.A(btl0Var.K, (itl0) o8g0Var.a, sy60.Q2);
        return zy11.a;
    }
}
