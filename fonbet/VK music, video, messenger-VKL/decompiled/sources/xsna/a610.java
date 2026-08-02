package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: MarketItemsForReviewModel.kt */
/* loaded from: classes18.dex */
public final class a610 {
    public final UserId a;
    public final Integer b;
    public final long c;
    public final List<BaseImageDto> d;
    public final String e;
    public final String f;
    public final boolean g;
    public final float h;

    public a610(UserId userId, Integer num, long j, List<BaseImageDto> list, String str, String str2, boolean z, float f) {
        this.a = userId;
        this.b = num;
        this.c = j;
        this.d = list;
        this.e = str;
        this.f = str2;
        this.g = z;
        this.h = f;
    }

    public static a610 a(a610 a610Var, boolean z, float f, int i) {
        UserId userId = a610Var.a;
        Integer num = a610Var.b;
        long j = a610Var.c;
        List<BaseImageDto> list = a610Var.d;
        String str = a610Var.e;
        String str2 = a610Var.f;
        if ((i & 64) != 0) {
            z = a610Var.g;
        }
        return new a610(userId, num, j, list, str, str2, z, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a610)) {
            return false;
        }
        a610 a610Var = (a610) obj;
        return epx.f(this.a, a610Var.a) && epx.f(this.b, a610Var.b) && this.c == a610Var.c && epx.f(this.d, a610Var.d) && epx.f(this.e, a610Var.e) && epx.f(this.f, a610Var.f) && this.g == a610Var.g && Float.compare(this.h, a610Var.h) == 0;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a.b) * 31;
        Integer num = this.b;
        return Float.hashCode(this.h) + qoy.b(urd0.a(urd0.a(fw3.a(bh10.a((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemsForReviewModel(communityId=");
        sb.append(this.a);
        sb.append(", orderId=");
        sb.append(this.b);
        sb.append(", id=");
        sb.append(this.c);
        sb.append(", icons=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        sb.append(", isReviewed=");
        sb.append(this.g);
        sb.append(", rating=");
        return xq.c(')', this.h, sb);
    }
}
