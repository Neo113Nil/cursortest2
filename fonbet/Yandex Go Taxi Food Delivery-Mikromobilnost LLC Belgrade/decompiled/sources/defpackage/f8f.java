package defpackage;

/* loaded from: classes2.dex */
public final class f8f {
    public final String a;
    public final lxw b;

    public f8f(String str, lxw lxwVar) {
        this.a = str;
        this.b = lxwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8f)) {
            return false;
        }
        f8f f8fVar = (f8f) obj;
        return this.a.equals(f8fVar.a) && this.b.equals(f8fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExternalCreate(__typename=" + this.a + ", invoice=" + this.b + ')';
    }
}
