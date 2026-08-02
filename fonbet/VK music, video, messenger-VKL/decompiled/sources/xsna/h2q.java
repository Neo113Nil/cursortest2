package xsna;

import com.vk.dto.common.id.UserId;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ExchangeToken.kt */
/* loaded from: classes15.dex */
public final class h2q {
    public final UserId a;
    public final String b;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new obh(this, 7));

    public h2q(UserId userId, String str) {
        this.a = userId;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2q)) {
            return false;
        }
        h2q h2qVar = (h2q) obj;
        return epx.f(this.a, h2qVar.a) && epx.f(this.b, h2qVar.b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a.b) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExchangeToken(userId=");
        sb.append(this.a);
        sb.append(", token=");
        return ho8.a(sb, this.b, ')');
    }
}
