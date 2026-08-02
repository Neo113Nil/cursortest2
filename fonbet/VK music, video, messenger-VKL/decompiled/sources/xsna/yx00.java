package xsna;

import com.vk.api.generated.market.dto.MarketGetResponseDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class yx00 implements izs {
    public final /* synthetic */ MarketEditAlbumGoodsFragment b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ yx00(MarketEditAlbumGoodsFragment marketEditAlbumGoodsFragment, int i, int i2) {
        this.b = marketEditAlbumGoodsFragment;
        this.c = i;
        this.d = i2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        MarketGetResponseDto marketGetResponseDto = (MarketGetResponseDto) obj;
        int i = MarketEditAlbumGoodsFragment.c1;
        List<MarketMarketItemDto> d = marketGetResponseDto.d();
        if (d != null) {
            this.b.Io(b210.e(d), this.c, this.d, marketGetResponseDto.getCount());
        }
        return s3q0.a;
    }
}
