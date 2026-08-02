package com.yandex.go.taxi.order.superapp.orders;

import android.text.SpannableStringBuilder;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.taxi.order.experiments.orderdetails.OrderDetailsButtonExperiment;
import com.yandex.go.taxi.order.experiments.orderdetails.OrderDetailsDriverExperiment;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.order.models.api.experiments.PaidWaitingTimerInCardExperiment;
import com.yandex.go.taxi.order.models.api.experiments.StatusInfoTimerSourceSelectionExperiment;
import com.yandex.go.taxi.order.models.api.objects.Driver;
import com.yandex.go.taxi.order.models.api.objects.TaxiOrderAdditionalData;
import com.yandex.go.taxi.order.models.api.response.CancelRules;
import com.yandex.go.taxi.order.models.api.response.CardType;
import com.yandex.go.taxi.order.models.api.response.CheckInInfo;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import com.yandex.go.taxi.order.search.polling.model.DriverCandidate;
import com.yandex.go.taxi.order.state.search.SearchAccessibilityValues;
import defpackage.avj0;
import defpackage.ci70;
import defpackage.ctc;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.gh70;
import defpackage.gwk0;
import defpackage.h1b;
import defpackage.ief;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.lez0;
import defpackage.mqg0;
import defpackage.mvg;
import defpackage.n4h0;
import defpackage.ny61;
import defpackage.qeb1;
import defpackage.qje;
import defpackage.qn11;
import defpackage.spl0;
import defpackage.vpl0;
import defpackage.vpr;
import defpackage.wf7;
import defpackage.ww;
import defpackage.xdf;
import defpackage.xng0;
import defpackage.xw;
import defpackage.zls;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.superapp.orders.models.ActionAccessibilityType;
import ru.yandex.taxi.superapp.orders.models.ActionType;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.superapp.orders.OrderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$3", f = "OrderActionButtonsProvider.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class OrderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$3 extends SuspendLambda implements zls {
    final /* synthetic */ OrderScreen $screen$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$3(Continuation continuation, h hVar, OrderScreen orderScreen) {
        super(3, continuation);
        this.this$0 = hVar;
        this.$screen$inlined = orderScreen;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OrderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$3 orderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$3 = new OrderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$3((Continuation) obj3, this.this$0, this.$screen$inlined);
        orderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$3.L$0 = (vpr) obj;
        orderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return orderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x034c, code lost:
    
        if (r2.a != ru.yandex.taxi.superapp.orders.models.ActionType.DEAF_DRIVER) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x034e, code lost:
    
        if (r5 == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02e9, code lost:
    
        if (((com.yandex.go.taxi.order.models.api.response.typed_experiments.SearchOrderDetailsExperiment) r10.l.a.c()).getB() != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
    
        if (r11 != com.yandex.go.taxi.order.models.api.response.CardType.THREE_BUTTON) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x054c A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Iterator it;
        OrderScreen orderScreen;
        boolean z2;
        h1b h1bVar;
        h hVar;
        OrderDetailsDriverExperiment orderDetailsDriverExperiment;
        boolean z3;
        xw xwVar;
        String str;
        zuj0 zuj0Var;
        String str2;
        ww wwVar;
        boolean z4;
        String str3;
        xw xwVar2;
        CheckInInfo checkInInfo;
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Object obj7 = objArr[5];
            Object obj8 = objArr[6];
            Object obj9 = objArr[7];
            boolean booleanValue = ((Boolean) objArr[8]).booleanValue();
            OrderDetailsDriverExperiment orderDetailsDriverExperiment2 = (OrderDetailsDriverExperiment) obj9;
            SearchAccessibilityValues searchAccessibilityValues = (SearchAccessibilityValues) obj8;
            DriverCandidate driverCandidate = (DriverCandidate) obj7;
            lez0 lez0Var = (lez0) obj6;
            ((Boolean) obj5).getClass();
            h1b h1bVar2 = (h1b) obj4;
            boolean booleanValue2 = ((Boolean) obj3).booleanValue();
            TaxiOrder taxiOrder = (TaxiOrder) obj2;
            h hVar2 = this.this$0;
            OrderScreen orderScreen2 = this.$screen$inlined;
            hVar2.getClass();
            DriveState driveState = taxiOrder.h.b;
            ArrayList arrayList = new ArrayList();
            if (driveState != DriveState.CHECK_IN || (checkInInfo = taxiOrder.V().a0) == null) {
                z = booleanValue;
            } else {
                CardType cardType = checkInInfo.c.b;
                z = booleanValue;
                if (cardType != CardType.TWO_BUTTON) {
                }
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (vprVar.emit(arrayList, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            List list = (List) (orderScreen2 == OrderScreen.ORDER_DETAILS ? hVar2.t : hVar2.s).get(driveState);
            if (list == null) {
                list = EmptyList.a;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ActionType actionType = (ActionType) it2.next();
                OrderStatusInfo.TransportInfo transportInfo = taxiOrder.V().t0;
                int size = arrayList.size();
                switch (gh70.a[actionType.ordinal()]) {
                    case 1:
                        it = it2;
                        orderScreen = orderScreen2;
                        z2 = booleanValue2;
                        h1bVar = h1bVar2;
                        hVar = hVar2;
                        orderDetailsDriverExperiment = orderDetailsDriverExperiment2;
                        boolean z5 = taxiOrder.h.b == DriveState.WAITING;
                        boolean H = taxiOrder.H();
                        boolean z6 = taxiOrder.V().R;
                        double d = taxiOrder.V().N;
                        wf7.b.c(taxiOrder.V().O);
                        boolean z7 = !H && z5;
                        StatusInfoTimerSourceSelectionExperiment statusInfoTimerSourceSelectionExperiment = (StatusInfoTimerSourceSelectionExperiment) taxiOrder.V().d(StatusInfoTimerSourceSelectionExperiment.d);
                        if (statusInfoTimerSourceSelectionExperiment.b) {
                            z3 = statusInfoTimerSourceSelectionExperiment.c;
                        } else {
                            OrderStatusInfo V = taxiOrder.V();
                            qn11 qn11Var = PaidWaitingTimerInCardExperiment.f;
                            V.getClass();
                            qn11 b = V.b(PaidWaitingTimerInCardExperiment.class);
                            if (b != null) {
                                qn11Var = b;
                            }
                            z3 = ((PaidWaitingTimerInCardExperiment) qn11Var).d;
                        }
                        if (z3) {
                            int i2 = taxiOrder.H() ? n4h0.bg_button_already_comming_selected : -1;
                            ActionAccessibilityType actionAccessibilityType = taxiOrder.H() ? ActionAccessibilityType.WALKING_ROUTE : ActionAccessibilityType.CHECKBOX;
                            ActionType actionType2 = ActionType.WALK;
                            ww wwVar2 = new ww(actionType2);
                            wwVar2.b = ((avj0) hVar.d).h(actionType2.getTitleId());
                            wwVar2.g = i2;
                            wwVar2.c = lez0Var.a;
                            wwVar2.h = lez0Var.c;
                            wwVar2.i = lez0Var.d;
                            wwVar2.j = actionAccessibilityType;
                            xwVar = new xw(wwVar2);
                        } else if (z7) {
                            ActionType actionType3 = ActionType.WALK;
                            ww wwVar3 = new ww(actionType3);
                            wwVar3.b = ((avj0) hVar.d).h(actionType3.getTitleId());
                            xwVar = new xw(wwVar3);
                        } else {
                            xwVar = null;
                        }
                        if (xwVar == null) {
                            arrayList.add(xwVar);
                        }
                        hVar2 = hVar;
                        h1bVar2 = h1bVar;
                        orderDetailsDriverExperiment2 = orderDetailsDriverExperiment;
                        orderScreen2 = orderScreen;
                        it2 = it;
                        booleanValue2 = z2;
                    case 2:
                        it = it2;
                        orderScreen = orderScreen2;
                        z2 = booleanValue2;
                        h1bVar = h1bVar2;
                        hVar = hVar2;
                        orderDetailsDriverExperiment = orderDetailsDriverExperiment2;
                        CancelRules cancelRules = taxiOrder.h.a;
                        ActionType actionType4 = ActionType.CANCEL;
                        ww wwVar4 = new ww(actionType4);
                        wwVar4.k = z2 && !taxiOrder.D();
                        wwVar4.b = ((avj0) hVar.d).h(actionType4.getTitleId());
                        wwVar4.h = ((avj0) hVar.d).a(mqg0.component_cinnaban_toxic);
                        wwVar4.i = ((avj0) hVar.d).a(mqg0.component_white);
                        CancelRules.Companion.getClass();
                        if (cancelRules != null && "paid".equals(cancelRules.b) && (str = cancelRules.a) != null && str.length() != 0) {
                            if (cancelRules == null) {
                                ny61.g("Required value was null.");
                                return null;
                            }
                            if (cancelRules.a != null && taxiOrder.V().K != null) {
                                xdf xdfVar = hVar.r;
                                ief iefVar = taxiOrder.V().K;
                                if (iefVar == null) {
                                    ny61.g("Required value was null.");
                                    return null;
                                }
                                wwVar4.b = new SpannableStringBuilder(((avj0) hVar.d).h(kyh0.order_options_cancel_order)).append((CharSequence) "\n").append((CharSequence) qeb1.f(xdfVar.a(gwk0.h(iefVar), cancelRules.a, false, false), ((avj0) hVar.d).a(mqg0.component_cinnaban_toxic), 1.0f));
                                xwVar = new xw(wwVar4);
                                if (xwVar == null) {
                                }
                                hVar2 = hVar;
                                h1bVar2 = h1bVar;
                                orderDetailsDriverExperiment2 = orderDetailsDriverExperiment;
                                orderScreen2 = orderScreen;
                                it2 = it;
                                booleanValue2 = z2;
                            }
                        }
                        xwVar = new xw(wwVar4);
                        if (xwVar == null) {
                        }
                        hVar2 = hVar;
                        h1bVar2 = h1bVar;
                        orderDetailsDriverExperiment2 = orderDetailsDriverExperiment;
                        orderScreen2 = orderScreen;
                        it2 = it;
                        booleanValue2 = z2;
                        break;
                    case 3:
                        it = it2;
                        orderScreen = orderScreen2;
                        z2 = booleanValue2;
                        h1bVar = h1bVar2;
                        hVar = hVar2;
                        orderDetailsDriverExperiment = orderDetailsDriverExperiment2;
                        CheckInInfo checkInInfo2 = taxiOrder.V().a0;
                        if (checkInInfo2 != null) {
                            ww wwVar5 = new ww(ActionType.CHECK_IN_INFO);
                            wwVar5.b = checkInInfo2.b.e;
                            xwVar = new xw(wwVar5);
                            if (xwVar == null) {
                            }
                            hVar2 = hVar;
                            h1bVar2 = h1bVar;
                            orderDetailsDriverExperiment2 = orderDetailsDriverExperiment;
                            orderScreen2 = orderScreen;
                            it2 = it;
                            booleanValue2 = z2;
                        }
                        xwVar = null;
                        if (xwVar == null) {
                        }
                        hVar2 = hVar;
                        h1bVar2 = h1bVar;
                        orderDetailsDriverExperiment2 = orderDetailsDriverExperiment;
                        orderScreen2 = orderScreen;
                        it2 = it;
                        booleanValue2 = z2;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        it = it2;
                        orderScreen = orderScreen2;
                        z2 = booleanValue2;
                        h1bVar = h1bVar2;
                        h hVar3 = hVar2;
                        orderDetailsDriverExperiment = orderDetailsDriverExperiment2;
                        xwVar = hVar3.c(actionType, taxiOrder, h1bVar, orderDetailsDriverExperiment, orderScreen, size);
                        hVar = hVar3;
                        if (xwVar == null) {
                        }
                        hVar2 = hVar;
                        h1bVar2 = h1bVar;
                        orderDetailsDriverExperiment2 = orderDetailsDriverExperiment;
                        orderScreen2 = orderScreen;
                        it2 = it;
                        booleanValue2 = z2;
                        break;
                    case 7:
                        it = it2;
                        orderScreen = orderScreen2;
                        z2 = booleanValue2;
                        OrderStatusInfo V2 = taxiOrder.V();
                        OrderDetailsButtonExperiment orderDetailsButtonExperiment = OrderDetailsButtonExperiment.e;
                        OrderDetailsButtonExperiment orderDetailsButtonExperiment2 = (OrderDetailsButtonExperiment) V2.d(orderDetailsButtonExperiment);
                        DriveState driveState2 = taxiOrder.h.b;
                        if (orderDetailsButtonExperiment2 != orderDetailsButtonExperiment) {
                            if (orderDetailsButtonExperiment2.b) {
                                List list2 = orderDetailsButtonExperiment2.c;
                                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                    Iterator it3 = list2.iterator();
                                    while (it3.hasNext()) {
                                        if (jl40.l((String) it3.next(), driveState2.toString())) {
                                            xw a = hVar2.a(taxiOrder);
                                            xw b2 = hVar2.b(taxiOrder, h1bVar2);
                                            if (a != null && b2 != null) {
                                                List list3 = (List) hVar2.s.get(taxiOrder.h.b);
                                                if (list3 != null && !list3.isEmpty()) {
                                                    if (list3.size() > 4) {
                                                        ActionType actionType5 = ActionType.COMMUNICATION;
                                                        h1bVar = h1bVar2;
                                                        h hVar4 = hVar2;
                                                        orderDetailsDriverExperiment = orderDetailsDriverExperiment2;
                                                        xw c = hVar4.c(actionType5, taxiOrder, h1bVar, orderDetailsDriverExperiment, orderScreen, size);
                                                        hVar = hVar4;
                                                        boolean z8 = c != null && c.a == actionType5;
                                                        if (taxiOrder.h.b != DriveState.WAITING) {
                                                            break;
                                                        }
                                                    } else {
                                                        h1bVar = h1bVar2;
                                                        hVar = hVar2;
                                                        orderDetailsDriverExperiment = orderDetailsDriverExperiment2;
                                                    }
                                                }
                                            } else {
                                                h1bVar = h1bVar2;
                                                hVar = hVar2;
                                                orderDetailsDriverExperiment = orderDetailsDriverExperiment2;
                                            }
                                            ActionType actionType6 = ActionType.ORDER_DETAILS;
                                            ww wwVar6 = new ww(actionType6);
                                            wwVar6.b = ((avj0) hVar.d).h(actionType6.getTitleId());
                                            xwVar = new xw(wwVar6);
                                            if (xwVar == null) {
                                            }
                                            hVar2 = hVar;
                                            h1bVar2 = h1bVar;
                                            orderDetailsDriverExperiment2 = orderDetailsDriverExperiment;
                                            orderScreen2 = orderScreen;
                                            it2 = it;
                                            booleanValue2 = z2;
                                        }
                                    }
                                }
                            }
                            h1bVar = h1bVar2;
                            hVar = hVar2;
                            orderDetailsDriverExperiment = orderDetailsDriverExperiment2;
                            xwVar = null;
                            if (xwVar == null) {
                            }
                            hVar2 = hVar;
                            h1bVar2 = h1bVar;
                            orderDetailsDriverExperiment2 = orderDetailsDriverExperiment;
                            orderScreen2 = orderScreen;
                            it2 = it;
                            booleanValue2 = z2;
                        } else {
                            if (driveState2 == DriveState.SEARCH) {
                                break;
                            }
                            h1bVar = h1bVar2;
                            hVar = hVar2;
                            orderDetailsDriverExperiment = orderDetailsDriverExperiment2;
                            xwVar = null;
                            if (xwVar == null) {
                            }
                            hVar2 = hVar;
                            h1bVar2 = h1bVar;
                            orderDetailsDriverExperiment2 = orderDetailsDriverExperiment;
                            orderScreen2 = orderScreen;
                            it2 = it;
                            booleanValue2 = z2;
                        }
                        break;
                    case 8:
                        it = it2;
                        z2 = booleanValue2;
                        zuj0 zuj0Var2 = hVar2.d;
                        if (orderScreen2 != OrderScreen.ORDER_DETAILS || !orderDetailsDriverExperiment2.b) {
                            if (driverCandidate != null) {
                                String str4 = driverCandidate.f;
                                orderScreen = orderScreen2;
                                zuj0Var = zuj0Var2;
                                wwVar = new ww(ActionType.DRIVER);
                                String str5 = driverCandidate.g;
                                if (str5 == null) {
                                    str5 = "";
                                }
                                wwVar.d = str5;
                                String str6 = driverCandidate.e;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                wwVar.b = str6;
                                wwVar.c = str4 == null ? "" : str4;
                                if (str4 == null || str4.length() == 0) {
                                    str2 = "";
                                } else {
                                    str2 = "";
                                    wwVar.f = g8e.p(str4, " ", ((avj0) zuj0Var).h(kyh0.driver_rating));
                                }
                            } else {
                                orderScreen = orderScreen2;
                                zuj0Var = zuj0Var2;
                                str2 = "";
                                wwVar = null;
                            }
                            Driver driver = taxiOrder.V().g;
                            TaxiOrderAdditionalData b3 = taxiOrder.b();
                            if (!jl40.l(driver, Driver.v)) {
                                wwVar = new ww(ActionType.DRIVER);
                                String a2 = hVar2.f.a(b3.a());
                                if (a2 == null) {
                                    a2 = str2;
                                }
                                wwVar.d = a2;
                                String str7 = driver.n;
                                boolean z9 = driver.s;
                                String str8 = driver.l;
                                wwVar.b = str7;
                                wwVar.c = str8;
                                wwVar.o = z9;
                                if (str8 == null || str8.length() == 0) {
                                    z4 = z9;
                                } else {
                                    z4 = z9;
                                    wwVar.f = g8e.p(str8, " ", ((avj0) zuj0Var).h(kyh0.driver_rating));
                                }
                                if (z4) {
                                    wwVar.j = ActionAccessibilityType.NOOP_BUTTON;
                                }
                            }
                            if (wwVar != null) {
                                if (searchAccessibilityValues != null) {
                                    wwVar.e = searchAccessibilityValues.a;
                                }
                                wwVar.m = true;
                                avj0 avj0Var = (avj0) zuj0Var;
                                wwVar.h = qje.t(xng0.bgMain, avj0Var.a);
                                wwVar.i = qje.t(xng0.textMain, avj0Var.a);
                                wwVar.l = true;
                                xwVar = new xw(wwVar);
                                h1bVar = h1bVar2;
                                hVar = hVar2;
                                orderDetailsDriverExperiment = orderDetailsDriverExperiment2;
                                if (xwVar == null) {
                                }
                                hVar2 = hVar;
                                h1bVar2 = h1bVar;
                                orderDetailsDriverExperiment2 = orderDetailsDriverExperiment;
                                orderScreen2 = orderScreen;
                                it2 = it;
                                booleanValue2 = z2;
                            }
                            h1bVar = h1bVar2;
                            hVar = hVar2;
                            orderDetailsDriverExperiment = orderDetailsDriverExperiment2;
                            xwVar = null;
                            if (xwVar == null) {
                            }
                            hVar2 = hVar;
                            h1bVar2 = h1bVar;
                            orderDetailsDriverExperiment2 = orderDetailsDriverExperiment;
                            orderScreen2 = orderScreen;
                            it2 = it;
                            booleanValue2 = z2;
                        }
                        orderScreen = orderScreen2;
                        h1bVar = h1bVar2;
                        hVar = hVar2;
                        orderDetailsDriverExperiment = orderDetailsDriverExperiment2;
                        xwVar = null;
                        if (xwVar == null) {
                        }
                        hVar2 = hVar;
                        h1bVar2 = h1bVar;
                        orderDetailsDriverExperiment2 = orderDetailsDriverExperiment;
                        orderScreen2 = orderScreen;
                        it2 = it;
                        booleanValue2 = z2;
                        break;
                    case 9:
                        it = it2;
                        spl0 spl0Var = hVar2.g;
                        OrderStatusInfo V3 = taxiOrder.V();
                        com.yandex.go.safety.center.b bVar = (com.yandex.go.safety.center.b) spl0Var;
                        SafetyCenterExperiment safetyCenterExperiment = (SafetyCenterExperiment) bVar.d.c();
                        z2 = booleanValue2;
                        bVar.c.getClass();
                        vpl0 a3 = bVar.a(V3, safetyCenterExperiment, false);
                        if (a3.a) {
                            ww wwVar7 = new ww(ActionType.HELP);
                            wwVar7.b = a3.a();
                            xwVar = new xw(wwVar7);
                            orderScreen = orderScreen2;
                            h1bVar = h1bVar2;
                            hVar = hVar2;
                            orderDetailsDriverExperiment = orderDetailsDriverExperiment2;
                            if (xwVar == null) {
                            }
                            hVar2 = hVar;
                            h1bVar2 = h1bVar;
                            orderDetailsDriverExperiment2 = orderDetailsDriverExperiment;
                            orderScreen2 = orderScreen;
                            it2 = it;
                            booleanValue2 = z2;
                        }
                        orderScreen = orderScreen2;
                        h1bVar = h1bVar2;
                        hVar = hVar2;
                        orderDetailsDriverExperiment = orderDetailsDriverExperiment2;
                        xwVar = null;
                        if (xwVar == null) {
                        }
                        hVar2 = hVar;
                        h1bVar2 = h1bVar;
                        orderDetailsDriverExperiment2 = orderDetailsDriverExperiment;
                        orderScreen2 = orderScreen;
                        it2 = it;
                        booleanValue2 = z2;
                        break;
                    case 10:
                        it = it2;
                        DriveState driveState3 = taxiOrder.h.b;
                        if ((driveState3 == DriveState.TRANSPORTING || driveState3 == DriveState.DRIVING) && (str3 = taxiOrder.V().B) != null && !evu0.J(str3) && hVar2.m.b()) {
                            ActionType actionType7 = ActionType.SHARE;
                            ww wwVar8 = new ww(actionType7);
                            wwVar8.b = ((avj0) hVar2.d).h(actionType7.getTitleId());
                            xwVar2 = new xw(wwVar8);
                            orderScreen = orderScreen2;
                            xwVar = xwVar2;
                            z2 = booleanValue2;
                            h1bVar = h1bVar2;
                            hVar = hVar2;
                            orderDetailsDriverExperiment = orderDetailsDriverExperiment2;
                            if (xwVar == null) {
                            }
                            hVar2 = hVar;
                            h1bVar2 = h1bVar;
                            orderDetailsDriverExperiment2 = orderDetailsDriverExperiment;
                            orderScreen2 = orderScreen;
                            it2 = it;
                            booleanValue2 = z2;
                        }
                        orderScreen = orderScreen2;
                        z2 = booleanValue2;
                        h1bVar = h1bVar2;
                        hVar = hVar2;
                        orderDetailsDriverExperiment = orderDetailsDriverExperiment2;
                        xwVar = null;
                        if (xwVar == null) {
                        }
                        hVar2 = hVar;
                        h1bVar2 = h1bVar;
                        orderDetailsDriverExperiment2 = orderDetailsDriverExperiment;
                        orderScreen2 = orderScreen;
                        it2 = it;
                        booleanValue2 = z2;
                        break;
                    case 11:
                        it = it2;
                        if (z && size < 4) {
                            ActionType actionType8 = ActionType.MAKE_TAXI_ORDER;
                            ww wwVar9 = new ww(actionType8);
                            wwVar9.b = ((avj0) hVar2.d).h(actionType8.getTitleId());
                            xwVar2 = new xw(wwVar9);
                            orderScreen = orderScreen2;
                            xwVar = xwVar2;
                            z2 = booleanValue2;
                            h1bVar = h1bVar2;
                            hVar = hVar2;
                            orderDetailsDriverExperiment = orderDetailsDriverExperiment2;
                            if (xwVar == null) {
                            }
                            hVar2 = hVar;
                            h1bVar2 = h1bVar;
                            orderDetailsDriverExperiment2 = orderDetailsDriverExperiment;
                            orderScreen2 = orderScreen;
                            it2 = it;
                            booleanValue2 = z2;
                        }
                        orderScreen = orderScreen2;
                        z2 = booleanValue2;
                        h1bVar = h1bVar2;
                        hVar = hVar2;
                        orderDetailsDriverExperiment = orderDetailsDriverExperiment2;
                        xwVar = null;
                        if (xwVar == null) {
                        }
                        hVar2 = hVar;
                        h1bVar2 = h1bVar;
                        orderDetailsDriverExperiment2 = orderDetailsDriverExperiment;
                        orderScreen2 = orderScreen;
                        it2 = it;
                        booleanValue2 = z2;
                        break;
                    case 12:
                        if (transportInfo != null && size < 4) {
                            ActionType actionType9 = ActionType.TRANSPORT_INFO;
                            ww wwVar10 = new ww(actionType9);
                            it = it2;
                            wwVar10.b = ((avj0) hVar2.d).h(actionType9.getTitleId());
                            xwVar = new xw(wwVar10);
                            orderScreen = orderScreen2;
                            z2 = booleanValue2;
                            h1bVar = h1bVar2;
                            hVar = hVar2;
                            orderDetailsDriverExperiment = orderDetailsDriverExperiment2;
                            if (xwVar == null) {
                            }
                            hVar2 = hVar;
                            h1bVar2 = h1bVar;
                            orderDetailsDriverExperiment2 = orderDetailsDriverExperiment;
                            orderScreen2 = orderScreen;
                            it2 = it;
                            booleanValue2 = z2;
                        } else {
                            it = it2;
                            orderScreen = orderScreen2;
                            z2 = booleanValue2;
                            h1bVar = h1bVar2;
                            hVar = hVar2;
                            orderDetailsDriverExperiment = orderDetailsDriverExperiment2;
                            xwVar = null;
                            if (xwVar == null) {
                            }
                            hVar2 = hVar;
                            h1bVar2 = h1bVar;
                            orderDetailsDriverExperiment2 = orderDetailsDriverExperiment;
                            orderScreen2 = orderScreen;
                            it2 = it;
                            booleanValue2 = z2;
                        }
                        break;
                    default:
                        ny61.r("Unknown action type");
                        return null;
                }
            }
            h hVar5 = hVar2;
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                if (((xw) it4.next()).a == ActionType.COMMUNICATION && !taxiOrder.l.t) {
                    synchronized (taxiOrder) {
                        TaxiOrderLocalData taxiOrderLocalData = taxiOrder.l;
                        taxiOrderLocalData.getClass();
                        taxiOrder.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -524289, 16777215);
                    }
                    ci70 ci70Var = hVar5.i;
                    String str9 = taxiOrder.a;
                    ctc ctcVar = ci70Var.h;
                    ctcVar.getClass();
                    HashMap hashMap = new HashMap();
                    if (str9 != null) {
                        hashMap.put("order_id", str9);
                    }
                    ctcVar.a.a("CommunicationToDriverButton.Shown", hashMap, 1, new HashMap());
                }
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(arrayList, this) == coroutineSingletons) {
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
