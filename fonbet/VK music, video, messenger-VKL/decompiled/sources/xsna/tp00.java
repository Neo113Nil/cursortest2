package xsna;

import com.vk.clips.sdk.models.ads.SdkAdsChoices;
import com.vk.clips.sdk.shared.item.market_ads.events.MarketAdsItemViewEvent;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MarketAdsItemMviView.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class tp00 extends FunctionReferenceImpl implements wzs<String, SdkAdsChoices, s3q0> {
    @Override // xsna.wzs
    public final s3q0 invoke(String str, SdkAdsChoices sdkAdsChoices) {
        ((com.vk.clips.sdk.shared.item.market_ads.b) this.receiver).z.a(new MarketAdsItemViewEvent.e(sdkAdsChoices, str));
        return s3q0.a;
    }
}
