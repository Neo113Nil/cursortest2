package xsna;

/* compiled from: JoinCallParams.kt */
/* loaded from: classes7.dex */
public final class nzx {
    public final boolean a;
    public final s89 b;

    public nzx(boolean z, s89 s89Var) {
        this.a = z;
        this.b = s89Var;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nzx)) {
            return false;
        }
        nzx nzxVar = (nzx) obj;
        return this.a == nzxVar.a && epx.f(this.b, nzxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "JoinCallParams(withVideo=" + this.a + ", callPreview=" + this.b + ')';
    }
}
