package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes9.dex */
public final class h6e implements yoh {
    @Override // defpackage.yoh
    public final boolean a(SSLSocket sSLSocket) {
        return j6e.b && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.yoh
    public final l5t0 c(SSLSocket sSLSocket) {
        return new j6e();
    }
}
