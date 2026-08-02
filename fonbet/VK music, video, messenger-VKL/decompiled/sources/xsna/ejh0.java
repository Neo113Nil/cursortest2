package xsna;

import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.InstrumentValueType;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.x41;

/* compiled from: SdkDoubleCounter.java */
/* loaded from: classes8.dex */
public class ejh0 extends te implements h6o {
    public static final Logger d = Logger.getLogger(ejh0.class.getName());
    public final zro0 b;
    public final n3y0 c;

    /* compiled from: SdkDoubleCounter.java */
    public static class a implements i6o {
        public final l8x a;

        public a(dkh0 dkh0Var, String str, String str2, String str3, x41.a aVar) {
            l8x l8xVar = new l8x(str, InstrumentType.COUNTER, InstrumentValueType.DOUBLE, dkh0Var);
            l8xVar.g = str3;
            l8xVar.f = str2;
            l8xVar.e = aVar;
            this.a = l8xVar;
        }

        @Override // xsna.i6o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ejh0 build() {
            return (ejh0) this.a.d(new lq(27));
        }

        @Override // xsna.i6o
        public final jq70 buildWithCallback(Consumer<lq70> consumer) {
            return this.a.a(InstrumentType.OBSERVABLE_COUNTER, consumer);
        }

        @Override // xsna.i6o
        public final i6o setDescription(String str) {
            this.a.f = str;
            return this;
        }

        @Override // xsna.i6o
        public final i6o setUnit(String str) {
            this.a.g = str;
            return this;
        }

        public final String toString() {
            return this.a.f(getClass().getSimpleName());
        }
    }

    public ejh0(ym5 ym5Var, n3y0 n3y0Var) {
        super(ym5Var);
        this.b = new zro0(d);
        this.c = n3y0Var;
    }

    @Override // xsna.h6o
    public final void add(double d2, q94 q94Var, wmj wmjVar) {
        if (d2 >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            this.c.c(d2, q94Var, wmjVar);
            return;
        }
        this.b.a(Level.WARNING, i5s.a(new StringBuilder("Counters can only increase. Instrument "), this.a.c, " has recorded a negative value."), null);
    }

    @Override // xsna.h6o
    public final void add(double d2, q94 q94Var) {
        add(d2, q94Var, wmj.current());
    }
}
