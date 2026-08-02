package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.api.model.createreview.CreateCommunityReviewData;
import com.vk.ecomm.reviews.model.sort.ReviewsSort;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: CommunityReviewsState.kt */
/* loaded from: classes18.dex */
public final class vzh implements km50 {
    public final zig0 A;
    public final boolean B;
    public final Throwable C;
    public final boolean D;
    public final String E;
    public final Integer F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final UserId b;
    public final boolean c;
    public final boolean d;
    public final Float e;
    public final Integer f;
    public final UserId g;
    public final Float h;
    public final int i;
    public final List<dye0> j;
    public final boolean k;
    public final boolean l;
    public final yo9 m;
    public final Map<Integer, txh> n;
    public final kzh o;
    public final Throwable p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final CreateCommunityReviewData t;
    public final String u;
    public final ReviewsSort v;
    public final int w;
    public final List<vd10> x;
    public final yig0 y;
    public final Map<UserId, big0> z;

    public vzh(UserId userId, boolean z, boolean z2, Float f, Integer num, UserId userId2, Float f2, int i, List<dye0> list, boolean z3, boolean z4, yo9 yo9Var, Map<Integer, txh> map, kzh kzhVar, Throwable th, boolean z5, boolean z6, boolean z7, CreateCommunityReviewData createCommunityReviewData, String str, ReviewsSort reviewsSort, int i2, List<vd10> list2, yig0 yig0Var, Map<UserId, big0> map2, zig0 zig0Var, boolean z8, Throwable th2, boolean z9, String str2, Integer num2, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.b = userId;
        this.c = z;
        this.d = z2;
        this.e = f;
        this.f = num;
        this.g = userId2;
        this.h = f2;
        this.i = i;
        this.j = list;
        this.k = z3;
        this.l = z4;
        this.m = yo9Var;
        this.n = map;
        this.o = kzhVar;
        this.p = th;
        this.q = z5;
        this.r = z6;
        this.s = z7;
        this.t = createCommunityReviewData;
        this.u = str;
        this.v = reviewsSort;
        this.w = i2;
        this.x = list2;
        this.y = yig0Var;
        this.z = map2;
        this.A = zig0Var;
        this.B = z8;
        this.C = th2;
        this.D = z9;
        this.E = str2;
        this.F = num2;
        this.G = z10;
        this.H = z11;
        this.I = z12;
        this.J = z13;
    }

    public static vzh a(vzh vzhVar, boolean z, boolean z2, UserId userId, Float f, int i, List list, boolean z3, boolean z4, yo9 yo9Var, Map map, kzh kzhVar, Throwable th, boolean z5, boolean z6, boolean z7, CreateCommunityReviewData createCommunityReviewData, String str, ReviewsSort reviewsSort, int i2, List list2, yig0 yig0Var, Map map2, zig0 zig0Var, boolean z8, Throwable th2, boolean z9, String str2, Integer num, boolean z10, boolean z11, boolean z12, boolean z13, int i3, int i4) {
        UserId userId2 = vzhVar.b;
        boolean z14 = (i3 & 2) != 0 ? vzhVar.c : z;
        boolean z15 = (i3 & 4) != 0 ? vzhVar.d : z2;
        Float f2 = vzhVar.e;
        boolean z16 = z14;
        boolean z17 = z15;
        Integer num2 = vzhVar.f;
        UserId userId3 = (i3 & 32) != 0 ? vzhVar.g : userId;
        Float f3 = (i3 & 64) != 0 ? vzhVar.h : f;
        int i5 = (i3 & 128) != 0 ? vzhVar.i : i;
        List list3 = (i3 & 256) != 0 ? vzhVar.j : list;
        boolean z18 = (i3 & 512) != 0 ? vzhVar.k : z3;
        boolean z19 = (i3 & 1024) != 0 ? vzhVar.l : z4;
        yo9 yo9Var2 = (i3 & 2048) != 0 ? vzhVar.m : yo9Var;
        Map map3 = (i3 & 4096) != 0 ? vzhVar.n : map;
        kzh kzhVar2 = (i3 & 8192) != 0 ? vzhVar.o : kzhVar;
        Throwable th3 = (i3 & 16384) != 0 ? vzhVar.p : th;
        boolean z20 = (i3 & 32768) != 0 ? vzhVar.q : z5;
        boolean z21 = (i3 & 65536) != 0 ? vzhVar.r : z6;
        boolean z22 = (i3 & 131072) != 0 ? vzhVar.s : z7;
        CreateCommunityReviewData createCommunityReviewData2 = (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? vzhVar.t : createCommunityReviewData;
        String str3 = (i3 & 524288) != 0 ? vzhVar.u : str;
        ReviewsSort reviewsSort2 = (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? vzhVar.v : reviewsSort;
        int i6 = (i3 & 2097152) != 0 ? vzhVar.w : i2;
        List list4 = (i3 & 4194304) != 0 ? vzhVar.x : list2;
        yig0 yig0Var2 = (i3 & 8388608) != 0 ? vzhVar.y : yig0Var;
        Map map4 = (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? vzhVar.z : map2;
        zig0 zig0Var2 = (i3 & 33554432) != 0 ? vzhVar.A : zig0Var;
        boolean z23 = (i3 & 67108864) != 0 ? vzhVar.B : z8;
        Throwable th4 = (i3 & 134217728) != 0 ? vzhVar.C : th2;
        boolean z24 = (i3 & 268435456) != 0 ? vzhVar.D : z9;
        String str4 = (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? vzhVar.E : str2;
        Integer num3 = (i3 & 1073741824) != 0 ? vzhVar.F : num;
        boolean z25 = (i3 & Integer.MIN_VALUE) != 0 ? vzhVar.G : z10;
        boolean z26 = (i4 & 1) != 0 ? vzhVar.H : z11;
        boolean z27 = (i4 & 2) != 0 ? vzhVar.I : z12;
        boolean z28 = (i4 & 4) != 0 ? vzhVar.J : z13;
        vzhVar.getClass();
        return new vzh(userId2, z16, z17, f2, num2, userId3, f3, i5, list3, z18, z19, yo9Var2, map3, kzhVar2, th3, z20, z21, z22, createCommunityReviewData2, str3, reviewsSort2, i6, list4, yig0Var2, map4, zig0Var2, z23, th4, z24, str4, num3, z25, z26, z27, z28);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzh)) {
            return false;
        }
        vzh vzhVar = (vzh) obj;
        return epx.f(this.b, vzhVar.b) && this.c == vzhVar.c && this.d == vzhVar.d && epx.f(this.e, vzhVar.e) && epx.f(this.f, vzhVar.f) && epx.f(this.g, vzhVar.g) && epx.f(this.h, vzhVar.h) && this.i == vzhVar.i && epx.f(this.j, vzhVar.j) && this.k == vzhVar.k && this.l == vzhVar.l && epx.f(this.m, vzhVar.m) && epx.f(this.n, vzhVar.n) && epx.f(this.o, vzhVar.o) && epx.f(this.p, vzhVar.p) && this.q == vzhVar.q && this.r == vzhVar.r && this.s == vzhVar.s && epx.f(this.t, vzhVar.t) && epx.f(this.u, vzhVar.u) && this.v == vzhVar.v && this.w == vzhVar.w && epx.f(this.x, vzhVar.x) && epx.f(this.y, vzhVar.y) && epx.f(this.z, vzhVar.z) && epx.f(this.A, vzhVar.A) && this.B == vzhVar.B && epx.f(this.C, vzhVar.C) && this.D == vzhVar.D && epx.f(this.E, vzhVar.E) && epx.f(this.F, vzhVar.F) && this.G == vzhVar.G && this.H == vzhVar.H && this.I == vzhVar.I && this.J == vzhVar.J;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d);
        Float f = this.e;
        int hashCode = (b + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.f;
        int a = bh10.a((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.g.b);
        Float f2 = this.h;
        int b2 = qoy.b(qoy.b(fw3.a(shy.a(this.i, (a + (f2 == null ? 0 : f2.hashCode())) * 31, 31), 31, this.j), 31, this.k), 31, this.l);
        yo9 yo9Var = this.m;
        int hashCode2 = (this.o.hashCode() + v11.a((b2 + (yo9Var == null ? 0 : yo9Var.hashCode())) * 31, 31, this.n)) * 31;
        Throwable th = this.p;
        int b3 = qoy.b(qoy.b(qoy.b((hashCode2 + (th == null ? 0 : th.hashCode())) * 31, 31, this.q), 31, this.r), 31, this.s);
        CreateCommunityReviewData createCommunityReviewData = this.t;
        int a2 = v11.a((this.y.hashCode() + fw3.a(shy.a(this.w, (this.v.hashCode() + urd0.a((b3 + (createCommunityReviewData == null ? 0 : createCommunityReviewData.hashCode())) * 31, 31, this.u)) * 31, 31), 31, this.x)) * 31, 31, this.z);
        zig0 zig0Var = this.A;
        int b4 = qoy.b((a2 + (zig0Var == null ? 0 : zig0Var.hashCode())) * 31, 31, this.B);
        Throwable th2 = this.C;
        int b5 = qoy.b((b4 + (th2 == null ? 0 : th2.hashCode())) * 31, 31, this.D);
        String str = this.E;
        int hashCode3 = (b5 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.F;
        return Boolean.hashCode(this.J) + qoy.b(qoy.b(qoy.b((hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.G), 31, this.H), 31, this.I);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityReviewsState(communityId=");
        sb.append(this.b);
        sb.append(", isCurrentUserHasEditorRole=");
        sb.append(this.c);
        sb.append(", isCurrentUserHasAdministratorRole=");
        sb.append(this.d);
        sb.append(", rateValue=");
        sb.append(this.e);
        sb.append(", rateCount=");
        sb.append(this.f);
        sb.append(", userId=");
        sb.append(this.g);
        sb.append(", communityRating=");
        sb.append(this.h);
        sb.append(", reviewsCount=");
        sb.append(this.i);
        sb.append(", marksStat=");
        sb.append(this.j);
        sb.append(", canAddReview=");
        sb.append(this.k);
        sb.append(", isAddReviewShow=");
        sb.append(this.l);
        sb.append(", canAddReviewError=");
        sb.append(this.m);
        sb.append(", items=");
        sb.append(this.n);
        sb.append(", page=");
        sb.append(this.o);
        sb.append(", throwable=");
        sb.append(this.p);
        sb.append(", isLoading=");
        sb.append(this.q);
        sb.append(", isReloadLoading=");
        sb.append(this.r);
        sb.append(", isScreenSpinnerVisible=");
        sb.append(this.s);
        sb.append(", createReviewData=");
        sb.append(this.t);
        sb.append(", faqUrl=");
        sb.append(this.u);
        sb.append(", sort=");
        sb.append(this.v);
        sb.append(", reviewFriendsTotal=");
        sb.append(this.w);
        sb.append(", reviewFriends=");
        sb.append(this.x);
        sb.append(", replyCreateData=");
        sb.append(this.y);
        sb.append(", usersAndGroups=");
        sb.append(this.z);
        sb.append(", replyEditData=");
        sb.append(this.A);
        sb.append(", isNextPageLoading=");
        sb.append(this.B);
        sb.append(", nextPageError=");
        sb.append(this.C);
        sb.append(", showYClientsImport=");
        sb.append(this.D);
        sb.append(", pinSubscriptionPriceId=");
        sb.append(this.E);
        sb.append(", pinSubscriptionPrice=");
        sb.append(this.F);
        sb.append(", hasActivePinSubscription=");
        sb.append(this.G);
        sb.append(", hasPinnedReview=");
        sb.append(this.H);
        sb.append(", isShowPinTopBarTooltip=");
        sb.append(this.I);
        sb.append(", isShowPinReviewItemOnboarding=");
        return defpackage.q0.a(sb, this.J, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vzh(UserId userId, Float f, Integer num) {
        this(userId, false, false, f, num, r6, null, 0, r9, false, false, null, r13, r14, null, false, false, false, null, "", r21, 0, r9, r0, r13, null, false, null, false, null, null, false, false, false, false);
        UserId userId2 = UserId.d;
        EmptyList emptyList = EmptyList.b;
        kzh kzhVar = new kzh(0);
        ReviewsSort reviewsSort = ReviewsSort.PUBLISHED_FROM_NEW_TO_OLD_SORT;
        yig0 yig0Var = new yig0(null, null, null, null);
        jgp jgpVar = jgp.b;
    }
}
