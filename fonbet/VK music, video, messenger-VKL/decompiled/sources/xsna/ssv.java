package xsna;

/* compiled from: IdeasStoryAction.kt */
/* loaded from: classes6.dex */
public final class ssv implements rsv {
    public final int b;

    public ssv(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ssv) && this.b == ((ssv) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("EnsurePrepared(index="), this.b, ')');
    }
}
