package xsna;

import com.vk.newsfeed.domain.model.DiscoverCustomIntent;

/* compiled from: NewsfeedCustomPageParams.kt */
/* loaded from: classes4.dex */
public final class og60 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final DiscoverCustomIntent e;
    public final String f;
    public final Integer g;
    public final Long h;
    public final Integer i;

    public og60(String str, String str2, boolean z, String str3, DiscoverCustomIntent discoverCustomIntent, String str4, Integer num, Long l, Integer num2, int i) {
        discoverCustomIntent = (i & 16) != 0 ? null : discoverCustomIntent;
        str4 = (i & 32) != 0 ? null : str4;
        l = (i & 128) != 0 ? null : l;
        num2 = (i & 256) != 0 ? null : num2;
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = discoverCustomIntent;
        this.f = str4;
        this.g = num;
        this.h = l;
        this.i = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og60)) {
            return false;
        }
        og60 og60Var = (og60) obj;
        return epx.f(this.a, og60Var.a) && epx.f(this.b, og60Var.b) && this.c == og60Var.c && epx.f(this.d, og60Var.d) && this.e == og60Var.e && epx.f(this.f, og60Var.f) && epx.f(this.g, og60Var.g) && epx.f(this.h, og60Var.h) && epx.f(this.i, og60Var.i);
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        DiscoverCustomIntent discoverCustomIntent = this.e;
        int hashCode2 = (hashCode + (discoverCustomIntent == null ? 0 : discoverCustomIntent.hashCode())) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.g;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.h;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.i;
        return hashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedCustomPageParams(feedId=");
        sb.append(this.a);
        sb.append(", refer=");
        sb.append(this.b);
        sb.append(", areAdsDisabled=");
        sb.append(this.c);
        sb.append(", nextFrom=");
        sb.append(this.d);
        sb.append(", intent=");
        sb.append(this.e);
        sb.append(", trackCode=");
        sb.append(this.f);
        sb.append(", pageSize=");
        sb.append(this.g);
        sb.append(", anchorOwnerId=");
        sb.append(this.h);
        sb.append(", anchorItemId=");
        return uqi.b(sb, this.i, ')');
    }
}
