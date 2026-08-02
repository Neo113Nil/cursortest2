package xsna;

import com.vk.dto.common.id.UserId;
import java.util.Map;

/* compiled from: MarketItemReviewRepliesResponse.kt */
/* loaded from: classes18.dex */
public final class b310 {
    public final n210 a;
    public final Map<UserId, big0> b;

    public b310(n210 n210Var, Map<UserId, big0> map) {
        this.a = n210Var;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b310)) {
            return false;
        }
        b310 b310Var = (b310) obj;
        return epx.f(this.a, b310Var.a) && epx.f(this.b, b310Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemReviewRepliesResponse(review=");
        sb.append(this.a);
        sb.append(", usersAndGroups=");
        return cjl0.a(sb, this.b, ')');
    }
}
