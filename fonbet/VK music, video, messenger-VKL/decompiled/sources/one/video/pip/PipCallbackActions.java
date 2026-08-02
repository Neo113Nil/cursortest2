package one.video.pip;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PipCallbackActions.kt */
/* loaded from: classes8.dex */
public final class PipCallbackActions {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PipCallbackActions[] $VALUES;
    public static final PipCallbackActions PAUSE;
    public static final PipCallbackActions PLAY;
    public static final PipCallbackActions SKIP_FORWARD;

    static {
        PipCallbackActions pipCallbackActions = new PipCallbackActions("PLAY", 0);
        PLAY = pipCallbackActions;
        PipCallbackActions pipCallbackActions2 = new PipCallbackActions("PAUSE", 1);
        PAUSE = pipCallbackActions2;
        PipCallbackActions pipCallbackActions3 = new PipCallbackActions("SKIP_FORWARD", 2);
        SKIP_FORWARD = pipCallbackActions3;
        PipCallbackActions[] pipCallbackActionsArr = {pipCallbackActions, pipCallbackActions2, pipCallbackActions3};
        $VALUES = pipCallbackActionsArr;
        $ENTRIES = new asp(pipCallbackActionsArr);
    }

    public PipCallbackActions() {
        throw null;
    }

    public static PipCallbackActions valueOf(String str) {
        return (PipCallbackActions) Enum.valueOf(PipCallbackActions.class, str);
    }

    public static PipCallbackActions[] values() {
        return (PipCallbackActions[]) $VALUES.clone();
    }
}
