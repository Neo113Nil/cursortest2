package xsna;

import android.content.Context;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;

@Deprecated
/* loaded from: classes13.dex */
public final class v2i0 extends SSLSocketFactory {
    public static final String d;
    public static volatile v2i0 e;
    public final SSLContext a;
    public Context b;
    public String[] c;

    static {
        new BrowserCompatHostnameVerifier();
        new StrictHostnameVerifier();
        d = v2i0.class.getSimpleName();
        e = null;
    }

    public v2i0(Context context) throws NoSuchAlgorithmException, CertificateException, KeyStoreException, IOException, KeyManagementException, NullPointerException {
        InputStream inputStream;
        this.a = null;
        this.b = context.getApplicationContext();
        this.a = Build.VERSION.SDK_INT >= 29 ? SSLContext.getInstance("TLSv1.3") : SSLContext.getInstance("TLSv1.2");
        System.currentTimeMillis();
        if (rdi.j == null) {
            rdi.j = context.getApplicationContext();
        }
        if (x2i0.a == null) {
            synchronized (x2i0.class) {
                if (x2i0.a == null) {
                    try {
                        inputStream = xd7.k(context);
                    } catch (RuntimeException unused) {
                        n34.e("SecureX509SingleInstance", "get files bks error");
                        inputStream = null;
                    }
                    if (inputStream == null) {
                        n34.b("SecureX509SingleInstance");
                        inputStream = context.getAssets().open("hmsrootcas.bks");
                    } else {
                        n34.b("SecureX509SingleInstance");
                    }
                    x2i0.a = new y2i0(inputStream);
                }
            }
        }
        System.currentTimeMillis();
        this.a.init(null, new X509TrustManager[]{x2i0.a}, null);
    }

    @Deprecated
    public static v2i0 a(Context context) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalAccessException, KeyManagementException, IllegalArgumentException {
        System.currentTimeMillis();
        if (context != null && rdi.j == null) {
            rdi.j = context.getApplicationContext();
        }
        if (e == null) {
            synchronized (v2i0.class) {
                try {
                    if (e == null) {
                        e = new v2i0(context);
                    }
                } finally {
                }
            }
        }
        if (e.b == null && context != null) {
            v2i0 v2i0Var = e;
            v2i0Var.getClass();
            v2i0Var.b = context.getApplicationContext();
        }
        System.currentTimeMillis();
        return e;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        String str2 = d;
        n34.b(str2);
        Socket createSocket = this.a.getSocketFactory().createSocket(str, i);
        if (createSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            n34.b(str2);
            yyg0.a(sSLSocket);
            n34.b(str2);
            if (sSLSocket != null) {
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                ArrayList arrayList = new ArrayList();
                List asList = Arrays.asList(yyg0.a);
                for (String str3 : enabledCipherSuites) {
                    if (asList.contains(str3.toUpperCase(Locale.ENGLISH))) {
                        arrayList.add(str3);
                    }
                }
                if (arrayList.isEmpty()) {
                    String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
                    ArrayList arrayList2 = new ArrayList();
                    for (String str4 : enabledCipherSuites2) {
                        String upperCase = str4.toUpperCase(Locale.ENGLISH);
                        int i2 = 0;
                        while (true) {
                            if (i2 >= 16) {
                                arrayList2.add(str4);
                                break;
                            }
                            if (upperCase.contains(yyg0.b[i2].toUpperCase(Locale.ENGLISH))) {
                                break;
                            }
                            i2++;
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        sSLSocket.setEnabledCipherSuites((String[]) arrayList2.toArray(new String[arrayList2.size()]));
                    }
                } else {
                    sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
                }
            }
            this.c = (String[]) ((SSLSocket) createSocket).getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] strArr = this.c;
        return strArr != null ? strArr : new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        String str2 = d;
        n34.b(str2);
        Socket createSocket = this.a.getSocketFactory().createSocket(socket, str, i, z);
        if (createSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            n34.b(str2);
            yyg0.a(sSLSocket);
            n34.b(str2);
            if (sSLSocket != null) {
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                ArrayList arrayList = new ArrayList();
                List asList = Arrays.asList(yyg0.a);
                for (String str3 : enabledCipherSuites) {
                    if (asList.contains(str3.toUpperCase(Locale.ENGLISH))) {
                        arrayList.add(str3);
                    }
                }
                if (!arrayList.isEmpty()) {
                    sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
                } else {
                    String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
                    ArrayList arrayList2 = new ArrayList();
                    for (String str4 : enabledCipherSuites2) {
                        String upperCase = str4.toUpperCase(Locale.ENGLISH);
                        int i2 = 0;
                        while (true) {
                            if (i2 < 16) {
                                if (upperCase.contains(yyg0.b[i2].toUpperCase(Locale.ENGLISH))) {
                                    break;
                                }
                                i2++;
                            } else {
                                arrayList2.add(str4);
                                break;
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        sSLSocket.setEnabledCipherSuites((String[]) arrayList2.toArray(new String[arrayList2.size()]));
                    }
                }
            }
            this.c = (String[]) ((SSLSocket) createSocket).getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i);
    }
}
