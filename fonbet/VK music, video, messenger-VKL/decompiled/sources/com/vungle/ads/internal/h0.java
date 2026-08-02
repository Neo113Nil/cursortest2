package com.vungle.ads.internal;

import android.os.Handler;
import com.vungle.ads.VungleError;

/* loaded from: classes7.dex */
public final class h0 implements com.vungle.ads.internal.presenter.b {
    public final /* synthetic */ i0 a;

    public h0(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdClick(String str) {
        Handler handler = com.vungle.ads.internal.util.y.a;
        com.vungle.ads.internal.util.y.a(new b0(this.a));
        this.a.getDisplayToClickMetric$vungle_ads_release().d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        t1 displayToClickMetric$vungle_ads_release = this.a.getDisplayToClickMetric$vungle_ads_release();
        analyticsClient.a(displayToClickMetric$vungle_ads_release, this.a.getLogEntry$vungle_ads_release(), displayToClickMetric$vungle_ads_release.b);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdEnd(String str) {
        Handler handler = com.vungle.ads.internal.util.y.a;
        com.vungle.ads.internal.util.y.a(new c0(this.a));
        this.a.getShowToCloseMetric$vungle_ads_release().d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        t1 showToCloseMetric$vungle_ads_release = this.a.getShowToCloseMetric$vungle_ads_release();
        analyticsClient.a(showToCloseMetric$vungle_ads_release, this.a.getLogEntry$vungle_ads_release(), showToCloseMetric$vungle_ads_release.b);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdImpression(String str) {
        Handler handler = com.vungle.ads.internal.util.y.a;
        com.vungle.ads.internal.util.y.a(new d0(this.a));
        this.a.getPresentToDisplayMetric$vungle_ads_release().d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        t1 presentToDisplayMetric$vungle_ads_release = this.a.getPresentToDisplayMetric$vungle_ads_release();
        analyticsClient.a(presentToDisplayMetric$vungle_ads_release, this.a.getLogEntry$vungle_ads_release(), presentToDisplayMetric$vungle_ads_release.b);
        this.a.getDisplayToClickMetric$vungle_ads_release().e();
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdLeftApplication(String str) {
        Handler handler = com.vungle.ads.internal.util.y.a;
        com.vungle.ads.internal.util.y.a(new e0(this.a));
        AnalyticsClient.a(AnalyticsClient.INSTANCE, this.a.getLeaveApplicationMetric$vungle_ads_release(), this.a.getLogEntry$vungle_ads_release(), 4);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdStart(String str) {
        com.vungle.ads.internal.signals.j signalManager$vungle_ads_release = this.a.getSignalManager$vungle_ads_release();
        synchronized (signalManager$vungle_ads_release) {
            signalManager$vungle_ads_release.h.f++;
        }
        this.a.getAdInternal$vungle_ads_release().l.d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        t1 t1Var = this.a.getAdInternal$vungle_ads_release().l;
        analyticsClient.a(t1Var, this.a.getLogEntry$vungle_ads_release(), t1Var.b);
        this.a.getPresentToDisplayMetric$vungle_ads_release().e();
        Handler handler = com.vungle.ads.internal.util.y.a;
        com.vungle.ads.internal.util.y.a(new f0(this.a));
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onFailure(VungleError vungleError) {
        Handler handler = com.vungle.ads.internal.util.y.a;
        com.vungle.ads.internal.util.y.a(new g0(this.a, vungleError));
        this.a.getShowToFailMetric$vungle_ads_release().d();
        AnalyticsClient.INSTANCE.a(this.a.getShowToFailMetric$vungle_ads_release(), this.a.getLogEntry$vungle_ads_release(), vungleError.getCode() + '-' + vungleError.getErrorMessage());
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdRewarded(String str) {
    }
}
