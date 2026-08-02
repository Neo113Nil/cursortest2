package xsna;

/* compiled from: CommunityReviewsPageContent.kt */
/* loaded from: classes18.dex */
public final class kzh {
    public final int a;
    public final Integer b;

    public kzh() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzh)) {
            return false;
        }
        kzh kzhVar = (kzh) obj;
        return this.a == kzhVar.a && epx.f(this.b, kzhVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityReviewsPageContent(lastId=");
        sb.append(this.a);
        sb.append(", lastResponseReviewCount=");
        return uqi.b(sb, this.b, ')');
    }

    public /* synthetic */ kzh(int i) {
        this(0, null);
    }

    public kzh(int i, Integer num) {
        this.a = i;
        this.b = num;
    }
}
