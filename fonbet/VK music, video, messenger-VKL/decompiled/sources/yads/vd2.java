package yads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class vd2 {
    public final xd2 a(Context context) {
        xd2 xd2Var;
        xd2 xd2Var2 = xd2.i;
        if (xd2Var2 != null) {
            return xd2Var2;
        }
        synchronized (this) {
            Context applicationContext = context.getApplicationContext();
            Executor a = oh1.a().a();
            xd2Var = xd2.i;
            if (xd2Var == null) {
                xd2 xd2Var3 = new xd2(applicationContext, a, gx2.a(), new ud2(applicationContext.getApplicationContext()), new td2());
                xd2.i = xd2Var3;
                xd2Var = xd2Var3;
            }
        }
        return xd2Var;
    }
}
