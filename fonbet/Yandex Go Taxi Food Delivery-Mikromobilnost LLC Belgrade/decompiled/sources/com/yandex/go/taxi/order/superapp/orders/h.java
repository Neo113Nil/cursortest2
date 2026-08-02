package com.yandex.go.taxi.order.superapp.orders;

import com.yandex.go.taxi.order.OrderCancelProcessingObserver;
import com.yandex.go.taxi.order.experiments.orderdetails.OrderDetailsDriverExperiment;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.ButtonModifierDTO;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import com.yandex.go.taxi.order.provider.chat.ChatButtonDelegate$stateObservableFlow$$inlined$flatMapLatest$1;
import defpackage.avj0;
import defpackage.ba80;
import defpackage.ci70;
import defpackage.dg7;
import defpackage.eg7;
import defpackage.fh70;
import defpackage.gs70;
import defpackage.h1b;
import defpackage.ha2;
import defpackage.iup0;
import defpackage.jgv;
import defpackage.jqr;
import defpackage.k7x0;
import defpackage.kvp0;
import defpackage.kyx0;
import defpackage.m7x0;
import defpackage.nit;
import defpackage.o2y0;
import defpackage.rol0;
import defpackage.scc;
import defpackage.spl0;
import defpackage.tpr;
import defpackage.uw40;
import defpackage.ww;
import defpackage.xdf;
import defpackage.xw;
import defpackage.yk21;
import defpackage.yu0;
import defpackage.zuj0;
import java.util.Collections;
import java.util.HashMap;
import kotlin.Pair;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.superapp.orders.models.ActionType;

/* loaded from: classes14.dex */
public final class h implements fh70 {
    public final yk21 a;
    public final com.yandex.go.taxi.order.provider.chat.c b;
    public final OrderCancelProcessingObserver c;
    public final zuj0 d;
    public final k7x0 e;
    public final jgv f;
    public final spl0 g;
    public final com.yandex.go.taxi.order.repositories.c h;
    public final ci70 i;
    public final eg7 j;
    public final com.yandex.go.taxi.order.repositories.n k;
    public final kvp0 l;
    public final ba80 m;
    public final iup0 n;
    public final gs70 o;
    public final uw40 p;
    public final kyx0 q;
    public final xdf r;
    public final HashMap s;
    public final HashMap t;

    public h(yk21 yk21Var, com.yandex.go.taxi.order.provider.chat.c cVar, OrderCancelProcessingObserver orderCancelProcessingObserver, zuj0 zuj0Var, k7x0 k7x0Var, jgv jgvVar, spl0 spl0Var, com.yandex.go.taxi.order.repositories.c cVar2, ci70 ci70Var, eg7 eg7Var, com.yandex.go.taxi.order.repositories.n nVar, kvp0 kvp0Var, ba80 ba80Var, iup0 iup0Var, gs70 gs70Var, uw40 uw40Var, kyx0 kyx0Var, xdf xdfVar) {
        this.a = yk21Var;
        this.b = cVar;
        this.c = orderCancelProcessingObserver;
        this.d = zuj0Var;
        this.e = k7x0Var;
        this.f = jgvVar;
        this.g = spl0Var;
        this.h = cVar2;
        this.i = ci70Var;
        this.j = eg7Var;
        this.k = nVar;
        this.l = kvp0Var;
        this.m = ba80Var;
        this.n = iup0Var;
        this.o = gs70Var;
        this.p = uw40Var;
        this.q = kyx0Var;
        this.r = xdfVar;
        DriveState driveState = DriveState.SCHEDULED;
        ActionType actionType = ActionType.DRIVER;
        ActionType actionType2 = ActionType.MAKE_TAXI_ORDER;
        ActionType actionType3 = ActionType.TRANSPORT_INFO;
        ActionType actionType4 = ActionType.ORDER_DETAILS;
        Pair pair = new Pair(driveState, scc.g(actionType, actionType2, actionType3, actionType4));
        DriveState driveState2 = DriveState.SCHEDULING;
        Pair pair2 = new Pair(driveState2, scc.g(actionType, actionType2, actionType3, actionType4));
        DriveState driveState3 = DriveState.PREORDER;
        ActionType actionType5 = ActionType.CANCEL;
        Pair pair3 = new Pair(driveState3, Collections.singletonList(actionType5));
        DriveState driveState4 = DriveState.CHECK_IN;
        ActionType actionType6 = ActionType.CHECK_IN_INFO;
        Pair pair4 = new Pair(driveState4, scc.g(actionType6, actionType5, actionType4));
        DriveState driveState5 = DriveState.SEARCH;
        Pair pair5 = new Pair(driveState5, scc.g(actionType, actionType5, actionType4, actionType2));
        DriveState driveState6 = DriveState.DRIVING;
        ActionType actionType7 = ActionType.COMMUNICATION;
        ActionType actionType8 = ActionType.CALL;
        ActionType actionType9 = ActionType.CHAT;
        Pair pair6 = new Pair(driveState6, scc.g(actionType, actionType7, actionType8, actionType9, actionType3, actionType4, actionType2));
        DriveState driveState7 = DriveState.WAITING;
        ActionType actionType10 = ActionType.WALK;
        Pair pair7 = new Pair(driveState7, scc.g(actionType, actionType7, actionType8, actionType9, actionType3, actionType4, actionType10, actionType2));
        DriveState driveState8 = DriveState.TRANSPORTING;
        ActionType actionType11 = ActionType.HELP;
        Pair pair8 = new Pair(driveState8, scc.g(actionType, actionType8, actionType11, actionType4, actionType7, actionType9, actionType2));
        DriveState driveState9 = DriveState.COMPLETE;
        this.s = kotlin.collections.b.h(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair(driveState9, scc.g(actionType, actionType11, actionType4)));
        Pair pair9 = new Pair(driveState, scc.g(actionType, actionType3, actionType5));
        Pair pair10 = new Pair(driveState2, scc.g(actionType, actionType3, actionType5));
        Pair pair11 = new Pair(driveState3, Collections.singletonList(actionType5));
        Pair pair12 = new Pair(driveState4, Collections.singletonList(actionType6));
        Pair pair13 = new Pair(driveState5, scc.g(actionType, actionType5, actionType2));
        ActionType actionType12 = ActionType.SHARE;
        this.t = kotlin.collections.b.h(pair9, pair10, pair11, pair12, pair13, new Pair(driveState6, scc.g(actionType, actionType8, actionType7, actionType9, actionType3, actionType12, actionType2)), new Pair(driveState7, scc.g(actionType, actionType8, actionType7, actionType9, actionType3, actionType10, actionType2)), new Pair(driveState8, scc.g(actionType11, actionType, actionType8, actionType7, actionType9, actionType12, actionType2)), new Pair(driveState9, scc.g(actionType, actionType11)));
    }

    public final xw a(TaxiOrder taxiOrder) {
        this.j.getClass();
        dg7 a = eg7.a(taxiOrder);
        ButtonModifierDTO buttonModifierDTO = a.a;
        if (!a.c) {
            return null;
        }
        ActionType actionType = buttonModifierDTO != null ? buttonModifierDTO.b : false ? ActionType.DEAF_DRIVER : ActionType.CALL;
        ww wwVar = new ww(actionType);
        String str = buttonModifierDTO != null ? buttonModifierDTO.c : null;
        if (actionType == ActionType.CALL && str != null && str.length() != 0) {
            wwVar.m = true;
            wwVar.d = ((m7x0) this.e).a(str);
        }
        String str2 = buttonModifierDTO != null ? buttonModifierDTO.e : null;
        if (str2 == null || str2.length() == 0) {
            str2 = ((avj0) this.d).h(actionType.getTitleId());
        }
        wwVar.b = str2;
        return new xw(wwVar);
    }

    public final xw b(TaxiOrder taxiOrder, h1b h1bVar) {
        if (!taxiOrder.V().R || !h1bVar.c) {
            return null;
        }
        ActionType actionType = ActionType.CHAT;
        ww wwVar = new ww(actionType);
        wwVar.b = ((avj0) this.d).h(actionType.getTitleId());
        int i = h1bVar.b;
        wwVar.c = i == 0 ? "" : i == -1 ? "!" : i > 10 ? "*" : String.valueOf(i);
        return new xw(wwVar);
    }

    public final xw c(ActionType actionType, TaxiOrder taxiOrder, h1b h1bVar, OrderDetailsDriverExperiment orderDetailsDriverExperiment, OrderScreen orderScreen, int i) {
        xw a = a(taxiOrder);
        xw b = b(taxiOrder, h1bVar);
        boolean z = orderScreen == OrderScreen.ORDER_DETAILS;
        boolean z2 = orderDetailsDriverExperiment.d.b;
        if (i >= 4) {
            return null;
        }
        ActionType actionType2 = ActionType.CALL;
        if (actionType == actionType2 && (b == null || (z && z2))) {
            return a;
        }
        if (actionType == ActionType.CHAT && (a == null || a.a == ActionType.DEAF_DRIVER || (z && z2))) {
            return b;
        }
        if (actionType == actionType2 && a != null && a.a == ActionType.DEAF_DRIVER) {
            return a;
        }
        ActionType actionType3 = ActionType.COMMUNICATION;
        if (actionType != actionType3 || a == null || a.a == ActionType.DEAF_DRIVER || b == null) {
            return null;
        }
        if ((!z || z2) && orderDetailsDriverExperiment.b && z) {
            return null;
        }
        ww wwVar = new ww(actionType3);
        wwVar.b = ((avj0) this.d).h(actionType3.getTitleId());
        String str = b.c;
        if (str == null) {
            str = "";
        }
        wwVar.c = str;
        return new xw(wwVar);
    }

    public final c d(o2y0 o2y0Var, OrderScreen orderScreen) {
        com.yandex.go.taxi.order.domain.repositories.n nVar = (com.yandex.go.taxi.order.domain.repositories.n) this.n;
        kotlinx.coroutines.flow.n nVar2 = new kotlinx.coroutines.flow.n(new e(nVar.h(o2y0Var)), new OrderActionButtonsProvider$orderActionsFlow$candidateFlow$2(2, null));
        kotlinx.coroutines.flow.n nVar3 = new kotlinx.coroutines.flow.n(new g(nVar.h(o2y0Var)), new OrderActionButtonsProvider$orderActionsFlow$accessibilityValuesFlow$2(2, null));
        rol0 rol0Var = new rol0(new OrderActionButtonsProvider$orderActionsFlow$orderDetailsDriverExperimentFlow$1(this, o2y0Var, null));
        ha2 n = kotlinx.coroutines.flow.e.n(o2y0Var.a(), new kotlinx.coroutines.flow.n(this.p.d, new OrderActionButtonsProvider$orderActionsFlow$makeAnotherTaxiOrderButtonFlow$1(this, null)), this.q.a.a(), new OrderActionButtonsProvider$orderActionsFlow$makeAnotherTaxiOrderButtonFlow$2(orderScreen, null));
        jqr b = this.h.b(o2y0Var);
        kotlinx.coroutines.flow.n nVar4 = new kotlinx.coroutines.flow.n(new b(this.c.a, o2y0Var), new OrderActionButtonsProvider$orderActionsFlow$orderActionsFlow$1(2, null));
        com.yandex.go.taxi.order.provider.chat.c cVar = this.b;
        cVar.getClass();
        return new c(new tpr[]{b, nVar4, kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new com.yandex.go.taxi.order.provider.chat.b(o2y0Var.a())), new ChatButtonDelegate$stateObservableFlow$$inlined$flatMapLatest$1(cVar, null)), (tpr) this.a.a.computeIfAbsent(o2y0Var, new yu0(27, new nit(6, o2y0Var))), this.k.i(o2y0Var), nVar2, nVar3, rol0Var, new kotlinx.coroutines.flow.n(n, new OrderActionButtonsProvider$orderActionsFlow$orderActionsFlow$2(2, null))}, this, orderScreen);
    }
}
