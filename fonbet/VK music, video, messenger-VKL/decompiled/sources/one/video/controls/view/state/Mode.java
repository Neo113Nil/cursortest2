package one.video.controls.view.state;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Mode.kt */
/* loaded from: classes8.dex */
public final class Mode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Mode[] $VALUES;
    public static final Mode HIDE;
    public static final Mode SHOW;
    public static final Mode SHOW_FAST_SPEED;
    public static final Mode SHOW_SEEK_PREVIEW;
    public static final Mode SHOW_ZOOM_RATE;

    static {
        Mode mode = new Mode("SHOW", 0);
        SHOW = mode;
        Mode mode2 = new Mode("SHOW_SEEK_PREVIEW", 1);
        SHOW_SEEK_PREVIEW = mode2;
        Mode mode3 = new Mode("SHOW_FAST_SPEED", 2);
        SHOW_FAST_SPEED = mode3;
        Mode mode4 = new Mode("SHOW_ZOOM_RATE", 3);
        SHOW_ZOOM_RATE = mode4;
        Mode mode5 = new Mode("HIDE", 4);
        HIDE = mode5;
        Mode[] modeArr = {mode, mode2, mode3, mode4, mode5};
        $VALUES = modeArr;
        $ENTRIES = new asp(modeArr);
    }

    public Mode() {
        throw null;
    }

    public static Mode valueOf(String str) {
        return (Mode) Enum.valueOf(Mode.class, str);
    }

    public static Mode[] values() {
        return (Mode[]) $VALUES.clone();
    }
}
