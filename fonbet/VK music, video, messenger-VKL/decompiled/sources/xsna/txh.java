package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.ecomm.reviews.model.communities.ReviewSourceType;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CommunityReviewItemModel.kt */
/* loaded from: classes18.dex */
public final class txh {
    public final int a;
    public final int b;
    public final int c;
    public final big0 d;
    public final String e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final List<List<jxh>> i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final int p;
    public final List<k4g0> q;
    public final ReviewSourceType r;
    public final boolean s;
    public final boolean t;
    public final boolean u;

    /* JADX WARN: Multi-variable type inference failed */
    public txh(int i, int i2, int i3, big0 big0Var, String str, int i4, boolean z, boolean z2, List<? extends List<jxh>> list, boolean z3, boolean z4, boolean z5, int i5, boolean z6, boolean z7, int i6, List<k4g0> list2, ReviewSourceType reviewSourceType, boolean z8, boolean z9, boolean z10) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = big0Var;
        this.e = str;
        this.f = i4;
        this.g = z;
        this.h = z2;
        this.i = list;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = i5;
        this.n = z6;
        this.o = z7;
        this.p = i6;
        this.q = list2;
        this.r = reviewSourceType;
        this.s = z8;
        this.t = z9;
        this.u = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static txh a(txh txhVar, int i, boolean z, boolean z2, boolean z3, ArrayList arrayList, boolean z4, int i2) {
        int i3;
        List list;
        boolean z5;
        boolean z6;
        int i4 = txhVar.a;
        int i5 = txhVar.b;
        int i6 = txhVar.c;
        big0 big0Var = txhVar.d;
        String str = txhVar.e;
        int i7 = (i2 & 32) != 0 ? txhVar.f : i;
        boolean z7 = (i2 & 64) != 0 ? txhVar.g : z;
        boolean z8 = (i2 & 128) != 0 ? txhVar.h : z2;
        List<List<jxh>> list2 = txhVar.i;
        boolean z9 = (i2 & 512) != 0 ? txhVar.j : z3;
        boolean z10 = txhVar.k;
        int i8 = i7;
        boolean z11 = z7;
        boolean z12 = z8;
        boolean z13 = z9;
        boolean z14 = txhVar.l;
        int i9 = txhVar.m;
        boolean z15 = txhVar.n;
        boolean z16 = txhVar.o;
        int i10 = txhVar.p;
        if ((i2 & 65536) != 0) {
            i3 = i10;
            list = txhVar.q;
        } else {
            i3 = i10;
            list = arrayList;
        }
        ReviewSourceType reviewSourceType = txhVar.r;
        boolean z17 = txhVar.s;
        boolean z18 = txhVar.t;
        if ((i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
            z5 = z18;
            z6 = txhVar.u;
        } else {
            z5 = z18;
            z6 = z4;
        }
        txhVar.getClass();
        return new txh(i4, i5, i6, big0Var, str, i8, z11, z12, list2, z13, z10, z14, i9, z15, z16, i3, list, reviewSourceType, z17, z5, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txh)) {
            return false;
        }
        txh txhVar = (txh) obj;
        return this.a == txhVar.a && this.b == txhVar.b && this.c == txhVar.c && epx.f(this.d, txhVar.d) && epx.f(this.e, txhVar.e) && this.f == txhVar.f && this.g == txhVar.g && this.h == txhVar.h && epx.f(this.i, txhVar.i) && this.j == txhVar.j && this.k == txhVar.k && this.l == txhVar.l && this.m == txhVar.m && this.n == txhVar.n && this.o == txhVar.o && this.p == txhVar.p && epx.f(this.q, txhVar.q) && this.r == txhVar.r && this.s == txhVar.s && this.t == txhVar.t && this.u == txhVar.u;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31)) * 31;
        String str = this.e;
        return Boolean.hashCode(this.u) + qoy.b(qoy.b((this.r.hashCode() + fw3.a(shy.a(this.p, qoy.b(qoy.b(shy.a(this.m, qoy.b(qoy.b(qoy.b(fw3.a(qoy.b(qoy.b(shy.a(this.f, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31), 31, this.n), 31, this.o), 31), 31, this.q)) * 31, 31, this.s), 31, this.t);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityReviewItemModel(id=");
        sb.append(this.a);
        sb.append(", mark=");
        sb.append(this.b);
        sb.append(", date=");
        sb.append(this.c);
        sb.append(", user=");
        sb.append(this.d);
        sb.append(", comment=");
        sb.append(this.e);
        sb.append(", likesCount=");
        sb.append(this.f);
        sb.append(", hasMyLike=");
        sb.append(this.g);
        sb.append(", isExpanded=");
        sb.append(this.h);
        sb.append(", images=");
        sb.append(this.i);
        sb.append(", isDeleted=");
        sb.append(this.j);
        sb.append(", canDelete=");
        sb.append(this.k);
        sb.append(", canUpdate=");
        sb.append(this.l);
        sb.append(", reviewsCount=");
        sb.append(this.m);
        sb.append(", isFriend=");
        sb.append(this.n);
        sb.append(", canAnswer=");
        sb.append(this.o);
        sb.append(", repliesCount=");
        sb.append(this.p);
        sb.append(", replies=");
        sb.append(this.q);
        sb.append(", sourceType=");
        sb.append(this.r);
        sb.append(", isPinned=");
        sb.append(this.s);
        sb.append(", canPin=");
        sb.append(this.t);
        sb.append(", isHighlighted=");
        return defpackage.q0.a(sb, this.u, ')');
    }
}
