package defpackage;

import android.content.Context;
import com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter;
import java.util.Set;

/* loaded from: classes7.dex */
public final class dg71 implements tr81 {
    public final AppMetricaAdapter a;

    public dg71(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = new AppMetricaAdapter(applicationContext != null ? applicationContext : context);
    }

    @Override // defpackage.tr81
    public final void a(String str) {
        this.a.setExperiments(str);
    }

    @Override // defpackage.tr81
    public final void c(String str) {
        this.a.setCustomReporter(str);
    }

    @Override // defpackage.tr81
    public final void e(Set set) {
        this.a.setTriggeredTestIds(set);
    }
}
