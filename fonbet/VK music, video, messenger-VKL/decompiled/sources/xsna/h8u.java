package xsna;

import com.vk.dto.common.IntegrationInfo;
import com.vk.dto.market.MarketItemType;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: GoodReviewsComposeHolder.kt */
/* loaded from: classes18.dex */
public final class h8u extends c8u {
    public final long b;
    public final long c;
    public final String d;
    public final boolean e;
    public final Float f;
    public final String g;
    public final int h;
    public final boolean i;
    public final List<hfz> j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final String n;
    public final MarketItemType o;
    public final IntegrationInfo p;
    public final boolean q;
    public final boolean r;
    public final String s;
    public final a t;

    /* compiled from: GoodReviewsComposeHolder.kt */
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

    /* JADX WARN: Multi-variable type inference failed */
    public h8u(long j, long j2, String str, boolean z, Float f, String str2, int i, boolean z2, List<? extends hfz> list, boolean z3, boolean z4, boolean z5, String str3, MarketItemType marketItemType, IntegrationInfo integrationInfo, boolean z6, boolean z7, String str4, a aVar) {
        super(R.string.good_reviews_block_title);
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = z;
        this.f = f;
        this.g = str2;
        this.h = i;
        this.i = z2;
        this.j = list;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = str3;
        this.o = marketItemType;
        this.p = integrationInfo;
        this.q = z6;
        this.r = z7;
        this.s = str4;
        this.t = aVar;
    }

    public static h8u c(h8u h8uVar, List list, int i) {
        long j = h8uVar.b;
        long j2 = h8uVar.c;
        String str = h8uVar.d;
        boolean z = h8uVar.e;
        Float f = h8uVar.f;
        String str2 = h8uVar.g;
        int i2 = h8uVar.h;
        boolean z2 = h8uVar.i;
        List list2 = (i & 256) != 0 ? h8uVar.j : list;
        boolean z3 = h8uVar.k;
        boolean z4 = (i & 1024) != 0 ? h8uVar.l : true;
        boolean z5 = h8uVar.m;
        boolean z6 = z4;
        List list3 = list2;
        String str3 = h8uVar.n;
        MarketItemType marketItemType = h8uVar.o;
        IntegrationInfo integrationInfo = h8uVar.p;
        boolean z7 = h8uVar.q;
        boolean z8 = h8uVar.r;
        String str4 = h8uVar.s;
        a aVar = h8uVar.t;
        h8uVar.getClass();
        return new h8u(j, j2, str, z, f, str2, i2, z2, list3, z3, z6, z5, str3, marketItemType, integrationInfo, z7, z8, str4, aVar);
    }

    @Override // xsna.c8u
    public final boolean a(c8u c8uVar) {
        return c8uVar.equals(this);
    }

    @Override // xsna.c8u
    public final boolean b(c8u c8uVar) {
        return c8uVar instanceof h8u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8u)) {
            return false;
        }
        h8u h8uVar = (h8u) obj;
        return this.b == h8uVar.b && this.c == h8uVar.c && this.d.equals(h8uVar.d) && this.e == h8uVar.e && epx.f(this.f, h8uVar.f) && epx.f(this.g, h8uVar.g) && this.h == h8uVar.h && this.i == h8uVar.i && epx.f(this.j, h8uVar.j) && this.k == h8uVar.k && this.l == h8uVar.l && this.m == h8uVar.m && epx.f(this.n, h8uVar.n) && this.o == h8uVar.o && epx.f(this.p, h8uVar.p) && this.q == h8uVar.q && this.r == h8uVar.r && epx.f(this.s, h8uVar.s) && epx.f(this.t, h8uVar.t);
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(bh10.a(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e);
        Float f = this.f;
        int hashCode = (b + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.g;
        int a2 = urd0.a(qoy.b(qoy.b(qoy.b(fw3.a(qoy.b(shy.a(this.h, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
        MarketItemType marketItemType = this.o;
        int hashCode2 = (a2 + (marketItemType == null ? 0 : marketItemType.hashCode())) * 31;
        IntegrationInfo integrationInfo = this.p;
        int a3 = urd0.a(qoy.b(qoy.b((hashCode2 + (integrationInfo == null ? 0 : integrationInfo.hashCode())) * 31, 31, this.q), 31, this.r), 31, this.s);
        a aVar = this.t;
        return a3 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "GoodReviewsItem(itemId=" + this.b + ", ownerId=" + this.c + ", title=" + this.d + ", isTitleVisible=" + this.e + ", mark=" + this.f + ", markText=" + this.g + ", reviewCount=" + this.h + ", isAddReviewButtonVisible=" + this.i + ", reviews=" + this.j + ", showEmptyView=" + this.k + ", isShowFirstReview=" + this.l + ", isAdmin=" + this.m + ", faqLink=" + this.n + ", marketItemType=" + this.o + ", integrationInfo=" + this.p + ", showSort=" + this.q + ", showAdminDescription=" + this.r + ", ratingDescription=" + this.s + ", bottomButton=" + this.t + ')';
    }
}
