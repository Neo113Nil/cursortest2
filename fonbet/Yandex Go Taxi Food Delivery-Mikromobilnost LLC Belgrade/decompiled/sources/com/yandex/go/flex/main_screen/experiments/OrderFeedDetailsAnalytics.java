package com.yandex.go.flex.main_screen.experiments;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/main_screen/experiments/OrderFeedDetailsAnalytics;", "", "Companion", "$serializer", "com/yandex/go/flex/main_screen/experiments/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OrderFeedDetailsAnalytics {
    public static final b Companion = new b();
    public final RealtimeAnalytics a;

    public /* synthetic */ OrderFeedDetailsAnalytics(int i, RealtimeAnalytics realtimeAnalytics) {
        if ((i & 1) == 0) {
            this.a = new RealtimeAnalytics(0);
        } else {
            this.a = realtimeAnalytics;
        }
    }

    public OrderFeedDetailsAnalytics() {
        this(0);
    }

    public OrderFeedDetailsAnalytics(int i) {
        this.a = new RealtimeAnalytics(0);
    }
}
