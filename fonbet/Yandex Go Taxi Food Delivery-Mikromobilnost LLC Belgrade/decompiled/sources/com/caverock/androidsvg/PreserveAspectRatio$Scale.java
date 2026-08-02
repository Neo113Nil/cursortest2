package com.caverock.androidsvg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class PreserveAspectRatio$Scale {
    private static final /* synthetic */ PreserveAspectRatio$Scale[] $VALUES;
    public static final PreserveAspectRatio$Scale meet;
    public static final PreserveAspectRatio$Scale slice;

    static {
        PreserveAspectRatio$Scale preserveAspectRatio$Scale = new PreserveAspectRatio$Scale("meet", 0);
        meet = preserveAspectRatio$Scale;
        PreserveAspectRatio$Scale preserveAspectRatio$Scale2 = new PreserveAspectRatio$Scale("slice", 1);
        slice = preserveAspectRatio$Scale2;
        $VALUES = new PreserveAspectRatio$Scale[]{preserveAspectRatio$Scale, preserveAspectRatio$Scale2};
    }

    public static PreserveAspectRatio$Scale valueOf(String str) {
        return (PreserveAspectRatio$Scale) Enum.valueOf(PreserveAspectRatio$Scale.class, str);
    }

    public static PreserveAspectRatio$Scale[] values() {
        return (PreserveAspectRatio$Scale[]) $VALUES.clone();
    }
}
