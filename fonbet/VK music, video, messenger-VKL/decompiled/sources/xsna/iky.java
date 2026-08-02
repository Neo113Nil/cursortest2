package xsna;

import java.util.Random;

/* compiled from: PlatformRandom.kt */
/* loaded from: classes8.dex */
public final class iky extends Random {
    private static final long serialVersionUID = 0;
    private final kotlin.random.Random impl;
    private boolean seedInitialized;

    public iky(kotlin.random.Random random) {
        this.impl = random;
    }

    @Override // java.util.Random
    public final int next(int i) {
        return this.impl.a(i);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return this.impl.d();
    }

    @Override // java.util.Random
    public final void nextBytes(byte[] bArr) {
        this.impl.e(bArr);
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return this.impl.g();
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return this.impl.i();
    }

    @Override // java.util.Random
    public final int nextInt() {
        return this.impl.j();
    }

    @Override // java.util.Random
    public final long nextLong() {
        return this.impl.m();
    }

    @Override // java.util.Random
    public final void setSeed(long j) {
        if (this.seedInitialized) {
            throw new UnsupportedOperationException("Setting seed is not supported.");
        }
        this.seedInitialized = true;
    }

    @Override // java.util.Random
    public final int nextInt(int i) {
        return this.impl.k(i);
    }
}
