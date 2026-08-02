package defpackage;

import com.yandex.plus.core.graphql.type.PLAQUE_SEEN_STATUS;

/* loaded from: classes2.dex */
public final class e3j0 implements za70 {
    public final PLAQUE_SEEN_STATUS a;

    public e3j0(PLAQUE_SEEN_STATUS plaque_seen_status) {
        this.a = plaque_seen_status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e3j0) && this.a == ((e3j0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(plaqueSeen=" + this.a + ')';
    }
}
