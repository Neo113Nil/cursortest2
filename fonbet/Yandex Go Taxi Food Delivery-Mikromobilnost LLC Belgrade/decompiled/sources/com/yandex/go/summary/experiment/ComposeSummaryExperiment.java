package com.yandex.go.summary.experiment;

import defpackage.bgc;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.n96;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/summary/experiment/ComposeSummaryExperiment;", "Ln96;", "Companion", "com/yandex/go/summary/experiment/a", "$serializer", "composelogic"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposeSummaryExperiment extends n96 {
    public static final a Companion = new a();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bgc(14))};
    public static final ComposeSummaryExperiment e = new ComposeSummaryExperiment(0);
    public final boolean b;
    public final Set c;

    public /* synthetic */ ComposeSummaryExperiment(int i, boolean z, Set set) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = EmptySet.a;
        } else {
            this.c = set;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public ComposeSummaryExperiment(int i) {
        this.b = false;
        this.c = EmptySet.a;
    }

    public ComposeSummaryExperiment() {
        this(0);
    }
}
