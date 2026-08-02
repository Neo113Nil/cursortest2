package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.performance_class.experiment.DevicePerformanceClassExperiment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class dah {
    public final crs a;

    public dah(crs crsVar) {
        this.a = crsVar;
    }

    public static String b(ybj ybjVar, DevicePerformanceClassExperiment.StaticThresholds staticThresholds) {
        int i;
        int i2;
        DevicePerformanceClassExperiment.StaticThresholds.StaticThreshold staticThreshold = staticThresholds.a;
        DevicePerformanceClassExperiment.StaticThresholds.StaticThreshold staticThreshold2 = staticThresholds.b;
        DevicePerformanceClassExperiment.StaticThresholds.StaticThreshold.Companion.getClass();
        DevicePerformanceClassExperiment.StaticThresholds.StaticThreshold staticThreshold3 = DevicePerformanceClassExperiment.StaticThresholds.StaticThreshold.d;
        if (jl40.l(staticThreshold, staticThreshold3) || jl40.l(staticThreshold2, staticThreshold3)) {
            return "unknown";
        }
        int i3 = ybjVar.a;
        DevicePerformanceClassExperiment.StaticThresholds.StaticThreshold staticThreshold4 = staticThresholds.a;
        return (i3 <= staticThreshold4.a || (i = ybjVar.b) <= staticThreshold4.b || (i2 = ybjVar.c) <= staticThreshold4.c) ? Constants.LOW : (i3 <= staticThreshold2.a || i <= staticThreshold2.b || i2 <= staticThreshold2.c) ? "medium" : Constants.HIGH;
    }

    public final String a(ybj ybjVar, DevicePerformanceClassExperiment.StaticThresholds staticThresholds, Map map, DevicePerformanceClassExperiment.DeviceGlobalStats deviceGlobalStats) {
        DevicePerformanceClassExperiment.DeviceGlobalStats.Cluster cluster;
        String str = (String) map.get(ybjVar.d);
        if (str != null) {
            return str;
        }
        if (deviceGlobalStats == null) {
            return b(ybjVar, staticThresholds);
        }
        int i = deviceGlobalStats.d;
        List list = deviceGlobalStats.j;
        double d = deviceGlobalStats.c;
        double d2 = deviceGlobalStats.b;
        double d3 = deviceGlobalStats.a;
        int i2 = deviceGlobalStats.i;
        int i3 = deviceGlobalStats.h;
        int i4 = deviceGlobalStats.g;
        int i5 = deviceGlobalStats.f;
        int i6 = deviceGlobalStats.e;
        if (i == 0 || i6 == 0 || i5 == 0 || i4 == 0 || i3 == 0 || i2 == 0 || d3 == 0.0d || d2 == 0.0d || d == 0.0d || list.isEmpty()) {
            return b(ybjVar, staticThresholds);
        }
        int i7 = ybjVar.b;
        int i8 = ybjVar.c;
        double d4 = (((y6i0.d(ybjVar.a, i3, i2) - i3) / (i2 - i3)) * d) + (((y6i0.d(i8, i5, i4) - i5) / (i4 - i5)) * d2) + (((y6i0.d(i7, i, i6) - i) / (i6 - i)) * d3);
        this.a.getClass();
        DevicePerformanceClassExperiment.DeviceGlobalStats.Cluster.Companion.getClass();
        List<DevicePerformanceClassExperiment.DeviceGlobalStats.Cluster> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (DevicePerformanceClassExperiment.DeviceGlobalStats.Cluster cluster2 : list2) {
            arrayList.add(Double.valueOf(Math.pow(2.718281828459045d, -(Math.pow(d4 - cluster2.b, 2.0d) / (Math.pow(cluster2.c, 2.0d) * 2.0d))) * (1.0d / (cluster2.c * 2.5066282746310002d))));
        }
        Iterator it = arrayList.iterator();
        int i9 = 0;
        int i10 = 0;
        double d5 = 0.0d;
        while (it.hasNext()) {
            Object next = it.next();
            int i11 = i10 + 1;
            if (i10 < 0) {
                scc.m();
                throw null;
            }
            d5 += ((Number) next).doubleValue() * ((DevicePerformanceClassExperiment.DeviceGlobalStats.Cluster) list.get(i10)).d;
            i10 = i11;
        }
        DevicePerformanceClassExperiment.DeviceGlobalStats.Cluster cluster3 = DevicePerformanceClassExperiment.DeviceGlobalStats.Cluster.e;
        if (d5 < 1.0E-9d) {
            cluster = cluster3;
        } else {
            Iterator it2 = arrayList.iterator();
            cluster = cluster3;
            double d6 = 0.0d;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                int i12 = i9 + 1;
                if (i9 < 0) {
                    scc.m();
                    throw null;
                }
                double doubleValue = ((Number) next2).doubleValue();
                DevicePerformanceClassExperiment.DeviceGlobalStats.Cluster cluster4 = (DevicePerformanceClassExperiment.DeviceGlobalStats.Cluster) list.get(i9);
                double d7 = (doubleValue * cluster4.d) / d5;
                if (d6 < d7) {
                    cluster = cluster4;
                    d6 = d7;
                }
                i9 = i12;
            }
        }
        DevicePerformanceClassExperiment.DeviceGlobalStats.Cluster.Companion.getClass();
        return cluster.equals(cluster3) ? b(ybjVar, staticThresholds) : cluster.a;
    }
}
