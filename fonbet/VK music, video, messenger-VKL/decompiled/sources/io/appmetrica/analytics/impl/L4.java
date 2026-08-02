package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public final class L4 {
    public final Rb a;

    public L4() {
        this(C5342za.k().l());
    }

    public static Q4 a(J4 j4) {
        return new Q4(new O4(j4), j4);
    }

    public L4(Rb rb) {
        this.a = rb;
    }

    public final C5255vn a(J4 j4, Km km) {
        C5255vn c5255vn = new C5255vn(j4, new Sg(km));
        Rb rb = this.a;
        synchronized (rb) {
            rb.c.add(c5255vn);
        }
        return c5255vn;
    }
}
