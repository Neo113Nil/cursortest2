package defpackage;

/* loaded from: classes8.dex */
public final class gj implements lj {
    public final long a;
    public final Throwable b;

    public gj(long j, Throwable th) {
        this.a = j;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj)) {
            return false;
        }
        gj gjVar = (gj) obj;
        return this.a == gjVar.a && this.b.equals(gjVar.b);
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
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "User.AuthorizationFailure(id=" + this.a + ", failure=" + this.b.getMessage() + ')';
    }
}
