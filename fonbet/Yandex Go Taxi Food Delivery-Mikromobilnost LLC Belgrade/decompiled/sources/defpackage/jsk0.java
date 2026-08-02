package defpackage;

/* loaded from: classes10.dex */
public final class jsk0 implements prv {
    public final boolean a;
    public final float b;
    public final long c;

    public jsk0(float f, long j, boolean z) {
        this.a = z;
        this.b = f;
        this.c = j;
    }

    @Override // defpackage.prv
    public final cqh a(h8w h8wVar) {
        ikf ikfVar = new ikf(7, this);
        return new arh(h8wVar, this.a, this.b, ikfVar, 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsk0)) {
            return false;
        }
        jsk0 jsk0Var = (jsk0) obj;
        if (this.a == jsk0Var.a && y7m.b(this.b, jsk0Var.b)) {
            return ldc.c(this.c, jsk0Var.c);
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
