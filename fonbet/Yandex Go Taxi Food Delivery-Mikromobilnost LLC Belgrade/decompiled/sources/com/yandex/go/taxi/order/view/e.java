package com.yandex.go.taxi.order.view;

import android.content.Context;
import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.OrderScreenUtils$OrderScreenType;
import com.yandex.go.taxi.order.provider.n;
import com.yandex.go.taxi.order.provider.r;
import com.yandex.go.taxi.order.state.OrderStateView;
import com.yandex.go.zone.dto.objects.Notification;
import defpackage.a3y0;
import defpackage.a6e0;
import defpackage.a850;
import defpackage.apf;
import defpackage.b2k;
import defpackage.ci70;
import defpackage.cm70;
import defpackage.da90;
import defpackage.g18;
import defpackage.g6j;
import defpackage.h2y0;
import defpackage.jqr;
import defpackage.l9s0;
import defpackage.mjg0;
import defpackage.mth;
import defpackage.n480;
import defpackage.ney;
import defpackage.o280;
import defpackage.o2y0;
import defpackage.o480;
import defpackage.oep0;
import defpackage.p080;
import defpackage.pp70;
import defpackage.pzt0;
import defpackage.qc5;
import defpackage.rp70;
import defpackage.tdj;
import defpackage.tje;
import defpackage.tt2;
import defpackage.u580;
import defpackage.vng;
import defpackage.w511;
import defpackage.x980;
import defpackage.xl10;
import defpackage.xm7;
import defpackage.y480;
import defpackage.y641;
import defpackage.yk;
import defpackage.yvf0;
import defpackage.znj;
import java.util.ArrayDeque;
import java.util.Iterator;
import ru.yandex.taxi.altpins.order.p;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.OrderMvpView;

/* loaded from: classes14.dex */
public final class e extends qc5 {
    public final Context A;
    public final o2y0 B;
    public final tt2 C;
    public final x980 D;
    public final ci70 E;
    public final o280 F;
    public final l9s0 G;
    public final a850 H;
    public final ru.yandex.taxi.order.d I;
    public final da90 J;
    public final com.yandex.go.taxi.order.provider.a K;
    public final com.yandex.go.taxi.order.tariff_upgrade.domain.l L;
    public final h2y0 M;
    public final y641 N;
    public final p080 O;
    public final znj P;
    public final g6j Q;
    public final y480 R;
    public final yvf0 S;
    public final mjg0 T;
    public final oep0 U;
    public final a3y0 V;
    public pzt0 W;
    public g18 Z;
    public DriveState a0;
    public OrderStateView.Mode b0;

    public e(Context context, ney neyVar, o2y0 o2y0Var, tt2 tt2Var, x980 x980Var, ci70 ci70Var, o280 o280Var, l9s0 l9s0Var, a850 a850Var, ru.yandex.taxi.order.d dVar, da90 da90Var, com.yandex.go.taxi.order.provider.a aVar, com.yandex.go.taxi.order.tariff_upgrade.domain.l lVar, h2y0 h2y0Var, y641 y641Var, p080 p080Var, cm70 cm70Var, znj znjVar, g6j g6jVar, y480 y480Var, yvf0 yvf0Var, mjg0 mjg0Var, oep0 oep0Var) {
        super(OrderMvpView.class, neyVar);
        this.A = context;
        this.B = o2y0Var;
        this.C = tt2Var;
        this.D = x980Var;
        this.E = ci70Var;
        this.F = o280Var;
        this.G = l9s0Var;
        this.H = a850Var;
        this.I = dVar;
        this.J = da90Var;
        this.K = aVar;
        this.L = lVar;
        this.M = h2y0Var;
        this.N = y641Var;
        this.O = p080Var;
        this.P = znjVar;
        this.Q = g6jVar;
        this.R = y480Var;
        this.S = yvf0Var;
        this.T = mjg0Var;
        this.U = oep0Var;
        this.V = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "OrderPresenter");
        this.Z = g18.u1;
        this.b0 = OrderStateView.Mode.SINGLE;
        o480 o480Var = new o480(this);
        cm70Var.a.a.getClass();
        cm70Var.b = new xl10(o480Var);
    }

    @Override // defpackage.qc5, defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.a0 = null;
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Fg() {
        super.Fg();
        this.Z.cancel();
        pzt0 pzt0Var = this.W;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Gg() {
        super.Gg();
        o2y0 o2y0Var = this.B;
        kotlinx.coroutines.flow.internal.g a = o2y0Var.a();
        OrderPresenter$onResume$1 orderPresenter$onResume$1 = OrderPresenter$onResume$1.b;
        yk ykVar = vng.c;
        b2k l = vng.l(a, orderPresenter$onResume$1, ykVar);
        tje.N(Kg(), null, null, new OrderPresenter$onResume$$inlined$safeCollectIn$1(l, null, this, this), 3);
        o280 o280Var = this.F;
        tje.N(Kg(), null, null, new OrderPresenter$onResume$$inlined$safeCollectIn$2(new n(o280Var.a.b(o2y0Var), o280Var), null, this), 3);
        da90 da90Var = this.J;
        tje.N(Kg(), null, null, new OrderPresenter$onResume$$inlined$safeCollectIn$3(new r(da90Var.a.b(o2y0Var), da90Var), null, this), 3);
        tje.N(Kg(), null, null, new OrderPresenter$onResume$$inlined$safeCollectIn$4(this.L.d(o2y0Var), null, this), 3);
        Og();
        this.Z = this.K.b(new d(this));
        Mg();
        ((OrderMvpView) Dg()).disableFocusOnPinWhenZooming();
        ((OrderMvpView) Dg()).checkCardState();
        com.yandex.go.coroutines.b.h(Kg(), new mth(new jqr(((p) this.N).f(o2y0Var), new OrderPresenter$onResume$10(2, Dg(), OrderMvpView.class, "renderWalkingInfo", "renderWalkingInfo(Lru/yandex/taxi/order/view/walking_info/WalkingInfoUiState;)V", 4), 3), 6));
        tje.N(Kg(), null, null, new OrderPresenter$onResume$$inlined$safeCollectIn$5(new b(vng.l(o2y0Var.a(), new OrderPresenter$onResume$11(1, this.R, y480.class, "isRedesignEnabled", "isRedesignEnabled(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;)Z", 0), ykVar)), null, this), 3);
    }

    public final void Mg() {
        DriveState driveState;
        OrderStateView.Mode mode = ((e0) this.K.o()).u() ? OrderStateView.Mode.PART_OF_LIST : OrderStateView.Mode.SINGLE;
        if (this.b0 == mode) {
            return;
        }
        this.b0 = mode;
        if (Eg() && (driveState = this.a0) != null) {
            Ng((OrderMvpView) Dg(), driveState, driveState);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Ng(OrderMvpView orderMvpView, DriveState driveState, DriveState driveState2) {
        String str;
        orderMvpView.changeCardContent(driveState, driveState2, this.b0);
        int i = u580.a[OrderScreenUtils$OrderScreenType.TAXI.ordinal()];
        if (i == 1) {
            switch (u580.b[driveState2.ordinal()]) {
                case 1:
                case 2:
                    str = "taxi_scheduling";
                    break;
                case 3:
                    str = "taxi_check_in";
                    break;
                case 4:
                case 5:
                    str = "taxi_search";
                    break;
                case 6:
                    str = "taxi_driving";
                    break;
                case 7:
                    str = "taxi_waiting";
                    break;
                case 8:
                    str = "taxi_transporting";
                    break;
                case 9:
                    str = "taxi_feedback";
                    break;
            }
        } else {
            if (i != 2) {
                w511.b();
            }
            switch (u580.b[driveState2.ordinal()]) {
                case 1:
                case 2:
                    str = "feed_taxi_scheduling";
                    break;
                case 3:
                    str = "feed_taxi_check_in";
                    break;
                case 4:
                case 5:
                    str = "feed_taxi_search";
                    break;
                case 6:
                    str = "feed_taxi_driving";
                    break;
                case 7:
                    str = "feed_taxi_waiting";
                    break;
                case 8:
                    str = "feed_taxi_transporting";
                    break;
                case 9:
                    str = "feed_taxi_feedback";
                    break;
                default:
                    str = "#none#";
                    break;
            }
        }
        this.H.i(str, true);
        switch (n480.a[driveState2.ordinal()]) {
            case 1:
                orderMvpView.setState(OrderMvpView.State.PREORDER, this.b0);
                break;
            case 2:
                orderMvpView.setState(OrderMvpView.State.SEARCH, this.b0);
                break;
            case 3:
            case 4:
                orderMvpView.setState(OrderMvpView.State.SCHEDULE, this.b0);
                break;
            case 5:
            case 6:
            case 7:
                orderMvpView.setState(OrderMvpView.State.ON_THE_WAY, this.b0);
                break;
            case 8:
                apf apfVar = ((ru.yandex.taxi.order.f) this.D).C1.c;
                Iterator it = ((ArrayDeque) apfVar.c).iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    o2y0 o2y0Var = this.B;
                    if (!hasNext) {
                        tdj tdjVar = (tdj) apfVar.w;
                        if (tdjVar != null) {
                            Object obj = tdjVar.a;
                            if (o2y0Var != null ? o2y0Var == obj : obj == null) {
                                apfVar.k();
                            }
                        }
                        orderMvpView.setState(OrderMvpView.State.COMPLETE, this.b0);
                        break;
                    } else {
                        tdj tdjVar2 = (tdj) it.next();
                        if (o2y0Var == null) {
                            if (tdjVar2.a == null) {
                                it.remove();
                            }
                        } else if (o2y0Var == tdjVar2.a) {
                            it.remove();
                        }
                    }
                }
            case 9:
                orderMvpView.setState(OrderMvpView.State.CHECK_IN, this.b0);
                break;
        }
    }

    public final void Og() {
        this.F.getClass();
        o2y0 o2y0Var = this.B;
        a6e0 a = o280.a(o2y0Var.b());
        if (!Eg() || a == null) {
            return;
        }
        Notification.Type type = a.c;
        String str = a.b;
        String str2 = str + "_" + type;
        l9s0 l9s0Var = this.G;
        if (l9s0Var.a(str2, a)) {
            l9s0Var.b(str + "_" + type);
            String str3 = a.d;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = a.e;
            String str5 = str4 != null ? str4 : "";
            int i = a.g;
            rp70 rp70Var = ((ru.yandex.taxi.order.f) this.D).C1;
            rp70Var.getClass();
            tdj tdjVar = new tdj(o2y0Var);
            tdjVar.b = str3;
            tdjVar.c = str5;
            tdjVar.f = new xm7(str3, str5, i, 3);
            rp70Var.c.n(tdjVar, new pp70(o2y0Var, "poolReminder"));
        }
    }
}
