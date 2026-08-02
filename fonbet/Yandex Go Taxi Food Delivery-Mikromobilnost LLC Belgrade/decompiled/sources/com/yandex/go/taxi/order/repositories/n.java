package com.yandex.go.taxi.order.repositories;

import android.content.Context;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.experiments.PaidWaitingTimerInCardExperiment;
import com.yandex.go.taxi.order.models.api.experiments.StatusInfoTimerSourceSelectionExperiment;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.response.StateInfo;
import com.yandex.go.taxi.order.models.api.response.StateInfoTimer;
import defpackage.avj0;
import defpackage.crg;
import defpackage.cvu0;
import defpackage.e3n;
import defpackage.ja90;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.jtq0;
import defpackage.kp50;
import defpackage.kyh0;
import defpackage.o2y0;
import defpackage.o430;
import defpackage.pvn;
import defpackage.qn11;
import defpackage.t7s;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w511;
import defpackage.xdf;
import defpackage.zuj0;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.v;

/* loaded from: classes14.dex */
public final class n {
    public final Context a;
    public final crg b;
    public final jtq0 c;
    public final zuj0 d;
    public final c e;
    public final xdf f;
    public final tt2 g;

    public n(Context context, crg crgVar, jtq0 jtq0Var, zuj0 zuj0Var, c cVar, xdf xdfVar, tt2 tt2Var) {
        this.a = context;
        this.b = crgVar;
        this.c = jtq0Var;
        this.d = zuj0Var;
        this.e = cVar;
        this.f = xdfVar;
        this.g = tt2Var;
    }

    public static final boolean b(n nVar, TaxiOrder taxiOrder, TaxiOrder taxiOrder2) {
        nVar.getClass();
        Date c = nVar.b.c(e(taxiOrder.V()));
        if ((c != null && c.getTime() >= nVar.c.d()) || nVar.g(taxiOrder)) {
            return jl40.l(e(taxiOrder.V()), e(taxiOrder2.V()));
        }
        return false;
    }

    public static final String c(n nVar, TaxiOrder taxiOrder) {
        PaidWaitingTimerInCardExperiment.FreeWaitingInTitle freeWaitingInTitle;
        String str;
        nVar.getClass();
        return (f(taxiOrder.V()).b || (freeWaitingInTitle = d(taxiOrder).e) == null || (str = freeWaitingInTitle.b) == null) ? "$time$" : str;
    }

    public static PaidWaitingTimerInCardExperiment d(TaxiOrder taxiOrder) {
        OrderStatusInfo V = taxiOrder.V();
        V.getClass();
        qn11 b = V.b(PaidWaitingTimerInCardExperiment.class);
        if (b == null) {
            b = PaidWaitingTimerInCardExperiment.f;
        }
        return (PaidWaitingTimerInCardExperiment) b;
    }

    public static String e(OrderStatusInfo orderStatusInfo) {
        boolean z = f(orderStatusInfo).b;
        StateInfo stateInfo = orderStatusInfo.Z;
        return z ? stateInfo.b.a : stateInfo.a;
    }

    public static StatusInfoTimerSourceSelectionExperiment f(OrderStatusInfo orderStatusInfo) {
        return (StatusInfoTimerSourceSelectionExperiment) orderStatusInfo.d(StatusInfoTimerSourceSelectionExperiment.d);
    }

    public final String a(long j) {
        Pattern pattern = t7s.a;
        long j2 = j / 3600;
        long j3 = j - (3600 * j2);
        long j4 = j3 / 60;
        long j5 = j3 - (60 * j4);
        String format = j2 > 0 ? String.format(Locale.getDefault(), "%1$d {hr} %2$d {min} %3$d {s}", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j4), Long.valueOf(j5)}, 3)) : j4 > 0 ? String.format(Locale.getDefault(), "%1$d {min} %2$d {s}", Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(j5)}, 2)) : String.format(Locale.getDefault(), "%d {s}", Arrays.copyOf(new Object[]{Long.valueOf(j5)}, 1));
        int i = kyh0.common_hour_sign;
        avj0 avj0Var = (avj0) this.d;
        return cvu0.v(cvu0.v(cvu0.v(format, "{hr}", avj0Var.h(i), false), "{min}", avj0Var.h(kyh0.common_minutes_sign), false), "{s}", avj0Var.h(kyh0.common_seconds_sign), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(TaxiOrder taxiOrder) {
        Date c;
        StatusInfoTimerSourceSelectionExperiment f = f(taxiOrder.V());
        StateInfoTimer stateInfoTimer = taxiOrder.V().Z.b;
        if (f.b && (c = this.b.c(stateInfoTimer.a)) != null) {
            long time = c.getTime();
            StateInfoTimer.TimerType timerType = stateInfoTimer.c;
            int i = timerType == null ? -1 : ja90.a[timerType.ordinal()];
            if (i != -1) {
                jtq0 jtq0Var = this.c;
                if (i != 1) {
                    if (i != 2) {
                        w511.b();
                        return false;
                    }
                    if (time >= jtq0Var.d()) {
                        return true;
                    }
                } else if (time <= jtq0Var.d()) {
                }
            }
        }
        return false;
    }

    public final kotlinx.coroutines.flow.n h(TaxiOrder taxiOrder, long j) {
        tpr tprVar;
        Pair pair = f(taxiOrder.V()).b ? new Pair(null, taxiOrder.V().Z.b.c) : new Pair(d(taxiOrder).b, StateInfoTimer.TimerType.UNTIL);
        PaidWaitingTimerInCardExperiment.FreeWaiting freeWaiting = (PaidWaitingTimerInCardExperiment.FreeWaiting) pair.getFirst();
        StateInfoTimer.TimerType timerType = (StateInfoTimer.TimerType) pair.getSecond();
        int i = timerType == null ? -1 : ja90.a[timerType.ordinal()];
        if (i == -1) {
            tprVar = pvn.a;
        } else if (i == 1) {
            o430 o430Var = e3n.b;
            tprVar = new jqr(new e(j, com.yandex.go.coroutines.b.l(e3n.e(kp50.U(1, DurationUnit.SECONDS))), this), new PaidWaitingTimerInCardRepository$fromTimerFlow$2(2, null), 0);
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            o430 o430Var2 = e3n.b;
            tprVar = new v(new m(j, com.yandex.go.coroutines.b.l(e3n.e(kp50.U(1, DurationUnit.SECONDS))), this), new PaidWaitingTimerInCardRepository$untilTimerFlow$2(2, null));
        }
        return new kotlinx.coroutines.flow.n(new k(tprVar, this, taxiOrder, freeWaiting), new PaidWaitingTimerInCardRepository$prepareTimer$2(this, taxiOrder, null));
    }

    public final tpr i(o2y0 o2y0Var) {
        kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.s(this.e.b(o2y0Var), new PaidWaitingTimerInCardRepository$getTimerFlowForButton$1(2, this, n.class, "distinctOrdersByTimerType", "distinctOrdersByTimerType(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;Lcom/yandex/go/taxi/order/models/api/TaxiOrder;)Z", 0)), new PaidWaitingTimerInCardRepository$getTimerFlowForButton$$inlined$flatMapLatest$1(null, this, new PaidWaitingTimerInCardRepository$timerStateFlowInButton$1(1, this, n.class, "getTimerResult", "getTimerResult(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;)Lkotlinx/coroutines/flow/Flow;", 0)));
        this.g.getClass();
        return kotlinx.coroutines.flow.e.F(X, uyj.a);
    }

    public final kotlinx.coroutines.flow.n j(o2y0 o2y0Var) {
        kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.s(new i(new g(this.e.b(o2y0Var), this), this), new PaidWaitingTimerInCardRepository$getTimerFlowForTitle$3(2, this, n.class, "distinctOrdersByTimerType", "distinctOrdersByTimerType(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;Lcom/yandex/go/taxi/order/models/api/TaxiOrder;)Z", 0)), new PaidWaitingTimerInCardRepository$getTimerFlowForTitle$$inlined$flatMapLatest$1(new PaidWaitingTimerInCardRepository$timerStateFlowInTitle$1(1, this, n.class, "getTimerResultInTitle", "getTimerResultInTitle(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;)Lkotlinx/coroutines/flow/Flow;", 0), null));
        this.g.getClass();
        return new kotlinx.coroutines.flow.n(kotlinx.coroutines.flow.e.F(X, uyj.a), new PaidWaitingTimerInCardRepository$timerStateFlowInTitle$2(2, null));
    }
}
