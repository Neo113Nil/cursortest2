package androidx.compose.ui.input.pointer;

import defpackage.fwd0;
import defpackage.k4o;
import defpackage.tls;
import defpackage.w5j0;
import kotlin.Metadata;

/* loaded from: classes.dex */
public final class PointerInteropFilter implements fwd0 {
    public tls a;
    public w5j0 b;
    public boolean c;
    public final c w = new c(this);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "", "Unknown", "Dispatching", "NotDispatching", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DispatchToViewState {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ DispatchToViewState[] $VALUES;
        public static final DispatchToViewState Dispatching;
        public static final DispatchToViewState NotDispatching;
        public static final DispatchToViewState Unknown;

        static {
            DispatchToViewState dispatchToViewState = new DispatchToViewState("Unknown", 0);
            Unknown = dispatchToViewState;
            DispatchToViewState dispatchToViewState2 = new DispatchToViewState("Dispatching", 1);
            Dispatching = dispatchToViewState2;
            DispatchToViewState dispatchToViewState3 = new DispatchToViewState("NotDispatching", 2);
            NotDispatching = dispatchToViewState3;
            DispatchToViewState[] dispatchToViewStateArr = {dispatchToViewState, dispatchToViewState2, dispatchToViewState3};
            $VALUES = dispatchToViewStateArr;
            $ENTRIES = kotlin.enums.a.a(dispatchToViewStateArr);
        }

        public static DispatchToViewState valueOf(String str) {
            return (DispatchToViewState) Enum.valueOf(DispatchToViewState.class, str);
        }

        public static DispatchToViewState[] values() {
            return (DispatchToViewState[]) $VALUES.clone();
        }
    }
}
