package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: MarketReviewFriend.kt */
/* loaded from: classes18.dex */
public final class vd10 {
    public final UserId a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public vd10(UserId userId, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = userId;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd10)) {
            return false;
        }
        vd10 vd10Var = (vd10) obj;
        return epx.f(this.a, vd10Var.a) && epx.f(this.b, vd10Var.b) && epx.f(this.c, vd10Var.c) && epx.f(this.d, vd10Var.d) && epx.f(this.e, vd10Var.e) && epx.f(this.f, vd10Var.f) && epx.f(this.g, vd10Var.g);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketReviewFriend(id=");
        sb.append(this.a);
        sb.append(", firstName=");
        sb.append(this.b);
        sb.append(", lastName=");
        sb.append(this.c);
        sb.append(", photo50=");
        sb.append(this.d);
        sb.append(", photo100=");
        sb.append(this.e);
        sb.append(", photo200=");
        sb.append(this.f);
        sb.append(", photoBase=");
        return ho8.a(sb, this.g, ')');
    }
}
