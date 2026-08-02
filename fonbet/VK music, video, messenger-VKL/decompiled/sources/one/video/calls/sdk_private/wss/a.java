package one.video.calls.sdk_private.wss;

import java.net.InetAddress;
import java.net.Socket;
import java.util.Collections;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import ru.ok.android.webrtc.RTCLog;
import xsna.fta0;

/* compiled from: r8-map-id-cc4c1e6558630cf7ba5e355c7bcb3cc9779e4bdb3dccad6bc7dbe1b632974ab0 */
/* loaded from: classes8.dex */
public final class a extends SSLSocketFactory {
    public final RTCLog a;
    public final X509TrustManager b;
    public final SSLSocketFactory c;
    public String d;

    public a(RTCLog rTCLog, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        this.a = rTCLog;
        if (x509TrustManager == null) {
            fta0 fta0Var = fta0.a;
            x509TrustManager = fta0.a.n();
        }
        this.b = x509TrustManager;
        if (sSLSocketFactory == null) {
            fta0 fta0Var2 = fta0.a;
            sSLSocketFactory = fta0.a.m(x509TrustManager);
        }
        this.c = sSLSocketFactory;
    }

    public final Socket a(Socket socket) {
        try {
            String str = this.d;
            if (str != null) {
                SSLSocket sSLSocket = socket instanceof SSLSocket ? (SSLSocket) socket : null;
                if (sSLSocket != null) {
                    SSLParameters sSLParameters = ((SSLSocket) socket).getSSLParameters();
                    sSLParameters.setServerNames(Collections.singletonList(new SNIHostName(str)));
                    sSLSocket.setSSLParameters(sSLParameters);
                }
            }
            return socket;
        } catch (IllegalArgumentException e) {
            this.a.logException("SNI_Provider", "Can't apply requested " + this.d, e);
            return socket;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        Socket createSocket = this.c.createSocket();
        if (createSocket != null) {
            return a(createSocket);
        }
        return null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.c.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.c.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.c.createSocket(inetAddress, i);
        if (createSocket != null) {
            return a(createSocket);
        }
        return null;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.c.createSocket(inetAddress, i, inetAddress2, i2);
        if (createSocket != null) {
            return a(createSocket);
        }
        return null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.c.createSocket(socket, str, i, z);
        if (createSocket != null) {
            return a(createSocket);
        }
        return null;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.c.createSocket(str, i);
        if (createSocket != null) {
            return a(createSocket);
        }
        return null;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.c.createSocket(str, i, inetAddress, i2);
        if (createSocket != null) {
            return a(createSocket);
        }
        return null;
    }
}
