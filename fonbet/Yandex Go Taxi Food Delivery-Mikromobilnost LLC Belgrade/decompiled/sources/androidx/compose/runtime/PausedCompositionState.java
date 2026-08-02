package androidx.compose.runtime;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/PausedCompositionState;", "", "Invalid", "Cancelled", "InitialPending", "RecomposePending", "Recomposing", "ApplyPending", "Applied", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PausedCompositionState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PausedCompositionState[] $VALUES;
    public static final PausedCompositionState Applied;
    public static final PausedCompositionState ApplyPending;
    public static final PausedCompositionState Cancelled;
    public static final PausedCompositionState InitialPending;
    public static final PausedCompositionState Invalid;
    public static final PausedCompositionState RecomposePending;
    public static final PausedCompositionState Recomposing;

    static {
        PausedCompositionState pausedCompositionState = new PausedCompositionState("Invalid", 0);
        Invalid = pausedCompositionState;
        PausedCompositionState pausedCompositionState2 = new PausedCompositionState("Cancelled", 1);
        Cancelled = pausedCompositionState2;
        PausedCompositionState pausedCompositionState3 = new PausedCompositionState("InitialPending", 2);
        InitialPending = pausedCompositionState3;
        PausedCompositionState pausedCompositionState4 = new PausedCompositionState("RecomposePending", 3);
        RecomposePending = pausedCompositionState4;
        PausedCompositionState pausedCompositionState5 = new PausedCompositionState("Recomposing", 4);
        Recomposing = pausedCompositionState5;
        PausedCompositionState pausedCompositionState6 = new PausedCompositionState("ApplyPending", 5);
        ApplyPending = pausedCompositionState6;
        PausedCompositionState pausedCompositionState7 = new PausedCompositionState("Applied", 6);
        Applied = pausedCompositionState7;
        PausedCompositionState[] pausedCompositionStateArr = {pausedCompositionState, pausedCompositionState2, pausedCompositionState3, pausedCompositionState4, pausedCompositionState5, pausedCompositionState6, pausedCompositionState7};
        $VALUES = pausedCompositionStateArr;
        $ENTRIES = kotlin.enums.a.a(pausedCompositionStateArr);
    }

    public static PausedCompositionState valueOf(String str) {
        return (PausedCompositionState) Enum.valueOf(PausedCompositionState.class, str);
    }

    public static PausedCompositionState[] values() {
        return (PausedCompositionState[]) $VALUES.clone();
    }
}
