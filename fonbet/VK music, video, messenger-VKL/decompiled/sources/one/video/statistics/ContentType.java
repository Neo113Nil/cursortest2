package one.video.statistics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContentType.kt */
/* loaded from: classes8.dex */
public final class ContentType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ContentType[] $VALUES;
    public static final ContentType dash;
    public static final ContentType embed;
    public static final ContentType hls;
    public static final ContentType mp4;
    public static final ContentType rtmp;
    public static final ContentType webm;

    static {
        ContentType contentType = new ContentType("mp4", 0);
        mp4 = contentType;
        ContentType contentType2 = new ContentType("dash", 1);
        dash = contentType2;
        ContentType contentType3 = new ContentType("hls", 2);
        hls = contentType3;
        ContentType contentType4 = new ContentType("embed", 3);
        embed = contentType4;
        ContentType contentType5 = new ContentType("webm", 4);
        webm = contentType5;
        ContentType contentType6 = new ContentType("rtmp", 5);
        rtmp = contentType6;
        ContentType[] contentTypeArr = {contentType, contentType2, contentType3, contentType4, contentType5, contentType6};
        $VALUES = contentTypeArr;
        $ENTRIES = new asp(contentTypeArr);
    }

    public ContentType() {
        throw null;
    }

    public static ContentType valueOf(String str) {
        return (ContentType) Enum.valueOf(ContentType.class, str);
    }

    public static ContentType[] values() {
        return (ContentType[]) $VALUES.clone();
    }
}
