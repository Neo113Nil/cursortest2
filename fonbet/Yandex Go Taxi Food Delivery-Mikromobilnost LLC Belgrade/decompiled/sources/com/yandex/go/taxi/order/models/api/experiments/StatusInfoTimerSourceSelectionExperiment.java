package com.yandex.go.taxi.order.models.api.experiments;

import defpackage.gsq0;
import defpackage.n96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/experiments/StatusInfoTimerSourceSelectionExperiment;", "Ln96;", "Companion", "com/yandex/go/taxi/order/models/api/experiments/h", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StatusInfoTimerSourceSelectionExperiment extends n96 {
    public static final h Companion = new h();
    public static final StatusInfoTimerSourceSelectionExperiment d = new StatusInfoTimerSourceSelectionExperiment(0);
    public final boolean b;
    public final boolean c;

    public /* synthetic */ StatusInfoTimerSourceSelectionExperiment(int i, boolean z, boolean z2) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = false;
        } else {
            this.c = z2;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public StatusInfoTimerSourceSelectionExperiment(int i) {
        this.b = false;
        this.c = false;
    }

    public StatusInfoTimerSourceSelectionExperiment() {
        this(0);
    }
}
