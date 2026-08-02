package xsna;

/* compiled from: BookingRecordsScreenPatch.kt */
/* loaded from: classes18.dex */
public final class aw7 implements xv7 {
    public final int b;

    public aw7(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aw7) && this.b == ((aw7) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("Loading(page="), this.b, ')');
    }
}
