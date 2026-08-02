package yads;

import android.content.Context;
import com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter;

/* loaded from: classes10.dex */
public final class qg {
    public final AppMetricaAdapter a;

    public qg(Context context, zg zgVar) {
        AppMetricaAdapter appMetricaAdapter = null;
        if (zgVar.c()) {
            try {
                appMetricaAdapter = new AppMetricaAdapter(context);
            } catch (Throwable th) {
                th.toString();
            }
        }
        this.a = appMetricaAdapter;
    }
}
