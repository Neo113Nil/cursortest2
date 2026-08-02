package com.yandex.go.safety.center.analytics;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/safety/center/analytics/SafetyCenterAnalytics$SafetyCenterNavigationSource", "", "Lcom/yandex/go/safety/center/analytics/SafetyCenterAnalytics$SafetyCenterNavigationSource;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Menu", "RideCard", "Deeplink", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SafetyCenterAnalytics$SafetyCenterNavigationSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SafetyCenterAnalytics$SafetyCenterNavigationSource[] $VALUES;
    public static final SafetyCenterAnalytics$SafetyCenterNavigationSource Deeplink;
    public static final SafetyCenterAnalytics$SafetyCenterNavigationSource Menu;
    public static final SafetyCenterAnalytics$SafetyCenterNavigationSource RideCard;
    private final String eventValue;

    static {
        SafetyCenterAnalytics$SafetyCenterNavigationSource safetyCenterAnalytics$SafetyCenterNavigationSource = new SafetyCenterAnalytics$SafetyCenterNavigationSource("Menu", 0, "menu");
        Menu = safetyCenterAnalytics$SafetyCenterNavigationSource;
        SafetyCenterAnalytics$SafetyCenterNavigationSource safetyCenterAnalytics$SafetyCenterNavigationSource2 = new SafetyCenterAnalytics$SafetyCenterNavigationSource("RideCard", 1, "ride_card");
        RideCard = safetyCenterAnalytics$SafetyCenterNavigationSource2;
        SafetyCenterAnalytics$SafetyCenterNavigationSource safetyCenterAnalytics$SafetyCenterNavigationSource3 = new SafetyCenterAnalytics$SafetyCenterNavigationSource("Deeplink", 2, Constants.DEEPLINK);
        Deeplink = safetyCenterAnalytics$SafetyCenterNavigationSource3;
        SafetyCenterAnalytics$SafetyCenterNavigationSource[] safetyCenterAnalytics$SafetyCenterNavigationSourceArr = {safetyCenterAnalytics$SafetyCenterNavigationSource, safetyCenterAnalytics$SafetyCenterNavigationSource2, safetyCenterAnalytics$SafetyCenterNavigationSource3};
        $VALUES = safetyCenterAnalytics$SafetyCenterNavigationSourceArr;
        $ENTRIES = kotlin.enums.a.a(safetyCenterAnalytics$SafetyCenterNavigationSourceArr);
    }

    public SafetyCenterAnalytics$SafetyCenterNavigationSource(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SafetyCenterAnalytics$SafetyCenterNavigationSource valueOf(String str) {
        return (SafetyCenterAnalytics$SafetyCenterNavigationSource) Enum.valueOf(SafetyCenterAnalytics$SafetyCenterNavigationSource.class, str);
    }

    public static SafetyCenterAnalytics$SafetyCenterNavigationSource[] values() {
        return (SafetyCenterAnalytics$SafetyCenterNavigationSource[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
