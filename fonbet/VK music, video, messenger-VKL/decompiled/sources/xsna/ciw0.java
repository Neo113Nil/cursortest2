package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: VoipCallServiceNavigationEvent.kt */
/* loaded from: classes7.dex */
public final class ciw0 implements x49 {
    public final UserId a;
    public final String b;

    public ciw0(UserId userId, String str) {
        this.a = userId;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ciw0)) {
            return false;
        }
        ciw0 ciw0Var = (ciw0) obj;
        return epx.f(this.a, ciw0Var.a) && epx.f(this.b, ciw0Var.b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a.b) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenProfile(userId=");
        sb.append(this.a);
        sb.append(", trackCode=");
        return ho8.a(sb, this.b, ')');
    }
}
