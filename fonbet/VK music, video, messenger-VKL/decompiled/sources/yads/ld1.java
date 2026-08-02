package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class ld1 {
    public static kd1 a(Context context, mv3 mv3Var) {
        Context applicationContext = context.getApplicationContext();
        qu2 a = gx2.a().a(applicationContext);
        return (a == null || !a.I) ? new io(applicationContext, new si1(applicationContext), new ni1(), new jd1(mv3Var)) : new ps(applicationContext, new si1(applicationContext), new ni1(), new jd1(mv3Var), sd1.a(), new jj2());
    }
}
