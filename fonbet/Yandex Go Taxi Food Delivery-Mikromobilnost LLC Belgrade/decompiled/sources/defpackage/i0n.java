package defpackage;

import com.yandex.go.due_timetable.experiment.model.PriceHeightCalculationStrategyType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class i0n {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PriceHeightCalculationStrategyType.values().length];
        try {
            iArr[PriceHeightCalculationStrategyType.ALL_DAYS_IGNORE_ON_DEMAND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PriceHeightCalculationStrategyType.PER_DAY_WITH_ON_DEMAND_AS_MAX_VALUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
