package com.yandex.go.scooters.misc.api.error_dialog;

import defpackage.akn0;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/yandex/go/scooters/misc/api/error_dialog/ScootersErrorDialogPresentation$RetryDialogButtonListenerType", "Lakn0;", "", "Lcom/yandex/go/scooters/misc/api/error_dialog/ScootersErrorDialogPresentation$RetryDialogButtonListenerType;", "DEFAULT", "OPEN_SUPPORT", "OPEN_PAYMENT_METHODS", "FIND_NEAREST_PARKING", "RISKY_PARKING", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersErrorDialogPresentation$RetryDialogButtonListenerType implements akn0 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersErrorDialogPresentation$RetryDialogButtonListenerType[] $VALUES;
    public static final ScootersErrorDialogPresentation$RetryDialogButtonListenerType DEFAULT;
    public static final ScootersErrorDialogPresentation$RetryDialogButtonListenerType FIND_NEAREST_PARKING;
    public static final ScootersErrorDialogPresentation$RetryDialogButtonListenerType OPEN_PAYMENT_METHODS;
    public static final ScootersErrorDialogPresentation$RetryDialogButtonListenerType OPEN_SUPPORT;
    public static final ScootersErrorDialogPresentation$RetryDialogButtonListenerType RISKY_PARKING;

    static {
        ScootersErrorDialogPresentation$RetryDialogButtonListenerType scootersErrorDialogPresentation$RetryDialogButtonListenerType = new ScootersErrorDialogPresentation$RetryDialogButtonListenerType("DEFAULT", 0);
        DEFAULT = scootersErrorDialogPresentation$RetryDialogButtonListenerType;
        ScootersErrorDialogPresentation$RetryDialogButtonListenerType scootersErrorDialogPresentation$RetryDialogButtonListenerType2 = new ScootersErrorDialogPresentation$RetryDialogButtonListenerType("OPEN_SUPPORT", 1);
        OPEN_SUPPORT = scootersErrorDialogPresentation$RetryDialogButtonListenerType2;
        ScootersErrorDialogPresentation$RetryDialogButtonListenerType scootersErrorDialogPresentation$RetryDialogButtonListenerType3 = new ScootersErrorDialogPresentation$RetryDialogButtonListenerType("OPEN_PAYMENT_METHODS", 2);
        OPEN_PAYMENT_METHODS = scootersErrorDialogPresentation$RetryDialogButtonListenerType3;
        ScootersErrorDialogPresentation$RetryDialogButtonListenerType scootersErrorDialogPresentation$RetryDialogButtonListenerType4 = new ScootersErrorDialogPresentation$RetryDialogButtonListenerType("FIND_NEAREST_PARKING", 3);
        FIND_NEAREST_PARKING = scootersErrorDialogPresentation$RetryDialogButtonListenerType4;
        ScootersErrorDialogPresentation$RetryDialogButtonListenerType scootersErrorDialogPresentation$RetryDialogButtonListenerType5 = new ScootersErrorDialogPresentation$RetryDialogButtonListenerType("RISKY_PARKING", 4);
        RISKY_PARKING = scootersErrorDialogPresentation$RetryDialogButtonListenerType5;
        ScootersErrorDialogPresentation$RetryDialogButtonListenerType[] scootersErrorDialogPresentation$RetryDialogButtonListenerTypeArr = {scootersErrorDialogPresentation$RetryDialogButtonListenerType, scootersErrorDialogPresentation$RetryDialogButtonListenerType2, scootersErrorDialogPresentation$RetryDialogButtonListenerType3, scootersErrorDialogPresentation$RetryDialogButtonListenerType4, scootersErrorDialogPresentation$RetryDialogButtonListenerType5};
        $VALUES = scootersErrorDialogPresentation$RetryDialogButtonListenerTypeArr;
        $ENTRIES = a.a(scootersErrorDialogPresentation$RetryDialogButtonListenerTypeArr);
    }

    public static ScootersErrorDialogPresentation$RetryDialogButtonListenerType valueOf(String str) {
        return (ScootersErrorDialogPresentation$RetryDialogButtonListenerType) Enum.valueOf(ScootersErrorDialogPresentation$RetryDialogButtonListenerType.class, str);
    }

    public static ScootersErrorDialogPresentation$RetryDialogButtonListenerType[] values() {
        return (ScootersErrorDialogPresentation$RetryDialogButtonListenerType[]) $VALUES.clone();
    }
}
