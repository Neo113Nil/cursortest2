package com.yandex.go.taxi.order.experiments;

import defpackage.gsq0;
import defpackage.w96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/experiments/RideCardOrderTrackingVisibilityExperiment;", "Lw96;", "Companion", "com/yandex/go/taxi/order/experiments/e", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RideCardOrderTrackingVisibilityExperiment extends w96 {
    public static final e Companion = new e();
    public static final RideCardOrderTrackingVisibilityExperiment d = new RideCardOrderTrackingVisibilityExperiment(0);
    public final boolean b;
    public final boolean c;

    public /* synthetic */ RideCardOrderTrackingVisibilityExperiment(int i, boolean z, boolean z2) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = true;
        } else {
            this.c = z2;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public RideCardOrderTrackingVisibilityExperiment(int i) {
        this.b = false;
        this.c = true;
    }

    public RideCardOrderTrackingVisibilityExperiment() {
        this(0);
    }
}
