package one.video.stat2;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.asp;
import xsna.c5g;
import xsna.on00;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContentType.kt */
/* loaded from: classes8.dex */
public final class ContentType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ContentType[] $VALUES;
    public static final ContentType AV1;
    public static final a Companion;
    public static final ContentType DASH;
    public static final ContentType DASH_SEP;
    public static final ContentType EMBED;
    public static final ContentType FILE;
    public static final ContentType FMP4_HLS;
    public static final ContentType HLS;
    public static final ContentType MP4;
    public static final ContentType MULTI_DASH;
    public static final ContentType MULTI_HLS;
    public static final ContentType ONDEMAND_DASH;
    public static final ContentType ONDEMAND_DASH_LIVE;
    public static final ContentType ONDEMAND_HLS;
    public static final ContentType ONDEMAND_HLS_LIVE;
    public static final ContentType RTMP;
    public static final ContentType UNKNOWN;
    public static final ContentType WEBM;
    public static final ContentType WEBRTC;
    private static final Map<String, ContentType> types;

    /* compiled from: ContentType.kt */
    public static final class a {
    }

    static {
        ContentType contentType = new ContentType("MP4", 0);
        MP4 = contentType;
        ContentType contentType2 = new ContentType("DASH", 1);
        DASH = contentType2;
        ContentType contentType3 = new ContentType("DASH_SEP", 2);
        DASH_SEP = contentType3;
        ContentType contentType4 = new ContentType("ONDEMAND_DASH", 3);
        ONDEMAND_DASH = contentType4;
        ContentType contentType5 = new ContentType("ONDEMAND_HLS", 4);
        ONDEMAND_HLS = contentType5;
        ContentType contentType6 = new ContentType("HLS", 5);
        HLS = contentType6;
        ContentType contentType7 = new ContentType("FMP4_HLS", 6);
        FMP4_HLS = contentType7;
        ContentType contentType8 = new ContentType("EMBED", 7);
        EMBED = contentType8;
        ContentType contentType9 = new ContentType("RTMP", 8);
        RTMP = contentType9;
        ContentType contentType10 = new ContentType("WEBM", 9);
        WEBM = contentType10;
        ContentType contentType11 = new ContentType("ONDEMAND_DASH_LIVE", 10);
        ONDEMAND_DASH_LIVE = contentType11;
        ContentType contentType12 = new ContentType("ONDEMAND_HLS_LIVE", 11);
        ONDEMAND_HLS_LIVE = contentType12;
        ContentType contentType13 = new ContentType("WEBRTC", 12);
        WEBRTC = contentType13;
        ContentType contentType14 = new ContentType("AV1", 13);
        AV1 = contentType14;
        ContentType contentType15 = new ContentType("MULTI_DASH", 14);
        MULTI_DASH = contentType15;
        ContentType contentType16 = new ContentType("MULTI_HLS", 15);
        MULTI_HLS = contentType16;
        ContentType contentType17 = new ContentType("FILE", 16);
        FILE = contentType17;
        ContentType contentType18 = new ContentType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 17);
        UNKNOWN = contentType18;
        ContentType[] contentTypeArr = {contentType, contentType2, contentType3, contentType4, contentType5, contentType6, contentType7, contentType8, contentType9, contentType10, contentType11, contentType12, contentType13, contentType14, contentType15, contentType16, contentType17, contentType18};
        $VALUES = contentTypeArr;
        asp aspVar = new asp(contentTypeArr);
        $ENTRIES = aspVar;
        Companion = new a();
        int e = on00.e(c5g.u(aspVar, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (Object obj : aspVar) {
            linkedHashMap.put(((ContentType) obj).toString(), obj);
        }
        types = linkedHashMap;
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
