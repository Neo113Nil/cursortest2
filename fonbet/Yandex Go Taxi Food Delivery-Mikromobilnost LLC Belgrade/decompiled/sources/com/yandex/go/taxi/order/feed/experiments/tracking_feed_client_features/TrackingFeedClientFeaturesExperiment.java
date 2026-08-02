package com.yandex.go.taxi.order.feed.experiments.tracking_feed_client_features;

import com.yandex.go.flex.common.FlexibleGridVersion;
import defpackage.gsq0;
import defpackage.w96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/feed/experiments/tracking_feed_client_features/TrackingFeedClientFeaturesExperiment;", "Lw96;", "Companion", "com/yandex/go/taxi/order/feed/experiments/tracking_feed_client_features/e", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TrackingFeedClientFeaturesExperiment extends w96 {
    public static final e Companion = new e();
    public static final TrackingFeedClientFeaturesExperiment i = new TrackingFeedClientFeaturesExperiment(0);
    public final boolean b;
    public final TrackingFeedAnalytics c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final DivKitSnippetCache g;
    public final StatusRefreshPolicyDto h;

    public TrackingFeedClientFeaturesExperiment(int i2, boolean z, TrackingFeedAnalytics trackingFeedAnalytics, boolean z2, String str, boolean z3, DivKitSnippetCache divKitSnippetCache, StatusRefreshPolicyDto statusRefreshPolicyDto) {
        FlexibleGridVersion flexibleGridVersion;
        if ((i2 & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i2 & 2) == 0) {
            this.c = new TrackingFeedAnalytics(0);
        } else {
            this.c = trackingFeedAnalytics;
        }
        if ((i2 & 4) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
        if ((i2 & 8) == 0) {
            FlexibleGridVersion.Companion.getClass();
            flexibleGridVersion = FlexibleGridVersion.DEFAULT;
            this.e = flexibleGridVersion.getRawValue();
        } else {
            this.e = str;
        }
        if ((i2 & 16) == 0) {
            this.f = false;
        } else {
            this.f = z3;
        }
        if ((i2 & 32) == 0) {
            this.g = new DivKitSnippetCache(0);
        } else {
            this.g = divKitSnippetCache;
        }
        if ((i2 & 64) == 0) {
            this.h = new StatusRefreshPolicyDto(0);
        } else {
            this.h = statusRefreshPolicyDto;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getC() {
        return this.b;
    }

    public TrackingFeedClientFeaturesExperiment() {
        this(0);
    }

    public TrackingFeedClientFeaturesExperiment(int i2) {
        FlexibleGridVersion flexibleGridVersion;
        TrackingFeedAnalytics trackingFeedAnalytics = new TrackingFeedAnalytics(0);
        FlexibleGridVersion.Companion.getClass();
        flexibleGridVersion = FlexibleGridVersion.DEFAULT;
        String rawValue = flexibleGridVersion.getRawValue();
        DivKitSnippetCache divKitSnippetCache = new DivKitSnippetCache(0);
        StatusRefreshPolicyDto statusRefreshPolicyDto = new StatusRefreshPolicyDto(0);
        this.b = false;
        this.c = trackingFeedAnalytics;
        this.d = false;
        this.e = rawValue;
        this.f = false;
        this.g = divKitSnippetCache;
        this.h = statusRefreshPolicyDto;
    }
}
