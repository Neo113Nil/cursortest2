package xsna;

import io.opentelemetry.api.incubator.metrics.ExtendedDoubleGaugeBuilder;
import io.opentelemetry.api.incubator.metrics.ExtendedLongGaugeBuilder;

/* compiled from: ExtendedSdkDoubleGauge.java */
/* loaded from: classes8.dex */
public final class gcq extends fjh0 implements ExtendedDoubleGaugeBuilder {
    @Override // xsna.fjh0, xsna.o6o
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ExtendedLongGaugeBuilder ofLongs() {
        l8x l8xVar = this.a;
        return new lcq(l8xVar.b, l8xVar.a, l8xVar.f, l8xVar.g, l8xVar.e);
    }
}
