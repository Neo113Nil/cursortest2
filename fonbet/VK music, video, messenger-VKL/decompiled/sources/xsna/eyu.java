package xsna;

import com.android.billingclient.api.BillingClient;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;

/* compiled from: HeaderTabsMapper.kt */
/* loaded from: classes17.dex */
public final class eyu {
    public static ClipFeedTab a(String str, ClipFeedTab.WithPayload.Payload payload) {
        switch (str.hashCode()) {
            case -865586570:
                if (str.equals("trends")) {
                    return new ClipFeedTab.ClipsFromTrendsSource.Top(ClipFeedTab.ClipsFromTrendsSource.SourceType.TAB, payload);
                }
                return null;
            case 112784:
                if (str.equals("rec")) {
                    return new ClipFeedTab.TopVideo(null, null, null, null, payload, 15, null);
                }
                return null;
            case 109413437:
                if (str.equals("shops")) {
                    return new ClipFeedTab.ClipsFromShopsSource.Top(ClipFeedTab.ClipsFromShopsSource.SourceType.TAB, payload);
                }
                return null;
            case 1987365622:
                if (str.equals(BillingClient.FeatureType.SUBSCRIPTIONS)) {
                    return ClipFeedTab.UserSubscriptions.b;
                }
                return null;
            default:
                return null;
        }
    }
}
