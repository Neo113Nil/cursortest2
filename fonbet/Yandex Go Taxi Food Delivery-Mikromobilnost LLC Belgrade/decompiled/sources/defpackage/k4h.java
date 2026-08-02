package defpackage;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class k4h implements au1 {
    public int c;
    public int d;
    public final boolean a = true;
    public final int b = 65536;
    public int e = 0;
    public zt1[] f = new zt1[100];

    public final synchronized int a() {
        return this.d * this.b;
    }

    public final synchronized void b(int i) {
        boolean z = i < this.c;
        this.c = i;
        if (z) {
            c();
        }
    }

    public final synchronized void c() {
        int max = Math.max(0, tw21.f(this.c, this.b) - this.d);
        int i = this.e;
        if (max >= i) {
            return;
        }
        Arrays.fill(this.f, max, i, (Object) null);
        this.e = max;
    }
}
