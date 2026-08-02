package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.good.good2.presentation.IslandPart;
import java.util.List;

/* compiled from: ProductCardCommunityMarketInfoViewState.kt */
/* loaded from: classes18.dex */
public final class lkd0 implements gld0 {
    public final UserId a;
    public final int b;
    public final int c;
    public final List<String> d;
    public final boolean e;
    public final boolean f;
    public final IslandPart g;

    public lkd0(UserId userId, int i, int i2, List<String> list, boolean z, boolean z2, IslandPart islandPart) {
        this.a = userId;
        this.b = i;
        this.c = i2;
        this.d = list;
        this.e = z;
        this.f = z2;
        this.g = islandPart;
    }

    @Override // xsna.gld0
    public final IslandPart U0() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkd0)) {
            return false;
        }
        lkd0 lkd0Var = (lkd0) obj;
        return epx.f(this.a, lkd0Var.a) && this.b == lkd0Var.b && this.c == lkd0Var.c && epx.f(this.d, lkd0Var.d) && this.e == lkd0Var.e && this.f == lkd0Var.f && this.g == lkd0Var.g;
    }

    public final int hashCode() {
        int a = shy.a(this.c, shy.a(this.b, Long.hashCode(this.a.b) * 31, 31), 31);
        List<String> list = this.d;
        return this.g.hashCode() + qoy.b(qoy.b((a + (list == null ? 0 : list.hashCode())) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "ProductCardCommunityMarketInfoViewState(groupId=" + this.a + ", membersCount=" + this.b + ", friendsCount=" + this.c + ", photos=" + this.d + ", isMember=" + this.e + ", isShopConditionsAvailable=" + this.f + ", islandPart=" + this.g + ')';
    }
}
