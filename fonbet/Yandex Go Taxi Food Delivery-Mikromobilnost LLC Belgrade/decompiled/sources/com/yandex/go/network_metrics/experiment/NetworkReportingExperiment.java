package com.yandex.go.network_metrics.experiment;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ic50;
import defpackage.w96;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/network_metrics/experiment/NetworkReportingExperiment;", "Lw96;", "Companion", "com/yandex/go/network_metrics/experiment/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NetworkReportingExperiment extends w96 {
    public static final b Companion = new b();
    public static final i3y[] g;
    public static final NetworkReportingExperiment h;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final List e;
    public final ReportingDestination f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new ic50(21)), kotlin.a.b(lazyThreadSafetyMode, new ic50(22)), null};
        h = new NetworkReportingExperiment(0);
    }

    public /* synthetic */ NetworkReportingExperiment(int i, boolean z, boolean z2, List list, List list2, ReportingDestination reportingDestination) {
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
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = list2;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = reportingDestination;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public NetworkReportingExperiment(int i) {
        this.b = false;
        this.c = false;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public NetworkReportingExperiment() {
        this(0);
    }
}
