package yads;

/* loaded from: classes10.dex */
public final class h61 {
    public final dp2 a;
    public final dp2 b;
    public final dp2 c;
    public final dp2 d;

    public h61(dp2 dp2Var, dp2 dp2Var2, dp2 dp2Var3, dp2 dp2Var4) {
        this.a = dp2Var;
        this.b = dp2Var2;
        this.c = dp2Var3;
        this.d = dp2Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h61)) {
            return false;
        }
        h61 h61Var = (h61) obj;
        return this.a == h61Var.a && this.b == h61Var.b && this.c == h61Var.c && this.d == h61Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImpressionTrackingReportTypes(impressionTrackingSuccessReportType=" + this.a + ", impressionTrackingStartReportType=" + this.b + ", impressionTrackingFailureReportType=" + this.c + ", forcedImpressionTrackingFailureReportType=" + this.d + ")";
    }
}
