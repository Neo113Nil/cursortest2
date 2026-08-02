package one.video.player.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HdrType.kt */
/* loaded from: classes8.dex */
public final class HdrType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ HdrType[] $VALUES;
    public static final HdrType HLG;
    public static final HdrType PQ;

    static {
        HdrType hdrType = new HdrType("PQ", 0);
        PQ = hdrType;
        HdrType hdrType2 = new HdrType("HLG", 1);
        HLG = hdrType2;
        HdrType[] hdrTypeArr = {hdrType, hdrType2};
        $VALUES = hdrTypeArr;
        $ENTRIES = new asp(hdrTypeArr);
    }

    public HdrType() {
        throw null;
    }

    public static HdrType valueOf(String str) {
        return (HdrType) Enum.valueOf(HdrType.class, str);
    }

    public static HdrType[] values() {
        return (HdrType[]) $VALUES.clone();
    }
}
