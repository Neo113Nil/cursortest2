package xsna;

/* compiled from: RowColumnImpl.kt */
/* loaded from: classes11.dex */
public final class xpy extends d730<ypy> {
    public final float a;
    public final boolean b;

    public xpy(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        xpy xpyVar = obj instanceof xpy ? (xpy) obj : null;
        return xpyVar != null && this.a == xpyVar.a && this.b == xpyVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    @Override // xsna.d730
    public final ypy r() {
        ypy ypyVar = new ypy();
        ypyVar.p = this.a;
        ypyVar.q = this.b;
        return ypyVar;
    }

    @Override // xsna.d730
    public final void s(ypy ypyVar) {
        ypy ypyVar2 = ypyVar;
        ypyVar2.p = this.a;
        ypyVar2.q = this.b;
    }
}
