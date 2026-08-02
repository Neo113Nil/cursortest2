package com.yandex.messaging.miniapps.js.listeners;

import defpackage.dqv;
import defpackage.jjs0;
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
@mvg(c = "com.yandex.messaging.miniapps.js.listeners.SetSizeListener$handle$1", f = "SetSizeListener.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class SetSizeListener$handle$1 extends SuspendLambda implements wls {
    final /* synthetic */ dqv $message;
    final /* synthetic */ jjs0 $sizeHolder;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetSizeListener$handle$1(jjs0 jjs0Var, e eVar, dqv dqvVar, Continuation continuation) {
        super(2, continuation);
        this.$sizeHolder = jjs0Var;
        this.this$0 = eVar;
        this.$message = dqvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SetSizeListener$handle$1(this.$sizeHolder, this.this$0, this.$message, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SetSizeListener$handle$1 setSizeListener$handle$1 = (SetSizeListener$handle$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        setSizeListener$handle$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tls tlsVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        jjs0 jjs0Var = this.$sizeHolder;
        if (jjs0Var != null && (tlsVar = this.this$0.i) != null) {
            tlsVar.invoke(jjs0Var);
        }
        this.this$0.h.c("csat_setSize_success", "messageId", this.$message.d);
        e eVar = this.this$0;
        eVar.f.a(eVar.g.c(this.$message.d));
        return zy11.a;
    }
}
