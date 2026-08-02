package androidx.compose.ui.node;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicMinMax", "", "Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicMinMax;", "Min", "Max", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class NodeMeasuringIntrinsics$IntrinsicMinMax {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NodeMeasuringIntrinsics$IntrinsicMinMax[] $VALUES;
    public static final NodeMeasuringIntrinsics$IntrinsicMinMax Max;
    public static final NodeMeasuringIntrinsics$IntrinsicMinMax Min;

    static {
        NodeMeasuringIntrinsics$IntrinsicMinMax nodeMeasuringIntrinsics$IntrinsicMinMax = new NodeMeasuringIntrinsics$IntrinsicMinMax("Min", 0);
        Min = nodeMeasuringIntrinsics$IntrinsicMinMax;
        NodeMeasuringIntrinsics$IntrinsicMinMax nodeMeasuringIntrinsics$IntrinsicMinMax2 = new NodeMeasuringIntrinsics$IntrinsicMinMax("Max", 1);
        Max = nodeMeasuringIntrinsics$IntrinsicMinMax2;
        NodeMeasuringIntrinsics$IntrinsicMinMax[] nodeMeasuringIntrinsics$IntrinsicMinMaxArr = {nodeMeasuringIntrinsics$IntrinsicMinMax, nodeMeasuringIntrinsics$IntrinsicMinMax2};
        $VALUES = nodeMeasuringIntrinsics$IntrinsicMinMaxArr;
        $ENTRIES = kotlin.enums.a.a(nodeMeasuringIntrinsics$IntrinsicMinMaxArr);
    }

    public static NodeMeasuringIntrinsics$IntrinsicMinMax valueOf(String str) {
        return (NodeMeasuringIntrinsics$IntrinsicMinMax) Enum.valueOf(NodeMeasuringIntrinsics$IntrinsicMinMax.class, str);
    }

    public static NodeMeasuringIntrinsics$IntrinsicMinMax[] values() {
        return (NodeMeasuringIntrinsics$IntrinsicMinMax[]) $VALUES.clone();
    }
}
