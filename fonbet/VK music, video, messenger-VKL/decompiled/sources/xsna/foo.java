package xsna;

import xsna.jkp0;

/* compiled from: DurationProgressNotifier.kt */
/* loaded from: classes3.dex */
public final class foo {
    public final long a;
    public final k3e0 b;

    public foo(jkp0 jkp0Var, long j) {
        jkp0.a aVar = jkp0Var.a;
        this.a = j;
        k3e0 k3e0Var = new k3e0(aVar);
        this.b = k3e0Var;
        if (j <= 0) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "Wrong duration=").toString());
        }
        k3e0Var.a(0, Long.MIN_VALUE);
    }
}
