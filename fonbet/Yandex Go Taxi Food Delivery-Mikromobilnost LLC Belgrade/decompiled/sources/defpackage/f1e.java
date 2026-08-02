package defpackage;

/* loaded from: classes2.dex */
public final class f1e {
    public final String a;
    public final g1e b;

    public f1e(String str, g1e g1eVar) {
        this.a = str;
        this.b = g1eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1e)) {
            return false;
        }
        f1e f1eVar = (f1e) obj;
        return jl40.l(this.a, f1eVar.a) && jl40.l(this.b, f1eVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        g1e g1eVar = this.b;
        return hashCode + (g1eVar == null ? 0 : g1eVar.hashCode());
    }

    public final String toString() {
        return "Item(__typename=" + this.a + ", onTextProperties=" + this.b + ')';
    }
}
