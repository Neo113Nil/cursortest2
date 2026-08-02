package xsna;

import java.util.List;

/* compiled from: MarketAlLReviewsCommunitiesModel.kt */
/* loaded from: classes18.dex */
public final class pr00 {
    public final int a;
    public final int b;
    public final boolean c;
    public final List<cf10> d;

    public pr00(int i, int i2, boolean z, List<cf10> list) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr00)) {
            return false;
        }
        pr00 pr00Var = (pr00) obj;
        return this.a == pr00Var.a && this.b == pr00Var.b && this.c == pr00Var.c && epx.f(this.d, pr00Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + qoy.b(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketAlLReviewsCommunitiesModel(count=");
        sb.append(this.a);
        sb.append(", lastId=");
        sb.append(this.b);
        sb.append(", hasNext=");
        sb.append(this.c);
        sb.append(", items=");
        return ms9.a(')', sb, this.d);
    }
}
