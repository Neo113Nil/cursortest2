package defpackage;

import defpackage.c3f;

/* loaded from: classes.dex */
public final class g44 extends c3f.c {
    public final String a;
    public final String b;

    public g44(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // c3f.c
    public final String a() {
        return this.a;
    }

    @Override // c3f.c
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c3f.c)) {
            return false;
        }
        c3f.c cVar = (c3f.c) obj;
        return this.a.equals(cVar.a()) && this.b.equals(cVar.b());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.a);
        sb.append(", value=");
        return oyr.t(sb, this.b, "}");
    }
}
