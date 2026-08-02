package xsna;

import xsna.jkp0;

/* compiled from: SizeProgressNotifier.kt */
/* loaded from: classes3.dex */
public final class vxj0 {
    public final long a;
    public final k3e0 b;

    public vxj0(jkp0 jkp0Var, long j) {
        jkp0.a aVar = jkp0Var.a;
        this.a = j;
        k3e0 k3e0Var = new k3e0(aVar);
        this.b = k3e0Var;
        if (j < 0) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "Wrong size=").toString());
        }
        k3e0Var.a(0, 0L);
    }
}
