package androidx.compose.foundation.text.selection;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionHandleAnchor;", "", "Left", "Middle", "Right", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SelectionHandleAnchor {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SelectionHandleAnchor[] $VALUES;
    public static final SelectionHandleAnchor Left;
    public static final SelectionHandleAnchor Middle;
    public static final SelectionHandleAnchor Right;

    static {
        SelectionHandleAnchor selectionHandleAnchor = new SelectionHandleAnchor("Left", 0);
        Left = selectionHandleAnchor;
        SelectionHandleAnchor selectionHandleAnchor2 = new SelectionHandleAnchor("Middle", 1);
        Middle = selectionHandleAnchor2;
        SelectionHandleAnchor selectionHandleAnchor3 = new SelectionHandleAnchor("Right", 2);
        Right = selectionHandleAnchor3;
        SelectionHandleAnchor[] selectionHandleAnchorArr = {selectionHandleAnchor, selectionHandleAnchor2, selectionHandleAnchor3};
        $VALUES = selectionHandleAnchorArr;
        $ENTRIES = kotlin.enums.a.a(selectionHandleAnchorArr);
    }

    public static SelectionHandleAnchor valueOf(String str) {
        return (SelectionHandleAnchor) Enum.valueOf(SelectionHandleAnchor.class, str);
    }

    public static SelectionHandleAnchor[] values() {
        return (SelectionHandleAnchor[]) $VALUES.clone();
    }
}
