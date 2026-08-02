package androidx.compose.ui.layout;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicMinMax", "", "Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicMinMax;", "Min", "Max", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class MeasuringIntrinsics$IntrinsicMinMax {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MeasuringIntrinsics$IntrinsicMinMax[] $VALUES;
    public static final MeasuringIntrinsics$IntrinsicMinMax Max;
    public static final MeasuringIntrinsics$IntrinsicMinMax Min;

    static {
        MeasuringIntrinsics$IntrinsicMinMax measuringIntrinsics$IntrinsicMinMax = new MeasuringIntrinsics$IntrinsicMinMax("Min", 0);
        Min = measuringIntrinsics$IntrinsicMinMax;
        MeasuringIntrinsics$IntrinsicMinMax measuringIntrinsics$IntrinsicMinMax2 = new MeasuringIntrinsics$IntrinsicMinMax("Max", 1);
        Max = measuringIntrinsics$IntrinsicMinMax2;
        MeasuringIntrinsics$IntrinsicMinMax[] measuringIntrinsics$IntrinsicMinMaxArr = {measuringIntrinsics$IntrinsicMinMax, measuringIntrinsics$IntrinsicMinMax2};
        $VALUES = measuringIntrinsics$IntrinsicMinMaxArr;
        $ENTRIES = kotlin.enums.a.a(measuringIntrinsics$IntrinsicMinMaxArr);
    }

    public static MeasuringIntrinsics$IntrinsicMinMax valueOf(String str) {
        return (MeasuringIntrinsics$IntrinsicMinMax) Enum.valueOf(MeasuringIntrinsics$IntrinsicMinMax.class, str);
    }

    public static MeasuringIntrinsics$IntrinsicMinMax[] values() {
        return (MeasuringIntrinsics$IntrinsicMinMax[]) $VALUES.clone();
    }
}
