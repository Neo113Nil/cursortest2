package xsna;

import com.vk.superapp.bridges.advertisement.AdRequestEvent;
import com.vk.superapp.bridges.advertisement.BannerParamsSnapshot;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;

/* compiled from: AdsBridgeAnalytics.kt */
/* loaded from: classes6.dex */
public interface wu0 {
    void a(VkBridgeAnalytics.BannerAdEvent bannerAdEvent, boolean z, h16 h16Var, BannerParamsSnapshot bannerParamsSnapshot, String str);

    void b(AdRequestEvent adRequestEvent);
}
