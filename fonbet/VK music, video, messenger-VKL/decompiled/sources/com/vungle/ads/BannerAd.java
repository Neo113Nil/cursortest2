package com.vungle.ads;

import android.content.Context;
import android.os.Handler;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.h;
import com.vungle.ads.internal.j0;
import com.vungle.ads.internal.k0;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.presenter.b;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.j;
import com.vungle.ads.internal.t1;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.internal.util.y;
import kotlin.NoWhenBranchMatchedException;
import xsna.gzs;
import xsna.ozl;
import xsna.s3q0;

@ozl
/* loaded from: classes7.dex */
public final class BannerAd extends BaseAd {
    public final VungleAdSize s;
    public BannerView t;
    public final j0 u;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BannerAdSize.values().length];
            iArr[BannerAdSize.BANNER.ordinal()] = 1;
            iArr[BannerAdSize.BANNER_SHORT.ordinal()] = 2;
            iArr[BannerAdSize.BANNER_LEADERBOARD.ordinal()] = 3;
            iArr[BannerAdSize.VUNGLE_MREC.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BannerAd(Context context, String str, VungleAdSize vungleAdSize, AdConfig adConfig) {
        super(context, str, adConfig);
        this.s = vungleAdSize;
        AnalyticsClient.INSTANCE.a(new m2(Sdk.SDKMetric.SDKMetricType.DEPRECATED_API_USED), getLogEntry$vungle_ads_release(), "BannerAd is deprecated");
        this.u = ((k0) getAdInternal$vungle_ads_release()).a(new b() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1
            @Override // com.vungle.ads.internal.presenter.b
            public void onAdClick(String str2) {
                Handler handler = y.a;
                final BannerAd bannerAd = BannerAd.this;
                y.a(new gzs<s3q0>() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$onAdClick$1
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
                        BaseAdListener adListener = BannerAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdClicked(BannerAd.this);
                        }
                    }
                });
                BannerAd.this.getDisplayToClickMetric$vungle_ads_release().d();
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                t1 displayToClickMetric$vungle_ads_release = BannerAd.this.getDisplayToClickMetric$vungle_ads_release();
                analyticsClient.a(displayToClickMetric$vungle_ads_release, BannerAd.this.getLogEntry$vungle_ads_release(), displayToClickMetric$vungle_ads_release.b);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdEnd(String str2) {
                Handler handler = y.a;
                final BannerAd bannerAd = BannerAd.this;
                y.a(new gzs<s3q0>() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$onAdEnd$1
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
                        BaseAdListener adListener = BannerAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdEnd(BannerAd.this);
                        }
                    }
                });
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdImpression(String str2) {
                Handler handler = y.a;
                final BannerAd bannerAd = BannerAd.this;
                y.a(new gzs<s3q0>() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$onAdImpression$1
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
                        BaseAdListener adListener = BannerAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdImpression(BannerAd.this);
                        }
                    }
                });
                BannerAd.this.getPresentToDisplayMetric$vungle_ads_release().d();
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                t1 presentToDisplayMetric$vungle_ads_release = BannerAd.this.getPresentToDisplayMetric$vungle_ads_release();
                analyticsClient.a(presentToDisplayMetric$vungle_ads_release, BannerAd.this.getLogEntry$vungle_ads_release(), presentToDisplayMetric$vungle_ads_release.b);
                BannerAd.this.getDisplayToClickMetric$vungle_ads_release().e();
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdLeftApplication(String str2) {
                Handler handler = y.a;
                final BannerAd bannerAd = BannerAd.this;
                y.a(new gzs<s3q0>() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$onAdLeftApplication$1
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
                        BaseAdListener adListener = BannerAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdLeftApplication(BannerAd.this);
                        }
                    }
                });
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdStart(String str2) {
                j signalManager$vungle_ads_release = BannerAd.this.getSignalManager$vungle_ads_release();
                synchronized (signalManager$vungle_ads_release) {
                    signalManager$vungle_ads_release.h.f++;
                }
                BannerAd.this.getAdInternal$vungle_ads_release().l.d();
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                t1 t1Var = BannerAd.this.getAdInternal$vungle_ads_release().l;
                analyticsClient.a(t1Var, BannerAd.this.getLogEntry$vungle_ads_release(), t1Var.b);
                BannerAd.this.getPresentToDisplayMetric$vungle_ads_release().e();
                Handler handler = y.a;
                final BannerAd bannerAd = BannerAd.this;
                y.a(new gzs<s3q0>() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$onAdStart$1
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
                        BaseAdListener adListener = BannerAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdStart(BannerAd.this);
                        }
                    }
                });
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onFailure(final VungleError vungleError) {
                BannerAd.this.getShowToFailMetric$vungle_ads_release().d();
                AnalyticsClient.INSTANCE.a(BannerAd.this.getShowToFailMetric$vungle_ads_release(), BannerAd.this.getLogEntry$vungle_ads_release(), String.valueOf(vungleError.getCode()));
                Handler handler = y.a;
                final BannerAd bannerAd = BannerAd.this;
                y.a(new gzs<s3q0>() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$onFailure$1
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
                        BaseAdListener adListener = BannerAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdFailedToPlay(BannerAd.this, vungleError);
                        }
                    }
                });
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdRewarded(String str2) {
            }
        });
    }

    public final void finishAd() {
        Handler handler = y.a;
        y.a(new gzs<s3q0>() { // from class: com.vungle.ads.BannerAd$finishAd$1
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
                BannerView bannerView;
                bannerView = BannerAd.this.t;
                if (bannerView != null) {
                    bannerView.finishAdInternal(true);
                }
            }
        });
    }

    public final VungleAdSize getAdViewSize() {
        VungleAdSize m = ((k0) getAdInternal$vungle_ads_release()).m();
        return m == null ? this.s : m;
    }

    public final BannerView getBannerView() {
        i3 i3Var;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.a(analyticsClient, new m2(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), getLogEntry$vungle_ads_release(), 4);
        BannerView bannerView = this.t;
        if (bannerView != null) {
            return bannerView;
        }
        getAdInternal$vungle_ads_release().k.e();
        final VungleError a = getAdInternal$vungle_ads_release().a(true);
        if (a != null) {
            if (getAdInternal$vungle_ads_release().a(a.getCode())) {
                getAdInternal$vungle_ads_release().a(h.g);
            }
            Handler handler = y.a;
            y.a(new gzs<s3q0>() { // from class: com.vungle.ads.BannerAd$getBannerView$1
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
                    BaseAdListener adListener = BannerAd.this.getAdListener();
                    if (adListener != null) {
                        adListener.onAdFailedToPlay(BannerAd.this, a);
                    }
                }
            });
            return null;
        }
        h0 h0Var = getAdInternal$vungle_ads_release().c;
        if (h0Var == null || (i3Var = getAdInternal$vungle_ads_release().d) == null) {
            return null;
        }
        getAdInternal$vungle_ads_release().a();
        try {
            try {
                this.t = new BannerView(getContext(), i3Var, h0Var, getAdViewSize(), getAdConfig(), this.u);
                getResponseToShowMetric$vungle_ads_release().d();
                t1 responseToShowMetric$vungle_ads_release = getResponseToShowMetric$vungle_ads_release();
                analyticsClient.a(responseToShowMetric$vungle_ads_release, getLogEntry$vungle_ads_release(), responseToShowMetric$vungle_ads_release.b);
                getAdInternal$vungle_ads_release().k.d();
                t1 t1Var = getAdInternal$vungle_ads_release().k;
                analyticsClient.a(t1Var, getLogEntry$vungle_ads_release(), t1Var.b);
                getAdInternal$vungle_ads_release().l.e();
                return this.t;
            } catch (InstantiationException e) {
                boolean z = u.a;
                t.a("BannerAd", "Can not create banner view: " + e.getMessage(), e);
                getResponseToShowMetric$vungle_ads_release().d();
                AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
                t1 responseToShowMetric$vungle_ads_release2 = getResponseToShowMetric$vungle_ads_release();
                analyticsClient2.a(responseToShowMetric$vungle_ads_release2, getLogEntry$vungle_ads_release(), responseToShowMetric$vungle_ads_release2.b);
                return null;
            }
        } catch (Throwable th) {
            getResponseToShowMetric$vungle_ads_release().d();
            AnalyticsClient analyticsClient3 = AnalyticsClient.INSTANCE;
            t1 responseToShowMetric$vungle_ads_release3 = getResponseToShowMetric$vungle_ads_release();
            analyticsClient3.a(responseToShowMetric$vungle_ads_release3, getLogEntry$vungle_ads_release(), responseToShowMetric$vungle_ads_release3.b);
            throw th;
        }
    }

    @Override // com.vungle.ads.BaseAd
    public k0 constructAdInternal$vungle_ads_release(Context context) {
        return new k0(context, this.s);
    }

    public BannerAd(Context context, String str, VungleAdSize vungleAdSize) {
        this(context, str, vungleAdSize, new AdConfig());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @ozl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BannerAd(Context context, String str, BannerAdSize bannerAdSize) {
        this(context, str, r4, new AdConfig());
        VungleAdSize vungleAdSize;
        VungleAdSize.Companion companion = VungleAdSize.Companion;
        int i = WhenMappings.$EnumSwitchMapping$0[bannerAdSize.ordinal()];
        if (i == 1) {
            vungleAdSize = VungleAdSize.BANNER;
        } else if (i == 2) {
            vungleAdSize = VungleAdSize.BANNER_SHORT;
        } else if (i == 3) {
            vungleAdSize = VungleAdSize.BANNER_LEADERBOARD;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            vungleAdSize = VungleAdSize.MREC;
        }
    }
}
