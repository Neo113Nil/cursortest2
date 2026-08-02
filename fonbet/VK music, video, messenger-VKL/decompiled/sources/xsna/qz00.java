package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;

/* compiled from: MarketGoodIdParams.kt */
/* loaded from: classes18.dex */
public final class qz00 {
    public final long a;
    public final UserId b;
    public final CommonMarketStat$TypeRefSource c;
    public final Integer d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Boolean i;
    public final String j;
    public final CommonMarketStat$TypeMarketContextContent.Type k;
    public final Integer l;
    public final Long m;
    public final CommonMarketStat$TypeMarketContextContent.Type n;
    public final Integer o;
    public final Long p;

    public /* synthetic */ qz00(long j, UserId userId, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, Integer num, String str, String str2, String str3, String str4, Boolean bool, String str5, CommonMarketStat$TypeMarketContextContent.Type type, Integer num2, Long l, int i) {
        this(j, userId, commonMarketStat$TypeRefSource, (i & 8) != 0 ? null : num, (i & 128) != 0 ? null : str, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : str3, (i & 1024) != 0 ? null : str4, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? null : str5, (i & 8192) != 0 ? null : type, (i & 16384) != 0 ? null : num2, (i & 32768) != 0 ? null : l, null, null, null);
    }

    public static qz00 a(qz00 qz00Var, CommonMarketStat$TypeMarketContextContent.Type type, Integer num, Long l, CommonMarketStat$TypeMarketContextContent.Type type2, Integer num2, Long l2) {
        return new qz00(qz00Var.a, qz00Var.b, qz00Var.c, qz00Var.d, qz00Var.e, qz00Var.f, qz00Var.g, qz00Var.h, qz00Var.i, qz00Var.j, type, num, l, type2, num2, l2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz00)) {
            return false;
        }
        qz00 qz00Var = (qz00) obj;
        return this.a == qz00Var.a && epx.f(this.b, qz00Var.b) && this.c == qz00Var.c && epx.f(this.d, qz00Var.d) && epx.f(this.e, qz00Var.e) && epx.f(this.f, qz00Var.f) && epx.f(this.g, qz00Var.g) && epx.f(this.h, qz00Var.h) && epx.f(this.i, qz00Var.i) && epx.f(this.j, qz00Var.j) && this.k == qz00Var.k && epx.f(this.l, qz00Var.l) && epx.f(this.m, qz00Var.m) && this.n == qz00Var.n && epx.f(this.o, qz00Var.o) && epx.f(this.p, qz00Var.p);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + bh10.a(Long.hashCode(this.a) * 31, 31, this.b.b)) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 923521;
        String str = this.e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.i;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.j;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        CommonMarketStat$TypeMarketContextContent.Type type = this.k;
        int hashCode9 = (hashCode8 + (type == null ? 0 : type.hashCode())) * 31;
        Integer num2 = this.l;
        int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.m;
        int hashCode11 = (hashCode10 + (l == null ? 0 : l.hashCode())) * 31;
        CommonMarketStat$TypeMarketContextContent.Type type2 = this.n;
        int hashCode12 = (hashCode11 + (type2 == null ? 0 : type2.hashCode())) * 31;
        Integer num3 = this.o;
        int hashCode13 = (hashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l2 = this.p;
        return (hashCode13 + (l2 != null ? l2.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "MarketGoodIdParams(goodId=" + this.a + ", ownerId=" + this.b + ", source=" + this.c + ", position=" + this.d + ", referrerItemId=null, referrerOwnerId=null, referrerItemType=null, sourceUrl=" + this.e + ", accessKey=" + this.f + ", refPostId=" + this.g + ", trackCode=" + this.h + ", isService=" + this.i + ", adsLabel=" + this.j + ", contextContentType=" + this.k + ", contextContentId=" + this.l + ", contextContentOwnerId=" + this.m + ", parentContextContentType=" + this.n + ", parentContextContentId=" + this.o + ", parentContextContentOwnerId=" + this.p + ", businessOnboardingParams=null)";
    }

    public qz00(long j, UserId userId, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, Integer num, String str, String str2, String str3, String str4, Boolean bool, String str5, CommonMarketStat$TypeMarketContextContent.Type type, Integer num2, Long l, CommonMarketStat$TypeMarketContextContent.Type type2, Integer num3, Long l2) {
        this.a = j;
        this.b = userId;
        this.c = commonMarketStat$TypeRefSource;
        this.d = num;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = bool;
        this.j = str5;
        this.k = type;
        this.l = num2;
        this.m = l;
        this.n = type2;
        this.o = num3;
        this.p = l2;
    }
}
