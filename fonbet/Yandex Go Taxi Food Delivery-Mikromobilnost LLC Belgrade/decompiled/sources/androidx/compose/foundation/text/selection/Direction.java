package androidx.compose.foundation.text.selection;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/selection/Direction;", "", "BEFORE", "ON", "AFTER", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Direction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Direction[] $VALUES;
    public static final Direction AFTER;
    public static final Direction BEFORE;
    public static final Direction ON;

    static {
        Direction direction = new Direction("BEFORE", 0);
        BEFORE = direction;
        Direction direction2 = new Direction("ON", 1);
        ON = direction2;
        Direction direction3 = new Direction("AFTER", 2);
        AFTER = direction3;
        Direction[] directionArr = {direction, direction2, direction3};
        $VALUES = directionArr;
        $ENTRIES = kotlin.enums.a.a(directionArr);
    }

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) $VALUES.clone();
    }
}
