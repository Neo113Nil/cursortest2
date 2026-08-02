package xsna;

/* compiled from: MarketMultiPickerTechMetricsState.kt */
/* loaded from: classes18.dex */
public final class a910 {
    public final boolean a;
    public final boolean b;
    public final Long c;
    public final Long d;

    public a910(boolean z, boolean z2, Long l, Long l2) {
        this.a = z;
        this.b = z2;
        this.c = l;
        this.d = l2;
    }

    public static a910 a(a910 a910Var, Long l, Long l2, int i) {
        boolean z = a910Var.a;
        boolean z2 = (i & 2) != 0 ? a910Var.b : true;
        if ((i & 4) != 0) {
            l = a910Var.c;
        }
        if ((i & 8) != 0) {
            l2 = a910Var.d;
        }
        a910Var.getClass();
        return new a910(z, z2, l, l2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a910)) {
            return false;
        }
        a910 a910Var = (a910) obj;
        return this.a == a910Var.a && this.b == a910Var.b && epx.f(this.c, a910Var.c) && epx.f(this.d, a910Var.d);
    }

    public final int hashCode() {
        int b = qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        Long l = this.c;
        int hashCode = (b + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketMultiPickerTechMetricsState(shouldMeasureTechMetrics=");
        sb.append(this.a);
        sb.append(", isMeasuringColdStarted=");
        sb.append(this.b);
        sb.append(", interactElapsedTime=");
        sb.append(this.c);
        sb.append(", pickElapsedTime=");
        return iq.b(sb, this.d, ')');
    }
}
