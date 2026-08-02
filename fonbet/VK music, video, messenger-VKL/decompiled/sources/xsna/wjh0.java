package xsna;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Supplier;
import xsna.x9h0;

/* compiled from: SdkLoggerProviderBuilder.java */
/* loaded from: classes8.dex */
public final class wjh0 {
    public final ArrayList a = new ArrayList();
    public gag0 b = gag0.a;
    public Supplier<l000> c = new ujh0();
    public cvf d = gcd0.d;
    public final x9h0<u100> e;
    public final vjh0 f;

    public wjh0() {
        jn5 jn5Var = u100.a;
        this.e = new x9h0<>();
        xfx xfxVar = n1q.a;
        new oel(Boolean.parseBoolean(zxi.a("otel.experimental.sdk.jvm_stacktrace")));
        this.f = new vjh0();
    }

    public final void a(o000 o000Var) {
        Objects.requireNonNull(o000Var, "processor");
        this.a.add(o000Var);
    }

    public final tjh0 b() {
        return new tjh0(this.b, this.c, this.a, this.d, new x9h0.b(this.e.a), this.f);
    }

    public final void c(cvf cvfVar) {
        Objects.requireNonNull(cvfVar, "clock");
        this.d = cvfVar;
    }

    public final void d(kep0 kep0Var) {
        this.c = kep0Var;
    }

    public final void e(gag0 gag0Var) {
        Objects.requireNonNull(gag0Var, "resource");
        this.b = gag0Var;
    }
}
