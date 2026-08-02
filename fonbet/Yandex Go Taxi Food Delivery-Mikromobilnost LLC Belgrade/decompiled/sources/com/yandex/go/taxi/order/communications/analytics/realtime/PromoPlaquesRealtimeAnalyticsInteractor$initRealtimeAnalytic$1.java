package com.yandex.go.taxi.order.communications.analytics.realtime;

import com.yandex.go.analytics.realtime.event.RealtimeEventType;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.upf0;
import defpackage.wpf0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "order", "Lcom/yandex/go/taxi/order/models/api/screen/OrderScreen;", MetaDataField.SCREEN_FIELD, "Lzy11;", "<anonymous>", "(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;Lcom/yandex/go/taxi/order/models/api/screen/OrderScreen;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.communications.analytics.realtime.PromoPlaquesRealtimeAnalyticsInteractor$initRealtimeAnalytic$1", f = "PromoPlaquesRealtimeAnalyticsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class PromoPlaquesRealtimeAnalyticsInteractor$initRealtimeAnalytic$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoPlaquesRealtimeAnalyticsInteractor$initRealtimeAnalytic$1(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PromoPlaquesRealtimeAnalyticsInteractor$initRealtimeAnalytic$1 promoPlaquesRealtimeAnalyticsInteractor$initRealtimeAnalytic$1 = new PromoPlaquesRealtimeAnalyticsInteractor$initRealtimeAnalytic$1(this.this$0, (Continuation) obj3);
        promoPlaquesRealtimeAnalyticsInteractor$initRealtimeAnalytic$1.L$0 = (TaxiOrder) obj;
        promoPlaquesRealtimeAnalyticsInteractor$initRealtimeAnalytic$1.L$1 = (OrderScreen) obj2;
        zy11 zy11Var = zy11.a;
        promoPlaquesRealtimeAnalyticsInteractor$initRealtimeAnalytic$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
        OrderScreen orderScreen = (OrderScreen) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        wpf0 wpf0Var = this.this$0.a;
        upf0 upf0Var = (upf0) wpf0Var.f.get(taxiOrder.a);
        String str = taxiOrder.a;
        DriveState driveState = taxiOrder.h.b;
        List g = taxiOrder.V().g();
        upf0 upf0Var2 = new upf0(str, driveState, g);
        wpf0Var.f.put(taxiOrder.a, upf0Var2);
        boolean l = jl40.l(upf0Var != null ? upf0Var.c : null, g);
        if (!l) {
            EnumMap enumMap = wpf0Var.i;
            for (OrderScreen orderScreen2 : enumMap.keySet()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : g) {
                    if (wpf0Var.a((CommunicationItem) obj2, orderScreen2)) {
                        arrayList.add(obj2);
                    }
                }
                enumMap.put((EnumMap) orderScreen2, (OrderScreen) arrayList);
            }
        }
        if (orderScreen != OrderScreen.DELEGATE_TO_NAV_COMMAND) {
            boolean z = orderScreen != OrderScreen.ORDER_DETAILS && upf0Var2.b == DriveState.COMPLETE;
            boolean contains = wpf0Var.k.contains(upf0Var2.b);
            if (orderScreen != wpf0Var.h) {
                wpf0Var.c();
            } else {
                if (!z && !contains) {
                    if ((upf0Var != null ? upf0Var.b : null) != upf0Var2.b) {
                        wpf0Var.c();
                    }
                }
                if (upf0Var != null && !l) {
                    List<CommunicationItem> list = upf0Var.c;
                    List list2 = upf0Var2.c;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((CommunicationItem) it.next()).a);
                    }
                    Set N0 = kotlin.collections.a.N0(arrayList2);
                    SetBuilder setBuilder = new SetBuilder();
                    for (CommunicationItem communicationItem : list) {
                        if (N0.contains(communicationItem.a)) {
                            communicationItem = null;
                        }
                        String str2 = communicationItem != null ? communicationItem.a : null;
                        if (str2 != null) {
                            setBuilder.add(str2);
                        }
                    }
                    SetBuilder b = setBuilder.b();
                    if (!b.isEmpty()) {
                        for (Set set : wpf0Var.e.values()) {
                            if (set != null) {
                                set.removeAll(b);
                            }
                        }
                    }
                }
            }
            wpf0Var.h = orderScreen;
            if (!contains) {
                List list3 = upf0Var2.c;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list3) {
                    if (wpf0Var.a((CommunicationItem) obj3, orderScreen)) {
                        arrayList3.add(obj3);
                    }
                }
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    CommunicationItem communicationItem2 = (CommunicationItem) it2.next();
                    wpf0Var.d(communicationItem2.a, communicationItem2.k, wpf0.b(taxiOrder), RealtimeEventType.Received);
                }
            }
        }
        return zy11.a;
    }
}
