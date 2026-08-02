package androidx.compose.ui.graphics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/graphics/Path$Direction", "", "Landroidx/compose/ui/graphics/Path$Direction;", "CounterClockwise", "Clockwise", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Path$Direction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Path$Direction[] $VALUES;
    public static final Path$Direction Clockwise;
    public static final Path$Direction CounterClockwise;

    static {
        Path$Direction path$Direction = new Path$Direction("CounterClockwise", 0);
        CounterClockwise = path$Direction;
        Path$Direction path$Direction2 = new Path$Direction("Clockwise", 1);
        Clockwise = path$Direction2;
        Path$Direction[] path$DirectionArr = {path$Direction, path$Direction2};
        $VALUES = path$DirectionArr;
        $ENTRIES = kotlin.enums.a.a(path$DirectionArr);
    }

    public static Path$Direction valueOf(String str) {
        return (Path$Direction) Enum.valueOf(Path$Direction.class, str);
    }

    public static Path$Direction[] values() {
        return (Path$Direction[]) $VALUES.clone();
    }
}
