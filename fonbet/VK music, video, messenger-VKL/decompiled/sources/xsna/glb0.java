package xsna;

/* compiled from: Point.kt */
/* loaded from: classes4.dex */
public final class glb0 {
    public final float a;
    public final float b;
    public final Float c;

    public glb0(float f, float f2, Float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glb0)) {
            return false;
        }
        glb0 glb0Var = (glb0) obj;
        return Float.compare(this.a, glb0Var.a) == 0 && Float.compare(this.b, glb0Var.b) == 0 && epx.f(this.c, glb0Var.c);
    }

    public final int hashCode() {
        int a = io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31);
        Float f = this.c;
        return a + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        StringBuilder a = bxj0.a("Point(x=", this.a, ", y=", this.b, ", pressure=");
        a.append(this.c);
        a.append(")");
        return a.toString();
    }
}
