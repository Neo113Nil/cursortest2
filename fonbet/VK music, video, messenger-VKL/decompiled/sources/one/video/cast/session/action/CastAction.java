package one.video.cast.session.action;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CastAction.kt */
/* loaded from: classes8.dex */
public final class CastAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CastAction[] $VALUES;
    public static final CastAction PLAYER_STATE_IDLE_REASON_CANCELED;
    public static final CastAction PLAYER_STATE_IDLE_REASON_ERROR;
    public static final CastAction PLAYER_STATE_IDLE_REASON_INTERRUPTED;
    public static final CastAction PLAYER_STATE_UNKNOWN;
    public static final CastAction SESSION_ENDED;
    public static final CastAction SESSION_STARTED;
    public static final CastAction VIDEO_BUFFERING;
    public static final CastAction VIDEO_FINISHED;
    public static final CastAction VIDEO_LOADING;
    public static final CastAction VIDEO_PAUSED;
    public static final CastAction VIDEO_PLAYED;

    static {
        CastAction castAction = new CastAction("SESSION_STARTED", 0);
        SESSION_STARTED = castAction;
        CastAction castAction2 = new CastAction("VIDEO_PLAYED", 1);
        VIDEO_PLAYED = castAction2;
        CastAction castAction3 = new CastAction("VIDEO_PAUSED", 2);
        VIDEO_PAUSED = castAction3;
        CastAction castAction4 = new CastAction("VIDEO_BUFFERING", 3);
        VIDEO_BUFFERING = castAction4;
        CastAction castAction5 = new CastAction("VIDEO_LOADING", 4);
        VIDEO_LOADING = castAction5;
        CastAction castAction6 = new CastAction("VIDEO_FINISHED", 5);
        VIDEO_FINISHED = castAction6;
        CastAction castAction7 = new CastAction("SESSION_ENDED", 6);
        SESSION_ENDED = castAction7;
        CastAction castAction8 = new CastAction("PLAYER_STATE_UNKNOWN", 7);
        PLAYER_STATE_UNKNOWN = castAction8;
        CastAction castAction9 = new CastAction("PLAYER_STATE_IDLE_REASON_CANCELED", 8);
        PLAYER_STATE_IDLE_REASON_CANCELED = castAction9;
        CastAction castAction10 = new CastAction("PLAYER_STATE_IDLE_REASON_INTERRUPTED", 9);
        PLAYER_STATE_IDLE_REASON_INTERRUPTED = castAction10;
        CastAction castAction11 = new CastAction("PLAYER_STATE_IDLE_REASON_ERROR", 10);
        PLAYER_STATE_IDLE_REASON_ERROR = castAction11;
        CastAction[] castActionArr = {castAction, castAction2, castAction3, castAction4, castAction5, castAction6, castAction7, castAction8, castAction9, castAction10, castAction11};
        $VALUES = castActionArr;
        $ENTRIES = new asp(castActionArr);
    }

    public CastAction() {
        throw null;
    }

    public static CastAction valueOf(String str) {
        return (CastAction) Enum.valueOf(CastAction.class, str);
    }

    public static CastAction[] values() {
        return (CastAction[]) $VALUES.clone();
    }
}
