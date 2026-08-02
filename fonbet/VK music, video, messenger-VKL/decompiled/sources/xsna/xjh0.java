package xsna;

import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.InstrumentValueType;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import xsna.ejh0;

/* compiled from: SdkLongCounter.java */
/* loaded from: classes8.dex */
public class xjh0 extends te implements e300 {
    public static final Logger d = Logger.getLogger(xjh0.class.getName());
    public final zro0 b;
    public final n3y0 c;

    /* compiled from: SdkLongCounter.java */
    public static class a implements f300 {
        public final l8x a;

        public a(dkh0 dkh0Var, String str) {
            this.a = new l8x(str, InstrumentType.COUNTER, InstrumentValueType.LONG, dkh0Var);
        }

        @Override // xsna.f300
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public xjh0 build() {
            return (xjh0) this.a.d(new vq(28));
        }

        @Override // xsna.f300
        public final oq70 buildWithCallback(Consumer<qq70> consumer) {
            return this.a.b(InstrumentType.OBSERVABLE_COUNTER, consumer);
        }

        @Override // xsna.f300
        public i6o ofDoubles() {
            l8x l8xVar = this.a;
            return new ejh0.a(l8xVar.b, l8xVar.a, l8xVar.f, l8xVar.g, l8xVar.e);
        }

        @Override // xsna.f300
        public final f300 setDescription(String str) {
            this.a.f = str;
            return this;
        }

        @Override // xsna.f300
        public final f300 setUnit(String str) {
            this.a.g = str;
            return this;
        }

        public final String toString() {
            return this.a.f(getClass().getSimpleName());
        }
    }

    public xjh0(ym5 ym5Var, n3y0 n3y0Var) {
        super(ym5Var);
        this.b = new zro0(d);
        this.c = n3y0Var;
    }

    @Override // xsna.e300
    public final void add(long j, q94 q94Var, wmj wmjVar) {
        if (j >= 0) {
            this.c.a(j, q94Var, wmjVar);
            return;
        }
        this.b.a(Level.WARNING, i5s.a(new StringBuilder("Counters can only increase. Instrument "), this.a.c, " has recorded a negative value."), null);
    }

    @Override // xsna.e300
    public final void add(long j, q94 q94Var) {
        add(j, q94Var, wmj.current());
    }
}
