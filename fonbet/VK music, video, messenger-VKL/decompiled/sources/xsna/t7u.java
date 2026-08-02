package xsna;

import com.vk.api.generated.market.dto.MarketItemSkuReviewDto;
import com.vk.dto.common.id.UserId;

/* compiled from: GoodReviewDeletedItem.kt */
/* loaded from: classes18.dex */
public final class t7u implements hfz {
    public final int b;
    public final long c;
    public final UserId d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final vhg0 h;
    public final ugg0 i;
    public final MarketItemSkuReviewDto.SourceDto j;

    public t7u(int i, long j, UserId userId, String str, boolean z, boolean z2, vhg0 vhg0Var, ugg0 ugg0Var, MarketItemSkuReviewDto.SourceDto sourceDto) {
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
        if (!(obj instanceof t7u)) {
            return false;
        }
        t7u t7uVar = (t7u) obj;
        return this.b == t7uVar.b && this.c == t7uVar.c && epx.f(this.d, t7uVar.d) && epx.f(this.e, t7uVar.e) && this.f == t7uVar.f && this.g == t7uVar.g && epx.f(this.h, t7uVar.h) && epx.f(this.i, t7uVar.i) && this.j == t7uVar.j;
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
        return "GoodReviewDeletedItem(id=" + this.b + ", itemId=" + this.c + ", userId=" + this.d + ", authorImg=" + this.e + ", canEdit=" + this.f + ", canDelete=" + this.g + ", headerData=" + this.h + ", bodyData=" + this.i + ", marketItemType=" + this.j + ')';
    }
}
