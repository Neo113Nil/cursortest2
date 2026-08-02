package xsna;

import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.market.dto.MarketGetAlbumsResponseDto;
import com.vk.api.generated.market.dto.MarketGetEditUrlResponseDto;

/* compiled from: MarketGetMarketPage.kt */
/* loaded from: classes15.dex */
public final class hz00 {
    public final MarketGetEditUrlResponseDto a;
    public final MarketGetAlbumsResponseDto b;
    public final GroupsGetByIdObjectResponseDto c;

    public hz00(MarketGetEditUrlResponseDto marketGetEditUrlResponseDto, MarketGetAlbumsResponseDto marketGetAlbumsResponseDto, GroupsGetByIdObjectResponseDto groupsGetByIdObjectResponseDto) {
        this.a = marketGetEditUrlResponseDto;
        this.b = marketGetAlbumsResponseDto;
        this.c = groupsGetByIdObjectResponseDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz00)) {
            return false;
        }
        hz00 hz00Var = (hz00) obj;
        return epx.f(this.a, hz00Var.a) && epx.f(this.b, hz00Var.b) && epx.f(this.c, hz00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MarketGetMarketPageBatchResponse(marketGetEditUrl=" + this.a + ", marketGetAlbums=" + this.b + ", groupsGetById=" + this.c + ')';
    }
}
