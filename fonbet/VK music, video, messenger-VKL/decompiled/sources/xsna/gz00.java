package xsna;

import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.market.dto.MarketGetAlbumsResponseDto;
import com.vk.api.generated.market.dto.MarketGetEditUrlResponseDto;

/* compiled from: MarketGetMarketPage.kt */
/* loaded from: classes15.dex */
public final class gz00 extends com.vk.api.request.rx.batch.b<MarketGetEditUrlResponseDto, MarketGetAlbumsResponseDto, GroupsGetByIdObjectResponseDto, hz00> {
    @Override // com.vk.api.request.rx.batch.b
    public final hz00 K0(bv6<MarketGetEditUrlResponseDto> bv6Var, bv6<MarketGetAlbumsResponseDto> bv6Var2, bv6<GroupsGetByIdObjectResponseDto> bv6Var3) {
        return new hz00(bv6Var.a, bv6Var2.a, bv6Var3.a);
    }
}
