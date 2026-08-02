package com.yandex.go.yb.experiments;

import defpackage.gsq0;
import defpackage.n96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/yb/experiments/ForceYbPromosOnSummaryExperiment;", "Ln96;", "Companion", "com/yandex/go/yb/experiments/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ForceYbPromosOnSummaryExperiment extends n96 {
    public static final b Companion = new b();
    public static final ForceYbPromosOnSummaryExperiment e = new ForceYbPromosOnSummaryExperiment(0);
    public final boolean b;
    public final String c;
    public final String d;

    public /* synthetic */ ForceYbPromosOnSummaryExperiment(String str, int i, String str2, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public ForceYbPromosOnSummaryExperiment(int i) {
        this.b = false;
        this.c = null;
        this.d = null;
    }

    public ForceYbPromosOnSummaryExperiment() {
        this(0);
    }
}
