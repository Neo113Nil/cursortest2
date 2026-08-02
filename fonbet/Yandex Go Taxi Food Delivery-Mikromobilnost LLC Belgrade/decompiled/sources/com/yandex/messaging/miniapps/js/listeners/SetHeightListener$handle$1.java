package com.yandex.messaging.miniapps.js.listeners;

import defpackage.dqv;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.miniapps.js.listeners.SetHeightListener$handle$1", f = "SetHeightListener.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class SetHeightListener$handle$1 extends SuspendLambda implements wls {
    final /* synthetic */ Integer $height;
    final /* synthetic */ dqv $message;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetHeightListener$handle$1(Integer num, d dVar, dqv dqvVar, Continuation continuation) {
        super(2, continuation);
        this.$height = num;
        this.this$0 = dVar;
        this.$message = dqvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SetHeightListener$handle$1(this.$height, this.this$0, this.$message, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SetHeightListener$handle$1 setHeightListener$handle$1 = (SetHeightListener$handle$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        setHeightListener$handle$1.invokeSuspend(zy11Var);
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
        Integer num = this.$height;
        if (num != null) {
            d dVar = this.this$0;
            int intValue = num.intValue();
            tls tlsVar = dVar.j;
            if (tlsVar != null) {
                tlsVar.invoke(new Integer(intValue));
            }
        }
        this.this$0.i.c("csat_setHeight_success", "messageId", this.$message.d);
        d dVar2 = this.this$0;
        dVar2.g.a(dVar2.h.c(this.$message.d));
        return zy11.a;
    }
}
