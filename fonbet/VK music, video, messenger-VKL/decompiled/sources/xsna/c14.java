package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: AttachCompoundKey.kt */
/* loaded from: classes3.dex */
public final class c14 {
    public final long a;
    public final int b;

    public c14(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c14)) {
            return false;
        }
        c14 c14Var = (c14) obj;
        return this.a == c14Var.a && this.b == c14Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachCompoundKey(ownerId=");
        sb.append(this.a);
        sb.append(", attachId=");
        return vu5.b(sb, this.b, ')');
    }

    public c14(UserId userId, int i) {
        this(userId.b, i);
    }
}
