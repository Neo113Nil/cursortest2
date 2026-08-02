package xsna;

import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;
import xsna.fta0;
import xsna.hsl;
import xsna.w4j;

/* compiled from: ConscryptSocketAdapter.kt */
/* loaded from: classes11.dex */
public final class x4j implements iek0 {
    public static final a a = new a();

    /* compiled from: ConscryptSocketAdapter.kt */
    public static final class a implements hsl.a {
        @Override // xsna.hsl.a
        public final boolean a(SSLSocket sSLSocket) {
            boolean z = w4j.d;
            return w4j.a.c() && Conscrypt.isConscrypt(sSLSocket);
        }

        @Override // xsna.hsl.a
        public final iek0 b(SSLSocket sSLSocket) {
            return new x4j();
        }
    }

    @Override // xsna.iek0
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // xsna.iek0
    public final void b(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            fta0 fta0Var = fta0.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) fta0.a.a(list).toArray(new String[0]));
        }
    }

    @Override // xsna.iek0
    public final String c(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // xsna.iek0
    public final boolean isSupported() {
        boolean z = w4j.d;
        return w4j.a.c();
    }
}
