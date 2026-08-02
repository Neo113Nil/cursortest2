package com.ybsdk.feature.transfer.version2.internal.screens.common;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/transfer/version2/internal/screens/common/TransferContactsUtils$Companion$ElementsType", "", "Lcom/ybsdk/feature/transfer/version2/internal/screens/common/TransferContactsUtils$Companion$ElementsType;", "<init>", "(Ljava/lang/String;I)V", "TRANSFERS", "MOBILE_PROVIDERS", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferContactsUtils$Companion$ElementsType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransferContactsUtils$Companion$ElementsType[] $VALUES;
    public static final TransferContactsUtils$Companion$ElementsType TRANSFERS = new TransferContactsUtils$Companion$ElementsType("TRANSFERS", 0);
    public static final TransferContactsUtils$Companion$ElementsType MOBILE_PROVIDERS = new TransferContactsUtils$Companion$ElementsType("MOBILE_PROVIDERS", 1);

    private static final /* synthetic */ TransferContactsUtils$Companion$ElementsType[] $values() {
        return new TransferContactsUtils$Companion$ElementsType[]{TRANSFERS, MOBILE_PROVIDERS};
    }

    static {
        TransferContactsUtils$Companion$ElementsType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private TransferContactsUtils$Companion$ElementsType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransferContactsUtils$Companion$ElementsType valueOf(String str) {
        return (TransferContactsUtils$Companion$ElementsType) Enum.valueOf(TransferContactsUtils$Companion$ElementsType.class, str);
    }

    public static TransferContactsUtils$Companion$ElementsType[] values() {
        return (TransferContactsUtils$Companion$ElementsType[]) $VALUES.clone();
    }
}
