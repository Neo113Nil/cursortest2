package com.ybsdk.feature.split.deposit.internal.ui.autotopup.status;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/ui/autotopup/status/PartnerSelectionSavingState;", "", "<init>", "(Ljava/lang/String;I)V", CA20Status.STATUS_REQUEST_DESCRIPTION_P, "Timeout", "Success", "Fail", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PartnerSelectionSavingState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PartnerSelectionSavingState[] $VALUES;
    public static final PartnerSelectionSavingState Pending = new PartnerSelectionSavingState(CA20Status.STATUS_REQUEST_DESCRIPTION_P, 0);
    public static final PartnerSelectionSavingState Timeout = new PartnerSelectionSavingState("Timeout", 1);
    public static final PartnerSelectionSavingState Success = new PartnerSelectionSavingState("Success", 2);
    public static final PartnerSelectionSavingState Fail = new PartnerSelectionSavingState("Fail", 3);

    private static final /* synthetic */ PartnerSelectionSavingState[] $values() {
        return new PartnerSelectionSavingState[]{Pending, Timeout, Success, Fail};
    }

    static {
        PartnerSelectionSavingState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PartnerSelectionSavingState(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PartnerSelectionSavingState valueOf(String str) {
        return (PartnerSelectionSavingState) Enum.valueOf(PartnerSelectionSavingState.class, str);
    }

    public static PartnerSelectionSavingState[] values() {
        return (PartnerSelectionSavingState[]) $VALUES.clone();
    }
}
