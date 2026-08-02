package yads;

import android.content.Context;
import android.util.Log;
import java.io.File;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes10.dex */
public abstract class eq2 {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0064, code lost:
    
        if (r2 != 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final dq2 a(Context context, int i) {
        long j;
        cw1 cw1Var = gm2.a;
        boolean z = pn3.a;
        pn3.a = Log.isLoggable("Yandex Mobile Ads", 2);
        pn3.a = false;
        et2 a = dt2.a();
        context.getApplicationContext();
        Context applicationContext = context.getApplicationContext();
        SSLSocketFactory a2 = a.a(applicationContext);
        l92.a(applicationContext);
        xo xoVar = new xo(new c21(new ru1(a2, new dn2(), new h92(), new b21(), new g21()), ne.a()), new gr());
        File a3 = vg0.a(context, "mobileads-volley-cache");
        qu2 a4 = gx2.a().a(context);
        if (a4 != null) {
            j = a4.d;
        }
        j = 52428800;
        dq2 dq2Var = new dq2(new ug0(a3, (int) jt1.a(context, 10485760L, j)), xoVar, i);
        sp2 sp2Var = new sp2();
        synchronized (dq2Var.k) {
            dq2Var.k.add(sp2Var);
        }
        return dq2Var;
    }
}
