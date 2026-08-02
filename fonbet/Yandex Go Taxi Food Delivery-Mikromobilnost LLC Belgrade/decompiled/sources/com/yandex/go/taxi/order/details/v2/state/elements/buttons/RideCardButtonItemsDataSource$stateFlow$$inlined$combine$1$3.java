package com.yandex.go.taxi.order.details.v2.state.elements.buttons;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$ActionButtons;
import defpackage.bdk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.yck0;
import defpackage.zck0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.buttons.RideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$3", f = "RideCardButtonItemsDataSource.kt", l = {288}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class RideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$3 extends SuspendLambda implements zls {
    final /* synthetic */ RideCardItemDto$ActionButtons $item$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$3(Continuation continuation, RideCardItemDto$ActionButtons rideCardItemDto$ActionButtons) {
        super(3, continuation);
        this.$item$inlined = rideCardItemDto$ActionButtons;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$3 rideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$3 = new RideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$3((Continuation) obj3, this.$item$inlined);
        rideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$3.L$0 = (vpr) obj;
        rideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return rideCardButtonItemsDataSource$stateFlow$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ArrayList arrayList = new ArrayList();
            for (zck0 zck0Var : (zck0[]) objArr) {
                if (zck0Var instanceof yck0) {
                    arrayList.add(zck0Var);
                }
            }
            RideCardItemDto$ActionButtons rideCardItemDto$ActionButtons = this.$item$inlined;
            bdk0 bdk0Var = new bdk0(rideCardItemDto$ActionButtons.a, rideCardItemDto$ActionButtons.b, arrayList);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(bdk0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
