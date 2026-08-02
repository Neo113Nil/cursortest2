package androidx.camera.video.internal;

import com.samsung.android.sdk.samsungpay.v2.card.Card;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class BufferProvider$State {
    private static final /* synthetic */ BufferProvider$State[] $VALUES;
    public static final BufferProvider$State ACTIVE;
    public static final BufferProvider$State INACTIVE;

    static {
        BufferProvider$State bufferProvider$State = new BufferProvider$State(Card.ACTIVE, 0);
        ACTIVE = bufferProvider$State;
        BufferProvider$State bufferProvider$State2 = new BufferProvider$State("INACTIVE", 1);
        INACTIVE = bufferProvider$State2;
        $VALUES = new BufferProvider$State[]{bufferProvider$State, bufferProvider$State2};
    }

    public static BufferProvider$State valueOf(String str) {
        return (BufferProvider$State) Enum.valueOf(BufferProvider$State.class, str);
    }

    public static BufferProvider$State[] values() {
        return (BufferProvider$State[]) $VALUES.clone();
    }
}
