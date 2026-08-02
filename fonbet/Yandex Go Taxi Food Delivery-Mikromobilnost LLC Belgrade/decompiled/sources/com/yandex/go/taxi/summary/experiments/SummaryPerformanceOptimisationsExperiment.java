package com.yandex.go.taxi.summary.experiments;

import defpackage.gsq0;
import defpackage.n96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/experiments/SummaryPerformanceOptimisationsExperiment;", "Ln96;", "Companion", "com/yandex/go/taxi/summary/experiments/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SummaryPerformanceOptimisationsExperiment extends n96 {
    public static final b Companion = new b();
    public static final SummaryPerformanceOptimisationsExperiment f = new SummaryPerformanceOptimisationsExperiment(0);
    public final boolean b;
    public final long c;
    public final boolean d;
    public final boolean e;

    public /* synthetic */ SummaryPerformanceOptimisationsExperiment(int i, boolean z, long j, boolean z2, boolean z3) {
        this.b = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            this.c = 5L;
        } else {
            this.c = j;
        }
        if ((i & 4) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
        if ((i & 8) == 0) {
            this.e = false;
        } else {
            this.e = z3;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public SummaryPerformanceOptimisationsExperiment(int i) {
        this.b = true;
        this.c = 5L;
        this.d = false;
        this.e = false;
    }

    public SummaryPerformanceOptimisationsExperiment() {
        this(0);
    }
}
