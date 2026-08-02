package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: CommentsUiData.kt */
/* loaded from: classes17.dex */
public final class n4g0 {
    public final int a;
    public final UserId b;
    public final String c;
    public final String d;

    public n4g0(int i, UserId userId, String str, String str2) {
        this.a = i;
        this.b = userId;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4g0)) {
            return false;
        }
        n4g0 n4g0Var = (n4g0) obj;
        return this.a == n4g0Var.a && epx.f(this.b, n4g0Var.b) && epx.f(this.c, n4g0Var.c) && epx.f(this.d, n4g0Var.d);
    }

    public final int hashCode() {
        int a = bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplyTargetComment(commentId=");
        sb.append(this.a);
        sb.append(", userId=");
        sb.append(this.b);
        sb.append(", userName=");
        sb.append(this.c);
        sb.append(", userNameDat=");
        return ho8.a(sb, this.d, ')');
    }

    public n4g0() {
        this(0, UserId.d, null, null);
    }
}
