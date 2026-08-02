package xsna;

/* compiled from: PerformanceMetrics.kt */
/* loaded from: classes.dex */
public final class iw90 {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    public iw90(Integer num, Integer num2, Integer num3, Integer num4) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw90)) {
            return false;
        }
        iw90 iw90Var = (iw90) obj;
        return epx.f(this.a, iw90Var.a) && epx.f(this.b, iw90Var.b) && epx.f(this.c, iw90Var.c) && epx.f(this.d, iw90Var.d);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppColdStartTimesData(appColdStartTime=");
        sb.append(this.a);
        sb.append(", appColdFeedTime=");
        sb.append(this.b);
        sb.append(", appColdInflateTime=");
        sb.append(this.c);
        sb.append(", appColdContentProvidersTime=");
        return uqi.b(sb, this.d, ')');
    }
}
