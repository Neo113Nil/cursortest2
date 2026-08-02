package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: SdkObservableMeasurement.java */
/* loaded from: classes8.dex */
public final class jkh0 implements qq70, lq70 {
    public static final Logger e = Logger.getLogger(jkh0.class.getName());
    public final zro0 a = new zro0(e);
    public final ym5 b;
    public final ArrayList c;
    public volatile lqf0 d;

    public jkh0(q8x q8xVar, ym5 ym5Var, ArrayList arrayList) {
        this.b = ym5Var;
        this.c = arrayList;
    }

    public final void a() {
        this.a.a(Level.FINE, i5s.a(new StringBuilder("Measurement recorded for instrument "), this.b.c, " outside callback registered to instrument. Dropping measurement."), null);
    }

    @Override // xsna.qq70
    public final void record(long j, q94 q94Var) {
        lqf0 lqf0Var = this.d;
        if (lqf0Var == null) {
            a();
            return;
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            m04 m04Var = (m04) it.next();
            if (m04Var.c.equals(lqf0Var)) {
                q94 a = m04Var.a(q94Var);
                ((sb1) m04Var.j.computeIfAbsent(a, m04Var.n)).g(j, a, wmj.current());
            }
        }
    }

    @Override // xsna.lq70
    public final void record(double d, q94 q94Var) {
        lqf0 lqf0Var = this.d;
        if (lqf0Var == null) {
            a();
            return;
        }
        if (Double.isNaN(d)) {
            e.log(Level.FINE, "Instrument " + this.b.c + " has recorded measurement Not-a-Number (NaN) value with attributes " + q94Var + ". Dropping measurement.");
            return;
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            m04 m04Var = (m04) it.next();
            if (m04Var.c.equals(lqf0Var)) {
                q94 a = m04Var.a(q94Var);
                ((sb1) m04Var.j.computeIfAbsent(a, m04Var.n)).f(d, a, wmj.current());
            }
        }
    }
}
