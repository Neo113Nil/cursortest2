package com.caverock.androidsvg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class PreserveAspectRatio$Alignment {
    private static final /* synthetic */ PreserveAspectRatio$Alignment[] $VALUES;
    public static final PreserveAspectRatio$Alignment none;
    public static final PreserveAspectRatio$Alignment xMaxYMax;
    public static final PreserveAspectRatio$Alignment xMaxYMid;
    public static final PreserveAspectRatio$Alignment xMaxYMin;
    public static final PreserveAspectRatio$Alignment xMidYMax;
    public static final PreserveAspectRatio$Alignment xMidYMid;
    public static final PreserveAspectRatio$Alignment xMidYMin;
    public static final PreserveAspectRatio$Alignment xMinYMax;
    public static final PreserveAspectRatio$Alignment xMinYMid;
    public static final PreserveAspectRatio$Alignment xMinYMin;

    static {
        PreserveAspectRatio$Alignment preserveAspectRatio$Alignment = new PreserveAspectRatio$Alignment("none", 0);
        none = preserveAspectRatio$Alignment;
        PreserveAspectRatio$Alignment preserveAspectRatio$Alignment2 = new PreserveAspectRatio$Alignment("xMinYMin", 1);
        xMinYMin = preserveAspectRatio$Alignment2;
        PreserveAspectRatio$Alignment preserveAspectRatio$Alignment3 = new PreserveAspectRatio$Alignment("xMidYMin", 2);
        xMidYMin = preserveAspectRatio$Alignment3;
        PreserveAspectRatio$Alignment preserveAspectRatio$Alignment4 = new PreserveAspectRatio$Alignment("xMaxYMin", 3);
        xMaxYMin = preserveAspectRatio$Alignment4;
        PreserveAspectRatio$Alignment preserveAspectRatio$Alignment5 = new PreserveAspectRatio$Alignment("xMinYMid", 4);
        xMinYMid = preserveAspectRatio$Alignment5;
        PreserveAspectRatio$Alignment preserveAspectRatio$Alignment6 = new PreserveAspectRatio$Alignment("xMidYMid", 5);
        xMidYMid = preserveAspectRatio$Alignment6;
        PreserveAspectRatio$Alignment preserveAspectRatio$Alignment7 = new PreserveAspectRatio$Alignment("xMaxYMid", 6);
        xMaxYMid = preserveAspectRatio$Alignment7;
        PreserveAspectRatio$Alignment preserveAspectRatio$Alignment8 = new PreserveAspectRatio$Alignment("xMinYMax", 7);
        xMinYMax = preserveAspectRatio$Alignment8;
        PreserveAspectRatio$Alignment preserveAspectRatio$Alignment9 = new PreserveAspectRatio$Alignment("xMidYMax", 8);
        xMidYMax = preserveAspectRatio$Alignment9;
        PreserveAspectRatio$Alignment preserveAspectRatio$Alignment10 = new PreserveAspectRatio$Alignment("xMaxYMax", 9);
        xMaxYMax = preserveAspectRatio$Alignment10;
        $VALUES = new PreserveAspectRatio$Alignment[]{preserveAspectRatio$Alignment, preserveAspectRatio$Alignment2, preserveAspectRatio$Alignment3, preserveAspectRatio$Alignment4, preserveAspectRatio$Alignment5, preserveAspectRatio$Alignment6, preserveAspectRatio$Alignment7, preserveAspectRatio$Alignment8, preserveAspectRatio$Alignment9, preserveAspectRatio$Alignment10};
    }

    public static PreserveAspectRatio$Alignment valueOf(String str) {
        return (PreserveAspectRatio$Alignment) Enum.valueOf(PreserveAspectRatio$Alignment.class, str);
    }

    public static PreserveAspectRatio$Alignment[] values() {
        return (PreserveAspectRatio$Alignment[]) $VALUES.clone();
    }
}
