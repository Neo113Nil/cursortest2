package androidx.work;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"androidx/work/WorkInfo$State", "", "Landroidx/work/WorkInfo$State;", "ENQUEUED", "RUNNING", "SUCCEEDED", "FAILED", "BLOCKED", "CANCELLED", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WorkInfo$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WorkInfo$State[] $VALUES;
    public static final WorkInfo$State BLOCKED;
    public static final WorkInfo$State CANCELLED;
    public static final WorkInfo$State ENQUEUED;
    public static final WorkInfo$State FAILED;
    public static final WorkInfo$State RUNNING;
    public static final WorkInfo$State SUCCEEDED;

    static {
        WorkInfo$State workInfo$State = new WorkInfo$State("ENQUEUED", 0);
        ENQUEUED = workInfo$State;
        WorkInfo$State workInfo$State2 = new WorkInfo$State("RUNNING", 1);
        RUNNING = workInfo$State2;
        WorkInfo$State workInfo$State3 = new WorkInfo$State("SUCCEEDED", 2);
        SUCCEEDED = workInfo$State3;
        WorkInfo$State workInfo$State4 = new WorkInfo$State("FAILED", 3);
        FAILED = workInfo$State4;
        WorkInfo$State workInfo$State5 = new WorkInfo$State("BLOCKED", 4);
        BLOCKED = workInfo$State5;
        WorkInfo$State workInfo$State6 = new WorkInfo$State("CANCELLED", 5);
        CANCELLED = workInfo$State6;
        WorkInfo$State[] workInfo$StateArr = {workInfo$State, workInfo$State2, workInfo$State3, workInfo$State4, workInfo$State5, workInfo$State6};
        $VALUES = workInfo$StateArr;
        $ENTRIES = kotlin.enums.a.a(workInfo$StateArr);
    }

    public static WorkInfo$State valueOf(String str) {
        return (WorkInfo$State) Enum.valueOf(WorkInfo$State.class, str);
    }

    public static WorkInfo$State[] values() {
        return (WorkInfo$State[]) $VALUES.clone();
    }

    public final boolean a() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
