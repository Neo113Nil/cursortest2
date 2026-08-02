package xsna;

/* compiled from: VideoEvents.kt */
/* loaded from: classes14.dex */
public final class sxr0 extends bwr0 {
    public final int a;

    public sxr0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sxr0) && this.a == ((sxr0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("VideoActionPlaylistShift(shift="), this.a, ')');
    }
}
