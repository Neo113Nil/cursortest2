package one.video.pip.playback;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PipPlaybackAction.kt */
/* loaded from: classes8.dex */
public final class PipPlaybackAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PipPlaybackAction[] $VALUES;
    public static final PipPlaybackAction PAUSE;
    public static final PipPlaybackAction PLAY;
    public static final PipPlaybackAction REPLAY;
    public static final PipPlaybackAction SEEK_BACKWARD;
    public static final PipPlaybackAction SEEK_FORWARD;
    public static final PipPlaybackAction SKIP_FORWARD;

    static {
        PipPlaybackAction pipPlaybackAction = new PipPlaybackAction("PLAY", 0);
        PLAY = pipPlaybackAction;
        PipPlaybackAction pipPlaybackAction2 = new PipPlaybackAction("PAUSE", 1);
        PAUSE = pipPlaybackAction2;
        PipPlaybackAction pipPlaybackAction3 = new PipPlaybackAction("REPLAY", 2);
        REPLAY = pipPlaybackAction3;
        PipPlaybackAction pipPlaybackAction4 = new PipPlaybackAction("SEEK_FORWARD", 3);
        SEEK_FORWARD = pipPlaybackAction4;
        PipPlaybackAction pipPlaybackAction5 = new PipPlaybackAction("SEEK_BACKWARD", 4);
        SEEK_BACKWARD = pipPlaybackAction5;
        PipPlaybackAction pipPlaybackAction6 = new PipPlaybackAction("SKIP_FORWARD", 5);
        SKIP_FORWARD = pipPlaybackAction6;
        PipPlaybackAction[] pipPlaybackActionArr = {pipPlaybackAction, pipPlaybackAction2, pipPlaybackAction3, pipPlaybackAction4, pipPlaybackAction5, pipPlaybackAction6};
        $VALUES = pipPlaybackActionArr;
        $ENTRIES = new asp(pipPlaybackActionArr);
    }

    public PipPlaybackAction() {
        throw null;
    }

    public static PipPlaybackAction valueOf(String str) {
        return (PipPlaybackAction) Enum.valueOf(PipPlaybackAction.class, str);
    }

    public static PipPlaybackAction[] values() {
        return (PipPlaybackAction[]) $VALUES.clone();
    }
}
