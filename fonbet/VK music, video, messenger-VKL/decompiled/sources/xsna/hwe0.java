package xsna;

import java.util.Random;
import java.util.function.Supplier;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RandomIdGenerator.java */
/* loaded from: classes8.dex */
public final class hwe0 implements hsv {
    private static final /* synthetic */ hwe0[] $VALUES;
    public static final hwe0 INSTANCE;
    private static final long INVALID_ID = 0;
    private static final Supplier<Random> randomSupplier;

    static {
        hwe0 hwe0Var = new hwe0("INSTANCE", 0);
        INSTANCE = hwe0Var;
        $VALUES = new hwe0[]{hwe0Var};
        randomSupplier = jwe0.a();
    }

    public hwe0() {
        throw null;
    }

    public static hwe0 valueOf(String str) {
        return (hwe0) Enum.valueOf(hwe0.class, str);
    }

    public static hwe0[] values() {
        return (hwe0[]) $VALUES.clone();
    }

    public final String h() {
        long nextLong;
        Random random = randomSupplier.get();
        do {
            nextLong = random.nextLong();
        } while (nextLong == 0);
        if (nextLong == 0) {
            return "0000000000000000";
        }
        char[] a = s9o0.a(16);
        oz80.c(nextLong, a, 0);
        return new String(a, 0, 16);
    }

    public final String i() {
        long nextLong;
        Random random = randomSupplier.get();
        long nextLong2 = random.nextLong();
        do {
            nextLong = random.nextLong();
        } while (nextLong == 0);
        if (nextLong2 == 0 && nextLong == 0) {
            return "00000000000000000000000000000000";
        }
        char[] a = s9o0.a(32);
        oz80.c(nextLong2, a, 0);
        oz80.c(nextLong, a, 16);
        return new String(a, 0, 32);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "RandomIdGenerator{}";
    }
}
