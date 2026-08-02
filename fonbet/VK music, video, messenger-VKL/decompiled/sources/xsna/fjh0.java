package xsna;

import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.InstrumentValueType;
import java.util.function.Consumer;

/* compiled from: SdkDoubleGauge.java */
/* loaded from: classes8.dex */
public class fjh0 implements o6o {
    public final l8x a;

    public fjh0(dkh0 dkh0Var, String str) {
        this.a = new l8x(str, InstrumentType.GAUGE, InstrumentValueType.DOUBLE, dkh0Var);
    }

    @Override // xsna.o6o
    public final kq70 buildWithCallback(Consumer<lq70> consumer) {
        return this.a.a(InstrumentType.OBSERVABLE_GAUGE, consumer);
    }

    @Override // xsna.o6o
    public j300 ofLongs() {
        l8x l8xVar = this.a;
        return new yjh0(l8xVar.b, l8xVar.a, l8xVar.f, l8xVar.g, l8xVar.e);
    }

    @Override // xsna.o6o
    public final o6o setDescription(String str) {
        this.a.f = str;
        return this;
    }

    @Override // xsna.o6o
    public final o6o setUnit(String str) {
        this.a.g = str;
        return this;
    }

    public final String toString() {
        return this.a.f(getClass().getSimpleName());
    }
}
