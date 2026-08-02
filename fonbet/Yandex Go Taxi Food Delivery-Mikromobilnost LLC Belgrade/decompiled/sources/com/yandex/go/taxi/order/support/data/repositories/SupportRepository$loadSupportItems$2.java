package com.yandex.go.taxi.order.support.data.repositories;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.ride_support.OrderRideSupportNotification;
import defpackage.ijw0;
import defpackage.kjw0;
import defpackage.mdh;
import defpackage.mjw0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.ujw0;
import defpackage.uyj;
import defpackage.vjw0;
import defpackage.wls;
import defpackage.xh60;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "order", "Lkotlin/Pair;", "", "Lwjw0;", "<anonymous>", "(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.support.data.repositories.SupportRepository$loadSupportItems$2", f = "SupportRepository.kt", l = {64, 65}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SupportRepository$loadSupportItems$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportRepository$loadSupportItems$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SupportRepository$loadSupportItems$2 supportRepository$loadSupportItems$2 = new SupportRepository$loadSupportItems$2(this.this$0, continuation);
        supportRepository$loadSupportItems$2.L$0 = obj;
        return supportRepository$loadSupportItems$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SupportRepository$loadSupportItems$2) create((TaxiOrder) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0053, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        kjw0 kjw0Var;
        Object ujw0Var;
        TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            xh60 b = taxiOrder.V().P.b("order_support_notification");
            if (b == null) {
                return null;
            }
            com.yandex.go.taxi.order.support.data.mappers.b bVar = this.this$0.c;
            OrderRideSupportNotification orderRideSupportNotification = (OrderRideSupportNotification) b.b;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = bVar.a(orderRideSupportNotification, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = (a) this.L$3;
                kjw0Var = (kjw0) this.L$2;
                b.b(obj);
                aVar.g = (noh) obj;
                String str = kjw0Var != null ? kjw0Var.c : null;
                this.this$0.getClass();
                if (kjw0Var != null) {
                    ujw0Var = vjw0.a;
                } else {
                    String str2 = kjw0Var.a;
                    String str3 = kjw0Var.b;
                    List list = kjw0Var.d;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new mjw0((ijw0) it.next()));
                    }
                    ujw0Var = new ujw0(str2, str3, arrayList);
                }
                return new Pair(str, ujw0Var);
            }
            b.b(obj);
        }
        kjw0 kjw0Var2 = (kjw0) obj;
        aVar = this.this$0;
        List list2 = kjw0Var2 != null ? kjw0Var2.d : null;
        if (list2 == null) {
            list2 = EmptyList.a;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = kjw0Var2;
        this.L$3 = aVar;
        this.label = 2;
        aVar.b.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new SupportRepository$buildSupportActionsMap$2(list2, null), this);
        if (k0 != coroutineSingletons) {
            kjw0Var = kjw0Var2;
            obj = k0;
            aVar.g = (noh) obj;
            if (kjw0Var != null) {
            }
            this.this$0.getClass();
            if (kjw0Var != null) {
            }
            return new Pair(str, ujw0Var);
        }
        return coroutineSingletons;
    }
}
