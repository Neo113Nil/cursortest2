package xsna;

/* compiled from: VelocityTracker.kt */
/* loaded from: classes11.dex */
public final class nuk {
    public long a;
    public float b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nuk)) {
            return false;
        }
        nuk nukVar = (nuk) obj;
        return this.a == nukVar.a && Float.compare(this.b, nukVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.a);
        sb.append(", dataPoint=");
        return xq.c(')', this.b, sb);
    }
}
