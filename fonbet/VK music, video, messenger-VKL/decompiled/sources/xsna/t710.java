package xsna;

import com.vk.api.generated.market.dto.MarketGetProductLinkedContentSortDto;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.good.linkedcontent.mvi2.MarketLinkedContentState;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.s710;

/* compiled from: MarketLinkedContentTaskExecutor.kt */
/* loaded from: classes18.dex */
public final class t710 extends evg0<MarketLinkedContentState, on50, s710, s710, u610, t610> {
    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        s710 s710Var = (s710) hn50Var;
        if (!(s710Var instanceof s710.a)) {
            throw new NoWhenBranchMatchedException();
        }
        s710.a aVar = (s710.a) s710Var;
        int i = (int) aVar.c;
        UserId userId = aVar.b;
        MarketGetProductLinkedContentSortDto marketGetProductLinkedContentSortDto = MarketGetProductLinkedContentSortDto.DATE_DESC;
        int i2 = aVar.d;
        tfx tfxVar = new tfx("market.getProductLinkedContent", new vp(23), new wp(20));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "item_id", i, 0, 0, 8);
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, i2, 0, 0, 8);
        if (marketGetProductLinkedContentSortDto != null) {
            tfx.o(tfxVar, "sort", marketGetProductLinkedContentSortDto.i(), 0, 0, 12);
        }
        return g(new io.reactivex.rxjava3.internal.operators.single.n(rsg0.W(yfb.x(tfxVar), 7), new tts(new by5(19, this, s710Var), 9)), new l8w(this, 4), new tf1(this, 27));
    }
}
