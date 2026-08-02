package xsna;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Objects;
import xsna.x9h0;

/* compiled from: SdkMeterProviderBuilder.java */
/* loaded from: classes8.dex */
public final class gkh0 {
    public cvf a = gcd0.d;
    public gag0 b = gag0.a;
    public final IdentityHashMap<dl20, fu9> c = new IdentityHashMap<>();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final edi f = edi.f;
    public final x9h0<bj20> g;

    public gkh0() {
        kn5 kn5Var = bj20.a;
        this.g = new x9h0<>();
    }

    public final fkh0 a() {
        return new fkh0(this.e, this.c, this.d, this.a, this.b, this.f, new x9h0.b(this.g.a));
    }

    public final void b(mx90 mx90Var) {
        this.c.put(mx90Var, new eu9());
    }

    public final void c(cvf cvfVar) {
        Objects.requireNonNull(cvfVar, "clock");
        this.a = cvfVar;
    }

    public final void d(gag0 gag0Var) {
        Objects.requireNonNull(gag0Var, "resource");
        this.b = gag0Var;
    }
}
