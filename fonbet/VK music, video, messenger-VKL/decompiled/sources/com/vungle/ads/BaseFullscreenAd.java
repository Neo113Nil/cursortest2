package com.vungle.ads;

import android.content.Context;
import android.os.Handler;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.b1;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.presenter.b;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.j;
import com.vungle.ads.internal.signals.m;
import com.vungle.ads.internal.t1;
import com.vungle.ads.internal.util.y;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes7.dex */
public abstract class BaseFullscreenAd extends BaseAd implements FullscreenAd {
    public BaseFullscreenAd(Context context, String str, AdConfig adConfig) {
        super(context, str, adConfig);
    }

    @Override // com.vungle.ads.BaseAd, com.vungle.ads.Ad
    public void load(String str) {
        setSignaledAd$vungle_ads_release(getSignalManager$vungle_ads_release().a(getPlacementId()));
        super.load(str);
    }

    @Override // com.vungle.ads.BaseAd
    public void onAdLoaded$vungle_ads_release(h0 h0Var) {
        super.onAdLoaded$vungle_ads_release(h0Var);
        m signaledAd$vungle_ads_release = getSignaledAd$vungle_ads_release();
        if (signaledAd$vungle_ads_release == null) {
            return;
        }
        signaledAd$vungle_ads_release.a(System.currentTimeMillis());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.vungle.ads.BaseFullscreenAd$play$2] */
    @Override // com.vungle.ads.FullscreenAd
    public void play(Context context) {
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.a(analyticsClient, new m2(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), getLogEntry$vungle_ads_release(), 4);
        getResponseToShowMetric$vungle_ads_release().d();
        AnalyticsClient.a(analyticsClient, getResponseToShowMetric$vungle_ads_release(), getLogEntry$vungle_ads_release());
        getShowToFailMetric$vungle_ads_release().e();
        getShowToCloseMetric$vungle_ads_release().e();
        m signaledAd$vungle_ads_release = getSignaledAd$vungle_ads_release();
        if (signaledAd$vungle_ads_release != null) {
            signaledAd$vungle_ads_release.i = System.currentTimeMillis();
            signaledAd$vungle_ads_release.f = m.a(Long.valueOf(signaledAd$vungle_ads_release.h), signaledAd$vungle_ads_release.i);
            getSignalManager$vungle_ads_release().a(context, signaledAd$vungle_ads_release);
        }
        ((b1) getAdInternal$vungle_ads_release()).a(context, new b() { // from class: com.vungle.ads.BaseFullscreenAd$play$2
            @Override // com.vungle.ads.internal.presenter.b
            public void onAdClick(String str) {
                Handler handler = y.a;
                final BaseFullscreenAd baseFullscreenAd = BaseFullscreenAd.this;
                y.a(new gzs<s3q0>() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$onAdClick$1
                    {
                        super(0);
                    }

                    @Override // xsna.gzs
                    public /* bridge */ /* synthetic */ s3q0 invoke() {
                        invoke2();
                        return s3q0.a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = BaseFullscreenAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdClicked(BaseFullscreenAd.this);
                        }
                    }
                });
                BaseFullscreenAd.this.getDisplayToClickMetric$vungle_ads_release().d();
                AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
                t1 displayToClickMetric$vungle_ads_release = BaseFullscreenAd.this.getDisplayToClickMetric$vungle_ads_release();
                analyticsClient2.a(displayToClickMetric$vungle_ads_release, BaseFullscreenAd.this.getLogEntry$vungle_ads_release(), displayToClickMetric$vungle_ads_release.b);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdEnd(String str) {
                Handler handler = y.a;
                final BaseFullscreenAd baseFullscreenAd = BaseFullscreenAd.this;
                y.a(new gzs<s3q0>() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$onAdEnd$1
                    {
                        super(0);
                    }

                    @Override // xsna.gzs
                    public /* bridge */ /* synthetic */ s3q0 invoke() {
                        invoke2();
                        return s3q0.a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = BaseFullscreenAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdEnd(BaseFullscreenAd.this);
                        }
                    }
                });
                BaseFullscreenAd.this.getShowToCloseMetric$vungle_ads_release().d();
                AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
                t1 showToCloseMetric$vungle_ads_release = BaseFullscreenAd.this.getShowToCloseMetric$vungle_ads_release();
                analyticsClient2.a(showToCloseMetric$vungle_ads_release, BaseFullscreenAd.this.getLogEntry$vungle_ads_release(), showToCloseMetric$vungle_ads_release.b);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdImpression(String str) {
                Handler handler = y.a;
                final BaseFullscreenAd baseFullscreenAd = BaseFullscreenAd.this;
                y.a(new gzs<s3q0>() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$onAdImpression$1
                    {
                        super(0);
                    }

                    @Override // xsna.gzs
                    public /* bridge */ /* synthetic */ s3q0 invoke() {
                        invoke2();
                        return s3q0.a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = BaseFullscreenAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdImpression(BaseFullscreenAd.this);
                        }
                    }
                });
                BaseFullscreenAd.this.getPresentToDisplayMetric$vungle_ads_release().d();
                AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
                t1 presentToDisplayMetric$vungle_ads_release = BaseFullscreenAd.this.getPresentToDisplayMetric$vungle_ads_release();
                analyticsClient2.a(presentToDisplayMetric$vungle_ads_release, BaseFullscreenAd.this.getLogEntry$vungle_ads_release(), presentToDisplayMetric$vungle_ads_release.b);
                BaseFullscreenAd.this.getDisplayToClickMetric$vungle_ads_release().e();
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdLeftApplication(String str) {
                Handler handler = y.a;
                final BaseFullscreenAd baseFullscreenAd = BaseFullscreenAd.this;
                y.a(new gzs<s3q0>() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$onAdLeftApplication$1
                    {
                        super(0);
                    }

                    @Override // xsna.gzs
                    public /* bridge */ /* synthetic */ s3q0 invoke() {
                        invoke2();
                        return s3q0.a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = BaseFullscreenAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdLeftApplication(BaseFullscreenAd.this);
                        }
                    }
                });
                AnalyticsClient.a(AnalyticsClient.INSTANCE, BaseFullscreenAd.this.getLeaveApplicationMetric$vungle_ads_release(), BaseFullscreenAd.this.getLogEntry$vungle_ads_release(), 4);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdRewarded(String str) {
                Handler handler = y.a;
                final BaseFullscreenAd baseFullscreenAd = BaseFullscreenAd.this;
                y.a(new gzs<s3q0>() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$onAdRewarded$1
                    {
                        super(0);
                    }

                    @Override // xsna.gzs
                    public /* bridge */ /* synthetic */ s3q0 invoke() {
                        invoke2();
                        return s3q0.a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = BaseFullscreenAd.this.getAdListener();
                        RewardedAdListener rewardedAdListener = adListener instanceof RewardedAdListener ? (RewardedAdListener) adListener : null;
                        if (rewardedAdListener != null) {
                            rewardedAdListener.onAdRewarded(BaseFullscreenAd.this);
                        }
                    }
                });
                AnalyticsClient.a(AnalyticsClient.INSTANCE, BaseFullscreenAd.this.getRewardedMetric$vungle_ads_release(), BaseFullscreenAd.this.getLogEntry$vungle_ads_release(), 4);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdStart(String str) {
                j signalManager$vungle_ads_release = BaseFullscreenAd.this.getSignalManager$vungle_ads_release();
                synchronized (signalManager$vungle_ads_release) {
                    signalManager$vungle_ads_release.h.f++;
                }
                BaseFullscreenAd.this.getPresentToDisplayMetric$vungle_ads_release().e();
                Handler handler = y.a;
                final BaseFullscreenAd baseFullscreenAd = BaseFullscreenAd.this;
                y.a(new gzs<s3q0>() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$onAdStart$1
                    {
                        super(0);
                    }

                    @Override // xsna.gzs
                    public /* bridge */ /* synthetic */ s3q0 invoke() {
                        invoke2();
                        return s3q0.a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = BaseFullscreenAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdStart(BaseFullscreenAd.this);
                        }
                    }
                });
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onFailure(final VungleError vungleError) {
                Handler handler = y.a;
                final BaseFullscreenAd baseFullscreenAd = BaseFullscreenAd.this;
                y.a(new gzs<s3q0>() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$onFailure$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // xsna.gzs
                    public /* bridge */ /* synthetic */ s3q0 invoke() {
                        invoke2();
                        return s3q0.a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = BaseFullscreenAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdFailedToPlay(BaseFullscreenAd.this, vungleError);
                        }
                    }
                });
                BaseFullscreenAd.this.getShowToFailMetric$vungle_ads_release().d();
                AnalyticsClient.INSTANCE.a(BaseFullscreenAd.this.getShowToFailMetric$vungle_ads_release(), BaseFullscreenAd.this.getLogEntry$vungle_ads_release(), vungleError.getCode() + '-' + vungleError.getErrorMessage());
            }
        });
    }
}
