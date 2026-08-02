package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public abstract class ds2 {
    public static cs2 a(Context context, mv3 mv3Var) {
        Context applicationContext = context.getApplicationContext();
        qu2 a = gx2.a().a(applicationContext);
        return (a == null || !a.J) ? new so(applicationContext, new si1(applicationContext), new ni1(), new bs2(mv3Var)) : new ts(applicationContext, new si1(applicationContext), new ni1(), new bs2(mv3Var), ts2.a(), new jj2());
    }
}
