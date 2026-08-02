package com.yandex.go.scooters.misc.api.error_dialog;

import defpackage.akn0;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/scooters/misc/api/error_dialog/ScootersErrorDialogPresentation$BackDialogButtonListenerType", "Lakn0;", "", "Lcom/yandex/go/scooters/misc/api/error_dialog/ScootersErrorDialogPresentation$BackDialogButtonListenerType;", "DEFAULT", "RISKY_PARKING_CANCEL", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersErrorDialogPresentation$BackDialogButtonListenerType implements akn0 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersErrorDialogPresentation$BackDialogButtonListenerType[] $VALUES;
    public static final ScootersErrorDialogPresentation$BackDialogButtonListenerType DEFAULT;
    public static final ScootersErrorDialogPresentation$BackDialogButtonListenerType RISKY_PARKING_CANCEL;

    static {
        ScootersErrorDialogPresentation$BackDialogButtonListenerType scootersErrorDialogPresentation$BackDialogButtonListenerType = new ScootersErrorDialogPresentation$BackDialogButtonListenerType("DEFAULT", 0);
        DEFAULT = scootersErrorDialogPresentation$BackDialogButtonListenerType;
        ScootersErrorDialogPresentation$BackDialogButtonListenerType scootersErrorDialogPresentation$BackDialogButtonListenerType2 = new ScootersErrorDialogPresentation$BackDialogButtonListenerType("RISKY_PARKING_CANCEL", 1);
        RISKY_PARKING_CANCEL = scootersErrorDialogPresentation$BackDialogButtonListenerType2;
        ScootersErrorDialogPresentation$BackDialogButtonListenerType[] scootersErrorDialogPresentation$BackDialogButtonListenerTypeArr = {scootersErrorDialogPresentation$BackDialogButtonListenerType, scootersErrorDialogPresentation$BackDialogButtonListenerType2};
        $VALUES = scootersErrorDialogPresentation$BackDialogButtonListenerTypeArr;
        $ENTRIES = a.a(scootersErrorDialogPresentation$BackDialogButtonListenerTypeArr);
    }

    public static ScootersErrorDialogPresentation$BackDialogButtonListenerType valueOf(String str) {
        return (ScootersErrorDialogPresentation$BackDialogButtonListenerType) Enum.valueOf(ScootersErrorDialogPresentation$BackDialogButtonListenerType.class, str);
    }

    public static ScootersErrorDialogPresentation$BackDialogButtonListenerType[] values() {
        return (ScootersErrorDialogPresentation$BackDialogButtonListenerType[]) $VALUES.clone();
    }
}
