package com.yandex.go.masstransit.sdk.order.impl.orders;

import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemDto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitOrdersRepository$preloadImages$2", f = "MasstransitOrdersRepository.kt", l = {321}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class MasstransitOrdersRepository$preloadImages$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<MasstransitOrderDto> $orders;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasstransitOrdersRepository$preloadImages$2(k kVar, List list, Continuation continuation) {
        super(2, continuation);
        this.$orders = list;
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MasstransitOrdersRepository$preloadImages$2 masstransitOrdersRepository$preloadImages$2 = new MasstransitOrdersRepository$preloadImages$2(this.this$0, this.$orders, continuation);
        masstransitOrdersRepository$preloadImages$2.L$0 = obj;
        return masstransitOrdersRepository$preloadImages$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MasstransitOrdersRepository$preloadImages$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List<MasstransitOrderDto> list = this.$orders;
            k kVar = this.this$0;
            ArrayList arrayList = new ArrayList();
            for (MasstransitOrderDto masstransitOrderDto : list) {
                List c = masstransitOrderDto.getC().getA().getC();
                ArrayList arrayList2 = new ArrayList(tcc.n(c, 10));
                Iterator it = c.iterator();
                while (it.hasNext()) {
                    arrayList2.add(tje.h(tseVar, null, null, new MasstransitOrdersRepository$preloadImages$2$1$details$1$1(kVar, (MasstransitSlotItemDto) it.next(), null), 3));
                }
                ycc.r(kotlin.collections.a.o0(arrayList2, tje.h(tseVar, null, null, new MasstransitOrdersRepository$preloadImages$2$1$tracking$1(kVar, masstransitOrderDto, null), 3)), arrayList);
            }
            this.L$0 = null;
            this.label = 1;
            if (kotlinx.coroutines.a.b(arrayList, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        List<MasstransitOrderDto> list2 = this.$orders;
        k kVar2 = this.this$0;
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((MasstransitOrderDto) it2.next()).getB().iterator();
            while (it3.hasNext()) {
                Iterator it4 = ((MasstransitTicketDto) it3.next()).getE().iterator();
                while (it4.hasNext()) {
                    k.b(kVar2, (MasstransitSlotItemDto) it4.next());
                }
            }
        }
        return zy11.a;
    }
}
