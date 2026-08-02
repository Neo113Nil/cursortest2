package xsna;

/* compiled from: IdeasStoryAction.kt */
/* loaded from: classes6.dex */
public final class ysv implements rsv {
    public final int b;

    public ysv(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ysv) && this.b == ((ysv) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("PageStarted(index="), this.b, ')');
    }
}
