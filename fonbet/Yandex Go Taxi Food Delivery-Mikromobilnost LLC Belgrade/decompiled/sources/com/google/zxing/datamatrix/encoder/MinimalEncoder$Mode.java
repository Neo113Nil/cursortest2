package com.google.zxing.datamatrix.encoder;

import com.yandex.go.sql.BaseDatabaseHelper;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
final class MinimalEncoder$Mode {
    private static final /* synthetic */ MinimalEncoder$Mode[] $VALUES;
    public static final MinimalEncoder$Mode ASCII;
    public static final MinimalEncoder$Mode B256;
    public static final MinimalEncoder$Mode C40;
    public static final MinimalEncoder$Mode EDF;
    public static final MinimalEncoder$Mode TEXT;
    public static final MinimalEncoder$Mode X12;

    static {
        MinimalEncoder$Mode minimalEncoder$Mode = new MinimalEncoder$Mode("ASCII", 0);
        ASCII = minimalEncoder$Mode;
        MinimalEncoder$Mode minimalEncoder$Mode2 = new MinimalEncoder$Mode("C40", 1);
        C40 = minimalEncoder$Mode2;
        MinimalEncoder$Mode minimalEncoder$Mode3 = new MinimalEncoder$Mode(BaseDatabaseHelper.TYPE_TEXT, 2);
        TEXT = minimalEncoder$Mode3;
        MinimalEncoder$Mode minimalEncoder$Mode4 = new MinimalEncoder$Mode("X12", 3);
        X12 = minimalEncoder$Mode4;
        MinimalEncoder$Mode minimalEncoder$Mode5 = new MinimalEncoder$Mode("EDF", 4);
        EDF = minimalEncoder$Mode5;
        MinimalEncoder$Mode minimalEncoder$Mode6 = new MinimalEncoder$Mode("B256", 5);
        B256 = minimalEncoder$Mode6;
        $VALUES = new MinimalEncoder$Mode[]{minimalEncoder$Mode, minimalEncoder$Mode2, minimalEncoder$Mode3, minimalEncoder$Mode4, minimalEncoder$Mode5, minimalEncoder$Mode6};
    }

    public static MinimalEncoder$Mode valueOf(String str) {
        return (MinimalEncoder$Mode) Enum.valueOf(MinimalEncoder$Mode.class, str);
    }

    public static MinimalEncoder$Mode[] values() {
        return (MinimalEncoder$Mode[]) $VALUES.clone();
    }
}
