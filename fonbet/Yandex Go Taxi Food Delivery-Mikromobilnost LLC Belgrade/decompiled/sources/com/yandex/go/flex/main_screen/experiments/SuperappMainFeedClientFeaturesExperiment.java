package com.yandex.go.flex.main_screen.experiments;

import com.yandex.go.flex.common.FlexibleGridVersion;
import defpackage.gsq0;
import defpackage.w96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/main_screen/experiments/SuperappMainFeedClientFeaturesExperiment;", "Lw96;", "Companion", "com/yandex/go/flex/main_screen/experiments/l", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuperappMainFeedClientFeaturesExperiment extends w96 {
    public static final l Companion = new l();
    public static final SuperappMainFeedClientFeaturesExperiment i = new SuperappMainFeedClientFeaturesExperiment(0);
    public final boolean b;
    public final OrderFeedDetailsAnalytics c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final DivKitSnippetCache h;

    public SuperappMainFeedClientFeaturesExperiment(int i2, boolean z, OrderFeedDetailsAnalytics orderFeedDetailsAnalytics, boolean z2, boolean z3, boolean z4, String str, DivKitSnippetCache divKitSnippetCache) {
        FlexibleGridVersion flexibleGridVersion;
        if ((i2 & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i2 & 2) == 0) {
            this.c = new OrderFeedDetailsAnalytics(0);
        } else {
            this.c = orderFeedDetailsAnalytics;
        }
        if ((i2 & 4) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
        if ((i2 & 8) == 0) {
            this.e = false;
        } else {
            this.e = z3;
        }
        if ((i2 & 16) == 0) {
            this.f = false;
        } else {
            this.f = z4;
        }
        if ((i2 & 32) == 0) {
            FlexibleGridVersion.Companion.getClass();
            flexibleGridVersion = FlexibleGridVersion.DEFAULT;
            this.g = flexibleGridVersion.getRawValue();
        } else {
            this.g = str;
        }
        if ((i2 & 64) == 0) {
            this.h = new DivKitSnippetCache(0);
        } else {
            this.h = divKitSnippetCache;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getC() {
        return this.b;
    }

    public SuperappMainFeedClientFeaturesExperiment() {
        this(0);
    }

    public SuperappMainFeedClientFeaturesExperiment(int i2) {
        FlexibleGridVersion flexibleGridVersion;
        OrderFeedDetailsAnalytics orderFeedDetailsAnalytics = new OrderFeedDetailsAnalytics(0);
        FlexibleGridVersion.Companion.getClass();
        flexibleGridVersion = FlexibleGridVersion.DEFAULT;
        String rawValue = flexibleGridVersion.getRawValue();
        DivKitSnippetCache divKitSnippetCache = new DivKitSnippetCache(0);
        this.b = false;
        this.c = orderFeedDetailsAnalytics;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = rawValue;
        this.h = divKitSnippetCache;
    }
}
