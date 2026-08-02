package xsna;

/* compiled from: AnalyticsConfig.kt */
/* loaded from: classes3.dex */
public final class cx1 {
    public final lt50 a;
    public final lwe0 b;
    public final dk80 c;
    public final vmf0 d;
    public final aqa0 e;

    public cx1(lt50 lt50Var, lwe0 lwe0Var, dk80 dk80Var, vmf0 vmf0Var, aqa0 aqa0Var) {
        this.a = lt50Var;
        this.b = lwe0Var;
        this.c = dk80Var;
        this.d = vmf0Var;
        this.e = aqa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx1)) {
            return false;
        }
        cx1 cx1Var = (cx1) obj;
        return epx.f(this.a, cx1Var.a) && epx.f(this.b, cx1Var.b) && epx.f(this.c, cx1Var.c) && epx.f(this.d, cx1Var.d) && epx.f(this.e, cx1Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        lwe0 lwe0Var = this.b;
        int hashCode2 = (hashCode + (lwe0Var == null ? 0 : lwe0Var.hashCode())) * 31;
        dk80 dk80Var = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (dk80Var == null ? 0 : dk80Var.hashCode())) * 31)) * 31;
        aqa0 aqa0Var = this.e;
        return hashCode3 + (aqa0Var != null ? aqa0Var.hashCode() : 0);
    }

    public final String toString() {
        return "AnalyticsConfig(myTrackerAnalyticsConfig=" + this.a + ", rangeAnalyticsConfig=" + this.b + ", oneVideoAnalyticsConfig=" + this.c + ", reefAnalyticsConfig=" + this.d + ", pixelAnalyticsConfig=" + this.e + ')';
    }
}
