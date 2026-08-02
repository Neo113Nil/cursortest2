package xsna;

/* compiled from: StorefrontServicesAction.kt */
/* loaded from: classes18.dex */
public final class xml0 implements wml0 {
    public final long b;

    public xml0(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xml0) && this.b == ((xml0) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return vu5.a(')', this.b, new StringBuilder("Service(itemId="));
    }
}
