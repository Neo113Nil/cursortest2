package xsna;

/* compiled from: DeviceThermalStatus.kt */
/* loaded from: classes3.dex */
public final class u6m {
    public final float a;
    public final int b;
    public final float c;

    public u6m(float f, float f2, int i) {
        this.a = f;
        this.b = i;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6m)) {
            return false;
        }
        u6m u6mVar = (u6m) obj;
        return Float.compare(this.a, u6mVar.a) == 0 && this.b == u6mVar.b && Float.compare(this.c, u6mVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + shy.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceThermalStatus(cpuTemperature=");
        sb.append(this.a);
        sb.append(", thermalStatus=");
        sb.append(this.b);
        sb.append(", thermalHeadroom=");
        return xq.c(')', this.c, sb);
    }
}
