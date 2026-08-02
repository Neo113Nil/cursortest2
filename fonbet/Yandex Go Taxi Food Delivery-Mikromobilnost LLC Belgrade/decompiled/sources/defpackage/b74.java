package defpackage;

/* loaded from: classes.dex */
public final class b74 extends f3w {
    public final String a;
    public final long b;
    public final long c;

    public b74(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.f3w
    public final String a() {
        return this.a;
    }

    @Override // defpackage.f3w
    public final long b() {
        return this.c;
    }

    @Override // defpackage.f3w
    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f3w)) {
            return false;
        }
        f3w f3wVar = (f3w) obj;
        return this.a.equals(f3wVar.a()) && this.b == f3wVar.c() && this.c == f3wVar.b();
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        long j2 = this.c;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", tokenCreationTimestamp=");
        return oyr.n(this.c, "}", sb);
    }
}
