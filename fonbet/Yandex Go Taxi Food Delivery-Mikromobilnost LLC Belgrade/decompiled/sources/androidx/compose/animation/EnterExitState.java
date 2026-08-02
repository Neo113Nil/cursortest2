package androidx.compose.animation;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/animation/EnterExitState;", "", "PreEnter", "Visible", "PostExit", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EnterExitState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EnterExitState[] $VALUES;
    public static final EnterExitState PostExit;
    public static final EnterExitState PreEnter;
    public static final EnterExitState Visible;

    static {
        EnterExitState enterExitState = new EnterExitState("PreEnter", 0);
        PreEnter = enterExitState;
        EnterExitState enterExitState2 = new EnterExitState("Visible", 1);
        Visible = enterExitState2;
        EnterExitState enterExitState3 = new EnterExitState("PostExit", 2);
        PostExit = enterExitState3;
        EnterExitState[] enterExitStateArr = {enterExitState, enterExitState2, enterExitState3};
        $VALUES = enterExitStateArr;
        $ENTRIES = kotlin.enums.a.a(enterExitStateArr);
    }

    public static EnterExitState valueOf(String str) {
        return (EnterExitState) Enum.valueOf(EnterExitState.class, str);
    }

    public static EnterExitState[] values() {
        return (EnterExitState[]) $VALUES.clone();
    }
}
