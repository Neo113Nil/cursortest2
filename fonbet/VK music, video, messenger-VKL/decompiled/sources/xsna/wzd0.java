package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ProfleEvents.kt */
/* loaded from: classes17.dex */
public final class wzd0 extends awd0 {
    public final UserId b;
    public final boolean c;

    public wzd0(UserId userId, boolean z) {
        super(0);
        this.b = userId;
        this.c = z;
    }

    public final UserId b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzd0)) {
            return false;
        }
        wzd0 wzd0Var = (wzd0) obj;
        return this.b.equals(wzd0Var.b) && this.c == wzd0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(-1) + qoy.b(Long.hashCode(this.b.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileSubscriptionChange(profileId=");
        sb.append(this.b);
        sb.append(", subscribe=");
        return n23.b(sb, this.c, ", memberStatus=-1)");
    }
}
