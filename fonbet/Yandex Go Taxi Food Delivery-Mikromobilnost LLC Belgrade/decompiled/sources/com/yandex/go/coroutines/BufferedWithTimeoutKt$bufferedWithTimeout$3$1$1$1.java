package com.yandex.go.coroutines;

import com.yandex.go.coroutines.BufferedWithTimeoutKt$bufferedWithTimeout$3;
import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lzy11;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.coroutines.BufferedWithTimeoutKt$bufferedWithTimeout$3$1$1$1", f = "BufferedWithTimeout.kt", l = {99}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class BufferedWithTimeoutKt$bufferedWithTimeout$3$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ vpr $$this$flow;
    final /* synthetic */ ArrayList<Object> $buffer;
    final /* synthetic */ g050 $bufferMutex;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedWithTimeoutKt$bufferedWithTimeout$3$1$1$1(vpr vprVar, g050 g050Var, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.$buffer = arrayList;
        this.$$this$flow = vprVar;
        this.$bufferMutex = g050Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BufferedWithTimeoutKt$bufferedWithTimeout$3$1$1$1(this.$$this$flow, this.$bufferMutex, this.$buffer, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BufferedWithTimeoutKt$bufferedWithTimeout$3$1$1$1) create((zy11) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ArrayList<Object> arrayList = this.$buffer;
            vpr vprVar = this.$$this$flow;
            g050 g050Var = this.$bufferMutex;
            this.label = 1;
            if (BufferedWithTimeoutKt$bufferedWithTimeout$3.AnonymousClass1.i(arrayList, vprVar, g050Var, this) == coroutineSingletons) {
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
