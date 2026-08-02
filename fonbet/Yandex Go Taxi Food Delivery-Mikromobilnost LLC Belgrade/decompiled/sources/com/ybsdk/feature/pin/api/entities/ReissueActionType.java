package com.ybsdk.feature.pin.api.entities;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/pin/api/entities/ReissueActionType;", "", "<init>", "(Ljava/lang/String;I)V", JCP.RAW_PREFIX, "SETUP_PIN", "TOO_MANY_ATTEMPTS", "feature-pin_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReissueActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ReissueActionType[] $VALUES;
    public static final ReissueActionType NONE = new ReissueActionType(JCP.RAW_PREFIX, 0);
    public static final ReissueActionType SETUP_PIN = new ReissueActionType("SETUP_PIN", 1);
    public static final ReissueActionType TOO_MANY_ATTEMPTS = new ReissueActionType("TOO_MANY_ATTEMPTS", 2);

    private static final /* synthetic */ ReissueActionType[] $values() {
        return new ReissueActionType[]{NONE, SETUP_PIN, TOO_MANY_ATTEMPTS};
    }

    static {
        ReissueActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ReissueActionType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ReissueActionType valueOf(String str) {
        return (ReissueActionType) Enum.valueOf(ReissueActionType.class, str);
    }

    public static ReissueActionType[] values() {
        return (ReissueActionType[]) $VALUES.clone();
    }
}
