package xsna;

import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.InstrumentValueType;
import java.util.function.Consumer;
import xsna.x41;

/* compiled from: SdkDoubleUpDownCounter.java */
/* loaded from: classes8.dex */
public class hjh0 extends te implements k7o {
    public final n3y0 b;

    /* compiled from: SdkDoubleUpDownCounter.java */
    public static class a implements l7o {
        public final l8x a;

        public a(dkh0 dkh0Var, String str, String str2, String str3, x41.a aVar) {
            l8x l8xVar = new l8x(str, InstrumentType.UP_DOWN_COUNTER, InstrumentValueType.DOUBLE, dkh0Var);
            l8xVar.f = str2;
            l8xVar.g = str3;
            l8xVar.e = aVar;
            this.a = l8xVar;
        }

        @Override // xsna.l7o
        public k7o build() {
            return (k7o) this.a.d(new l4(28));
        }

        @Override // xsna.l7o
        public final mq70 buildWithCallback(Consumer<lq70> consumer) {
            return this.a.a(InstrumentType.OBSERVABLE_UP_DOWN_COUNTER, consumer);
        }

        @Override // xsna.l7o
        public final l7o setDescription(String str) {
            this.a.f = str;
            return this;
        }

        @Override // xsna.l7o
        public final l7o setUnit(String str) {
            this.a.g = str;
            return this;
        }

        public final String toString() {
            return this.a.f(getClass().getSimpleName());
        }
    }

    public hjh0(ym5 ym5Var, n3y0 n3y0Var) {
        super(ym5Var);
        this.b = n3y0Var;
    }

    @Override // xsna.k7o
    public final void add(double d, q94 q94Var, wmj wmjVar) {
        this.b.c(d, q94Var, wmjVar);
    }

    @Override // xsna.k7o
    public final void add(double d, q94 q94Var) {
        add(d, q94Var, wmj.current());
    }
}
