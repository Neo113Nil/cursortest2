package com.yandex.go.feed_video.domain;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/feed_video/domain/MediaItem$StreamType", "", "Lcom/yandex/go/feed_video/domain/MediaItem$StreamType;", "DASH", "DASH_MB", "HLS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MediaItem$StreamType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MediaItem$StreamType[] $VALUES;
    public static final MediaItem$StreamType DASH;
    public static final MediaItem$StreamType DASH_MB;
    public static final MediaItem$StreamType HLS;

    static {
        MediaItem$StreamType mediaItem$StreamType = new MediaItem$StreamType("DASH", 0);
        DASH = mediaItem$StreamType;
        MediaItem$StreamType mediaItem$StreamType2 = new MediaItem$StreamType("DASH_MB", 1);
        DASH_MB = mediaItem$StreamType2;
        MediaItem$StreamType mediaItem$StreamType3 = new MediaItem$StreamType("HLS", 2);
        HLS = mediaItem$StreamType3;
        MediaItem$StreamType[] mediaItem$StreamTypeArr = {mediaItem$StreamType, mediaItem$StreamType2, mediaItem$StreamType3};
        $VALUES = mediaItem$StreamTypeArr;
        $ENTRIES = a.a(mediaItem$StreamTypeArr);
    }

    public static MediaItem$StreamType valueOf(String str) {
        return (MediaItem$StreamType) Enum.valueOf(MediaItem$StreamType.class, str);
    }

    public static MediaItem$StreamType[] values() {
        return (MediaItem$StreamType[]) $VALUES.clone();
    }
}
