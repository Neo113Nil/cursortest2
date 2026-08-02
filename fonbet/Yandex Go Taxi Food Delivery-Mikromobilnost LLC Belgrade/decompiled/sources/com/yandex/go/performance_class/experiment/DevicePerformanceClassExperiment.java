package com.yandex.go.performance_class.experiment;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.n96;
import defpackage.nzs;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.xyi;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/performance_class/experiment/DevicePerformanceClassExperiment;", "Ln96;", "Companion", "StaticThresholds", "DynamicThresholds", "DeviceGlobalStats", "com/yandex/go/performance_class/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DevicePerformanceClassExperiment extends n96 {
    public static final a Companion = new a();
    public static final i3y[] i = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xyi(2)), null, null, null};
    public static final DevicePerformanceClassExperiment j = new DevicePerformanceClassExperiment(0);
    public final boolean b;
    public final Integer c;
    public final StaticThresholds d;
    public final Map e;
    public final DynamicThresholds f;
    public final Integer g;
    public final DeviceGlobalStats h;

    public DevicePerformanceClassExperiment(int i2, boolean z, Integer num, StaticThresholds staticThresholds, Map map, DynamicThresholds dynamicThresholds, Integer num2, DeviceGlobalStats deviceGlobalStats) {
        this.b = (i2 & 1) == 0 ? false : z;
        if ((i2 & 2) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i2 & 4) == 0) {
            StaticThresholds.Companion.getClass();
            this.d = StaticThresholds.c;
        } else {
            this.d = staticThresholds;
        }
        if ((i2 & 8) == 0) {
            this.e = kotlin.collections.b.f();
        } else {
            this.e = map;
        }
        if ((i2 & 16) == 0) {
            DynamicThresholds.Companion.getClass();
            this.f = DynamicThresholds.c;
        } else {
            this.f = dynamicThresholds;
        }
        if ((i2 & 32) == 0) {
            this.g = null;
        } else {
            this.g = num2;
        }
        if ((i2 & 64) == 0) {
            this.h = null;
        } else {
            this.h = deviceGlobalStats;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/performance_class/experiment/DevicePerformanceClassExperiment$DynamicThresholds;", "", "Companion", "DynamicThreshold", "com/yandex/go/performance_class/experiment/d", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class DynamicThresholds {
        public static final d Companion = new d();
        public static final DynamicThresholds c = new DynamicThresholds(0);
        public final DynamicThreshold a;
        public final DynamicThreshold b;

        public DynamicThresholds(int i, DynamicThreshold dynamicThreshold, DynamicThreshold dynamicThreshold2) {
            int i2 = i & 1;
            DynamicThreshold dynamicThreshold3 = DynamicThreshold.c;
            if (i2 == 0) {
                DynamicThreshold.Companion.getClass();
                this.a = dynamicThreshold3;
            } else {
                this.a = dynamicThreshold;
            }
            if ((i & 2) != 0) {
                this.b = dynamicThreshold2;
            } else {
                DynamicThreshold.Companion.getClass();
                this.b = dynamicThreshold3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DynamicThresholds)) {
                return false;
            }
            DynamicThresholds dynamicThresholds = (DynamicThresholds) obj;
            return jl40.l(this.a, dynamicThresholds.a) && jl40.l(this.b, dynamicThresholds.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DynamicThresholds(low=" + this.a + ", medium=" + this.b + Extension.C_BRAKE;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/performance_class/experiment/DevicePerformanceClassExperiment$DynamicThresholds$DynamicThreshold;", "", "Companion", "com/yandex/go/performance_class/experiment/e", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class DynamicThreshold {
            public static final e Companion = new e();
            public static final DynamicThreshold c = new DynamicThreshold(0);
            public final int a;
            public final int b;

            public /* synthetic */ DynamicThreshold(int i, int i2, int i3) {
                if ((i & 1) == 0) {
                    this.a = -1;
                } else {
                    this.a = i2;
                }
                if ((i & 2) == 0) {
                    this.b = -1;
                } else {
                    this.b = i3;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DynamicThreshold)) {
                    return false;
                }
                DynamicThreshold dynamicThreshold = (DynamicThreshold) obj;
                return this.a == dynamicThreshold.a && this.b == dynamicThreshold.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                return b64.d(this.a, this.b, "DynamicThreshold(freeRam=", ", memoryClass=", Extension.C_BRAKE);
            }

            public DynamicThreshold(int i) {
                this.a = -1;
                this.b = -1;
            }

            public DynamicThreshold() {
                this(0);
            }
        }

        public DynamicThresholds() {
            this(0);
        }

        public DynamicThresholds(int i) {
            e eVar = DynamicThreshold.Companion;
            eVar.getClass();
            eVar.getClass();
            DynamicThreshold dynamicThreshold = DynamicThreshold.c;
            this.a = dynamicThreshold;
            this.b = dynamicThreshold;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/performance_class/experiment/DevicePerformanceClassExperiment$StaticThresholds;", "", "Companion", "StaticThreshold", "com/yandex/go/performance_class/experiment/f", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class StaticThresholds {
        public static final f Companion = new f();
        public static final StaticThresholds c = new StaticThresholds(0);
        public final StaticThreshold a;
        public final StaticThreshold b;

        public StaticThresholds(int i, StaticThreshold staticThreshold, StaticThreshold staticThreshold2) {
            int i2 = i & 1;
            StaticThreshold staticThreshold3 = StaticThreshold.d;
            if (i2 == 0) {
                StaticThreshold.Companion.getClass();
                this.a = staticThreshold3;
            } else {
                this.a = staticThreshold;
            }
            if ((i & 2) != 0) {
                this.b = staticThreshold2;
            } else {
                StaticThreshold.Companion.getClass();
                this.b = staticThreshold3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StaticThresholds)) {
                return false;
            }
            StaticThresholds staticThresholds = (StaticThresholds) obj;
            return jl40.l(this.a, staticThresholds.a) && jl40.l(this.b, staticThresholds.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "StaticThresholds(low=" + this.a + ", medium=" + this.b + Extension.C_BRAKE;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/performance_class/experiment/DevicePerformanceClassExperiment$StaticThresholds$StaticThreshold;", "", "Companion", "com/yandex/go/performance_class/experiment/g", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class StaticThreshold {
            public static final g Companion = new g();
            public static final StaticThreshold d = new StaticThreshold(0);
            public final int a;
            public final int b;
            public final int c;

            public /* synthetic */ StaticThreshold(int i, int i2, int i3, int i4) {
                if ((i & 1) == 0) {
                    this.a = -1;
                } else {
                    this.a = i2;
                }
                if ((i & 2) == 0) {
                    this.b = -1;
                } else {
                    this.b = i3;
                }
                if ((i & 4) == 0) {
                    this.c = -1;
                } else {
                    this.c = i4;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StaticThreshold)) {
                    return false;
                }
                StaticThreshold staticThreshold = (StaticThreshold) obj;
                return this.a == staticThreshold.a && this.b == staticThreshold.b && this.c == staticThreshold.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
            }

            public final String toString() {
                return oyr.m(this.c, Extension.C_BRAKE, b64.s(this.a, this.b, "StaticThreshold(ram=", ", cpuCount=", ", cpuMaxFreq="));
            }

            public StaticThreshold(int i) {
                this.a = -1;
                this.b = -1;
                this.c = -1;
            }

            public StaticThreshold() {
                this(0);
            }
        }

        public StaticThresholds() {
            this(0);
        }

        public StaticThresholds(int i) {
            g gVar = StaticThreshold.Companion;
            gVar.getClass();
            gVar.getClass();
            StaticThreshold staticThreshold = StaticThreshold.d;
            this.a = staticThreshold;
            this.b = staticThreshold;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/performance_class/experiment/DevicePerformanceClassExperiment$DeviceGlobalStats;", "", "Companion", "Cluster", "$serializer", "com/yandex/go/performance_class/experiment/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class DeviceGlobalStats {
        public static final c Companion = new c();
        public static final i3y[] k = {null, null, null, null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xyi(3))};
        public final double a;
        public final double b;
        public final double c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final List j;

        public /* synthetic */ DeviceGlobalStats(int i, double d, double d2, double d3, int i2, int i3, int i4, int i5, int i6, int i7, List list) {
            if ((i & 1) == 0) {
                this.a = 0.0d;
            } else {
                this.a = d;
            }
            if ((i & 2) == 0) {
                this.b = 0.0d;
            } else {
                this.b = d2;
            }
            if ((i & 4) == 0) {
                this.c = 0.0d;
            } else {
                this.c = d3;
            }
            if ((i & 8) == 0) {
                this.d = 0;
            } else {
                this.d = i2;
            }
            if ((i & 16) == 0) {
                this.e = 0;
            } else {
                this.e = i3;
            }
            if ((i & 32) == 0) {
                this.f = 0;
            } else {
                this.f = i4;
            }
            if ((i & 64) == 0) {
                this.g = 0;
            } else {
                this.g = i5;
            }
            if ((i & 128) == 0) {
                this.h = 0;
            } else {
                this.h = i6;
            }
            if ((i & 256) == 0) {
                this.i = 0;
            } else {
                this.i = i7;
            }
            this.j = (i & 512) == 0 ? EmptyList.a : list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeviceGlobalStats)) {
                return false;
            }
            DeviceGlobalStats deviceGlobalStats = (DeviceGlobalStats) obj;
            return Double.compare(this.a, deviceGlobalStats.a) == 0 && Double.compare(this.b, deviceGlobalStats.b) == 0 && Double.compare(this.c, deviceGlobalStats.c) == 0 && this.d == deviceGlobalStats.d && this.e == deviceGlobalStats.e && this.f == deviceGlobalStats.f && this.g == deviceGlobalStats.g && this.h == deviceGlobalStats.h && this.i == deviceGlobalStats.i && jl40.l(this.j, deviceGlobalStats.j);
        }

        public final int hashCode() {
            return this.j.hashCode() + oyr.b(this.i, oyr.b(this.h, oyr.b(this.g, oyr.b(this.f, oyr.b(this.e, oyr.b(this.d, unr0.a(unr0.a(Double.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder u = oyr.u(this.a, "DeviceGlobalStats(cpuCountWeight=", ", cpuFreqWeight=");
            u.append(this.b);
            nzs.o(u, ", ramWeight=", this.c, ", minCpuCount=");
            vfc.u(this.d, this.e, ", maxCpuCount=", ", minCpuFreq=", u);
            vfc.u(this.f, this.g, ", maxCpuFreq=", ", minRam=", u);
            vfc.u(this.h, this.i, ", maxRam=", ", clusters=", u);
            return ly3.s(u, this.j, Extension.C_BRAKE);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/performance_class/experiment/DevicePerformanceClassExperiment$DeviceGlobalStats$Cluster;", "", "Companion", "com/yandex/go/performance_class/experiment/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class Cluster {
            public static final b Companion = new b();
            public static final Cluster e = new Cluster(0);
            public final String a;
            public final double b;
            public final double c;
            public final double d;

            public /* synthetic */ Cluster(int i, String str, double d, double d2, double d3) {
                this.a = (i & 1) == 0 ? "unknown" : str;
                if ((i & 2) == 0) {
                    this.b = 0.0d;
                } else {
                    this.b = d;
                }
                if ((i & 4) == 0) {
                    this.c = 0.0d;
                } else {
                    this.c = d2;
                }
                if ((i & 8) == 0) {
                    this.d = 0.0d;
                } else {
                    this.d = d3;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Cluster)) {
                    return false;
                }
                Cluster cluster = (Cluster) obj;
                return jl40.l(this.a, cluster.a) && Double.compare(this.b, cluster.b) == 0 && Double.compare(this.c, cluster.c) == 0 && Double.compare(this.d, cluster.d) == 0;
            }

            public final int hashCode() {
                return Double.hashCode(this.d) + unr0.a(unr0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Cluster(name=");
                sb.append(this.a);
                sb.append(", mean=");
                sb.append(this.b);
                nzs.o(sb, ", std=", this.c, ", weight=");
                return nzs.c(sb, this.d, Extension.C_BRAKE);
            }

            public Cluster(int i) {
                this.a = "unknown";
                this.b = 0.0d;
                this.c = 0.0d;
                this.d = 0.0d;
            }

            public Cluster() {
                this(0);
            }
        }

        public DeviceGlobalStats() {
            this.a = 0.0d;
            this.b = 0.0d;
            this.c = 0.0d;
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = EmptyList.a;
        }
    }

    public DevicePerformanceClassExperiment() {
        this(0);
    }

    public DevicePerformanceClassExperiment(int i2) {
        StaticThresholds.Companion.getClass();
        StaticThresholds staticThresholds = StaticThresholds.c;
        Map f = kotlin.collections.b.f();
        DynamicThresholds.Companion.getClass();
        DynamicThresholds dynamicThresholds = DynamicThresholds.c;
        this.b = false;
        this.c = null;
        this.d = staticThresholds;
        this.e = f;
        this.f = dynamicThresholds;
        this.g = null;
        this.h = null;
    }
}
