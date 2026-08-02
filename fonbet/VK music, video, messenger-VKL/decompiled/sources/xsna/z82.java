package xsna;

import java.util.Random;
import java.util.function.Supplier;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AndroidFriendlyRandomHolder.java */
/* loaded from: classes8.dex */
public final class z82 implements Supplier<Random> {
    private static final /* synthetic */ z82[] $VALUES;
    public static final z82 INSTANCE;
    private static final Random random;

    static {
        z82 z82Var = new z82("INSTANCE", 0);
        INSTANCE = z82Var;
        $VALUES = new z82[]{z82Var};
        random = new Random();
    }

    public z82() {
        throw null;
    }

    public static z82 valueOf(String str) {
        return (z82) Enum.valueOf(z82.class, str);
    }

    public static z82[] values() {
        return (z82[]) $VALUES.clone();
    }

    @Override // java.util.function.Supplier
    public final Random get() {
        return random;
    }
}
