package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: Order.kt */
/* loaded from: classes18.dex */
public final class dx80 {
    public final String a;
    public final String b;
    public final UserId c;
    public final Long d;

    public dx80(String str, Long l, UserId userId, String str2) {
        this.a = str;
        this.b = str2;
        this.c = userId;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx80)) {
            return false;
        }
        dx80 dx80Var = (dx80) obj;
        return epx.f(this.a, dx80Var.a) && epx.f(this.b, dx80Var.b) && epx.f(this.c, dx80Var.c) && epx.f(this.d, dx80Var.d);
    }

    public final int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        UserId userId = this.c;
        int hashCode = (a + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Long l = this.d;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderSeller(title=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", groupId=");
        sb.append(this.c);
        sb.append(", contactId=");
        return iq.b(sb, this.d, ')');
    }
}
