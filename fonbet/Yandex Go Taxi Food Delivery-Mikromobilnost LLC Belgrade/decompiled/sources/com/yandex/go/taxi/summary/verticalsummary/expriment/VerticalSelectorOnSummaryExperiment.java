package com.yandex.go.taxi.summary.verticalsummary.expriment;

import defpackage.gs21;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.n96;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/verticalsummary/expriment/VerticalSelectorOnSummaryExperiment;", "Ln96;", "Companion", "com/yandex/go/taxi/summary/verticalsummary/expriment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class VerticalSelectorOnSummaryExperiment extends n96 {
    public static final a Companion = new a();
    public static final i3y[] f = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gs21(14)), null, null};
    public static final VerticalSelectorOnSummaryExperiment g = new VerticalSelectorOnSummaryExperiment(0);
    public final boolean b;
    public final List c;
    public final float d;
    public final boolean e;

    public /* synthetic */ VerticalSelectorOnSummaryExperiment(int i, boolean z, List list, float f2, boolean z2) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 4) == 0) {
            this.d = 2.5f;
        } else {
            this.d = f2;
        }
        if ((i & 8) == 0) {
            this.e = false;
        } else {
            this.e = z2;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public VerticalSelectorOnSummaryExperiment(int i) {
        this.b = false;
        this.c = EmptyList.a;
        this.d = 2.5f;
        this.e = false;
    }

    public VerticalSelectorOnSummaryExperiment() {
        this(0);
    }
}
