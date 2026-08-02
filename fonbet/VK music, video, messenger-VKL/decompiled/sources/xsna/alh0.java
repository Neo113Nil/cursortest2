package xsna;

/* compiled from: SdkTracer.java */
/* loaded from: classes8.dex */
public class alh0 implements wdp0 {
    public static final wdp0 d = epl.b.get("noop");
    public static final boolean e;
    public final nep0 a;
    public final q8x b;
    public volatile boolean c;

    static {
        boolean z;
        try {
            Class.forName("io.opentelemetry.api.incubator.trace.ExtendedDefaultTracerProvider");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        e = z;
    }

    public alh0(nep0 nep0Var, q8x q8xVar, zdp0 zdp0Var) {
        this.a = nep0Var;
        this.b = q8xVar;
        this.c = zdp0Var.a();
    }

    @Override // xsna.wdp0
    public phk0 a(String str) {
        if (!this.c) {
            return d.a(str);
        }
        if (str == null || str.trim().isEmpty()) {
            str = "<unspecified span name>";
        }
        if (this.a.k != null) {
            return d.a(str);
        }
        if (e) {
            q8x q8xVar = this.b;
            nep0 nep0Var = this.a;
            return new ocq(str, q8xVar, nep0Var, nep0Var.f.get());
        }
        q8x q8xVar2 = this.b;
        nep0 nep0Var2 = this.a;
        return new tkh0(str, q8xVar2, nep0Var2, nep0Var2.f.get());
    }
}
