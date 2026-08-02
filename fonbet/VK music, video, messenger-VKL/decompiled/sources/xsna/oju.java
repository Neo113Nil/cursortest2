package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ProfleEvents.kt */
/* loaded from: classes17.dex */
public final class oju extends awd0 {
    public final UserId b;

    public oju(UserId userId) {
        super(1);
        this.b = userId;
    }

    public final UserId b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oju) && epx.f(this.b, ((oju) obj).b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("GroupCreated(gid="), this.b, ')');
    }
}
