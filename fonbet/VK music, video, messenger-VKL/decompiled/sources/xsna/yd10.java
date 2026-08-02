package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.market.dto.MarketSearchServicesRevDto;
import com.vk.api.generated.market.dto.MarketSearchServicesSortDto;
import com.vk.dto.common.id.UserId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: MarketService.kt */
/* loaded from: classes2.dex */
public final class yd10 implements xd10 {
    public final tfx F(UserId userId, Integer num, Integer num2, Integer num3, Integer num4) {
        tfx tfxVar = new tfx("market.getServices", new rr(19), new zn(16));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        if (num != null) {
            tfx.l(tfxVar, "album_id", num.intValue(), 0, 0, 8);
        }
        tfxVar.f(num2.intValue(), 0, 20, "section_count");
        tfxVar.f(num3.intValue(), 0, 200, "count");
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num4.intValue(), 0, 0, 8);
        return tfxVar;
    }

    public final tfx G(UserId userId, Integer num, String str, String str2, Integer num2, Integer num3, MarketSearchServicesSortDto marketSearchServicesSortDto, MarketSearchServicesRevDto marketSearchServicesRevDto, Integer num4, Integer num5) {
        tfx tfxVar = new tfx("market.searchServices", new s11(14), new to(18));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        if (num != null) {
            tfx.l(tfxVar, "album_id", num.intValue(), 0, 0, 8);
        }
        if (str != null) {
            tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, str, 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "section_id", str2, 0, 0, 12);
        }
        if (num2 != null) {
            tfx.l(tfxVar, "price_from", num2.intValue(), 0, 0, 8);
        }
        if (num3 != null) {
            tfx.l(tfxVar, "price_to", num3.intValue(), 0, 0, 8);
        }
        if (marketSearchServicesSortDto != null) {
            tfx.l(tfxVar, "sort", marketSearchServicesSortDto.i(), 0, 0, 12);
        }
        if (marketSearchServicesRevDto != null) {
            tfx.l(tfxVar, "rev", marketSearchServicesRevDto.i(), 0, 0, 12);
        }
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num4.intValue(), 0, 0, 8);
        tfxVar.f(num5.intValue(), 0, 200, "count");
        return tfxVar;
    }
}
