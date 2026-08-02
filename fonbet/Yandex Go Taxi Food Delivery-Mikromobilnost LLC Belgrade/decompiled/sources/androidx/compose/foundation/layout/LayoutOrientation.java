package androidx.compose.foundation.layout;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/LayoutOrientation;", "", "Horizontal", "Vertical", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LayoutOrientation {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LayoutOrientation[] $VALUES;
    public static final LayoutOrientation Horizontal;
    public static final LayoutOrientation Vertical;

    static {
        LayoutOrientation layoutOrientation = new LayoutOrientation("Horizontal", 0);
        Horizontal = layoutOrientation;
        LayoutOrientation layoutOrientation2 = new LayoutOrientation("Vertical", 1);
        Vertical = layoutOrientation2;
        LayoutOrientation[] layoutOrientationArr = {layoutOrientation, layoutOrientation2};
        $VALUES = layoutOrientationArr;
        $ENTRIES = kotlin.enums.a.a(layoutOrientationArr);
    }

    public static LayoutOrientation valueOf(String str) {
        return (LayoutOrientation) Enum.valueOf(LayoutOrientation.class, str);
    }

    public static LayoutOrientation[] values() {
        return (LayoutOrientation[]) $VALUES.clone();
    }
}
