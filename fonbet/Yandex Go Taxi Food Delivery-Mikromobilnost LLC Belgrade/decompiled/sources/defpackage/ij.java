package defpackage;

/* loaded from: classes8.dex */
public final class ij implements lj {
    public final long a;

    public ij(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ij) && this.a == ((ij) obj).a;
    }

    @Override // defpackage.lj
    public final String getAuthToken() {
        return null;
    }

    @Override // defpackage.lj
    public final Long getId() {
        return Long.valueOf(this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return b64.o(new StringBuilder("User.GettingToken(id="), this.a, ')');
    }
}
