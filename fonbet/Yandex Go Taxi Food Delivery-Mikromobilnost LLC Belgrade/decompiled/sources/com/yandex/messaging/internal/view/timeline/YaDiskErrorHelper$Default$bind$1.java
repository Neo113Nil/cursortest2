package com.yandex.messaging.internal.view.timeline;

import defpackage.ek51;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lek51;", "yaDiskSpaceError", "Lzy11;", "<anonymous>", "(Lek51;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.timeline.YaDiskErrorHelper$Default$bind$1", f = "YaDiskErrorHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class YaDiskErrorHelper$Default$bind$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ i0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YaDiskErrorHelper$Default$bind$1(i0 i0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = i0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        YaDiskErrorHelper$Default$bind$1 yaDiskErrorHelper$Default$bind$1 = new YaDiskErrorHelper$Default$bind$1(this.this$0, continuation);
        yaDiskErrorHelper$Default$bind$1.L$0 = obj;
        return yaDiskErrorHelper$Default$bind$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        YaDiskErrorHelper$Default$bind$1 yaDiskErrorHelper$Default$bind$1 = (YaDiskErrorHelper$Default$bind$1) create((ek51) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        yaDiskErrorHelper$Default$bind$1.invokeSuspend(zy11Var);
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
        this.this$0.w = (ek51) this.L$0;
        return zy11.a;
    }
}
