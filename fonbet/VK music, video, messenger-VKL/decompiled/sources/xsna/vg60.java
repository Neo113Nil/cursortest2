package xsna;

import com.vk.newsfeed.domain.model.DiscoverCustomIntent;
import org.json.JSONObject;

/* compiled from: NewsfeedCustomRequestParams.kt */
/* loaded from: classes4.dex */
public final class vg60 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final DiscoverCustomIntent e;
    public final String f;
    public final JSONObject g;
    public final String h;
    public final String i;
    public final String j;
    public final Integer k;
    public final Long l;
    public final Integer m;

    public /* synthetic */ vg60(String str, String str2, boolean z, String str3, DiscoverCustomIntent discoverCustomIntent, String str4, JSONObject jSONObject, String str5, String str6, String str7, Integer num) {
        this(str, str2, z, str3, discoverCustomIntent, str4, jSONObject, str5, str6, str7, num, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg60)) {
            return false;
        }
        vg60 vg60Var = (vg60) obj;
        return epx.f(this.a, vg60Var.a) && epx.f(this.b, vg60Var.b) && this.c == vg60Var.c && epx.f(this.d, vg60Var.d) && this.e == vg60Var.e && epx.f(this.f, vg60Var.f) && epx.f(this.g, vg60Var.g) && epx.f(this.h, vg60Var.h) && epx.f(this.i, vg60Var.i) && epx.f(this.j, vg60Var.j) && epx.f(this.k, vg60Var.k) && epx.f(this.l, vg60Var.l) && epx.f(this.m, vg60Var.m);
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        DiscoverCustomIntent discoverCustomIntent = this.e;
        int hashCode2 = (hashCode + (discoverCustomIntent == null ? 0 : discoverCustomIntent.hashCode())) * 31;
        String str2 = this.f;
        int a = urd0.a(urd0.a(urd0.a((this.g.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j);
        Integer num = this.k;
        int hashCode3 = (a + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.l;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.m;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedCustomRequestParams(feedId=");
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
        sb.append(", geoData=");
        sb.append(this.g);
        sb.append(", filters=");
        sb.append(this.h);
        sb.append(", userOptions=");
        sb.append(this.i);
        sb.append(", deviceInfo=");
        sb.append(this.j);
        sb.append(", pageSize=");
        sb.append(this.k);
        sb.append(", anchorOwnerId=");
        sb.append(this.l);
        sb.append(", anchorItemId=");
        return uqi.b(sb, this.m, ')');
    }

    public vg60(String str, String str2, boolean z, String str3, DiscoverCustomIntent discoverCustomIntent, String str4, JSONObject jSONObject, String str5, String str6, String str7, Integer num, Long l, Integer num2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = discoverCustomIntent;
        this.f = str4;
        this.g = jSONObject;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = num;
        this.l = l;
        this.m = num2;
    }
}
