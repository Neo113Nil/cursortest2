package com.ybsdk.feature.qr.payments.internal.screens.presentation;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/screens/presentation/AmountScreenStatus;", "", "<init>", "(Ljava/lang/String;I)V", "SELECT_AGREEMENT", "EDIT_AMOUNT", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AmountScreenStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AmountScreenStatus[] $VALUES;
    public static final AmountScreenStatus SELECT_AGREEMENT = new AmountScreenStatus("SELECT_AGREEMENT", 0);
    public static final AmountScreenStatus EDIT_AMOUNT = new AmountScreenStatus("EDIT_AMOUNT", 1);

    private static final /* synthetic */ AmountScreenStatus[] $values() {
        return new AmountScreenStatus[]{SELECT_AGREEMENT, EDIT_AMOUNT};
    }

    static {
        AmountScreenStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AmountScreenStatus(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static AmountScreenStatus valueOf(String str) {
        return (AmountScreenStatus) Enum.valueOf(AmountScreenStatus.class, str);
    }

    public static AmountScreenStatus[] values() {
        return (AmountScreenStatus[]) $VALUES.clone();
    }
}
