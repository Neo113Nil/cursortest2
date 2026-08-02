package androidx.camera.core;

import com.samsung.android.sdk.samsungpay.v2.card.Card;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
final class UseCase$State {
    private static final /* synthetic */ UseCase$State[] $VALUES;
    public static final UseCase$State ACTIVE;
    public static final UseCase$State INACTIVE;

    static {
        UseCase$State useCase$State = new UseCase$State(Card.ACTIVE, 0);
        ACTIVE = useCase$State;
        UseCase$State useCase$State2 = new UseCase$State("INACTIVE", 1);
        INACTIVE = useCase$State2;
        $VALUES = new UseCase$State[]{useCase$State, useCase$State2};
    }

    public static UseCase$State valueOf(String str) {
        return (UseCase$State) Enum.valueOf(UseCase$State.class, str);
    }

    public static UseCase$State[] values() {
        return (UseCase$State[]) $VALUES.clone();
    }
}
