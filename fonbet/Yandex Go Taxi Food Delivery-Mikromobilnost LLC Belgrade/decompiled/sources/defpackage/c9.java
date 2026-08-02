package defpackage;

import kotlin.random.Random;

/* loaded from: classes9.dex */
public abstract class c9 extends Random {
    @Override // kotlin.random.Random
    public final int a(int i) {
        return gga1.l(j().nextInt(), i);
    }

    @Override // kotlin.random.Random
    public final int b() {
        return j().nextInt();
    }

    @Override // kotlin.random.Random
    public final int c(int i) {
        return j().nextInt(i);
    }

    @Override // kotlin.random.Random
    public final long g() {
        return j().nextLong();
    }

    public abstract java.util.Random j();

    public final float k() {
        return j().nextFloat();
    }
}
