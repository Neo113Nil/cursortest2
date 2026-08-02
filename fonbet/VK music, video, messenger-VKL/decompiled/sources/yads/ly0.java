package yads;

import android.content.Context;
import android.content.Intent;
import kotlin.Result;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class ly0 {
    public final jp2 a;
    public final ky0 b;

    public ly0(jp2 jp2Var, ky0 ky0Var) {
        this.a = jp2Var;
        this.b = ky0Var;
    }

    public final Object a(Context context, x1 x1Var) {
        Object failure;
        long a = a31.a();
        Intent a2 = this.b.a(context, a);
        z1 a3 = y1.a();
        a3.a(a, x1Var);
        try {
            context.startActivity(a2);
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a4 = Result.a(failure);
        if (a4 != null) {
            a3.a(a);
            oc1.a("Failed to show Fullscreen Ad. Exception: " + a4, new Object[0]);
            this.a.reportError("Failed to show Fullscreen Ad", a4);
        }
        return failure;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ly0(ov2 ov2Var) {
        this(r3.a(), new ky0(r3.c()));
        mv3 mv3Var = (mv3) ov2Var;
    }
}
