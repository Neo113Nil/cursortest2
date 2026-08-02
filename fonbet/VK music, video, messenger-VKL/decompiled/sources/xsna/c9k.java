package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.api.model.createreview.UploadImageModel;
import com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.model.CreateMarketItemReviewData;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: CreateMarketItemReviewState.kt */
/* loaded from: classes18.dex */
public final class c9k implements km50 {
    public final CreateMarketItemReviewData A;
    public final tlo0 B;
    public final tlo0 C;
    public final int b;
    public final a8k c;
    public final String d;
    public final w9k e;
    public final Integer f;
    public final String g;
    public final w9k h;
    public final Integer i;
    public final String j;
    public final w9k k;
    public final Integer l;
    public final Long m;
    public final String n;
    public final UserId o;
    public final String p;
    public final String q;
    public final float r;
    public final boolean s;
    public final String t;
    public final String u;
    public final boolean v;
    public final boolean w;
    public final List<UploadImageModel> x;
    public final boolean y;
    public final boolean z;

    public c9k() {
        this(0);
    }

    public static c9k a(c9k c9kVar, a8k a8kVar, String str, w9k w9kVar, Integer num, String str2, w9k w9kVar2, Integer num2, String str3, w9k w9kVar3, Integer num3, Long l, String str4, UserId userId, String str5, String str6, float f, String str7, String str8, boolean z, boolean z2, List list, boolean z3, boolean z4, CreateMarketItemReviewData createMarketItemReviewData, tlo0 tlo0Var, tlo0 tlo0Var2, int i) {
        int i2 = c9kVar.b;
        a8k a8kVar2 = (i & 2) != 0 ? c9kVar.c : a8kVar;
        String str9 = (i & 4) != 0 ? c9kVar.d : str;
        w9k w9kVar4 = (i & 8) != 0 ? c9kVar.e : w9kVar;
        Integer num4 = (i & 16) != 0 ? c9kVar.f : num;
        String str10 = (i & 32) != 0 ? c9kVar.g : str2;
        w9k w9kVar5 = (i & 64) != 0 ? c9kVar.h : w9kVar2;
        Integer num5 = (i & 128) != 0 ? c9kVar.i : num2;
        String str11 = (i & 256) != 0 ? c9kVar.j : str3;
        w9k w9kVar6 = (i & 512) != 0 ? c9kVar.k : w9kVar3;
        Integer num6 = (i & 1024) != 0 ? c9kVar.l : num3;
        Long l2 = (i & 2048) != 0 ? c9kVar.m : l;
        String str12 = (i & 4096) != 0 ? c9kVar.n : str4;
        UserId userId2 = (i & 8192) != 0 ? c9kVar.o : userId;
        String str13 = (i & 16384) != 0 ? c9kVar.p : str5;
        String str14 = (i & 32768) != 0 ? c9kVar.q : str6;
        float f2 = (i & 65536) != 0 ? c9kVar.r : f;
        boolean z5 = (i & 131072) != 0 ? c9kVar.s : true;
        String str15 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? c9kVar.t : str7;
        String str16 = (i & 524288) != 0 ? c9kVar.u : str8;
        boolean z6 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? c9kVar.v : z;
        boolean z7 = (i & 2097152) != 0 ? c9kVar.w : z2;
        List list2 = (i & 4194304) != 0 ? c9kVar.x : list;
        boolean z8 = (i & 8388608) != 0 ? c9kVar.y : z3;
        boolean z9 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? c9kVar.z : z4;
        CreateMarketItemReviewData createMarketItemReviewData2 = (i & 33554432) != 0 ? c9kVar.A : createMarketItemReviewData;
        tlo0 tlo0Var3 = (i & 67108864) != 0 ? c9kVar.B : tlo0Var;
        tlo0 tlo0Var4 = (i & 134217728) != 0 ? c9kVar.C : tlo0Var2;
        c9kVar.getClass();
        return new c9k(i2, a8kVar2, str9, w9kVar4, num4, str10, w9kVar5, num5, str11, w9kVar6, num6, l2, str12, userId2, str13, str14, f2, z5, str15, str16, z6, z7, list2, z8, z9, createMarketItemReviewData2, tlo0Var3, tlo0Var4);
    }

    public final boolean b() {
        if (this.s) {
            return false;
        }
        if (this.j.length() > 0 || this.g.length() > 0 || this.d.length() > 0 || this.r > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return true;
        }
        List<UploadImageModel> list = this.x;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((UploadImageModel) it.next()).d() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        CreateMarketItemReviewData createMarketItemReviewData = this.A;
        return (createMarketItemReviewData != null ? createMarketItemReviewData.g : null) != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9k)) {
            return false;
        }
        c9k c9kVar = (c9k) obj;
        return this.b == c9kVar.b && epx.f(this.c, c9kVar.c) && epx.f(this.d, c9kVar.d) && epx.f(this.e, c9kVar.e) && epx.f(this.f, c9kVar.f) && epx.f(this.g, c9kVar.g) && epx.f(this.h, c9kVar.h) && epx.f(this.i, c9kVar.i) && epx.f(this.j, c9kVar.j) && epx.f(this.k, c9kVar.k) && epx.f(this.l, c9kVar.l) && epx.f(this.m, c9kVar.m) && epx.f(this.n, c9kVar.n) && epx.f(this.o, c9kVar.o) && epx.f(this.p, c9kVar.p) && epx.f(this.q, c9kVar.q) && Float.compare(this.r, c9kVar.r) == 0 && this.s == c9kVar.s && epx.f(this.t, c9kVar.t) && epx.f(this.u, c9kVar.u) && this.v == c9kVar.v && this.w == c9kVar.w && epx.f(this.x, c9kVar.x) && this.y == c9kVar.y && this.z == c9kVar.z && epx.f(this.A, c9kVar.A) && epx.f(this.B, c9kVar.B) && epx.f(this.C, c9kVar.C);
    }

    public final boolean h() {
        Object obj;
        List<UploadImageModel> list;
        if (b() && c()) {
            List list2 = null;
            CreateMarketItemReviewData createMarketItemReviewData = this.A;
            String str = createMarketItemReviewData != null ? createMarketItemReviewData.c : null;
            if (str == null) {
                str = "";
            }
            if (!str.equals(this.j)) {
                return true;
            }
            String str2 = createMarketItemReviewData != null ? createMarketItemReviewData.d : null;
            if (str2 == null) {
                str2 = "";
            }
            if (!str2.equals(this.d)) {
                return true;
            }
            String str3 = createMarketItemReviewData != null ? createMarketItemReviewData.e : null;
            if (!(str3 != null ? str3 : "").equals(this.g)) {
                return true;
            }
            if (createMarketItemReviewData != null && (list = createMarketItemReviewData.f) != null) {
                list2 = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    Integer d = ((UploadImageModel) it.next()).d();
                    if (d != null) {
                        list2.add(d);
                    }
                }
            }
            if (list2 == null) {
                list2 = EmptyList.b;
            }
            List<UploadImageModel> list3 = this.x;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                Integer d2 = ((UploadImageModel) it2.next()).d();
                if (d2 != null) {
                    arrayList.add(d2);
                }
            }
            if (!epx.f(list2, arrayList)) {
                return true;
            }
            Float valueOf = Float.valueOf(this.r);
            if (createMarketItemReviewData == null || (obj = createMarketItemReviewData.b) == null) {
                obj = 0;
            }
            if (!valueOf.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        a8k a8kVar = this.c;
        int a = urd0.a((hashCode + (a8kVar == null ? 0 : a8kVar.hashCode())) * 31, 31, this.d);
        w9k w9kVar = this.e;
        int hashCode2 = (a + (w9kVar == null ? 0 : w9kVar.hashCode())) * 31;
        Integer num = this.f;
        int a2 = urd0.a((hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.g);
        w9k w9kVar2 = this.h;
        int hashCode3 = (a2 + (w9kVar2 == null ? 0 : w9kVar2.hashCode())) * 31;
        Integer num2 = this.i;
        int a3 = urd0.a((hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.j);
        w9k w9kVar3 = this.k;
        int hashCode4 = (a3 + (w9kVar3 == null ? 0 : w9kVar3.hashCode())) * 31;
        Integer num3 = this.l;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l = this.m;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.n;
        int b = qoy.b(io.reactivex.rxjava3.subjects.b.a(this.r, urd0.a(urd0.a(bh10.a((hashCode6 + (str == null ? 0 : str.hashCode())) * 31, 31, this.o.b), 31, this.p), 31, this.q), 31), 31, this.s);
        String str2 = this.t;
        int hashCode7 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.u;
        int b2 = qoy.b(qoy.b(fw3.a(qoy.b(qoy.b((hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z);
        CreateMarketItemReviewData createMarketItemReviewData = this.A;
        int hashCode8 = (b2 + (createMarketItemReviewData == null ? 0 : createMarketItemReviewData.hashCode())) * 31;
        tlo0 tlo0Var = this.B;
        int hashCode9 = (hashCode8 + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31;
        tlo0 tlo0Var2 = this.C;
        return hashCode9 + (tlo0Var2 != null ? tlo0Var2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateMarketItemReviewState(maxImageAttaches=");
        sb.append(this.b);
        sb.append(", config=");
        sb.append(this.c);
        sb.append(", pros=");
        sb.append(this.d);
        sb.append(", prosHint=");
        sb.append(this.e);
        sb.append(", prosMaxLength=");
        sb.append(this.f);
        sb.append(", cons=");
        sb.append(this.g);
        sb.append(", consHint=");
        sb.append(this.h);
        sb.append(", consMaxLength=");
        sb.append(this.i);
        sb.append(", comment=");
        sb.append(this.j);
        sb.append(", commentHint=");
        sb.append(this.k);
        sb.append(", commentMaxLength=");
        sb.append(this.l);
        sb.append(", productId=");
        sb.append(this.m);
        sb.append(", productImage=");
        sb.append(this.n);
        sb.append(", communityId=");
        sb.append(this.o);
        sb.append(", userName=");
        sb.append(this.p);
        sb.append(", productName=");
        sb.append(this.q);
        sb.append(", rating=");
        sb.append(this.r);
        sb.append(", reviewSent=");
        sb.append(this.s);
        sb.append(", resultTitle=");
        sb.append(this.t);
        sb.append(", resultDescription=");
        sb.append(this.u);
        sb.append(", isReviewSending=");
        sb.append(this.v);
        sb.append(", isBottomBarVisible=");
        sb.append(this.w);
        sb.append(", reviewImages=");
        sb.append(this.x);
        sb.append(", isLoading=");
        sb.append(this.y);
        sb.append(", isError=");
        sb.append(this.z);
        sb.append(", initialState=");
        sb.append(this.A);
        sb.append(", errorTitle=");
        sb.append(this.B);
        sb.append(", errorDescription=");
        return bt.a(sb, this.C, ')');
    }

    public c9k(int i, a8k a8kVar, String str, w9k w9kVar, Integer num, String str2, w9k w9kVar2, Integer num2, String str3, w9k w9kVar3, Integer num3, Long l, String str4, UserId userId, String str5, String str6, float f, boolean z, String str7, String str8, boolean z2, boolean z3, List<UploadImageModel> list, boolean z4, boolean z5, CreateMarketItemReviewData createMarketItemReviewData, tlo0 tlo0Var, tlo0 tlo0Var2) {
        this.b = i;
        this.c = a8kVar;
        this.d = str;
        this.e = w9kVar;
        this.f = num;
        this.g = str2;
        this.h = w9kVar2;
        this.i = num2;
        this.j = str3;
        this.k = w9kVar3;
        this.l = num3;
        this.m = l;
        this.n = str4;
        this.o = userId;
        this.p = str5;
        this.q = str6;
        this.r = f;
        this.s = z;
        this.t = str7;
        this.u = str8;
        this.v = z2;
        this.w = z3;
        this.x = list;
        this.y = z4;
        this.z = z5;
        this.A = createMarketItemReviewData;
        this.B = tlo0Var;
        this.C = tlo0Var2;
    }

    public c9k(int i) {
        this(5, null, "", null, null, "", null, null, "", null, null, null, null, UserId.d, "", "", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, null, false, true, EmptyList.b, false, false, null, null, null);
    }
}
