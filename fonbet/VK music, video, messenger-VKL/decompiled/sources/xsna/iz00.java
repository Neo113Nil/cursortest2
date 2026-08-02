package xsna;

import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.market.dto.MarketGetAlbumsResponseDto;
import com.vk.api.generated.market.dto.MarketGetCartTotalQuantityResponseDto;
import com.vk.api.generated.market.dto.MarketGetEditUrlResponseDto;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: MarketGetMarketPage.kt */
/* loaded from: classes15.dex */
public final class iz00 extends awi<jkl0> {
    public final rsg0<MarketGetEditUrlResponseDto> s;
    public final rsg0<MarketGetAlbumsResponseDto> t;
    public final rsg0<GroupsGetByIdObjectResponseDto> u;
    public final UserId v;

    public iz00(rsg0<MarketGetEditUrlResponseDto> rsg0Var, rsg0<MarketGetAlbumsResponseDto> rsg0Var2, rsg0<GroupsGetByIdObjectResponseDto> rsg0Var3, UserId userId) {
        this.s = rsg0Var;
        this.t = rsg0Var2;
        this.u = rsg0Var3;
        this.v = userId;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        GroupsGroupFullDto groupsGroupFullDto;
        hz00 f = new gz00(this.s, this.t, this.u).f(l7r0Var);
        List<GroupsGroupFullDto> d = f.c.d();
        boolean z = false;
        MarketGetCartTotalQuantityResponseDto marketGetCartTotalQuantityResponseDto = (d == null || (groupsGroupFullDto = (GroupsGroupFullDto) j5g.Y(d)) == null) ? false : epx.f(groupsGroupFullDto.z3(), Boolean.TRUE) ? (MarketGetCartTotalQuantityResponseDto) yfb.x(new yd10().q(fkq0.e(this.v))).f(l7r0Var) : null;
        MarketGetEditUrlResponseDto marketGetEditUrlResponseDto = f.a;
        MarketGetAlbumsResponseDto marketGetAlbumsResponseDto = f.b;
        List<GroupsGroupFullDto> d2 = f.c.d();
        GroupsGroupFullDto groupsGroupFullDto2 = d2 != null ? (GroupsGroupFullDto) j5g.Y(d2) : null;
        int count = groupsGroupFullDto2 != null ? epx.f(groupsGroupFullDto2.z3(), Boolean.TRUE) : false ? marketGetCartTotalQuantityResponseDto != null ? marketGetCartTotalQuantityResponseDto.getCount() : 0 : -1;
        VKList vKList = marketGetAlbumsResponseDto.getCount() != -1 ? new VKList(ur00.a(marketGetAlbumsResponseDto.d())) : null;
        if (count != -1 && groupsGroupFullDto2 != null) {
            z = epx.f(groupsGroupFullDto2.z3(), Boolean.TRUE);
        }
        return new jkl0(vKList, marketGetAlbumsResponseDto.getCount(), marketGetEditUrlResponseDto.getUrl(), z);
    }
}
