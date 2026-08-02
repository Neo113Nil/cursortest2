package com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.presentation;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/transfer/version2/internal/screens/mobilepayments/screens/selectcontact/presentation/MobilePaymentSelectContactState$SelectedContact$Status", "", "Lcom/ybsdk/feature/transfer/version2/internal/screens/mobilepayments/screens/selectcontact/presentation/MobilePaymentSelectContactState$SelectedContact$Status;", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "CHECKING", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MobilePaymentSelectContactState$SelectedContact$Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MobilePaymentSelectContactState$SelectedContact$Status[] $VALUES;
    public static final MobilePaymentSelectContactState$SelectedContact$Status DEFAULT = new MobilePaymentSelectContactState$SelectedContact$Status("DEFAULT", 0);
    public static final MobilePaymentSelectContactState$SelectedContact$Status CHECKING = new MobilePaymentSelectContactState$SelectedContact$Status("CHECKING", 1);

    private static final /* synthetic */ MobilePaymentSelectContactState$SelectedContact$Status[] $values() {
        return new MobilePaymentSelectContactState$SelectedContact$Status[]{DEFAULT, CHECKING};
    }

    static {
        MobilePaymentSelectContactState$SelectedContact$Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private MobilePaymentSelectContactState$SelectedContact$Status(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static MobilePaymentSelectContactState$SelectedContact$Status valueOf(String str) {
        return (MobilePaymentSelectContactState$SelectedContact$Status) Enum.valueOf(MobilePaymentSelectContactState$SelectedContact$Status.class, str);
    }

    public static MobilePaymentSelectContactState$SelectedContact$Status[] values() {
        return (MobilePaymentSelectContactState$SelectedContact$Status[]) $VALUES.clone();
    }
}
