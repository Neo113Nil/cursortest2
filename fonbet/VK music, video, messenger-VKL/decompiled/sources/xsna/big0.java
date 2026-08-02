package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ReviewerModel.kt */
/* loaded from: classes18.dex */
public final class big0 {
    public final UserId a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public big0() {
        this(63, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof big0)) {
            return false;
        }
        big0 big0Var = (big0) obj;
        return epx.f(this.a, big0Var.a) && epx.f(this.b, big0Var.b) && this.c == big0Var.c && epx.f(this.d, big0Var.d) && epx.f(this.e, big0Var.e) && epx.f(this.f, big0Var.f);
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReviewerModel(id=");
        sb.append(this.a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", isGroup=");
        sb.append(this.c);
        sb.append(", firstName=");
        sb.append(this.d);
        sb.append(", lastName=");
        sb.append(this.e);
        sb.append(", nameDative=");
        return ho8.a(sb, this.f, ')');
    }

    public big0(UserId userId, String str, String str2, String str3, String str4, boolean z) {
        this.a = userId;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        if (!z) {
            str2 = v1v.a(' ', str2, str3);
        } else if (str2 == null) {
            str2 = "";
        }
        this.g = str2;
    }

    public /* synthetic */ big0(int i, UserId userId, String str, String str2, String str3) {
        this((i & 1) != 0 ? UserId.d : userId, (i & 2) != 0 ? "" : str, (i & 8) != 0 ? null : str2, null, (i & 32) != 0 ? null : str3, (i & 4) == 0);
    }
}
