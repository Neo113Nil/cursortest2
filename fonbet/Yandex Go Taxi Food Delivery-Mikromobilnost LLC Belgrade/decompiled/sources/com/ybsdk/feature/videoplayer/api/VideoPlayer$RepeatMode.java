package com.ybsdk.feature.videoplayer.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/feature/videoplayer/api/VideoPlayer$RepeatMode", "", "Lcom/ybsdk/feature/videoplayer/api/VideoPlayer$RepeatMode;", "<init>", "(Ljava/lang/String;I)V", "OFF", "ONE", "ALL", "feature-video-player-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VideoPlayer$RepeatMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ VideoPlayer$RepeatMode[] $VALUES;
    public static final VideoPlayer$RepeatMode OFF = new VideoPlayer$RepeatMode("OFF", 0);
    public static final VideoPlayer$RepeatMode ONE = new VideoPlayer$RepeatMode("ONE", 1);
    public static final VideoPlayer$RepeatMode ALL = new VideoPlayer$RepeatMode("ALL", 2);

    private static final /* synthetic */ VideoPlayer$RepeatMode[] $values() {
        return new VideoPlayer$RepeatMode[]{OFF, ONE, ALL};
    }

    static {
        VideoPlayer$RepeatMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private VideoPlayer$RepeatMode(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static VideoPlayer$RepeatMode valueOf(String str) {
        return (VideoPlayer$RepeatMode) Enum.valueOf(VideoPlayer$RepeatMode.class, str);
    }

    public static VideoPlayer$RepeatMode[] values() {
        return (VideoPlayer$RepeatMode[]) $VALUES.clone();
    }
}
