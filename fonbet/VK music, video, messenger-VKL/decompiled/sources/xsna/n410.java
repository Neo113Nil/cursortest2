package xsna;

import com.vk.dto.common.id.UserId;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* compiled from: MarketItemReviewsModel.kt */
/* loaded from: classes18.dex */
public final class n410 {
    public final int a;
    public final boolean b;
    public final String c;
    public final String d;
    public final Float e;
    public final LinkedHashMap f;
    public final Map<UserId, big0> g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final a l;

    /* compiled from: MarketItemReviewsModel.kt */
    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MarketItemReviewsBottomButton(text=");
            sb.append(this.a);
            sb.append(", link=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public n410(int i, boolean z, String str, String str2, Float f, LinkedHashMap linkedHashMap, MapBuilder mapBuilder, String str3, boolean z2, boolean z3, String str4, a aVar) {
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = f;
        this.f = linkedHashMap;
        this.g = mapBuilder;
        this.h = str3;
        this.i = z2;
        this.j = z3;
        this.k = str4;
        this.l = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n410)) {
            return false;
        }
        n410 n410Var = (n410) obj;
        return this.a == n410Var.a && this.b == n410Var.b && epx.f(this.c, n410Var.c) && epx.f(this.d, n410Var.d) && epx.f(this.e, n410Var.e) && this.f.equals(n410Var.f) && epx.f(this.g, n410Var.g) && epx.f(this.h, n410Var.h) && this.i == n410Var.i && this.j == n410Var.j && epx.f(this.k, n410Var.k) && epx.f(this.l, n410Var.l);
    }

    public final int hashCode() {
        int b = qoy.b(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int a2 = urd0.a((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        Float f = this.e;
        int a3 = urd0.a(qoy.b(qoy.b(urd0.a(v11.a(uf3.b(this.f, (a2 + (f == null ? 0 : f.hashCode())) * 31, 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        a aVar = this.l;
        return a3 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "MarketItemReviewsModel(reviewsCount=" + this.a + ", canAddReview=" + this.b + ", title=" + this.c + ", reviewsCountText=" + this.d + ", rating=" + this.e + ", reviews=" + this.f + ", usersAndGroupsNames=" + this.g + ", faqLink=" + this.h + ", showSort=" + this.i + ", showAdminDescription=" + this.j + ", ratingDescription=" + this.k + ", bottomButton=" + this.l + ')';
    }
}
