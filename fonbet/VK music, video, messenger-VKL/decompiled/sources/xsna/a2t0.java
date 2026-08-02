package xsna;

/* compiled from: VideoPickerAction.kt */
/* loaded from: classes4.dex */
public final class a2t0 implements x1t0 {
    public final long b;

    public a2t0(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a2t0) && this.b == ((a2t0) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return vu5.a(')', this.b, new StringBuilder("SaveStartTime(elapsedTime="));
    }
}
