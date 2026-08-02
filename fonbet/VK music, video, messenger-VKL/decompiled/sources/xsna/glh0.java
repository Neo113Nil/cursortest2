package xsna;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Supplier;
import xsna.x9h0;

/* compiled from: SdkTracerProviderBuilder.java */
/* loaded from: classes8.dex */
public final class glh0 {
    public static final ji90 j = new ji90(uv1.INSTANCE);
    public final ArrayList a = new ArrayList();
    public cvf b = gcd0.d;
    public final hwe0 c = hwe0.INSTANCE;
    public gag0 d = gag0.a;
    public Supplier<zhk0> e = new flh0();
    public n0h0 f = j;
    public final x9h0<zdp0> g;
    public final oel h;
    public final vjh0 i;

    public glh0() {
        do5 do5Var = zdp0.a;
        this.g = new x9h0<>();
        xfx xfxVar = n1q.a;
        this.h = new oel(Boolean.parseBoolean(zxi.a("otel.experimental.sdk.jvm_stacktrace")));
        this.i = new vjh0();
    }

    public final void a(fik0 fik0Var) {
        Objects.requireNonNull(fik0Var, "spanProcessor");
        this.a.add(fik0Var);
    }

    public final elh0 b() {
        return new elh0(this.b, this.c, this.d, this.e, this.f, this.a, new x9h0.b(this.g.a), this.h, this.i);
    }

    public final void c(cvf cvfVar) {
        Objects.requireNonNull(cvfVar, "clock");
        this.b = cvfVar;
    }

    public final void d(gag0 gag0Var) {
        Objects.requireNonNull(gag0Var, "resource");
        this.d = gag0Var;
    }

    public final void e(ji90 ji90Var) {
        this.f = ji90Var;
    }

    public final void f(jep0 jep0Var) {
        this.e = jep0Var;
    }
}
