package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;

/* compiled from: WriteOwnerHelper.kt */
/* loaded from: classes18.dex */
public final class i2y0 {
    public final UserId a;
    public final Context b;
    public final cxo c;
    public final long d;
    public final UserId e;
    public final CommonMarketStat$TypeRefSource f;

    public i2y0(UserId userId, Context context, cxo cxoVar, long j, UserId userId2, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource) {
        this.a = userId;
        this.b = context;
        this.c = cxoVar;
        this.d = j;
        this.e = userId2;
        this.f = commonMarketStat$TypeRefSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2y0)) {
            return false;
        }
        i2y0 i2y0Var = (i2y0) obj;
        return epx.f(this.a, i2y0Var.a) && epx.f(this.b, i2y0Var.b) && epx.f(this.c, i2y0Var.c) && this.d == i2y0Var.d && epx.f(this.e, i2y0Var.e) && this.f == i2y0Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + bh10.a(bh10.a((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31)) * 31, 31, this.d), 31, this.e.b);
    }

    public final String toString() {
        return "WriteOwnerArgs(contactId=" + this.a + ", context=" + this.b + ", state=" + this.c + ", itemId=" + this.d + ", ownerId=" + this.e + ", source=" + this.f + ')';
    }
}
