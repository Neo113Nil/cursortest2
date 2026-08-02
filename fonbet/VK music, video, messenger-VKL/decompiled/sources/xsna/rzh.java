package xsna;

import com.vk.dto.common.id.UserId;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* compiled from: CommunityReviewsResponse.kt */
/* loaded from: classes18.dex */
public final class rzh {
    public final int a;
    public final boolean b;
    public final Float c;
    public final int d;
    public final LinkedHashMap e;
    public final yo9 f;
    public final boolean g;
    public final String h;
    public final List<dye0> i;
    public final int j;
    public final List<vd10> k;
    public final Map<UserId, big0> l;
    public final boolean m;

    public rzh(int i, boolean z, Float f, int i2, LinkedHashMap linkedHashMap, yo9 yo9Var, boolean z2, String str, List list, int i3, List list2, MapBuilder mapBuilder, boolean z3) {
        this.a = i;
        this.b = z;
        this.c = f;
        this.d = i2;
        this.e = linkedHashMap;
        this.f = yo9Var;
        this.g = z2;
        this.h = str;
        this.i = list;
        this.j = i3;
        this.k = list2;
        this.l = mapBuilder;
        this.m = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzh)) {
            return false;
        }
        rzh rzhVar = (rzh) obj;
        return this.a == rzhVar.a && this.b == rzhVar.b && epx.f(this.c, rzhVar.c) && this.d == rzhVar.d && this.e.equals(rzhVar.e) && epx.f(this.f, rzhVar.f) && this.g == rzhVar.g && epx.f(this.h, rzhVar.h) && epx.f(this.i, rzhVar.i) && this.j == rzhVar.j && epx.f(this.k, rzhVar.k) && epx.f(this.l, rzhVar.l) && this.m == rzhVar.m;
    }

    public final int hashCode() {
        int b = qoy.b(Integer.hashCode(this.a) * 31, 31, this.b);
        Float f = this.c;
        int b2 = uf3.b(this.e, shy.a(this.d, (b + (f == null ? 0 : f.hashCode())) * 31, 31), 31);
        yo9 yo9Var = this.f;
        return Boolean.hashCode(this.m) + v11.a(fw3.a(shy.a(this.j, fw3.a(urd0.a(qoy.b((b2 + (yo9Var != null ? yo9Var.hashCode() : 0)) * 31, 31, this.g), 31, this.h), 31, this.i), 31), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityReviewsResponse(reviewsCount=");
        sb.append(this.a);
        sb.append(", canAddReview=");
        sb.append(this.b);
        sb.append(", communityRating=");
        sb.append(this.c);
        sb.append(", lastId=");
        sb.append(this.d);
        sb.append(", reviews=");
        sb.append(this.e);
        sb.append(", canAddReviewError=");
        sb.append(this.f);
        sb.append(", isAddReviewShow=");
        sb.append(this.g);
        sb.append(", faqLink=");
        sb.append(this.h);
        sb.append(", marksStat=");
        sb.append(this.i);
        sb.append(", reviewFriendsTotal=");
        sb.append(this.j);
        sb.append(", reviewFriends=");
        sb.append(this.k);
        sb.append(", usersAndGroups=");
        sb.append(this.l);
        sb.append(", canShowButtonYclientsImport=");
        return defpackage.q0.a(sb, this.m, ')');
    }
}
