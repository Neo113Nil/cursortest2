package xsna;

import io.opentelemetry.api.incubator.metrics.ExtendedDoubleUpDownCounterBuilder;
import io.opentelemetry.api.incubator.metrics.ExtendedLongUpDownCounter;
import io.opentelemetry.api.incubator.metrics.ExtendedLongUpDownCounterBuilder;
import xsna.ckh0;
import xsna.icq;

/* compiled from: ExtendedSdkLongUpDownCounter.java */
/* loaded from: classes8.dex */
public final class ncq extends ckh0 implements ExtendedLongUpDownCounter {

    /* compiled from: ExtendedSdkLongUpDownCounter.java */
    public static final class a extends ckh0.a implements ExtendedLongUpDownCounterBuilder {
        @Override // xsna.ckh0.a, xsna.d600
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ExtendedLongUpDownCounter build() {
            return this.a.d(new kr(19));
        }

        @Override // xsna.ckh0.a, xsna.d600
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ExtendedDoubleUpDownCounterBuilder ofDoubles() {
            l8x l8xVar = this.a;
            return new icq.a(l8xVar.b, l8xVar.a, l8xVar.f, l8xVar.g, l8xVar.e);
        }
    }
}
