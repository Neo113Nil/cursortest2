package xsna;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FirebaseExecutors.java */
/* loaded from: classes.dex */
public final class pir implements Executor {
    private static final /* synthetic */ pir[] $VALUES;
    public static final pir INSTANCE;

    static {
        pir pirVar = new pir("INSTANCE", 0);
        INSTANCE = pirVar;
        $VALUES = new pir[]{pirVar};
    }

    public pir() {
        throw null;
    }

    public static pir valueOf(String str) {
        return (pir) Enum.valueOf(pir.class, str);
    }

    public static pir[] values() {
        return (pir[]) $VALUES.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
