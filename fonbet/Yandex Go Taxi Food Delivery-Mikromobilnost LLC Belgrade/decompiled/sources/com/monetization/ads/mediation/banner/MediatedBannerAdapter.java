package com.monetization.ads.mediation.banner;

import android.content.Context;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0003¨\u0006\u0012"}, d2 = {"Lcom/monetization/ads/mediation/banner/MediatedBannerAdapter;", "Lcom/monetization/ads/mediation/base/a;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/monetization/ads/mediation/banner/MediatedBannerAdapter$MediatedBannerAdapterListener;", "mediatedBannerAdapterListener", "", "", "", "localExtras", "serverExtras", "Lzy11;", "loadBanner", "(Landroid/content/Context;Lcom/monetization/ads/mediation/banner/MediatedBannerAdapter$MediatedBannerAdapterListener;Ljava/util/Map;Ljava/util/Map;)V", "onInvalidate", "MediatedBannerAdapterListener", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class MediatedBannerAdapter extends com.monetization.ads.mediation.base.a {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/monetization/ads/mediation/banner/MediatedBannerAdapter$MediatedBannerAdapterListener;", "", "Lcom/monetization/ads/mediation/base/MediatedAdRequestError;", "error", "Lzy11;", "onAdFailedToLoad", "(Lcom/monetization/ads/mediation/base/MediatedAdRequestError;)V", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface MediatedBannerAdapterListener {
        void onAdFailedToLoad(MediatedAdRequestError error);
    }

    public abstract void loadBanner(Context context, MediatedBannerAdapterListener mediatedBannerAdapterListener, Map<String, ? extends Object> localExtras, Map<String, String> serverExtras);

    public abstract void onInvalidate();
}
