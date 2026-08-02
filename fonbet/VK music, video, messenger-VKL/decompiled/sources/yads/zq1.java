package yads;

import android.app.Activity;
import android.content.Context;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import xsna.on00;
import xsna.qcy;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class zq1 implements cy0 {
    public final gy0 a;
    public final ep1 b;
    public final br1 c;
    public final is2 d;
    public final yp1 e;

    public zq1(gy0 gy0Var, v9 v9Var, ir1 ir1Var) {
        this.a = gy0Var;
        d4 e = gy0Var.e();
        ov2 h = gy0Var.h();
        fq1 fq1Var = new fq1(e);
        yp1 yp1Var = new yp1(e, h, v9Var);
        this.e = yp1Var;
        ar1 ar1Var = new ar1(new np1(ir1Var.c(), fq1Var, yp1Var));
        w5 f = gy0Var.f();
        tc2 tc2Var = new tc2(gy0Var, ir1Var);
        br1 br1Var = new br1();
        this.c = br1Var;
        ep1 ep1Var = new ep1(e, h, f, br1Var, yp1Var, ar1Var, tc2Var);
        this.b = ep1Var;
        this.d = new is2(gy0Var, ep1Var);
    }

    @Override // yads.cy0
    public final void a(Context context) {
        this.a.f.a();
        this.b.a(context);
    }

    @Override // yads.fc
    public final List b() {
        return EmptyList.b;
    }

    @Override // yads.cy0
    public final String getAdInfo() {
        return null;
    }

    @Override // yads.fc
    public final List a() {
        return EmptyList.b;
    }

    @Override // yads.cy0
    public final void a(Context context, v9 v9Var) {
        this.b.a(context, this.d);
    }

    @Override // yads.cy0
    public final Object a(ry0 ry0Var, Activity activity) {
        Object failure;
        dp1 dp1Var;
        xr2 xr2Var = (xr2) ry0Var;
        try {
            MediatedRewardedAdapter mediatedRewardedAdapter = this.c.a;
            if (mediatedRewardedAdapter != null) {
                mn2 mn2Var = this.d.c;
                qcy qcyVar = is2.e[0];
                mn2Var.getClass();
                mn2Var.a = new WeakReference(xr2Var);
                t8 t8Var = this.a.f;
                if (t8Var.b()) {
                    ((a9) t8Var.g.getValue()).onAdWillDisplay();
                }
                mediatedRewardedAdapter.showRewardedAd(activity);
            }
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null && (dp1Var = this.b.i) != null) {
            Context applicationContext = activity.getApplicationContext();
            Map f = on00.f(new Pair("reason", xsna.dt.b("exception_in_adapter", a.toString())));
            yp1 yp1Var = this.e;
            rr1 rr1Var = dp1Var.b;
            String networkName = dp1Var.c.b().getNetworkName();
            yp1Var.getClass();
            yp1Var.a(applicationContext, dp2.f, rr1Var, networkName, f);
        }
        return failure;
    }
}
