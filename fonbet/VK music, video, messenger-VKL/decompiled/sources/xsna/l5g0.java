package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ReportFormData.kt */
/* loaded from: classes6.dex */
public final class l5g0 {
    public final String a;
    public final UserId b;
    public final UserId c;
    public final String d;
    public final Long e;
    public final UserId f;
    public final String g;

    public l5g0(String str, UserId userId, UserId userId2, String str2, Long l, UserId userId3, String str3) {
        this.a = str;
        this.b = userId;
        this.c = userId2;
        this.d = str2;
        this.e = l;
        this.f = userId3;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5g0)) {
            return false;
        }
        l5g0 l5g0Var = (l5g0) obj;
        return epx.f(this.a, l5g0Var.a) && epx.f(this.b, l5g0Var.b) && epx.f(this.c, l5g0Var.c) && epx.f(this.d, l5g0Var.d) && epx.f(this.e, l5g0Var.e) && epx.f(this.f, l5g0Var.f) && epx.f(this.g, l5g0Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        UserId userId = this.b;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        UserId userId2 = this.c;
        int hashCode3 = (hashCode2 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        String str = this.d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.e;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        UserId userId3 = this.f;
        int hashCode6 = (hashCode5 + (userId3 == null ? 0 : Long.hashCode(userId3.b))) * 31;
        String str2 = this.g;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportFormData(reportType=");
        sb.append(this.a);
        sb.append(", userId=");
        sb.append(this.b);
        sb.append(", groupId=");
        sb.append(this.c);
        sb.append(", adData=");
        sb.append(this.d);
        sb.append(", appId=");
        sb.append(this.e);
        sb.append(", ownerId=");
        sb.append(this.f);
        sb.append(", itemId=");
        return ho8.a(sb, this.g, ')');
    }
}
