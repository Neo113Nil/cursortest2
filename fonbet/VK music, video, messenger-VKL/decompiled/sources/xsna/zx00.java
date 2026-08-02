package xsna;

import com.vk.api.generated.market.dto.MarketGetResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;

/* compiled from: MarketEditAlbumGoodsFragment.kt */
/* loaded from: classes18.dex */
public final class zx00 extends rpj0<MarketGetResponseDto> {
    public final /* synthetic */ yx00 d;
    public final /* synthetic */ MarketEditAlbumGoodsFragment e;

    public zx00(yx00 yx00Var, MarketEditAlbumGoodsFragment marketEditAlbumGoodsFragment) {
        this.d = yx00Var;
        this.e = marketEditAlbumGoodsFragment;
    }

    @Override // xsna.hx2
    public final void b(Object obj) {
        this.d.invoke((MarketGetResponseDto) obj);
    }

    @Override // xsna.rpj0, xsna.q76, xsna.hx2
    public final void e(VKApiExecutionException vKApiExecutionException) {
        this.e.onError(vKApiExecutionException);
    }
}
