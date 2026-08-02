package com.yandex.go.taxi.order.multi.shortcuts;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s780;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.multi.shortcuts.OrderSummaryRouter$specifySourcePointAndShowSummary$1", f = "OrderSummaryRouter.kt", l = {141}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderSummaryRouter$specifySourcePointAndShowSummary$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $backToActiveOrder;
    final /* synthetic */ Address $destAddress;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderSummaryRouter$specifySourcePointAndShowSummary$1(f fVar, Address address, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$destAddress = address;
        this.$backToActiveOrder = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderSummaryRouter$specifySourcePointAndShowSummary$1(this.this$0, this.$destAddress, this.$backToActiveOrder, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderSummaryRouter$specifySourcePointAndShowSummary$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Address address;
        boolean z;
        f fVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        f fVar2 = this.label;
        try {
            if (fVar2 == 0) {
                kotlin.b.b(obj);
                f fVar3 = this.this$0;
                Address address2 = this.$destAddress;
                boolean z2 = this.$backToActiveOrder;
                ru.yandex.taxi.superapp.orders.multi.a aVar = fVar3.f;
                this.L$0 = fVar3;
                this.L$1 = address2;
                this.L$2 = fVar3;
                this.Z$0 = z2;
                this.label = 1;
                Object b = aVar.b(this);
                if (b == coroutineSingletons) {
                    return coroutineSingletons;
                }
                address = address2;
                z = z2;
                obj = b;
                fVar = fVar3;
                fVar2 = fVar3;
            } else {
                if (fVar2 != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = this.Z$0;
                f fVar4 = (f) this.L$2;
                address = (Address) this.L$1;
                fVar = (f) this.L$0;
                kotlin.b.b(obj);
                fVar2 = fVar4;
            }
            f.a(fVar, (ZoneAddress) obj, address, z);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            fVar2.o.b("specifySourcePointAndShowSummary", th, new s780(18));
        }
        return zy11.a;
    }
}
