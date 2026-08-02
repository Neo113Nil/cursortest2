package one.video.player;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RepeatMode.kt */
/* loaded from: classes8.dex */
public final class RepeatMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RepeatMode[] $VALUES;
    public static final RepeatMode ALL;
    public static final RepeatMode OFF;
    public static final RepeatMode ONE;

    static {
        RepeatMode repeatMode = new RepeatMode("OFF", 0);
        OFF = repeatMode;
        RepeatMode repeatMode2 = new RepeatMode("ONE", 1);
        ONE = repeatMode2;
        RepeatMode repeatMode3 = new RepeatMode("ALL", 2);
        ALL = repeatMode3;
        RepeatMode[] repeatModeArr = {repeatMode, repeatMode2, repeatMode3};
        $VALUES = repeatModeArr;
        $ENTRIES = new asp(repeatModeArr);
    }

    public RepeatMode() {
        throw null;
    }

    public static RepeatMode valueOf(String str) {
        return (RepeatMode) Enum.valueOf(RepeatMode.class, str);
    }

    public static RepeatMode[] values() {
        return (RepeatMode[]) $VALUES.clone();
    }
}
