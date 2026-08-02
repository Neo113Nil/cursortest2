package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: MentionProfile.kt */
/* loaded from: classes5.dex */
public final class a420 {
    public final UserId a;
    public final String b;

    public a420(UserId userId, String str) {
        this.a = userId;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a420)) {
            return false;
        }
        a420 a420Var = (a420) obj;
        return epx.f(this.a, a420Var.a) && epx.f(this.b, a420Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MentionProfile(id=");
        sb.append(this.a);
        sb.append(", fullName=");
        return ho8.a(sb, this.b, ')');
    }
}
