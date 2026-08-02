package com.yandex.go.taxi.order.feed.experiments.tracking_feed_client_features;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/feed/experiments/tracking_feed_client_features/TrackingFeedAnalytics;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/feed/experiments/tracking_feed_client_features/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TrackingFeedAnalytics {
    public static final d Companion = new d();
    public final RealtimeAnalytics a;

    public /* synthetic */ TrackingFeedAnalytics(int i, RealtimeAnalytics realtimeAnalytics) {
        if ((i & 1) == 0) {
            this.a = new RealtimeAnalytics(0);
        } else {
            this.a = realtimeAnalytics;
        }
    }

    public TrackingFeedAnalytics() {
        this(0);
    }

    public TrackingFeedAnalytics(int i) {
        this.a = new RealtimeAnalytics(0);
    }
}
