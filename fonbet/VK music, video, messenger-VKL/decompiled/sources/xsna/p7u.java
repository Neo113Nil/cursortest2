package xsna;

/* compiled from: GoodItem.kt */
/* loaded from: classes18.dex */
public final class p7u {
    public final Float a;
    public final String b;

    public p7u(Float f, String str) {
        this.a = f;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7u)) {
            return false;
        }
        p7u p7uVar = (p7u) obj;
        return epx.f(this.a, p7uVar.a) && epx.f(this.b, p7uVar.b);
    }

    public final int hashCode() {
        Float f = this.a;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoodRating(rating=");
        sb.append(this.a);
        sb.append(", reviewsCountText=");
        return ho8.a(sb, this.b, ')');
    }
}
