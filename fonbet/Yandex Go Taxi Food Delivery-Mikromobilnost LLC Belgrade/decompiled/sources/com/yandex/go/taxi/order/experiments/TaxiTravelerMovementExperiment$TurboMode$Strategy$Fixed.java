package com.yandex.go.taxi.order.experiments;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/experiments/TaxiTravelerMovementExperiment$TurboMode$Strategy$Fixed", "Lcom/yandex/go/taxi/order/experiments/r;", "Companion", "$serializer", "com/yandex/go/taxi/order/experiments/o", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TaxiTravelerMovementExperiment$TurboMode$Strategy$Fixed extends r {
    public static final o Companion = new o();
    public final Double a;
    public final Double b;

    public TaxiTravelerMovementExperiment$TurboMode$Strategy$Fixed(int i, Double d, Double d2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d2;
        }
    }

    public TaxiTravelerMovementExperiment$TurboMode$Strategy$Fixed() {
        this.a = null;
        this.b = null;
    }
}
