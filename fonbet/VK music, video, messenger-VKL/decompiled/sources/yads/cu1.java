package yads;

import android.content.Context;
import com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes10.dex */
public final class cu1 extends Lambda implements gzs {
    public final /* synthetic */ cd3 b = tv3.a;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu1(Context context) {
        super(0);
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        sv3 sv3Var;
        cd3 cd3Var = this.b;
        Context context = this.c;
        ((tv3) cd3Var).getClass();
        sv3 sv3Var2 = tv3.c;
        if (sv3Var2 != null) {
            return sv3Var2;
        }
        synchronized (tv3.b) {
            try {
                sv3Var = tv3.c;
                if (sv3Var == null) {
                    String str = ub.a(context) ? "322a737a-a0ca-44e0-bc85-649b1c7c1db6" : "478cb909-6ad1-4e12-84cc-b3629a789f93";
                    qg qgVar = new qg(context, new zg(context));
                    try {
                        AppMetricaAdapter appMetricaAdapter = qgVar.a;
                        if (appMetricaAdapter != null) {
                            appMetricaAdapter.b.a(appMetricaAdapter.a, str);
                        }
                    } catch (Throwable unused) {
                    }
                    sv3Var = new sv3(qgVar, new zg(context));
                    tv3.c = sv3Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sv3Var;
    }
}
