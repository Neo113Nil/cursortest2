package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: UserIdWithAccessKey.kt */
/* loaded from: classes16.dex */
public final class gkq0 {
    public final UserId a;
    public final String b;

    public gkq0(UserId userId, String str) {
        this.a = userId;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gkq0)) {
            return false;
        }
        gkq0 gkq0Var = (gkq0) obj;
        return epx.f(this.a, gkq0Var.a) && epx.f(this.b, gkq0Var.b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a.b) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserIdWithAccessKey(userId=");
        sb.append(this.a);
        sb.append(", accessKey=");
        return ho8.a(sb, this.b, ')');
    }
}
