package xsna;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.List;

/* compiled from: PathElement.kt */
/* loaded from: classes4.dex */
public final class hq90 implements jio, x980 {
    public final cq90 a;
    public final eq90 b;
    public final boolean c;
    public final Object d;
    public List<glb0> e;
    public final Path f;

    public hq90(List<glb0> list, Path path, cq90 cq90Var, eq90 eq90Var, boolean z, Object obj) {
        this.a = cq90Var;
        this.b = eq90Var;
        this.c = z;
        this.d = obj;
        this.e = list;
        this.f = path;
    }

    @Override // xsna.jio
    public final void a(mlo mloVar) {
        this.a.a(mloVar, this.f);
    }

    @Override // xsna.uap
    public final uap copy() {
        return new hq90(this.e, new Path(this.f), this.a.copy(), this.b, this.c, this.d);
    }

    @Override // xsna.x980
    public final void d(Matrix matrix) {
        this.e = omb0.b(this.e, matrix);
        this.f.transform(matrix);
        cq90 cq90Var = this.a;
        w980 w980Var = cq90Var instanceof w980 ? (w980) cq90Var : null;
        if (w980Var != null) {
            w980Var.d(matrix);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hq90)) {
            return false;
        }
        hq90 hq90Var = (hq90) obj;
        return epx.f(this.e, hq90Var.e) && epx.f(this.a, hq90Var.a) && this.c == hq90Var.c;
    }

    @Override // xsna.uap
    public final Object getMeta() {
        return this.d;
    }

    @Override // xsna.uap
    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.a.hashCode() + (this.e.hashCode() * 31)) * 31);
    }
}
