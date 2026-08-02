package xsna;

import com.vk.dto.common.id.UserId;
import xsna.qt7;

/* compiled from: BookingRecordCompletedScreenEvent.kt */
/* loaded from: classes18.dex */
public final class ut7 implements qt7.a {
    public final UserId a;
    public final Integer b;

    public ut7(UserId userId, Integer num) {
        this.a = userId;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ut7)) {
            return false;
        }
        ut7 ut7Var = (ut7) obj;
        return epx.f(this.a, ut7Var.a) && epx.f(this.b, ut7Var.b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a.b) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(groupId=");
        sb.append(this.a);
        sb.append(", bookingId=");
        return uqi.b(sb, this.b, ')');
    }
}
