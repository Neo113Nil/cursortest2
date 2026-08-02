package com.yandex.go.coroutines;

import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.coroutines.BufferedWithTimeoutKt$bufferedWithTimeout$3$1$1$2", f = "BufferedWithTimeout.kt", l = {103, 104}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class BufferedWithTimeoutKt$bufferedWithTimeout$3$1$1$2 extends SuspendLambda implements tls {
    final /* synthetic */ vpr $$this$flow;
    final /* synthetic */ ArrayList<Object> $buffer;
    final /* synthetic */ g050 $bufferMutex;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedWithTimeoutKt$bufferedWithTimeout$3$1$1$2(vpr vprVar, g050 g050Var, ArrayList arrayList, Continuation continuation) {
        super(1, continuation);
        this.$bufferMutex = g050Var;
        this.$buffer = arrayList;
        this.$$this$flow = vprVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new BufferedWithTimeoutKt$bufferedWithTimeout$3$1$1$2(this.$$this$flow, this.$bufferMutex, this.$buffer, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((BufferedWithTimeoutKt$bufferedWithTimeout$3$1$1$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (com.yandex.go.coroutines.BufferedWithTimeoutKt$bufferedWithTimeout$3.AnonymousClass1.i(r5, r1, r3, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        if (r5.a(r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g050 g050Var = this.$bufferMutex;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ArrayList<Object> arrayList = this.$buffer;
        vpr vprVar = this.$$this$flow;
        g050 g050Var2 = this.$bufferMutex;
        this.label = 2;
    }
}
