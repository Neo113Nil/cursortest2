package com.yandex.go.taxi.order.details.v2.state.elements.feedback.tips;

import com.yandex.go.slot.dto.SlotItemDto;
import defpackage.irs0;
import defpackage.lbk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.xss0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lxss0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.feedback.tips.RideCardTipsSelectorItemDataSource$getPreferredTipsSubscriptionFlow$1", f = "RideCardTipsSelectorItemDataSource.kt", l = {144, 151}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardTipsSelectorItemDataSource$getPreferredTipsSubscriptionFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ SlotItemDto $item;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardTipsSelectorItemDataSource$getPreferredTipsSubscriptionFlow$1(SlotItemDto slotItemDto, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$item = slotItemDto;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardTipsSelectorItemDataSource$getPreferredTipsSubscriptionFlow$1 rideCardTipsSelectorItemDataSource$getPreferredTipsSubscriptionFlow$1 = new RideCardTipsSelectorItemDataSource$getPreferredTipsSubscriptionFlow$1(this.$item, this.this$0, continuation);
        rideCardTipsSelectorItemDataSource$getPreferredTipsSubscriptionFlow$1.L$0 = obj;
        return rideCardTipsSelectorItemDataSource$getPreferredTipsSubscriptionFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardTipsSelectorItemDataSource$getPreferredTipsSubscriptionFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r0.emit(r8, r7) != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if (r8 == r1) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        xss0 xss0Var;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            SlotItemDto slotItemDto = this.$item;
            if (slotItemDto != null) {
                a aVar = this.this$0;
                irs0 irs0Var = aVar.g;
                lbk0 lbk0Var = aVar.h;
                this.L$0 = vprVar;
                this.L$1 = null;
                this.label = 1;
                obj = ((com.yandex.go.slot.mapper.a) irs0Var).e(slotItemDto, lbk0Var, false, false, null, this);
            } else {
                xss0Var = null;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11.a;
            }
            b.b(obj);
        }
        xss0Var = (xss0) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
