package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.Image;
import com.vk.dto.common.IntegrationInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.market.MarketItemType;
import com.vk.ecomm.reviews.model.sort.ReviewsSort;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Map;
import xsna.n410;

/* compiled from: MarketItemReviewsState.kt */
/* loaded from: classes18.dex */
public final class x410 implements km50 {
    public final UserId A;
    public final s410 B;
    public final Map<UserId, big0> C;
    public final boolean D;
    public final boolean E;
    public final String F;
    public final n410.a G;
    public final UserId b;
    public final long c;
    public final Image d;
    public final String e;
    public final int f;
    public final boolean g;
    public final String h;
    public final String i;
    public final Float j;
    public final Map<Integer, n210> k;
    public final boolean l;
    public final boolean m;
    public final String n;
    public final String o;
    public final MarketItemType p;
    public final IntegrationInfo q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final Throwable v;
    public final Throwable w;
    public final ReviewsSort x;
    public final int y;
    public final Integer z;

    public x410() {
        this(0);
    }

    public static x410 a(x410 x410Var, UserId userId, long j, Image image, String str, int i, boolean z, String str2, String str3, Float f, Map map, boolean z2, boolean z3, String str4, String str5, MarketItemType marketItemType, IntegrationInfo integrationInfo, boolean z4, boolean z5, boolean z6, boolean z7, Throwable th, Throwable th2, ReviewsSort reviewsSort, int i2, Integer num, UserId userId2, s410 s410Var, Map map2, boolean z8, boolean z9, String str6, n410.a aVar, int i3) {
        UserId userId3 = (i3 & 1) != 0 ? x410Var.b : userId;
        long j2 = (i3 & 2) != 0 ? x410Var.c : j;
        Image image2 = (i3 & 4) != 0 ? x410Var.d : image;
        String str7 = (i3 & 8) != 0 ? x410Var.e : str;
        int i4 = (i3 & 16) != 0 ? x410Var.f : i;
        boolean z10 = (i3 & 32) != 0 ? x410Var.g : z;
        String str8 = (i3 & 64) != 0 ? x410Var.h : str2;
        String str9 = (i3 & 128) != 0 ? x410Var.i : str3;
        Float f2 = (i3 & 256) != 0 ? x410Var.j : f;
        Map map3 = (i3 & 512) != 0 ? x410Var.k : map;
        boolean z11 = (i3 & 1024) != 0 ? x410Var.l : z2;
        boolean z12 = (i3 & 2048) != 0 ? x410Var.m : z3;
        String str10 = (i3 & 4096) != 0 ? x410Var.n : str4;
        UserId userId4 = userId3;
        String str11 = (i3 & 8192) != 0 ? x410Var.o : str5;
        MarketItemType marketItemType2 = (i3 & 16384) != 0 ? x410Var.p : marketItemType;
        IntegrationInfo integrationInfo2 = (i3 & 32768) != 0 ? x410Var.q : integrationInfo;
        boolean z13 = (i3 & 65536) != 0 ? x410Var.r : z4;
        boolean z14 = (i3 & 131072) != 0 ? x410Var.s : z5;
        boolean z15 = (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? x410Var.t : z6;
        boolean z16 = (i3 & 524288) != 0 ? x410Var.u : z7;
        Throwable th3 = (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? x410Var.v : th;
        Throwable th4 = (i3 & 2097152) != 0 ? x410Var.w : th2;
        ReviewsSort reviewsSort2 = (i3 & 4194304) != 0 ? x410Var.x : reviewsSort;
        int i5 = (i3 & 8388608) != 0 ? x410Var.y : i2;
        Integer num2 = (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? x410Var.z : num;
        UserId userId5 = (i3 & 33554432) != 0 ? x410Var.A : userId2;
        s410 s410Var2 = (i3 & 67108864) != 0 ? x410Var.B : s410Var;
        Map map4 = (i3 & 134217728) != 0 ? x410Var.C : map2;
        boolean z17 = (i3 & 268435456) != 0 ? x410Var.D : z8;
        boolean z18 = (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? x410Var.E : z9;
        String str12 = (i3 & 1073741824) != 0 ? x410Var.F : str6;
        n410.a aVar2 = (i3 & Integer.MIN_VALUE) != 0 ? x410Var.G : aVar;
        x410Var.getClass();
        return new x410(userId4, j2, image2, str7, i4, z10, str8, str9, f2, map3, z11, z12, str10, str11, marketItemType2, integrationInfo2, z13, z14, z15, z16, th3, th4, reviewsSort2, i5, num2, userId5, s410Var2, map4, z17, z18, str12, aVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x410)) {
            return false;
        }
        x410 x410Var = (x410) obj;
        return epx.f(this.b, x410Var.b) && this.c == x410Var.c && epx.f(this.d, x410Var.d) && epx.f(this.e, x410Var.e) && this.f == x410Var.f && this.g == x410Var.g && epx.f(this.h, x410Var.h) && epx.f(this.i, x410Var.i) && epx.f(this.j, x410Var.j) && epx.f(this.k, x410Var.k) && this.l == x410Var.l && this.m == x410Var.m && epx.f(this.n, x410Var.n) && epx.f(this.o, x410Var.o) && this.p == x410Var.p && epx.f(this.q, x410Var.q) && this.r == x410Var.r && this.s == x410Var.s && this.t == x410Var.t && this.u == x410Var.u && epx.f(this.v, x410Var.v) && epx.f(this.w, x410Var.w) && this.x == x410Var.x && this.y == x410Var.y && epx.f(this.z, x410Var.z) && epx.f(this.A, x410Var.A) && epx.f(this.B, x410Var.B) && epx.f(this.C, x410Var.C) && this.D == x410Var.D && this.E == x410Var.E && epx.f(this.F, x410Var.F) && epx.f(this.G, x410Var.G);
    }

    public final int hashCode() {
        int a = bh10.a(Long.hashCode(this.b.b) * 31, 31, this.c);
        Image image = this.d;
        int a2 = urd0.a(urd0.a(qoy.b(shy.a(this.f, urd0.a((a + (image == null ? 0 : image.hashCode())) * 31, 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i);
        Float f = this.j;
        int a3 = urd0.a(urd0.a(qoy.b(qoy.b(v11.a((a2 + (f == null ? 0 : f.hashCode())) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
        MarketItemType marketItemType = this.p;
        int hashCode = (a3 + (marketItemType == null ? 0 : marketItemType.hashCode())) * 31;
        IntegrationInfo integrationInfo = this.q;
        int b = qoy.b(qoy.b(qoy.b(qoy.b((hashCode + (integrationInfo == null ? 0 : integrationInfo.hashCode())) * 31, 31, this.r), 31, this.s), 31, this.t), 31, this.u);
        Throwable th = this.v;
        int hashCode2 = (b + (th == null ? 0 : th.hashCode())) * 31;
        Throwable th2 = this.w;
        int a4 = shy.a(this.y, (this.x.hashCode() + ((hashCode2 + (th2 == null ? 0 : th2.hashCode())) * 31)) * 31, 31);
        Integer num = this.z;
        int a5 = urd0.a(qoy.b(qoy.b(v11.a((this.B.hashCode() + bh10.a((a4 + (num == null ? 0 : num.hashCode())) * 31, 31, this.A.b)) * 31, 31, this.C), 31, this.D), 31, this.E), 31, this.F);
        n410.a aVar = this.G;
        return a5 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "MarketItemReviewsState(communityId=" + this.b + ", productId=" + this.c + ", productImage=" + this.d + ", productName=" + this.e + ", reviewsCount=" + this.f + ", canAddReview=" + this.g + ", title=" + this.h + ", reviewsCountText=" + this.i + ", rating=" + this.j + ", reviews=" + this.k + ", isModerator=" + this.l + ", isCurrentUserHasEditorRole=" + this.m + ", faqUrl=" + this.n + ", groupName=" + this.o + ", marketItemType=" + this.p + ", integrationInfo=" + this.q + ", isLoading=" + this.r + ", isRefresh=" + this.s + ", isNextPageLoading=" + this.t + ", isScreenSpinnerVisible=" + this.u + ", throwable=" + this.v + ", paginationError=" + this.w + ", sort=" + this.x + ", offset=" + this.y + ", lastResponseReviewCount=" + this.z + ", userId=" + this.A + ", replyCreateData=" + this.B + ", usersAndGroups=" + this.C + ", showSort=" + this.D + ", showAdminDescription=" + this.E + ", ratingDescription=" + this.F + ", bottomButton=" + this.G + ')';
    }

    public x410(UserId userId, long j, Image image, String str, int i, boolean z, String str2, String str3, Float f, Map<Integer, n210> map, boolean z2, boolean z3, String str4, String str5, MarketItemType marketItemType, IntegrationInfo integrationInfo, boolean z4, boolean z5, boolean z6, boolean z7, Throwable th, Throwable th2, ReviewsSort reviewsSort, int i2, Integer num, UserId userId2, s410 s410Var, Map<UserId, big0> map2, boolean z8, boolean z9, String str6, n410.a aVar) {
        this.b = userId;
        this.c = j;
        this.d = image;
        this.e = str;
        this.f = i;
        this.g = z;
        this.h = str2;
        this.i = str3;
        this.j = f;
        this.k = map;
        this.l = z2;
        this.m = z3;
        this.n = str4;
        this.o = str5;
        this.p = marketItemType;
        this.q = integrationInfo;
        this.r = z4;
        this.s = z5;
        this.t = z6;
        this.u = z7;
        this.v = th;
        this.w = th2;
        this.x = reviewsSort;
        this.y = i2;
        this.z = num;
        this.A = userId2;
        this.B = s410Var;
        this.C = map2;
        this.D = z8;
        this.E = z9;
        this.F = str6;
        this.G = aVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ x410(int i) {
        this(r1, 0L, null, "", 0, false, "", "", null, r11, false, false, "", "", null, null, false, false, false, false, null, null, r24, 0, null, r1, r0, r11, true, false, "", null);
        UserId userId = UserId.d;
        ReviewsSort reviewsSort = ReviewsSort.NEWEST_SORT;
        s410 s410Var = new s410(0);
        jgp jgpVar = jgp.b;
    }
}
