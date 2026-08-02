package androidx.compose.foundation.text.contextmenu.modifier;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarHandlerState;", "", "Uninitialized", "Detached", "Attached", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ToolbarHandlerState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ToolbarHandlerState[] $VALUES;
    public static final ToolbarHandlerState Attached;
    public static final ToolbarHandlerState Detached;
    public static final ToolbarHandlerState Uninitialized;

    static {
        ToolbarHandlerState toolbarHandlerState = new ToolbarHandlerState("Uninitialized", 0);
        Uninitialized = toolbarHandlerState;
        ToolbarHandlerState toolbarHandlerState2 = new ToolbarHandlerState("Detached", 1);
        Detached = toolbarHandlerState2;
        ToolbarHandlerState toolbarHandlerState3 = new ToolbarHandlerState("Attached", 2);
        Attached = toolbarHandlerState3;
        ToolbarHandlerState[] toolbarHandlerStateArr = {toolbarHandlerState, toolbarHandlerState2, toolbarHandlerState3};
        $VALUES = toolbarHandlerStateArr;
        $ENTRIES = kotlin.enums.a.a(toolbarHandlerStateArr);
    }

    public static ToolbarHandlerState valueOf(String str) {
        return (ToolbarHandlerState) Enum.valueOf(ToolbarHandlerState.class, str);
    }

    public static ToolbarHandlerState[] values() {
        return (ToolbarHandlerState[]) $VALUES.clone();
    }
}
