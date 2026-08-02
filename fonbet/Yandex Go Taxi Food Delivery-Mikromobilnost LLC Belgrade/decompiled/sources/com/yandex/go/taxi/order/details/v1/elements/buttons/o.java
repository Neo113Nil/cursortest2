package com.yandex.go.taxi.order.details.v1.elements.buttons;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import com.yandex.go.taxi.order.details.v1.elements.support.experiment.SupportOnCompleteExperiment;
import com.yandex.go.taxi.order.experiments.orderdetails.OrderDetailsDriverExperiment;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.experiments.PaidWaitingTimerInCardExperiment;
import com.yandex.go.taxi.order.models.api.experiments.StatusInfoTimerSourceSelectionExperiment;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.avj0;
import defpackage.bu0;
import defpackage.cjw0;
import defpackage.ckw0;
import defpackage.cvu0;
import defpackage.d6z;
import defpackage.evu0;
import defpackage.f1h0;
import defpackage.fh70;
import defpackage.gs70;
import defpackage.gyt0;
import defpackage.kyh0;
import defpackage.mqg0;
import defpackage.n4h0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p4j;
import defpackage.qje;
import defpackage.qn11;
import defpackage.t4j;
import defpackage.t7j;
import defpackage.tbb;
import defpackage.tcc;
import defpackage.tt;
import defpackage.tt2;
import defpackage.u7j;
import defpackage.vng;
import defpackage.xng0;
import defpackage.xw;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.superapp.orders.models.ActionAccessibilityType;
import ru.yandex.taxi.superapp.orders.models.ActionType;
import ru.yandex.taxi.widget.FormattedTextConverter$EmptyDrawable;

/* loaded from: classes14.dex */
public final class o {
    public final fh70 a;
    public final tt b;
    public final bu0 c;
    public final cjw0 d;
    public final p4j e;
    public final ru.yandex.taxi.widget.utils.e f;
    public final zuj0 g;
    public final tt2 h;
    public final o2y0 i;

    public o(gs70 gs70Var, fh70 fh70Var, tt ttVar, bu0 bu0Var, cjw0 cjw0Var, p4j p4jVar, ru.yandex.taxi.widget.utils.e eVar, zuj0 zuj0Var, tt2 tt2Var, o2y0 o2y0Var) {
        this.a = fh70Var;
        this.b = ttVar;
        this.c = bu0Var;
        this.d = cjw0Var;
        this.e = p4jVar;
        this.f = eVar;
        this.g = zuj0Var;
        this.h = tt2Var;
        this.i = o2y0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0131  */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r27v0, types: [com.yandex.go.taxi.order.details.v1.elements.buttons.o, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00a8 -> B:10:0x00ae). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(o oVar, TaxiOrder taxiOrder, OrderDetailsDriverExperiment orderDetailsDriverExperiment, List list, ContinuationImpl continuationImpl) {
        DetailsCardTopButtonsStateMapper$mapActionModels$1 detailsCardTopButtonsStateMapper$mapActionModels$1;
        int i;
        Iterator it;
        ArrayList arrayList;
        TaxiOrder taxiOrder2;
        DetailsCardTopButtonsStateMapper$mapActionModels$1 detailsCardTopButtonsStateMapper$mapActionModels$12;
        OrderDetailsDriverExperiment orderDetailsDriverExperiment2;
        t4j t4jVar;
        CharSequence charSequence;
        String h;
        String str;
        boolean z;
        ActionAccessibilityType actionAccessibilityType;
        ActionAccessibilityType actionAccessibilityType2;
        p4j p4jVar = oVar.e;
        zuj0 zuj0Var = oVar.g;
        if (continuationImpl instanceof DetailsCardTopButtonsStateMapper$mapActionModels$1) {
            detailsCardTopButtonsStateMapper$mapActionModels$1 = (DetailsCardTopButtonsStateMapper$mapActionModels$1) continuationImpl;
            int i2 = detailsCardTopButtonsStateMapper$mapActionModels$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardTopButtonsStateMapper$mapActionModels$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailsCardTopButtonsStateMapper$mapActionModels$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardTopButtonsStateMapper$mapActionModels$1.label;
                int i3 = 1;
                Object obj2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = list;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                    it = list2.iterator();
                    arrayList = arrayList2;
                    taxiOrder2 = taxiOrder;
                    detailsCardTopButtonsStateMapper$mapActionModels$12 = detailsCardTopButtonsStateMapper$mapActionModels$1;
                    orderDetailsDriverExperiment2 = orderDetailsDriverExperiment;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Collection collection = (Collection) detailsCardTopButtonsStateMapper$mapActionModels$1.L$9;
                    xw xwVar = (xw) detailsCardTopButtonsStateMapper$mapActionModels$1.L$8;
                    Iterator it2 = (Iterator) detailsCardTopButtonsStateMapper$mapActionModels$1.L$6;
                    ?? r11 = (Collection) detailsCardTopButtonsStateMapper$mapActionModels$1.L$5;
                    OrderDetailsDriverExperiment orderDetailsDriverExperiment3 = (OrderDetailsDriverExperiment) detailsCardTopButtonsStateMapper$mapActionModels$1.L$1;
                    TaxiOrder taxiOrder3 = (TaxiOrder) detailsCardTopButtonsStateMapper$mapActionModels$1.L$0;
                    kotlin.b.b(obj);
                    DetailsCardTopButtonsStateMapper$mapActionModels$1 detailsCardTopButtonsStateMapper$mapActionModels$13 = detailsCardTopButtonsStateMapper$mapActionModels$1;
                    orderDetailsDriverExperiment2 = orderDetailsDriverExperiment3;
                    Iterator it3 = it2;
                    ArrayList arrayList3 = r11;
                    xw xwVar2 = xwVar;
                    Drawable drawable = (Drawable) obj;
                    ActionType actionType = xwVar2.a;
                    int i4 = xwVar2.g;
                    CharSequence charSequence2 = xwVar2.b;
                    int[] iArr = u7j.a;
                    int i5 = iArr[actionType.ordinal()];
                    zuj0 zuj0Var2 = zuj0Var;
                    CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
                    String str2 = "";
                    if (i5 == 3) {
                        charSequence = charSequence2;
                        h = ((avj0) zuj0Var2).h(kyh0.order_options_share_route_v2);
                    } else if (i5 == 4) {
                        charSequence = charSequence2;
                        h = ((avj0) zuj0Var2).h(kyh0.order_action_communication_with_driver_v2);
                    } else if (i5 == 5) {
                        charSequence = charSequence2;
                        h = ((avj0) zuj0Var2).h(kyh0.taxiotw_call_v2);
                    } else if (i5 != 6) {
                        charSequence = charSequence2;
                        h = evu0.k0(cvu0.v(String.valueOf(charSequence2), "\n", " ", false)).toString();
                    } else {
                        charSequence = charSequence2;
                        h = "";
                    }
                    boolean z2 = orderDetailsDriverExperiment2.d.a;
                    boolean z3 = i4 == -1;
                    ActionType actionType2 = ActionType.DEAF_DRIVER;
                    int t = actionType != actionType2 ? (actionType == ActionType.WALK && z3) ? qje.t(xng0.textOnControl, ((avj0) zuj0Var2).a) : (actionType == ActionType.CALL && z2) ? qje.t(xng0.textInvert, ((avj0) zuj0Var2).a) : actionType == ActionType.TRANSPORT_INFO ? qje.t(xng0.textOnControl, ((avj0) zuj0Var2).a) : qje.t(xng0.textOnControlMinor, ((avj0) zuj0Var2).a) : qje.t(xng0.textOnControl, ((avj0) zuj0Var2).a);
                    String str3 = h;
                    int t2 = actionType != actionType2 ? (actionType == ActionType.WALK && (i4 == -1)) ? qje.t(xng0.controlMain, ((avj0) zuj0Var2).a) : (actionType == ActionType.CALL && orderDetailsDriverExperiment2.d.a) ? ((avj0) zuj0Var2).a(mqg0.component_green_toxic) : actionType == ActionType.TRANSPORT_INFO ? qje.t(xng0.controlMain, ((avj0) zuj0Var2).a) : qje.t(xng0.controlMinor, ((avj0) zuj0Var2).a) : qje.t(xng0.controlMain, ((avj0) zuj0Var2).a);
                    String str4 = xwVar2.c;
                    String str5 = str4 != null ? "" : str4;
                    String str6 = xwVar2.e;
                    if (str6 != null) {
                        str = str6;
                    } else {
                        if (charSequence != null && charSequence.length() != 0) {
                            str2 = String.valueOf(charSequence);
                        }
                        str = str2;
                    }
                    p4jVar.getClass();
                    String a = p4j.a(actionType);
                    StatusInfoTimerSourceSelectionExperiment statusInfoTimerSourceSelectionExperiment = (StatusInfoTimerSourceSelectionExperiment) taxiOrder3.V().c(StatusInfoTimerSourceSelectionExperiment.class);
                    if (statusInfoTimerSourceSelectionExperiment == null) {
                        z = statusInfoTimerSourceSelectionExperiment.c;
                    } else {
                        OrderStatusInfo V = taxiOrder3.V();
                        V.getClass();
                        qn11 b = V.b(PaidWaitingTimerInCardExperiment.class);
                        if (b == null) {
                            b = PaidWaitingTimerInCardExperiment.f;
                        }
                        z = ((PaidWaitingTimerInCardExperiment) b).d;
                    }
                    int i6 = iArr[actionType.ordinal()];
                    if (i6 == 1) {
                        if (z && taxiOrder3.H()) {
                            actionAccessibilityType = ActionAccessibilityType.WALKING_ROUTE;
                        } else {
                            if (z) {
                                actionAccessibilityType = ActionAccessibilityType.CHECKBOX;
                            }
                            actionAccessibilityType2 = null;
                        }
                        actionAccessibilityType2 = actionAccessibilityType;
                    } else {
                        if (i6 == 2 && taxiOrder3.V().g.s) {
                            actionAccessibilityType = ActionAccessibilityType.NOOP_BUTTON;
                            actionAccessibilityType2 = actionAccessibilityType;
                        }
                        actionAccessibilityType2 = null;
                    }
                    collection.add(new t4j(drawable, str3, t, t2, str5, str, a, actionAccessibilityType2, new t7j(0, oVar, xwVar2, taxiOrder3)));
                    i3 = 1;
                    detailsCardTopButtonsStateMapper$mapActionModels$12 = detailsCardTopButtonsStateMapper$mapActionModels$13;
                    arrayList = arrayList3;
                    it = it3;
                    taxiOrder2 = taxiOrder3;
                    zuj0Var = zuj0Var2;
                    coroutineSingletons = coroutineSingletons2;
                    obj2 = null;
                    if (it.hasNext()) {
                        xwVar2 = (xw) it.next();
                        detailsCardTopButtonsStateMapper$mapActionModels$12.L$0 = taxiOrder2;
                        detailsCardTopButtonsStateMapper$mapActionModels$12.L$1 = orderDetailsDriverExperiment2;
                        detailsCardTopButtonsStateMapper$mapActionModels$12.L$2 = obj2;
                        detailsCardTopButtonsStateMapper$mapActionModels$12.L$3 = obj2;
                        detailsCardTopButtonsStateMapper$mapActionModels$12.L$4 = obj2;
                        detailsCardTopButtonsStateMapper$mapActionModels$12.L$5 = arrayList;
                        detailsCardTopButtonsStateMapper$mapActionModels$12.L$6 = it;
                        detailsCardTopButtonsStateMapper$mapActionModels$12.L$7 = obj2;
                        detailsCardTopButtonsStateMapper$mapActionModels$12.L$8 = xwVar2;
                        detailsCardTopButtonsStateMapper$mapActionModels$12.L$9 = arrayList;
                        detailsCardTopButtonsStateMapper$mapActionModels$12.label = i3;
                        Object b2 = oVar.b(xwVar2, detailsCardTopButtonsStateMapper$mapActionModels$12);
                        if (b2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        taxiOrder3 = taxiOrder2;
                        obj = b2;
                        it3 = it;
                        arrayList3 = arrayList;
                        detailsCardTopButtonsStateMapper$mapActionModels$13 = detailsCardTopButtonsStateMapper$mapActionModels$12;
                        collection = arrayList3;
                        Drawable drawable2 = (Drawable) obj;
                        ActionType actionType3 = xwVar2.a;
                        int i42 = xwVar2.g;
                        CharSequence charSequence22 = xwVar2.b;
                        int[] iArr2 = u7j.a;
                        int i52 = iArr2[actionType3.ordinal()];
                        zuj0 zuj0Var22 = zuj0Var;
                        CoroutineSingletons coroutineSingletons22 = coroutineSingletons;
                        String str22 = "";
                        if (i52 == 3) {
                        }
                        boolean z22 = orderDetailsDriverExperiment2.d.a;
                        if (i42 == -1) {
                        }
                        ActionType actionType22 = ActionType.DEAF_DRIVER;
                        if (actionType3 != actionType22) {
                        }
                        String str32 = h;
                        if (actionType3 != actionType22) {
                        }
                        String str42 = xwVar2.c;
                        if (str42 != null) {
                        }
                        String str62 = xwVar2.e;
                        if (str62 != null) {
                        }
                        p4jVar.getClass();
                        String a2 = p4j.a(actionType3);
                        StatusInfoTimerSourceSelectionExperiment statusInfoTimerSourceSelectionExperiment2 = (StatusInfoTimerSourceSelectionExperiment) taxiOrder3.V().c(StatusInfoTimerSourceSelectionExperiment.class);
                        if (statusInfoTimerSourceSelectionExperiment2 == null) {
                        }
                        int i62 = iArr2[actionType3.ordinal()];
                        if (i62 == 1) {
                        }
                        collection.add(new t4j(drawable2, str32, t, t2, str5, str, a2, actionAccessibilityType2, new t7j(0, oVar, xwVar2, taxiOrder3)));
                        i3 = 1;
                        detailsCardTopButtonsStateMapper$mapActionModels$12 = detailsCardTopButtonsStateMapper$mapActionModels$13;
                        arrayList = arrayList3;
                        it = it3;
                        taxiOrder2 = taxiOrder3;
                        zuj0Var = zuj0Var22;
                        coroutineSingletons = coroutineSingletons22;
                        obj2 = null;
                        if (it.hasNext()) {
                            ArrayList arrayList4 = arrayList;
                            cjw0 cjw0Var = oVar.d;
                            tbb tbbVar = new tbb(24, oVar);
                            SupportOnCompleteExperiment a3 = ckw0.a(taxiOrder2);
                            if (a3.b) {
                                zuj0 zuj0Var3 = (zuj0) cjw0Var.c;
                                String g = cjw0Var.g(a3, taxiOrder2.a);
                                if (g != null) {
                                    int i7 = n4h0.ic_support;
                                    ContextThemeWrapper contextThemeWrapper = ((avj0) zuj0Var3).a;
                                    Drawable t3 = vng.t(i7, contextThemeWrapper);
                                    if (t3 == null) {
                                        t3 = new FormattedTextConverter$EmptyDrawable();
                                    }
                                    t4jVar = new t4j(t3, d6z.Y(a3, "button_title"), qje.t(xng0.textOnControlMinor, contextThemeWrapper), qje.u(contextThemeWrapper.getTheme(), xng0.controlMinor), d6z.Y(a3, "button_title"), "support_chat", new gyt0(21, tbbVar, g), 144);
                                    if (t4jVar != null) {
                                        return arrayList4;
                                    }
                                    p4jVar.b(t4jVar.g);
                                    return kotlin.collections.a.o0(arrayList4, t4jVar);
                                }
                            }
                            t4jVar = null;
                            if (t4jVar != null) {
                            }
                        }
                    }
                }
            }
        }
        detailsCardTopButtonsStateMapper$mapActionModels$1 = new DetailsCardTopButtonsStateMapper$mapActionModels$1(oVar, continuationImpl);
        Object obj3 = detailsCardTopButtonsStateMapper$mapActionModels$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardTopButtonsStateMapper$mapActionModels$1.label;
        int i32 = 1;
        Object obj22 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(xw xwVar, ContinuationImpl continuationImpl) {
        DetailsCardTopButtonsStateMapper$mapIcon$1 detailsCardTopButtonsStateMapper$mapIcon$1;
        int i;
        BitmapDrawable bitmapDrawable;
        if (continuationImpl instanceof DetailsCardTopButtonsStateMapper$mapIcon$1) {
            detailsCardTopButtonsStateMapper$mapIcon$1 = (DetailsCardTopButtonsStateMapper$mapIcon$1) continuationImpl;
            int i2 = detailsCardTopButtonsStateMapper$mapIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardTopButtonsStateMapper$mapIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailsCardTopButtonsStateMapper$mapIcon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardTopButtonsStateMapper$mapIcon$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (xwVar.n) {
                        String str = xwVar.d;
                        detailsCardTopButtonsStateMapper$mapIcon$1.L$0 = xwVar;
                        detailsCardTopButtonsStateMapper$mapIcon$1.label = 1;
                        obj = ru.yandex.taxi.widget.utils.e.k(this.f, str, null, detailsCardTopButtonsStateMapper$mapIcon$1, 14);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    int i3 = u7j.a[xwVar.a.ordinal()];
                    Drawable t = vng.t(i3 != 1 ? i3 != 3 ? i3 != 4 ? i3 != 7 ? i3 != 8 ? i3 != 9 ? xwVar.h : f1h0.ic_route_info : n4h0.ic_chat : f1h0.ic_safety_center_24 : n4h0.ic_communicate_with_driver : n4h0.ic_share_ride : n4h0.ic_on_my_way, ((avj0) this.g).a);
                    return t == null ? new FormattedTextConverter$EmptyDrawable() : t;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xwVar = (xw) detailsCardTopButtonsStateMapper$mapIcon$1.L$0;
                kotlin.b.b(obj);
                bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable != null) {
                    return bitmapDrawable;
                }
                int i32 = u7j.a[xwVar.a.ordinal()];
                Drawable t2 = vng.t(i32 != 1 ? i32 != 3 ? i32 != 4 ? i32 != 7 ? i32 != 8 ? i32 != 9 ? xwVar.h : f1h0.ic_route_info : n4h0.ic_chat : f1h0.ic_safety_center_24 : n4h0.ic_communicate_with_driver : n4h0.ic_share_ride : n4h0.ic_on_my_way, ((avj0) this.g).a);
                if (t2 == null) {
                }
            }
        }
        detailsCardTopButtonsStateMapper$mapIcon$1 = new DetailsCardTopButtonsStateMapper$mapIcon$1(this, continuationImpl);
        Object obj2 = detailsCardTopButtonsStateMapper$mapIcon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardTopButtonsStateMapper$mapIcon$1.label;
        if (i != 0) {
        }
        bitmapDrawable = (BitmapDrawable) obj2;
        if (bitmapDrawable != null) {
        }
        int i322 = u7j.a[xwVar.a.ordinal()];
        Drawable t22 = vng.t(i322 != 1 ? i322 != 3 ? i322 != 4 ? i322 != 7 ? i322 != 8 ? i322 != 9 ? xwVar.h : f1h0.ic_route_info : n4h0.ic_chat : f1h0.ic_safety_center_24 : n4h0.ic_communicate_with_driver : n4h0.ic_share_ride : n4h0.ic_on_my_way, ((avj0) this.g).a);
        if (t22 == null) {
        }
    }
}
