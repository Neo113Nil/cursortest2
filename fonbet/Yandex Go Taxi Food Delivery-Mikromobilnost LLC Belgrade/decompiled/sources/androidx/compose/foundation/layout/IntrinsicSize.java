package androidx.compose.foundation.layout;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicSize;", "", "Min", "Max", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class IntrinsicSize {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ IntrinsicSize[] $VALUES;
    public static final IntrinsicSize Max;
    public static final IntrinsicSize Min;

    static {
        IntrinsicSize intrinsicSize = new IntrinsicSize("Min", 0);
        Min = intrinsicSize;
        IntrinsicSize intrinsicSize2 = new IntrinsicSize("Max", 1);
        Max = intrinsicSize2;
        IntrinsicSize[] intrinsicSizeArr = {intrinsicSize, intrinsicSize2};
        $VALUES = intrinsicSizeArr;
        $ENTRIES = kotlin.enums.a.a(intrinsicSizeArr);
    }

    public static IntrinsicSize valueOf(String str) {
        return (IntrinsicSize) Enum.valueOf(IntrinsicSize.class, str);
    }

    public static IntrinsicSize[] values() {
        return (IntrinsicSize[]) $VALUES.clone();
    }
}
