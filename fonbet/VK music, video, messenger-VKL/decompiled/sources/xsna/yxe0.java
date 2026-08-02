package xsna;

/* compiled from: RatingBlockRatingValue.kt */
@vby
/* loaded from: classes18.dex */
public final class yxe0 {
    public final float a;

    public final boolean equals(Object obj) {
        if (obj instanceof yxe0) {
            return Float.compare(this.a, ((yxe0) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "RatingBlockRatingValue(ratingValue=" + this.a + ')';
    }
}
