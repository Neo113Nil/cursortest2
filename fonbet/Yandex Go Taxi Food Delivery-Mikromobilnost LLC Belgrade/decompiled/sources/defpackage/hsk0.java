package defpackage;

/* loaded from: classes.dex */
public final class hsk0 implements prv {
    public final boolean a;
    public final float b;
    public final long c;

    public hsk0(float f, long j, boolean z) {
        this.a = z;
        this.b = f;
        this.c = j;
    }

    @Override // defpackage.prv
    public final cqh a(h8w h8wVar) {
        ikf ikfVar = new ikf(5, this);
        return new arh(h8wVar, this.a, this.b, ikfVar, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsk0)) {
            return false;
        }
        hsk0 hsk0Var = (hsk0) obj;
        if (this.a == hsk0Var.a && y7m.b(this.b, hsk0Var.b)) {
            return ldc.c(this.c, hsk0Var.c);
        }
        return false;
    }

    @Override // defpackage.prv
    public final int hashCode() {
        int c = g8e.c(this.b, Boolean.hashCode(this.a) * 31, 961);
        int i = ldc.n;
        return Long.hashCode(this.c) + c;
    }
}
