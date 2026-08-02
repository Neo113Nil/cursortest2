package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.BidTokenCallback;
import com.vungle.ads.SdkVersionTooLow;
import com.vungle.ads.VungleAds;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.msy;
import xsna.vo2;

/* loaded from: classes7.dex */
public final class z2 {
    public static void a(Context context, BidTokenCallback bidTokenCallback) {
        if (com.vungle.ads.internal.util.z.a()) {
            new SdkVersionTooLow("RTB: SDK is supported only for API versions 25 and above.").logErrorNoReturnValue$vungle_ads_release();
            bidTokenCallback.onBidTokenError("RTB: SDK is supported only for API versions 25 and above.");
            return;
        }
        if (!VungleAds.Companion.isInitialized()) {
            PrivacyManager.INSTANCE.a(context.getApplicationContext());
        }
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        ((com.vungle.ads.internal.executor.d) msy.a(lazyThreadSafetyMode, new y2(context)).getValue()).a().execute(new vo2(9, bidTokenCallback, msy.a(lazyThreadSafetyMode, new x2(context))));
    }

    public static final void a(BidTokenCallback bidTokenCallback, Lazy lazy) {
        n2 n2Var = new n2(Sdk.SDKMetric.SDKMetricType.BID_TOKEN_REQUEST_TO_RESPONSE_DURATION_MS);
        n2Var.e();
        com.vungle.ads.internal.bidding.b b = ((com.vungle.ads.internal.bidding.e) lazy.getValue()).b();
        n2Var.d();
        if (b.a().length() > 0) {
            bidTokenCallback.onBidTokenCollected(b.a());
        } else {
            n2Var.a(Sdk.SDKMetric.SDKMetricType.BID_TOKEN_REQUEST_TO_FAIL_DURATION_MS);
            n2Var.a(b.b());
            bidTokenCallback.onBidTokenError(b.b());
        }
        AnalyticsClient.a(AnalyticsClient.INSTANCE, n2Var, (com.vungle.ads.internal.util.s) null, 6);
    }
}
