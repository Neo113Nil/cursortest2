package yads;

import android.content.Context;
import xsna.s3q0;

/* loaded from: classes10.dex */
public abstract class xg {
    public static volatile e31 a;

    public static final e31 a(Context context) {
        if (a == null) {
            synchronized (e31.h) {
                try {
                    if (a == null) {
                        Context applicationContext = context.getApplicationContext();
                        a = new e31(applicationContext, pg.a(applicationContext), new yg(), new wg(new ug(), pg.a(applicationContext)), new ck1(vh1.a(applicationContext, "YadPreferenceFile")));
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return a;
    }
}
