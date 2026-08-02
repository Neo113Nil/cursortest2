package defpackage;

/* loaded from: classes11.dex */
public final class lyo {
    public final Object a;
    public final int b;

    public lyo(vt10 vt10Var, int i) {
        this.a = vt10Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lyo)) {
            return false;
        }
        lyo lyoVar = (lyo) obj;
        return this.a == lyoVar.a && this.b == lyoVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
