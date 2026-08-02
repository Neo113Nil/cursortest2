package defpackage;

import io.appmetrica.analytics.IReporter;
import java.util.Map;

/* loaded from: classes8.dex */
public final class ma20 implements rgo {
    public final IReporter a;

    public ma20(IReporter iReporter) {
        this.a = iReporter;
    }

    @Override // defpackage.rgo
    public final void reportEvent(String str, String str2) {
        this.a.reportEvent(str, str2);
    }

    @Override // defpackage.rgo
    public final void reportEvent(String str, Map map) {
        this.a.reportEvent(str, (Map<String, Object>) map);
    }
}
