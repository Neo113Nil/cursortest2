package com.ybsdk.feature.card.internal.presentation.cardpin;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/card/internal/presentation/cardpin/CardPinCodeViewState$InputStep", "", "Lcom/ybsdk/feature/card/internal/presentation/cardpin/CardPinCodeViewState$InputStep;", "<init>", "(Ljava/lang/String;I)V", "FIRST", "SECOND", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardPinCodeViewState$InputStep {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardPinCodeViewState$InputStep[] $VALUES;
    public static final CardPinCodeViewState$InputStep FIRST = new CardPinCodeViewState$InputStep("FIRST", 0);
    public static final CardPinCodeViewState$InputStep SECOND = new CardPinCodeViewState$InputStep("SECOND", 1);

    private static final /* synthetic */ CardPinCodeViewState$InputStep[] $values() {
        return new CardPinCodeViewState$InputStep[]{FIRST, SECOND};
    }

    static {
        CardPinCodeViewState$InputStep[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CardPinCodeViewState$InputStep(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CardPinCodeViewState$InputStep valueOf(String str) {
        return (CardPinCodeViewState$InputStep) Enum.valueOf(CardPinCodeViewState$InputStep.class, str);
    }

    public static CardPinCodeViewState$InputStep[] values() {
        return (CardPinCodeViewState$InputStep[]) $VALUES.clone();
    }
}
