package com.yandex.go.taxi.order.details.v2.core.availability;

import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.experiments.OnlyV2RideCardExperiment;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.RideCardInfoResponse;
import com.yandex.go.taxi.order.models.api.response.g4;
import defpackage.a3y0;
import defpackage.ack0;
import defpackage.ayx0;
import defpackage.bck0;
import defpackage.bvf0;
import defpackage.ffx;
import defpackage.gck0;
import defpackage.h3y;
import defpackage.hbp0;
import defpackage.hck0;
import defpackage.hst;
import defpackage.ick0;
import defpackage.jck0;
import defpackage.jst;
import defpackage.nqi0;
import defpackage.o2y0;
import defpackage.p2y0;
import defpackage.rfk0;
import defpackage.sfk0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.ufk0;
import defpackage.vng;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes8.dex */
public final class m {
    public final ayx0 a;
    public final h3y b;
    public final h3y c;
    public final h3y d;
    public final p2y0 e;
    public final hbp0 g;
    public final r0 j;
    public final a3y0 f = new a3y0(TaxiOrderLogGroup.RIDE_CARD.getTag(), "AvailabilityRepository");
    public final ConcurrentHashMap h = new ConcurrentHashMap();
    public final n0 i = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public m(ayx0 ayx0Var, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, p2y0 p2y0Var, tt2 tt2Var) {
        this.a = ayx0Var;
        this.b = h3yVar;
        this.c = h3yVar2;
        this.d = h3yVar3;
        this.e = p2y0Var;
        this.g = new hbp0(new RideCardAvailabilityRepository$scope$1(0, tt2Var, tt2.class, "computation", "computation()Lkotlinx/coroutines/CoroutineDispatcher;", 0), "RideCardAvailabilityRepository", null, 4);
        OnlyV2RideCardExperiment.Companion.getClass();
        this.j = bvf0.c(new hck0(false, false, false, OnlyV2RideCardExperiment.e));
    }

    public final tpr a(o2y0 o2y0Var, RideCardPresentationType rideCardPresentationType) {
        return kotlinx.coroutines.flow.e.t(new b(kotlinx.coroutines.flow.e.X(vng.l(o2y0Var.a(), new nqi0(27), vng.c), new RideCardAvailabilityRepository$availabilityFlow$$inlined$flatMapLatest$1(this, null)), this, rideCardPresentationType));
    }

    public final ick0 b(TaxiOrder taxiOrder, RideCardPresentationType rideCardPresentationType) {
        boolean b;
        hck0 hck0Var = (hck0) this.j.getValue();
        OnlyV2RideCardExperiment onlyV2RideCardExperiment = hck0Var.d;
        RideCardPresentationType rideCardPresentationType2 = RideCardPresentationType.DETAILS;
        boolean z = true;
        boolean z2 = rideCardPresentationType == rideCardPresentationType2 || (onlyV2RideCardExperiment.b && onlyV2RideCardExperiment.c.contains(rideCardPresentationType));
        RideCardInfoResponse rideCardInfoResponse = taxiOrder.V().o0;
        if (rideCardInfoResponse != null && g4.c(rideCardInfoResponse)) {
            int i = jck0.a[rideCardPresentationType.ordinal()];
            b = i != 1 ? i != 2 ? true : g4.b(rideCardInfoResponse) : g4.a(rideCardInfoResponse);
        } else {
            b = false;
        }
        RideCardPresentationType rideCardPresentationType3 = RideCardPresentationType.COMPACT;
        if (rideCardPresentationType != rideCardPresentationType3 && rideCardPresentationType != rideCardPresentationType2) {
            z = false;
        }
        if (z2) {
            return new ick0(ack0.a, b ? ufk0.a : taxiOrder.h.getB() == DriveState.COMPLETE ? rfk0.a : sfk0.a);
        }
        if (!z) {
            return new ick0(new bck0(RideCardAvailability$Fallback$Reason.PRESENTATION_NOT_SUPPORTED), ufk0.a);
        }
        if (hck0Var.a && !hck0Var.c) {
            return new ick0(new bck0(RideCardAvailability$Fallback$Reason.A11Y), ufk0.a);
        }
        if (taxiOrder.J() && hck0Var.b) {
            return new ick0(ack0.a, sfk0.a);
        }
        if (taxiOrder.J()) {
            return new ick0(new bck0(RideCardAvailability$Fallback$Reason.NO_STATUS_INFO), ufk0.a);
        }
        if (b) {
            return new ick0(ack0.a, ufk0.a);
        }
        RideCardInfoResponse rideCardInfoResponse2 = taxiOrder.V().o0;
        return new ick0(new bck0(rideCardInfoResponse2 == null ? RideCardAvailability$Fallback$Reason.NO_RIDE_CARD_INFO : !g4.c(rideCardInfoResponse2) ? RideCardAvailability$Fallback$Reason.EMPTY_ITEMS : (rideCardPresentationType != rideCardPresentationType3 || g4.a(rideCardInfoResponse2)) ? (rideCardPresentationType != rideCardPresentationType2 || g4.b(rideCardInfoResponse2)) ? RideCardAvailability$Fallback$Reason.EMPTY_ITEMS : RideCardAvailability$Fallback$Reason.EMPTY_PRESENTATION_DETAILS : RideCardAvailability$Fallback$Reason.EMPTY_PRESENTATION_COMPACT), ufk0.a);
    }

    public final void c() {
        hbp0 hbp0Var = this.g;
        if (hbp0Var.d()) {
            return;
        }
        a3y0.a(this.f, new String[]{"maybeStart"}, null, 6);
        hbp0Var.f();
        hbp0.e(hbp0Var, null, null, new RideCardAvailabilityRepository$observeConfiguration$1(this, null), 3);
        hbp0.e(hbp0Var, null, null, new RideCardAvailabilityRepository$observeOrders$1(this, null), 3);
    }

    public final void d() {
        hbp0 hbp0Var = this.g;
        if (hbp0Var.d()) {
            ConcurrentHashMap concurrentHashMap = this.h;
            if (concurrentHashMap.isEmpty()) {
                a3y0.a(this.f, new String[]{"maybeStop"}, null, 6);
                hbp0Var.b();
                concurrentHashMap.clear();
            }
        }
    }

    public final ick0 e(TaxiOrder taxiOrder, RideCardPresentationType rideCardPresentationType) {
        gck0 gck0Var = (gck0) this.h.get(taxiOrder.a);
        int i = jck0.a[rideCardPresentationType.ordinal()];
        ick0 ick0Var = null;
        if (i != 1) {
            if (i == 2 && gck0Var != null) {
                ick0Var = gck0Var.b();
            }
        } else if (gck0Var != null) {
            ick0Var = gck0Var.a();
        }
        return ick0Var == null ? b(taxiOrder, rideCardPresentationType) : ick0Var;
    }

    public final void f(TaxiOrder taxiOrder) {
        ick0 b = b(taxiOrder, RideCardPresentationType.COMPACT);
        ick0 b2 = b(taxiOrder, RideCardPresentationType.DETAILS);
        String str = taxiOrder.a;
        this.h.put(str, new gck0(b, b2));
        this.f.getClass();
        a3y0.h(new String[]{"update"});
        hst hstVar = jst.e;
        this.i.g(str);
    }
}
