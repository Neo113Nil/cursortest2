package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class ept0 implements Iterable, xfx {
    public final int a;
    public final int b;

    public ept0(int i) {
        int min = (int) Math.min(i, 6.0d);
        this.a = min;
        int i2 = 6 / min;
        this.b = 6 % min != 0 ? i2 + 1 : i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new dpt0(this);
    }
}
