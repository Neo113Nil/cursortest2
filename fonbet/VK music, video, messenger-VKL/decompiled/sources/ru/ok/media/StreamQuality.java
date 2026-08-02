package ru.ok.media;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StreamQuality.kt */
/* loaded from: classes9.dex */
public final class StreamQuality {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StreamQuality[] $VALUES;
    public static final StreamQuality normal = new StreamQuality("normal", 0);
    public static final StreamQuality unstable = new StreamQuality("unstable", 1);
    public static final StreamQuality stalled = new StreamQuality("stalled", 2);
    public static final StreamQuality lowBandwidth = new StreamQuality("lowBandwidth", 3);

    private static final /* synthetic */ StreamQuality[] $values() {
        return new StreamQuality[]{normal, unstable, stalled, lowBandwidth};
    }

    static {
        StreamQuality[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private StreamQuality(String str, int i) {
    }

    public static zrp<StreamQuality> getEntries() {
        return $ENTRIES;
    }

    public static StreamQuality valueOf(String str) {
        return (StreamQuality) Enum.valueOf(StreamQuality.class, str);
    }

    public static StreamQuality[] values() {
        return (StreamQuality[]) $VALUES.clone();
    }
}
