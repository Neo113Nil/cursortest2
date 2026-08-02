package xsna;

import java.net.InetAddress;
import java.net.Socket;
import java.nio.channels.SocketChannel;
import javax.net.SocketFactory;

/* compiled from: OkHttpSocketChannelFactory.kt */
/* loaded from: classes3.dex */
public final class qy70 extends SocketFactory {
    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return SocketChannel.open().socket();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        throw new IllegalStateException("Must not be called by OkHttp");
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        throw new IllegalStateException("Must not be called by OkHttp");
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        throw new IllegalStateException("Must not be called by OkHttp");
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        throw new IllegalStateException("Must not be called by OkHttp");
    }
}
