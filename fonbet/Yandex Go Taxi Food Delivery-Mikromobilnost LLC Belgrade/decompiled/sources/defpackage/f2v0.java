package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class f2v0 {
    public final String a;
    public final h2d0 b;
    public final Map c;

    public f2v0(String str, h2d0 h2d0Var, Map map) {
        this.a = str;
        this.b = h2d0Var;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2v0)) {
            return false;
        }
        f2v0 f2v0Var = (f2v0) obj;
        return jl40.l(this.a, f2v0Var.a) && this.b.equals(f2v0Var.b) && jl40.l(this.c, f2v0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Map map = this.c;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubtitleContent(subtitle=");
        sb.append(this.a);
        sb.append(", subtitleDrawableHolder=");
        sb.append(this.b);
        sb.append(", pluralForms=");
        return smw0.n(sb, this.c, ')');
    }
}
