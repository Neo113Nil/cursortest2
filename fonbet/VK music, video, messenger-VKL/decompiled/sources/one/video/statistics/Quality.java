package one.video.statistics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Quality.kt */
/* loaded from: classes8.dex */
public final class Quality {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Quality[] $VALUES;
    public static final Quality _1080p;
    public static final Quality _1440p;
    public static final Quality _144p;
    public static final Quality _2160p;
    public static final Quality _240p;
    public static final Quality _360p;
    public static final Quality _4320p;
    public static final Quality _480p;
    public static final Quality _720p;
    private final String value;

    static {
        Quality quality = new Quality("_144p", 0, "MOBILE");
        _144p = quality;
        Quality quality2 = new Quality("_240p", 1, "LOWEST");
        _240p = quality2;
        Quality quality3 = new Quality("_360p", 2, "LOW");
        _360p = quality3;
        Quality quality4 = new Quality("_480p", 3, "MEDIUM");
        _480p = quality4;
        Quality quality5 = new Quality("_720p", 4, "HIGH");
        _720p = quality5;
        Quality quality6 = new Quality("_1080p", 5, "FULLHD");
        _1080p = quality6;
        Quality quality7 = new Quality("_1440p", 6, "QUADHD");
        _1440p = quality7;
        Quality quality8 = new Quality("_2160p", 7, "ULTRAHD");
        _2160p = quality8;
        Quality quality9 = new Quality("_4320p", 8, "ULTRAHD8K");
        _4320p = quality9;
        Quality[] qualityArr = {quality, quality2, quality3, quality4, quality5, quality6, quality7, quality8, quality9};
        $VALUES = qualityArr;
        $ENTRIES = new asp(qualityArr);
    }

    public Quality(String str, int i, String str2) {
        this.value = str2;
    }

    public static Quality valueOf(String str) {
        return (Quality) Enum.valueOf(Quality.class, str);
    }

    public static Quality[] values() {
        return (Quality[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
