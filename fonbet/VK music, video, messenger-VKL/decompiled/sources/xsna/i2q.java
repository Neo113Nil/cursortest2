package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ExchangeTokenForSilentLogin.kt */
/* loaded from: classes5.dex */
public final class i2q {
    public final UserId a;
    public final String b;

    public i2q(UserId userId, String str) {
        this.a = userId;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final UserId b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2q)) {
            return false;
        }
        i2q i2qVar = (i2q) obj;
        return epx.f(this.a, i2qVar.a) && epx.f(this.b, i2qVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExchangeTokenForSilentLogin(userId=");
        sb.append(this.a);
        sb.append(", exchangeToken=");
        return ho8.a(sb, this.b, ')');
    }
}
