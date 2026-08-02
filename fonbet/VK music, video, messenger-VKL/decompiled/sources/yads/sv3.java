package yads;

import com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter;
import java.util.Set;

/* loaded from: classes10.dex */
public final class sv3 {
    public final qg a;
    public final zg b;

    public sv3(qg qgVar, zg zgVar) {
        this.a = qgVar;
        this.b = zgVar;
    }

    public final void a(String str) {
        if (this.b.c()) {
            qg qgVar = this.a;
            qgVar.getClass();
            try {
                AppMetricaAdapter appMetricaAdapter = qgVar.a;
                if (appMetricaAdapter != null) {
                    appMetricaAdapter.setExperiments(str);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(Set set) {
        if (this.b.c()) {
            qg qgVar = this.a;
            qgVar.getClass();
            try {
                AppMetricaAdapter appMetricaAdapter = qgVar.a;
                if (appMetricaAdapter != null) {
                    appMetricaAdapter.setTriggeredTestIds(set);
                }
            } catch (Throwable unused) {
                set.toString();
            }
        }
    }
}
