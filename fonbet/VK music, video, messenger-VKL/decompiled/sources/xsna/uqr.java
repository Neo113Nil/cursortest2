package xsna;

/* compiled from: FloatingActionButton.kt */
/* loaded from: classes11.dex */
public final class uqr {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public uqr(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof uqr)) {
            return false;
        }
        uqr uqrVar = (uqr) obj;
        if (pco.b(this.a, uqrVar.a) && pco.b(this.b, uqrVar.b) && pco.b(this.c, uqrVar.c)) {
            return pco.b(this.d, uqrVar.d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }
}
