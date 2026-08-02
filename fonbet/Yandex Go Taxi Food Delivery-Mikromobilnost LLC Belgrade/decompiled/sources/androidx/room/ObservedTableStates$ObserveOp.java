package androidx.room;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"androidx/room/ObservedTableStates$ObserveOp", "", "Landroidx/room/ObservedTableStates$ObserveOp;", "NO_OP", "ADD", "REMOVE", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ObservedTableStates$ObserveOp {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ObservedTableStates$ObserveOp[] $VALUES;
    public static final ObservedTableStates$ObserveOp ADD;
    public static final ObservedTableStates$ObserveOp NO_OP;
    public static final ObservedTableStates$ObserveOp REMOVE;

    static {
        ObservedTableStates$ObserveOp observedTableStates$ObserveOp = new ObservedTableStates$ObserveOp("NO_OP", 0);
        NO_OP = observedTableStates$ObserveOp;
        ObservedTableStates$ObserveOp observedTableStates$ObserveOp2 = new ObservedTableStates$ObserveOp("ADD", 1);
        ADD = observedTableStates$ObserveOp2;
        ObservedTableStates$ObserveOp observedTableStates$ObserveOp3 = new ObservedTableStates$ObserveOp("REMOVE", 2);
        REMOVE = observedTableStates$ObserveOp3;
        ObservedTableStates$ObserveOp[] observedTableStates$ObserveOpArr = {observedTableStates$ObserveOp, observedTableStates$ObserveOp2, observedTableStates$ObserveOp3};
        $VALUES = observedTableStates$ObserveOpArr;
        $ENTRIES = kotlin.enums.a.a(observedTableStates$ObserveOpArr);
    }

    public static ObservedTableStates$ObserveOp valueOf(String str) {
        return (ObservedTableStates$ObserveOp) Enum.valueOf(ObservedTableStates$ObserveOp.class, str);
    }

    public static ObservedTableStates$ObserveOp[] values() {
        return (ObservedTableStates$ObserveOp[]) $VALUES.clone();
    }
}
