package androidx.compose.material;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/InputPhase;", "", "Focused", "UnfocusedEmpty", "UnfocusedNotEmpty", "material"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class InputPhase {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ InputPhase[] $VALUES;
    public static final InputPhase Focused;
    public static final InputPhase UnfocusedEmpty;
    public static final InputPhase UnfocusedNotEmpty;

    static {
        InputPhase inputPhase = new InputPhase("Focused", 0);
        Focused = inputPhase;
        InputPhase inputPhase2 = new InputPhase("UnfocusedEmpty", 1);
        UnfocusedEmpty = inputPhase2;
        InputPhase inputPhase3 = new InputPhase("UnfocusedNotEmpty", 2);
        UnfocusedNotEmpty = inputPhase3;
        InputPhase[] inputPhaseArr = {inputPhase, inputPhase2, inputPhase3};
        $VALUES = inputPhaseArr;
        $ENTRIES = kotlin.enums.a.a(inputPhaseArr);
    }

    public static InputPhase valueOf(String str) {
        return (InputPhase) Enum.valueOf(InputPhase.class, str);
    }

    public static InputPhase[] values() {
        return (InputPhase[]) $VALUES.clone();
    }
}
