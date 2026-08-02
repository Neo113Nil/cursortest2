package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.market.dto.MarketItemRejectInfoDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.market.dto.MarketMarketItemFullDto;
import com.vk.dto.attaches.AttachMarket;
import com.vk.dto.attaches.AttachMarketRejectInfo;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.MarketRejectInfo;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ModerationItemMapper.kt */
/* loaded from: classes3.dex */
public final class e530 {
    public static final c530 a(MarketMarketItemDto marketMarketItemDto) {
        MarketItemRejectInfoDto K = marketMarketItemDto.K();
        ArrayList arrayList = null;
        String description = K != null ? K.getDescription() : null;
        MarketItemRejectInfoDto K2 = marketMarketItemDto.K();
        String f = K2 != null ? K2.f() : null;
        MarketItemRejectInfoDto K3 = marketMarketItemDto.K();
        h530 h530Var = new h530(description, f, K3 != null ? K3.i() : null);
        UserId q = marketMarketItemDto.q();
        Long valueOf = Long.valueOf(marketMarketItemDto.getId());
        List<BaseImageDto> W = marketMarketItemDto.W();
        if (W != null) {
            List<BaseImageDto> list = W;
            arrayList = new ArrayList(c5g.u(list, 10));
            for (BaseImageDto baseImageDto : list) {
                arrayList.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
            }
        }
        d530 d530Var = new d530(q, valueOf, h530Var, new Image(arrayList));
        Boolean v0 = marketMarketItemDto.v0();
        Boolean bool = Boolean.TRUE;
        return new c530(epx.f(v0, bool), epx.f(marketMarketItemDto.D0(), bool), epx.f(marketMarketItemDto.y0(), bool), null, d530Var);
    }

    public static final c530 b(Good good, Integer num) {
        MarketRejectInfo marketRejectInfo = good.e0;
        return new c530(good.h0, good.g0, good.i0, num, new d530(good.c, Long.valueOf(good.b), new h530(marketRejectInfo != null ? marketRejectInfo.c : null, marketRejectInfo != null ? marketRejectInfo.d : null, marketRejectInfo != null ? marketRejectInfo.e : null), good.n));
    }

    public static c530 c(MarketMarketItemFullDto marketMarketItemFullDto) {
        MarketItemRejectInfoDto v0 = marketMarketItemFullDto.v0();
        ArrayList arrayList = null;
        String description = v0 != null ? v0.getDescription() : null;
        MarketItemRejectInfoDto v02 = marketMarketItemFullDto.v0();
        String f = v02 != null ? v02.f() : null;
        MarketItemRejectInfoDto v03 = marketMarketItemFullDto.v0();
        h530 h530Var = new h530(description, f, v03 != null ? v03.i() : null);
        UserId q = marketMarketItemFullDto.q();
        Long valueOf = Long.valueOf(marketMarketItemFullDto.getId());
        List<BaseImageDto> K0 = marketMarketItemFullDto.K0();
        if (K0 != null) {
            List<BaseImageDto> list = K0;
            arrayList = new ArrayList(c5g.u(list, 10));
            for (BaseImageDto baseImageDto : list) {
                arrayList.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
            }
        }
        d530 d530Var = new d530(q, valueOf, h530Var, new Image(arrayList));
        Boolean b1 = marketMarketItemFullDto.b1();
        Boolean bool = Boolean.TRUE;
        return new c530(epx.f(b1, bool), epx.f(marketMarketItemFullDto.o1(), bool), epx.f(marketMarketItemFullDto.n1(), bool), null, d530Var);
    }

    public static c530 d(AttachMarket attachMarket) {
        AttachMarketRejectInfo attachMarketRejectInfo = attachMarket.o;
        h530 h530Var = attachMarketRejectInfo != null ? new h530(attachMarketRejectInfo.c, attachMarketRejectInfo.d, attachMarketRejectInfo.e) : null;
        return new c530(attachMarket.t, attachMarket.s, attachMarket.u, null, new d530(attachMarket.d, Long.valueOf(attachMarket.e), h530Var, attachMarket.q.Kb()));
    }
}
