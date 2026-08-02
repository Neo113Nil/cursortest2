package xsna;

import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: MarketItemsForReviewState.kt */
/* loaded from: classes18.dex */
public final class g610 implements km50 {
    public final UserId b;
    public final int c;
    public final List<a610> d;
    public final boolean e;
    public final Throwable f;

    public g610(UserId userId, int i, List<a610> list, boolean z, Throwable th) {
        this.b = userId;
        this.c = i;
        this.d = list;
        this.e = z;
        this.f = th;
    }

    public static g610 a(g610 g610Var, int i, List list, boolean z, Throwable th, int i2) {
        int i3 = i;
        UserId userId = g610Var.b;
        if ((i2 & 2) != 0) {
            i3 = g610Var.c;
        }
        if ((i2 & 4) != 0) {
            list = g610Var.d;
        }
        if ((i2 & 8) != 0) {
            z = g610Var.e;
        }
        if ((i2 & 16) != 0) {
            th = g610Var.f;
        }
        Throwable th2 = th;
        g610Var.getClass();
        boolean z2 = z;
        return new g610(userId, i3, list, z2, th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g610)) {
            return false;
        }
        g610 g610Var = (g610) obj;
        return epx.f(this.b, g610Var.b) && this.c == g610Var.c && epx.f(this.d, g610Var.d) && this.e == g610Var.e && epx.f(this.f, g610Var.f);
    }

    public final int hashCode() {
        int b = qoy.b(fw3.a(shy.a(this.c, Long.hashCode(this.b.b) * 31, 31), 31, this.d), 31, this.e);
        Throwable th = this.f;
        return b + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemsForReviewState(ownerId=");
        sb.append(this.b);
        sb.append(", selectedPosition=");
        sb.append(this.c);
        sb.append(", offers=");
        sb.append(this.d);
        sb.append(", isLoading=");
        sb.append(this.e);
        sb.append(", throwable=");
        return oq.c(sb, this.f, ')');
    }
}
