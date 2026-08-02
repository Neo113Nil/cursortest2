package com.yandex.go.places.map.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.map.ui.PinsUtilsKt$throttleFirstAndLast$1$1$1", f = "PinsUtils.kt", l = {46, 48}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PinsUtilsKt$throttleFirstAndLast$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ y6f0 $$this$channelFlow;
    final /* synthetic */ long $durationMillis;
    final /* synthetic */ Ref$LongRef $lastEmitTime;
    final /* synthetic */ Ref$ObjectRef<Object> $pendingValue;
    final /* synthetic */ long $timeSinceLastEmit;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinsUtilsKt$throttleFirstAndLast$1$1$1(long j, long j2, Ref$ObjectRef ref$ObjectRef, y6f0 y6f0Var, Ref$LongRef ref$LongRef, Continuation continuation) {
        super(2, continuation);
        this.$durationMillis = j;
        this.$timeSinceLastEmit = j2;
        this.$pendingValue = ref$ObjectRef;
        this.$$this$channelFlow = y6f0Var;
        this.$lastEmitTime = ref$LongRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PinsUtilsKt$throttleFirstAndLast$1$1$1(this.$durationMillis, this.$timeSinceLastEmit, this.$pendingValue, this.$$this$channelFlow, this.$lastEmitTime, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinsUtilsKt$throttleFirstAndLast$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
    
        if (kotlinx.coroutines.a.i(r5, r9) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$LongRef ref$LongRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            long j = this.$durationMillis - this.$timeSinceLastEmit;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$LongRef = (Ref$LongRef) this.L$0;
                kotlin.b.b(obj);
                ref$LongRef.element = System.currentTimeMillis();
                this.$pendingValue.element = null;
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        Object obj2 = this.$pendingValue.element;
        if (obj2 != null) {
            y6f0 y6f0Var = this.$$this$channelFlow;
            Ref$LongRef ref$LongRef2 = this.$lastEmitTime;
            this.L$0 = ref$LongRef2;
            this.L$1 = null;
            this.label = 2;
            if (((x6f0) y6f0Var).y.o(obj2, this) != coroutineSingletons) {
                ref$LongRef = ref$LongRef2;
                ref$LongRef.element = System.currentTimeMillis();
            }
            return coroutineSingletons;
        }
        this.$pendingValue.element = null;
        return zy11.a;
    }
}
