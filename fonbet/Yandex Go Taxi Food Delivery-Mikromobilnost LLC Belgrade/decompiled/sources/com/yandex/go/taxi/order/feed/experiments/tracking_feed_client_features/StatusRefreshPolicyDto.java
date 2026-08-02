package com.yandex.go.taxi.order.feed.experiments.tracking_feed_client_features;

import defpackage.c3u0;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/feed/experiments/tracking_feed_client_features/StatusRefreshPolicyDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/feed/experiments/tracking_feed_client_features/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StatusRefreshPolicyDto {
    public static final c Companion = new c();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c3u0(9))};
    public final boolean a;
    public final List b;

    public /* synthetic */ StatusRefreshPolicyDto(int i, boolean z, List list) {
        this.a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public StatusRefreshPolicyDto(int i) {
        this.a = false;
        this.b = EmptyList.a;
    }

    public StatusRefreshPolicyDto() {
        this(0);
    }
}
