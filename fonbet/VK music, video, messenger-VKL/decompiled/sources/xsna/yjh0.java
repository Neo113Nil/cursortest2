package xsna;

import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.InstrumentValueType;
import java.util.function.Consumer;
import xsna.x41;

/* compiled from: SdkLongGauge.java */
/* loaded from: classes8.dex */
public class yjh0 implements j300 {
    public final l8x a;

    public yjh0(dkh0 dkh0Var, String str, String str2, String str3, x41.a aVar) {
        l8x l8xVar = new l8x(str, InstrumentType.GAUGE, InstrumentValueType.LONG, dkh0Var);
        l8xVar.f = str2;
        l8xVar.g = str3;
        l8xVar.e = aVar;
        this.a = l8xVar;
    }

    @Override // xsna.j300
    public final pq70 buildWithCallback(Consumer<qq70> consumer) {
        return this.a.b(InstrumentType.OBSERVABLE_GAUGE, consumer);
    }

    @Override // xsna.j300
    public final j300 setDescription(String str) {
        this.a.f = str;
        return this;
    }

    @Override // xsna.j300
    public final j300 setUnit(String str) {
        this.a.g = str;
        return this;
    }

    public final String toString() {
        return this.a.f(getClass().getSimpleName());
    }
}
