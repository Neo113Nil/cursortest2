package com.yandex.messaging.miniapps.size;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/messaging/miniapps/size/PredefinedSizeValue;", "", "MatchSafeViewportArea", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PredefinedSizeValue {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PredefinedSizeValue[] $VALUES;
    public static final PredefinedSizeValue MatchSafeViewportArea;

    static {
        PredefinedSizeValue predefinedSizeValue = new PredefinedSizeValue("MatchSafeViewportArea", 0);
        MatchSafeViewportArea = predefinedSizeValue;
        PredefinedSizeValue[] predefinedSizeValueArr = {predefinedSizeValue};
        $VALUES = predefinedSizeValueArr;
        $ENTRIES = a.a(predefinedSizeValueArr);
    }

    public static PredefinedSizeValue valueOf(String str) {
        return (PredefinedSizeValue) Enum.valueOf(PredefinedSizeValue.class, str);
    }

    public static PredefinedSizeValue[] values() {
        return (PredefinedSizeValue[]) $VALUES.clone();
    }
}
