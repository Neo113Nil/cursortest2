package xsna;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DirectExecutor.java */
/* loaded from: classes13.dex */
public final class kzm implements Executor {
    private static final /* synthetic */ kzm[] $VALUES;
    public static final kzm INSTANCE;

    static {
        kzm kzmVar = new kzm("INSTANCE", 0);
        INSTANCE = kzmVar;
        $VALUES = new kzm[]{kzmVar};
    }

    public kzm() {
        throw null;
    }

    public static kzm valueOf(String str) {
        return (kzm) Enum.valueOf(kzm.class, str);
    }

    public static kzm[] values() {
        return (kzm[]) $VALUES.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
