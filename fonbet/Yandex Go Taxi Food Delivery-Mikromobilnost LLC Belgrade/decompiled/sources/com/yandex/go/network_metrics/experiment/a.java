package com.yandex.go.network_metrics.experiment;

import defpackage.csz;
import defpackage.gw00;
import defpackage.hbp0;
import defpackage.jbh;
import defpackage.rqo;
import defpackage.sqo;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.tt2;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes8.dex */
public final class a {
    public final q a;
    public final tpr b;
    public final AtomicReference c;

    public a(tt2 tt2Var, rqo rqoVar) {
        hbp0 hbp0Var = new hbp0(new csz(15, tt2Var), null, null, 6);
        q d = ((jbh) rqoVar).d(NetworkReportingExperiment.h);
        this.a = d;
        this.b = d.a();
        this.c = new AtomicReference(new sqo(0));
        hbp0Var.a();
        hbp0.e(hbp0Var, null, null, new NetworkMetricsExperimentRepositoryImpl$observeExperiment$1(this, null), 3);
    }

    public static final void a(a aVar, NetworkReportingExperiment networkReportingExperiment) {
        Map map;
        AtomicReference atomicReference = aVar.c;
        boolean c = networkReportingExperiment.getC();
        boolean z = networkReportingExperiment.c;
        List list = networkReportingExperiment.d;
        if (list != null) {
            List<ReportingEndpoint> list2 = list;
            int d = gw00.d(tcc.n(list2, 10));
            if (d < 16) {
                d = 16;
            }
            map = new LinkedHashMap(d);
            for (ReportingEndpoint reportingEndpoint : list2) {
                map.put(reportingEndpoint.a, reportingEndpoint.b);
            }
        } else {
            map = null;
        }
        if (map == null) {
            map = kotlin.collections.b.f();
        }
        List list3 = networkReportingExperiment.e;
        Set N0 = list3 != null ? kotlin.collections.a.N0(list3) : null;
        if (N0 == null) {
            N0 = EmptySet.a;
        }
        Set set = N0;
        ReportingDestination reportingDestination = networkReportingExperiment.f;
        if (reportingDestination == null) {
            reportingDestination = sqo.f;
        }
        atomicReference.set(new sqo(c, z, map, set, reportingDestination));
    }
}
