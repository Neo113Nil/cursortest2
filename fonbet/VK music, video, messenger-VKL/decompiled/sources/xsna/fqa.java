package xsna;

import android.os.SystemClock;
import android.text.TextUtils;
import java.net.HttpURLConnection;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: CertificateChainCleaner.kt */
/* loaded from: classes11.dex */
public abstract class fqa {
    public static qyy0 a;
    public static boolean b;

    public static void a(String str, String str2, String str3, String str4) {
        fpy0 fpy0Var = new fpy0(str, str2, str3, str4);
        udz0 udz0Var = udz0.j;
        udz0.l = (!TextUtils.isEmpty(fpy0Var.f) && fpy0Var.f.startsWith("com.my.targetdemo5.")) || udz0.k.contains(fpy0Var.f);
        z5z0 z5z0Var = v5z0.a;
        z5z0Var.d = fpy0Var;
        z5z0Var.e = System.currentTimeMillis();
        z5z0Var.f = SystemClock.elapsedRealtime();
        z5z0Var.a.c(z5z0Var.b);
    }

    public static void b(HttpURLConnection httpURLConnection) {
        qyy0 qyy0Var = a;
        if (qyy0Var != null && (httpURLConnection instanceof HttpsURLConnection)) {
            try {
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(qyy0Var.a.getSocketFactory());
            } catch (Throwable th) {
                eb3.a(null, new StringBuilder("DigitalGovCertsUtils: can't setSSLSocketFactory to httpsURLConnection"), th);
            }
        }
    }

    public abstract void c(qyg0 qyg0Var, Object obj);

    public abstract List d(String str, List list) throws SSLPeerUnverifiedException;

    public abstract String e();

    public abstract Class f();

    public void g(hyg0 hyg0Var, Iterable iterable) {
        if (iterable == null) {
            return;
        }
        qyg0 V0 = hyg0Var.V0(e());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    c(V0, obj);
                    V0.step();
                    V0.reset();
                }
            }
            s3q0 s3q0Var = s3q0.a;
            yfb.d(V0, null);
        } finally {
        }
    }

    public void h(hyg0 hyg0Var, Object obj) {
        if (obj == null) {
            return;
        }
        qyg0 V0 = hyg0Var.V0(e());
        try {
            c(V0, obj);
            V0.step();
            yfb.d(V0, null);
        } finally {
        }
    }

    public long i(hyg0 hyg0Var, Object obj) {
        qyg0 V0 = hyg0Var.V0(e());
        try {
            c(V0, obj);
            V0.step();
            yfb.d(V0, null);
            return sv1.l(hyg0Var);
        } finally {
        }
    }
}
