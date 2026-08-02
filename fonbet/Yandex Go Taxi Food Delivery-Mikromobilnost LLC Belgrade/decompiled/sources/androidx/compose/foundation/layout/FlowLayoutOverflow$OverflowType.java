package androidx.compose.foundation.layout;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType", "", "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "Visible", "Clip", "ExpandIndicator", "ExpandOrCollapseIndicator", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlowLayoutOverflow$OverflowType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FlowLayoutOverflow$OverflowType[] $VALUES;
    public static final FlowLayoutOverflow$OverflowType Clip;
    public static final FlowLayoutOverflow$OverflowType ExpandIndicator;
    public static final FlowLayoutOverflow$OverflowType ExpandOrCollapseIndicator;
    public static final FlowLayoutOverflow$OverflowType Visible;

    static {
        FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType = new FlowLayoutOverflow$OverflowType("Visible", 0);
        Visible = flowLayoutOverflow$OverflowType;
        FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType2 = new FlowLayoutOverflow$OverflowType("Clip", 1);
        Clip = flowLayoutOverflow$OverflowType2;
        FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType3 = new FlowLayoutOverflow$OverflowType("ExpandIndicator", 2);
        ExpandIndicator = flowLayoutOverflow$OverflowType3;
        FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType4 = new FlowLayoutOverflow$OverflowType("ExpandOrCollapseIndicator", 3);
        ExpandOrCollapseIndicator = flowLayoutOverflow$OverflowType4;
        FlowLayoutOverflow$OverflowType[] flowLayoutOverflow$OverflowTypeArr = {flowLayoutOverflow$OverflowType, flowLayoutOverflow$OverflowType2, flowLayoutOverflow$OverflowType3, flowLayoutOverflow$OverflowType4};
        $VALUES = flowLayoutOverflow$OverflowTypeArr;
        $ENTRIES = kotlin.enums.a.a(flowLayoutOverflow$OverflowTypeArr);
    }

    public static FlowLayoutOverflow$OverflowType valueOf(String str) {
        return (FlowLayoutOverflow$OverflowType) Enum.valueOf(FlowLayoutOverflow$OverflowType.class, str);
    }

    public static FlowLayoutOverflow$OverflowType[] values() {
        return (FlowLayoutOverflow$OverflowType[]) $VALUES.clone();
    }
}
