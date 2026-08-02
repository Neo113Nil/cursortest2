package com.yandex.go.coroutines;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.coroutines.DelayKt$sampleIntermediates$2$1$1$2", f = "Delay.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class DelayKt$sampleIntermediates$2$1$1$2 extends SuspendLambda implements tls {
    final /* synthetic */ Ref$BooleanRef $hasTimeout;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelayKt$sampleIntermediates$2$1$1$2(Ref$BooleanRef ref$BooleanRef, Continuation continuation) {
        super(1, continuation);
        this.$hasTimeout = ref$BooleanRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DelayKt$sampleIntermediates$2$1$1$2(this.$hasTimeout, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        DelayKt$sampleIntermediates$2$1$1$2 delayKt$sampleIntermediates$2$1$1$2 = (DelayKt$sampleIntermediates$2$1$1$2) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        delayKt$sampleIntermediates$2$1$1$2.invokeSuspend(zy11Var);
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
        this.$hasTimeout.element = true;
        return zy11.a;
    }
}
