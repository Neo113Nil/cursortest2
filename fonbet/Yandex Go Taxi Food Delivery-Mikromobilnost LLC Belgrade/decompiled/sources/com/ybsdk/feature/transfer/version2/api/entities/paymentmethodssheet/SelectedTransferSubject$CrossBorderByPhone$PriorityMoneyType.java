package com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType", "", "Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType;", "<init>", "(Ljava/lang/String;I)V", Card.CARD_TYPE_DEBIT, Card.CARD_TYPE_CREDIT, "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType[] $VALUES;
    public static final SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType DEBIT = new SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType(Card.CARD_TYPE_DEBIT, 0);
    public static final SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType CREDIT = new SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType(Card.CARD_TYPE_CREDIT, 1);

    private static final /* synthetic */ SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType[] $values() {
        return new SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType[]{DEBIT, CREDIT};
    }

    static {
        SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType valueOf(String str) {
        return (SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType) Enum.valueOf(SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType.class, str);
    }

    public static SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType[] values() {
        return (SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType[]) $VALUES.clone();
    }
}
