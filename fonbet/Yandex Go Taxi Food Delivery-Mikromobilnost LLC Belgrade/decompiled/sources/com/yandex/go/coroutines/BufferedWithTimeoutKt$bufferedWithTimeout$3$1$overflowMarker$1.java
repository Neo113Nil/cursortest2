package com.yandex.go.coroutines;

import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly6f0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.coroutines.BufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1", f = "BufferedWithTimeout.kt", l = {82}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class BufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1 extends SuspendLambda implements wls {
    final /* synthetic */ ArrayList<Object> $buffer;
    final /* synthetic */ g050 $bufferMutex;
    final /* synthetic */ int $maxBufferSize;
    final /* synthetic */ tpr $this_bufferedWithTimeout;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1(tpr tprVar, g050 g050Var, ArrayList arrayList, int i, Continuation continuation) {
        super(2, continuation);
        this.$this_bufferedWithTimeout = tprVar;
        this.$bufferMutex = g050Var;
        this.$buffer = arrayList;
        this.$maxBufferSize = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1 bufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1 = new BufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1(this.$this_bufferedWithTimeout, this.$bufferMutex, this.$buffer, this.$maxBufferSize, continuation);
        bufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1.L$0 = obj;
        return bufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr f = kotlinx.coroutines.flow.e.f(this.$this_bufferedWithTimeout, 0, null, 2);
            a aVar = new a(this.$bufferMutex, this.$buffer, this.$maxBufferSize, y6f0Var);
            this.L$0 = null;
            this.label = 1;
            if (f.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
