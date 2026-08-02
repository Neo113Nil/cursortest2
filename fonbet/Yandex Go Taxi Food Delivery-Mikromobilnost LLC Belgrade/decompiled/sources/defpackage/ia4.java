package defpackage;

import com.yandex.mob.api.model.MobAvailabilityCheckStrategyName;
import com.yandex.mob.api.model.MobContourAvailabilityCheckStrategyName;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class ia4 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[MobContourAvailabilityCheckStrategyName.values().length];
        try {
            iArr[MobContourAvailabilityCheckStrategyName.CurrentAndDefault.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MobContourAvailabilityCheckStrategyName.All.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[MobAvailabilityCheckStrategyName.values().length];
        try {
            iArr2[MobAvailabilityCheckStrategyName.ActiveAndFirst.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[MobAvailabilityCheckStrategyName.FirstSecondNext.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[MobAvailabilityCheckStrategyName.AllInList.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
