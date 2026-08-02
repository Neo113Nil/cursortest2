package defpackage;

import java.util.Random;

/* loaded from: classes15.dex */
public final class cfu implements t1k0 {
    public final Random a = new Random();
    public final long b = 2000;

    @Override // defpackage.t1k0
    public final long a(int i) {
        long min = this.b * (1 << Math.min(3, i));
        return (Math.abs(this.a.nextLong()) % min) + min;
    }
}
