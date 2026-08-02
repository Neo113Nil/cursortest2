package defpackage;

import com.yandex.pulse.metrics.MetricsService;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes8.dex */
public final /* synthetic */ class jd20 implements tp50, jms {
    public final /* synthetic */ MetricsService a;

    public jd20(MetricsService metricsService) {
        this.a = metricsService;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof tp50) && (obj instanceof jms)) {
            return getFunctionDelegate().equals(((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, MetricsService.class, "onConnectionTypeChanged", "onConnectionTypeChanged(I)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
