package defpackage;

import defpackage.c3f;

/* loaded from: classes.dex */
public final class e44 extends c3f.a.AbstractC0010a {
    public final String a;
    public final String b;
    public final String c;

    public e44(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // c3f.a.AbstractC0010a
    public final String a() {
        return this.a;
    }

    @Override // c3f.a.AbstractC0010a
    public final String b() {
        return this.c;
    }

    @Override // c3f.a.AbstractC0010a
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c3f.a.AbstractC0010a)) {
            return false;
        }
        c3f.a.AbstractC0010a abstractC0010a = (c3f.a.AbstractC0010a) obj;
        return this.a.equals(abstractC0010a.a()) && this.b.equals(abstractC0010a.c()) && this.c.equals(abstractC0010a.b());
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.a);
        sb.append(", libraryName=");
        sb.append(this.b);
        sb.append(", buildId=");
        return oyr.t(sb, this.c, "}");
    }
}
