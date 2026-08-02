package defpackage;

/* loaded from: classes10.dex */
public final class iky extends kky {
    public final String a;
    public final hry0 b;

    public iky(String str, hry0 hry0Var, smw0 smw0Var) {
        this.a = str;
        this.b = hry0Var;
    }

    public static iky c(iky ikyVar, hry0 hry0Var) {
        return new iky(ikyVar.a, hry0Var, null);
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
        if (!(obj instanceof iky)) {
            return false;
        }
        iky ikyVar = (iky) obj;
        return this.a.equals(ikyVar.a) && jl40.l(this.b, ikyVar.b) && jl40.l(null, null);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        hry0 hry0Var = this.b;
        return ((hashCode + (hry0Var != null ? hry0Var.hashCode() : 0)) * 31) + 0;
    }

    public final String toString() {
        return b64.p(new StringBuilder("LinkAnnotation.Clickable(tag="), this.a, ')');
    }
}
