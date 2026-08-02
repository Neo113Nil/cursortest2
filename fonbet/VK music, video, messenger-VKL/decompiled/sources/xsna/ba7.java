package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: FriendsBirthdayModalPage.kt */
/* loaded from: classes6.dex */
public final class ba7 {
    public final UserId a;
    public final String b;
    public final String c;

    public ba7(UserId userId, String str, String str2) {
        this.a = userId;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba7)) {
            return false;
        }
        ba7 ba7Var = (ba7) obj;
        return epx.f(this.a, ba7Var.a) && epx.f(this.b, ba7Var.b) && epx.f(this.c, ba7Var.c);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a.b) * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BirthdayFriendModel(userId=");
        sb.append(this.a);
        sb.append(", avatar=");
        sb.append(this.b);
        sb.append(", name=");
        return ho8.a(sb, this.c, ')');
    }
}
