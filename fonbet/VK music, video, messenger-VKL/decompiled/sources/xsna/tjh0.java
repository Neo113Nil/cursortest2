package xsna;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import xsna.x9h0;

/* compiled from: SdkLoggerProvider.java */
/* loaded from: classes8.dex */
public final class tjh0 implements y100, Closeable {
    public static final Logger f = Logger.getLogger(tjh0.class.getName());
    public final a200 b;
    public final u9i<rjh0> c;
    public final boolean d;
    public final x9h0.b e;

    public tjh0(gag0 gag0Var, Supplier supplier, ArrayList arrayList, cvf cvfVar, x9h0.b bVar, vjh0 vjh0Var) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((o000) it.next());
        }
        o000 h540Var = arrayList2.isEmpty() ? v670.b : arrayList2.size() == 1 ? (o000) arrayList2.get(0) : new h540(new ArrayList(arrayList2));
        this.b = new a200(gag0Var, supplier, h540Var, cvfVar);
        this.c = new u9i<>(new Function() { // from class: xsna.sjh0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                tjh0.this.e.apply((q8x) obj);
                jn5 jn5Var = u100.a;
                return rjh0.b ? new jcq(jn5Var) : new rjh0(jn5Var);
            }
        });
        this.e = bVar;
        this.d = h540Var instanceof v670;
    }

    public static wjh0 o() {
        return new wjh0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        v7i v7iVar;
        if (this.b.f != null) {
            f.log(Level.INFO, "Calling shutdown() multiple times.");
            v7iVar = v7i.e;
        } else {
            a200 a200Var = this.b;
            synchronized (a200Var.a) {
                try {
                    if (a200Var.f != null) {
                        v7iVar = a200Var.f;
                    } else {
                        a200Var.f = a200Var.d.shutdown();
                        v7iVar = a200Var.f;
                    }
                } finally {
                }
            }
        }
        v7iVar.c(10L, TimeUnit.SECONDS);
    }

    @Override // xsna.y100
    public final h100 get() {
        return this.c.b("noop", null, null, jk3.e);
    }

    @Override // xsna.y100
    public final t100 n() {
        return this.d ? y100.m().n() : new hw3((u9i) this.c, "noop");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkLoggerProvider{clock=");
        a200 a200Var = this.b;
        sb.append(a200Var.e);
        sb.append(", resource=");
        sb.append(a200Var.b);
        sb.append(", logLimits=");
        sb.append(a200Var.c.get());
        sb.append(", logRecordProcessor=");
        sb.append(a200Var.d);
        sb.append(", loggerConfigurator=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
