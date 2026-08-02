package defpackage;

/* loaded from: classes10.dex */
public final class nyo {
    public final Object a;
    public final int b;

    public nyo(int i, xt10 xt10Var) {
        this.a = xt10Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nyo)) {
            return false;
        }
        nyo nyoVar = (nyo) obj;
        return this.a == nyoVar.a && this.b == nyoVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
