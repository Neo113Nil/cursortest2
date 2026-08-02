package xsna;

import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* compiled from: SocketAdapter.kt */
/* loaded from: classes11.dex */
public interface iek0 {
    boolean a(SSLSocket sSLSocket);

    void b(SSLSocket sSLSocket, String str, List<? extends Protocol> list);

    String c(SSLSocket sSLSocket);

    boolean isSupported();
}
