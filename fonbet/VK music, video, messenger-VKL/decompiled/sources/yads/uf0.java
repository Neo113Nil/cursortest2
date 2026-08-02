package yads;

import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.common.AdActivity;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.lq9;
import xsna.s3q0;
import xsna.s7s0;

/* loaded from: classes10.dex */
public final class uf0 {
    public final jp2 a;
    public final p1 b;
    public final l2 c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ uf0(d4 d4Var, ov2 ov2Var, v9 v9Var) {
        this(r0.a(), new p1(d4Var, ov2Var, v9Var), new l2(r0.c()));
        mv3 mv3Var = (mv3) ov2Var;
    }

    public final Object a(Context context, Intent intent, xh2 xh2Var) {
        Object failure;
        lq9 lq9Var = new lq9(1, s7s0.c(xh2Var));
        lq9Var.o();
        long andIncrement = a31.a.getAndIncrement();
        this.c.a.getClass();
        Intent intent2 = new Intent(context, (Class<?>) AdActivity.class);
        intent2.putExtra("window_type", "window_type_activity_result");
        intent2.putExtra("data_identifier", andIncrement);
        p1 p1Var = this.b;
        sf0 sf0Var = new sf0(lq9Var);
        tf0 tf0Var = new tf0(lq9Var);
        p1Var.getClass();
        x1 x1Var = new x1(p1Var.c, p1Var.a, new z9(), p1Var.b, null, 0, new qf0(intent, sf0Var, tf0Var), 48);
        z1 a = y1.a();
        a.a(andIncrement, x1Var);
        lq9Var.r(new rf0(a, andIncrement));
        try {
            context.startActivity(intent2);
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            a.a(andIncrement);
            this.a.reportError("Failed to launch AdActivity for result", a2);
            if (lq9Var.isActive()) {
                lq9Var.resumeWith(new Result.Failure(a2));
            }
        }
        Object n = lq9Var.n();
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : s3q0.a;
    }

    public uf0(jp2 jp2Var, p1 p1Var, l2 l2Var) {
        this.a = jp2Var;
        this.b = p1Var;
        this.c = l2Var;
    }
}
