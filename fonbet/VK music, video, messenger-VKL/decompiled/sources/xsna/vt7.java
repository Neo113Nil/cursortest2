package xsna;

import com.vk.dto.common.id.UserId;
import xsna.qt7;

/* compiled from: BookingRecordCompletedScreenEvent.kt */
/* loaded from: classes18.dex */
public final class vt7 implements qt7.a {
    public final boolean a;
    public final UserId b;
    public final Integer c;

    public vt7(UserId userId, boolean z, Integer num) {
        this.a = z;
        this.b = userId;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt7)) {
            return false;
        }
        vt7 vt7Var = (vt7) obj;
        return this.a == vt7Var.a && epx.f(this.b, vt7Var.b) && epx.f(this.c, vt7Var.c);
    }

    public final int hashCode() {
        int a = bh10.a(Boolean.hashCode(this.a) * 31, 31, this.b.b);
        Integer num = this.c;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Screen(isRescheduling=");
        sb.append(this.a);
        sb.append(", groupId=");
        sb.append(this.b);
        sb.append(", bookingId=");
        return uqi.b(sb, this.c, ')');
    }
}
