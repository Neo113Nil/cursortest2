package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;

/* compiled from: TaggedItemsBottomSheetArgs.kt */
/* loaded from: classes18.dex */
public final class e1o0 {
    public final UserId a;
    public final int b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final Boolean f;
    public final Integer g;
    public final CommonMarketStat$TypeMarketContextContent.Type h;
    public final Long i;
    public final CommonMarketStat$TypeRefSource j;

    public e1o0(UserId userId, int i, String str, String str2, Boolean bool, Boolean bool2, Integer num, CommonMarketStat$TypeMarketContextContent.Type type, Long l, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource) {
        this.a = userId;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = bool;
        this.f = bool2;
        this.g = num;
        this.h = type;
        this.i = l;
        this.j = commonMarketStat$TypeRefSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1o0)) {
            return false;
        }
        e1o0 e1o0Var = (e1o0) obj;
        return epx.f(this.a, e1o0Var.a) && this.b == e1o0Var.b && epx.f(this.c, e1o0Var.c) && epx.f(this.d, e1o0Var.d) && epx.f(this.e, e1o0Var.e) && epx.f(this.f, e1o0Var.f) && epx.f(this.g, e1o0Var.g) && this.h == e1o0Var.h && epx.f(this.i, e1o0Var.i) && this.j == e1o0Var.j;
    }

    public final int hashCode() {
        int a = shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.e;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.g;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        CommonMarketStat$TypeMarketContextContent.Type type = this.h;
        int hashCode6 = (hashCode5 + (type == null ? 0 : type.hashCode())) * 31;
        Long l = this.i;
        int hashCode7 = (hashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = this.j;
        return hashCode7 + (commonMarketStat$TypeRefSource != null ? commonMarketStat$TypeRefSource.hashCode() : 0);
    }

    public final String toString() {
        return "TaggedItemsBottomSheetArgs(ownerId=" + this.a + ", itemId=" + this.b + ", accessKey=" + this.c + ", trackCode=" + this.d + ", containsGoods=" + this.e + ", containsServices=" + this.f + ", parentContextContentId=" + this.g + ", parentContextContentType=" + this.h + ", parentContextContentOwnerId=" + this.i + ", refSource=" + this.j + ')';
    }
}
