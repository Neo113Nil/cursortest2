package androidx.camera.video;

import com.samsung.android.sdk.samsungpay.v2.card.Card;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class StreamInfo$StreamState {
    private static final /* synthetic */ StreamInfo$StreamState[] $VALUES;
    public static final StreamInfo$StreamState ACTIVE;
    public static final StreamInfo$StreamState INACTIVE;

    static {
        StreamInfo$StreamState streamInfo$StreamState = new StreamInfo$StreamState(Card.ACTIVE, 0);
        ACTIVE = streamInfo$StreamState;
        StreamInfo$StreamState streamInfo$StreamState2 = new StreamInfo$StreamState("INACTIVE", 1);
        INACTIVE = streamInfo$StreamState2;
        $VALUES = new StreamInfo$StreamState[]{streamInfo$StreamState, streamInfo$StreamState2};
    }

    public static StreamInfo$StreamState valueOf(String str) {
        return (StreamInfo$StreamState) Enum.valueOf(StreamInfo$StreamState.class, str);
    }

    public static StreamInfo$StreamState[] values() {
        return (StreamInfo$StreamState[]) $VALUES.clone();
    }
}
