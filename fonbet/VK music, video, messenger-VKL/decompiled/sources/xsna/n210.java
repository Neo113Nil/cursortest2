package xsna;

import com.vk.dto.market.MarketItemType;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MarketItemReviewModel.kt */
/* loaded from: classes18.dex */
public final class n210 {
    public final int a;
    public final long b;
    public final int c;
    public final big0 d;
    public final Float e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final List<y2u0> j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final List<k4g0> n;
    public final boolean o;
    public final int p;
    public final MarketItemType q;

    public n210(int i, long j, int i2, big0 big0Var, Float f, String str, String str2, String str3, boolean z, List<y2u0> list, boolean z2, boolean z3, boolean z4, List<k4g0> list2, boolean z5, int i3, MarketItemType marketItemType) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = big0Var;
        this.e = f;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = z;
        this.j = list;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = list2;
        this.o = z5;
        this.p = i3;
        this.q = marketItemType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static n210 a(n210 n210Var, boolean z, boolean z2, ArrayList arrayList, int i) {
        int i2 = n210Var.a;
        long j = n210Var.b;
        int i3 = n210Var.c;
        big0 big0Var = n210Var.d;
        Float f = n210Var.e;
        String str = n210Var.f;
        String str2 = n210Var.g;
        String str3 = n210Var.h;
        boolean z3 = (i & 256) != 0 ? n210Var.i : z;
        List<y2u0> list = n210Var.j;
        boolean z4 = z3;
        boolean z5 = n210Var.k;
        boolean z6 = n210Var.l;
        boolean z7 = (i & 4096) != 0 ? n210Var.m : z2;
        List list2 = (i & 8192) != 0 ? n210Var.n : arrayList;
        boolean z8 = n210Var.o;
        int i4 = n210Var.p;
        MarketItemType marketItemType = n210Var.q;
        n210Var.getClass();
        return new n210(i2, j, i3, big0Var, f, str, str2, str3, z4, list, z5, z6, z7, list2, z8, i4, marketItemType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n210)) {
            return false;
        }
        n210 n210Var = (n210) obj;
        return this.a == n210Var.a && this.b == n210Var.b && this.c == n210Var.c && epx.f(this.d, n210Var.d) && epx.f(this.e, n210Var.e) && epx.f(this.f, n210Var.f) && epx.f(this.g, n210Var.g) && epx.f(this.h, n210Var.h) && this.i == n210Var.i && epx.f(this.j, n210Var.j) && this.k == n210Var.k && this.l == n210Var.l && this.m == n210Var.m && epx.f(this.n, n210Var.n) && this.o == n210Var.o && this.p == n210Var.p && this.q == n210Var.q;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + shy.a(this.c, bh10.a(Integer.hashCode(this.a) * 31, 31, this.b), 31)) * 31;
        Float f = this.e;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return this.q.hashCode() + shy.a(this.p, qoy.b(fw3.a(qoy.b(qoy.b(qoy.b(fw3.a(qoy.b((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31);
    }

    public final String toString() {
        return "MarketItemReviewModel(id=" + this.a + ", itemId=" + this.b + ", date=" + this.c + ", user=" + this.d + ", rating=" + this.e + ", pros=" + this.f + ", cons=" + this.g + ", comment=" + this.h + ", isExpanded=" + this.i + ", images=" + this.j + ", canUpdate=" + this.k + ", canDelete=" + this.l + ", isDeleted=" + this.m + ", replies=" + this.n + ", canAnswer=" + this.o + ", repliesCount=" + this.p + ", marketItemType=" + this.q + ')';
    }
}
