package com.ybsdk.feature.transfer.version2.internal.screens.phone;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/transfer/version2/internal/screens/phone/TransferPhoneInputState$SelectedPhone$Status", "", "Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/TransferPhoneInputState$SelectedPhone$Status;", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "CHECKING", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferPhoneInputState$SelectedPhone$Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransferPhoneInputState$SelectedPhone$Status[] $VALUES;
    public static final TransferPhoneInputState$SelectedPhone$Status DEFAULT = new TransferPhoneInputState$SelectedPhone$Status("DEFAULT", 0);
    public static final TransferPhoneInputState$SelectedPhone$Status CHECKING = new TransferPhoneInputState$SelectedPhone$Status("CHECKING", 1);

    private static final /* synthetic */ TransferPhoneInputState$SelectedPhone$Status[] $values() {
        return new TransferPhoneInputState$SelectedPhone$Status[]{DEFAULT, CHECKING};
    }

    static {
        TransferPhoneInputState$SelectedPhone$Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private TransferPhoneInputState$SelectedPhone$Status(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransferPhoneInputState$SelectedPhone$Status valueOf(String str) {
        return (TransferPhoneInputState$SelectedPhone$Status) Enum.valueOf(TransferPhoneInputState$SelectedPhone$Status.class, str);
    }

    public static TransferPhoneInputState$SelectedPhone$Status[] values() {
        return (TransferPhoneInputState$SelectedPhone$Status[]) $VALUES.clone();
    }
}
