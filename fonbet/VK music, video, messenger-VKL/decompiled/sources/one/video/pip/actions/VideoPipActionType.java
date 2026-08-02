package one.video.pip.actions;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoPipActionType.kt */
/* loaded from: classes8.dex */
public final class VideoPipActionType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoPipActionType[] $VALUES;
    public static final VideoPipActionType PAUSE;
    public static final VideoPipActionType PLAY;
    public static final VideoPipActionType REPLAY;
    public static final VideoPipActionType SEEK_BACKWARD;
    public static final VideoPipActionType SEEK_BACKWARD_DISABLED;
    public static final VideoPipActionType SEEK_FORWARD;
    public static final VideoPipActionType SEEK_FORWARD_DISABLED;
    public static final VideoPipActionType SKIP_BACK;
    public static final VideoPipActionType SKIP_FORWARD;

    static {
        VideoPipActionType videoPipActionType = new VideoPipActionType("PLAY", 0);
        PLAY = videoPipActionType;
        VideoPipActionType videoPipActionType2 = new VideoPipActionType("PAUSE", 1);
        PAUSE = videoPipActionType2;
        VideoPipActionType videoPipActionType3 = new VideoPipActionType("REPLAY", 2);
        REPLAY = videoPipActionType3;
        VideoPipActionType videoPipActionType4 = new VideoPipActionType("SEEK_FORWARD", 3);
        SEEK_FORWARD = videoPipActionType4;
        VideoPipActionType videoPipActionType5 = new VideoPipActionType("SEEK_FORWARD_DISABLED", 4);
        SEEK_FORWARD_DISABLED = videoPipActionType5;
        VideoPipActionType videoPipActionType6 = new VideoPipActionType("SEEK_BACKWARD", 5);
        SEEK_BACKWARD = videoPipActionType6;
        VideoPipActionType videoPipActionType7 = new VideoPipActionType("SEEK_BACKWARD_DISABLED", 6);
        SEEK_BACKWARD_DISABLED = videoPipActionType7;
        VideoPipActionType videoPipActionType8 = new VideoPipActionType("SKIP_BACK", 7);
        SKIP_BACK = videoPipActionType8;
        VideoPipActionType videoPipActionType9 = new VideoPipActionType("SKIP_FORWARD", 8);
        SKIP_FORWARD = videoPipActionType9;
        VideoPipActionType[] videoPipActionTypeArr = {videoPipActionType, videoPipActionType2, videoPipActionType3, videoPipActionType4, videoPipActionType5, videoPipActionType6, videoPipActionType7, videoPipActionType8, videoPipActionType9};
        $VALUES = videoPipActionTypeArr;
        $ENTRIES = new asp(videoPipActionTypeArr);
    }

    public VideoPipActionType() {
        throw null;
    }

    public static zrp<VideoPipActionType> h() {
        return $ENTRIES;
    }

    public static VideoPipActionType valueOf(String str) {
        return (VideoPipActionType) Enum.valueOf(VideoPipActionType.class, str);
    }

    public static VideoPipActionType[] values() {
        return (VideoPipActionType[]) $VALUES.clone();
    }
}
