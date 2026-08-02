package xsna;

import com.vk.superapp.bridges.advertisement.AdRequestEvent;
import com.vk.superapp.bridges.advertisement.BannerParamsSnapshot;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;

/* compiled from: AdAnalyticsDataSerializer.kt */
/* loaded from: classes6.dex */
public final class lc0 {

    /* compiled from: AdAnalyticsDataSerializer.kt */
    public static abstract class a {

        /* compiled from: AdAnalyticsDataSerializer.kt */
        /* renamed from: xsna.lc0$a$a, reason: collision with other inner class name */
        public static final class C3259a extends a {
            public final VkBridgeAnalytics.BannerAdEvent a;
            public final boolean b;
            public final mc0 c;
            public final BannerParamsSnapshot d;
            public final String e;

            public C3259a(VkBridgeAnalytics.BannerAdEvent bannerAdEvent, boolean z, mc0 mc0Var, BannerParamsSnapshot bannerParamsSnapshot, String str) {
                this.a = bannerAdEvent;
                this.b = z;
                this.c = mc0Var;
                this.d = bannerParamsSnapshot;
                this.e = str;
            }
        }

        /* compiled from: AdAnalyticsDataSerializer.kt */
        public static final class b extends a {
            public final AdRequestEvent a;

            public b(AdRequestEvent adRequestEvent) {
                this.a = adRequestEvent;
            }
        }

        /* compiled from: AdAnalyticsDataSerializer.kt */
        public static final class c extends a {
        }
    }
}
