package xsna;

/* compiled from: CommunityReviewsRatingItemModel.kt */
/* loaded from: classes5.dex */
public final class mzh extends s4h {
    public final float b;
    public final String c;
    public final int d;

    public mzh(float f, int i, String str) {
        this.b = f;
        this.c = str;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzh)) {
            return false;
        }
        mzh mzhVar = (mzh) obj;
        return Float.compare(this.b, mzhVar.b) == 0 && epx.f(this.c, mzhVar.c) && this.d == mzhVar.d;
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.b) * 31;
        String str = this.c;
        return Integer.hashCode(this.d) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityReviewsRatingItemModel(mark=");
        sb.append(this.b);
        sb.append(", formattedRating=");
        sb.append(this.c);
        sb.append(", reviewsCount=");
        return vu5.b(sb, this.d, ')');
    }
}
