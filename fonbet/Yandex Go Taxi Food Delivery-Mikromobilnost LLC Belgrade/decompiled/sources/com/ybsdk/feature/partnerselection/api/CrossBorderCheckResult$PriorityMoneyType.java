package com.ybsdk.feature.partnerselection.api;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/partnerselection/api/CrossBorderCheckResult$PriorityMoneyType", "", "Lcom/ybsdk/feature/partnerselection/api/CrossBorderCheckResult$PriorityMoneyType;", "<init>", "(Ljava/lang/String;I)V", Card.CARD_TYPE_DEBIT, Card.CARD_TYPE_CREDIT, "feature-partner-selection-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrossBorderCheckResult$PriorityMoneyType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CrossBorderCheckResult$PriorityMoneyType[] $VALUES;
    public static final CrossBorderCheckResult$PriorityMoneyType DEBIT = new CrossBorderCheckResult$PriorityMoneyType(Card.CARD_TYPE_DEBIT, 0);
    public static final CrossBorderCheckResult$PriorityMoneyType CREDIT = new CrossBorderCheckResult$PriorityMoneyType(Card.CARD_TYPE_CREDIT, 1);

    private static final /* synthetic */ CrossBorderCheckResult$PriorityMoneyType[] $values() {
        return new CrossBorderCheckResult$PriorityMoneyType[]{DEBIT, CREDIT};
    }

    static {
        CrossBorderCheckResult$PriorityMoneyType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CrossBorderCheckResult$PriorityMoneyType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CrossBorderCheckResult$PriorityMoneyType valueOf(String str) {
        return (CrossBorderCheckResult$PriorityMoneyType) Enum.valueOf(CrossBorderCheckResult$PriorityMoneyType.class, str);
    }

    public static CrossBorderCheckResult$PriorityMoneyType[] values() {
        return (CrossBorderCheckResult$PriorityMoneyType[]) $VALUES.clone();
    }
}
