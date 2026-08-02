package xsna;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import xsna.fta0;

/* compiled from: Android10SocketAdapter.kt */
@SuppressLint({"NewApi"})
/* loaded from: classes11.dex */
public final class k12 implements iek0 {
    @Override // xsna.iek0
    public final boolean a(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }

    @Override // xsna.iek0
    @SuppressLint({"NewApi"})
    public final void b(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            fta0 fta0Var = fta0.a;
            sSLParameters.setApplicationProtocols((String[]) fta0.a.a(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // xsna.iek0
    @SuppressLint({"NewApi"})
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol;
        applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // xsna.iek0
    public final boolean isSupported() {
        fta0 fta0Var = fta0.a;
        return fta0.a.c() && Build.VERSION.SDK_INT >= 29;
    }
}
