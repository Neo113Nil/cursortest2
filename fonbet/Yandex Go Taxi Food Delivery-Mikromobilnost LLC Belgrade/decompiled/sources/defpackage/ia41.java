package defpackage;

import android.content.Context;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;

/* loaded from: classes11.dex */
public final /* synthetic */ class ia41 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ pbj b;

    public /* synthetic */ ia41(pbj pbjVar, int i) {
        this.a = i;
        this.b = pbjVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        pbj pbjVar = this.b;
        switch (i) {
            case 0:
                Context context = (Context) pbjVar.x;
                AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) pbjVar.c;
                boolean z = pbjVar.b;
                gl glVar = new gl();
                glVar.b = appAnalyticsReporter;
                glVar.a = z;
                glVar.x = st41.a(context.getApplicationContext(), new rl60(context.getApplicationContext()), new ql60());
                glVar.w = new ia41(pbjVar, 1);
                glVar.c = new qq31(4, pbjVar);
                try {
                    boh a = ((znh) ((dj51) pbjVar.w)).a(context);
                    a.a.setId(dch0.ybsdkWeb3dsView);
                    a.n(glVar);
                    a.f().w();
                    a.f().s(true);
                    return a;
                } catch (Throwable th) {
                    tls tlsVar = (tls) pbjVar.a;
                    if (tlsVar == null) {
                        return null;
                    }
                    tlsVar.invoke(th);
                    return null;
                }
            default:
                ye0 ye0Var = (ye0) pbjVar.B;
                fa41 fa41Var = ye0Var instanceof fa41 ? (fa41) ye0Var : null;
                if (fa41Var != null) {
                    pbjVar.B = new ga41(fa41Var.b);
                    sls slsVar = (sls) pbjVar.A;
                    if (slsVar != null) {
                        slsVar.invoke();
                    }
                }
                return zy11.a;
        }
    }
}
