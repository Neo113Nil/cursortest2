package com.yandex.go.telemetry.experiment;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.n96;
import defpackage.y6y0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/telemetry/experiment/TelemetryReportConfigExperiment;", "Ln96;", "Companion", "com/yandex/go/telemetry/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TelemetryReportConfigExperiment extends n96 {
    public static final a Companion = new a();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y6y0(17))};
    public static final TelemetryReportConfigExperiment e = new TelemetryReportConfigExperiment(0);
    public final boolean b;
    public final List c;

    public /* synthetic */ TelemetryReportConfigExperiment(int i, boolean z, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.n96
    public final boolean b() {
        return getB() && !this.c.isEmpty();
    }

    public TelemetryReportConfigExperiment(int i) {
        this.b = false;
        this.c = EmptyList.a;
    }

    public TelemetryReportConfigExperiment() {
        this(0);
    }
}
