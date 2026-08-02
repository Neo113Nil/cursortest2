package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.rconfig.b;

/* loaded from: classes3.dex */
public final class nbg implements xvf0 {
    public final /* synthetic */ int a;
    public final dnp0 b;

    public /* synthetic */ nbg(dnp0 dnp0Var, int i) {
        this.a = i;
        this.b = dnp0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        dnp0 dnp0Var = this.b;
        switch (i) {
            case 0:
                return new te01();
            case 1:
                return ((x8g) dnp0Var).a;
            case 2:
                erg ergVar = (erg) ((x8g) dnp0Var).G0.get();
                q5z.h(ergVar);
                return ergVar;
            case 3:
                return ((x8g) dnp0Var).b();
            case 4:
                AppAnalyticsReporter d = ((x8g) dnp0Var).d();
                q5z.h(d);
                return d;
            case 5:
                t0k0 t0k0Var = (t0k0) ((x8g) dnp0Var).s.get();
                q5z.h(t0k0Var);
                return t0k0Var;
            default:
                b bVar = (b) ((x8g) dnp0Var).A.get();
                return new ue01(bVar, bVar);
        }
    }
}
