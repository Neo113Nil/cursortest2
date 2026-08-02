package xsna;

import com.vk.ecomm.reviews.impl.allreviews.presentation.MarketAllReviewsTabTypes;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MarketAllReviewsState.kt */
/* loaded from: classes18.dex */
public final class ft00 implements km50 {
    public final String b;
    public final int c;
    public final int d;
    public final List<a610> e;
    public final String f;
    public final int g;
    public final List<df10> h;
    public final String i;
    public final int j;
    public final int k;
    public final List<cf10> l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final Throwable r;
    public final Throwable s;
    public final MarketAllReviewsTabTypes t;

    public ft00() {
        this(0);
    }

    public static ft00 a(ft00 ft00Var, String str, int i, int i2, List list, String str2, int i3, List list2, String str3, int i4, int i5, List list3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Throwable th, Throwable th2, MarketAllReviewsTabTypes marketAllReviewsTabTypes, int i6) {
        String str4 = (i6 & 1) != 0 ? ft00Var.b : str;
        int i7 = (i6 & 2) != 0 ? ft00Var.c : i;
        int i8 = (i6 & 4) != 0 ? ft00Var.d : i2;
        List list4 = (i6 & 8) != 0 ? ft00Var.e : list;
        String str5 = (i6 & 16) != 0 ? ft00Var.f : str2;
        int i9 = (i6 & 32) != 0 ? ft00Var.g : i3;
        List list5 = (i6 & 64) != 0 ? ft00Var.h : list2;
        String str6 = (i6 & 128) != 0 ? ft00Var.i : str3;
        int i10 = (i6 & 256) != 0 ? ft00Var.j : i4;
        int i11 = (i6 & 512) != 0 ? ft00Var.k : i5;
        List list6 = (i6 & 1024) != 0 ? ft00Var.l : list3;
        boolean z6 = (i6 & 2048) != 0 ? ft00Var.m : z;
        boolean z7 = (i6 & 4096) != 0 ? ft00Var.n : z2;
        boolean z8 = (i6 & 8192) != 0 ? ft00Var.o : z3;
        String str7 = str4;
        boolean z9 = (i6 & 16384) != 0 ? ft00Var.p : z4;
        boolean z10 = (i6 & 32768) != 0 ? ft00Var.q : z5;
        Throwable th3 = (i6 & 65536) != 0 ? ft00Var.r : th;
        Throwable th4 = (i6 & 131072) != 0 ? ft00Var.s : th2;
        MarketAllReviewsTabTypes marketAllReviewsTabTypes2 = (i6 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? ft00Var.t : marketAllReviewsTabTypes;
        ft00Var.getClass();
        return new ft00(str7, i7, i8, list4, str5, i9, list5, str6, i10, i11, list6, z6, z7, z8, z9, z10, th3, th4, marketAllReviewsTabTypes2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if (r3.g <= r3.h.size()) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        if (this.p || this.q || this.n) {
            return true;
        }
        MarketAllReviewsTabTypes marketAllReviewsTabTypes = MarketAllReviewsTabTypes.MARKET_ITEM;
        MarketAllReviewsTabTypes marketAllReviewsTabTypes2 = this.t;
        if (marketAllReviewsTabTypes2 == marketAllReviewsTabTypes) {
        }
        if (marketAllReviewsTabTypes2 != MarketAllReviewsTabTypes.COMMUNITY || !this.m) {
            return true;
        }
        return this.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft00)) {
            return false;
        }
        ft00 ft00Var = (ft00) obj;
        return epx.f(this.b, ft00Var.b) && this.c == ft00Var.c && this.d == ft00Var.d && epx.f(this.e, ft00Var.e) && epx.f(this.f, ft00Var.f) && this.g == ft00Var.g && epx.f(this.h, ft00Var.h) && epx.f(this.i, ft00Var.i) && this.j == ft00Var.j && this.k == ft00Var.k && epx.f(this.l, ft00Var.l) && this.m == ft00Var.m && this.n == ft00Var.n && this.o == ft00Var.o && this.p == ft00Var.p && this.q == ft00Var.q && epx.f(this.r, ft00Var.r) && epx.f(this.s, ft00Var.s) && this.t == ft00Var.t;
    }

    public final int hashCode() {
        String str = this.b;
        int a = fw3.a(shy.a(this.d, shy.a(this.c, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31, this.e);
        String str2 = this.f;
        int a2 = fw3.a(shy.a(this.g, (a + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.h);
        String str3 = this.i;
        int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(fw3.a(shy.a(this.k, shy.a(this.j, (a2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q);
        Throwable th = this.r;
        int hashCode = (b + (th == null ? 0 : th.hashCode())) * 31;
        Throwable th2 = this.s;
        return this.t.hashCode() + ((hashCode + (th2 != null ? th2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MarketAllReviewsState(itemForReviewsTitle=" + this.b + ", itemForReviewsCount=" + this.c + ", itemForReviewsSelectedPosition=" + this.d + ", itemsForReview=" + this.e + ", goodReviewsTitle=" + this.f + ", goodReviewsCount=" + this.g + ", goodItemReviews=" + this.h + ", communityReviewsTitle=" + this.i + ", communityReviewsCount=" + this.j + ", communityReviewsLastId=" + this.k + ", communityReviews=" + this.l + ", hasNextCommunityReviewItems=" + this.m + ", isRefreshing=" + this.n + ", isReviewActionLoading=" + this.o + ", isLoading=" + this.p + ", isNextPageLoading=" + this.q + ", error=" + this.r + ", paginationError=" + this.s + ", selectedTab=" + this.t + ')';
    }

    public ft00(String str, int i, int i2, List<a610> list, String str2, int i3, List<df10> list2, String str3, int i4, int i5, List<cf10> list3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Throwable th, Throwable th2, MarketAllReviewsTabTypes marketAllReviewsTabTypes) {
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = list;
        this.f = str2;
        this.g = i3;
        this.h = list2;
        this.i = str3;
        this.j = i4;
        this.k = i5;
        this.l = list3;
        this.m = z;
        this.n = z2;
        this.o = z3;
        this.p = z4;
        this.q = z5;
        this.r = th;
        this.s = th2;
        this.t = marketAllReviewsTabTypes;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ft00(int i) {
        this(null, 0, 0, r4, null, 0, r4, null, 0, 0, r4, false, false, false, false, false, null, null, MarketAllReviewsTabTypes.MARKET_ITEM);
        EmptyList emptyList = EmptyList.b;
    }
}
