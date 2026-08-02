package defpackage;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.util.CloseGuard;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes9.dex */
public final class d72 extends dvc0 implements mje {
    public Context c;
    public final ArrayList d;

    public d72() {
        List A = j73.A(new l5t0[]{new e72(), new zoh(kc2.e), new zoh(j6e.a), new zoh(vh6.a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : A) {
            if (((l5t0) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.d = arrayList;
    }

    @Override // defpackage.dvc0
    public final i79 a(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        u72 u72Var = x509TrustManagerExtensions != null ? new u72(x509TrustManager, x509TrustManagerExtensions) : null;
        return u72Var != null ? u72Var : super.a(x509TrustManager);
    }

    @Override // defpackage.dvc0
    public final cg11 b(X509TrustManager x509TrustManager) {
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.b(x509TrustManager);
    }

    @Override // defpackage.dvc0
    public final Object c() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.c();
        }
        CloseGuard j = mh.j();
        j.open("response.body().close()");
        return j;
    }

    @Override // defpackage.dvc0
    public final void d(Object obj, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            ai.m(obj).warnIfOpen();
        } else {
            super.d(obj, str);
        }
    }

    public final void e(int i, String str, Throwable th) {
        if (i == 5) {
            kva1.d();
        } else {
            kva1.d();
            Log.i("OkHttp", str, th);
        }
    }

    @Override // defpackage.mje
    public final Context getApplicationContext() {
        return this.c;
    }

    @Override // defpackage.mje
    public final void setApplicationContext(Context context) {
        this.c = context;
    }
}
