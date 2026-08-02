package xsna;

import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.InstrumentValueType;
import java.util.function.Consumer;
import xsna.hjh0;

/* compiled from: SdkLongUpDownCounter.java */
/* loaded from: classes8.dex */
public class ckh0 extends te implements c600 {
    public final n3y0 b;

    /* compiled from: SdkLongUpDownCounter.java */
    public static class a implements d600 {
        public final l8x a;

        public a(dkh0 dkh0Var, String str) {
            this.a = new l8x(str, InstrumentType.UP_DOWN_COUNTER, InstrumentValueType.LONG, dkh0Var);
        }

        @Override // xsna.d600
        public c600 build() {
            return (c600) this.a.d(new bkh0(0));
        }

        @Override // xsna.d600
        public final rq70 buildWithCallback(Consumer<qq70> consumer) {
            return this.a.b(InstrumentType.OBSERVABLE_UP_DOWN_COUNTER, consumer);
        }

        @Override // xsna.d600
        public l7o ofDoubles() {
            l8x l8xVar = this.a;
            return new hjh0.a(l8xVar.b, l8xVar.a, l8xVar.f, l8xVar.g, l8xVar.e);
        }

        @Override // xsna.d600
        public final d600 setDescription(String str) {
            this.a.f = str;
            return this;
        }

        @Override // xsna.d600
        public final d600 setUnit(String str) {
            this.a.g = str;
            return this;
        }

        public final String toString() {
            return this.a.f(getClass().getSimpleName());
        }
    }

    public ckh0(ym5 ym5Var, n3y0 n3y0Var) {
        super(ym5Var);
        this.b = n3y0Var;
    }

    @Override // xsna.c600
    public final void add(long j, q94 q94Var, wmj wmjVar) {
        this.b.a(j, q94Var, wmjVar);
    }

    @Override // xsna.c600
    public final void add(long j, q94 q94Var) {
        add(j, q94Var, wmj.current());
    }
}
