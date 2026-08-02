package xsna;

import kotlin.random.Random;

/* compiled from: PlatformRandom.kt */
/* loaded from: classes11.dex */
public abstract class gg extends Random {
    @Override // kotlin.random.Random
    public final int a(int i) {
        return ((-i) >> 31) & (p().nextInt() >>> (32 - i));
    }

    @Override // kotlin.random.Random
    public final boolean d() {
        return p().nextBoolean();
    }

    @Override // kotlin.random.Random
    public final void e(byte[] bArr) {
        p().nextBytes(bArr);
    }

    @Override // kotlin.random.Random
    public final double g() {
        return p().nextDouble();
    }

    @Override // kotlin.random.Random
    public final float i() {
        return p().nextFloat();
    }

    @Override // kotlin.random.Random
    public final int j() {
        return p().nextInt();
    }

    @Override // kotlin.random.Random
    public final int k(int i) {
        return p().nextInt(i);
    }

    @Override // kotlin.random.Random
    public final long m() {
        return p().nextLong();
    }

    public abstract java.util.Random p();
}
