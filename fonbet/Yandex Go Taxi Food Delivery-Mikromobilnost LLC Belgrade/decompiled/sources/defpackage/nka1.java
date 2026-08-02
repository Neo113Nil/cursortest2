package defpackage;

import android.app.Activity;
import android.content.Context;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes7.dex */
public abstract class nka1 {
    public static final dy61 a(int i, Context context) {
        mk71 mk71Var = new mk71();
        context.getApplicationContext();
        Context applicationContext = context.getApplicationContext();
        SSLSocketFactory a = mk71Var.a(applicationContext);
        hka1.a(applicationContext);
        dy61 dy61Var = new dy61(new tr71(), new pw71(new eu71(new o291(a))), i);
        dy61Var.a();
        return dy61Var;
    }

    public static final String b(d5j0 d5j0Var) {
        jwu g = d5j0Var.a.g();
        g.g("/");
        g.g = null;
        g.h = null;
        return evu0.S("/", g.e().i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final tse c(Activity activity) {
        pey peyVar = activity instanceof pey ? (pey) activity : null;
        if (peyVar != null) {
            return eja1.s(peyVar);
        }
        sjh sjhVar = uyj.a;
        ike a = bvf0.a(o400.a);
        z83.i();
        return a;
    }
}
