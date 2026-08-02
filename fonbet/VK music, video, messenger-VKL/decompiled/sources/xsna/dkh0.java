package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import xsna.ckh0;
import xsna.gjh0;
import xsna.hcq;
import xsna.kcq;
import xsna.ncq;
import xsna.xjh0;

/* compiled from: SdkMeter.java */
/* loaded from: classes8.dex */
public final class dkh0 implements yi20 {
    public static final Logger h = Logger.getLogger(dkh0.class.getName());
    public static final boolean i;
    public static final Pattern j;
    public static final yi20 k;
    public final Object a = new Object();
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();
    public final dj20 d;
    public final q8x e;
    public final Map<lqf0, gl20> f;
    public volatile boolean g;

    /* compiled from: SdkMeter.java */
    public static class a implements n3y0 {
        public final ArrayList b;

        public a(ArrayList arrayList) {
            this.b = arrayList;
        }

        @Override // xsna.n3y0
        public final void a(long j, q94 q94Var, wmj wmjVar) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((n3y0) it.next()).a(j, q94Var, wmjVar);
            }
        }

        @Override // xsna.n3y0
        public final void c(double d, q94 q94Var, wmj wmjVar) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((n3y0) it.next()).c(d, q94Var, wmjVar);
            }
        }
    }

    static {
        boolean z;
        try {
            Class.forName("io.opentelemetry.api.incubator.metrics.ExtendedDefaultMeterProvider");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        i = z;
        j = Pattern.compile("([A-Za-z]){1}([A-Za-z0-9\\_\\-\\./]){0,254}");
        k = sil.b.get("noop");
    }

    public dkh0(ln5 ln5Var, q8x q8xVar, List list, bj20 bj20Var) {
        this.e = q8xVar;
        this.d = ln5Var;
        this.f = (Map) list.stream().collect(Collectors.toMap(Function.identity(), new pqk(1)));
        this.g = bj20Var.a();
    }

    public static boolean a(String str) {
        if (j.matcher(str).matches()) {
            return true;
        }
        Level level = Level.WARNING;
        Logger logger = h;
        if (!logger.isLoggable(level)) {
            return false;
        }
        logger.log(level, zr.a("Instrument name \"", str, "\" is invalid, returning noop instrument. Instrument names must consist of 255 or fewer characters including alphanumeric, _, ., -, /, and start with a letter."), (Throwable) new AssertionError());
        return false;
    }

    public final void b(tb9 tb9Var) {
        synchronized (this.b) {
            this.c.add(tb9Var);
        }
    }

    @Override // xsna.yi20
    public final f300 counterBuilder(String str) {
        return !a(str) ? k.counterBuilder("noop") : i ? new kcq.a(this, str) : new xjh0.a(this, str);
    }

    @Override // xsna.yi20
    public final o6o gaugeBuilder(String str) {
        return !a(str) ? k.gaugeBuilder("noop") : i ? new gcq(this, str) : new fjh0(this, str);
    }

    @Override // xsna.yi20
    public final q6o histogramBuilder(String str) {
        return !a(str) ? k.histogramBuilder("noop") : i ? new hcq.a(this, str) : new gjh0.a(this, str);
    }

    public final String toString() {
        return "SdkMeter{instrumentationScopeInfo=" + this.e + "}";
    }

    @Override // xsna.yi20
    public final d600 upDownCounterBuilder(String str) {
        return !a(str) ? k.upDownCounterBuilder("noop") : i ? new ncq.a(this, str) : new ckh0.a(this, str);
    }
}
