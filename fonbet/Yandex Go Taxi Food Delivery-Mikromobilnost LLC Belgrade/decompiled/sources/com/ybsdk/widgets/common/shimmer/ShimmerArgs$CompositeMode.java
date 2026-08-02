package com.ybsdk.widgets.common.shimmer;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/widgets/common/shimmer/ShimmerArgs$CompositeMode", "", "Lcom/ybsdk/widgets/common/shimmer/ShimmerArgs$CompositeMode;", "<init>", "(Ljava/lang/String;I)V", "CLIP_TO_ALPHA", "OPAQUE", "OVER_TRANSPARENT", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShimmerArgs$CompositeMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ShimmerArgs$CompositeMode[] $VALUES;
    public static final ShimmerArgs$CompositeMode CLIP_TO_ALPHA = new ShimmerArgs$CompositeMode("CLIP_TO_ALPHA", 0);
    public static final ShimmerArgs$CompositeMode OPAQUE = new ShimmerArgs$CompositeMode("OPAQUE", 1);
    public static final ShimmerArgs$CompositeMode OVER_TRANSPARENT = new ShimmerArgs$CompositeMode("OVER_TRANSPARENT", 2);

    private static final /* synthetic */ ShimmerArgs$CompositeMode[] $values() {
        return new ShimmerArgs$CompositeMode[]{CLIP_TO_ALPHA, OPAQUE, OVER_TRANSPARENT};
    }

    static {
        ShimmerArgs$CompositeMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ShimmerArgs$CompositeMode(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ShimmerArgs$CompositeMode valueOf(String str) {
        return (ShimmerArgs$CompositeMode) Enum.valueOf(ShimmerArgs$CompositeMode.class, str);
    }

    public static ShimmerArgs$CompositeMode[] values() {
        return (ShimmerArgs$CompositeMode[]) $VALUES.clone();
    }
}
