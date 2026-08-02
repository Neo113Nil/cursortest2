package com.bumptech.glide.load.engine;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
final class DecodeJob$RunReason {
    private static final /* synthetic */ DecodeJob$RunReason[] $VALUES;
    public static final DecodeJob$RunReason DECODE_DATA;
    public static final DecodeJob$RunReason INITIALIZE;
    public static final DecodeJob$RunReason SWITCH_TO_SOURCE_SERVICE;

    static {
        DecodeJob$RunReason decodeJob$RunReason = new DecodeJob$RunReason("INITIALIZE", 0);
        INITIALIZE = decodeJob$RunReason;
        DecodeJob$RunReason decodeJob$RunReason2 = new DecodeJob$RunReason("SWITCH_TO_SOURCE_SERVICE", 1);
        SWITCH_TO_SOURCE_SERVICE = decodeJob$RunReason2;
        DecodeJob$RunReason decodeJob$RunReason3 = new DecodeJob$RunReason("DECODE_DATA", 2);
        DECODE_DATA = decodeJob$RunReason3;
        $VALUES = new DecodeJob$RunReason[]{decodeJob$RunReason, decodeJob$RunReason2, decodeJob$RunReason3};
    }

    public static DecodeJob$RunReason valueOf(String str) {
        return (DecodeJob$RunReason) Enum.valueOf(DecodeJob$RunReason.class, str);
    }

    public static DecodeJob$RunReason[] values() {
        return (DecodeJob$RunReason[]) $VALUES.clone();
    }
}
