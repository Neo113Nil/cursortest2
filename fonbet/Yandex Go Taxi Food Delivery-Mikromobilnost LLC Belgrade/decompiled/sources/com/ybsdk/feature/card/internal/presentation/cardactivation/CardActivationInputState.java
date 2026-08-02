package com.ybsdk.feature.card.internal.presentation.cardactivation;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/card/internal/presentation/cardactivation/CardActivationInputState;", "", "<init>", "(Ljava/lang/String;I)V", "CVV", "CARD", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardActivationInputState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardActivationInputState[] $VALUES;
    public static final CardActivationInputState CVV = new CardActivationInputState("CVV", 0);
    public static final CardActivationInputState CARD = new CardActivationInputState("CARD", 1);

    private static final /* synthetic */ CardActivationInputState[] $values() {
        return new CardActivationInputState[]{CVV, CARD};
    }

    static {
        CardActivationInputState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CardActivationInputState(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CardActivationInputState valueOf(String str) {
        return (CardActivationInputState) Enum.valueOf(CardActivationInputState.class, str);
    }

    public static CardActivationInputState[] values() {
        return (CardActivationInputState[]) $VALUES.clone();
    }
}
