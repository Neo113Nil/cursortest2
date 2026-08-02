package defpackage;

import java.util.Random;

/* loaded from: classes15.dex */
public final class hfy implements t1k0 {
    public final Random a = new Random();
    public final long b = 2000;
    public final long c = 2000 * 2;

    @Override // defpackage.t1k0
    public final long a(int i) {
        return (this.b * (1 << Math.min(3, i))) + (Math.abs(this.a.nextLong()) % this.c);
    }
}
