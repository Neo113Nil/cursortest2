package xsna;

/* compiled from: VideoPickerAction.kt */
/* loaded from: classes4.dex */
public final class z1t0 implements x1t0 {
    public final long b;

    public z1t0(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z1t0) && this.b == ((z1t0) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return vu5.a(')', this.b, new StringBuilder("SaveInteractiveTime(elapsedTime="));
    }
}
