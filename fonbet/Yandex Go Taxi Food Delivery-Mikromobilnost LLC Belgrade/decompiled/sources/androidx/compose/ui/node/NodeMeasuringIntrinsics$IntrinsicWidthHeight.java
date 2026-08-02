package androidx.compose.ui.node;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicWidthHeight", "", "Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicWidthHeight;", "Width", "Height", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class NodeMeasuringIntrinsics$IntrinsicWidthHeight {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NodeMeasuringIntrinsics$IntrinsicWidthHeight[] $VALUES;
    public static final NodeMeasuringIntrinsics$IntrinsicWidthHeight Height;
    public static final NodeMeasuringIntrinsics$IntrinsicWidthHeight Width;

    static {
        NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight = new NodeMeasuringIntrinsics$IntrinsicWidthHeight("Width", 0);
        Width = nodeMeasuringIntrinsics$IntrinsicWidthHeight;
        NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight2 = new NodeMeasuringIntrinsics$IntrinsicWidthHeight("Height", 1);
        Height = nodeMeasuringIntrinsics$IntrinsicWidthHeight2;
        NodeMeasuringIntrinsics$IntrinsicWidthHeight[] nodeMeasuringIntrinsics$IntrinsicWidthHeightArr = {nodeMeasuringIntrinsics$IntrinsicWidthHeight, nodeMeasuringIntrinsics$IntrinsicWidthHeight2};
        $VALUES = nodeMeasuringIntrinsics$IntrinsicWidthHeightArr;
        $ENTRIES = kotlin.enums.a.a(nodeMeasuringIntrinsics$IntrinsicWidthHeightArr);
    }

    public static NodeMeasuringIntrinsics$IntrinsicWidthHeight valueOf(String str) {
        return (NodeMeasuringIntrinsics$IntrinsicWidthHeight) Enum.valueOf(NodeMeasuringIntrinsics$IntrinsicWidthHeight.class, str);
    }

    public static NodeMeasuringIntrinsics$IntrinsicWidthHeight[] values() {
        return (NodeMeasuringIntrinsics$IntrinsicWidthHeight[]) $VALUES.clone();
    }
}
