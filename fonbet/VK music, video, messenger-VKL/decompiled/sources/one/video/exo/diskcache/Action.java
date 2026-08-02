package one.video.exo.diskcache;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoDiskCacheManagerMessages.kt */
/* loaded from: classes8.dex */
public final class Action {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Action[] $VALUES;
    public static final Action CANCEL;
    public static final Action CANCEL_ALL;
    public static final Action DOWNLOAD;
    public static final Action INITIALIZE;
    public static final Action INIT_COMPLETED;
    public static final Action INIT_FAILED;
    public static final Action ON_TASK_FINISHED;
    public static final Action PROCESS_NEXT_TASK;
    public static final Action REFRESH_DASH_MANIFEST;
    public static final Action REMOVE;
    public static final Action REMOVE_ALL;

    static {
        Action action = new Action("INITIALIZE", 0);
        INITIALIZE = action;
        Action action2 = new Action("INIT_COMPLETED", 1);
        INIT_COMPLETED = action2;
        Action action3 = new Action("INIT_FAILED", 2);
        INIT_FAILED = action3;
        Action action4 = new Action("DOWNLOAD", 3);
        DOWNLOAD = action4;
        Action action5 = new Action("CANCEL", 4);
        CANCEL = action5;
        Action action6 = new Action("CANCEL_ALL", 5);
        CANCEL_ALL = action6;
        Action action7 = new Action(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE, 6);
        REMOVE = action7;
        Action action8 = new Action("REMOVE_ALL", 7);
        REMOVE_ALL = action8;
        Action action9 = new Action("PROCESS_NEXT_TASK", 8);
        PROCESS_NEXT_TASK = action9;
        Action action10 = new Action("ON_TASK_FINISHED", 9);
        ON_TASK_FINISHED = action10;
        Action action11 = new Action("REFRESH_DASH_MANIFEST", 10);
        REFRESH_DASH_MANIFEST = action11;
        Action[] actionArr = {action, action2, action3, action4, action5, action6, action7, action8, action9, action10, action11};
        $VALUES = actionArr;
        $ENTRIES = new asp(actionArr);
    }

    public Action() {
        throw null;
    }

    public static zrp<Action> h() {
        return $ENTRIES;
    }

    public static Action valueOf(String str) {
        return (Action) Enum.valueOf(Action.class, str);
    }

    public static Action[] values() {
        return (Action[]) $VALUES.clone();
    }
}
