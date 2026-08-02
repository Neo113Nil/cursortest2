package com.yandex.go.quark.api.router;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/quark/api/router/QuarkDynamicFeatureRouter$Payload$DisplayMode", "", "Lcom/yandex/go/quark/api/router/QuarkDynamicFeatureRouter$Payload$DisplayMode;", "Default", "Headerless", "go-client-android.features.quark:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class QuarkDynamicFeatureRouter$Payload$DisplayMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ QuarkDynamicFeatureRouter$Payload$DisplayMode[] $VALUES;
    public static final QuarkDynamicFeatureRouter$Payload$DisplayMode Default;
    public static final QuarkDynamicFeatureRouter$Payload$DisplayMode Headerless;

    static {
        QuarkDynamicFeatureRouter$Payload$DisplayMode quarkDynamicFeatureRouter$Payload$DisplayMode = new QuarkDynamicFeatureRouter$Payload$DisplayMode("Default", 0);
        Default = quarkDynamicFeatureRouter$Payload$DisplayMode;
        QuarkDynamicFeatureRouter$Payload$DisplayMode quarkDynamicFeatureRouter$Payload$DisplayMode2 = new QuarkDynamicFeatureRouter$Payload$DisplayMode("Headerless", 1);
        Headerless = quarkDynamicFeatureRouter$Payload$DisplayMode2;
        QuarkDynamicFeatureRouter$Payload$DisplayMode[] quarkDynamicFeatureRouter$Payload$DisplayModeArr = {quarkDynamicFeatureRouter$Payload$DisplayMode, quarkDynamicFeatureRouter$Payload$DisplayMode2};
        $VALUES = quarkDynamicFeatureRouter$Payload$DisplayModeArr;
        $ENTRIES = a.a(quarkDynamicFeatureRouter$Payload$DisplayModeArr);
    }

    public static QuarkDynamicFeatureRouter$Payload$DisplayMode valueOf(String str) {
        return (QuarkDynamicFeatureRouter$Payload$DisplayMode) Enum.valueOf(QuarkDynamicFeatureRouter$Payload$DisplayMode.class, str);
    }

    public static QuarkDynamicFeatureRouter$Payload$DisplayMode[] values() {
        return (QuarkDynamicFeatureRouter$Payload$DisplayMode[]) $VALUES.clone();
    }
}
