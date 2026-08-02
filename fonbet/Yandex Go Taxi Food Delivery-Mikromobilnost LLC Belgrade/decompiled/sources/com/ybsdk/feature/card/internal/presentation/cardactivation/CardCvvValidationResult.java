package com.ybsdk.feature.card.internal.presentation.cardactivation;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/card/internal/presentation/cardactivation/CardCvvValidationResult;", "", "<init>", "(Ljava/lang/String;I)V", "VALID", "EMPTY", "WRONG_LENGTH", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardCvvValidationResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardCvvValidationResult[] $VALUES;
    public static final CardCvvValidationResult VALID = new CardCvvValidationResult("VALID", 0);
    public static final CardCvvValidationResult EMPTY = new CardCvvValidationResult("EMPTY", 1);
    public static final CardCvvValidationResult WRONG_LENGTH = new CardCvvValidationResult("WRONG_LENGTH", 2);

    private static final /* synthetic */ CardCvvValidationResult[] $values() {
        return new CardCvvValidationResult[]{VALID, EMPTY, WRONG_LENGTH};
    }

    static {
        CardCvvValidationResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CardCvvValidationResult(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CardCvvValidationResult valueOf(String str) {
        return (CardCvvValidationResult) Enum.valueOf(CardCvvValidationResult.class, str);
    }

    public static CardCvvValidationResult[] values() {
        return (CardCvvValidationResult[]) $VALUES.clone();
    }
}
