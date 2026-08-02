package xsna;

import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import xsna.fta0;
import xsna.hsl;
import xsna.m98;

/* compiled from: BouncyCastleSocketAdapter.kt */
/* loaded from: classes11.dex */
public final class n98 implements iek0 {
    public static final a a = new a();

    /* compiled from: BouncyCastleSocketAdapter.kt */
    public static final class a implements hsl.a {
        @Override // xsna.hsl.a
        public final boolean a(SSLSocket sSLSocket) {
            boolean z = m98.d;
            m98.a.b();
            return false;
        }

        @Override // xsna.hsl.a
        public final iek0 b(SSLSocket sSLSocket) {
            return new n98();
        }
    }

    @Override // xsna.iek0
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // xsna.iek0
    public final void b(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            fta0 fta0Var = fta0.a;
            parameters.setApplicationProtocols((String[]) fta0.a.a(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // xsna.iek0
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // xsna.iek0
    public final boolean isSupported() {
        boolean z = m98.d;
        return m98.a.b();
    }
}
