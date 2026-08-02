package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: AuthorItem.kt */
/* loaded from: classes6.dex */
public final class tb5 extends zif0 {
    public final UserId a;
    public final kr5 b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f = true;
    public final boolean g;

    public tb5(UserId userId, kr5 kr5Var, String str, boolean z, boolean z2, boolean z3) {
        this.a = userId;
        this.b = kr5Var;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.g = z3;
    }

    @Override // xsna.zif0
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb5)) {
            return false;
        }
        tb5 tb5Var = (tb5) obj;
        return epx.f(this.a, tb5Var.a) && epx.f(this.b, tb5Var.b) && epx.f(this.c, tb5Var.c) && this.d == tb5Var.d && this.e == tb5Var.e && this.f == tb5Var.f && this.g == tb5Var.g;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31;
        String str = this.c;
        return Boolean.hashCode(this.g) + qoy.b(qoy.b(qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorItem(groupId=");
        sb.append(this.a);
        sb.append(", avatarImageConfig=");
        sb.append(this.b);
        sb.append(", authorName=");
        sb.append(this.c);
        sb.append(", isBusiness=");
        sb.append(this.d);
        sb.append(", isClosed=");
        sb.append(this.e);
        sb.append(", isSelected=");
        sb.append(this.f);
        sb.append(", isOnlineBookingAvailable=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
