package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/CardCommonEvents$CardActivationInputValidationResultValidationResult", "", "Lcom/ybsdk/core/analytics/generated/delegates/CardCommonEvents$CardActivationInputValidationResultValidationResult;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "CARD_VALID", "CVV_VALID", "CARD_WRONG_LENGTH", "CARD_WRONG_VALUE", "CVV_WRONG_LENGTH", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardCommonEvents$CardActivationInputValidationResultValidationResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardCommonEvents$CardActivationInputValidationResultValidationResult[] $VALUES;
    private final String originalValue;
    public static final CardCommonEvents$CardActivationInputValidationResultValidationResult CARD_VALID = new CardCommonEvents$CardActivationInputValidationResultValidationResult("CARD_VALID", 0, "card_valid");
    public static final CardCommonEvents$CardActivationInputValidationResultValidationResult CVV_VALID = new CardCommonEvents$CardActivationInputValidationResultValidationResult("CVV_VALID", 1, "cvv_valid");
    public static final CardCommonEvents$CardActivationInputValidationResultValidationResult CARD_WRONG_LENGTH = new CardCommonEvents$CardActivationInputValidationResultValidationResult("CARD_WRONG_LENGTH", 2, "card_wrong_length");
    public static final CardCommonEvents$CardActivationInputValidationResultValidationResult CARD_WRONG_VALUE = new CardCommonEvents$CardActivationInputValidationResultValidationResult("CARD_WRONG_VALUE", 3, "card_wrong_value");
    public static final CardCommonEvents$CardActivationInputValidationResultValidationResult CVV_WRONG_LENGTH = new CardCommonEvents$CardActivationInputValidationResultValidationResult("CVV_WRONG_LENGTH", 4, "cvv_wrong_length");

    private static final /* synthetic */ CardCommonEvents$CardActivationInputValidationResultValidationResult[] $values() {
        return new CardCommonEvents$CardActivationInputValidationResultValidationResult[]{CARD_VALID, CVV_VALID, CARD_WRONG_LENGTH, CARD_WRONG_VALUE, CVV_WRONG_LENGTH};
    }

    static {
        CardCommonEvents$CardActivationInputValidationResultValidationResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private CardCommonEvents$CardActivationInputValidationResultValidationResult(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CardCommonEvents$CardActivationInputValidationResultValidationResult valueOf(String str) {
        return (CardCommonEvents$CardActivationInputValidationResultValidationResult) Enum.valueOf(CardCommonEvents$CardActivationInputValidationResultValidationResult.class, str);
    }

    public static CardCommonEvents$CardActivationInputValidationResultValidationResult[] values() {
        return (CardCommonEvents$CardActivationInputValidationResultValidationResult[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
