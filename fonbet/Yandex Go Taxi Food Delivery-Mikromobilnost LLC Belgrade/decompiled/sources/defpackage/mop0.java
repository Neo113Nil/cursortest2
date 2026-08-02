package defpackage;

import com.yandex.go.sdk_registry.api.metrics.SdkInitMetric$Phase;
import com.yandex.go.sdk_registry.api.metrics.SdkMetricResult;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class mop0 {
    public final String a;
    public final long b;
    public final long c;
    public final SdkInitMetric$Phase d;
    public final SdkMetricResult e;
    public final Map f;
    public final String g;
    public final MapBuilder h;
    public final Map i;

    public mop0(String str, long j, long j2, SdkInitMetric$Phase sdkInitMetric$Phase, SdkMetricResult sdkMetricResult) {
        Map f = b.f();
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = sdkInitMetric$Phase;
        this.e = sdkMetricResult;
        this.f = f;
        this.g = "sdk_registry.init";
        MapBuilder y = qv10.y("component_tag", str);
        y.put("phase", sdkInitMetric$Phase.getValue());
        y.put(TarifficatorScenarioActivity.RESULT_KEY, sdkMetricResult.getWireName());
        y.putAll(f);
        this.h = y.j();
        this.i = gw00.e(new Pair("duration_ms", Long.valueOf(j2)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mop0)) {
            return false;
        }
        mop0 mop0Var = (mop0) obj;
        return jl40.l(this.a, mop0Var.a) && this.b == mop0Var.b && this.c == mop0Var.c && this.d == mop0Var.d && this.e == mop0Var.e && jl40.l(this.f, mop0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + qv10.c(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("SdkInitMetric(componentTag=", this.a, ", timestampMillis=", this.b);
        x4e.A(this.c, ", durationMillis=", ", phase=", l);
        l.append(this.d);
        l.append(", result=");
        l.append(this.e);
        l.append(", additionalDimensions=");
        return b64.r(l, this.f, Extension.C_BRAKE);
    }
}
