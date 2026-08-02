package xsna;

import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.dto.common.id.UserId;

/* compiled from: VKApiCredentials.kt */
/* loaded from: classes.dex */
public final class h7r0 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final UserId e;
    public final UtilityTokens f;

    public h7r0(int i, long j, UtilityTokens utilityTokens, UserId userId, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = userId;
        this.f = utilityTokens;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7r0)) {
            return false;
        }
        h7r0 h7r0Var = (h7r0) obj;
        return epx.f(this.a, h7r0Var.a) && epx.f(this.b, h7r0Var.b) && this.c == h7r0Var.c && this.d == h7r0Var.d && epx.f(this.e, h7r0Var.e) && epx.f(this.f, h7r0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.f.b.hashCode() + bh10.a(bh10.a(shy.a(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.d), 31, this.e.b);
    }

    public final String toString() {
        StringBuilder a = xe9.a("VKApiCredentials(accessToken=", this.a, ", secret=", this.b, ", expiresInSec=");
        a.append(this.c);
        a.append(", createdMs=");
        a.append(this.d);
        a.append(", userId=");
        a.append(this.e);
        a.append(", utilityTokens=");
        a.append(this.f);
        a.append(")");
        return a.toString();
    }
}
