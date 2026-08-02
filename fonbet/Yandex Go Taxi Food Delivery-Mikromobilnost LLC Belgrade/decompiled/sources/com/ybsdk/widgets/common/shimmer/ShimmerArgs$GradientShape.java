package com.ybsdk.widgets.common.shimmer;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/widgets/common/shimmer/ShimmerArgs$GradientShape", "", "Lcom/ybsdk/widgets/common/shimmer/ShimmerArgs$GradientShape;", "<init>", "(Ljava/lang/String;I)V", "VERTICAL", "TILTED_OVAL", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShimmerArgs$GradientShape {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ShimmerArgs$GradientShape[] $VALUES;
    public static final ShimmerArgs$GradientShape VERTICAL = new ShimmerArgs$GradientShape("VERTICAL", 0);
    public static final ShimmerArgs$GradientShape TILTED_OVAL = new ShimmerArgs$GradientShape("TILTED_OVAL", 1);

    private static final /* synthetic */ ShimmerArgs$GradientShape[] $values() {
        return new ShimmerArgs$GradientShape[]{VERTICAL, TILTED_OVAL};
    }

    static {
        ShimmerArgs$GradientShape[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ShimmerArgs$GradientShape(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ShimmerArgs$GradientShape valueOf(String str) {
        return (ShimmerArgs$GradientShape) Enum.valueOf(ShimmerArgs$GradientShape.class, str);
    }

    public static ShimmerArgs$GradientShape[] values() {
        return (ShimmerArgs$GradientShape[]) $VALUES.clone();
    }
}
