package ru.ok.android.externcalls.sdk.watch_together;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WatchTogetherError.kt */
/* loaded from: classes9.dex */
public final class WatchTogetherError {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WatchTogetherError[] $VALUES;
    public static final WatchTogetherError LIMIT_EXCEEDED = new WatchTogetherError("LIMIT_EXCEEDED", 0);
    public static final WatchTogetherError MOVIE_NOT_FOUND = new WatchTogetherError("MOVIE_NOT_FOUND", 1);
    public static final WatchTogetherError PLAY_NOT_ALLOWED = new WatchTogetherError("PLAY_NOT_ALLOWED", 2);
    public static final WatchTogetherError CANT_PARSE_MOVIE_TYPE = new WatchTogetherError("CANT_PARSE_MOVIE_TYPE", 3);
    public static final WatchTogetherError PLAY_PARSE_ERROR = new WatchTogetherError("PLAY_PARSE_ERROR", 4);
    public static final WatchTogetherError UNKNOWN_ERROR = new WatchTogetherError("UNKNOWN_ERROR", 5);

    private static final /* synthetic */ WatchTogetherError[] $values() {
        return new WatchTogetherError[]{LIMIT_EXCEEDED, MOVIE_NOT_FOUND, PLAY_NOT_ALLOWED, CANT_PARSE_MOVIE_TYPE, PLAY_PARSE_ERROR, UNKNOWN_ERROR};
    }

    static {
        WatchTogetherError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private WatchTogetherError(String str, int i) {
    }

    public static zrp<WatchTogetherError> getEntries() {
        return $ENTRIES;
    }

    public static WatchTogetherError valueOf(String str) {
        return (WatchTogetherError) Enum.valueOf(WatchTogetherError.class, str);
    }

    public static WatchTogetherError[] values() {
        return (WatchTogetherError[]) $VALUES.clone();
    }
}
