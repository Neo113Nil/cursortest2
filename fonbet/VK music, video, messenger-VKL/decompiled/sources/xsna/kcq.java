package xsna;

import io.opentelemetry.api.incubator.metrics.ExtendedDoubleCounterBuilder;
import io.opentelemetry.api.incubator.metrics.ExtendedLongCounter;
import io.opentelemetry.api.incubator.metrics.ExtendedLongCounterBuilder;
import xsna.fcq;
import xsna.xjh0;

/* compiled from: ExtendedSdkLongCounter.java */
/* loaded from: classes8.dex */
public final class kcq extends xjh0 implements ExtendedLongCounter {

    /* compiled from: ExtendedSdkLongCounter.java */
    public static final class a extends xjh0.a implements ExtendedLongCounterBuilder {
        @Override // xsna.xjh0.a
        /* renamed from: a */
        public final xjh0 build() {
            return (kcq) this.a.d(new ir(18));
        }

        @Override // xsna.xjh0.a, xsna.f300
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ExtendedDoubleCounterBuilder ofDoubles() {
            l8x l8xVar = this.a;
            return new fcq.a(l8xVar.b, l8xVar.a, l8xVar.f, l8xVar.g, l8xVar.e);
        }

        @Override // xsna.xjh0.a, xsna.f300
        public final e300 build() {
            return (kcq) this.a.d(new ir(18));
        }
    }
}
