package xsna;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import okhttp3.Interceptor;
import okhttp3.p;
import xsna.cmx0;

/* compiled from: WhitelistTracker.kt */
/* loaded from: classes.dex */
public final class dmx0 {
    public static volatile a b;
    public static volatile g840 d;
    public static final b e;
    public static final bpn0 f;
    public static final CopyOnWriteArraySet<amx0> g;
    public static final AtomicBoolean h;
    public static final AtomicBoolean i;
    public static final dmx0 a = new dmx0();
    public static final bpn0 c = new bpn0(new pb8(15));

    /* compiled from: WhitelistTracker.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public final dzc0 a;
        public final llc b;
        public final jmx0 c;

        public a(dzc0 dzc0Var, llc llcVar, jmx0 jmx0Var) {
            this.a = dzc0Var;
            this.b = llcVar;
            this.c = jmx0Var;
        }

        public final g840 a(izs<? super String, Result<s3q0>> izsVar, wzs<? super g840, ? super Long, s3q0> wzsVar, yzs<? super String, ? super Map<String, Boolean>, ? super Boolean, s3q0> yzsVar) {
            jmx0 jmx0Var = this.c;
            return new g840(jmx0Var.a, jmx0Var.e, jmx0Var.b, izsVar, wzsVar, yzsVar);
        }

        public final llc b() {
            return this.b;
        }

        public final shp0 c() {
            return this.a;
        }
    }

    /* compiled from: WhitelistTracker.kt */
    public static final class b implements Interceptor {
        public int a;

        @Override // okhttp3.Interceptor
        public final okhttp3.u intercept(Interceptor.a aVar) {
            if (this.a > 0) {
                int f = aVar.f();
                int i = this.a;
                if (f != i) {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    return aVar.c(i).a(aVar.request());
                }
            }
            return aVar.a(aVar.request());
        }
    }

    static {
        b bVar = new b();
        bVar.a = -1;
        e = bVar;
        f = new bpn0(new qb8(16));
        g = new CopyOnWriteArraySet<>();
        h = new AtomicBoolean(false);
        i = new AtomicBoolean(false);
    }

    public static final Object a(dmx0 dmx0Var, String str) {
        dmx0Var.getClass();
        try {
            okhttp3.o oVar = (okhttp3.o) f.getValue();
            p.a aVar = new p.a();
            aVar.i(str);
            aVar.f("HEAD", null);
            okhttp3.u execute = ((f8f0) oVar.a(aVar.b())).execute();
            try {
                s3q0 s3q0Var = s3q0.a;
                execute.close();
                return s3q0.a;
            } finally {
            }
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    public static final void b(dmx0 dmx0Var, Map map, boolean z) {
        dmx0Var.getClass();
        a aVar = b;
        if (aVar == null) {
            aVar = null;
        }
        if (aVar.b().b()) {
            return;
        }
        d(z ? new cmx0.a(map) : new cmx0.b(map));
    }

    public static final boolean c() {
        cmx0 a2;
        if (i.get()) {
            a aVar = b;
            if (aVar == null) {
                aVar = null;
            }
            a2 = ((dzc0) aVar.c()).a();
        } else {
            a2 = cmx0.d.a;
        }
        return a2 instanceof cmx0.b;
    }

    public static void d(cmx0 cmx0Var) {
        a aVar = b;
        if (aVar == null) {
            aVar = null;
        }
        if (((dzc0) aVar.c()).b(cmx0Var)) {
            Objects.toString(cmx0Var);
            Iterator<amx0> it = g.iterator();
            while (it.hasNext()) {
                it.next().a(cmx0Var);
            }
        }
    }
}
