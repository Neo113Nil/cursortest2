package defpackage;

import com.yandex.plus.core.graphql.type.USER_SYNC_STATUS;

/* loaded from: classes2.dex */
public final class iu21 {
    public final USER_SYNC_STATUS a;

    public iu21(USER_SYNC_STATUS user_sync_status) {
        this.a = user_sync_status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iu21) && this.a == ((iu21) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UserSyncStatus(status=" + this.a + ')';
    }
}
