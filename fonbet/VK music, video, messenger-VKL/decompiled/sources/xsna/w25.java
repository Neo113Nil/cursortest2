package xsna;

import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.dto.common.id.UserId;

/* compiled from: AuthData.kt */
/* loaded from: classes11.dex */
public final class w25 {
    public final String a;
    public final UserId b;
    public final String c;
    public final int d;
    public final long e;
    public final UtilityTokens f;

    public w25(int i, long j, UtilityTokens utilityTokens, UserId userId, String str, String str2) {
        this.a = str;
        this.b = userId;
        this.c = str2;
        this.d = i;
        this.e = j;
        this.f = utilityTokens;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w25)) {
            return false;
        }
        w25 w25Var = (w25) obj;
        return epx.f(this.a, w25Var.a) && epx.f(this.b, w25Var.b) && epx.f(this.c, w25Var.c) && this.d == w25Var.d && this.e == w25Var.e && epx.f(this.f, w25Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int a = bh10.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b.b);
        String str2 = this.c;
        return this.f.b.hashCode() + bh10.a(shy.a(this.d, (a + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31, this.e);
    }

    public final String toString() {
        return "AuthData(accessToken=" + this.a + ", userId=" + this.b + ", secret=" + this.c + ", expiresInSec=" + this.d + ", createdMs=" + this.e + ", utilityTokens=" + this.f + ')';
    }
}
