package xsna;

import io.opentelemetry.api.incubator.metrics.ExtendedDoubleHistogram;
import io.opentelemetry.api.incubator.metrics.ExtendedDoubleHistogramBuilder;
import io.opentelemetry.api.incubator.metrics.ExtendedLongHistogramBuilder;
import xsna.gjh0;
import xsna.mcq;

/* compiled from: ExtendedSdkDoubleHistogram.java */
/* loaded from: classes8.dex */
public final class hcq extends gjh0 implements ExtendedDoubleHistogram {

    /* compiled from: ExtendedSdkDoubleHistogram.java */
    public static final class a extends gjh0.a implements ExtendedDoubleHistogramBuilder {
        @Override // xsna.gjh0.a
        /* renamed from: a */
        public final gjh0 build() {
            return (hcq) this.a.d(new en(19));
        }

        @Override // xsna.gjh0.a, xsna.q6o
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ExtendedLongHistogramBuilder ofLongs() {
            l8x l8xVar = this.a;
            return new mcq.a(l8xVar.b, l8xVar.a, l8xVar.f, l8xVar.g, l8xVar.e);
        }

        @Override // xsna.gjh0.a, xsna.q6o
        public final p6o build() {
            return (hcq) this.a.d(new en(19));
        }
    }
}
