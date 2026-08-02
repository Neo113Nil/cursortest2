package androidx.compose.foundation.gestures;

import defpackage.k4o;
import defpackage.q5b1;
import kotlin.Metadata;

/* loaded from: classes10.dex */
public final class IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown extends q5b1 {
    public AwaitTouchSlop a;
    public boolean b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop;", "", "Yes", "No", "NotInitialized", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AwaitTouchSlop {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AwaitTouchSlop[] $VALUES;
        public static final AwaitTouchSlop No;
        public static final AwaitTouchSlop NotInitialized;
        public static final AwaitTouchSlop Yes;

        static {
            AwaitTouchSlop awaitTouchSlop = new AwaitTouchSlop("Yes", 0);
            Yes = awaitTouchSlop;
            AwaitTouchSlop awaitTouchSlop2 = new AwaitTouchSlop("No", 1);
            No = awaitTouchSlop2;
            AwaitTouchSlop awaitTouchSlop3 = new AwaitTouchSlop("NotInitialized", 2);
            NotInitialized = awaitTouchSlop3;
            AwaitTouchSlop[] awaitTouchSlopArr = {awaitTouchSlop, awaitTouchSlop2, awaitTouchSlop3};
            $VALUES = awaitTouchSlopArr;
            $ENTRIES = kotlin.enums.a.a(awaitTouchSlopArr);
        }

        public static AwaitTouchSlop valueOf(String str) {
            return (AwaitTouchSlop) Enum.valueOf(AwaitTouchSlop.class, str);
        }

        public static AwaitTouchSlop[] values() {
            return (AwaitTouchSlop[]) $VALUES.clone();
        }
    }

    public IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown(int i) {
        this.a = AwaitTouchSlop.NotInitialized;
        this.b = false;
    }

    public IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown() {
        this(0);
    }
}
