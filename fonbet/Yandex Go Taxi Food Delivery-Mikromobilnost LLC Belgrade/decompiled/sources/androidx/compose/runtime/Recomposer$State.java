package androidx.compose.runtime;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"androidx/compose/runtime/Recomposer$State", "", "Landroidx/compose/runtime/Recomposer$State;", "ShutDown", "ShuttingDown", CA20Status.STATUS_USER_DESCRIPTION_I, "InactivePendingWork", "Idle", "PendingWork", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Recomposer$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Recomposer$State[] $VALUES;
    public static final Recomposer$State Idle;
    public static final Recomposer$State Inactive;
    public static final Recomposer$State InactivePendingWork;
    public static final Recomposer$State PendingWork;
    public static final Recomposer$State ShutDown;
    public static final Recomposer$State ShuttingDown;

    static {
        Recomposer$State recomposer$State = new Recomposer$State("ShutDown", 0);
        ShutDown = recomposer$State;
        Recomposer$State recomposer$State2 = new Recomposer$State("ShuttingDown", 1);
        ShuttingDown = recomposer$State2;
        Recomposer$State recomposer$State3 = new Recomposer$State(CA20Status.STATUS_USER_DESCRIPTION_I, 2);
        Inactive = recomposer$State3;
        Recomposer$State recomposer$State4 = new Recomposer$State("InactivePendingWork", 3);
        InactivePendingWork = recomposer$State4;
        Recomposer$State recomposer$State5 = new Recomposer$State("Idle", 4);
        Idle = recomposer$State5;
        Recomposer$State recomposer$State6 = new Recomposer$State("PendingWork", 5);
        PendingWork = recomposer$State6;
        Recomposer$State[] recomposer$StateArr = {recomposer$State, recomposer$State2, recomposer$State3, recomposer$State4, recomposer$State5, recomposer$State6};
        $VALUES = recomposer$StateArr;
        $ENTRIES = kotlin.enums.a.a(recomposer$StateArr);
    }

    public static Recomposer$State valueOf(String str) {
        return (Recomposer$State) Enum.valueOf(Recomposer$State.class, str);
    }

    public static Recomposer$State[] values() {
        return (Recomposer$State[]) $VALUES.clone();
    }
}
