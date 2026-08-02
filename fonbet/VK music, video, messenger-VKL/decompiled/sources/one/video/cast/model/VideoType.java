package one.video.cast.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoType.kt */
/* loaded from: classes8.dex */
public final class VideoType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoType[] $VALUES;
    public static final VideoType DASH;
    public static final VideoType HLS;
    public static final VideoType LIVE_HLS;
    public static final VideoType MP4;

    static {
        VideoType videoType = new VideoType("DASH", 0);
        DASH = videoType;
        VideoType videoType2 = new VideoType("MP4", 1);
        MP4 = videoType2;
        VideoType videoType3 = new VideoType("HLS", 2);
        HLS = videoType3;
        VideoType videoType4 = new VideoType("LIVE_HLS", 3);
        LIVE_HLS = videoType4;
        VideoType[] videoTypeArr = {videoType, videoType2, videoType3, videoType4};
        $VALUES = videoTypeArr;
        $ENTRIES = new asp(videoTypeArr);
    }

    public VideoType() {
        throw null;
    }

    public static VideoType valueOf(String str) {
        return (VideoType) Enum.valueOf(VideoType.class, str);
    }

    public static VideoType[] values() {
        return (VideoType[]) $VALUES.clone();
    }
}
