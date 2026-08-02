package com.yandex.go.timer;

import defpackage.e3n;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.timer.TimestampRepository$timestampFlow$1", f = "TimestampRepository.kt", l = {24, 25}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class TimestampRepository$timestampFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimestampRepository$timestampFlow$1(l lVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TimestampRepository$timestampFlow$1 timestampRepository$timestampFlow$1 = new TimestampRepository$timestampFlow$1(this.this$0, continuation);
        timestampRepository$timestampFlow$1.L$0 = obj;
        return timestampRepository$timestampFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TimestampRepository$timestampFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:
    
        if (kotlinx.coroutines.a.j(r5, r7) == r1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0049 -> B:11:0x001f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                o430 o430Var = e3n.b;
                long U = kp50.U(500, DurationUnit.MILLISECONDS);
                this.L$0 = vprVar;
                this.label = 2;
            } else if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        kotlin.b.b(obj);
        Long l = new Long(this.this$0.a.d());
        this.L$0 = vprVar;
        this.label = 1;
    }
}
