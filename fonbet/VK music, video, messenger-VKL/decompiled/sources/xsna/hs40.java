package xsna;

/* compiled from: MusicPickerAction.kt */
/* loaded from: classes4.dex */
public final class hs40 implements lr40 {
    public final long b;

    public hs40(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hs40) && this.b == ((hs40) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return vu5.a(')', this.b, new StringBuilder("Interactive(interactiveTime="));
    }
}
