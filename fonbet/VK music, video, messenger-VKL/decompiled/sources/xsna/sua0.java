package xsna;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: PlatformThreadLocalRandom.kt */
/* loaded from: classes8.dex */
public final class sua0 extends gg {
    @Override // kotlin.random.Random
    public final int l(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // kotlin.random.Random
    public final long n(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    @Override // kotlin.random.Random
    public final long o(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    @Override // xsna.gg
    public final Random p() {
        return ThreadLocalRandom.current();
    }
}
