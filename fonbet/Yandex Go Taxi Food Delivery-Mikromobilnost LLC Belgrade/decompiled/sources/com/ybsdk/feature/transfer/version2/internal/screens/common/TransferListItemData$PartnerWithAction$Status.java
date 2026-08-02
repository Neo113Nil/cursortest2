package com.ybsdk.feature.transfer.version2.internal.screens.common;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/ybsdk/feature/transfer/version2/internal/screens/common/TransferListItemData$PartnerWithAction$Status", "", "Lcom/ybsdk/feature/transfer/version2/internal/screens/common/TransferListItemData$PartnerWithAction$Status;", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "CHECKING", "NOT_FOUND", "FOUND", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferListItemData$PartnerWithAction$Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransferListItemData$PartnerWithAction$Status[] $VALUES;
    public static final TransferListItemData$PartnerWithAction$Status DEFAULT = new TransferListItemData$PartnerWithAction$Status("DEFAULT", 0);
    public static final TransferListItemData$PartnerWithAction$Status CHECKING = new TransferListItemData$PartnerWithAction$Status("CHECKING", 1);
    public static final TransferListItemData$PartnerWithAction$Status NOT_FOUND = new TransferListItemData$PartnerWithAction$Status("NOT_FOUND", 2);
    public static final TransferListItemData$PartnerWithAction$Status FOUND = new TransferListItemData$PartnerWithAction$Status("FOUND", 3);

    private static final /* synthetic */ TransferListItemData$PartnerWithAction$Status[] $values() {
        return new TransferListItemData$PartnerWithAction$Status[]{DEFAULT, CHECKING, NOT_FOUND, FOUND};
    }

    static {
        TransferListItemData$PartnerWithAction$Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private TransferListItemData$PartnerWithAction$Status(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransferListItemData$PartnerWithAction$Status valueOf(String str) {
        return (TransferListItemData$PartnerWithAction$Status) Enum.valueOf(TransferListItemData$PartnerWithAction$Status.class, str);
    }

    public static TransferListItemData$PartnerWithAction$Status[] values() {
        return (TransferListItemData$PartnerWithAction$Status[]) $VALUES.clone();
    }
}
