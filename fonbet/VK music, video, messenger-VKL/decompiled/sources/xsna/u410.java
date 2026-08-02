package xsna;

import com.vk.api.generated.market.dto.MarketGetItemReviewsResponseDto;
import com.vk.api.generated.market.dto.MarketMarketItemFullDto;
import com.vk.dto.common.id.UserId;
import java.util.Collections;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: MarketItemReviewsRepositoryImpl.kt */
/* loaded from: classes18.dex */
public final class u410 implements t410 {
    public final yd10 a;

    public u410(yd10 yd10Var) {
        this.a = yd10Var;
    }

    @Override // xsna.t410
    public final io.reactivex.rxjava3.core.x<MarketMarketItemFullDto> a(long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append('_');
        sb.append(j2);
        return rsg0.w0(yfb.x(this.a.C(Collections.singletonList(sb.toString())))).l(new qa(new oqu(6), 27));
    }

    @Override // xsna.t410
    public final io.reactivex.rxjava3.core.x<MarketGetItemReviewsResponseDto> b(UserId userId, long j, int i, rpz rpzVar) {
        Integer num = rpzVar.a;
        String str = rpzVar.b;
        String str2 = rpzVar.c;
        this.a.getClass();
        tfx tfxVar = new tfx("market.getItemReviews", new ao(21), new bo(23));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.m(tfxVar, "item_id", j, 0L, 12);
        tfxVar.f(i, 1, 100, SignalingProtocol.KEY_LIMIT);
        if (num != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num.intValue(), 0, 0, 8);
        }
        if (str != null) {
            tfx.o(tfxVar, "sort", str, 0, 8, 4);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "ads_label", str2, 0, 0, 12);
        }
        return rsg0.w0(yfb.x(tfxVar));
    }

    @Override // xsna.t410
    public final io.reactivex.rxjava3.core.x c(UserId userId, long j, int i) {
        return rsg0.w0(yfb.x(this.a.t(userId, j, i)));
    }

    @Override // xsna.t410
    public final io.reactivex.rxjava3.core.x d(UserId userId, long j, int i) {
        return rsg0.w0(yfb.x(this.a.m(userId, j, i)));
    }
}
