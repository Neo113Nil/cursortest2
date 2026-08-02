package xsna;

import android.util.Log;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import xsna.ayx;
import xsna.byx;
import xsna.fb2;
import xsna.ir80;
import xsna.m98;
import xsna.w4j;

/* compiled from: Platform.kt */
/* loaded from: classes11.dex */
public class fta0 {
    public static volatile fta0 a;
    public static final Logger b;

    /* compiled from: Platform.kt */
    public static final class a {
        public static ArrayList a(List list) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).toString());
            }
            return arrayList2;
        }

        public static byte[] b(List list) {
            vl8 vl8Var = new vl8();
            Iterator it = a(list).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                vl8Var.I(str.length());
                vl8Var.Q(0, str.length(), str);
            }
            return vl8Var.v(vl8Var.c);
        }

        public static boolean c() {
            return "Dalvik".equals(System.getProperty("java.vm.name"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if (r0 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
    
        if (r0 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b9, code lost:
    
        if (r0 != null) goto L45;
     */
    static {
        fta0 a2;
        if (a.c()) {
            for (Map.Entry<String, String> entry : oa2.b.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                Logger logger = Logger.getLogger(key);
                if (oa2.a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(value, 3) ? Level.FINE : Log.isLoggable(value, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(qa2.a);
                }
            }
            a2 = j12.d ? new j12() : null;
            if (a2 == null) {
                boolean z = fb2.e;
                a2 = fb2.a.a();
            }
        } else {
            if ("Conscrypt".equals(Security.getProviders()[0].getName())) {
                boolean z2 = w4j.d;
                a2 = w4j.a.b();
            }
            if ("BC".equals(Security.getProviders()[0].getName())) {
                boolean z3 = m98.d;
                a2 = m98.a.a();
            }
            if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                boolean z4 = ir80.d;
                a2 = ir80.a.a();
            }
            boolean z5 = byx.c;
            a2 = byx.a.a();
            if (a2 == null && (a2 = ayx.b.a()) == null) {
                a2 = new fta0();
            }
        }
        a = a2;
        b = Logger.getLogger(okhttp3.o.class.getName());
    }

    public static void i(int i, String str, Throwable th) {
        b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public static /* synthetic */ void j(fta0 fta0Var, String str, int i) {
        int i2 = (i & 2) != 0 ? 4 : 5;
        fta0Var.getClass();
        i(i2, str, null);
    }

    public fqa b(X509TrustManager x509TrustManager) {
        return new it6(c(x509TrustManager));
    }

    public csp0 c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new su6((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        return true;
    }

    public void k(Object obj, String str) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(5, str, (Throwable) obj);
    }

    public SSLContext l() {
        return SSLContext.getInstance("TLS");
    }

    public SSLSocketFactory m(X509TrustManager x509TrustManager) {
        try {
            SSLContext l = l();
            l.init(null, new TrustManager[]{x509TrustManager}, null);
            return l.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    public X509TrustManager n() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        throw new IllegalStateException("Unexpected default trust managers: ".concat(Arrays.toString(trustManagers)).toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void d(SSLSocket sSLSocket, String str, List<Protocol> list) {
    }
}
