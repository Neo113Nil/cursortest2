package defpackage;

import just.adapter.scroll.experimental.OptimizedPaginationTriggerFeatureConfig;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class lhp0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OptimizedPaginationTriggerFeatureConfig.values().length];
        try {
            iArr[OptimizedPaginationTriggerFeatureConfig.ENABLED_MANUAL_TRIGGER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OptimizedPaginationTriggerFeatureConfig.ENABLED_AUTOMATIC_TRIGGER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OptimizedPaginationTriggerFeatureConfig.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
