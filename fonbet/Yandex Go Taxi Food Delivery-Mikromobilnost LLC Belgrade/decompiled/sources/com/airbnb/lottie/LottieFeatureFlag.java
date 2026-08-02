package com.airbnb.lottie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class LottieFeatureFlag {
    private static final /* synthetic */ LottieFeatureFlag[] $VALUES;
    public static final LottieFeatureFlag MergePathsApi19;
    public final int minRequiredSdkVersion = 19;

    static {
        LottieFeatureFlag lottieFeatureFlag = new LottieFeatureFlag();
        MergePathsApi19 = lottieFeatureFlag;
        $VALUES = new LottieFeatureFlag[]{lottieFeatureFlag};
    }

    public static LottieFeatureFlag valueOf(String str) {
        return (LottieFeatureFlag) Enum.valueOf(LottieFeatureFlag.class, str);
    }

    public static LottieFeatureFlag[] values() {
        return (LottieFeatureFlag[]) $VALUES.clone();
    }
}
