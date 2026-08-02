package com.yandex.go.shortcuts.experiments.superapp_flow;

import defpackage.gsq0;
import defpackage.vn11;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/experiments/superapp_flow/SuperAppFlowExperiment;", "Lvn11;", "Companion", "com/yandex/go/shortcuts/experiments/superapp_flow/a", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SuperAppFlowExperiment implements vn11 {
    public static final a Companion = new a();
    public static final SuperAppFlowExperiment d = new SuperAppFlowExperiment(0);
    public final long b;
    public final boolean c;

    public /* synthetic */ SuperAppFlowExperiment(boolean z, int i, long j) {
        this.b = (i & 1) == 0 ? 6L : j;
        if ((i & 2) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
    }

    public SuperAppFlowExperiment(int i) {
        this.b = 6L;
        this.c = false;
    }

    public SuperAppFlowExperiment() {
        this(0);
    }
}
