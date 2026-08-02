package xsna;

/* compiled from: PowerConsumptionStatistics.kt */
/* loaded from: classes8.dex */
public final class uwc0 {
    public final Boolean a;
    public final Boolean b;

    public uwc0(Boolean bool, Boolean bool2) {
        this.a = bool;
        this.b = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwc0)) {
            return false;
        }
        uwc0 uwc0Var = (uwc0) obj;
        return epx.f(this.a, uwc0Var.a) && epx.f(this.b, uwc0Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "PowerConsumptionStatistics(isPowerSavingModeOn=" + this.a + ", isCharging=" + this.b + ")";
    }
}
