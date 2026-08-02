package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes9.dex */
public final class j6e implements l5t0 {
    public static final h6e a = new h6e();
    public static final boolean b;

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, i6e.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (i6e.a()) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        b = z;
    }

    @Override // defpackage.l5t0
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.l5t0
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.l5t0
    public final void c(SSLSocket sSLSocket, String str, List list) {
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            d72 d72Var = dvc0.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) rms.h(list).toArray(new String[0]));
        }
    }

    @Override // defpackage.l5t0
    public final boolean isSupported() {
        return b;
    }
}
