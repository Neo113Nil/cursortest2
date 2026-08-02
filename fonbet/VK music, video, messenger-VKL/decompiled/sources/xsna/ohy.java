package xsna;

/* compiled from: Animator.kt */
/* loaded from: classes11.dex */
public final class ohy<T> {
    public final float a;
    public final T b;
    public final huo c;

    public ohy(float f, T t, huo huoVar) {
        this.a = f;
        this.b = t;
        this.c = huoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohy)) {
            return false;
        }
        ohy ohyVar = (ohy) obj;
        return Float.compare(this.a, ohyVar.a) == 0 && epx.f(this.b, ohyVar.b) && epx.f(this.c, ohyVar.c);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.a) * 31;
        T t = this.b;
        return this.c.hashCode() + ((hashCode + (t == null ? 0 : t.hashCode())) * 31);
    }

    public final String toString() {
        return "Keyframe(fraction=" + this.a + ", value=" + this.b + ", interpolator=" + this.c + ')';
    }
}
