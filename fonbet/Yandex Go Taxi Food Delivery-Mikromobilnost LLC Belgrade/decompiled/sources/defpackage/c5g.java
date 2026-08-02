package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;

/* loaded from: classes3.dex */
public final class c5g implements xvf0 {
    public final /* synthetic */ int a;
    public final dt20 b;

    public /* synthetic */ c5g(dt20 dt20Var, int i) {
        this.a = i;
        this.b = dt20Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        dt20 dt20Var = this.b;
        switch (i) {
            case 0:
                AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) dt20Var.w;
                q5z.h(appAnalyticsReporter);
                return appAnalyticsReporter;
            case 1:
                return (tv3) dt20Var.x;
            case 2:
                return (y4a0) dt20Var.b;
            default:
                t0k0 t0k0Var = (t0k0) dt20Var.c;
                q5z.h(t0k0Var);
                return t0k0Var;
        }
    }
}
