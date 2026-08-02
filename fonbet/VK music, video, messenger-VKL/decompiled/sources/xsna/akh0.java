package xsna;

import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.InstrumentValueType;
import java.util.logging.Level;
import java.util.logging.Logger;
import xsna.x41;

/* compiled from: SdkLongHistogram.java */
/* loaded from: classes8.dex */
public class akh0 extends te implements k300 {
    public static final Logger d = Logger.getLogger(akh0.class.getName());
    public final zro0 b;
    public final n3y0 c;

    /* compiled from: SdkLongHistogram.java */
    public static class a implements l300 {
        public final l8x a;

        public a(dkh0 dkh0Var, String str, String str2, String str3, x41.a aVar) {
            l8x l8xVar = new l8x(str, InstrumentType.HISTOGRAM, InstrumentValueType.LONG, dkh0Var);
            l8xVar.f = str2;
            l8xVar.g = str3;
            l8xVar.e = aVar;
            this.a = l8xVar;
        }

        @Override // xsna.l300
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public akh0 build() {
            return (akh0) this.a.d(new zjh0(0));
        }

        @Override // xsna.l300
        public final l300 setDescription(String str) {
            this.a.f = str;
            return this;
        }

        @Override // xsna.l300
        public final l300 setUnit(String str) {
            this.a.g = str;
            return this;
        }

        public final String toString() {
            return this.a.f(getClass().getSimpleName());
        }
    }

    public akh0(ym5 ym5Var, n3y0 n3y0Var) {
        super(ym5Var);
        this.b = new zro0(d);
        this.c = n3y0Var;
    }

    @Override // xsna.k300
    public final void record(long j, q94 q94Var, wmj wmjVar) {
        if (j >= 0) {
            this.c.a(j, q94Var, wmjVar);
            return;
        }
        this.b.a(Level.WARNING, i5s.a(new StringBuilder("Histograms can only record non-negative values. Instrument "), this.a.c, " has recorded a negative value."), null);
    }

    @Override // xsna.k300
    public final void record(long j, q94 q94Var) {
        record(j, q94Var, wmj.current());
    }
}
