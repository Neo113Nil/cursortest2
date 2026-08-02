package xsna;

import java.util.List;

/* compiled from: CommunityCreateReviewConfigModel.kt */
/* loaded from: classes18.dex */
public final class n7k {
    public final List<dak> a;
    public final String b;

    public n7k() {
        throw null;
    }

    public n7k(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7k)) {
            return false;
        }
        n7k n7kVar = (n7k) obj;
        return epx.f(this.a, n7kVar.a) && epx.f(this.b, n7kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CreateCommunityReviewConfigModel(comment=" + this.a + ", faqUrl=" + ((Object) ("CreateCommunityReviewFaqUrl(url=" + this.b + ')')) + ')';
    }
}
