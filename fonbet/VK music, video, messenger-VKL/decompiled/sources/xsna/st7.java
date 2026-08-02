package xsna;

import com.vk.dto.common.id.UserId;
import xsna.qt7;

/* compiled from: BookingRecordCompletedScreenEvent.kt */
/* loaded from: classes18.dex */
public final class st7 implements qt7.a {
    public final UserId a;
    public final Integer b;

    public st7(UserId userId, Integer num) {
        this.a = userId;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st7)) {
            return false;
        }
        st7 st7Var = (st7) obj;
        return epx.f(this.a, st7Var.a) && epx.f(this.b, st7Var.b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a.b) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finish(groupId=");
        sb.append(this.a);
        sb.append(", bookingId=");
        return uqi.b(sb, this.b, ')');
    }
}
