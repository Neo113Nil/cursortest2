package com.yandex.go.scooters.misc.api.error_dialog;

import defpackage.akn0;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/scooters/misc/api/error_dialog/ScootersErrorDialogPresentation$OkDialogButtonListenerType", "Lakn0;", "", "Lcom/yandex/go/scooters/misc/api/error_dialog/ScootersErrorDialogPresentation$OkDialogButtonListenerType;", "DEFAULT", "FIND_ANOTHER_SCOOTER_ON_PARKING", "OPEN_MOS_RU", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersErrorDialogPresentation$OkDialogButtonListenerType implements akn0 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersErrorDialogPresentation$OkDialogButtonListenerType[] $VALUES;
    public static final ScootersErrorDialogPresentation$OkDialogButtonListenerType DEFAULT;
    public static final ScootersErrorDialogPresentation$OkDialogButtonListenerType FIND_ANOTHER_SCOOTER_ON_PARKING;
    public static final ScootersErrorDialogPresentation$OkDialogButtonListenerType OPEN_MOS_RU;

    static {
        ScootersErrorDialogPresentation$OkDialogButtonListenerType scootersErrorDialogPresentation$OkDialogButtonListenerType = new ScootersErrorDialogPresentation$OkDialogButtonListenerType("DEFAULT", 0);
        DEFAULT = scootersErrorDialogPresentation$OkDialogButtonListenerType;
        ScootersErrorDialogPresentation$OkDialogButtonListenerType scootersErrorDialogPresentation$OkDialogButtonListenerType2 = new ScootersErrorDialogPresentation$OkDialogButtonListenerType("FIND_ANOTHER_SCOOTER_ON_PARKING", 1);
        FIND_ANOTHER_SCOOTER_ON_PARKING = scootersErrorDialogPresentation$OkDialogButtonListenerType2;
        ScootersErrorDialogPresentation$OkDialogButtonListenerType scootersErrorDialogPresentation$OkDialogButtonListenerType3 = new ScootersErrorDialogPresentation$OkDialogButtonListenerType("OPEN_MOS_RU", 2);
        OPEN_MOS_RU = scootersErrorDialogPresentation$OkDialogButtonListenerType3;
        ScootersErrorDialogPresentation$OkDialogButtonListenerType[] scootersErrorDialogPresentation$OkDialogButtonListenerTypeArr = {scootersErrorDialogPresentation$OkDialogButtonListenerType, scootersErrorDialogPresentation$OkDialogButtonListenerType2, scootersErrorDialogPresentation$OkDialogButtonListenerType3};
        $VALUES = scootersErrorDialogPresentation$OkDialogButtonListenerTypeArr;
        $ENTRIES = a.a(scootersErrorDialogPresentation$OkDialogButtonListenerTypeArr);
    }

    public static ScootersErrorDialogPresentation$OkDialogButtonListenerType valueOf(String str) {
        return (ScootersErrorDialogPresentation$OkDialogButtonListenerType) Enum.valueOf(ScootersErrorDialogPresentation$OkDialogButtonListenerType.class, str);
    }

    public static ScootersErrorDialogPresentation$OkDialogButtonListenerType[] values() {
        return (ScootersErrorDialogPresentation$OkDialogButtonListenerType[]) $VALUES.clone();
    }
}
