package defpackage;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import ru.rt.ebs.cryptosdk.core.logging.EbsLogger;

/* loaded from: classes4.dex */
public final class pvf0 extends SSLSocketFactory {
    public final SSLSocketFactory a;
    public final twu b;

    public pvf0(SSLSocketFactory sSLSocketFactory, twu twuVar) {
        this.a = sSLSocketFactory;
        this.b = twuVar;
    }

    public final Socket a(Socket socket) {
        SSLSocket sSLSocket = socket instanceof SSLSocket ? (SSLSocket) socket : null;
        if (sSLSocket == null) {
            return socket;
        }
        fo61 fo61Var = new fo61(sSLSocket);
        fo61Var.addHandshakeCompletedListener(new HandshakeCompletedListener() { // from class: ovf0
            @Override // javax.net.ssl.HandshakeCompletedListener
            public final void handshakeCompleted(HandshakeCompletedEvent handshakeCompletedEvent) {
                SSLSession session;
                SSLSocket socket2 = handshakeCompletedEvent.getSocket();
                if (socket2 == null || (session = socket2.getSession()) == null) {
                    return;
                }
                twu twuVar = pvf0.this.b;
                String protocol = session.getProtocol();
                twuVar.getClass();
                EbsLogger ebsLogger = EbsLogger.INSTANCE;
                if (ebsLogger.getHasData()) {
                    ebsLogger.data("HTTPS--->", "protocol: ".concat(protocol));
                }
            }
        });
        return fo61Var;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return a(this.a.createSocket(socket, str, i, z));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        return a(this.a.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return a(this.a.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return a(this.a.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return a(this.a.createSocket(inetAddress, i, inetAddress2, i2));
    }
}
