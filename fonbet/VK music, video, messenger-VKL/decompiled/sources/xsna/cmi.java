package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;

/* compiled from: UiBlockOnboardingBannerVh.kt */
/* loaded from: classes16.dex */
public final class cmi {
    public static final jai a = new jai(-938226754, a.b, false);
    public static final jai b = new jai(223629088, b.b, false);

    /* compiled from: UiBlockOnboardingBannerVh.kt */
    public static final class a implements yzs<l5g, androidx.compose.runtime.a, Integer, s3q0> {
        public static final a b = new a();

        @Override // xsna.yzs
        public final s3q0 invoke(l5g l5gVar, androidx.compose.runtime.a aVar, Integer num) {
            long j = l5gVar.a;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-938226754, intValue, -1, "com.vk.catalog2.common.ui.holders.placeholder.ComposableSingletons$UiBlockOnboardingBannerVhKt.lambda$-938226754.<anonymous> (UiBlockOnboardingBannerVh.kt:157)");
                }
                vjw.a(pg90.a(R.drawable.vk_video_kids_banner_direct_75h, 0, aVar2), null, kci.m(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -20, 1, txj0.h(txj0.v(q630.a.a, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE), 75)), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar2, 440, 120);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    /* compiled from: UiBlockOnboardingBannerVh.kt */
    public static final class b implements yzs<l5g, androidx.compose.runtime.a, Integer, s3q0> {
        public static final b b = new b();

        @Override // xsna.yzs
        public final s3q0 invoke(l5g l5gVar, androidx.compose.runtime.a aVar, Integer num) {
            long j = l5gVar.a;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(223629088, intValue, -1, "com.vk.catalog2.common.ui.holders.placeholder.ComposableSingletons$UiBlockOnboardingBannerVhKt.lambda$223629088.<anonymous> (UiBlockOnboardingBannerVh.kt:170)");
                }
                vjw.a(pg90.a(R.drawable.illustration_vk_video_vinyl_player_88h, 0, aVar2), null, kci.m(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -34, 1, txj0.h(txj0.v(q630.a.a, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE), 88)), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar2, 440, 120);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }
}
