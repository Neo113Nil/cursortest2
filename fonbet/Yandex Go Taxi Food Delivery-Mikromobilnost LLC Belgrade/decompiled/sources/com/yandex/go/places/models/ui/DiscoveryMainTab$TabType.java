package com.yandex.go.places.models.ui;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/models/ui/DiscoveryMainTab$TabType", "", "Lcom/yandex/go/places/models/ui/DiscoveryMainTab$TabType;", "NATIVE_TAB", "FLEX_TAB", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DiscoveryMainTab$TabType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DiscoveryMainTab$TabType[] $VALUES;
    public static final DiscoveryMainTab$TabType FLEX_TAB;
    public static final DiscoveryMainTab$TabType NATIVE_TAB;

    static {
        DiscoveryMainTab$TabType discoveryMainTab$TabType = new DiscoveryMainTab$TabType("NATIVE_TAB", 0);
        NATIVE_TAB = discoveryMainTab$TabType;
        DiscoveryMainTab$TabType discoveryMainTab$TabType2 = new DiscoveryMainTab$TabType("FLEX_TAB", 1);
        FLEX_TAB = discoveryMainTab$TabType2;
        DiscoveryMainTab$TabType[] discoveryMainTab$TabTypeArr = {discoveryMainTab$TabType, discoveryMainTab$TabType2};
        $VALUES = discoveryMainTab$TabTypeArr;
        $ENTRIES = a.a(discoveryMainTab$TabTypeArr);
    }

    public static DiscoveryMainTab$TabType valueOf(String str) {
        return (DiscoveryMainTab$TabType) Enum.valueOf(DiscoveryMainTab$TabType.class, str);
    }

    public static DiscoveryMainTab$TabType[] values() {
        return (DiscoveryMainTab$TabType[]) $VALUES.clone();
    }
}
