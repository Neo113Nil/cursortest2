package com.yandex.go.order.external;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v5c;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.order.external.ClosedOrderRepository$addClosedOrder$1", f = "ClosedOrderRepository.kt", l = {29, 31}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ClosedOrderRepository$addClosedOrder$1 extends SuspendLambda implements wls {
    final /* synthetic */ v5c $closedOrder;
    final /* synthetic */ long $closedTime;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClosedOrderRepository$addClosedOrder$1(a aVar, v5c v5cVar, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$closedOrder = v5cVar;
        this.$closedTime = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ClosedOrderRepository$addClosedOrder$1(this.this$0, this.$closedOrder, this.$closedTime, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ClosedOrderRepository$addClosedOrder$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r7.b(r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        if (com.yandex.go.order.external.a.a(r7, r6) == r0) goto L15;
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
            a aVar = this.this$0;
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
        this.this$0.d.put(this.$closedOrder, new Long(this.$closedTime));
        a aVar2 = this.this$0;
        this.label = 2;
    }
}
