package defpackage;

import io.flutter.plugins.camerax.ResolutionStrategyFallbackRule;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class esj0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ResolutionStrategyFallbackRule.values().length];
        a = iArr;
        try {
            iArr[ResolutionStrategyFallbackRule.CLOSEST_HIGHER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[ResolutionStrategyFallbackRule.CLOSEST_HIGHER_THEN_LOWER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[ResolutionStrategyFallbackRule.CLOSEST_LOWER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[ResolutionStrategyFallbackRule.CLOSEST_LOWER_THEN_HIGHER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[ResolutionStrategyFallbackRule.NONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[ResolutionStrategyFallbackRule.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
