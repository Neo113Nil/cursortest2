package com.ybsdk.feature.pin.api.entities;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/feature/pin/api/entities/PinApplicationTypeEntity;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "PRODUCT", "REGISTRATION", "SIMPLIFIED_IDENTIFICATION", "DIGITAL_CARD_ISSUE", "CHANGE_PHONE", "feature-pin_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PinApplicationTypeEntity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PinApplicationTypeEntity[] $VALUES;
    public static final PinApplicationTypeEntity UNKNOWN = new PinApplicationTypeEntity("UNKNOWN", 0);
    public static final PinApplicationTypeEntity PRODUCT = new PinApplicationTypeEntity("PRODUCT", 1);
    public static final PinApplicationTypeEntity REGISTRATION = new PinApplicationTypeEntity("REGISTRATION", 2);
    public static final PinApplicationTypeEntity SIMPLIFIED_IDENTIFICATION = new PinApplicationTypeEntity("SIMPLIFIED_IDENTIFICATION", 3);
    public static final PinApplicationTypeEntity DIGITAL_CARD_ISSUE = new PinApplicationTypeEntity("DIGITAL_CARD_ISSUE", 4);
    public static final PinApplicationTypeEntity CHANGE_PHONE = new PinApplicationTypeEntity("CHANGE_PHONE", 5);

    private static final /* synthetic */ PinApplicationTypeEntity[] $values() {
        return new PinApplicationTypeEntity[]{UNKNOWN, PRODUCT, REGISTRATION, SIMPLIFIED_IDENTIFICATION, DIGITAL_CARD_ISSUE, CHANGE_PHONE};
    }

    static {
        PinApplicationTypeEntity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PinApplicationTypeEntity(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PinApplicationTypeEntity valueOf(String str) {
        return (PinApplicationTypeEntity) Enum.valueOf(PinApplicationTypeEntity.class, str);
    }

    public static PinApplicationTypeEntity[] values() {
        return (PinApplicationTypeEntity[]) $VALUES.clone();
    }
}
