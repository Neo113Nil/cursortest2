package xsna;

import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import xsna.fta0;

/* compiled from: Android10Platform.kt */
/* loaded from: classes11.dex */
public final class j12 extends fta0 {
    public static final boolean d;
    public final ArrayList c;

    static {
        d = fta0.a.c() && Build.VERSION.SDK_INT >= 29;
    }

    public j12() {
        List I = rl3.I(new iek0[]{(!fta0.a.c() || Build.VERSION.SDK_INT < 29) ? null : new k12(), new hsl(qc2.f), new hsl(x4j.a), new hsl(n98.a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : I) {
            if (((iek0) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
    }

    @Override // xsna.fta0
    public final fqa b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        f52 f52Var = x509TrustManagerExtensions != null ? new f52(x509TrustManager, x509TrustManagerExtensions) : null;
        return f52Var != null ? f52Var : super.b(x509TrustManager);
    }

    @Override // xsna.fta0
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((iek0) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        iek0 iek0Var = (iek0) obj;
        if (iek0Var != null) {
            iek0Var.b(sSLSocket, str, list);
        }
    }

    @Override // xsna.fta0
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((iek0) obj).a(sSLSocket)) {
                break;
            }
        }
        iek0 iek0Var = (iek0) obj;
        if (iek0Var != null) {
            return iek0Var.c(sSLSocket);
        }
        return null;
    }

    @Override // xsna.fta0
    @SuppressLint({"NewApi"})
    public final boolean h(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
