package xsna;

import android.graphics.Matrix;
import java.util.List;

/* compiled from: PointsElement.kt */
/* loaded from: classes4.dex */
public final class mmb0 implements jio, x980 {
    public final lmb0 a;
    public final boolean b;
    public final Object c;
    public List<glb0> d;

    public mmb0(List<glb0> list, lmb0 lmb0Var, boolean z, Object obj) {
        this.a = lmb0Var;
        this.b = z;
        this.c = obj;
        this.d = list;
    }

    @Override // xsna.jio
    public final void a(mlo mloVar) {
        this.a.c(mloVar, this.d);
    }

    @Override // xsna.uap
    public final uap copy() {
        return new mmb0(this.d, this.a.copy(), this.b, this.c);
    }

    @Override // xsna.x980
    public final void d(Matrix matrix) {
        this.d = omb0.b(this.d, matrix);
        lmb0 lmb0Var = this.a;
        w980 w980Var = lmb0Var instanceof w980 ? (w980) lmb0Var : null;
        if (w980Var != null) {
            w980Var.d(matrix);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mmb0)) {
            return false;
        }
        mmb0 mmb0Var = (mmb0) obj;
        return epx.f(this.d, mmb0Var.d) && epx.f(this.a, mmb0Var.a) && this.b == mmb0Var.b;
    }

    @Override // xsna.uap
    public final Object getMeta() {
        return this.c;
    }

    @Override // xsna.uap
    public final int hashCode() {
        return Boolean.hashCode(this.b) + ((this.a.hashCode() + (this.d.hashCode() * 31)) * 31);
    }
}
