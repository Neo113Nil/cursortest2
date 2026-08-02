package com.yandex.go.taxi.order.details.v2.state.elements.progress_bar;

import com.yandex.go.slot.api.ui.SlotItemUiState$Size;
import defpackage.bms;
import defpackage.css0;
import defpackage.gss0;
import defpackage.mvg;
import defpackage.nqs0;
import defpackage.ny61;
import defpackage.tss0;
import defpackage.xss0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgss0;", "lead", "Lcss0;", "body", "Ltss0;", "trail", "Lxss0;", "<anonymous>", "(Lgss0;Lcss0;Ltss0;)Lxss0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.progress_bar.RideCardProgressBarItemDataSource$slotItemUiStateFlow$2", f = "RideCardProgressBarItemDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardProgressBarItemDataSource$slotItemUiStateFlow$2 extends SuspendLambda implements bms {
    final /* synthetic */ nqs0 $action;
    final /* synthetic */ SlotItemUiState$Size $size;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardProgressBarItemDataSource$slotItemUiStateFlow$2(nqs0 nqs0Var, SlotItemUiState$Size slotItemUiState$Size, Continuation continuation) {
        super(4, continuation);
        this.$action = nqs0Var;
        this.$size = slotItemUiState$Size;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        RideCardProgressBarItemDataSource$slotItemUiStateFlow$2 rideCardProgressBarItemDataSource$slotItemUiStateFlow$2 = new RideCardProgressBarItemDataSource$slotItemUiStateFlow$2(this.$action, this.$size, (Continuation) obj4);
        rideCardProgressBarItemDataSource$slotItemUiStateFlow$2.L$0 = (gss0) obj;
        rideCardProgressBarItemDataSource$slotItemUiStateFlow$2.L$1 = (css0) obj2;
        rideCardProgressBarItemDataSource$slotItemUiStateFlow$2.L$2 = (tss0) obj3;
        return rideCardProgressBarItemDataSource$slotItemUiStateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gss0 gss0Var = (gss0) this.L$0;
        css0 css0Var = (css0) this.L$1;
        tss0 tss0Var = (tss0) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return new xss0(gss0Var, css0Var, tss0Var, this.$action, this.$size);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
