package xsna;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import xsna.x9h0;

/* compiled from: SdkTracerProvider.java */
/* loaded from: classes8.dex */
public final class elh0 implements mep0, Closeable {
    public static final Logger e = Logger.getLogger(elh0.class.getName());
    public final nep0 b;
    public final u9i<alh0> c = new u9i<>(new Function() { // from class: xsna.dlh0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            q8x q8xVar = (q8x) obj;
            elh0 elh0Var = elh0.this;
            nep0 nep0Var = elh0Var.b;
            elh0Var.d.apply(q8xVar);
            do5 do5Var = zdp0.a;
            return alh0.e ? new pcq(nep0Var, q8xVar, do5Var) : new alh0(nep0Var, q8xVar, do5Var);
        }
    });
    public final x9h0.b d;

    public elh0(cvf cvfVar, hwe0 hwe0Var, gag0 gag0Var, Supplier supplier, n0h0 n0h0Var, ArrayList arrayList, x9h0.b bVar, oel oelVar, vjh0 vjh0Var) {
        this.b = new nep0(cvfVar, hwe0Var, gag0Var, supplier, n0h0Var, arrayList, oelVar, new clh0(vjh0Var));
        this.d = bVar;
    }

    public static glh0 m() {
        return new glh0();
    }

    @Override // xsna.mep0
    public final ydp0 b(String str) {
        if (str == null || str.isEmpty()) {
            e.fine("Tracer requested without instrumentation scope name.");
            str = "";
        }
        hap hapVar = new hap();
        hapVar.b = this.c;
        hapVar.c = str;
        return hapVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        v7i v7iVar;
        if (this.b.k != null) {
            e.log(Level.INFO, "Calling shutdown() multiple times.");
            v7iVar = v7i.e;
        } else {
            nep0 nep0Var = this.b;
            synchronized (nep0Var.a) {
                try {
                    if (nep0Var.k != null) {
                        v7iVar = nep0Var.k;
                    } else {
                        nep0Var.k = nep0Var.h.shutdown();
                        v7iVar = nep0Var.k;
                    }
                } finally {
                }
            }
        }
        v7iVar.c(10L, TimeUnit.SECONDS);
    }

    @Override // xsna.mep0
    public final wdp0 get(String str) {
        hap hapVar = (hap) b(str);
        return (wdp0) ((u9i) hapVar.b).b((String) hapVar.c, (String) hapVar.d, null, jk3.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkTracerProvider{clock=");
        nep0 nep0Var = this.b;
        sb.append(nep0Var.b);
        sb.append(", idGenerator=");
        sb.append(nep0Var.c);
        sb.append(", resource=");
        sb.append(nep0Var.e);
        sb.append(", spanLimitsSupplier=");
        sb.append(nep0Var.f.get());
        sb.append(", sampler=");
        sb.append(nep0Var.g);
        sb.append(", spanProcessor=");
        sb.append(nep0Var.h);
        sb.append(", tracerConfigurator=");
        sb.append(this.d);
        sb.append('}');
        return sb.toString();
    }

    @Override // xsna.mep0
    public final wdp0 get(String str, String str2) {
        hap hapVar = (hap) b(str);
        hapVar.d = str2;
        return (wdp0) ((u9i) hapVar.b).b((String) hapVar.c, str2, null, jk3.e);
    }
}
