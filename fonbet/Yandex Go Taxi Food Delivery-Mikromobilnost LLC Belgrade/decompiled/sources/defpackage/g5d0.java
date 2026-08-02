package defpackage;

import defpackage.i5d0;

/* loaded from: classes2.dex */
public final class g5d0 extends i5d0.a {
    public final long a;

    public g5d0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g5d0) && this.a == ((g5d0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return b64.o(new StringBuilder("Login(userId="), this.a, ')');
    }
}
