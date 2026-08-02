package defpackage;

/* loaded from: classes10.dex */
public final class jky extends kky {
    public final String a;
    public final hry0 b;

    public jky(String str, hry0 hry0Var) {
        this.a = str;
        this.b = hry0Var;
    }

    public static jky c(jky jkyVar, hry0 hry0Var) {
        String str = jkyVar.a;
        jkyVar.getClass();
        jkyVar.getClass();
        return new jky(str, hry0Var);
    }

    @Override // defpackage.kky
    public final smw0 a() {
        return null;
    }

    @Override // defpackage.kky
    public final hry0 b() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jky)) {
            return false;
        }
        jky jkyVar = (jky) obj;
        return jl40.l(this.a, jkyVar.a) && jl40.l(this.b, jkyVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        hry0 hry0Var = this.b;
        return (hashCode + (hry0Var != null ? hry0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return b64.p(new StringBuilder("LinkAnnotation.Url(url="), this.a, ')');
    }

    public /* synthetic */ jky(String str, hry0 hry0Var, int i) {
        this(str, hry0Var);
    }
}
