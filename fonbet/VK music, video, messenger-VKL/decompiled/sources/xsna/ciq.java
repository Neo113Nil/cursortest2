package xsna;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes11.dex */
public final class ciq {
    public final float a;
    public final phr<Float> b;

    public ciq(float f, phr<Float> phrVar) {
        this.a = f;
        this.b = phrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ciq)) {
            return false;
        }
        ciq ciqVar = (ciq) obj;
        return Float.compare(this.a, ciqVar.a) == 0 && epx.f(this.b, ciqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
