package one.video.player.audio;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PcmEncoding.kt */
/* loaded from: classes8.dex */
public final class PcmEncoding {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PcmEncoding[] $VALUES;
    public static final PcmEncoding ENCODING_INVALID;
    public static final PcmEncoding ENCODING_PCM_16BIT;
    public static final PcmEncoding ENCODING_PCM_16BIT_BIG_ENDIAN;
    public static final PcmEncoding ENCODING_PCM_24BIT;
    public static final PcmEncoding ENCODING_PCM_32BIT;
    public static final PcmEncoding ENCODING_PCM_8BIT;
    public static final PcmEncoding ENCODING_PCM_FLOAT;
    public static final PcmEncoding NO_VALUE;

    static {
        PcmEncoding pcmEncoding = new PcmEncoding("NO_VALUE", 0);
        NO_VALUE = pcmEncoding;
        PcmEncoding pcmEncoding2 = new PcmEncoding("ENCODING_INVALID", 1);
        ENCODING_INVALID = pcmEncoding2;
        PcmEncoding pcmEncoding3 = new PcmEncoding("ENCODING_PCM_8BIT", 2);
        ENCODING_PCM_8BIT = pcmEncoding3;
        PcmEncoding pcmEncoding4 = new PcmEncoding("ENCODING_PCM_16BIT", 3);
        ENCODING_PCM_16BIT = pcmEncoding4;
        PcmEncoding pcmEncoding5 = new PcmEncoding("ENCODING_PCM_16BIT_BIG_ENDIAN", 4);
        ENCODING_PCM_16BIT_BIG_ENDIAN = pcmEncoding5;
        PcmEncoding pcmEncoding6 = new PcmEncoding("ENCODING_PCM_24BIT", 5);
        ENCODING_PCM_24BIT = pcmEncoding6;
        PcmEncoding pcmEncoding7 = new PcmEncoding("ENCODING_PCM_32BIT", 6);
        ENCODING_PCM_32BIT = pcmEncoding7;
        PcmEncoding pcmEncoding8 = new PcmEncoding("ENCODING_PCM_FLOAT", 7);
        ENCODING_PCM_FLOAT = pcmEncoding8;
        PcmEncoding[] pcmEncodingArr = {pcmEncoding, pcmEncoding2, pcmEncoding3, pcmEncoding4, pcmEncoding5, pcmEncoding6, pcmEncoding7, pcmEncoding8};
        $VALUES = pcmEncodingArr;
        $ENTRIES = new asp(pcmEncodingArr);
    }

    public PcmEncoding() {
        throw null;
    }

    public static PcmEncoding valueOf(String str) {
        return (PcmEncoding) Enum.valueOf(PcmEncoding.class, str);
    }

    public static PcmEncoding[] values() {
        return (PcmEncoding[]) $VALUES.clone();
    }
}
