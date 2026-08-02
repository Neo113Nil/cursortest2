package com.yandex.mobile.ads.common.analytics.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/mobile/ads/common/analytics/model/AdAnalyticsStartupError;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "NETWORK", "INVALID_RESPONSE", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdAnalyticsStartupError {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AdAnalyticsStartupError[] $VALUES;
    public static final AdAnalyticsStartupError UNKNOWN = new AdAnalyticsStartupError("UNKNOWN", 0);
    public static final AdAnalyticsStartupError NETWORK = new AdAnalyticsStartupError("NETWORK", 1);
    public static final AdAnalyticsStartupError INVALID_RESPONSE = new AdAnalyticsStartupError("INVALID_RESPONSE", 2);

    private static final /* synthetic */ AdAnalyticsStartupError[] $values() {
        return new AdAnalyticsStartupError[]{UNKNOWN, NETWORK, INVALID_RESPONSE};
    }

    static {
        AdAnalyticsStartupError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private AdAnalyticsStartupError(String str, int i) {
    }

    public static AdAnalyticsStartupError valueOf(String str) {
        return (AdAnalyticsStartupError) Enum.valueOf(AdAnalyticsStartupError.class, str);
    }

    public static AdAnalyticsStartupError[] values() {
        return (AdAnalyticsStartupError[]) $VALUES.clone();
    }
}
