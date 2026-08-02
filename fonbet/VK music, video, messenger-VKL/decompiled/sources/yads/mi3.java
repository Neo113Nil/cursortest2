package yads;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes10.dex */
public abstract class mi3 {
    public static volatile nj0 a;
    public static final Object b = new Object();

    public static nj0 a(Context context) {
        Context applicationContext = context.getApplicationContext();
        m43 m43Var = new m43(applicationContext);
        nr a2 = cp0.a().a(applicationContext);
        oc0 oc0Var = new oc0(applicationContext, new qv2(((p63) ne.a().a).a(), dt2.a().a(applicationContext)));
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(4);
        rc0 rc0Var = new rc0(m43Var, 0);
        qr qrVar = new qr();
        qrVar.a = a2;
        qrVar.d = oc0Var;
        return new nj0(applicationContext, rc0Var, new sc0(qrVar, newFixedThreadPool));
    }

    public static nj0 b(Context context) {
        nj0 nj0Var;
        nj0 nj0Var2 = a;
        if (nj0Var2 != null) {
            return nj0Var2;
        }
        synchronized (b) {
            nj0 nj0Var3 = a;
            if (nj0Var3 != null) {
                return nj0Var3;
            }
            try {
                nj0Var = a(context);
                a = nj0Var;
            } catch (Throwable th) {
                th.toString();
                nj0Var = null;
            }
            return nj0Var;
        }
    }
}
