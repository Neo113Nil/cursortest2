package com.yandex.plus.pay.ui.core.mobile.haptic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/plus/pay/ui/core/mobile/haptic/HapticType;", "", "SUCCESS", "ERROR", "CLICK", "pay-sdk-ui-core-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HapticType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HapticType[] $VALUES;
    public static final HapticType CLICK;
    public static final HapticType ERROR;
    public static final HapticType SUCCESS;

    static {
        HapticType hapticType = new HapticType("SUCCESS", 0);
        SUCCESS = hapticType;
        HapticType hapticType2 = new HapticType("ERROR", 1);
        ERROR = hapticType2;
        HapticType hapticType3 = new HapticType("CLICK", 2);
        CLICK = hapticType3;
        HapticType[] hapticTypeArr = {hapticType, hapticType2, hapticType3};
        $VALUES = hapticTypeArr;
        $ENTRIES = a.a(hapticTypeArr);
    }

    public static HapticType valueOf(String str) {
        return (HapticType) Enum.valueOf(HapticType.class, str);
    }

    public static HapticType[] values() {
        return (HapticType[]) $VALUES.clone();
    }
}
