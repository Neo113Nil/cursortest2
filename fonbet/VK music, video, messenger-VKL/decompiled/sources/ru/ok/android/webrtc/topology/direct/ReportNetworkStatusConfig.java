package ru.ok.android.webrtc.topology.direct;

import xsna.de;

/* loaded from: classes9.dex */
public final class ReportNetworkStatusConfig {
    public final double a;
    public final int b;
    public final int c;

    public ReportNetworkStatusConfig(double d, int i, int i2) {
        this.a = d;
        this.b = i;
        this.c = i2;
    }

    public static /* synthetic */ ReportNetworkStatusConfig copy$default(ReportNetworkStatusConfig reportNetworkStatusConfig, double d, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            d = reportNetworkStatusConfig.a;
        }
        if ((i3 & 2) != 0) {
            i = reportNetworkStatusConfig.b;
        }
        if ((i3 & 4) != 0) {
            i2 = reportNetworkStatusConfig.c;
        }
        return reportNetworkStatusConfig.copy(d, i, i2);
    }

    public final double component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    public final ReportNetworkStatusConfig copy(double d, int i, int i2) {
        return new ReportNetworkStatusConfig(d, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportNetworkStatusConfig)) {
            return false;
        }
        ReportNetworkStatusConfig reportNetworkStatusConfig = (ReportNetworkStatusConfig) obj;
        return Double.compare(this.a, reportNetworkStatusConfig.a) == 0 && this.b == reportNetworkStatusConfig.b && this.c == reportNetworkStatusConfig.c;
    }

    public final int getNetworkStatusReportForceIntervalMs() {
        return this.c;
    }

    public final int getNetworkStatusReportIntervalMs() {
        return this.b;
    }

    public final double getNetworkStatusReportThreshold() {
        return this.a;
    }

    public int hashCode() {
        return Integer.hashCode(this.c) + de.v(this.b, Double.hashCode(this.a) * 31);
    }

    public String toString() {
        return "ReportNetworkStatusConfig(networkStatusReportThreshold=" + this.a + ", networkStatusReportIntervalMs=" + this.b + ", networkStatusReportForceIntervalMs=" + this.c + ")";
    }
}
