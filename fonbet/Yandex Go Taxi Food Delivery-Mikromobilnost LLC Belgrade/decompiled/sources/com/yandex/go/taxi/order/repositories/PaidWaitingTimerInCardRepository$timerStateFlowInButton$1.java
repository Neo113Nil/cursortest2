package com.yandex.go.taxi.order.repositories;

import android.content.Context;
import android.graphics.Color;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.experiments.PaidWaitingTimerInCardExperiment;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.response.StateInfo;
import defpackage.fef;
import defpackage.g92;
import defpackage.gwk0;
import defpackage.ief;
import defpackage.lez0;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.qje;
import defpackage.tls;
import defpackage.xdf;
import defpackage.xng0;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class PaidWaitingTimerInCardRepository$timerStateFlowInButton$1 extends FunctionReferenceImpl implements tls {
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0181  */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        String b;
        int i;
        int parseColor;
        PaidWaitingTimerInCardExperiment.State state;
        int parseColor2;
        PaidWaitingTimerInCardExperiment.State state2;
        PaidWaitingTimerInCardExperiment.FreeWaiting freeWaiting;
        TaxiOrder taxiOrder = (TaxiOrder) obj;
        n nVar = (n) this.receiver;
        nVar.getClass();
        OrderStatusInfo V = taxiOrder.V();
        Date c = nVar.b.c(n.e(V));
        if (c == null) {
            return pvn.a;
        }
        long time = c.getTime();
        if (time >= nVar.c.d()) {
            if ((n.f(taxiOrder.V()).b || (freeWaiting = n.d(taxiOrder).b) == null) ? false : freeWaiting.a) {
                return nVar.h(taxiOrder, time);
            }
        }
        if (!n.f(taxiOrder.V()).b) {
            PaidWaitingTimerInCardExperiment.PaidWaiting paidWaiting = n.d(taxiOrder).c;
            boolean z2 = paidWaiting == null;
            boolean z3 = taxiOrder.V().Z.g.intValue() == 0;
            if (!z2 && !z3) {
                if (paidWaiting == null) {
                    ny61.g("Required value was null.");
                    return null;
                }
                z = paidWaiting.a;
                if (z) {
                    return new g92(2, new lez0(0, 0, "", "", "$time$"));
                }
                StateInfo stateInfo = V.Z;
                Context context = nVar.a;
                xdf xdfVar = nVar.f;
                int intValue = stateInfo.g.intValue();
                ief iefVar = taxiOrder.V().K;
                fef h = iefVar != null ? gwk0.h(iefVar) : fef.e;
                if (n.f(taxiOrder.V()).b) {
                    b = xdfVar.b(h, Double.valueOf(intValue));
                } else {
                    PaidWaitingTimerInCardExperiment.PaidWaiting paidWaiting2 = n.d(taxiOrder).c;
                    if (paidWaiting2 == null) {
                        b = xdfVar.b(h, Double.valueOf(intValue));
                    } else {
                        PaidWaitingTimerInCardExperiment.PriceReducing priceReducing = paidWaiting2.c;
                        int i2 = priceReducing != null ? priceReducing.b : 0;
                        String str = priceReducing != null ? priceReducing.a : null;
                        if (i2 == 0 || (i = intValue / i2) < 1) {
                            b = xdfVar.b(h, Double.valueOf(intValue));
                        } else {
                            b = xdfVar.c(h, i + str, false);
                        }
                    }
                }
                String str2 = b;
                if (n.f(taxiOrder.V()).b) {
                    parseColor = qje.t(xng0.bgMain, context);
                } else {
                    PaidWaitingTimerInCardExperiment.PaidWaiting paidWaiting3 = n.d(taxiOrder).c;
                    if (((paidWaiting3 == null || (state = paidWaiting3.b) == null) ? null : state.b) == null) {
                        parseColor = qje.t(xng0.bgMain, context);
                    } else {
                        PaidWaitingTimerInCardExperiment.State state3 = paidWaiting3.b;
                        parseColor = Color.parseColor(state3 != null ? state3.b : null);
                    }
                }
                int i3 = parseColor;
                if (n.f(taxiOrder.V()).b) {
                    parseColor2 = qje.t(xng0.textMain, context);
                } else {
                    PaidWaitingTimerInCardExperiment.PaidWaiting paidWaiting4 = n.d(taxiOrder).c;
                    if (((paidWaiting4 == null || (state2 = paidWaiting4.b) == null) ? null : state2.a) == null) {
                        parseColor2 = qje.t(xng0.textMain, context);
                    } else {
                        PaidWaitingTimerInCardExperiment.State state4 = paidWaiting4.b;
                        parseColor2 = Color.parseColor(state4 != null ? state4.a : null);
                    }
                }
                return new g92(2, new lez0(i3, parseColor2, str2, str2, ""));
            }
        }
        z = false;
        if (z) {
        }
    }
}
