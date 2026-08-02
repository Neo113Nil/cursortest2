package defpackage;

/* loaded from: classes10.dex */
public final class nif {
    public final String a;
    public final sls b;

    public nif(sls slsVar, String str) {
        this.a = str;
        this.b = slsVar;
    }

    public final sls a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nif)) {
            return false;
        }
        nif nifVar = (nif) obj;
        return jl40.l(this.a, nifVar.a) && this.b == nifVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomAccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
