package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: NewsfeedSearchArguments.kt */
/* loaded from: classes4.dex */
public final class xw60 {
    public final UserId a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;

    public xw60(UserId userId, String str, String str2, String str3, String str4, boolean z, String str5) {
        this.a = userId;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw60)) {
            return false;
        }
        xw60 xw60Var = (xw60) obj;
        return epx.f(this.a, xw60Var.a) && epx.f(this.b, xw60Var.b) && epx.f(this.c, xw60Var.c) && epx.f(this.d, xw60Var.d) && epx.f(this.e, xw60Var.e) && this.f == xw60Var.f && epx.f(this.g, xw60Var.g);
    }

    public final int hashCode() {
        UserId userId = this.a;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int b = qoy.b((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f);
        String str5 = this.g;
        return b + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedSearchArguments(ownerId=");
        sb.append(this.a);
        sb.append(", ownerName=");
        sb.append(this.b);
        sb.append(", keyHint=");
        sb.append(this.c);
        sb.append(", query=");
        sb.append(this.d);
        sb.append(", domain=");
        sb.append(this.e);
        sb.append(", startSpeechToText=");
        sb.append(this.f);
        sb.append(", situationalSuggestId=");
        return ho8.a(sb, this.g, ')');
    }
}
