package xsna;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* compiled from: OkHttpClientFactory.kt */
/* loaded from: classes5.dex */
public final class px70 extends ProxySelector {
    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        ProxySelector.getDefault().connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public final List<Proxy> select(URI uri) {
        try {
            return ProxySelector.getDefault().select(uri);
        } catch (Throwable unused) {
            return Collections.singletonList(Proxy.NO_PROXY);
        }
    }
}
