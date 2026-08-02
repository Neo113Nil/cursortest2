package xsna;

/* compiled from: PhoneReuseVerdict.kt */
/* loaded from: classes15.dex */
public final class r3a0 {
    public final long a;

    public r3a0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r3a0) && this.a == ((r3a0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return vu5.a(')', this.a, new StringBuilder("WaitForPhoneReuse(phoneReuseTimeoutMs="));
    }
}
