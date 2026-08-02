package androidx.compose.ui.node;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"androidx/compose/ui/node/LookaheadPassDelegate$PlacedState", "", "Landroidx/compose/ui/node/LookaheadPassDelegate$PlacedState;", "IsPlacedInLookahead", "IsPlacedInApproach", "IsNotPlaced", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class LookaheadPassDelegate$PlacedState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LookaheadPassDelegate$PlacedState[] $VALUES;
    public static final LookaheadPassDelegate$PlacedState IsNotPlaced;
    public static final LookaheadPassDelegate$PlacedState IsPlacedInApproach;
    public static final LookaheadPassDelegate$PlacedState IsPlacedInLookahead;

    static {
        LookaheadPassDelegate$PlacedState lookaheadPassDelegate$PlacedState = new LookaheadPassDelegate$PlacedState("IsPlacedInLookahead", 0);
        IsPlacedInLookahead = lookaheadPassDelegate$PlacedState;
        LookaheadPassDelegate$PlacedState lookaheadPassDelegate$PlacedState2 = new LookaheadPassDelegate$PlacedState("IsPlacedInApproach", 1);
        IsPlacedInApproach = lookaheadPassDelegate$PlacedState2;
        LookaheadPassDelegate$PlacedState lookaheadPassDelegate$PlacedState3 = new LookaheadPassDelegate$PlacedState("IsNotPlaced", 2);
        IsNotPlaced = lookaheadPassDelegate$PlacedState3;
        LookaheadPassDelegate$PlacedState[] lookaheadPassDelegate$PlacedStateArr = {lookaheadPassDelegate$PlacedState, lookaheadPassDelegate$PlacedState2, lookaheadPassDelegate$PlacedState3};
        $VALUES = lookaheadPassDelegate$PlacedStateArr;
        $ENTRIES = kotlin.enums.a.a(lookaheadPassDelegate$PlacedStateArr);
    }

    public static LookaheadPassDelegate$PlacedState valueOf(String str) {
        return (LookaheadPassDelegate$PlacedState) Enum.valueOf(LookaheadPassDelegate$PlacedState.class, str);
    }

    public static LookaheadPassDelegate$PlacedState[] values() {
        return (LookaheadPassDelegate$PlacedState[]) $VALUES.clone();
    }
}
