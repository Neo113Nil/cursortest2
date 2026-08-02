package xsna;

import com.vk.clips.design.view.component.ads.ClipMarketCardView;
import com.vk.clips.sdk.shared.item.market_ads.view.models.CarouselMode;
import com.vk.clips.sdk.shared.item.market_ads.view.models.OverscrollMode;

/* compiled from: ClipMarketAdsCarouselUiConfig.kt */
/* loaded from: classes17.dex */
public final class q7d {
    public final ClipMarketCardView.ImageSize a;
    public final OverscrollMode b;
    public final CarouselMode c;
    public final int d;
    public final int e;
    public final int f;

    public q7d(ClipMarketCardView.ImageSize imageSize, OverscrollMode overscrollMode, CarouselMode carouselMode, int i, int i2) {
        i = (i2 & 8) != 0 ? 17 : i;
        int a = iah0.a(8);
        int a2 = iah0.a(16);
        this.a = imageSize;
        this.b = overscrollMode;
        this.c = carouselMode;
        this.d = i;
        this.e = a;
        this.f = a2;
    }
}
