package defpackage;

import defpackage.c3f;

/* loaded from: classes.dex */
public final class d54 extends c3f.e.d.a.b.AbstractC0018d {
    public final String a;
    public final String b;
    public final long c;

    public d54(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // c3f.e.d.a.b.AbstractC0018d
    public final long a() {
        return this.c;
    }

    @Override // c3f.e.d.a.b.AbstractC0018d
    public final String b() {
        return this.b;
    }

    @Override // c3f.e.d.a.b.AbstractC0018d
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c3f.e.d.a.b.AbstractC0018d)) {
            return false;
        }
        c3f.e.d.a.b.AbstractC0018d abstractC0018d = (c3f.e.d.a.b.AbstractC0018d) obj;
        return this.a.equals(abstractC0018d.c()) && this.b.equals(abstractC0018d.b()) && this.c == abstractC0018d.a();
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return ((int) ((j >>> 32) ^ j)) ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", address=");
        return oyr.n(this.c, "}", sb);
    }
}
