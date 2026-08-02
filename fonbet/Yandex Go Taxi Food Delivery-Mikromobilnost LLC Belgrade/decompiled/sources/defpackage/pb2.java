package defpackage;

import android.content.Context;
import android.os.StrictMode;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class pb2 extends dvc0 implements mje {
    public static final /* synthetic */ int d = 0;
    public Context c;

    public pb2() {
        rzt0 rzt0Var;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            rzt0Var = new rzt0(cls);
        } catch (Exception e) {
            CopyOnWriteArraySet copyOnWriteArraySet = pa2.a;
            pa2.a(5, OkHttpClient.class.getName(), e, "unable to load android socket classes");
            rzt0Var = null;
        }
        List A = j73.A(new l5t0[]{rzt0Var, new zoh(kc2.e), new zoh(j6e.a), new zoh(vh6.a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : A) {
            if (((l5t0) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
    }

    @Override // defpackage.dvc0
    public final cg11 b(X509TrustManager x509TrustManager) {
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new ob2(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.b(x509TrustManager);
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
