package xsna;

/* compiled from: DatabaseSchemeLogger.kt */
/* loaded from: classes3.dex */
public final class p9g {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public p9g(String str, String str2, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9g)) {
            return false;
        }
        p9g p9gVar = (p9g) obj;
        return epx.f(this.a, p9gVar.a) && epx.f(this.b, p9gVar.b) && this.c == p9gVar.c && this.d == p9gVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColumnProps(name=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", isPrimaryKey=");
        sb.append(this.c);
        sb.append(", isNotNull=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
