package kotlin.random;

import java.io.InvalidObjectException;
import java.io.Serializable;

/* compiled from: XorWowRandom.kt */
/* loaded from: classes11.dex */
public final class XorWowRandom extends Random implements Serializable {
    private static final long serialVersionUID = 0;
    private int addend;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public XorWowRandom(int i, int i2) {
        int i3 = ~i;
        int i4 = (i << 10) ^ (i2 >>> 4);
        this.x = i;
        this.y = i2;
        this.z = 0;
        this.w = 0;
        this.v = i3;
        this.addend = i4;
        p();
        for (int i5 = 0; i5 < 64; i5++) {
            j();
        }
    }

    private final Object readResolve() {
        try {
            p();
            return this;
        } catch (Throwable th) {
            throw new InvalidObjectException(th.getMessage()).initCause(th);
        }
    }

    @Override // kotlin.random.Random
    public final int a(int i) {
        return ((-i) >> 31) & (j() >>> (32 - i));
    }

    @Override // kotlin.random.Random
    public final int j() {
        int i = this.x;
        int i2 = i ^ (i >>> 2);
        this.x = this.y;
        this.y = this.z;
        this.z = this.w;
        int i3 = this.v;
        this.w = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.v = i4;
        int i5 = this.addend + 362437;
        this.addend = i5;
        return i4 + i5;
    }

    public final void p() {
        if ((this.x | this.y | this.z | this.w | this.v) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
    }
}
