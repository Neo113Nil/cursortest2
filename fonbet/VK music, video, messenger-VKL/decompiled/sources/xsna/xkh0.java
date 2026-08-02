package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: RxUsersSubscriptionBus.kt */
/* loaded from: classes17.dex */
public final class xkh0 {
    public final vkh0 a;
    public final UserId b;
    public final String c;

    public xkh0(vkh0 vkh0Var, UserId userId, String str) {
        this.a = vkh0Var;
        this.b = userId;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkh0)) {
            return false;
        }
        xkh0 xkh0Var = (xkh0) obj;
        return this.a.equals(xkh0Var.a) && epx.f(this.b, xkh0Var.b) && epx.f(this.c, xkh0Var.c);
    }

    public final int hashCode() {
        int a = bh10.a(this.a.a.hashCode() * 31, 31, this.b.b);
        String str = this.c;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkSubscriptionInfo(status=");
        sb.append(this.a);
        sb.append(", userId=");
        sb.append(this.b);
        sb.append(", accessKey=");
        return ho8.a(sb, this.c, ')');
    }
}
