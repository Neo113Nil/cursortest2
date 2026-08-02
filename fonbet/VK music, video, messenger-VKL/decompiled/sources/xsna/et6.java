package xsna;

/* compiled from: BaselineShift.kt */
@vby
/* loaded from: classes11.dex */
public final class et6 {
    public final float a;

    public final boolean equals(Object obj) {
        if (obj instanceof et6) {
            return Float.compare(this.a, ((et6) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.a + ')';
    }
}
