package one.video.exo.datasource.dash.parser;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DashManifestParserWithFilter.kt */
/* loaded from: classes8.dex */
public final class AudioTracksFilterMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioTracksFilterMode[] $VALUES;
    public static final AudioTracksFilterMode FILTER_OUT_LOWER_MIDDLE;
    public static final AudioTracksFilterMode FILTER_OUT_LOWEST;
    public static final AudioTracksFilterMode KEEP_HIGHEST;
    public static final AudioTracksFilterMode KEEP_UPPER_MIDDLE;

    static {
        AudioTracksFilterMode audioTracksFilterMode = new AudioTracksFilterMode("FILTER_OUT_LOWEST", 0);
        FILTER_OUT_LOWEST = audioTracksFilterMode;
        AudioTracksFilterMode audioTracksFilterMode2 = new AudioTracksFilterMode("FILTER_OUT_LOWER_MIDDLE", 1);
        FILTER_OUT_LOWER_MIDDLE = audioTracksFilterMode2;
        AudioTracksFilterMode audioTracksFilterMode3 = new AudioTracksFilterMode("KEEP_UPPER_MIDDLE", 2);
        KEEP_UPPER_MIDDLE = audioTracksFilterMode3;
        AudioTracksFilterMode audioTracksFilterMode4 = new AudioTracksFilterMode("KEEP_HIGHEST", 3);
        KEEP_HIGHEST = audioTracksFilterMode4;
        AudioTracksFilterMode[] audioTracksFilterModeArr = {audioTracksFilterMode, audioTracksFilterMode2, audioTracksFilterMode3, audioTracksFilterMode4};
        $VALUES = audioTracksFilterModeArr;
        $ENTRIES = new asp(audioTracksFilterModeArr);
    }

    public AudioTracksFilterMode() {
        throw null;
    }

    public static AudioTracksFilterMode valueOf(String str) {
        return (AudioTracksFilterMode) Enum.valueOf(AudioTracksFilterMode.class, str);
    }

    public static AudioTracksFilterMode[] values() {
        return (AudioTracksFilterMode[]) $VALUES.clone();
    }
}
