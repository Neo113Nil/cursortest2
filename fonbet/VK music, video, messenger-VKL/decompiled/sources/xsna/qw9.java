package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: CartEventsManager.kt */
/* loaded from: classes18.dex */
public final class qw9 {
    public final long a;
    public final UserId b;
    public final int c;

    public qw9(UserId userId, long j, int i) {
        this.a = j;
        this.b = userId;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw9)) {
            return false;
        }
        qw9 qw9Var = (qw9) obj;
        return this.a == qw9Var.a && epx.f(this.b, qw9Var.b) && this.c == qw9Var.c;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        UserId userId = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CartEvent(goodId=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", cartAmount=");
        return vu5.b(sb, this.c, ')');
    }
}
