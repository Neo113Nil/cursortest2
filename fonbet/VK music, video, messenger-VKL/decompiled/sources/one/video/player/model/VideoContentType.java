package one.video.player.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoContentType.kt */
/* loaded from: classes8.dex */
public final class VideoContentType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoContentType[] $VALUES;
    public static final VideoContentType DASH;
    public static final VideoContentType FRAME;
    public static final VideoContentType HLS;
    public static final VideoContentType LOCAL;
    public static final VideoContentType MP4;
    public static final VideoContentType OFFLINE;
    public static final VideoContentType RTMP;

    static {
        VideoContentType videoContentType = new VideoContentType("MP4", 0);
        MP4 = videoContentType;
        VideoContentType videoContentType2 = new VideoContentType("HLS", 1);
        HLS = videoContentType2;
        VideoContentType videoContentType3 = new VideoContentType("DASH", 2);
        DASH = videoContentType3;
        VideoContentType videoContentType4 = new VideoContentType("RTMP", 3);
        RTMP = videoContentType4;
        VideoContentType videoContentType5 = new VideoContentType("OFFLINE", 4);
        OFFLINE = videoContentType5;
        VideoContentType videoContentType6 = new VideoContentType("LOCAL", 5);
        LOCAL = videoContentType6;
        VideoContentType videoContentType7 = new VideoContentType("FRAME", 6);
        FRAME = videoContentType7;
        VideoContentType[] videoContentTypeArr = {videoContentType, videoContentType2, videoContentType3, videoContentType4, videoContentType5, videoContentType6, videoContentType7};
        $VALUES = videoContentTypeArr;
        $ENTRIES = new asp(videoContentTypeArr);
    }

    public VideoContentType() {
        throw null;
    }

    public static VideoContentType valueOf(String str) {
        return (VideoContentType) Enum.valueOf(VideoContentType.class, str);
    }

    public static VideoContentType[] values() {
        return (VideoContentType[]) $VALUES.clone();
    }
}
