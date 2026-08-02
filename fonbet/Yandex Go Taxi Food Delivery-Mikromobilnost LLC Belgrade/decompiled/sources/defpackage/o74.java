package defpackage;

import android.opengl.EGLSurface;

/* loaded from: classes10.dex */
public final class o74 extends ry80 {
    public final EGLSurface a;
    public final int b;
    public final int c;

    public o74(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface == null) {
            ny61.t("Null eglSurface");
            throw null;
        }
        this.a = eGLSurface;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.ry80
    public final EGLSurface a() {
        return this.a;
    }

    @Override // defpackage.ry80
    public final int b() {
        return this.c;
    }

    @Override // defpackage.ry80
    public final int c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ry80)) {
            return false;
        }
        ry80 ry80Var = (ry80) obj;
        return this.a.equals(ry80Var.a()) && this.b == ry80Var.c() && this.c == ry80Var.b();
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return oyr.m(this.c, "}", sb);
    }
}
