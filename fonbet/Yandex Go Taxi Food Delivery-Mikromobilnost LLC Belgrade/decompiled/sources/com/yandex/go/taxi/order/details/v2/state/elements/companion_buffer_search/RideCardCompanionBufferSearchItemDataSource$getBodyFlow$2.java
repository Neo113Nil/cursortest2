package com.yandex.go.taxi.order.details.v2.state.elements.companion_buffer_search;

import com.yandex.go.slot.dto.SlotItemBodyDto;
import defpackage.irs0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lcss0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.companion_buffer_search.RideCardCompanionBufferSearchItemDataSource$getBodyFlow$2", f = "RideCardCompanionBufferSearchItemDataSource.kt", l = {74, 74}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardCompanionBufferSearchItemDataSource$getBodyFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<SlotItemBodyDto> $body;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardCompanionBufferSearchItemDataSource$getBodyFlow$2(a aVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$body = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardCompanionBufferSearchItemDataSource$getBodyFlow$2 rideCardCompanionBufferSearchItemDataSource$getBodyFlow$2 = new RideCardCompanionBufferSearchItemDataSource$getBodyFlow$2(this.this$0, this.$body, continuation);
        rideCardCompanionBufferSearchItemDataSource$getBodyFlow$2.L$0 = obj;
        return rideCardCompanionBufferSearchItemDataSource$getBodyFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardCompanionBufferSearchItemDataSource$getBodyFlow$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r7 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            irs0 irs0Var = this.this$0.a;
            List<SlotItemBodyDto> list = this.$body;
            this.L$0 = null;
            this.L$1 = vprVar;
            this.label = 1;
            obj = ((com.yandex.go.slot.mapper.a) irs0Var).k(list, null, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$1;
            b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
