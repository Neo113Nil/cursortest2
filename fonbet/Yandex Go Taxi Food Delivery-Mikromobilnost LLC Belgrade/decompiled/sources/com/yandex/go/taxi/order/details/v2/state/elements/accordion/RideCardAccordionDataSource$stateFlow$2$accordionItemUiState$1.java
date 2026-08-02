package com.yandex.go.taxi.order.details.v2.state.elements.accordion;

import com.yandex.go.slot.api.ui.SlotItemUiState$Trail$AccordionChevron$ChevronState;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Accordion;
import defpackage.hss0;
import defpackage.kdc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tss0;
import defpackage.u8k0;
import defpackage.w511;
import defpackage.wls;
import defpackage.xss0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxss0;", "slotItemUiState", "Lu8k0;", "<anonymous>", "(Lxss0;)Lu8k0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.accordion.RideCardAccordionDataSource$stateFlow$2$accordionItemUiState$1", f = "RideCardAccordionDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardAccordionDataSource$stateFlow$2$accordionItemUiState$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isAccordionCollapsed;
    final /* synthetic */ RideCardItemDto$Accordion $item;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardAccordionDataSource$stateFlow$2$accordionItemUiState$1(b bVar, boolean z, RideCardItemDto$Accordion rideCardItemDto$Accordion, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$isAccordionCollapsed = z;
        this.$item = rideCardItemDto$Accordion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardAccordionDataSource$stateFlow$2$accordionItemUiState$1 rideCardAccordionDataSource$stateFlow$2$accordionItemUiState$1 = new RideCardAccordionDataSource$stateFlow$2$accordionItemUiState$1(this.this$0, this.$isAccordionCollapsed, this.$item, continuation);
        rideCardAccordionDataSource$stateFlow$2$accordionItemUiState$1.L$0 = obj;
        return rideCardAccordionDataSource$stateFlow$2$accordionItemUiState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardAccordionDataSource$stateFlow$2$accordionItemUiState$1) create((xss0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SlotItemUiState$Trail$AccordionChevron$ChevronState slotItemUiState$Trail$AccordionChevron$ChevronState;
        xss0 xss0Var = (xss0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tss0 tss0Var = xss0Var.c;
        if (tss0Var instanceof hss0) {
            kdc kdcVar = ((hss0) tss0Var).a;
            b bVar = this.this$0;
            boolean z = this.$isAccordionCollapsed;
            bVar.getClass();
            if (z) {
                slotItemUiState$Trail$AccordionChevron$ChevronState = SlotItemUiState$Trail$AccordionChevron$ChevronState.DOWN;
            } else {
                if (z) {
                    w511.b();
                    return null;
                }
                slotItemUiState$Trail$AccordionChevron$ChevronState = SlotItemUiState$Trail$AccordionChevron$ChevronState.UP;
            }
            xss0Var = xss0.a(xss0Var, null, null, new hss0(kdcVar, slotItemUiState$Trail$AccordionChevron$ChevronState), null, null, 27);
        }
        RideCardItemDto$Accordion rideCardItemDto$Accordion = this.$item;
        return new u8k0(rideCardItemDto$Accordion.a, rideCardItemDto$Accordion.b, xss0Var, EmptyList.a);
    }
}
