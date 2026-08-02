package com.ybsdk.feature.card.internal.presentation.cardactivation;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/feature/card/internal/presentation/cardactivation/CardNumberValidationResult;", "", "<init>", "(Ljava/lang/String;I)V", "VALID", "EMPTY", "WRONG_VALUE", "WRONG_LENGTH", "SERVER_VALIDATION_ERROR", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardNumberValidationResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardNumberValidationResult[] $VALUES;
    public static final CardNumberValidationResult VALID = new CardNumberValidationResult("VALID", 0);
    public static final CardNumberValidationResult EMPTY = new CardNumberValidationResult("EMPTY", 1);
    public static final CardNumberValidationResult WRONG_VALUE = new CardNumberValidationResult("WRONG_VALUE", 2);
    public static final CardNumberValidationResult WRONG_LENGTH = new CardNumberValidationResult("WRONG_LENGTH", 3);
    public static final CardNumberValidationResult SERVER_VALIDATION_ERROR = new CardNumberValidationResult("SERVER_VALIDATION_ERROR", 4);

    private static final /* synthetic */ CardNumberValidationResult[] $values() {
        return new CardNumberValidationResult[]{VALID, EMPTY, WRONG_VALUE, WRONG_LENGTH, SERVER_VALIDATION_ERROR};
    }

    static {
        CardNumberValidationResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CardNumberValidationResult(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CardNumberValidationResult valueOf(String str) {
        return (CardNumberValidationResult) Enum.valueOf(CardNumberValidationResult.class, str);
    }

    public static CardNumberValidationResult[] values() {
        return (CardNumberValidationResult[]) $VALUES.clone();
    }
}
