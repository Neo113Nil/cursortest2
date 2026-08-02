package one.video.stat2;

import com.ironsource.D1;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Mode.kt */
/* loaded from: classes8.dex */
public final class Mode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Mode[] $VALUES;
    public static final Mode CHROMECAST;
    public static final Mode EXTERNAL;
    public static final Mode FULLSCREEN;
    public static final Mode INLINE;
    public static final Mode INVALID;
    public static final Mode PIP_EXTERNAL;
    public static final Mode PIP_IN_APP;
    private final String value;

    static {
        Mode mode = new Mode("INLINE", 0, "inline");
        INLINE = mode;
        Mode mode2 = new Mode("FULLSCREEN", 1, "fullscreen");
        FULLSCREEN = mode2;
        Mode mode3 = new Mode("PIP_EXTERNAL", 2, "pip_external");
        PIP_EXTERNAL = mode3;
        Mode mode4 = new Mode("PIP_IN_APP", 3, "pip_in_app");
        PIP_IN_APP = mode4;
        Mode mode5 = new Mode("CHROMECAST", 4, "chromecast");
        CHROMECAST = mode5;
        Mode mode6 = new Mode("EXTERNAL", 5, D1.e);
        EXTERNAL = mode6;
        Mode mode7 = new Mode("INVALID", 6, "invalid");
        INVALID = mode7;
        Mode[] modeArr = {mode, mode2, mode3, mode4, mode5, mode6, mode7};
        $VALUES = modeArr;
        $ENTRIES = new asp(modeArr);
    }

    public Mode(String str, int i, String str2) {
        this.value = str2;
    }

    public static Mode valueOf(String str) {
        return (Mode) Enum.valueOf(Mode.class, str);
    }

    public static Mode[] values() {
        return (Mode[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
