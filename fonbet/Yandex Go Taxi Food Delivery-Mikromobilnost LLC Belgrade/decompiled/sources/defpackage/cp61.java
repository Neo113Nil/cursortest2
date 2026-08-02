package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import yads.eb2;

/* loaded from: classes7.dex */
public final class cp61 {
    public final eb2 a(Context context) {
        eb2 eb2Var;
        mp71 mp71Var;
        eb2 eb2Var2 = eb2.i;
        if (eb2Var2 != null) {
            return eb2Var2;
        }
        synchronized (this) {
            Context applicationContext = context.getApplicationContext();
            mp71 mp71Var2 = mp71.e;
            if (mp71Var2 == null) {
                synchronized (mp71.d) {
                    mp71Var = mp71.e;
                    if (mp71Var == null) {
                        mp71Var = new mp71();
                        mp71.e = mp71Var;
                    }
                }
                mp71Var2 = mp71Var;
            }
            Executor a = mp71Var2.a();
            eb2Var = eb2.i;
            if (eb2Var == null) {
                eb2Var = new eb2(applicationContext, a);
                eb2.i = eb2Var;
            }
        }
        return eb2Var;
    }
}
