package xsna;

import com.vk.dto.common.id.UserId;
import xsna.qt7;

/* compiled from: BookingRecordCompletedScreenEvent.kt */
/* loaded from: classes18.dex */
public final class rt7 implements qt7.a {
    public final UserId a;
    public final Integer b;

    public rt7(UserId userId, Integer num) {
        this.a = userId;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt7)) {
            return false;
        }
        rt7 rt7Var = (rt7) obj;
        return epx.f(this.a, rt7Var.a) && epx.f(this.b, rt7Var.b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a.b) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Cancel(groupId=");
        sb.append(this.a);
        sb.append(", bookingId=");
        return uqi.b(sb, this.b, ')');
    }
}
