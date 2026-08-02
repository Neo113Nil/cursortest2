package com.yandex.messaging.extension.flow;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljava/io/Closeable;", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.extension.flow.FlowKt$autoClosing$2", f = "Flow.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class FlowKt$autoClosing$2 extends SuspendLambda implements zls {
    final /* synthetic */ Ref$ObjectRef<Closeable> $lastValue;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt$autoClosing$2(Continuation continuation, Ref$ObjectRef ref$ObjectRef) {
        super(3, continuation);
        this.$lastValue = ref$ObjectRef;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowKt$autoClosing$2 flowKt$autoClosing$2 = new FlowKt$autoClosing$2((Continuation) obj3, this.$lastValue);
        zy11 zy11Var = zy11.a;
        flowKt$autoClosing$2.invokeSuspend(zy11Var);
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
        Closeable closeable = this.$lastValue.element;
        if (closeable != null) {
            closeable.close();
        }
        return zy11.a;
    }
}
