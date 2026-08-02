package defpackage;

import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import ru.CryptoPro.sspiSSL.gost.GostConstants;

/* loaded from: classes4.dex */
public final class kp71 extends SSLSocketFactory {
    public static final /* synthetic */ int b = 0;
    public final SSLSocketFactory a;

    public kp71(SSLSocketFactory sSLSocketFactory) {
        this.a = sSLSocketFactory;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        SSLSocketFactory sSLSocketFactory = this.a;
        Socket createSocket = sSLSocketFactory.createSocket(str, i);
        ((SSLSocket) createSocket).setEnabledCipherSuites(mm71.a(sSLSocketFactory));
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return mm71.a(this.a);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.a.getSupportedCipherSuites();
        ArrayList arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(supportedCipherSuites, supportedCipherSuites.length)));
        arrayList.remove(GostConstants.TLS_RSA_WITH_AES_128_CBC_SHA);
        arrayList.add(0, GostConstants.TLS_RSA_WITH_AES_128_CBC_SHA);
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        SSLSocketFactory sSLSocketFactory = this.a;
        Socket createSocket = sSLSocketFactory.createSocket(inetAddress, i);
        ((SSLSocket) createSocket).setEnabledCipherSuites(mm71.a(sSLSocketFactory));
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        SSLSocketFactory sSLSocketFactory = this.a;
        Socket createSocket = sSLSocketFactory.createSocket(socket, str, i, z);
        ((SSLSocket) createSocket).setEnabledCipherSuites(mm71.a(sSLSocketFactory));
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        SSLSocketFactory sSLSocketFactory = this.a;
        Socket createSocket = sSLSocketFactory.createSocket(str, i, inetAddress, i2);
        ((SSLSocket) createSocket).setEnabledCipherSuites(mm71.a(sSLSocketFactory));
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        SSLSocketFactory sSLSocketFactory = this.a;
        Socket createSocket = sSLSocketFactory.createSocket(inetAddress, i, inetAddress2, i2);
        ((SSLSocket) createSocket).setEnabledCipherSuites(mm71.a(sSLSocketFactory));
        return createSocket;
    }
}
