package androidx.compose.foundation.gestures;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/Orientation;", "", "Vertical", "Horizontal", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Orientation {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Orientation[] $VALUES;
    public static final Orientation Horizontal;
    public static final Orientation Vertical;

    static {
        Orientation orientation = new Orientation("Vertical", 0);
        Vertical = orientation;
        Orientation orientation2 = new Orientation("Horizontal", 1);
        Horizontal = orientation2;
        Orientation[] orientationArr = {orientation, orientation2};
        $VALUES = orientationArr;
        $ENTRIES = kotlin.enums.a.a(orientationArr);
    }

    public static Orientation valueOf(String str) {
        return (Orientation) Enum.valueOf(Orientation.class, str);
    }

    public static Orientation[] values() {
        return (Orientation[]) $VALUES.clone();
    }
}
