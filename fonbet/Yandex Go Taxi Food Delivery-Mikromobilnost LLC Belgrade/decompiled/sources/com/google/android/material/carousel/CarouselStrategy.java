package com.google.android.material.carousel;

/* loaded from: classes11.dex */
public abstract class CarouselStrategy {
    public float a;
    public float b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class StrategyType {
        private static final /* synthetic */ StrategyType[] $VALUES;
        public static final StrategyType CONTAINED;
        public static final StrategyType UNCONTAINED;

        static {
            StrategyType strategyType = new StrategyType("CONTAINED", 0);
            CONTAINED = strategyType;
            StrategyType strategyType2 = new StrategyType("UNCONTAINED", 1);
            UNCONTAINED = strategyType2;
            $VALUES = new StrategyType[]{strategyType, strategyType2};
        }

        public static StrategyType valueOf(String str) {
            return (StrategyType) Enum.valueOf(StrategyType.class, str);
        }

        public static StrategyType[] values() {
            return (StrategyType[]) $VALUES.clone();
        }
    }

    public static float a(float f, float f2, float f3) {
        return 1.0f - ((f - f3) / (f2 - f3));
    }
}
