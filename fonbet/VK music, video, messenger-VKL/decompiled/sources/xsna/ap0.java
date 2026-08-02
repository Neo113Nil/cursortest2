package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: CatalogCommand.kt */
/* loaded from: classes16.dex */
public final class ap0 extends n3a {
    public final UserId a;

    public ap0(UserId userId) {
        this.a = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ap0) && epx.f(this.a, ((ap0) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("AddToRecentCommand(userId="), this.a, ')');
    }
}
