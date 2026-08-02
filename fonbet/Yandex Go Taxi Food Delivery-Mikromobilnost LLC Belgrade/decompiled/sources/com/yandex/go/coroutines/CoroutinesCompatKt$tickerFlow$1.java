package com.yandex.go.coroutines;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.coroutines.CoroutinesCompatKt$tickerFlow$1", f = "CoroutinesCompat.kt", l = {253, 254, 256, 257}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CoroutinesCompatKt$tickerFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $initialDelayMs;
    final /* synthetic */ long $periodMs;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesCompatKt$tickerFlow$1(long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.$initialDelayMs = j;
        this.$periodMs = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CoroutinesCompatKt$tickerFlow$1 coroutinesCompatKt$tickerFlow$1 = new CoroutinesCompatKt$tickerFlow$1(this.$initialDelayMs, this.$periodMs, continuation);
        coroutinesCompatKt$tickerFlow$1.L$0 = obj;
        return coroutinesCompatKt$tickerFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CoroutinesCompatKt$tickerFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0085, code lost:
    
        if (kotlinx.coroutines.a.i(r5, r11) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a0, code lost:
    
        if (r0.emit(r12, r11) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r0.emit(r12, r11) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x00a0 -> B:8:0x006f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$LongRef ref$LongRef;
        long j;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Ref$LongRef ref$LongRef2 = new Ref$LongRef();
            long j2 = this.$initialDelayMs;
            this.L$0 = vprVar;
            this.L$1 = ref$LongRef2;
            this.label = 1;
            if (kotlinx.coroutines.a.i(j2, this) != coroutineSingletons) {
                ref$LongRef = ref$LongRef2;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ref$LongRef = (Ref$LongRef) this.L$1;
            kotlin.b.b(obj);
        } else if (i == 2) {
            ref$LongRef = (Ref$LongRef) this.L$1;
            kotlin.b.b(obj);
            j = this.$periodMs;
            if (kotlinx.coroutines.a.p(get_context())) {
            }
        } else if (i == 3) {
            j = this.J$0;
            ref$LongRef = (Ref$LongRef) this.L$1;
            kotlin.b.b(obj);
            long j3 = ref$LongRef.element + 1;
            ref$LongRef.element = j3;
            Long l = new Long(j3);
            this.L$0 = vprVar;
            this.L$1 = ref$LongRef;
            this.J$0 = j;
            this.label = 4;
        } else {
            if (i != 4) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.J$0;
            ref$LongRef = (Ref$LongRef) this.L$1;
            kotlin.b.b(obj);
            if (kotlinx.coroutines.a.p(get_context())) {
                return zy11.a;
            }
            this.L$0 = vprVar;
            this.L$1 = ref$LongRef;
            this.J$0 = j;
            this.label = 3;
        }
        Long l2 = new Long(ref$LongRef.element);
        this.L$0 = vprVar;
        this.L$1 = ref$LongRef;
        this.label = 2;
    }
}
