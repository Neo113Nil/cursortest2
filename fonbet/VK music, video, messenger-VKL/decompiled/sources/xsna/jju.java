package xsna;

/* compiled from: GroupCellConfiguration.kt */
/* loaded from: classes16.dex */
public final class jju {
    public final int a;
    public final int b;

    public jju(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jju)) {
            return false;
        }
        jju jjuVar = (jju) obj;
        return this.a == jjuVar.a && this.b == jjuVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventDescription(startTime=");
        sb.append(this.a);
        sb.append(", endTime=");
        return vu5.b(sb, this.b, ')');
    }
}
