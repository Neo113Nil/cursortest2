package defpackage;

import defpackage.c3f;

/* loaded from: classes.dex */
public final class h54 extends c3f.e.d.a.b.AbstractC0020e.AbstractC0022b {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;

    public h54(int i, long j, long j2, String str, String str2) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = i;
    }

    @Override // c3f.e.d.a.b.AbstractC0020e.AbstractC0022b
    public final String a() {
        return this.c;
    }

    @Override // c3f.e.d.a.b.AbstractC0020e.AbstractC0022b
    public final int b() {
        return this.e;
    }

    @Override // c3f.e.d.a.b.AbstractC0020e.AbstractC0022b
    public final long c() {
        return this.d;
    }

    @Override // c3f.e.d.a.b.AbstractC0020e.AbstractC0022b
    public final long d() {
        return this.a;
    }

    @Override // c3f.e.d.a.b.AbstractC0020e.AbstractC0022b
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c3f.e.d.a.b.AbstractC0020e.AbstractC0022b)) {
            return false;
        }
        c3f.e.d.a.b.AbstractC0020e.AbstractC0022b abstractC0022b = (c3f.e.d.a.b.AbstractC0020e.AbstractC0022b) obj;
        if (this.a != abstractC0022b.d() || !this.b.equals(abstractC0022b.e())) {
            return false;
        }
        String str = this.c;
        if (str == null) {
            if (abstractC0022b.a() != null) {
                return false;
            }
        } else if (!str.equals(abstractC0022b.a())) {
            return false;
        }
        return this.d == abstractC0022b.c() && this.e == abstractC0022b.b();
    }

    public final int hashCode() {
        long j = this.a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.d;
        return this.e ^ ((hashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.a);
        sb.append(", symbol=");
        sb.append(this.b);
        sb.append(", file=");
        sb.append(this.c);
        sb.append(", offset=");
        sb.append(this.d);
        sb.append(", importance=");
        return oyr.m(this.e, "}", sb);
    }
}
