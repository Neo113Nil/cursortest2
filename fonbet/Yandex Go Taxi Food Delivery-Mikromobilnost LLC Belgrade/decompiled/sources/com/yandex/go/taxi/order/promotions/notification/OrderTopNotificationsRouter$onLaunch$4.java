package com.yandex.go.taxi.order.promotions.notification;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.totw.TotwPromotions;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.crc;
import defpackage.hg60;
import defpackage.ig60;
import defpackage.jg60;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p980;
import defpackage.q980;
import defpackage.scc;
import defpackage.t9s0;
import defpackage.tcc;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.communications.model.CommunicationItem;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "order", "Lcom/yandex/go/navigation/screen/api/Screen;", "currentScreen", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;Lcom/yandex/go/navigation/screen/api/Screen;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.promotions.notification.OrderTopNotificationsRouter$onLaunch$4", f = "OrderTopNotificationsRouter.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, 69}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderTopNotificationsRouter$onLaunch$4 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderTopNotificationsRouter$onLaunch$4(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OrderTopNotificationsRouter$onLaunch$4 orderTopNotificationsRouter$onLaunch$4 = new OrderTopNotificationsRouter$onLaunch$4(this.this$0, (Continuation) obj3);
        orderTopNotificationsRouter$onLaunch$4.L$0 = (TaxiOrder) obj;
        orderTopNotificationsRouter$onLaunch$4.L$1 = (Screen) obj2;
        return orderTopNotificationsRouter$onLaunch$4.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x01db  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00c4 -> B:26:0x00c8). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        Iterator it;
        List list2;
        Collection collection;
        a aVar;
        crc crcVar;
        a aVar2;
        Iterator it2;
        Object obj2;
        Object value;
        TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
        Screen screen = (Screen) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            TotwPromotions totwPromotions = taxiOrder.V().d0;
            if (totwPromotions == null || (crcVar = totwPromotions.b) == null || (list = crcVar.a) == null) {
                list = EmptyList.a;
            }
            List list3 = list;
            a aVar3 = this.this$0;
            ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
            it = list3.iterator();
            list2 = list;
            collection = arrayList;
            aVar = aVar3;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it2 = (Iterator) this.L$7;
                aVar2 = (a) this.L$6;
                b.b(obj);
                while (it2.hasNext()) {
                    jg60 jg60Var = (jg60) it2.next();
                    if (jg60Var instanceof hg60) {
                        hg60 hg60Var = (hg60) jg60Var;
                        aVar2.E.c(hg60Var.a);
                        r0 r0Var = aVar2.M;
                        do {
                            value = r0Var.getValue();
                        } while (!r0Var.k(value, kotlin.collections.a.j0((List) value, hg60Var.a)));
                    } else {
                        if (!(jg60Var instanceof ig60)) {
                            w511.b();
                            return null;
                        }
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = aVar2;
                        this.L$7 = it2;
                        this.L$8 = null;
                        this.L$9 = null;
                        this.L$10 = null;
                        this.label = 2;
                        if (a.P(aVar2, (ig60) jg60Var, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return zy11.a;
            }
            collection = (Collection) this.L$10;
            Iterator it3 = (Iterator) this.L$7;
            Collection collection2 = (Collection) this.L$6;
            a aVar4 = (a) this.L$4;
            List list4 = (List) this.L$2;
            b.b(obj);
            List list5 = list4;
            a aVar5 = aVar4;
            Iterator it4 = it3;
            Collection collection3 = collection2;
            Object b = obj;
            collection.add((t9s0) b);
            collection = collection3;
            it = it4;
            aVar = aVar5;
            list2 = list5;
            if (it.hasNext()) {
                CommunicationItem communicationItem = (CommunicationItem) it.next();
                ru.yandex.taxi.communications.data.a aVar6 = aVar.I;
                String str = communicationItem.a;
                this.L$0 = taxiOrder;
                this.L$1 = screen;
                this.L$2 = list2;
                this.L$3 = null;
                this.L$4 = aVar;
                this.L$5 = null;
                this.L$6 = collection;
                this.L$7 = it;
                this.L$8 = null;
                this.L$9 = null;
                this.L$10 = collection;
                this.label = 1;
                b = aVar6.b(str, this);
                if (b != coroutineSingletons) {
                    list5 = list2;
                    aVar5 = aVar;
                    it4 = it;
                    collection3 = collection;
                    collection.add((t9s0) b);
                    collection = collection3;
                    it = it4;
                    aVar = aVar5;
                    list2 = list5;
                    if (it.hasNext()) {
                        List list6 = (List) collection;
                        a aVar7 = this.this$0;
                        q980 q980Var = aVar7.J;
                        List list7 = (List) aVar7.M.getValue();
                        Set set = taxiOrder.l.U;
                        Set set2 = taxiOrder.l.P;
                        q980Var.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : list2) {
                            CommunicationItem communicationItem2 = (CommunicationItem) obj3;
                            jsq0 jsq0Var = communicationItem2.j;
                            if (jsq0Var == null || jsq0Var.contains(CommunicationItem.DisplayOnType.DETAILS) || jsq0Var.contains(CommunicationItem.DisplayOnType.DETAILS_TOP)) {
                                switch (p980.a[screen.ordinal()]) {
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                        break;
                                    case 39:
                                    case 40:
                                    case 41:
                                        break;
                                    default:
                                        w511.b();
                                        return null;
                                }
                                arrayList2.add(obj3);
                            }
                            jsq0 jsq0Var2 = communicationItem2.j;
                            if (jsq0Var2 != null ? jsq0Var2.contains(CommunicationItem.DisplayOnType.MULTIORDER) : true) {
                                switch (p980.a[screen.ordinal()]) {
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 22:
                                    case 23:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                        break;
                                    case 21:
                                    case 24:
                                        arrayList2.add(obj3);
                                        break;
                                    default:
                                        w511.b();
                                        return null;
                                }
                            } else {
                                continue;
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it5 = arrayList2.iterator();
                        while (it5.hasNext()) {
                            Object next = it5.next();
                            if (!set2.contains(((CommunicationItem) next).a)) {
                                arrayList3.add(next);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it6 = arrayList3.iterator();
                        while (it6.hasNext()) {
                            Object next2 = it6.next();
                            CommunicationItem communicationItem3 = (CommunicationItem) next2;
                            Iterator it7 = list6.iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    obj2 = it7.next();
                                    if (jl40.l(((t9s0) obj2).a, communicationItem3.a)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            t9s0 t9s0Var = (t9s0) obj2;
                            if (t9s0Var == null ? true : t9s0Var.a(communicationItem3.h, set)) {
                                arrayList4.add(next2);
                            }
                        }
                        q980Var.a.getClass();
                        ArrayList arrayList5 = new ArrayList();
                        int f = scc.f(list7);
                        int f2 = scc.f(arrayList4);
                        while (true) {
                            if (f2 < 0 && f < 0) {
                                a aVar8 = this.this$0;
                                Iterator it8 = arrayList5.iterator();
                                aVar2 = aVar8;
                                it2 = it8;
                                while (it2.hasNext()) {
                                }
                                return zy11.a;
                            }
                            String str2 = (String) kotlin.collections.a.S(f, list7);
                            CommunicationItem communicationItem4 = (CommunicationItem) kotlin.collections.a.S(f2, arrayList4);
                            if (jl40.l(communicationItem4 != null ? communicationItem4.a : null, str2)) {
                                f2--;
                            } else {
                                if (str2 == null && communicationItem4 != null) {
                                    arrayList5.add(new ig60(communicationItem4));
                                } else if (communicationItem4 == null && str2 != null) {
                                    arrayList5.add(new hg60(str2));
                                } else if (!jl40.l(communicationItem4 != null ? communicationItem4.a : null, str2) && str2 != null) {
                                    arrayList5.add(new hg60(str2));
                                } else if (!jl40.l(communicationItem4 != null ? communicationItem4.a : null, str2) && communicationItem4 != null) {
                                    arrayList5.add(new ig60(communicationItem4));
                                }
                                f2--;
                            }
                            f--;
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
    }
}
