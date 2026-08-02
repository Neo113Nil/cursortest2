package xsna;

/* compiled from: AndroidContentCaptureManager.android.kt */
/* loaded from: classes11.dex */
public final class tfj {
    public final int a;
    public final long b;
    public final ufj c;
    public final b1u0 d;

    public tfj(int i, long j, ufj ufjVar, b1u0 b1u0Var) {
        this.a = i;
        this.b = j;
        this.c = ufjVar;
        this.d = b1u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfj)) {
            return false;
        }
        tfj tfjVar = (tfj) obj;
        return this.a == tfjVar.a && this.b == tfjVar.b && this.c == tfjVar.c && epx.f(this.d, tfjVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + bh10.a(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        b1u0 b1u0Var = this.d;
        return hashCode + (b1u0Var == null ? 0 : b1u0Var.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ')';
    }
}
