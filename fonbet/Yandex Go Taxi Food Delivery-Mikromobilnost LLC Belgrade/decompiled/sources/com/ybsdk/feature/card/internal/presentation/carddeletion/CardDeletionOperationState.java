package com.ybsdk.feature.card.internal.presentation.carddeletion;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/card/internal/presentation/carddeletion/CardDeletionOperationState;", "", "<init>", "(Ljava/lang/String;I)V", "CONFIRMATION", "IN_PROGRESS", "ERROR", "SUCCESS", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardDeletionOperationState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardDeletionOperationState[] $VALUES;
    public static final CardDeletionOperationState CONFIRMATION = new CardDeletionOperationState("CONFIRMATION", 0);
    public static final CardDeletionOperationState IN_PROGRESS = new CardDeletionOperationState("IN_PROGRESS", 1);
    public static final CardDeletionOperationState ERROR = new CardDeletionOperationState("ERROR", 2);
    public static final CardDeletionOperationState SUCCESS = new CardDeletionOperationState("SUCCESS", 3);

    private static final /* synthetic */ CardDeletionOperationState[] $values() {
        return new CardDeletionOperationState[]{CONFIRMATION, IN_PROGRESS, ERROR, SUCCESS};
    }

    static {
        CardDeletionOperationState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CardDeletionOperationState(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CardDeletionOperationState valueOf(String str) {
        return (CardDeletionOperationState) Enum.valueOf(CardDeletionOperationState.class, str);
    }

    public static CardDeletionOperationState[] values() {
        return (CardDeletionOperationState[]) $VALUES.clone();
    }
}
