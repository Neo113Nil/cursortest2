package one.video.controls.models;

import xsna.asp;
import xsna.ozl;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlayerState.kt */
@ozl
/* loaded from: classes8.dex */
public final class PlayerState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlayerState[] $VALUES;
    public static final PlayerState BUFFERING;
    public static final PlayerState END;
    public static final PlayerState IDLE;
    public static final PlayerState PAUSE;
    public static final PlayerState PLAYING;

    static {
        PlayerState playerState = new PlayerState("IDLE", 0);
        IDLE = playerState;
        PlayerState playerState2 = new PlayerState("PLAYING", 1);
        PLAYING = playerState2;
        PlayerState playerState3 = new PlayerState("PAUSE", 2);
        PAUSE = playerState3;
        PlayerState playerState4 = new PlayerState("END", 3);
        END = playerState4;
        PlayerState playerState5 = new PlayerState("BUFFERING", 4);
        BUFFERING = playerState5;
        PlayerState[] playerStateArr = {playerState, playerState2, playerState3, playerState4, playerState5};
        $VALUES = playerStateArr;
        $ENTRIES = new asp(playerStateArr);
    }

    public PlayerState() {
        throw null;
    }

    public static PlayerState valueOf(String str) {
        return (PlayerState) Enum.valueOf(PlayerState.class, str);
    }

    public static PlayerState[] values() {
        return (PlayerState[]) $VALUES.clone();
    }
}
