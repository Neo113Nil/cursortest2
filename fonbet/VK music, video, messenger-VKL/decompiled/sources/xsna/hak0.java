package xsna;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import xsna.uap;

/* compiled from: SnapshotElement.kt */
/* loaded from: classes4.dex */
public final class hak0<T extends uap> implements uap, jio, x980 {
    public final T a;
    public final Bitmap b;
    public final kif0 c;
    public final vap<T, hak0<T>> d;
    public final Object e;
    public final Matrix f;

    public hak0(T t, Bitmap bitmap, kif0 kif0Var, vap<T, hak0<T>> vapVar, Object obj) {
        this.a = t;
        this.b = bitmap;
        this.c = kif0Var;
        this.d = vapVar;
        this.e = obj;
        this.f = new Matrix();
    }

    @Override // xsna.jio
    public final void a(mlo mloVar) {
        mloVar.b(new rxz(this, 26));
    }

    @Override // xsna.uap
    public final uap copy() {
        hak0 hak0Var = new hak0(this.a, this.b, this.c, this.d, this.e);
        hak0Var.f.set(this.f);
        return hak0Var;
    }

    @Override // xsna.x980
    public final void d(Matrix matrix) {
        this.f.postConcat(matrix);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hak0)) {
            return false;
        }
        hak0 hak0Var = (hak0) obj;
        return epx.f(this.a, hak0Var.a) && epx.f(this.f, hak0Var.f);
    }

    @Override // xsna.uap
    public final Object getMeta() {
        return this.e;
    }

    @Override // xsna.uap
    public final int hashCode() {
        return this.f.hashCode() + ((this.a.hashCode() + (super.hashCode() * 31)) * 31);
    }

    public /* synthetic */ hak0(uap uapVar, Bitmap bitmap, kif0 kif0Var, vap vapVar) {
        this(uapVar, bitmap, kif0Var, vapVar, uapVar.getMeta());
    }
}
