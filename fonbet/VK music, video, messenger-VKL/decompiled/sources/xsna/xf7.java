package xsna;

import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.dto.common.id.UserId;

/* compiled from: BlockstoreData.kt */
/* loaded from: classes6.dex */
public final class xf7 {
    public final UserId a;
    public final String b;
    public final AccountProfileType c;
    public final String d;

    public xf7(UserId userId, String str, AccountProfileType accountProfileType, String str2) {
        this.a = userId;
        this.b = str;
        this.c = accountProfileType;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf7)) {
            return false;
        }
        xf7 xf7Var = (xf7) obj;
        return epx.f(this.a, xf7Var.a) && epx.f(this.b, xf7Var.b) && this.c == xf7Var.c && epx.f(this.d, xf7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlockstoreData(userId=");
        sb.append(this.a);
        sb.append(", exchangeToken=");
        sb.append(this.b);
        sb.append(", profileType=");
        sb.append(this.c);
        sb.append(", name=");
        return ho8.a(sb, this.d, ')');
    }
}
