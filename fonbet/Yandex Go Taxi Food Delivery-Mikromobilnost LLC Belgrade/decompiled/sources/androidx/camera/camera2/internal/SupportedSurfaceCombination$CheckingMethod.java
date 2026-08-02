package androidx.camera.camera2.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
final class SupportedSurfaceCombination$CheckingMethod {
    private static final /* synthetic */ SupportedSurfaceCombination$CheckingMethod[] $VALUES;
    public static final SupportedSurfaceCombination$CheckingMethod WITHOUT_FEATURE_COMBO;
    public static final SupportedSurfaceCombination$CheckingMethod WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT;
    public static final SupportedSurfaceCombination$CheckingMethod WITH_FEATURE_COMBO;

    static {
        SupportedSurfaceCombination$CheckingMethod supportedSurfaceCombination$CheckingMethod = new SupportedSurfaceCombination$CheckingMethod("WITHOUT_FEATURE_COMBO", 0);
        WITHOUT_FEATURE_COMBO = supportedSurfaceCombination$CheckingMethod;
        SupportedSurfaceCombination$CheckingMethod supportedSurfaceCombination$CheckingMethod2 = new SupportedSurfaceCombination$CheckingMethod("WITH_FEATURE_COMBO", 1);
        WITH_FEATURE_COMBO = supportedSurfaceCombination$CheckingMethod2;
        SupportedSurfaceCombination$CheckingMethod supportedSurfaceCombination$CheckingMethod3 = new SupportedSurfaceCombination$CheckingMethod("WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT", 2);
        WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT = supportedSurfaceCombination$CheckingMethod3;
        $VALUES = new SupportedSurfaceCombination$CheckingMethod[]{supportedSurfaceCombination$CheckingMethod, supportedSurfaceCombination$CheckingMethod2, supportedSurfaceCombination$CheckingMethod3};
    }

    public static SupportedSurfaceCombination$CheckingMethod valueOf(String str) {
        return (SupportedSurfaceCombination$CheckingMethod) Enum.valueOf(SupportedSurfaceCombination$CheckingMethod.class, str);
    }

    public static SupportedSurfaceCombination$CheckingMethod[] values() {
        return (SupportedSurfaceCombination$CheckingMethod[]) $VALUES.clone();
    }
}
