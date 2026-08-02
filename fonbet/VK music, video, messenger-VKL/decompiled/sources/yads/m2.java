package yads;

import android.app.Activity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class m2 implements h2 {
    public final Activity a;
    public final x1 b;
    public final q1 c;

    public m2(Activity activity, x1 x1Var, q1 q1Var) {
        this.a = activity;
        this.b = x1Var;
        this.c = q1Var;
    }

    @Override // yads.h2
    public final void c() {
        Object failure;
        q1 q1Var = this.c;
        Activity activity = this.a;
        x1 x1Var = this.b;
        q1Var.getClass();
        qf0 qf0Var = x1Var.g;
        if (qf0Var == null) {
            return;
        }
        try {
            activity.startActivityForResult(qf0Var.a, 0);
            failure = s3q0.a;
            r1 r1Var = q1Var.a;
            gp2 a = r1Var.b.a(x1Var.a, x1Var.b);
            dp2 dp2Var = dp2.H;
            Map map = a.a;
            r1Var.a.a(new fp2(dp2Var.a(), new LinkedHashMap(map), a.b));
            qf0Var.b.invoke();
            activity.finish();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            activity.finish();
            q1Var.a.a.reportError("Failed to register ActivityResult", a2);
            qf0Var.c.invoke(a2);
        }
    }

    @Override // yads.h2
    public final boolean d() {
        return true;
    }

    @Override // yads.h2
    public final void a() {
    }

    @Override // yads.h2
    public final void b() {
    }

    @Override // yads.h2
    public final void f() {
    }

    @Override // yads.h2
    public final void g() {
    }

    @Override // yads.h2
    public final void onAdClosed() {
    }
}
