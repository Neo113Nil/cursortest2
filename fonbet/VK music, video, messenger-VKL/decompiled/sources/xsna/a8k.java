package xsna;

import java.util.List;

/* compiled from: CreateMarketItemReviewConfigModel.kt */
/* loaded from: classes18.dex */
public final class a8k {
    public final List<dak> a;
    public final List<dak> b;
    public final List<dak> c;
    public final String d;

    public a8k() {
        throw null;
    }

    public a8k(List list, List list2, List list3, String str) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8k)) {
            return false;
        }
        a8k a8kVar = (a8k) obj;
        return epx.f(this.a, a8kVar.a) && epx.f(this.b, a8kVar.b) && epx.f(this.c, a8kVar.c) && epx.f(this.d, a8kVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + fw3.a(fw3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "CreateMarketItemReviewConfigModel(comment=" + this.a + ", cons=" + this.b + ", pros=" + this.c + ", faqUrl=" + ((Object) ("CreateMarketItemReviewFaqUrl(url=" + this.d + ')')) + ')';
    }
}
