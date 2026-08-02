package defpackage;

import defpackage.c3f;

/* loaded from: classes.dex */
public final class p54 extends c3f.e.d.AbstractC0026e {
    public final c3f.e.d.AbstractC0026e.b a;
    public final String b;
    public final String c;
    public final long d;

    public p54(c3f.e.d.AbstractC0026e.b bVar, String str, String str2, long j) {
        this.a = bVar;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    @Override // c3f.e.d.AbstractC0026e
    public final String a() {
        return this.b;
    }

    @Override // c3f.e.d.AbstractC0026e
    public final String b() {
        return this.c;
    }

    @Override // c3f.e.d.AbstractC0026e
    public final c3f.e.d.AbstractC0026e.b c() {
        return this.a;
    }

    @Override // c3f.e.d.AbstractC0026e
    public final long d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c3f.e.d.AbstractC0026e)) {
            return false;
        }
        c3f.e.d.AbstractC0026e abstractC0026e = (c3f.e.d.AbstractC0026e) obj;
        return this.a.equals(abstractC0026e.c()) && this.b.equals(abstractC0026e.a()) && this.c.equals(abstractC0026e.b()) && this.d == abstractC0026e.d();
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        return ((int) ((j >>> 32) ^ j)) ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.a);
        sb.append(", parameterKey=");
        sb.append(this.b);
        sb.append(", parameterValue=");
        sb.append(this.c);
        sb.append(", templateVersion=");
        return oyr.n(this.d, "}", sb);
    }
}
