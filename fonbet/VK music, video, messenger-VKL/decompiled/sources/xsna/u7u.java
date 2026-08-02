package xsna;

import com.vk.api.generated.market.dto.MarketItemSkuReviewDto;
import com.vk.dto.common.id.UserId;

/* compiled from: GoodReviewItem.kt */
/* loaded from: classes18.dex */
public final class u7u implements hfz {
    public final int b;
    public final long c;
    public final UserId d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final vhg0 h;
    public final ugg0 i;
    public final MarketItemSkuReviewDto.SourceDto j;

    public u7u(int i, long j, UserId userId, String str, boolean z, boolean z2, vhg0 vhg0Var, ugg0 ugg0Var, MarketItemSkuReviewDto.SourceDto sourceDto) {
        this.b = i;
        this.c = j;
        this.d = userId;
        this.e = str;
        this.f = z;
        this.g = z2;
        this.h = vhg0Var;
        this.i = ugg0Var;
        this.j = sourceDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7u)) {
            return false;
        }
        u7u u7uVar = (u7u) obj;
        return this.b == u7uVar.b && this.c == u7uVar.c && epx.f(this.d, u7uVar.d) && epx.f(this.e, u7uVar.e) && this.f == u7uVar.f && this.g == u7uVar.g && epx.f(this.h, u7uVar.h) && epx.f(this.i, u7uVar.i) && this.j == u7uVar.j;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b);
    }

    public final int hashCode() {
        int a = bh10.a(bh10.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d.b);
        String str = this.e;
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + qoy.b(qoy.b((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g)) * 31)) * 31);
    }

    public final String toString() {
        return "GoodReviewItem(id=" + this.b + ", itemId=" + this.c + ", userId=" + this.d + ", authorImg=" + this.e + ", canEdit=" + this.f + ", canDelete=" + this.g + ", headerData=" + this.h + ", bodyData=" + this.i + ", marketItemType=" + this.j + ')';
    }
}
