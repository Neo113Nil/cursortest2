package xsna;

/* compiled from: VoipMovieUpdate.kt */
/* loaded from: classes7.dex */
public final class zsw0 {
    public final long a;
    public final boolean b;
    public final float c;
    public final long d;
    public final p3x0 e;

    public zsw0(long j, boolean z, float f, long j2, p3x0 p3x0Var) {
        this.a = j;
        this.b = z;
        this.c = f;
        this.d = j2;
        this.e = p3x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zsw0) {
            zsw0 zsw0Var = (zsw0) obj;
            if (this.a == zsw0Var.a && this.b == zsw0Var.b && Float.compare(this.c, zsw0Var.c) == 0 && this.d == zsw0Var.d && epx.f(this.e, zsw0Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int a = bh10.a(io.reactivex.rxjava3.subjects.b.a(this.c, qoy.b(Long.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d);
        p3x0 p3x0Var = this.e;
        return a + (p3x0Var == null ? 0 : p3x0Var.hashCode());
    }

    public final String toString() {
        return "VoipMovieUpdate(id=" + ((Object) hl80.a(this.a)) + ", isPlaying=" + this.b + ", volume=" + this.c + ", position=" + ((Object) ("VideoPosition(value=" + this.d + ')')) + ", video=" + this.e + ')';
    }
}
