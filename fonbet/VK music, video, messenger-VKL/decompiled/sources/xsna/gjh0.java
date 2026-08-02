package xsna;

import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.InstrumentValueType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.akh0;
import xsna.nk5;
import xsna.x41;

/* compiled from: SdkDoubleHistogram.java */
/* loaded from: classes8.dex */
public class gjh0 extends te implements p6o {
    public static final Logger d = Logger.getLogger(gjh0.class.getName());
    public final zro0 b;
    public final n3y0 c;

    /* compiled from: SdkDoubleHistogram.java */
    public static class a implements q6o {
        public final l8x a;

        public a(dkh0 dkh0Var, String str) {
            this.a = new l8x(str, InstrumentType.HISTOGRAM, InstrumentValueType.DOUBLE, dkh0Var);
        }

        @Override // xsna.q6o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public gjh0 build() {
            return (gjh0) this.a.d(new mq(27));
        }

        @Override // xsna.q6o
        public l300 ofLongs() {
            l8x l8xVar = this.a;
            return new akh0.a(l8xVar.b, l8xVar.a, l8xVar.f, l8xVar.g, l8xVar.e);
        }

        @Override // xsna.q6o
        public final q6o setDescription(String str) {
            this.a.f = str;
            return this;
        }

        @Override // xsna.q6o
        public final q6o setExplicitBucketBoundariesAdvice(List<Double> list) {
            List list2 = Collections.EMPTY_LIST;
            try {
                Objects.requireNonNull(list2, "bucketBoundaries must not be null");
                u9q.b(list2);
                x41.a aVar = this.a.e;
                aVar.getClass();
                ((nk5.a) aVar).a = Collections.unmodifiableList(new ArrayList(list2));
                return this;
            } catch (IllegalArgumentException | NullPointerException e) {
                gjh0.d.warning("Error setting explicit bucket boundaries advice: " + e.getMessage());
                return this;
            }
        }

        @Override // xsna.q6o
        public final q6o setUnit(String str) {
            this.a.g = str;
            return this;
        }

        public final String toString() {
            return this.a.f(getClass().getSimpleName());
        }
    }

    public gjh0(ym5 ym5Var, n3y0 n3y0Var) {
        super(ym5Var);
        this.b = new zro0(d);
        this.c = n3y0Var;
    }

    @Override // xsna.p6o
    public final void record(double d2, q94 q94Var, wmj wmjVar) {
        if (d2 >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            this.c.c(d2, q94Var, wmjVar);
            return;
        }
        this.b.a(Level.WARNING, i5s.a(new StringBuilder("Histograms can only record non-negative values. Instrument "), this.a.c, " has recorded a negative value."), null);
    }

    @Override // xsna.p6o
    public final void record(double d2, q94 q94Var) {
        record(d2, q94Var, wmj.current());
    }
}
