package defpackage;

import com.yandex.messaging.domain.statuses.StatusAvailability;

/* loaded from: classes15.dex */
public final class kg9 {
    public final StatusAvailability a;

    public kg9(StatusAvailability statusAvailability) {
        this.a = statusAvailability;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kg9) && this.a == ((kg9) obj).a && e3n.d(0L, 0L);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        o430 o430Var = e3n.b;
        return qv10.c(hashCode, 31, 0L);
    }

    public final String toString() {
        return "ChangeStatusData(availability=" + this.a + ", duration=" + e3n.p(0L) + ", customStatus=null)";
    }
}
