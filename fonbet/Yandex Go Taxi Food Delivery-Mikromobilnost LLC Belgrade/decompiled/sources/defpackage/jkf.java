package defpackage;

/* loaded from: classes11.dex */
public final class jkf implements prv {
    public final long a;
    public final rrk0 b;

    public jkf(long j, rrk0 rrk0Var) {
        this.a = j;
        this.b = rrk0Var;
    }

    @Override // defpackage.prv
    public final cqh a(h8w h8wVar) {
        return new oqh(h8wVar, new ikf(0, this), this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkf)) {
            return false;
        }
        jkf jkfVar = (jkf) obj;
        return y7m.b(1000000.0f, 1000000.0f) && ldc.c(this.a, jkfVar.a) && this.b.equals(jkfVar.b);
    }

    @Override // defpackage.prv
    public final int hashCode() {
        int c = g8e.c(1000000.0f, Boolean.hashCode(true) * 31, 31);
        int i = ldc.n;
        return (this.b.hashCode() + qv10.c(c, 31, this.a)) * 31;
    }

    public final String toString() {
        StringBuilder v = b64.v("CustomNodeFactory(bounded=true, radius=", y7m.c(1000000.0f), ", color=", ldc.i(this.a), ", rippleAlpha=");
        v.append(this.b);
        v.append(", colorProducer=null)");
        return v.toString();
    }
}
