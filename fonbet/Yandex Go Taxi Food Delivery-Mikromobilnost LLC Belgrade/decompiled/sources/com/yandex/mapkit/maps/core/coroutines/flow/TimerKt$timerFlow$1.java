package com.yandex.mapkit.maps.core.coroutines.flow;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mapkit.maps.core.coroutines.flow.TimerKt$timerFlow$1", f = "Timer.kt", l = {11, 13, 14}, m = "invokeSuspend", v = 1)
/* loaded from: classes15.dex */
public final class TimerKt$timerFlow$1 extends SuspendLambda implements wls {

    /* renamed from: $$v$c$kotlin-time-Duration$-initialDelay$0, reason: not valid java name */
    final /* synthetic */ long f5$$v$c$kotlintimeDuration$initialDelay$0;

    /* renamed from: $$v$c$kotlin-time-Duration$-period$0, reason: not valid java name */
    final /* synthetic */ long f6$$v$c$kotlintimeDuration$period$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimerKt$timerFlow$1(long j, long j2, Continuation<? super TimerKt$timerFlow$1> continuation) {
        super(2, continuation);
        this.f5$$v$c$kotlintimeDuration$initialDelay$0 = j;
        this.f6$$v$c$kotlintimeDuration$period$0 = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        TimerKt$timerFlow$1 timerKt$timerFlow$1 = new TimerKt$timerFlow$1(this.f5$$v$c$kotlintimeDuration$initialDelay$0, this.f6$$v$c$kotlintimeDuration$period$0, continuation);
        timerKt$timerFlow$1.L$0 = obj;
        return timerKt$timerFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(vpr vprVar, Continuation<? super zy11> continuation) {
        return ((TimerKt$timerFlow$1) create(vprVar, continuation)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (kotlinx.coroutines.a.j(r5, r8) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r0.emit(defpackage.zy11.a, r8) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (kotlinx.coroutines.a.j(r6, r8) == r1) goto L20;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x004a -> B:12:0x0033). Please report as a decompilation issue!!! */
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
                    b.b(obj);
                    long j = this.f6$$v$c$kotlintimeDuration$period$0;
                    this.L$0 = vprVar;
                    this.label = 3;
                } else if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            b.b(obj);
        } else {
            b.b(obj);
            long j2 = this.f5$$v$c$kotlintimeDuration$initialDelay$0;
            this.L$0 = vprVar;
            this.label = 1;
        }
        this.L$0 = vprVar;
        this.label = 2;
    }
}
