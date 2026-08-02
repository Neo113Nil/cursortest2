package xsna;

import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$ReferrerItemType;

/* compiled from: OtherGoodsHolder.kt */
/* loaded from: classes18.dex */
public final class e090 {
    public final long a;
    public final MobileOfficialAppsMarketStat$ReferrerItemType b;
    public final long c;
    public final CommonMarketStat$TypeRefSource d;
    public final String e;

    public e090(long j, MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType, long j2, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, String str) {
        this.a = j;
        this.b = mobileOfficialAppsMarketStat$ReferrerItemType;
        this.c = j2;
        this.d = commonMarketStat$TypeRefSource;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e090)) {
            return false;
        }
        e090 e090Var = (e090) obj;
        return this.a == e090Var.a && this.b == e090Var.b && this.c == e090Var.c && this.d == e090Var.d && epx.f(this.e, e090Var.e);
    }

    public final int hashCode() {
        int a = bh10.a((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c);
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = this.d;
        int hashCode = (a + (commonMarketStat$TypeRefSource == null ? 0 : commonMarketStat$TypeRefSource.hashCode())) * 31;
        String str = this.e;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OtherGoodsStatArgs(referrerItemId=");
        sb.append(this.a);
        sb.append(", referrerItemType=");
        sb.append(this.b);
        sb.append(", referrerOwnerId=");
        sb.append(this.c);
        sb.append(", source=");
        sb.append(this.d);
        sb.append(", trackCode=");
        return ho8.a(sb, this.e, ')');
    }
}
