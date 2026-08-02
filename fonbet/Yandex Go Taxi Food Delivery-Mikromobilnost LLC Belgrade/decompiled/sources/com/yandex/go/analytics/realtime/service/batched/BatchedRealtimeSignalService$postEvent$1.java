package com.yandex.go.analytics.realtime.service.batched;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mei0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.analytics.realtime.service.batched.BatchedRealtimeSignalService$postEvent$1", f = "BatchedRealtimeSignalService.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class BatchedRealtimeSignalService$postEvent$1 extends SuspendLambda implements wls {
    final /* synthetic */ mei0 $event;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatchedRealtimeSignalService$postEvent$1(a aVar, mei0 mei0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$event = mei0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BatchedRealtimeSignalService$postEvent$1(this.this$0, this.$event, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BatchedRealtimeSignalService$postEvent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0 || i == 1) {
            b.b(obj);
            while (true) {
                pzt0 pzt0Var = this.this$0.e;
                if (pzt0Var == null || !pzt0Var.isActive()) {
                    this.label = 1;
                    if (kotlinx.coroutines.a.i(500L, this) == coroutineSingletons) {
                        break;
                    }
                } else {
                    n0 n0Var = this.this$0.d;
                    mei0 mei0Var = this.$event;
                    this.label = 2;
                }
            }
            return coroutineSingletons;
        }
        if (i != 2) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        return zy11.a;
    }
}
