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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.coroutines.TimerKt$timerFlow$1", f = "Timer.kt", l = {26, 28, 29}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class TimerKt$timerFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $delay;
    final /* synthetic */ long $initialDelay;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimerKt$timerFlow$1(long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.$initialDelay = j;
        this.$delay = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TimerKt$timerFlow$1 timerKt$timerFlow$1 = new TimerKt$timerFlow$1(this.$initialDelay, this.$delay, continuation);
        timerKt$timerFlow$1.L$0 = obj;
        return timerKt$timerFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TimerKt$timerFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        if (kotlinx.coroutines.a.j(r5, r8) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (r0.emit(r2, r8) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (kotlinx.coroutines.a.j(r6, r8) == r1) goto L22;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0054 -> B:12:0x0033). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    long j = this.$delay;
                    this.L$0 = vprVar;
                    this.label = 3;
                } else if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            kotlin.b.b(obj);
        } else {
            kotlin.b.b(obj);
            long j2 = this.$initialDelay;
            this.L$0 = vprVar;
            this.label = 1;
        }
        boolean p = kotlinx.coroutines.a.p(get_context());
        zy11 zy11Var = zy11.a;
        if (!p) {
            return zy11Var;
        }
        this.L$0 = vprVar;
        this.label = 2;
    }
}
