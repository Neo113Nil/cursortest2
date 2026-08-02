package defpackage;

/* loaded from: classes2.dex */
public final class pn3 implements qn3 {
    public final long a;

    public pn3(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pn3) && this.a == ((pn3) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return b64.o(new StringBuilder("Success(userId="), this.a, ')');
    }
}
