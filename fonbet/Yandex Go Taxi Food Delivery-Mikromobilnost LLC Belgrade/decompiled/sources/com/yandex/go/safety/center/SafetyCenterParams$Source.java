package com.yandex.go.safety.center;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/safety/center/SafetyCenterParams$Source", "", "Lcom/yandex/go/safety/center/SafetyCenterParams$Source;", "", "analyticsName", "Ljava/lang/String;", "getAnalyticsName", "()Ljava/lang/String;", "MENU", "ORDER_CARD", "SAFETY_CENTER_DEEPLINK", "ACCIDENT_DEEPLINK", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SafetyCenterParams$Source {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SafetyCenterParams$Source[] $VALUES;
    public static final SafetyCenterParams$Source ACCIDENT_DEEPLINK;
    public static final SafetyCenterParams$Source MENU;
    public static final SafetyCenterParams$Source ORDER_CARD;
    public static final SafetyCenterParams$Source SAFETY_CENTER_DEEPLINK;
    private final String analyticsName;

    static {
        SafetyCenterParams$Source safetyCenterParams$Source = new SafetyCenterParams$Source("MENU", 0, "menu");
        MENU = safetyCenterParams$Source;
        SafetyCenterParams$Source safetyCenterParams$Source2 = new SafetyCenterParams$Source("ORDER_CARD", 1, "order_card");
        ORDER_CARD = safetyCenterParams$Source2;
        SafetyCenterParams$Source safetyCenterParams$Source3 = new SafetyCenterParams$Source("SAFETY_CENTER_DEEPLINK", 2, Constants.DEEPLINK);
        SAFETY_CENTER_DEEPLINK = safetyCenterParams$Source3;
        SafetyCenterParams$Source safetyCenterParams$Source4 = new SafetyCenterParams$Source("ACCIDENT_DEEPLINK", 3, "");
        ACCIDENT_DEEPLINK = safetyCenterParams$Source4;
        SafetyCenterParams$Source[] safetyCenterParams$SourceArr = {safetyCenterParams$Source, safetyCenterParams$Source2, safetyCenterParams$Source3, safetyCenterParams$Source4};
        $VALUES = safetyCenterParams$SourceArr;
        $ENTRIES = kotlin.enums.a.a(safetyCenterParams$SourceArr);
    }

    public SafetyCenterParams$Source(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static SafetyCenterParams$Source valueOf(String str) {
        return (SafetyCenterParams$Source) Enum.valueOf(SafetyCenterParams$Source.class, str);
    }

    public static SafetyCenterParams$Source[] values() {
        return (SafetyCenterParams$Source[]) $VALUES.clone();
    }
}
