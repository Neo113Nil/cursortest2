package ru.ok.tracer.opentelemetry;

import xsna.ril;
import xsna.sq70;
import xsna.uu6;
import xsna.yi20;

/* compiled from: TracerOpenTelemetryMeterProvider.kt */
/* loaded from: classes9.dex */
final class WrapMeter implements yi20 {
    private final yi20 d;

    public WrapMeter(yi20 yi20Var) {
        this.d = yi20Var;
    }

    public /* bridge */ /* synthetic */ uu6 batchCallback(Runnable runnable, sq70 sq70Var, sq70... sq70VarArr) {
        return ril.f;
    }

    @Override // xsna.yi20
    public WrapLongCounterBuilder counterBuilder(String str) {
        return new WrapLongCounterBuilder(this.d.counterBuilder(str));
    }

    @Override // xsna.yi20
    public WrapDoubleGaugeBuilder gaugeBuilder(String str) {
        return new WrapDoubleGaugeBuilder(this.d.gaugeBuilder(str));
    }

    @Override // xsna.yi20
    public WrapDoubleHistogramBuilder histogramBuilder(String str) {
        return new WrapDoubleHistogramBuilder(this.d.histogramBuilder(str));
    }

    @Override // xsna.yi20
    public WrapLongUpDownCounterBuilder upDownCounterBuilder(String str) {
        return new WrapLongUpDownCounterBuilder(this.d.upDownCounterBuilder(str));
    }
}
