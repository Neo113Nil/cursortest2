package com.ybsdk.screens.upgrade.domain.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/screens/upgrade/domain/entities/UpgradeFormEntity$SecondDocumentType", "", "Lcom/ybsdk/screens/upgrade/domain/entities/UpgradeFormEntity$SecondDocumentType;", "<init>", "(Ljava/lang/String;I)V", "SNILS_OR_INN", "SNILS", "INN", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UpgradeFormEntity$SecondDocumentType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UpgradeFormEntity$SecondDocumentType[] $VALUES;
    public static final UpgradeFormEntity$SecondDocumentType SNILS_OR_INN = new UpgradeFormEntity$SecondDocumentType("SNILS_OR_INN", 0);
    public static final UpgradeFormEntity$SecondDocumentType SNILS = new UpgradeFormEntity$SecondDocumentType("SNILS", 1);
    public static final UpgradeFormEntity$SecondDocumentType INN = new UpgradeFormEntity$SecondDocumentType("INN", 2);

    private static final /* synthetic */ UpgradeFormEntity$SecondDocumentType[] $values() {
        return new UpgradeFormEntity$SecondDocumentType[]{SNILS_OR_INN, SNILS, INN};
    }

    static {
        UpgradeFormEntity$SecondDocumentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private UpgradeFormEntity$SecondDocumentType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static UpgradeFormEntity$SecondDocumentType valueOf(String str) {
        return (UpgradeFormEntity$SecondDocumentType) Enum.valueOf(UpgradeFormEntity$SecondDocumentType.class, str);
    }

    public static UpgradeFormEntity$SecondDocumentType[] values() {
        return (UpgradeFormEntity$SecondDocumentType[]) $VALUES.clone();
    }
}
