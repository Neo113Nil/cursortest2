package xsna;

/* compiled from: PlaylistHeader.kt */
/* loaded from: classes3.dex */
public final class vvw {
    public final String a;
    public final boolean b;
    public final gzs<s3q0> c;

    public vvw(String str, gzs gzsVar, boolean z) {
        this.a = str;
        this.b = z;
        this.c = gzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvw)) {
            return false;
        }
        vvw vvwVar = (vvw) obj;
        return epx.f(this.a, vvwVar.a) && this.b == vvwVar.b && epx.f(this.c, vvwVar.c);
    }

    public final int hashCode() {
        int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
        gzs<s3q0> gzsVar = this.c;
        return b + (gzsVar == null ? 0 : gzsVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InfoBlockTitle(title=");
        sb.append(this.a);
        sb.append(", isExplicit=");
        sb.append(this.b);
        sb.append(", onTitleClick=");
        return uf3.d(sb, this.c, ')');
    }
}
