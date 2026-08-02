package xsna;

/* compiled from: MusicPickerPatch.kt */
/* loaded from: classes4.dex */
public final class lu40 implements fu40 {
    public final long b;

    public lu40(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lu40) && this.b == ((lu40) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return vu5.a(')', this.b, new StringBuilder("Interactive(interactiveTime="));
    }
}
