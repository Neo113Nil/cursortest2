package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes9.dex */
public final class jwc0 extends c9 {
    @Override // kotlin.random.Random
    public final int f(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // kotlin.random.Random
    public final long h(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    @Override // kotlin.random.Random
    public final long i(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    @Override // defpackage.c9
    public final Random j() {
        return ThreadLocalRandom.current();
    }
}
