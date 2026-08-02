package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupTypeDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupMarketInfo;
import java.util.List;

/* compiled from: StorefrontState.kt */
/* loaded from: classes18.dex */
public final class pju {
    public final int a;
    public final int b;
    public final List<String> c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final GroupMarketInfo.b h;
    public final UserId i;
    public final String j;
    public final boolean k;
    public final ja9 l;
    public final String m;
    public final String n;
    public final GroupsGroupTypeDto o;
    public final boolean p;
    public final Float q;
    public final Integer r;
    public final Boolean s;
    public final boolean t;
    public final boolean u;

    public pju(int i, int i2, List<String> list, String str, String str2, boolean z, String str3, GroupMarketInfo.b bVar, UserId userId, String str4, boolean z2, ja9 ja9Var, String str5, String str6, GroupsGroupTypeDto groupsGroupTypeDto, boolean z3, Float f, Integer num, Boolean bool, boolean z4, boolean z5) {
        this.a = i;
        this.b = i2;
        this.c = list;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = str3;
        this.h = bVar;
        this.i = userId;
        this.j = str4;
        this.k = z2;
        this.l = ja9Var;
        this.m = str5;
        this.n = str6;
        this.o = groupsGroupTypeDto;
        this.p = z3;
        this.q = f;
        this.r = num;
        this.s = bool;
        this.t = z4;
        this.u = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pju)) {
            return false;
        }
        pju pjuVar = (pju) obj;
        return this.a == pjuVar.a && this.b == pjuVar.b && epx.f(this.c, pjuVar.c) && epx.f(this.d, pjuVar.d) && epx.f(this.e, pjuVar.e) && this.f == pjuVar.f && epx.f(this.g, pjuVar.g) && epx.f(this.h, pjuVar.h) && epx.f(this.i, pjuVar.i) && epx.f(this.j, pjuVar.j) && this.k == pjuVar.k && epx.f(this.l, pjuVar.l) && epx.f(this.m, pjuVar.m) && epx.f(this.n, pjuVar.n) && this.o == pjuVar.o && this.p == pjuVar.p && epx.f(this.q, pjuVar.q) && epx.f(this.r, pjuVar.r) && epx.f(this.s, pjuVar.s) && this.t == pjuVar.t && this.u == pjuVar.u;
    }

    public final int hashCode() {
        int a = fw3.a(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
        String str = this.d;
        int b = qoy.b(urd0.a((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
        String str2 = this.g;
        int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        GroupMarketInfo.b bVar = this.h;
        int a2 = bh10.a((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.i.b);
        String str3 = this.j;
        int b2 = qoy.b((a2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.k);
        ja9 ja9Var = this.l;
        int hashCode2 = (b2 + (ja9Var == null ? 0 : ja9Var.hashCode())) * 31;
        String str4 = this.m;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.n;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        GroupsGroupTypeDto groupsGroupTypeDto = this.o;
        int b3 = qoy.b((hashCode4 + (groupsGroupTypeDto == null ? 0 : groupsGroupTypeDto.hashCode())) * 31, 31, this.p);
        Float f = this.q;
        int hashCode5 = (b3 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.r;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.s;
        return Boolean.hashCode(this.u) + qoy.b((hashCode6 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.t);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupData(membersCount=");
        sb.append(this.a);
        sb.append(", friendsCount=");
        sb.append(this.b);
        sb.append(", friendsPhoto=");
        sb.append(this.c);
        sb.append(", ownerPhoto200=");
        sb.append(this.d);
        sb.append(", ownerName=");
        sb.append(this.e);
        sb.append(", isVerified=");
        sb.append(this.f);
        sb.append(", phone=");
        sb.append(this.g);
        sb.append(", shopConditionsState=");
        sb.append(this.h);
        sb.append(", ownerId=");
        sb.append(this.i);
        sb.append(", groupSubhead=");
        sb.append(this.j);
        sb.append(", canMessage=");
        sb.append(this.k);
        sb.append(", callToAction=");
        sb.append(this.l);
        sb.append(", communitySite=");
        sb.append(this.m);
        sb.append(", deactivatedMessage=");
        sb.append(this.n);
        sb.append(", groupType=");
        sb.append(this.o);
        sb.append(", bookingEnabled=");
        sb.append(this.p);
        sb.append(", rating=");
        sb.append(this.q);
        sb.append(", ratingCount=");
        sb.append(this.r);
        sb.append(", subscribeButtonStatus=");
        sb.append(this.s);
        sb.append(", isMember=");
        sb.append(this.t);
        sb.append(", isAdmin=");
        return defpackage.q0.a(sb, this.u, ')');
    }
}
