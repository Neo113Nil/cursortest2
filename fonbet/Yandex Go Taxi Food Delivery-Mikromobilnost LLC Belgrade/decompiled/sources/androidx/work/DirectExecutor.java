package androidx.work;

import defpackage.k4o;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/DirectExecutor;", "Ljava/util/concurrent/Executor;", "", "INSTANCE", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DirectExecutor implements Executor {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DirectExecutor[] $VALUES;
    public static final DirectExecutor INSTANCE;

    static {
        DirectExecutor directExecutor = new DirectExecutor("INSTANCE", 0);
        INSTANCE = directExecutor;
        DirectExecutor[] directExecutorArr = {directExecutor};
        $VALUES = directExecutorArr;
        $ENTRIES = kotlin.enums.a.a(directExecutorArr);
    }

    public static DirectExecutor valueOf(String str) {
        return (DirectExecutor) Enum.valueOf(DirectExecutor.class, str);
    }

    public static DirectExecutor[] values() {
        return (DirectExecutor[]) $VALUES.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
