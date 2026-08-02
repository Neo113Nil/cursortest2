package xsna;

/* compiled from: SuperAppQueueAccessError.kt */
/* loaded from: classes5.dex */
public final class pan0 {
    public final int a;
    public final boolean b;

    public pan0(int i) {
        this.a = i;
        this.b = i == 2 || i == 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pan0) && this.a == ((pan0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return h5s.c(this.a, ", error=0)", new StringBuilder("SuperAppQueueAccessError(failed="));
    }
}
