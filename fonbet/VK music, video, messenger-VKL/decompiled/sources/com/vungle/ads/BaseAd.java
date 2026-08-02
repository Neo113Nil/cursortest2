package com.vungle.ads;

import android.content.Context;
import android.os.Handler;
import com.vungle.ads.internal.ServiceLocator;
import com.vungle.ads.internal.load.a;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.l;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.s;
import com.vungle.ads.internal.signals.j;
import com.vungle.ads.internal.signals.m;
import com.vungle.ads.internal.t1;
import com.vungle.ads.internal.util.y;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.bpn0;
import xsna.gzs;
import xsna.j8y;
import xsna.msy;
import xsna.s3q0;

/* loaded from: classes7.dex */
public abstract class BaseAd implements Ad, VungleAdType {
    public final Context a;
    public final String b;
    public final AdConfig c;
    public BaseAdListener d;
    public final Lazy e = new bpn0(new gzs<s>() { // from class: com.vungle.ads.BaseAd$adInternal$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xsna.gzs
        public final s invoke() {
            BaseAd baseAd = BaseAd.this;
            s constructAdInternal$vungle_ads_release = baseAd.constructAdInternal$vungle_ads_release(baseAd.getContext());
            constructAdInternal$vungle_ads_release.m = BaseAd.this.getLogEntry$vungle_ads_release();
            return constructAdInternal$vungle_ads_release;
        }
    });
    public final Lazy f;
    public final com.vungle.ads.internal.util.s g;
    public final t1 h;
    public final t1 i;
    public final t1 j;
    public final t1 k;
    public final m2 l;
    public final m2 m;
    public final t1 n;
    public m o;
    public String p;
    public String q;
    public String r;

    public BaseAd(final Context context, String str, AdConfig adConfig) {
        this.a = context;
        this.b = str;
        this.c = adConfig;
        this.f = msy.a(LazyThreadSafetyMode.SYNCHRONIZED, new gzs<j>() { // from class: com.vungle.ads.BaseAd$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.j, java.lang.Object] */
            @Override // xsna.gzs
            public final j invoke() {
                return ServiceLocator.d.a(context).getService(j.class);
            }
        });
        com.vungle.ads.internal.util.s sVar = new com.vungle.ads.internal.util.s();
        sVar.g(str);
        this.g = sVar;
        this.h = new t1(Sdk.SDKMetric.SDKMetricType.AD_RESPONSE_TO_SHOW_DURATION_MS);
        this.i = new t1(Sdk.SDKMetric.SDKMetricType.AD_PRESENT_TO_DISPLAY_DURATION_MS);
        this.j = new t1(Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_FAIL_DURATION_MS);
        this.k = new t1(Sdk.SDKMetric.SDKMetricType.AD_DISPLAY_TO_CLICK_DURATION_MS);
        this.l = new m2(Sdk.SDKMetric.SDKMetricType.AD_LEAVE_APPLICATION);
        this.m = new m2(Sdk.SDKMetric.SDKMetricType.AD_REWARD_USER);
        this.n = new t1(Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_CLOSE_DURATION_MS);
    }

    @Override // com.vungle.ads.Ad
    public Boolean canPlayAd() {
        s adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        j8y j8yVar = s.p;
        return Boolean.valueOf(adInternal$vungle_ads_release.a(false) == null);
    }

    public abstract s constructAdInternal$vungle_ads_release(Context context);

    public final AdConfig getAdConfig() {
        return this.c;
    }

    public final s getAdInternal$vungle_ads_release() {
        return (s) this.e.getValue();
    }

    public final BaseAdListener getAdListener() {
        return this.d;
    }

    @Override // com.vungle.ads.VungleAdType
    public String getAdapterAdFormat() {
        return this.r;
    }

    public final Context getContext() {
        return this.a;
    }

    public final String getCreativeId() {
        return this.p;
    }

    public final t1 getDisplayToClickMetric$vungle_ads_release() {
        return this.k;
    }

    public final String getEventId() {
        return this.q;
    }

    public final m2 getLeaveApplicationMetric$vungle_ads_release() {
        return this.l;
    }

    public final com.vungle.ads.internal.util.s getLogEntry$vungle_ads_release() {
        return this.g;
    }

    public final String getPlacementId() {
        return this.b;
    }

    public final t1 getPresentToDisplayMetric$vungle_ads_release() {
        return this.i;
    }

    public final t1 getResponseToShowMetric$vungle_ads_release() {
        return this.h;
    }

    public final m2 getRewardedMetric$vungle_ads_release() {
        return this.m;
    }

    public final t1 getShowToCloseMetric$vungle_ads_release() {
        return this.n;
    }

    public final t1 getShowToFailMetric$vungle_ads_release() {
        return this.j;
    }

    public final j getSignalManager$vungle_ads_release() {
        return (j) this.f.getValue();
    }

    public final m getSignaledAd$vungle_ads_release() {
        return this.o;
    }

    public final double getWinningPrice() {
        l lVar;
        h0 h0Var = getAdInternal$vungle_ads_release().c;
        if (h0Var == null) {
            return ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        }
        com.vungle.ads.internal.model.s i = h0Var.i();
        Double d = (i == null || (lVar = i.c) == null) ? null : lVar.a;
        return d != null ? d.doubleValue() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
    }

    @Override // com.vungle.ads.Ad
    public void load() {
        load((String) null);
    }

    public void onAdLoaded$vungle_ads_release(h0 h0Var) {
        h0Var.a(this.c);
        this.p = h0Var.n();
        String h = h0Var.h();
        this.q = h;
        m mVar = this.o;
        if (mVar == null) {
            return;
        }
        mVar.a(h);
    }

    public void onLoadFailure$vungle_ads_release(BaseAd baseAd, final VungleError vungleError) {
        this.h.e();
        Handler handler = y.a;
        y.a(new gzs<s3q0>() { // from class: com.vungle.ads.BaseAd$onLoadFailure$1
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
                BaseAdListener adListener = BaseAd.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdFailedToLoad(BaseAd.this, vungleError);
                }
            }
        });
    }

    public void onLoadSuccess$vungle_ads_release(BaseAd baseAd, String str) {
        this.h.e();
        Handler handler = y.a;
        y.a(new gzs<s3q0>() { // from class: com.vungle.ads.BaseAd$onLoadSuccess$1
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
                BaseAdListener adListener = BaseAd.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdLoaded(BaseAd.this);
                }
            }
        });
    }

    public final void sendLossURL() {
        getAdInternal$vungle_ads_release().k();
    }

    public final void sendWinURL() {
        getAdInternal$vungle_ads_release().l();
    }

    public final void setAdListener(BaseAdListener baseAdListener) {
        this.d = baseAdListener;
    }

    @Override // com.vungle.ads.VungleAdType
    public void setAdapterAdFormat(String str) {
        this.r = str;
        this.g.m = str;
    }

    public final void setSignaledAd$vungle_ads_release(m mVar) {
        this.o = mVar;
    }

    @Override // com.vungle.ads.Ad
    public void load(final String str) {
        getAdInternal$vungle_ads_release().a(this.b, str, null, new a() { // from class: com.vungle.ads.BaseAd$load$1
            @Override // com.vungle.ads.internal.load.a
            public void onFailure(VungleError vungleError) {
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadFailure$vungle_ads_release(baseAd, vungleError);
            }

            @Override // com.vungle.ads.internal.load.a
            public void onSuccess(h0 h0Var) {
                BaseAd.this.onAdLoaded$vungle_ads_release(h0Var);
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadSuccess$vungle_ads_release(baseAd, str);
            }
        });
    }

    @Override // com.vungle.ads.Ad
    public void load(VungleCSBData vungleCSBData) {
        getAdInternal$vungle_ads_release().a(this.b, null, vungleCSBData, new a() { // from class: com.vungle.ads.BaseAd$load$2
            @Override // com.vungle.ads.internal.load.a
            public void onFailure(VungleError vungleError) {
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadFailure$vungle_ads_release(baseAd, vungleError);
            }

            @Override // com.vungle.ads.internal.load.a
            public void onSuccess(h0 h0Var) {
                BaseAd.this.onAdLoaded$vungle_ads_release(h0Var);
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadSuccess$vungle_ads_release(baseAd, null);
            }
        });
    }
}
