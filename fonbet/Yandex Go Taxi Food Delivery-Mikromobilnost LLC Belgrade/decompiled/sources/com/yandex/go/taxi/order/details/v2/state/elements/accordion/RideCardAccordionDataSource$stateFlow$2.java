package com.yandex.go.taxi.order.details.v2.state.elements.accordion;

import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.taxi.order.models.api.e;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Accordion;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.fef;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ojk0;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.u8k0;
import defpackage.wls;
import defpackage.xjk0;
import defpackage.xss0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Ltpr;", "Lu8k0;", "<anonymous>", "(Ltse;)Ltpr;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.accordion.RideCardAccordionDataSource$stateFlow$2", f = "RideCardAccordionDataSource.kt", l = {46, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardAccordionDataSource$stateFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ RideCardItemDto$Accordion $item;
    final /* synthetic */ Map<String, ojk0> $itemPool;
    final /* synthetic */ List<e> $pendingChanges;
    final /* synthetic */ SlotItemDto $slotItemDto;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lu8k0;", "accordion", "", "Lwik0;", "children", "<anonymous>", "(Lu8k0;Ljava/util/List;)Lu8k0;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.accordion.RideCardAccordionDataSource$stateFlow$2$1", f = "RideCardAccordionDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.details.v2.state.elements.accordion.RideCardAccordionDataSource$stateFlow$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(3, (Continuation) obj3);
            anonymousClass1.L$0 = (u8k0) obj;
            anonymousClass1.L$1 = (List) obj2;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            u8k0 u8k0Var = (u8k0) this.L$0;
            List list = (List) this.L$1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            String str = u8k0Var.a;
            String str2 = u8k0Var.b;
            xss0 xss0Var = u8k0Var.c;
            u8k0Var.getClass();
            return new u8k0(str, str2, xss0Var, list);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardAccordionDataSource$stateFlow$2(RideCardItemDto$Accordion rideCardItemDto$Accordion, b bVar, SlotItemDto slotItemDto, fef fefVar, Map map, List list, Continuation continuation) {
        super(2, continuation);
        this.$item = rideCardItemDto$Accordion;
        this.this$0 = bVar;
        this.$slotItemDto = slotItemDto;
        this.$currencyRules = fefVar;
        this.$itemPool = map;
        this.$pendingChanges = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardAccordionDataSource$stateFlow$2 rideCardAccordionDataSource$stateFlow$2 = new RideCardAccordionDataSource$stateFlow$2(this.$item, this.this$0, this.$slotItemDto, this.$currencyRules, this.$itemPool, this.$pendingChanges, continuation);
        rideCardAccordionDataSource$stateFlow$2.L$0 = obj;
        return rideCardAccordionDataSource$stateFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardAccordionDataSource$stateFlow$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00be, code lost:
    
        if (r15 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c0, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        if (r15 == r1) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tpr aVar;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List list = this.$item.d.a;
            Map<String, ojk0> map = this.$itemPool;
            b bVar = this.this$0;
            List<e> list2 = this.$pendingChanges;
            fef fefVar = this.$currencyRules;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ojk0 ojk0Var = map.get((String) it.next());
                qoh h = ojk0Var != null ? tje.h(tseVar, null, null, new RideCardAccordionDataSource$stateFlow$2$itemsFlow$1$1$1(bVar, ojk0Var, list2, fefVar, null), 3) : null;
                if (h != null) {
                    arrayList.add(h);
                }
            }
            this.L$0 = null;
            this.label = 1;
            obj = kotlinx.coroutines.a.b(arrayList, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = (tpr) this.L$2;
                kotlin.b.b(obj);
                return new m0((tpr) obj, aVar, new AnonymousClass1(3, null));
            }
            kotlin.b.b(obj);
        }
        aVar = new a((tpr[]) kotlin.collections.a.J0((List) obj).toArray(new tpr[0]));
        boolean booleanValue = ((Boolean) this.this$0.c.a.a.getValue()).booleanValue();
        b bVar2 = this.this$0;
        xjk0 xjk0Var = bVar2.b;
        SlotItemDto slotItemDto = this.$slotItemDto;
        fef fefVar2 = this.$currencyRules;
        RideCardAccordionDataSource$stateFlow$2$accordionItemUiState$1 rideCardAccordionDataSource$stateFlow$2$accordionItemUiState$1 = new RideCardAccordionDataSource$stateFlow$2$accordionItemUiState$1(bVar2, booleanValue, this.$item, null);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = aVar;
        this.Z$0 = booleanValue;
        this.label = 2;
        obj = xjk0Var.c(slotItemDto, fefVar2, rideCardAccordionDataSource$stateFlow$2$accordionItemUiState$1, this);
    }
}
