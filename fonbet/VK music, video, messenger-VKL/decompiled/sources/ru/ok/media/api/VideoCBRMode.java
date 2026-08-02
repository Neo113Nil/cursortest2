package ru.ok.media.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoCBRMode.kt */
/* loaded from: classes9.dex */
public final class VideoCBRMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoCBRMode[] $VALUES;
    public static final VideoCBRMode DISABLED = new VideoCBRMode("DISABLED", 0);
    public static final VideoCBRMode ENABLED = new VideoCBRMode("ENABLED", 1);
    public static final VideoCBRMode ENFORCED = new VideoCBRMode("ENFORCED", 2);

    private static final /* synthetic */ VideoCBRMode[] $values() {
        return new VideoCBRMode[]{DISABLED, ENABLED, ENFORCED};
    }

    static {
        VideoCBRMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private VideoCBRMode(String str, int i) {
    }

    public static zrp<VideoCBRMode> getEntries() {
        return $ENTRIES;
    }

    public static VideoCBRMode valueOf(String str) {
        return (VideoCBRMode) Enum.valueOf(VideoCBRMode.class, str);
    }

    public static VideoCBRMode[] values() {
        return (VideoCBRMode[]) $VALUES.clone();
    }
}
