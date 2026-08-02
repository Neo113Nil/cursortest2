package xsna;

import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: ProductCardCommunityMarketInfoState.kt */
/* loaded from: classes18.dex */
public final class kkd0 {
    public final UserId a;
    public final int b;
    public final int c;
    public final List<String> d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public kkd0(UserId userId, int i, int i2, List<String> list, boolean z, boolean z2, boolean z3) {
        this.a = userId;
        this.b = i;
        this.c = i2;
        this.d = list;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkd0)) {
            return false;
        }
        kkd0 kkd0Var = (kkd0) obj;
        return epx.f(this.a, kkd0Var.a) && this.b == kkd0Var.b && this.c == kkd0Var.c && epx.f(this.d, kkd0Var.d) && this.e == kkd0Var.e && this.f == kkd0Var.f && this.g == kkd0Var.g;
    }

    public final int hashCode() {
        int a = shy.a(this.c, shy.a(this.b, Long.hashCode(this.a.b) * 31, 31), 31);
        List<String> list = this.d;
        return Boolean.hashCode(this.g) + qoy.b(qoy.b((a + (list == null ? 0 : list.hashCode())) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductCardCommunityMarketInfoState(groupId=");
        sb.append(this.a);
        sb.append(", membersCount=");
        sb.append(this.b);
        sb.append(", friendsCount=");
        sb.append(this.c);
        sb.append(", photos=");
        sb.append(this.d);
        sb.append(", isMember=");
        sb.append(this.e);
        sb.append(", isShopConditionsAvailable=");
        sb.append(this.f);
        sb.append(", isService=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
