package com.yandex.mobile.ads.common;

import android.content.Context;
import com.yandex.go.ads.mobile_ads_sdk.data.a;
import defpackage.fp20;
import defpackage.ju6;
import defpackage.msb1;
import defpackage.sls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/mobile/ads/common/MobileAdsConfigurator;", "", "Landroid/content/Context;", "context", "Lju6;", "bunchOfUrls", "Lcom/yandex/go/ads/mobile_ads_sdk/data/a;", "experimentRepository", "<init>", "(Landroid/content/Context;Lju6;Lcom/yandex/go/ads/mobile_ads_sdk/data/a;)V", "Lkotlin/Function0;", "Lzy11;", "onInitializationCompleted", "initialize", "(Lsls;)V", "Landroid/content/Context;", "Lju6;", "Lcom/yandex/go/ads/mobile_ads_sdk/data/a;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MobileAdsConfigurator {
    private final ju6 bunchOfUrls;
    private final Context context;
    private final a experimentRepository;

    public MobileAdsConfigurator(Context context, ju6 ju6Var, a aVar) {
        this.context = context;
        this.bunchOfUrls = ju6Var;
        this.experimentRepository = aVar;
    }

    public final void initialize(sls onInitializationCompleted) {
        CustomYandexAds.setAnalyticsProvider(this.context, msb1.w);
        CustomYandexAds.setNetworkInterceptor(this.context, new fp20(this.bunchOfUrls, this.experimentRepository.c.c));
        YandexAds.initialize(this.context, new MobileAdsConfigurator$sam$com_yandex_mobile_ads_common_InitializationListener$0(onInitializationCompleted));
    }
}
