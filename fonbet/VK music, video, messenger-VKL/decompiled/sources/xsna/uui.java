package xsna;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: CompositeTrustManager.kt */
/* loaded from: classes.dex */
public final class uui extends SSLSocketFactory {
    public final /* synthetic */ vui a;

    public uui(vui vuiVar) {
        this.a = vuiVar;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        vui vuiVar = this.a;
        return vuiVar.a.isEnabled() ? vuiVar.c.a.createSocket() : vuiVar.b.a.createSocket();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        vui vuiVar = this.a;
        return vuiVar.a.isEnabled() ? vuiVar.c.a.getDefaultCipherSuites() : vuiVar.b.a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        vui vuiVar = this.a;
        return vuiVar.a.isEnabled() ? vuiVar.c.a.getSupportedCipherSuites() : vuiVar.b.a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        vui vuiVar = this.a;
        if (vuiVar.a.isEnabled()) {
            return vuiVar.c.a.createSocket(str, i);
        }
        return vuiVar.b.a.createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        vui vuiVar = this.a;
        if (vuiVar.a.isEnabled()) {
            return vuiVar.c.a.createSocket(str, i, inetAddress, i2);
        }
        return vuiVar.b.a.createSocket(str, i, inetAddress, i2);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        vui vuiVar = this.a;
        if (vuiVar.a.isEnabled()) {
            return vuiVar.c.a.createSocket(inetAddress, i);
        }
        return vuiVar.b.a.createSocket(inetAddress, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        vui vuiVar = this.a;
        if (vuiVar.a.isEnabled()) {
            return vuiVar.c.a.createSocket(inetAddress, i, inetAddress2, i2);
        }
        return vuiVar.b.a.createSocket(inetAddress, i, inetAddress2, i2);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        vui vuiVar = this.a;
        if (vuiVar.a.isEnabled()) {
            return vuiVar.c.a.createSocket(socket, str, i, z);
        }
        return vuiVar.b.a.createSocket(socket, str, i, z);
    }
}
