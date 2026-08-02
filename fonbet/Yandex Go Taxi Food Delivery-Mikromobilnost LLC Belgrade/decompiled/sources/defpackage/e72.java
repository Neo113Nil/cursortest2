package defpackage;

import android.net.ssl.SSLSockets;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes9.dex */
public final class e72 implements l5t0 {
    @Override // defpackage.l5t0
    public final boolean a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // defpackage.l5t0
    public final String b(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // defpackage.l5t0
    public final void c(SSLSocket sSLSocket, String str, List list) {
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            d72 d72Var = dvc0.a;
            sSLParameters.setApplicationProtocols((String[]) rms.h(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            dac.g("Android internal error", e);
        }
    }

    @Override // defpackage.l5t0
    public final boolean isSupported() {
        d72 d72Var = dvc0.a;
        return true;
    }
}
