package defpackage;

/* loaded from: classes.dex */
public final class isk0 implements prv {
    public final boolean a;
    public final float b = Float.NaN;
    public final xfc c;
    public final long d;

    public isk0(boolean z, xfc xfcVar, long j) {
        this.a = z;
        this.c = xfcVar;
        this.d = j;
    }

    @Override // defpackage.prv
    public final cqh a(h8w h8wVar) {
        xfc xfcVar = this.c;
        if (xfcVar == null) {
            xfcVar = new ikf(6, this);
        }
        float f = this.b;
        return new arh(h8wVar, this.a, f, xfcVar, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isk0)) {
            return false;
        }
        isk0 isk0Var = (isk0) obj;
        if (this.a == isk0Var.a && y7m.b(this.b, isk0Var.b) && jl40.l(this.c, isk0Var.c)) {
            return ldc.c(this.d, isk0Var.d);
        }
        return false;
    }

    @Override // defpackage.prv
    public final int hashCode() {
        int c = g8e.c(this.b, Boolean.hashCode(this.a) * 31, 31);
        xfc xfcVar = this.c;
        int hashCode = xfcVar != null ? xfcVar.hashCode() : 0;
        int i = ldc.n;
        return Long.hashCode(this.d) + ((c + hashCode) * 31);
    }
}
